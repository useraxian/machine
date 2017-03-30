/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : machine

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-03-30 17:32:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_machine_bet_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_bet_record`;
CREATE TABLE `t_machine_bet_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '下注id',
  `user_id` int(100) NOT NULL COMMENT '用户编号',
  `record_id` int(11) NOT NULL COMMENT '开奖期号',
  `bet_fruit_id` int(11) NOT NULL COMMENT '下注水果编号',
  `bet_score` int(11) NOT NULL COMMENT '下注分数',
  `bet_multiple` int(255) NOT NULL COMMENT '下注倍数',
  `bet_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下注时间',
  PRIMARY KEY (`id`),
  KEY `fk_t_machine_bet_record_t_machine_bet_record_2` (`bet_fruit_id`),
  CONSTRAINT `fk_t_machine_bet_record_t_machine_bet_record_2` FOREIGN KEY (`bet_fruit_id`) REFERENCES `t_machine_fruit` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COMMENT='用户下注表';

-- ----------------------------
-- Records of t_machine_bet_record
-- ----------------------------
INSERT INTO `t_machine_bet_record` VALUES ('7', '3', '1', '1', '1', '1', '2017-03-28 17:35:25');
INSERT INTO `t_machine_bet_record` VALUES ('8', '3', '1', '1', '1', '1', '2017-03-30 17:17:24');

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
  `fruit_multiple` int(10) unsigned zerofill NOT NULL DEFAULT '0000000000' COMMENT '水果倍数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 COMMENT='水果表 ';

-- ----------------------------
-- Records of t_machine_fruit
-- ----------------------------
INSERT INTO `t_machine_fruit` VALUES ('1', 'seven', '七', 'seven.png', 'seven.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('2', 'cherry', '樱桃', 'cherry.png', 'cherry.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('3', 'prune', '西梅', 'prune.png', 'prune.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('4', 'banana', '香蕉', 'banana.png', 'banana.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('5', 'lemo', '柠檬', 'lemo.png', 'lemo.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('6', 'orange', '橘子', 'orange.png', 'orange.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('7', 'watermelon', '西瓜', 'watermelon.png', 'watermelon.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('8', 'bigwin', '大赢家', 'bigwin.png', 'bigwin.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('9', 'bar', 'bar', 'bar.png', 'bar.png', '0000000010');

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
INSERT INTO `t_machine_index` VALUES ('0', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1 COMMENT='开奖记录表 ';

-- ----------------------------
-- Records of t_machine_record
-- ----------------------------
INSERT INTO `t_machine_record` VALUES ('1', '2017-03-30 10:03:16', '0');
INSERT INTO `t_machine_record` VALUES ('2', '2017-03-30 10:03:56', '0');
INSERT INTO `t_machine_record` VALUES ('3', '2017-03-30 10:04:36', '0');
INSERT INTO `t_machine_record` VALUES ('4', '2017-03-30 10:05:16', '0');
INSERT INTO `t_machine_record` VALUES ('5', '2017-03-30 10:05:56', '0');
INSERT INTO `t_machine_record` VALUES ('6', '2017-03-30 10:06:36', '0');
INSERT INTO `t_machine_record` VALUES ('7', '2017-03-30 10:07:16', '0');
INSERT INTO `t_machine_record` VALUES ('8', '2017-03-30 10:07:56', '0');
INSERT INTO `t_machine_record` VALUES ('9', '2017-03-30 10:08:36', '0');
INSERT INTO `t_machine_record` VALUES ('10', '2017-03-30 10:09:16', '0');
INSERT INTO `t_machine_record` VALUES ('11', '2017-03-30 10:09:56', '0');
INSERT INTO `t_machine_record` VALUES ('12', '2017-03-30 10:10:36', '0');
INSERT INTO `t_machine_record` VALUES ('13', '2017-03-30 10:11:16', '0');
INSERT INTO `t_machine_record` VALUES ('14', '2017-03-30 10:11:56', '0');
INSERT INTO `t_machine_record` VALUES ('15', '2017-03-30 10:12:36', '0');
INSERT INTO `t_machine_record` VALUES ('16', '2017-03-30 10:13:16', '0');
INSERT INTO `t_machine_record` VALUES ('17', '2017-03-30 10:13:56', '0');
INSERT INTO `t_machine_record` VALUES ('18', '2017-03-30 10:14:36', '0');
INSERT INTO `t_machine_record` VALUES ('19', '2017-03-30 10:15:16', '0');
INSERT INTO `t_machine_record` VALUES ('20', '2017-03-30 10:15:56', '0');
INSERT INTO `t_machine_record` VALUES ('21', '2017-03-30 10:16:36', '0');
INSERT INTO `t_machine_record` VALUES ('22', '2017-03-30 10:17:16', '0');
INSERT INTO `t_machine_record` VALUES ('23', '2017-03-30 10:17:56', '0');
INSERT INTO `t_machine_record` VALUES ('24', '2017-03-30 17:13:36', '0');
INSERT INTO `t_machine_record` VALUES ('25', '2017-03-30 17:14:16', '0');
INSERT INTO `t_machine_record` VALUES ('26', '2017-03-30 17:14:56', '0');
INSERT INTO `t_machine_record` VALUES ('27', '2017-03-30 17:15:36', '0');
INSERT INTO `t_machine_record` VALUES ('28', '2017-03-30 17:16:16', '0');
INSERT INTO `t_machine_record` VALUES ('29', '2017-03-30 17:16:56', '0');
INSERT INTO `t_machine_record` VALUES ('30', '2017-03-30 17:17:36', '0');
INSERT INTO `t_machine_record` VALUES ('31', '2017-03-30 17:18:16', '0');
INSERT INTO `t_machine_record` VALUES ('32', '2017-03-30 17:18:56', '0');
INSERT INTO `t_machine_record` VALUES ('33', '2017-03-30 17:19:36', '0');
INSERT INTO `t_machine_record` VALUES ('34', '2017-03-30 17:20:16', '0');
INSERT INTO `t_machine_record` VALUES ('35', '2017-03-30 17:20:56', '0');
INSERT INTO `t_machine_record` VALUES ('36', '2017-03-30 17:21:36', '0');
INSERT INTO `t_machine_record` VALUES ('37', '2017-03-30 17:22:16', '0');
INSERT INTO `t_machine_record` VALUES ('38', '2017-03-30 17:22:56', '0');
INSERT INTO `t_machine_record` VALUES ('39', '2017-03-30 17:23:36', '0');
INSERT INTO `t_machine_record` VALUES ('40', '2017-03-30 17:24:16', '0');
INSERT INTO `t_machine_record` VALUES ('41', '2017-03-30 17:24:56', '0');
INSERT INTO `t_machine_record` VALUES ('42', null, null);

-- ----------------------------
-- Table structure for `t_machine_timer`
-- ----------------------------
DROP TABLE IF EXISTS `t_machine_timer`;
CREATE TABLE `t_machine_timer` (
  `last_open_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `next_open_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_machine_timer
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
  `score` int(10) unsigned zerofill DEFAULT NULL COMMENT '分数',
  `nickname` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`),
  KEY `fk_t_machine_user_wx_open_id` (`weixin_open_id`),
  CONSTRAINT `fk_t_machine_user_wx_open_id` FOREIGN KEY (`weixin_open_id`) REFERENCES `t_weixin_user` (`open_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_machine_user
-- ----------------------------
INSERT INTO `t_machine_user` VALUES ('3', null, null, null, 'oCmBsvwBS37C3MjyvwTyvepQL2EA', null, null, null, null);

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
INSERT INTO `t_weixin_user` VALUES ('oCmBsvwBS37C3MjyvwTyvepQL2EA', 'ahem!', '2017-03-30 17:17:06', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/ajNVdqHZLLAP7oXpIAt7WnaV1AjeCUbC6bHuoNAEXLZ5OcIRcn4k7y5Ndb2BQg7myDoNZeqUb6OVBPJtd6bo6w/0', null);

-- ----------------------------
-- View structure for `v_user_bet_record`
-- ----------------------------
DROP VIEW IF EXISTS `v_user_bet_record`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_user_bet_record` AS select `br`.`id` AS `id`,`br`.`user_id` AS `user_id`,`br`.`record_id` AS `record_id`,`br`.`bet_fruit_id` AS `bet_fruit_id`,`br`.`bet_score` AS `bet_score`,`br`.`bet_multiple` AS `bet_multiple`,`br`.`bet_time` AS `bet_time`,`r`.`open_number` AS `open_number`,`i`.`fruit_id` AS `open_fruit_id`,`f`.`en_name` AS `open_fruit_en_name`,`f`.`cn_name` AS `open_fruit_cn_name`,`f`.`fruit_multiple` AS `open_fruit_multiple`,`r`.`open_time` AS `open_time`,(case when (`br`.`bet_fruit_id` = `i`.`fruit_id`) then 'win' else 'lose' end) AS `bet_result`,(case when (`br`.`bet_fruit_id` = `i`.`fruit_id`) then ((`br`.`bet_multiple` * `br`.`bet_score`) * `f`.`fruit_multiple`) else (-(`br`.`bet_multiple`) * `br`.`bet_score`) end) AS `got_score` from (((`t_machine_bet_record` `br` left join `t_machine_record` `r` on((`br`.`record_id` = `r`.`id`))) left join `t_machine_index` `i` on((`r`.`open_number` = `i`.`id`))) left join `t_machine_fruit` `f` on((`i`.`fruit_id` = `f`.`id`))) ;
