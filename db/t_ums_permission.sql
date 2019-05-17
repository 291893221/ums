-- 删表
DROP TABLE
IF EXISTS `t_ums_permission`;
-- 建表
CREATE TABLE `t_ums_permission` (
  -- 业务字段 start
  `url` VARCHAR(255) COMMENT '资源相对路径',
	`permission_name` VARCHAR(32) COMMENT '权限名称',
  `permission_value` VARCHAR(32) COMMENT '权限值(c:create创建,r:read查询,u:update修改,d:delete删除)',
	`type` TINYINT(1) COMMENT '类型(1:目录,2:菜单,3:按钮)',
  -- 业务字段 end
	-- 公共字段 start
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
	`is_delete` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0:未删除,1:已删除）',
	`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
	`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '更新时间',
	`status` TINYINT(1) NOT NULL DEFAULT '1' COMMENT '状态(0:禁用,1:正常)',
	`describe` VARCHAR(32) COMMENT '描述信息',
	`sort` BIGINT DEFAULT 1 COMMENT '排序编号',
	PRIMARY KEY (`id`)
	-- 公共字段 end
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT = '权限表';
-- 初始化数据
INSERT INTO `t_ums_permission` (`id`, `url`, `role_id`, `permission`) VALUES ('1', '/admin', '1', 'c,r,u,d');
INSERT INTO `t_ums_permission` (`id`, `url`, `role_id`, `permission`) VALUES ('2', '/admin', '2', 'c,r');
INSERT INTO `t_ums_permission` (`id`, `url`, `role_id`, `permission`) VALUES ('3', '/admin', '3', 'r');
