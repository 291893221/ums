DROP TABLE
IF EXISTS `t_ums_user`;

CREATE TABLE `t_ums_user` (
	`id` VARCHAR (32) NOT NULL COMMENT '主键',
	`username` VARCHAR (255) NOT NULL COMMENT '帐号',
	`password` VARCHAR (255) NOT NULL COMMENT '密码',
	PRIMARY KEY (`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

INSERT INTO `t_ums_user` VALUES (REPLACE(UUID(),'-',''), 'root', 'root');
INSERT INTO `t_ums_user` VALUES (REPLACE(UUID(),'-',''), 'admin', 'admin');
INSERT INTO `t_ums_user` VALUES (REPLACE(UUID(),'-',''), 'ums', 'ums');
INSERT INTO `t_ums_user` VALUES (REPLACE(UUID(),'-',''), 'test', 'test');
INSERT INTO `t_ums_user` VALUES (REPLACE(UUID(),'-',''), 'dev', 'dev');
INSERT INTO `t_ums_user` VALUES (REPLACE(UUID(),'-',''), 'site', 'site');