/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : machine

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-04-06 17:54:21
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
  `bet_result` int(1) DEFAULT NULL COMMENT '0输1赢2平',
  `got_score` int(11) unsigned DEFAULT NULL COMMENT '获得的分数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户下注表';

-- ----------------------------
-- Records of t_machine_bet_record
-- ----------------------------
INSERT INTO `t_machine_bet_record` VALUES ('7', '3', '1', '1', '2017-03-28 17:35:25', '1', '00000000001', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('8', '3', '1', '1', '2017-03-30 17:17:24', '1', '00000000001', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('9', '4', '1', '1', '2017-04-05 16:47:08', '1', '00000000003', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('10', '4', '1', '1', '2017-04-05 17:31:22', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000002', '00000000005', '00000000001', '00000000007', '00000000000', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('11', '4', '1', '1', '2017-04-05 17:33:04', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000001', '00000000006', '00000000001', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('12', '4', '1', '1', '2017-04-05 17:36:30', '1', '00000000001', '00000000002', '00000000002', '00000000003', '00000000002', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000001', '00000000006', '00000000001', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('13', '4', '1', '1', '2017-04-05 17:40:19', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000002', '00000000007', '00000000001', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('14', '4', '1', '1', '2017-04-05 17:42:25', '1', '00000000002', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('15', '4', '244', '1', '2017-04-06 17:28:08', '1', '00000000002', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000001', '00000000006', '00000000001', '1', '14');
INSERT INTO `t_machine_bet_record` VALUES ('16', '4', '245', '1', '2017-04-06 17:29:13', '1', '00000000003', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '28');

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
) ENGINE=InnoDB AUTO_INCREMENT=271 DEFAULT CHARSET=latin1 COMMENT='开奖记录表 ';

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
INSERT INTO `t_machine_record` VALUES ('75', '2017-04-06 14:36:40', '0');
INSERT INTO `t_machine_record` VALUES ('76', '2017-04-06 14:37:40', '0');
INSERT INTO `t_machine_record` VALUES ('77', '2017-04-06 14:38:40', '0');
INSERT INTO `t_machine_record` VALUES ('78', '2017-04-06 14:39:40', '0');
INSERT INTO `t_machine_record` VALUES ('79', '2017-04-06 14:40:40', '0');
INSERT INTO `t_machine_record` VALUES ('80', '2017-04-06 14:41:40', '0');
INSERT INTO `t_machine_record` VALUES ('81', '2017-04-06 14:42:40', '0');
INSERT INTO `t_machine_record` VALUES ('82', '2017-04-06 14:43:40', '0');
INSERT INTO `t_machine_record` VALUES ('83', '2017-04-06 14:44:40', '0');
INSERT INTO `t_machine_record` VALUES ('84', '2017-04-06 14:45:40', '0');
INSERT INTO `t_machine_record` VALUES ('85', '2017-04-06 14:46:40', '0');
INSERT INTO `t_machine_record` VALUES ('86', '2017-04-06 14:47:40', '0');
INSERT INTO `t_machine_record` VALUES ('87', '2017-04-06 14:48:40', '0');
INSERT INTO `t_machine_record` VALUES ('88', '2017-04-06 14:49:40', '0');
INSERT INTO `t_machine_record` VALUES ('89', '2017-04-06 14:50:40', '0');
INSERT INTO `t_machine_record` VALUES ('90', '2017-04-06 14:51:40', '0');
INSERT INTO `t_machine_record` VALUES ('91', '2017-04-06 14:52:40', '0');
INSERT INTO `t_machine_record` VALUES ('92', '2017-04-06 14:53:40', '0');
INSERT INTO `t_machine_record` VALUES ('93', '2017-04-06 14:54:40', '0');
INSERT INTO `t_machine_record` VALUES ('94', '2017-04-06 14:55:40', '0');
INSERT INTO `t_machine_record` VALUES ('95', '2017-04-06 14:56:40', '0');
INSERT INTO `t_machine_record` VALUES ('96', '2017-04-06 14:57:40', '0');
INSERT INTO `t_machine_record` VALUES ('97', '2017-04-06 14:58:40', '0');
INSERT INTO `t_machine_record` VALUES ('98', '2017-04-06 14:59:40', '0');
INSERT INTO `t_machine_record` VALUES ('99', '2017-04-06 15:00:40', '0');
INSERT INTO `t_machine_record` VALUES ('100', '2017-04-06 15:01:40', '0');
INSERT INTO `t_machine_record` VALUES ('101', '2017-04-06 15:02:40', '0');
INSERT INTO `t_machine_record` VALUES ('102', '2017-04-06 15:03:40', '0');
INSERT INTO `t_machine_record` VALUES ('103', '2017-04-06 15:04:40', '0');
INSERT INTO `t_machine_record` VALUES ('104', '2017-04-06 15:05:40', '0');
INSERT INTO `t_machine_record` VALUES ('105', '2017-04-06 15:06:40', '0');
INSERT INTO `t_machine_record` VALUES ('106', '2017-04-06 15:07:40', '0');
INSERT INTO `t_machine_record` VALUES ('107', '2017-04-06 15:08:40', '0');
INSERT INTO `t_machine_record` VALUES ('108', '2017-04-06 15:09:40', '0');
INSERT INTO `t_machine_record` VALUES ('109', '2017-04-06 15:10:40', '0');
INSERT INTO `t_machine_record` VALUES ('110', '2017-04-06 15:11:40', '0');
INSERT INTO `t_machine_record` VALUES ('111', '2017-04-06 15:12:40', '0');
INSERT INTO `t_machine_record` VALUES ('112', '2017-04-06 15:13:40', '0');
INSERT INTO `t_machine_record` VALUES ('113', '2017-04-06 15:14:40', '0');
INSERT INTO `t_machine_record` VALUES ('114', '2017-04-06 15:15:40', '0');
INSERT INTO `t_machine_record` VALUES ('115', '2017-04-06 15:16:40', '0');
INSERT INTO `t_machine_record` VALUES ('116', '2017-04-06 15:17:40', '0');
INSERT INTO `t_machine_record` VALUES ('117', '2017-04-06 15:18:40', '0');
INSERT INTO `t_machine_record` VALUES ('118', '2017-04-06 15:19:40', '0');
INSERT INTO `t_machine_record` VALUES ('119', '2017-04-06 15:20:40', '0');
INSERT INTO `t_machine_record` VALUES ('120', '2017-04-06 15:21:40', '0');
INSERT INTO `t_machine_record` VALUES ('121', '2017-04-06 15:22:40', '0');
INSERT INTO `t_machine_record` VALUES ('122', '2017-04-06 15:23:40', '0');
INSERT INTO `t_machine_record` VALUES ('123', '2017-04-06 15:24:40', '0');
INSERT INTO `t_machine_record` VALUES ('124', '2017-04-06 15:25:40', '0');
INSERT INTO `t_machine_record` VALUES ('125', '2017-04-06 15:26:40', '0');
INSERT INTO `t_machine_record` VALUES ('126', '2017-04-06 15:27:40', '0');
INSERT INTO `t_machine_record` VALUES ('127', '2017-04-06 15:28:40', '0');
INSERT INTO `t_machine_record` VALUES ('128', '2017-04-06 15:29:40', '0');
INSERT INTO `t_machine_record` VALUES ('129', '2017-04-06 15:30:40', '0');
INSERT INTO `t_machine_record` VALUES ('130', '2017-04-06 15:31:40', '0');
INSERT INTO `t_machine_record` VALUES ('131', '2017-04-06 15:32:40', '0');
INSERT INTO `t_machine_record` VALUES ('132', '2017-04-06 15:33:40', '0');
INSERT INTO `t_machine_record` VALUES ('133', '2017-04-06 15:34:40', '0');
INSERT INTO `t_machine_record` VALUES ('134', '2017-04-06 15:35:40', '0');
INSERT INTO `t_machine_record` VALUES ('135', '2017-04-06 15:36:40', '0');
INSERT INTO `t_machine_record` VALUES ('136', '2017-04-06 15:37:40', '0');
INSERT INTO `t_machine_record` VALUES ('137', '2017-04-06 15:38:40', '0');
INSERT INTO `t_machine_record` VALUES ('138', '2017-04-06 15:40:48', '0');
INSERT INTO `t_machine_record` VALUES ('139', '2017-04-06 15:41:48', '0');
INSERT INTO `t_machine_record` VALUES ('140', '2017-04-06 15:43:33', '0');
INSERT INTO `t_machine_record` VALUES ('141', '2017-04-06 15:44:25', '0');
INSERT INTO `t_machine_record` VALUES ('142', '2017-04-06 15:45:25', '0');
INSERT INTO `t_machine_record` VALUES ('143', '2017-04-06 15:46:25', '0');
INSERT INTO `t_machine_record` VALUES ('144', '2017-04-06 15:47:25', '0');
INSERT INTO `t_machine_record` VALUES ('145', '2017-04-06 15:48:25', '0');
INSERT INTO `t_machine_record` VALUES ('146', '2017-04-06 15:49:25', '0');
INSERT INTO `t_machine_record` VALUES ('147', '2017-04-06 15:50:25', '0');
INSERT INTO `t_machine_record` VALUES ('148', '2017-04-06 15:51:25', '0');
INSERT INTO `t_machine_record` VALUES ('149', '2017-04-06 15:52:25', '0');
INSERT INTO `t_machine_record` VALUES ('150', '2017-04-06 15:53:25', '0');
INSERT INTO `t_machine_record` VALUES ('151', '2017-04-06 15:54:25', '0');
INSERT INTO `t_machine_record` VALUES ('152', '2017-04-06 15:55:25', '0');
INSERT INTO `t_machine_record` VALUES ('153', '2017-04-06 15:56:46', '0');
INSERT INTO `t_machine_record` VALUES ('154', '2017-04-06 15:57:46', '0');
INSERT INTO `t_machine_record` VALUES ('155', '2017-04-06 15:58:46', '0');
INSERT INTO `t_machine_record` VALUES ('156', '2017-04-06 15:59:46', '0');
INSERT INTO `t_machine_record` VALUES ('157', '2017-04-06 16:00:46', '0');
INSERT INTO `t_machine_record` VALUES ('158', '2017-04-06 16:01:46', '0');
INSERT INTO `t_machine_record` VALUES ('159', '2017-04-06 16:02:46', '0');
INSERT INTO `t_machine_record` VALUES ('160', '2017-04-06 16:03:46', '0');
INSERT INTO `t_machine_record` VALUES ('161', '2017-04-06 16:04:46', '0');
INSERT INTO `t_machine_record` VALUES ('162', '2017-04-06 16:05:46', '0');
INSERT INTO `t_machine_record` VALUES ('163', '2017-04-06 16:06:46', '0');
INSERT INTO `t_machine_record` VALUES ('164', '2017-04-06 16:07:46', '0');
INSERT INTO `t_machine_record` VALUES ('165', '2017-04-06 16:08:46', '0');
INSERT INTO `t_machine_record` VALUES ('166', '2017-04-06 16:09:46', '0');
INSERT INTO `t_machine_record` VALUES ('167', '2017-04-06 16:10:46', '0');
INSERT INTO `t_machine_record` VALUES ('168', '2017-04-06 16:11:46', '0');
INSERT INTO `t_machine_record` VALUES ('169', '2017-04-06 16:12:46', '0');
INSERT INTO `t_machine_record` VALUES ('170', '2017-04-06 16:13:46', '0');
INSERT INTO `t_machine_record` VALUES ('171', '2017-04-06 16:14:46', '0');
INSERT INTO `t_machine_record` VALUES ('172', '2017-04-06 16:15:46', '0');
INSERT INTO `t_machine_record` VALUES ('173', '2017-04-06 16:16:46', '0');
INSERT INTO `t_machine_record` VALUES ('174', '2017-04-06 16:18:34', '0');
INSERT INTO `t_machine_record` VALUES ('175', '2017-04-06 16:19:34', '0');
INSERT INTO `t_machine_record` VALUES ('176', '2017-04-06 16:20:34', '0');
INSERT INTO `t_machine_record` VALUES ('177', '2017-04-06 16:21:34', '0');
INSERT INTO `t_machine_record` VALUES ('178', '2017-04-06 16:22:34', '0');
INSERT INTO `t_machine_record` VALUES ('179', '2017-04-06 16:23:34', '0');
INSERT INTO `t_machine_record` VALUES ('180', '2017-04-06 16:24:34', '0');
INSERT INTO `t_machine_record` VALUES ('181', '2017-04-06 16:25:34', '0');
INSERT INTO `t_machine_record` VALUES ('182', '2017-04-06 16:26:34', '0');
INSERT INTO `t_machine_record` VALUES ('183', '2017-04-06 16:27:34', '0');
INSERT INTO `t_machine_record` VALUES ('184', '2017-04-06 16:28:34', '0');
INSERT INTO `t_machine_record` VALUES ('185', '2017-04-06 16:29:34', '0');
INSERT INTO `t_machine_record` VALUES ('186', '2017-04-06 16:30:34', '0');
INSERT INTO `t_machine_record` VALUES ('187', '2017-04-06 16:31:34', '0');
INSERT INTO `t_machine_record` VALUES ('188', '2017-04-06 16:32:34', '0');
INSERT INTO `t_machine_record` VALUES ('189', '2017-04-06 16:33:34', '0');
INSERT INTO `t_machine_record` VALUES ('190', '2017-04-06 16:34:34', '0');
INSERT INTO `t_machine_record` VALUES ('191', '2017-04-06 16:35:34', '0');
INSERT INTO `t_machine_record` VALUES ('192', '2017-04-06 16:36:34', '0');
INSERT INTO `t_machine_record` VALUES ('193', '2017-04-06 16:37:34', '0');
INSERT INTO `t_machine_record` VALUES ('194', '2017-04-06 16:38:34', '0');
INSERT INTO `t_machine_record` VALUES ('195', '2017-04-06 16:39:34', '0');
INSERT INTO `t_machine_record` VALUES ('196', '2017-04-06 16:40:34', '0');
INSERT INTO `t_machine_record` VALUES ('197', '2017-04-06 16:41:34', '0');
INSERT INTO `t_machine_record` VALUES ('198', '2017-04-06 16:42:34', '0');
INSERT INTO `t_machine_record` VALUES ('199', '2017-04-06 16:43:34', '0');
INSERT INTO `t_machine_record` VALUES ('200', '2017-04-06 16:44:34', '0');
INSERT INTO `t_machine_record` VALUES ('201', '2017-04-06 16:45:34', '0');
INSERT INTO `t_machine_record` VALUES ('202', '2017-04-06 16:46:34', '0');
INSERT INTO `t_machine_record` VALUES ('203', '2017-04-06 16:47:34', '0');
INSERT INTO `t_machine_record` VALUES ('204', '2017-04-06 16:48:34', '0');
INSERT INTO `t_machine_record` VALUES ('205', '2017-04-06 16:49:34', '0');
INSERT INTO `t_machine_record` VALUES ('206', '2017-04-06 16:50:34', '0');
INSERT INTO `t_machine_record` VALUES ('207', '2017-04-06 16:51:34', '0');
INSERT INTO `t_machine_record` VALUES ('208', '2017-04-06 16:52:34', '0');
INSERT INTO `t_machine_record` VALUES ('209', '2017-04-06 16:53:34', '0');
INSERT INTO `t_machine_record` VALUES ('210', '2017-04-06 16:54:34', '0');
INSERT INTO `t_machine_record` VALUES ('211', '2017-04-06 16:55:34', '0');
INSERT INTO `t_machine_record` VALUES ('212', '2017-04-06 16:56:34', '0');
INSERT INTO `t_machine_record` VALUES ('213', '2017-04-06 16:57:34', '0');
INSERT INTO `t_machine_record` VALUES ('214', '2017-04-06 16:58:34', '0');
INSERT INTO `t_machine_record` VALUES ('215', '2017-04-06 16:59:34', '0');
INSERT INTO `t_machine_record` VALUES ('216', '2017-04-06 17:00:34', '0');
INSERT INTO `t_machine_record` VALUES ('217', '2017-04-06 17:01:34', '0');
INSERT INTO `t_machine_record` VALUES ('218', '2017-04-06 17:02:34', '0');
INSERT INTO `t_machine_record` VALUES ('219', '2017-04-06 17:03:34', '0');
INSERT INTO `t_machine_record` VALUES ('220', '2017-04-06 17:04:34', '0');
INSERT INTO `t_machine_record` VALUES ('221', '2017-04-06 17:05:34', '0');
INSERT INTO `t_machine_record` VALUES ('222', '2017-04-06 17:06:34', '0');
INSERT INTO `t_machine_record` VALUES ('223', '2017-04-06 17:07:34', '0');
INSERT INTO `t_machine_record` VALUES ('224', '2017-04-06 17:08:34', '0');
INSERT INTO `t_machine_record` VALUES ('225', '2017-04-06 17:09:34', '0');
INSERT INTO `t_machine_record` VALUES ('226', '2017-04-06 17:10:34', '0');
INSERT INTO `t_machine_record` VALUES ('227', '2017-04-06 17:11:34', '0');
INSERT INTO `t_machine_record` VALUES ('228', '2017-04-06 17:12:34', '0');
INSERT INTO `t_machine_record` VALUES ('229', '2017-04-06 17:13:34', '0');
INSERT INTO `t_machine_record` VALUES ('230', '2017-04-06 17:14:34', '0');
INSERT INTO `t_machine_record` VALUES ('231', '2017-04-06 17:15:34', '0');
INSERT INTO `t_machine_record` VALUES ('232', '2017-04-06 17:16:34', '0');
INSERT INTO `t_machine_record` VALUES ('233', '2017-04-06 17:17:34', '0');
INSERT INTO `t_machine_record` VALUES ('234', '2017-04-06 17:18:34', '0');
INSERT INTO `t_machine_record` VALUES ('235', '2017-04-06 17:19:34', '0');
INSERT INTO `t_machine_record` VALUES ('236', '2017-04-06 17:20:34', '0');
INSERT INTO `t_machine_record` VALUES ('237', '2017-04-06 17:21:34', '0');
INSERT INTO `t_machine_record` VALUES ('238', '2017-04-06 17:22:34', '0');
INSERT INTO `t_machine_record` VALUES ('239', '2017-04-06 17:23:34', '0');
INSERT INTO `t_machine_record` VALUES ('240', '2017-04-06 17:24:34', '0');
INSERT INTO `t_machine_record` VALUES ('241', '2017-04-06 17:25:34', '0');
INSERT INTO `t_machine_record` VALUES ('242', '2017-04-06 17:26:34', '0');
INSERT INTO `t_machine_record` VALUES ('243', '2017-04-06 17:27:34', '0');
INSERT INTO `t_machine_record` VALUES ('244', '2017-04-06 17:28:34', '0');
INSERT INTO `t_machine_record` VALUES ('245', '2017-04-06 17:29:34', '0');
INSERT INTO `t_machine_record` VALUES ('246', '2017-04-06 17:30:34', '0');
INSERT INTO `t_machine_record` VALUES ('247', '2017-04-06 17:31:28', '0');
INSERT INTO `t_machine_record` VALUES ('248', '2017-04-06 17:32:28', '0');
INSERT INTO `t_machine_record` VALUES ('249', '2017-04-06 17:33:28', '0');
INSERT INTO `t_machine_record` VALUES ('250', '2017-04-06 17:34:28', '0');
INSERT INTO `t_machine_record` VALUES ('251', '2017-04-06 17:35:28', '0');
INSERT INTO `t_machine_record` VALUES ('252', '2017-04-06 17:36:28', '0');
INSERT INTO `t_machine_record` VALUES ('253', '2017-04-06 17:37:28', '0');
INSERT INTO `t_machine_record` VALUES ('254', '2017-04-06 17:38:28', '0');
INSERT INTO `t_machine_record` VALUES ('255', '2017-04-06 17:39:28', '0');
INSERT INTO `t_machine_record` VALUES ('256', '2017-04-06 17:40:28', '0');
INSERT INTO `t_machine_record` VALUES ('257', '2017-04-06 17:41:28', '0');
INSERT INTO `t_machine_record` VALUES ('258', '2017-04-06 17:42:28', '0');
INSERT INTO `t_machine_record` VALUES ('259', '2017-04-06 17:43:28', '0');
INSERT INTO `t_machine_record` VALUES ('260', '2017-04-06 17:44:28', '0');
INSERT INTO `t_machine_record` VALUES ('261', '2017-04-06 17:45:28', '0');
INSERT INTO `t_machine_record` VALUES ('262', '2017-04-06 17:46:28', '0');
INSERT INTO `t_machine_record` VALUES ('263', '2017-04-06 17:47:28', '0');
INSERT INTO `t_machine_record` VALUES ('264', '2017-04-06 17:48:28', '0');
INSERT INTO `t_machine_record` VALUES ('265', '2017-04-06 17:49:28', '0');
INSERT INTO `t_machine_record` VALUES ('266', '2017-04-06 17:50:28', '0');
INSERT INTO `t_machine_record` VALUES ('267', '2017-04-06 17:51:28', '0');
INSERT INTO `t_machine_record` VALUES ('268', '2017-04-06 17:52:28', '0');
INSERT INTO `t_machine_record` VALUES ('269', '2017-04-06 17:53:28', '0');
INSERT INTO `t_machine_record` VALUES ('270', null, null);

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
INSERT INTO `t_machine_user` VALUES ('4', null, null, null, 'oCmBsvwBS37C3MjyvwTyvepQL2EA', null, '2017-04-05 16:38:24', '0000000028', null);

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
INSERT INTO `t_weixin_user` VALUES ('oCmBsvwBS37C3MjyvwTyvepQL2EA', 'ahem!', '2017-04-06 17:27:49', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/ajNVdqHZLLAP7oXpIAt7WnaV1AjeCUbC6bHuoNAEXLap8iaaxBWTPqFaP0pL8RAFCG5zGPEVSdMx5qaR6HiamHAg/0', null);
