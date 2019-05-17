-- 删外键关联表
DROP TABLE
IF EXISTS `t_ums_user_ex`;
-- 删表
DROP TABLE
IF EXISTS `t_ums_user`;
-- 建表
CREATE TABLE `t_ums_user` (
  -- 业务字段 start
	`username` VARCHAR (32) NOT NULL UNIQUE COMMENT '登陆帐号',
	`password` VARCHAR (32) NOT NULL COMMENT '登陆密码(MD5加密)',
	`nickname` VARCHAR (32) COMMENT '用户姓名',
	`is_locked` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否锁定（0:未锁定,1:已锁定）',
	`is_admin` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否管理员（0:普通账号,1:管理员）',
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
) ENGINE = INNODB DEFAULT CHARSET = utf8;
-- 表注释
ALTER TABLE t_ums_user COMMENT = '用户表';
-- 初始化数据
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('root', MD5('root'), '超级管理员');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('admin', MD5('admin'), '管理员');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('ums', MD5('ums'), '运维帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('test', MD5('test'), '测试帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('dev', MD5('dev'), '开发帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('prod', MD5('prod'), '生产帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('site', MD5('site'), '准生产帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('stage', MD5('site'), '试运行帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('local', MD5('site'), '本地帐号');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('test001', MD5('test001'), '测试帐号001');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('test002', MD5('test002'), '测试帐号002');
INSERT INTO `t_ums_user` (`username`, `password`, `nickname`) VALUES ('test003', MD5('test003'), '测试帐号003');