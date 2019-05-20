-- 删表
DROP TABLE
IF EXISTS `t_sys_log`;
-- 建表
CREATE TABLE `t_sys_log` (
  -- 业务字段 start
	`log_url` VARCHAR (255) NOT NULL UNIQUE COMMENT '访问地址',
	`log_class` VARCHAR (32) NOT NULL COMMENT '类',
	`log_method` VARCHAR (32) NOT NULL COMMENT '方法',
	`log_param` VARCHAR (32) NOT NULL COMMENT '参数',
	`log_line` INT(11) NOT NULL DEFAULT '0' COMMENT '代码行',
	`log_lever` VARCHAR (16) NOT NULL DEFAULT '' COMMENT '日志级别',
	`log_action` VARCHAR (32) NOT NULL COMMENT '动作',
	`log_message` VARCHAR (32) NOT NULL DEFAULT '' COMMENT '日志信息',
  -- 业务字段 end
	-- 公共字段 start
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
	`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
	`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '更新时间',
	`is_delete` TINYINT(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0:未删除,1:已删除）',
	`status` TINYINT(2) NOT NULL DEFAULT '1' COMMENT '状态(0:禁用,1:正常)',
	`describe` VARCHAR(32) DEFAULT '' COMMENT '描述信息',
	`sort` BIGINT DEFAULT 1 COMMENT '排序编号',
	PRIMARY KEY (`id`)
	-- 公共字段 end
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '日志表';
