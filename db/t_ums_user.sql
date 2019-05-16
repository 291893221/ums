DROP TABLE
IF EXISTS `t_ums_user`;

CREATE TABLE `t_ums_user` (
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
	`username` VARCHAR (255) NOT NULL COMMENT '帐号',
	`password` VARCHAR (255) NOT NULL COMMENT '密码',
	PRIMARY KEY (`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

INSERT INTO `t_ums_user` (`username`, `password`) VALUES ('root', 'root');
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('admin', 'admin');
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('ums', 'ums');
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('test', 'test');
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('dev', 'dev');
INSERT INTO `t_ums_user` (`username`, `password`)  VALUES ('site', 'site');