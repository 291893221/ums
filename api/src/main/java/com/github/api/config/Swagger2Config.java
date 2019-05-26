package com.github.api.config;

//import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableSwaggerBootstrapUI
public class Swagger2Config {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				//.apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(Predicates.not(PathSelectors.regex("/error.*")))
				.paths(PathSelectors.regex("/.*"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("UMS")
				.description("UMS RESTful接口文档")
				.termsOfServiceUrl("http://localhost:8080/ums")
				.contact(new Contact("木林森", "https://www.github.com/", "liongzai@foxmail.com"))
				.version("1.0-SNAPSHOT")
				.build();
	}
}
