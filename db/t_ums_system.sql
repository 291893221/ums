-- 删表
DROP TABLE
IF EXISTS `t_ums_system`;
-- 建表
CREATE TABLE `t_ums_system` (
  -- 业务字段 start
	`system_code`VARCHAR(32) NOT NULL COMMENT '系统编码',
	`system_name`VARCHAR(32) NOT NULL COMMENT '系统名称',
  `system_theme` VARCHAR(32) COMMENT '主题',
  `system_banner` VARCHAR(32) COMMENT '主题',
  `system_icon` VARCHAR(32) COMMENT '图标',
  `system_url` VARCHAR(255) COMMENT '首页地址',
	`system_type` TINYINT(1) COMMENT '系统类型(1:后台系统,2:日志系统,3:权限系统)',
  -- 业务字段 end
	-- 公共字段 start
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
	`is_delete` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0:未删除,1:已删除）',
	`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
	`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '更新时间',
	`status` TINYINT(1) NOT NULL DEFAULT '1' COMMENT '状态(0:禁用,1:正常)',
	`describe` VARCHAR(32) DEFAULT '' COMMENT '描述信息',
	`sort` BIGINT DEFAULT 1 COMMENT '排序编号',
	PRIMARY KEY (`id`)
	-- 公共字段 end
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT = '系统表';
-- 初始化数据
INSERT INTO `t_ums_system` (`system_code`, `system_name`) VALUES ('UMS', '用户管理系统');
