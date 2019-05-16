DROP TABLE
IF EXISTS `t_ums_user`;
CREATE TABLE `t_ums_user` (
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
	`username` VARCHAR (32) NOT NULL UNIQUE COMMENT '帐号',
	`realname` VARCHAR (32) COMMENT '中文姓名',
	`password` VARCHAR (32) NOT NULL COMMENT '密码',
	`locked` INT NOT NULL DEFAULT '0' COMMENT '0:未锁定,1:已锁定',
	`ctime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
	`utime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '更新时间',
	PRIMARY KEY (`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
ALTER TABLE t_ums_user COMMENT = '用户表';
INSERT INTO `t_ums_user` (`username`, `realname`, `password`) VALUES ('root', '超级管理员', MD5('root'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('admin', '管理员', MD5('admin'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('ums', '运维帐号', MD5('ums'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('test', '测试帐号', MD5('test'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('dev', '开发帐号', MD5('dev'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('prod', '生产帐号', MD5('prod'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('site', '准生产帐号', MD5('site'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('stage', '试运行帐号', MD5('site'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('local', '本地帐号', MD5('site'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('test001', '测试帐号001', MD5('test001'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('test002', '测试帐号002', MD5('test002'));
INSERT INTO `t_ums_user` (`username`, `realname`, `password`)  VALUES ('test003', '测试帐号003', MD5('test003'));