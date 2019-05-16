DROP TABLE
IF EXISTS `t_ums_role`;

CREATE TABLE `t_ums_role` (
  -- 业务字段 start
	`rolename` VARCHAR (32) NOT NULL UNIQUE COMMENT '角色名称',
  -- 业务字段 end
	-- 公共字段 start
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
	`is_delete` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0:未删除,1:已删除）',
	`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
	`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '更新时间',
	`describe` VARCHAR(32) COMMENT '描述信息',
	`sort` BIGINT DEFAULT 1 COMMENT '排序编号',
	PRIMARY KEY (`id`)
	-- 公共字段 end
) ENGINE = INNODB DEFAULT CHARSET = utf8;
-- 初始化数据
INSERT INTO `t_ums_role`(`rolename`) VALUES ('ROLE_ROOT');
INSERT INTO `t_ums_role`(`rolename`) VALUES ('ROLE_ADMIN');
INSERT INTO `t_ums_role`(`rolename`) VALUES ('ROLE_USER');
