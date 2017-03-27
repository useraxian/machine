/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : machine

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-03-27 17:51:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_machine_bet_record`
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
  KEY `fk_t_machine_bet_record_t_machine_bet_record_2` (`bet_fruit_id`),
  CONSTRAINT `fk_t_machine_bet_record_t_machine_bet_record_2` FOREIGN KEY (`bet_fruit_id`) REFERENCES `t_machine_fruit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='用户下注表';

-- ----------------------------
-- Records of t_machine_bet_record
-- ----------------------------

-- ----------------------------
-- Table structure for `t_machine_fruit`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_fruit`;
CREATE TABLE `t_machine_fruit` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '水果编号',
  `en_name` varchar(50) CHARACTER SET utf8 NOT NULL COMMENT '英文名称',
  `cn_name` varchar(50) CHARACTER SET utf8 NOT NULL COMMENT '中文名称',
  `image_name` varchar(50) CHARACTER SET utf8 NOT NULL COMMENT '图标名称',
  `button_name` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '按钮名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 COMMENT='水果表 ';

-- ----------------------------
-- Records of t_machine_fruit
-- ----------------------------
INSERT INTO `t_machine_fruit` VALUES ('1', 'seven', '七', 'seven.png', 'seven.png');
INSERT INTO `t_machine_fruit` VALUES ('2', 'cherry', '樱桃', 'cherry.png', 'cherry.png');
INSERT INTO `t_machine_fruit` VALUES ('3', 'prune', '西梅', 'prune.png', 'prune.png');
INSERT INTO `t_machine_fruit` VALUES ('4', 'banana', '香蕉', 'banana.png', 'banana.png');
INSERT INTO `t_machine_fruit` VALUES ('5', 'lemo', '柠檬', 'lemo.png', 'lemo.png');
INSERT INTO `t_machine_fruit` VALUES ('6', 'orange', '橘子', 'orange.png', 'orange.png');
INSERT INTO `t_machine_fruit` VALUES ('7', 'watermelon', '西瓜', 'watermelon.png', 'watermelon.png');
INSERT INTO `t_machine_fruit` VALUES ('8', 'bigwin', '大赢家', 'bigwin.png', 'bigwin.png');
INSERT INTO `t_machine_fruit` VALUES ('9', 'bar', 'bar', 'bar.png', 'bar.png');

-- ----------------------------
-- Table structure for `t_machine_index`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_index`;
CREATE TABLE `t_machine_index` (
  `id` int(255) NOT NULL COMMENT '位置编号',
  `fruit_id` int(11) NOT NULL COMMENT '水果编号',
  PRIMARY KEY (`id`),
  KEY `fk_t_machine_index_fruit_id` (`fruit_id`),
  CONSTRAINT `fk_t_machine_index_fruit_id` FOREIGN KEY (`fruit_id`) REFERENCES `t_machine_fruit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='机器位置表 ';

-- ----------------------------
-- Records of t_machine_index
-- ----------------------------

-- ----------------------------
-- Table structure for `t_machine_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_record`;
CREATE TABLE `t_machine_record` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '开奖编号',
  `open_time` datetime DEFAULT NULL COMMENT '开奖时间',
  `open_number` int(11) DEFAULT NULL COMMENT '开奖号码(对应位置表的编号)',
  PRIMARY KEY (`id`),
  KEY `fk_t_machine_record_number_index_id` (`open_number`),
  CONSTRAINT `fk_t_machine_record_number_index_id` FOREIGN KEY (`open_number`) REFERENCES `t_machine_index` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='开奖记录表 ';

-- ----------------------------
-- Records of t_machine_record
-- ----------------------------

-- ----------------------------
-- Table structure for `t_machine_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_user`;
CREATE TABLE `t_machine_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `mobile_num` int(11) DEFAULT NULL COMMENT '手机号码',
  `weixin_open_id` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '微信唯一标识id',
  `create_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `nickname` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`),
  KEY `fk_t_machine_user_wx_open_id` (`weixin_open_id`),
  CONSTRAINT `fk_t_machine_user_wx_open_id` FOREIGN KEY (`weixin_open_id`) REFERENCES `t_weixin_user` (`open_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_machine_user
-- ----------------------------
INSERT INTO `t_machine_user` VALUES ('3', null, null, null, 'oCmBsvwBS37C3MjyvwTyvepQL2EA', null, null, null);

-- ----------------------------
-- Table structure for `t_weixin_user`
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信用户表 ';

-- ----------------------------
-- Records of t_weixin_user
-- ----------------------------
INSERT INTO `t_weixin_user` VALUES ('oCmBsvwBS37C3MjyvwTyvepQL2EA', 'ahem!', '2017-03-27 17:41:04', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/ajNVdqHZLLAP7oXpIAt7WnaV1AjeCUbC6bHuoNAEXLZ5OcIRcn4k7y5Ndb2BQg7myDoNZeqUb6OVBPJtd6bo6w/0', null);
