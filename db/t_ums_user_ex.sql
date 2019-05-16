DROP TABLE
IF EXISTS `t_ums_user_ex`;

CREATE TABLE t_ums_user_ex (
	phone VARCHAR (32) COMMENT '手机号',
	email VARCHAR (32) COMMENT '邮箱',
	sex INT COMMENT '0:女,1:男',
	username VARCHAR (32) NOT NULL UNIQUE COMMENT '帐号',
	CONSTRAINT t_ums_user_ex_fk FOREIGN KEY (username) REFERENCES t_ums_user (username)
) COMMENT '用户扩展表';