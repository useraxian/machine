/*
 Navicat Premium Data Transfer

 Source Server         : MySQL_DB
 Source Server Type    : MySQL
 Source Server Version : 50635
 Source Host           : localhost
 Source Database       : machine

 Target Server Type    : MySQL
 Target Server Version : 50635
 File Encoding         : utf-8

 Date: 03/27/2017 00:25:43 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_machine_bet_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_bet_record`;
CREATE TABLE `t_machine_bet_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '下注id',
  `user_id` varchar(100) DEFAULT NULL COMMENT '用户编号',
  `record_id` int(11) DEFAULT NULL COMMENT '开奖期号',
  `bet_fruit_id` int(11) DEFAULT NULL COMMENT '下注水果编号',
  `bet_score` int(11) DEFAULT NULL COMMENT '下注分数',
  `bet_multiple` int(255) DEFAULT NULL COMMENT '下注倍数',
  `bet_time` datetime DEFAULT NULL COMMENT '下注时间',
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_t_machine_bet_record_t_machine_bet_record_2` FOREIGN KEY (`bet_fruit_id`) REFERENCES `t_machine_fruit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='用户下注表';

-- ----------------------------
--  Records of `t_machine_bet_record`
-- ----------------------------
BEGIN;
INSERT INTO `t_machine_bet_record` VALUES ('1', '1', '1', null, '1', null, '2017-03-26 17:10:47');
COMMIT;

-- ----------------------------
--  Table structure for `t_machine_fruit`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_fruit`;
CREATE TABLE `t_machine_fruit` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '水果编号',
  `en_name` varchar(50) NOT NULL COMMENT '英文名称',
  `cn_name` varchar(50) NOT NULL COMMENT '中文名称',
  `image_name` varchar(50) NOT NULL COMMENT '图标名称',
  `button_name` varchar(50) DEFAULT NULL COMMENT '按钮名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='水果表 ';

-- ----------------------------
--  Table structure for `t_machine_index`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_index`;
CREATE TABLE `t_machine_index` (
  `id` int(255) NOT NULL COMMENT '位置编号',
  `fruit_id` int(11) NOT NULL COMMENT '水果编号',
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_t_machine_index_fruit_id` FOREIGN KEY (`fruit_id`) REFERENCES `t_machine_fruit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='机器位置表 ';

-- ----------------------------
--  Table structure for `t_machine_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_record`;
CREATE TABLE `t_machine_record` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '开奖编号',
  `open_time` datetime DEFAULT NULL COMMENT '开奖时间',
  `open_number` int(11) DEFAULT NULL COMMENT '开奖号码(对应位置表的编号)',
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_t_machine_record_number_index_id` FOREIGN KEY (`open_number`) REFERENCES `t_machine_index` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='开奖记录表 ';

-- ----------------------------
--  Table structure for `t_machine_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_user`;
CREATE TABLE `t_machine_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL,
  `mobile_num` int(11) DEFAULT NULL COMMENT '手机号码',
  `weixin_open_id` varchar(255) DEFAULT NULL COMMENT '微信唯一标识id',
  `create_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `nickname` varchar(100) DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_t_machine_user_wx_open_id` FOREIGN KEY (`weixin_open_id`) REFERENCES `t_weixin_user` (`open_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `t_weixin_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_weixin_user`;
CREATE TABLE `t_weixin_user` (
  `open_id` varchar(100) NOT NULL COMMENT '微信用户的唯一标识',
  `nickname` varchar(255) DEFAULT NULL,
  `login_time` datetime DEFAULT NULL COMMENT '最近一次登录时间',
  `sex` int(1) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL COMMENT '用户个人资料填写的省份',
  `city` varchar(50) DEFAULT NULL COMMENT '普通用户个人资料填写的城市',
  `country` varchar(50) DEFAULT NULL,
  `headimgurl` varchar(255) DEFAULT NULL COMMENT '用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。 ',
  `privilege` varchar(255) DEFAULT NULL COMMENT '用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）',
  PRIMARY KEY (`open_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='微信用户表 ';

SET FOREIGN_KEY_CHECKS = 1;
