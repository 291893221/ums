DROP TABLE
IF EXISTS `t_ums_user`;
CREATE TABLE `t_ums_user` (
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
	`username` VARCHAR (255) NOT NULL UNIQUE COMMENT '帐号',
	`password` VARCHAR (255) NOT NULL COMMENT '密码',
	`locked` INT NOT NULL DEFAULT '0' COMMENT '0:未锁定,1:已锁定',
	`ctime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
	`utime` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '更新时间',
	PRIMARY KEY (`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
ALTER TABLE t_ums_user COMMENT = '用户表';
INSERT INTO `t_ums_user` (`username`, `password`) VALUES ('root', MD5('root'));
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('admin', MD5('admin'));
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('ums', MD5('ums'));
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('test', MD5('test'));
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('dev', MD5('dev'));
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('site', MD5('site'));