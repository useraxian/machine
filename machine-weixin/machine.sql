/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : machine

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-04-05 17:53:36
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
  `bet_multiple` int(255) NOT NULL COMMENT '下注倍数',
  `bet_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下注时间',
  `bet_fruit_id_1` int(11) NOT NULL COMMENT '下注水果编号',
  `bet_score_1` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  `bet_fruit_id_2` int(11) unsigned zerofill NOT NULL COMMENT '下注水果编号',
  `bet_score_2` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  `bet_fruit_id_3` int(11) unsigned zerofill NOT NULL COMMENT '下注水果编号',
  `bet_score_3` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  `bet_fruit_id_4` int(11) unsigned zerofill NOT NULL COMMENT '下注水果编号',
  `bet_score_4` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  `bet_fruit_id_5` int(11) unsigned zerofill NOT NULL COMMENT '下注水果编号',
  `bet_score_5` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  `bet_fruit_id_6` int(11) unsigned zerofill NOT NULL COMMENT '下注水果编号',
  `bet_score_6` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  `bet_fruit_id_7` int(11) unsigned zerofill NOT NULL COMMENT '下注水果编号',
  `bet_score_7` int(11) unsigned zerofill NOT NULL COMMENT '下注分数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='用户下注表';

-- ----------------------------
-- Records of t_machine_bet_record
-- ----------------------------
INSERT INTO `t_machine_bet_record` VALUES ('7', '3', '1', '1', '2017-03-28 17:35:25', '1', '00000000001', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000');
INSERT INTO `t_machine_bet_record` VALUES ('8', '3', '1', '1', '2017-03-30 17:17:24', '1', '00000000001', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000');
INSERT INTO `t_machine_bet_record` VALUES ('9', '4', '1', '1', '2017-04-05 16:47:08', '1', '00000000003', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000');
INSERT INTO `t_machine_bet_record` VALUES ('10', '4', '1', '1', '2017-04-05 17:31:22', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000002', '00000000005', '00000000001', '00000000007', '00000000000', '00000000006', '00000000000');
INSERT INTO `t_machine_bet_record` VALUES ('11', '4', '1', '1', '2017-04-05 17:33:04', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000001', '00000000006', '00000000001');
INSERT INTO `t_machine_bet_record` VALUES ('12', '4', '1', '1', '2017-04-05 17:36:30', '1', '00000000001', '00000000002', '00000000002', '00000000003', '00000000002', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000001', '00000000006', '00000000001');
INSERT INTO `t_machine_bet_record` VALUES ('13', '4', '1', '1', '2017-04-05 17:40:19', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000002', '00000000007', '00000000001', '00000000006', '00000000000');
INSERT INTO `t_machine_bet_record` VALUES ('14', '4', '1', '1', '2017-04-05 17:42:25', '1', '00000000002', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000');

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
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=latin1 COMMENT='开奖记录表 ';

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
INSERT INTO `t_machine_record` VALUES ('42', '2017-04-05 16:32:40', '0');
INSERT INTO `t_machine_record` VALUES ('43', '2017-04-05 16:33:40', '0');
INSERT INTO `t_machine_record` VALUES ('44', '2017-04-05 16:34:40', '0');
INSERT INTO `t_machine_record` VALUES ('45', '2017-04-05 16:35:40', '0');
INSERT INTO `t_machine_record` VALUES ('46', '2017-04-05 16:36:40', '0');
INSERT INTO `t_machine_record` VALUES ('47', '2017-04-05 16:38:36', '0');
INSERT INTO `t_machine_record` VALUES ('48', '2017-04-05 16:39:36', '0');
INSERT INTO `t_machine_record` VALUES ('49', '2017-04-05 16:40:36', '0');
INSERT INTO `t_machine_record` VALUES ('50', '2017-04-05 16:41:36', '0');
INSERT INTO `t_machine_record` VALUES ('51', '2017-04-05 16:42:36', '0');
INSERT INTO `t_machine_record` VALUES ('52', '2017-04-05 16:43:36', '0');
INSERT INTO `t_machine_record` VALUES ('53', '2017-04-05 16:44:36', '0');
INSERT INTO `t_machine_record` VALUES ('54', '2017-04-05 16:45:36', '0');
INSERT INTO `t_machine_record` VALUES ('55', '2017-04-05 16:46:36', '0');
INSERT INTO `t_machine_record` VALUES ('56', '2017-04-05 16:47:36', '0');
INSERT INTO `t_machine_record` VALUES ('57', '2017-04-05 17:30:32', '0');
INSERT INTO `t_machine_record` VALUES ('58', '2017-04-05 17:31:32', '0');
INSERT INTO `t_machine_record` VALUES ('59', '2017-04-05 17:32:32', '0');
INSERT INTO `t_machine_record` VALUES ('60', '2017-04-05 17:33:32', '0');
INSERT INTO `t_machine_record` VALUES ('61', '2017-04-05 17:34:32', '0');
INSERT INTO `t_machine_record` VALUES ('62', '2017-04-05 17:36:40', '0');
INSERT INTO `t_machine_record` VALUES ('63', '2017-04-05 17:37:40', '0');
INSERT INTO `t_machine_record` VALUES ('64', '2017-04-05 17:38:42', '0');
INSERT INTO `t_machine_record` VALUES ('65', '2017-04-05 17:39:53', '0');
INSERT INTO `t_machine_record` VALUES ('66', '2017-04-05 17:40:36', '0');
INSERT INTO `t_machine_record` VALUES ('67', '2017-04-05 17:41:36', '0');
INSERT INTO `t_machine_record` VALUES ('68', '2017-04-05 17:42:36', '0');
INSERT INTO `t_machine_record` VALUES ('69', '2017-04-05 17:46:37', '0');
INSERT INTO `t_machine_record` VALUES ('70', '2017-04-05 17:47:37', '0');
INSERT INTO `t_machine_record` VALUES ('71', '2017-04-05 17:48:37', '0');
INSERT INTO `t_machine_record` VALUES ('72', '2017-04-05 17:49:37', '0');
INSERT INTO `t_machine_record` VALUES ('73', '2017-04-05 17:50:37', '0');
INSERT INTO `t_machine_record` VALUES ('74', '2017-04-05 17:51:37', '0');
INSERT INTO `t_machine_record` VALUES ('75', null, null);

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
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL,
  `mobile_num` int(11) DEFAULT NULL COMMENT '手机号码',
  `weixin_open_id` varchar(100) DEFAULT NULL COMMENT '微信唯一标识id',
  `create_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `score` int(10) unsigned zerofill DEFAULT NULL COMMENT '分数',
  `nickname` varchar(100) DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`),
  KEY `FK_T_MACHINE_USER_WX_OPEN_ID` (`weixin_open_id`),
  CONSTRAINT `FK_T_MACHINE_USER_WX_OPEN_ID` FOREIGN KEY (`weixin_open_id`) REFERENCES `t_weixin_user` (`open_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_machine_user
