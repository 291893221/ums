-- 删多对多关联表
DROP TABLE
IF EXISTS `t_mtm_user_role`;
-- 建表
CREATE TABLE `t_mtm_user_role` (
  -- 业务字段 start
	`user_id` BIGINT NOT NULL COMMENT '用户表主键，外键关联 t_ums_user.id',
	`role_id` BIGINT  NOT NULL COMMENT '角色表主键，外键关联 t_ums_role.id',
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
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '用户角色关联表';
-- 初始化数据
INSERT INTO `t_mtm_user_role` (`user_id`, `role_id`)
  VALUES (1, 1);