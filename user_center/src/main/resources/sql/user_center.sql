# 用户中心
CREATE DATABASE user_center;
USE user_center;

# 用户信息表，前期无分表必要，后期并发超高时模块整体优化，要求尽量简单
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增序号',
  `user_id` bigint(20) NOT NULL COMMENT '用户顺序编号，对外暴露时需要模糊处理',
  `user_name` varchar(128) NOT NULL DEFAULT '' COMMENT '用户名（昵称）,入库做长度校验',
  `mobile` varchar(18) NOT NULL DEFAULT '' COMMENT '用户手机号码，入库做格式校验，18位兼容企业用户座机号码',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT 'MD5单向加密密码，用注册时间加盐',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户类别，0-普通用户，1-vip用户',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户状态，0-正常，1-冻结，2-标黑 等等',
  `rigister_time` int(10) NOT NULL COMMENT '注册时间戳',
  `utime` int(10) NOT NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_user_name` (`user_name`),
  KEY `idx_mobile` (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 用户注册来源表，一个用户一般而言只能存在一个来源
CREATE TABLE `user_rigister_channel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增序号',
  `user_id` bigint(20) NOT NULL COMMENT '用户顺序编号，对外暴露时需要模糊处理',
  `channel_id` int(10) NOT NULL COMMENT '渠道编号，ID代表含义见rigister_channel表',
  `ctime` int(10) NOT NULL COMMENT '录入时间戳',
  `utime` int(10) NOT NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`),
  KEY `idx_channel_id` (`channel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 注册来源表，管理注册来源
CREATE TABLE `rigister_channel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增序号',
  `channel` varchar(128) NOT NULL COMMENT '渠道描述，如：mct.alibaba  代表一级渠道alibaba，二级渠道mct',
  `ctime` int(10) NOT NULL COMMENT '录入时间戳',
  `utime` int(10) NOT NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 用户登录日志，有分表必要。后期用户量急剧增长后，可以按照user_id%N 分表，不适合使用range分表
CREATE TABLE `user_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增序号',
  `user_id` bigint(20) NOT NULL COMMENT '用户顺序编号，对外暴露时需要模糊处理',
  `device_id` varchar(128) NOT NULL DEFAULT '' COMMENT '用户登录设备ID',
  `device_info` text NOT NULL COMMENT '其他登录信息汇总，填写易于解析的格式',
  `ctime` int(10) NOT NULL COMMENT '录入时间戳',
  `utime` int(10) NOT NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_device_id` (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 用户设备汇总，如果设备ID不变化，则不天机记录，只修改最后登录时间，否则添加新的使用设备记录
CREATE TABLE `user_device` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增序号',
  `user_id` bigint(20) NOT NULL COMMENT '用户顺序编号，对外暴露时需要模糊处理',
  `device_id` varchar(128) NOT NULL DEFAULT '' COMMENT '用户登录设备ID',
  `ctime` int(10) NOT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_device_id` (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 用户实名信息
CREATE TABLE `user_idcard_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增序号',
  `user_id` bigint(20) NOT NULL COMMENT '用户顺序编号，对外暴露时需要模糊处理',
  `id_no` varchar(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `id_name` varchar(256) NOT NULL DEFAULT '' COMMENT '实名信息，入库需要加密',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-身份证，1-护照',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '记录状态，0-正常，1-失效',
  `ctime` int(10) NOT NULL COMMENT '录入时间戳',
  `utime` int(10) NOT NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_id_no` (`id_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