-- ----------------------------
INSERT INTO `t_machine_user` VALUES ('4', null, null, null, 'oCmBsvwBS37C3MjyvwTyvepQL2EA', null, '2017-04-05 16:38:24', '0000000010', null);

-- ----------------------------
-- Table structure for `t_weixin_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_weixin_user`;
CREATE TABLE `t_weixin_user` (
  `open_id` varchar(100) NOT NULL COMMENT '微信用户的唯一标识',
  `nickname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `login_time` datetime DEFAULT NULL COMMENT '最近一次登录时间',
  `sex` int(1) DEFAULT NULL,
  `province` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户个人资料填写的省份',
  `city` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '普通用户个人资料填写的城市',
  `country` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `headimgurl` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。 ',
  `privilege` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）',
  PRIMARY KEY (`open_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信用户表 ';

-- ----------------------------
-- Records of t_weixin_user
-- ----------------------------
INSERT INTO `t_weixin_user` VALUES ('oCmBsvwBS37C3MjyvwTyvepQL2EA', 'ahem!', '2017-04-05 17:42:20', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/ajNVdqHZLLAP7oXpIAt7WnaV1AjeCUbC6bHuoNAEXLap8iaaxBWTPqFaP0pL8RAFCG5zGPEVSdMx5qaR6HiamHAg/0', null);
