/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : machine

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-04-21 17:36:53
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
  `got_score` int(11) DEFAULT NULL COMMENT '获得的分数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='用户下注表';

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
INSERT INTO `t_machine_bet_record` VALUES ('17', '4', '286', '1', '2017-04-07 11:27:06', '1', '00000000003', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000002', '00000000007', '00000000001', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('18', '4', '290', '1', '2017-04-07 11:40:02', '1', '00000000002', '00000000002', '00000000004', '00000000003', '00000000001', '00000000004', '00000000003', '00000000005', '00000000001', '00000000007', '00000000001', '00000000006', '00000000000', '0', '-12');
INSERT INTO `t_machine_bet_record` VALUES ('19', '4', '293', '1', '2017-04-07 11:50:22', '1', '00000000002', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000003', '00000000005', '00000000004', '00000000007', '00000000001', '00000000006', '00000000000', '0', '-12');
INSERT INTO `t_machine_bet_record` VALUES ('20', '4', '355', '1', '2017-04-07 12:52:14', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000000', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000000', '00000000006', '00000000000', '0', '-4');
INSERT INTO `t_machine_bet_record` VALUES ('21', '4', '355', '1', '2017-04-07 12:52:23', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000000', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000000', '00000000006', '00000000000', '0', '-8');
INSERT INTO `t_machine_bet_record` VALUES ('22', '4', '355', '1', '2017-04-07 12:52:27', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000000', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000000', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('23', '4', '355', '1', '2017-04-07 12:52:30', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000000', '00000000004', '00000000001', '00000000005', '00000000001', '00000000007', '00000000000', '00000000006', '00000000000', null, null);
INSERT INTO `t_machine_bet_record` VALUES ('24', '4', '379', '1', '2017-04-07 15:14:17', '1', '00000000001', '00000000002', '00000000001', '00000000003', '00000000001', '00000000004', '00000000001', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '0', '-4');
INSERT INTO `t_machine_bet_record` VALUES ('25', '4', '858', '10', '2017-04-12 16:15:37', '1', '00000000006', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '600');
INSERT INTO `t_machine_bet_record` VALUES ('26', '4', '889', '10', '2017-04-13 11:17:34', '1', '00000000004', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '400');
INSERT INTO `t_machine_bet_record` VALUES ('27', '4', '890', '10', '2017-04-13 11:18:37', '1', '00000000010', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '1000');
INSERT INTO `t_machine_bet_record` VALUES ('28', '4', '892', '10', '2017-04-13 11:20:47', '1', '00000000007', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '700');
INSERT INTO `t_machine_bet_record` VALUES ('29', '4', '895', '10', '2017-04-13 11:23:45', '1', '00000000005', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '500');
INSERT INTO `t_machine_bet_record` VALUES ('30', '4', '898', '10', '2017-04-13 11:26:33', '1', '00000000008', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '800');
INSERT INTO `t_machine_bet_record` VALUES ('31', '4', '903', '10', '2017-04-13 11:31:40', '1', '00000000006', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '600');
INSERT INTO `t_machine_bet_record` VALUES ('32', '4', '904', '10', '2017-04-13 11:34:29', '1', '00000000002', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '200');
INSERT INTO `t_machine_bet_record` VALUES ('33', '4', '907', '10', '2017-04-13 11:37:19', '1', '00000000003', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '300');
INSERT INTO `t_machine_bet_record` VALUES ('34', '4', '934', '10', '2017-04-13 14:29:31', '1', '00000000006', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '600');
INSERT INTO `t_machine_bet_record` VALUES ('35', '4', '936', '10', '2017-04-13 14:31:40', '1', '00000000004', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '400');
INSERT INTO `t_machine_bet_record` VALUES ('36', '4', '964', '10', '2017-04-14 15:51:31', '1', '00000000003', '00000000002', '00000000000', '00000000003', '00000000000', '00000000004', '00000000000', '00000000005', '00000000000', '00000000007', '00000000000', '00000000006', '00000000000', '1', '300');

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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1 COMMENT='水果表 ';

-- ----------------------------
-- Records of t_machine_fruit
-- ----------------------------
INSERT INTO `t_machine_fruit` VALUES ('1', 'pingguo', '苹果', 'pingguo.jpg', 'btn-pingguo.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('2', 'pingguox3', '苹果x3', 'pingguox3.jpg', 'btn-pingguo.png', '0000000030');
INSERT INTO `t_machine_fruit` VALUES ('3', 'juzi', '橘子', 'juzi.jpg', 'btn-juzi.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('4', 'juzix3', '橘子x3', 'juzix3.jpg', 'btn-juzi.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('5', 'ningmeng', '柠檬', 'ningmengx3.jpg', 'btn-ningmeng.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('6', 'ningmengx3', '柠檬x3', 'ningmeng.jpg', 'btn-ningmeng.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('7', 'lingdang', '铃铛', 'lingdang.jpg', 'btn-lingdang.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('8', 'lingdangx3', '铃铛x3', 'lingdangx3.jpg', 'btn-lingdang.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('9', 'xigua', '西瓜', 'xigua.jpg', 'btn-xigua.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('10', 'xiguax3', '西瓜', 'xiguax3.jpg', 'btn-xiguax.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('11', 'xingxing', '星星', 'xingxing.jpg', 'btn-xingxing.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('12', 'xingxingx3', '星星x3', 'xingxingx3.jpg', 'btn-xingxing.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('13', 'qi', '七', 'qi.jpg', 'btn-qi.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('14', 'qix3', '七x3', 'qix3.jpg', 'btn-qix3.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('15', 'barx50', 'barx50', 'barx50.jpg', 'btn-bar.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('16', 'barx100', 'barx100', 'barx100.jpg', 'btn-bar.png', '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('17', 'goodluckl', 'GoodLuckLeft', 'goodluckl.jpg', null, '0000000010');
INSERT INTO `t_machine_fruit` VALUES ('18', 'goodluckr', 'GoodLuckRight', 'goodluckr.jpg', null, '0000000010');

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
INSERT INTO `t_machine_index` VALUES ('4', '1');
INSERT INTO `t_machine_index` VALUES ('10', '1');
INSERT INTO `t_machine_index` VALUES ('16', '1');
INSERT INTO `t_machine_index` VALUES ('22', '1');
INSERT INTO `t_machine_index` VALUES ('5', '2');
INSERT INTO `t_machine_index` VALUES ('0', '3');
INSERT INTO `t_machine_index` VALUES ('12', '3');
INSERT INTO `t_machine_index` VALUES ('11', '4');
INSERT INTO `t_machine_index` VALUES ('6', '5');
INSERT INTO `t_machine_index` VALUES ('18', '5');
INSERT INTO `t_machine_index` VALUES ('17', '6');
INSERT INTO `t_machine_index` VALUES ('1', '7');
INSERT INTO `t_machine_index` VALUES ('13', '7');
INSERT INTO `t_machine_index` VALUES ('23', '7');
INSERT INTO `t_machine_index` VALUES ('7', '9');
INSERT INTO `t_machine_index` VALUES ('8', '10');
INSERT INTO `t_machine_index` VALUES ('19', '11');
INSERT INTO `t_machine_index` VALUES ('20', '12');
INSERT INTO `t_machine_index` VALUES ('15', '13');
INSERT INTO `t_machine_index` VALUES ('14', '14');
INSERT INTO `t_machine_index` VALUES ('2', '15');
INSERT INTO `t_machine_index` VALUES ('3', '16');
INSERT INTO `t_machine_index` VALUES ('21', '17');
INSERT INTO `t_machine_index` VALUES ('9', '18');

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
) ENGINE=InnoDB AUTO_INCREMENT=1084 DEFAULT CHARSET=latin1 COMMENT='开奖记录表 ';

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
INSERT INTO `t_machine_record` VALUES ('270', '2017-04-06 17:54:28', '0');
INSERT INTO `t_machine_record` VALUES ('285', '2017-04-07 11:26:24', '20');
INSERT INTO `t_machine_record` VALUES ('288', '2017-04-07 11:37:29', '9');
INSERT INTO `t_machine_record` VALUES ('289', '2017-04-07 11:38:29', '8');
INSERT INTO `t_machine_record` VALUES ('290', '2017-04-07 11:40:12', '14');
INSERT INTO `t_machine_record` VALUES ('291', '2017-04-07 11:46:53', '10');
INSERT INTO `t_machine_record` VALUES ('292', '2017-04-07 11:49:43', '20');
INSERT INTO `t_machine_record` VALUES ('293', '2017-04-07 11:50:43', '5');
INSERT INTO `t_machine_record` VALUES ('294', '2017-04-07 11:51:43', '19');
INSERT INTO `t_machine_record` VALUES ('295', '2017-04-07 11:52:43', '6');
INSERT INTO `t_machine_record` VALUES ('296', '2017-04-07 11:53:43', '18');
INSERT INTO `t_machine_record` VALUES ('297', '2017-04-07 11:54:43', '19');
INSERT INTO `t_machine_record` VALUES ('298', '2017-04-07 11:55:43', '8');
INSERT INTO `t_machine_record` VALUES ('299', '2017-04-07 11:56:43', '20');
INSERT INTO `t_machine_record` VALUES ('300', '2017-04-07 11:57:43', '23');
INSERT INTO `t_machine_record` VALUES ('301', '2017-04-07 11:58:43', '4');
INSERT INTO `t_machine_record` VALUES ('302', '2017-04-07 11:59:43', '8');
INSERT INTO `t_machine_record` VALUES ('303', '2017-04-07 12:00:43', '23');
INSERT INTO `t_machine_record` VALUES ('304', '2017-04-07 12:01:43', '9');
INSERT INTO `t_machine_record` VALUES ('305', '2017-04-07 12:02:43', '5');
INSERT INTO `t_machine_record` VALUES ('306', '2017-04-07 12:03:43', '14');
INSERT INTO `t_machine_record` VALUES ('307', '2017-04-07 12:04:43', '7');
INSERT INTO `t_machine_record` VALUES ('308', '2017-04-07 12:05:43', '18');
INSERT INTO `t_machine_record` VALUES ('309', '2017-04-07 12:06:43', '12');
INSERT INTO `t_machine_record` VALUES ('310', '2017-04-07 12:07:43', '10');
INSERT INTO `t_machine_record` VALUES ('311', '2017-04-07 12:08:43', '21');
INSERT INTO `t_machine_record` VALUES ('312', '2017-04-07 12:09:43', '13');
INSERT INTO `t_machine_record` VALUES ('313', '2017-04-07 12:10:43', '16');
INSERT INTO `t_machine_record` VALUES ('314', '2017-04-07 12:11:43', '22');
INSERT INTO `t_machine_record` VALUES ('315', '2017-04-07 12:12:43', '1');
INSERT INTO `t_machine_record` VALUES ('316', '2017-04-07 12:13:43', '12');
INSERT INTO `t_machine_record` VALUES ('317', '2017-04-07 12:14:43', '8');
INSERT INTO `t_machine_record` VALUES ('318', '2017-04-07 12:15:43', '3');
INSERT INTO `t_machine_record` VALUES ('319', '2017-04-07 12:16:43', '17');
INSERT INTO `t_machine_record` VALUES ('320', '2017-04-07 12:17:43', '20');
INSERT INTO `t_machine_record` VALUES ('321', '2017-04-07 12:18:43', '23');
INSERT INTO `t_machine_record` VALUES ('322', '2017-04-07 12:19:43', '21');
INSERT INTO `t_machine_record` VALUES ('323', '2017-04-07 12:20:43', '14');
INSERT INTO `t_machine_record` VALUES ('324', '2017-04-07 12:21:43', '13');
INSERT INTO `t_machine_record` VALUES ('325', '2017-04-07 12:22:43', '9');
INSERT INTO `t_machine_record` VALUES ('326', '2017-04-07 12:23:43', '10');
INSERT INTO `t_machine_record` VALUES ('327', '2017-04-07 12:24:43', '16');
INSERT INTO `t_machine_record` VALUES ('328', '2017-04-07 12:25:43', '15');
INSERT INTO `t_machine_record` VALUES ('329', '2017-04-07 12:26:43', '15');
INSERT INTO `t_machine_record` VALUES ('330', '2017-04-07 12:27:43', '22');
INSERT INTO `t_machine_record` VALUES ('331', '2017-04-07 12:28:43', '0');
INSERT INTO `t_machine_record` VALUES ('332', '2017-04-07 12:29:43', '23');
INSERT INTO `t_machine_record` VALUES ('333', '2017-04-07 12:30:43', '11');
INSERT INTO `t_machine_record` VALUES ('334', '2017-04-07 12:31:43', '21');
INSERT INTO `t_machine_record` VALUES ('335', '2017-04-07 12:32:43', '8');
INSERT INTO `t_machine_record` VALUES ('336', '2017-04-07 12:33:43', '1');
INSERT INTO `t_machine_record` VALUES ('337', '2017-04-07 12:34:43', '19');
INSERT INTO `t_machine_record` VALUES ('338', '2017-04-07 12:35:43', '15');
INSERT INTO `t_machine_record` VALUES ('339', '2017-04-07 12:36:43', '11');
INSERT INTO `t_machine_record` VALUES ('340', '2017-04-07 12:37:43', '6');
INSERT INTO `t_machine_record` VALUES ('341', '2017-04-07 12:38:43', '5');
INSERT INTO `t_machine_record` VALUES ('342', '2017-04-07 12:39:43', '6');
INSERT INTO `t_machine_record` VALUES ('343', '2017-04-07 12:40:43', '1');
INSERT INTO `t_machine_record` VALUES ('344', '2017-04-07 12:41:43', '19');
INSERT INTO `t_machine_record` VALUES ('345', '2017-04-07 12:42:43', '21');
INSERT INTO `t_machine_record` VALUES ('346', '2017-04-07 12:43:43', '22');
INSERT INTO `t_machine_record` VALUES ('347', '2017-04-07 12:44:43', '20');
INSERT INTO `t_machine_record` VALUES ('348', '2017-04-07 12:45:43', '12');
INSERT INTO `t_machine_record` VALUES ('349', '2017-04-07 12:46:43', '13');
INSERT INTO `t_machine_record` VALUES ('350', '2017-04-07 12:47:43', '7');
INSERT INTO `t_machine_record` VALUES ('351', '2017-04-07 12:48:43', '13');
INSERT INTO `t_machine_record` VALUES ('352', '2017-04-07 12:49:43', '2');
INSERT INTO `t_machine_record` VALUES ('353', '2017-04-07 12:50:43', '16');
INSERT INTO `t_machine_record` VALUES ('354', '2017-04-07 12:51:43', '13');
INSERT INTO `t_machine_record` VALUES ('355', '2017-04-07 12:52:43', '2');
INSERT INTO `t_machine_record` VALUES ('356', '2017-04-07 12:53:43', '13');
INSERT INTO `t_machine_record` VALUES ('357', '2017-04-07 12:55:31', '23');
INSERT INTO `t_machine_record` VALUES ('358', '2017-04-07 14:53:20', '18');
INSERT INTO `t_machine_record` VALUES ('359', '2017-04-07 14:54:29', '11');
INSERT INTO `t_machine_record` VALUES ('360', '2017-04-07 14:55:29', '1');
INSERT INTO `t_machine_record` VALUES ('361', '2017-04-07 14:56:29', '18');
INSERT INTO `t_machine_record` VALUES ('362', '2017-04-07 14:57:29', '4');
INSERT INTO `t_machine_record` VALUES ('363', '2017-04-07 14:58:29', '1');
INSERT INTO `t_machine_record` VALUES ('364', '2017-04-07 14:59:29', '10');
INSERT INTO `t_machine_record` VALUES ('365', '2017-04-07 15:00:29', '2');
INSERT INTO `t_machine_record` VALUES ('366', '2017-04-07 15:01:29', '15');
INSERT INTO `t_machine_record` VALUES ('367', '2017-04-07 15:02:29', '2');
INSERT INTO `t_machine_record` VALUES ('368', '2017-04-07 15:03:29', '7');
INSERT INTO `t_machine_record` VALUES ('369', '2017-04-07 15:04:29', '18');
INSERT INTO `t_machine_record` VALUES ('370', '2017-04-07 15:05:29', '13');
INSERT INTO `t_machine_record` VALUES ('371', '2017-04-07 15:06:29', '0');
INSERT INTO `t_machine_record` VALUES ('372', '2017-04-07 15:07:29', '21');
INSERT INTO `t_machine_record` VALUES ('373', '2017-04-07 15:08:29', '11');
INSERT INTO `t_machine_record` VALUES ('374', '2017-04-07 15:09:29', '23');
INSERT INTO `t_machine_record` VALUES ('375', '2017-04-07 15:10:29', '5');
INSERT INTO `t_machine_record` VALUES ('376', '2017-04-07 15:11:29', '17');
INSERT INTO `t_machine_record` VALUES ('377', '2017-04-07 15:12:29', '23');
INSERT INTO `t_machine_record` VALUES ('378', '2017-04-07 15:13:29', '10');
INSERT INTO `t_machine_record` VALUES ('379', '2017-04-07 15:14:29', '6');
INSERT INTO `t_machine_record` VALUES ('380', '2017-04-07 15:15:29', '12');
INSERT INTO `t_machine_record` VALUES ('381', '2017-04-07 15:16:29', '8');
INSERT INTO `t_machine_record` VALUES ('382', '2017-04-07 15:17:29', '11');
INSERT INTO `t_machine_record` VALUES ('383', '2017-04-07 15:18:29', '21');
INSERT INTO `t_machine_record` VALUES ('384', '2017-04-07 15:19:29', '15');
INSERT INTO `t_machine_record` VALUES ('385', '2017-04-07 15:20:29', '18');
INSERT INTO `t_machine_record` VALUES ('386', '2017-04-07 15:21:29', '17');
INSERT INTO `t_machine_record` VALUES ('387', '2017-04-07 15:22:29', '3');
INSERT INTO `t_machine_record` VALUES ('388', '2017-04-07 15:23:29', '9');
INSERT INTO `t_machine_record` VALUES ('389', '2017-04-07 15:24:29', '18');
INSERT INTO `t_machine_record` VALUES ('390', '2017-04-07 15:25:29', '15');
INSERT INTO `t_machine_record` VALUES ('391', '2017-04-07 15:26:29', '10');
INSERT INTO `t_machine_record` VALUES ('392', '2017-04-07 15:27:29', '20');
INSERT INTO `t_machine_record` VALUES ('393', '2017-04-07 15:28:29', '22');
INSERT INTO `t_machine_record` VALUES ('394', '2017-04-07 15:29:29', '1');
INSERT INTO `t_machine_record` VALUES ('395', '2017-04-07 15:30:29', '21');
INSERT INTO `t_machine_record` VALUES ('396', '2017-04-07 15:31:29', '14');
INSERT INTO `t_machine_record` VALUES ('397', '2017-04-07 15:32:29', '0');
INSERT INTO `t_machine_record` VALUES ('398', '2017-04-07 15:33:29', '3');
INSERT INTO `t_machine_record` VALUES ('399', '2017-04-07 15:34:29', '21');
INSERT INTO `t_machine_record` VALUES ('400', '2017-04-07 15:35:29', '9');
INSERT INTO `t_machine_record` VALUES ('401', '2017-04-07 15:36:29', '11');
INSERT INTO `t_machine_record` VALUES ('402', '2017-04-07 15:37:29', '21');
INSERT INTO `t_machine_record` VALUES ('403', '2017-04-07 15:38:29', '8');
INSERT INTO `t_machine_record` VALUES ('404', '2017-04-07 15:39:29', '2');
INSERT INTO `t_machine_record` VALUES ('405', '2017-04-07 15:40:29', '3');
INSERT INTO `t_machine_record` VALUES ('406', '2017-04-07 15:41:29', '20');
INSERT INTO `t_machine_record` VALUES ('407', '2017-04-07 15:42:29', '5');
INSERT INTO `t_machine_record` VALUES ('408', '2017-04-07 15:43:29', '7');
INSERT INTO `t_machine_record` VALUES ('409', '2017-04-07 15:44:29', '13');
INSERT INTO `t_machine_record` VALUES ('410', '2017-04-07 15:45:29', '21');
INSERT INTO `t_machine_record` VALUES ('411', '2017-04-07 15:46:29', '20');
INSERT INTO `t_machine_record` VALUES ('412', '2017-04-07 15:47:29', '16');
INSERT INTO `t_machine_record` VALUES ('413', '2017-04-07 15:48:29', '12');
INSERT INTO `t_machine_record` VALUES ('414', '2017-04-07 15:49:29', '17');
INSERT INTO `t_machine_record` VALUES ('415', '2017-04-07 15:50:29', '0');
INSERT INTO `t_machine_record` VALUES ('416', '2017-04-07 15:51:29', '6');
INSERT INTO `t_machine_record` VALUES ('417', '2017-04-07 15:52:29', '16');
INSERT INTO `t_machine_record` VALUES ('418', '2017-04-07 15:53:29', '19');
INSERT INTO `t_machine_record` VALUES ('419', '2017-04-07 15:54:29', '12');
INSERT INTO `t_machine_record` VALUES ('420', '2017-04-07 15:55:29', '13');
INSERT INTO `t_machine_record` VALUES ('421', '2017-04-07 15:56:29', '16');
INSERT INTO `t_machine_record` VALUES ('422', '2017-04-07 15:58:34', '6');
INSERT INTO `t_machine_record` VALUES ('423', '2017-04-07 15:59:34', '23');
INSERT INTO `t_machine_record` VALUES ('424', '2017-04-07 16:00:34', '4');
INSERT INTO `t_machine_record` VALUES ('425', '2017-04-07 16:01:34', '20');
INSERT INTO `t_machine_record` VALUES ('426', '2017-04-07 16:02:34', '2');
INSERT INTO `t_machine_record` VALUES ('427', '2017-04-07 16:03:34', '14');
INSERT INTO `t_machine_record` VALUES ('428', '2017-04-07 16:04:34', '7');
INSERT INTO `t_machine_record` VALUES ('429', '2017-04-07 16:05:34', '13');
INSERT INTO `t_machine_record` VALUES ('430', '2017-04-07 16:06:34', '10');
INSERT INTO `t_machine_record` VALUES ('431', '2017-04-07 16:07:34', '13');
INSERT INTO `t_machine_record` VALUES ('432', '2017-04-07 16:08:34', '4');
INSERT INTO `t_machine_record` VALUES ('433', '2017-04-07 16:09:34', '14');
INSERT INTO `t_machine_record` VALUES ('434', '2017-04-07 16:10:34', '21');
INSERT INTO `t_machine_record` VALUES ('435', '2017-04-07 16:11:34', '6');
INSERT INTO `t_machine_record` VALUES ('436', '2017-04-07 16:12:34', '1');
INSERT INTO `t_machine_record` VALUES ('437', '2017-04-07 16:13:34', '8');
INSERT INTO `t_machine_record` VALUES ('438', '2017-04-07 16:14:34', '12');
INSERT INTO `t_machine_record` VALUES ('439', '2017-04-07 16:15:34', '0');
INSERT INTO `t_machine_record` VALUES ('440', '2017-04-07 16:16:34', '16');
INSERT INTO `t_machine_record` VALUES ('441', '2017-04-07 16:18:23', '3');
INSERT INTO `t_machine_record` VALUES ('442', '2017-04-07 16:19:23', '22');
INSERT INTO `t_machine_record` VALUES ('443', '2017-04-07 16:20:23', '11');
INSERT INTO `t_machine_record` VALUES ('444', '2017-04-07 16:21:23', '3');
INSERT INTO `t_machine_record` VALUES ('445', '2017-04-07 16:22:23', '22');
INSERT INTO `t_machine_record` VALUES ('446', '2017-04-07 16:23:23', '8');
INSERT INTO `t_machine_record` VALUES ('447', '2017-04-07 16:24:23', '22');
INSERT INTO `t_machine_record` VALUES ('448', '2017-04-07 16:25:23', '19');
INSERT INTO `t_machine_record` VALUES ('449', '2017-04-07 17:28:43', '14');
INSERT INTO `t_machine_record` VALUES ('450', '2017-04-07 17:29:43', '3');
INSERT INTO `t_machine_record` VALUES ('451', '2017-04-07 17:30:43', '15');
INSERT INTO `t_machine_record` VALUES ('452', '2017-04-07 17:31:43', '22');
INSERT INTO `t_machine_record` VALUES ('453', '2017-04-07 17:32:43', '12');
INSERT INTO `t_machine_record` VALUES ('454', '2017-04-07 17:33:43', '14');
INSERT INTO `t_machine_record` VALUES ('455', '2017-04-07 17:34:43', '2');
INSERT INTO `t_machine_record` VALUES ('456', '2017-04-07 17:35:43', '1');
INSERT INTO `t_machine_record` VALUES ('457', '2017-04-07 17:36:43', '11');
INSERT INTO `t_machine_record` VALUES ('458', '2017-04-07 17:37:43', '4');
INSERT INTO `t_machine_record` VALUES ('459', '2017-04-07 17:38:43', '16');
INSERT INTO `t_machine_record` VALUES ('460', '2017-04-07 17:39:43', '9');
INSERT INTO `t_machine_record` VALUES ('461', '2017-04-07 17:40:43', '16');
INSERT INTO `t_machine_record` VALUES ('462', '2017-04-07 17:41:43', '23');
INSERT INTO `t_machine_record` VALUES ('463', '2017-04-07 17:42:43', '1');
INSERT INTO `t_machine_record` VALUES ('464', '2017-04-07 17:43:43', '0');
INSERT INTO `t_machine_record` VALUES ('465', '2017-04-07 17:44:43', '4');
INSERT INTO `t_machine_record` VALUES ('466', '2017-04-07 17:45:43', '23');
INSERT INTO `t_machine_record` VALUES ('467', '2017-04-07 17:46:43', '19');
INSERT INTO `t_machine_record` VALUES ('468', '2017-04-07 17:47:43', '9');
INSERT INTO `t_machine_record` VALUES ('469', '2017-04-07 17:48:43', '16');
INSERT INTO `t_machine_record` VALUES ('470', '2017-04-07 17:49:43', '18');
INSERT INTO `t_machine_record` VALUES ('471', '2017-04-07 17:50:43', '7');
INSERT INTO `t_machine_record` VALUES ('472', '2017-04-07 17:51:43', '17');
INSERT INTO `t_machine_record` VALUES ('473', '2017-04-07 17:52:43', '16');
INSERT INTO `t_machine_record` VALUES ('474', '2017-04-07 17:53:43', '4');
INSERT INTO `t_machine_record` VALUES ('475', '2017-04-07 17:54:43', '4');
INSERT INTO `t_machine_record` VALUES ('476', '2017-04-07 17:55:43', '7');
INSERT INTO `t_machine_record` VALUES ('477', '2017-04-07 17:56:43', '2');
INSERT INTO `t_machine_record` VALUES ('478', '2017-04-07 17:57:43', '20');
INSERT INTO `t_machine_record` VALUES ('479', '2017-04-07 17:58:43', '4');
INSERT INTO `t_machine_record` VALUES ('480', '2017-04-07 17:59:43', '6');
INSERT INTO `t_machine_record` VALUES ('481', '2017-04-07 18:00:43', '19');
INSERT INTO `t_machine_record` VALUES ('482', '2017-04-10 14:36:59', '6');
INSERT INTO `t_machine_record` VALUES ('483', '2017-04-10 14:37:58', '3');
INSERT INTO `t_machine_record` VALUES ('484', '2017-04-10 14:51:05', '13');
INSERT INTO `t_machine_record` VALUES ('485', '2017-04-10 14:52:05', '20');
INSERT INTO `t_machine_record` VALUES ('486', '2017-04-10 14:53:05', '19');
INSERT INTO `t_machine_record` VALUES ('487', '2017-04-10 14:54:05', '4');
INSERT INTO `t_machine_record` VALUES ('488', '2017-04-10 14:55:05', '12');
INSERT INTO `t_machine_record` VALUES ('489', '2017-04-10 14:56:05', '15');
INSERT INTO `t_machine_record` VALUES ('490', '2017-04-10 14:57:05', '4');
INSERT INTO `t_machine_record` VALUES ('491', '2017-04-10 14:58:05', '19');
INSERT INTO `t_machine_record` VALUES ('492', '2017-04-10 14:59:05', '17');
INSERT INTO `t_machine_record` VALUES ('493', '2017-04-10 15:00:05', '20');
INSERT INTO `t_machine_record` VALUES ('494', '2017-04-10 15:01:05', '4');
INSERT INTO `t_machine_record` VALUES ('495', '2017-04-10 15:02:05', '12');
INSERT INTO `t_machine_record` VALUES ('496', '2017-04-10 15:03:05', '19');
INSERT INTO `t_machine_record` VALUES ('497', '2017-04-10 15:04:05', '10');
INSERT INTO `t_machine_record` VALUES ('498', '2017-04-10 15:05:05', '15');
INSERT INTO `t_machine_record` VALUES ('499', '2017-04-10 15:06:05', '11');
INSERT INTO `t_machine_record` VALUES ('500', '2017-04-10 15:07:05', '7');
INSERT INTO `t_machine_record` VALUES ('501', '2017-04-10 15:08:05', '1');
INSERT INTO `t_machine_record` VALUES ('502', '2017-04-10 15:09:05', '13');
INSERT INTO `t_machine_record` VALUES ('503', '2017-04-10 15:10:05', '6');
INSERT INTO `t_machine_record` VALUES ('504', '2017-04-10 15:11:05', '15');
INSERT INTO `t_machine_record` VALUES ('505', '2017-04-10 15:12:05', '0');
INSERT INTO `t_machine_record` VALUES ('506', '2017-04-10 15:13:05', '19');
INSERT INTO `t_machine_record` VALUES ('507', '2017-04-10 15:14:05', '2');
INSERT INTO `t_machine_record` VALUES ('508', '2017-04-10 15:15:05', '22');
INSERT INTO `t_machine_record` VALUES ('509', '2017-04-10 15:16:05', '18');
INSERT INTO `t_machine_record` VALUES ('510', '2017-04-10 15:17:05', '14');
INSERT INTO `t_machine_record` VALUES ('511', '2017-04-10 15:18:05', '23');
INSERT INTO `t_machine_record` VALUES ('512', '2017-04-10 15:19:05', '5');
INSERT INTO `t_machine_record` VALUES ('513', '2017-04-10 15:20:05', '5');
INSERT INTO `t_machine_record` VALUES ('514', '2017-04-10 15:21:05', '10');
INSERT INTO `t_machine_record` VALUES ('515', '2017-04-10 15:22:05', '14');
INSERT INTO `t_machine_record` VALUES ('516', '2017-04-10 15:23:05', '2');
INSERT INTO `t_machine_record` VALUES ('517', '2017-04-10 15:24:05', '7');
INSERT INTO `t_machine_record` VALUES ('518', '2017-04-10 15:25:05', '2');
INSERT INTO `t_machine_record` VALUES ('519', '2017-04-10 15:26:05', '9');
INSERT INTO `t_machine_record` VALUES ('520', '2017-04-10 15:27:05', '2');
INSERT INTO `t_machine_record` VALUES ('521', '2017-04-10 15:28:05', '15');
INSERT INTO `t_machine_record` VALUES ('522', '2017-04-10 15:29:28', '19');
INSERT INTO `t_machine_record` VALUES ('523', '2017-04-10 15:30:28', '5');
INSERT INTO `t_machine_record` VALUES ('524', '2017-04-10 15:31:28', '7');
INSERT INTO `t_machine_record` VALUES ('525', '2017-04-10 15:32:28', '16');
INSERT INTO `t_machine_record` VALUES ('526', '2017-04-10 15:33:28', '20');
INSERT INTO `t_machine_record` VALUES ('527', '2017-04-10 15:34:28', '18');
INSERT INTO `t_machine_record` VALUES ('528', '2017-04-10 15:35:28', '10');
INSERT INTO `t_machine_record` VALUES ('529', '2017-04-10 15:36:28', '20');
INSERT INTO `t_machine_record` VALUES ('530', '2017-04-10 15:37:28', '15');
INSERT INTO `t_machine_record` VALUES ('531', '2017-04-10 15:38:28', '19');
INSERT INTO `t_machine_record` VALUES ('532', '2017-04-10 15:39:28', '15');
INSERT INTO `t_machine_record` VALUES ('533', '2017-04-10 15:40:29', '13');
INSERT INTO `t_machine_record` VALUES ('534', '2017-04-10 15:41:28', '21');
INSERT INTO `t_machine_record` VALUES ('535', '2017-04-10 15:42:29', '9');
INSERT INTO `t_machine_record` VALUES ('536', '2017-04-10 15:43:29', '7');
INSERT INTO `t_machine_record` VALUES ('537', '2017-04-10 15:44:29', '12');
INSERT INTO `t_machine_record` VALUES ('538', '2017-04-10 15:45:29', '20');
INSERT INTO `t_machine_record` VALUES ('539', '2017-04-10 15:46:29', '8');
INSERT INTO `t_machine_record` VALUES ('540', '2017-04-10 15:47:29', '11');
INSERT INTO `t_machine_record` VALUES ('541', '2017-04-10 15:48:29', '10');
INSERT INTO `t_machine_record` VALUES ('542', '2017-04-10 15:49:29', '22');
INSERT INTO `t_machine_record` VALUES ('543', '2017-04-10 15:50:29', '16');
INSERT INTO `t_machine_record` VALUES ('544', '2017-04-10 15:51:29', '15');
INSERT INTO `t_machine_record` VALUES ('545', '2017-04-10 15:52:29', '1');
INSERT INTO `t_machine_record` VALUES ('546', '2017-04-10 15:53:29', '3');
INSERT INTO `t_machine_record` VALUES ('547', '2017-04-10 15:54:29', '19');
INSERT INTO `t_machine_record` VALUES ('548', '2017-04-10 15:55:53', '11');
INSERT INTO `t_machine_record` VALUES ('549', '2017-04-10 15:56:53', '4');
INSERT INTO `t_machine_record` VALUES ('550', '2017-04-10 15:58:28', '22');
INSERT INTO `t_machine_record` VALUES ('551', '2017-04-10 16:01:13', '4');
INSERT INTO `t_machine_record` VALUES ('552', '2017-04-10 16:02:13', '7');
INSERT INTO `t_machine_record` VALUES ('553', '2017-04-10 16:03:31', '22');
INSERT INTO `t_machine_record` VALUES ('554', '2017-04-10 16:04:31', '14');
INSERT INTO `t_machine_record` VALUES ('555', '2017-04-10 16:05:31', '4');
INSERT INTO `t_machine_record` VALUES ('556', '2017-04-10 16:06:58', '4');
INSERT INTO `t_machine_record` VALUES ('557', '2017-04-10 16:07:58', '14');
INSERT INTO `t_machine_record` VALUES ('558', '2017-04-10 16:08:58', '7');
INSERT INTO `t_machine_record` VALUES ('559', '2017-04-10 16:09:58', '12');
INSERT INTO `t_machine_record` VALUES ('560', '2017-04-10 16:10:58', '7');
INSERT INTO `t_machine_record` VALUES ('561', '2017-04-10 16:11:58', '23');
INSERT INTO `t_machine_record` VALUES ('562', '2017-04-10 16:12:58', '17');
INSERT INTO `t_machine_record` VALUES ('563', '2017-04-10 16:13:58', '6');
INSERT INTO `t_machine_record` VALUES ('564', '2017-04-10 16:14:58', '10');
INSERT INTO `t_machine_record` VALUES ('565', '2017-04-10 16:15:58', '0');
INSERT INTO `t_machine_record` VALUES ('566', '2017-04-10 16:16:58', '20');
INSERT INTO `t_machine_record` VALUES ('567', '2017-04-10 16:20:32', '18');
INSERT INTO `t_machine_record` VALUES ('568', '2017-04-10 16:21:32', '9');
INSERT INTO `t_machine_record` VALUES ('569', '2017-04-10 16:22:32', '0');
INSERT INTO `t_machine_record` VALUES ('570', '2017-04-10 16:23:32', '17');
INSERT INTO `t_machine_record` VALUES ('571', '2017-04-10 16:24:30', '0');
INSERT INTO `t_machine_record` VALUES ('572', '2017-04-10 16:25:32', '6');
INSERT INTO `t_machine_record` VALUES ('573', '2017-04-10 16:26:32', '14');
INSERT INTO `t_machine_record` VALUES ('574', '2017-04-10 16:27:32', '18');
INSERT INTO `t_machine_record` VALUES ('575', '2017-04-10 16:28:32', '1');
INSERT INTO `t_machine_record` VALUES ('576', '2017-04-10 16:29:32', '0');
INSERT INTO `t_machine_record` VALUES ('577', '2017-04-10 16:30:32', '14');
INSERT INTO `t_machine_record` VALUES ('578', '2017-04-10 16:31:32', '3');
INSERT INTO `t_machine_record` VALUES ('579', '2017-04-10 16:32:32', '18');
INSERT INTO `t_machine_record` VALUES ('580', '2017-04-10 16:35:06', '22');
INSERT INTO `t_machine_record` VALUES ('581', '2017-04-10 16:36:53', '5');
INSERT INTO `t_machine_record` VALUES ('582', '2017-04-10 16:38:19', '14');
INSERT INTO `t_machine_record` VALUES ('583', '2017-04-10 16:44:21', '16');
INSERT INTO `t_machine_record` VALUES ('584', '2017-04-10 16:45:21', '6');
INSERT INTO `t_machine_record` VALUES ('585', '2017-04-10 16:46:17', '7');
INSERT INTO `t_machine_record` VALUES ('586', '2017-04-11 10:59:10', '2');
INSERT INTO `t_machine_record` VALUES ('587', '2017-04-11 11:00:04', '0');
INSERT INTO `t_machine_record` VALUES ('588', '2017-04-11 11:01:04', '0');
INSERT INTO `t_machine_record` VALUES ('589', '2017-04-11 11:02:04', '0');
INSERT INTO `t_machine_record` VALUES ('590', '2017-04-11 11:03:04', '0');
INSERT INTO `t_machine_record` VALUES ('591', '2017-04-11 11:04:26', '0');
INSERT INTO `t_machine_record` VALUES ('592', '2017-04-11 11:05:47', '0');
INSERT INTO `t_machine_record` VALUES ('593', '2017-04-11 11:06:47', '0');
INSERT INTO `t_machine_record` VALUES ('594', '2017-04-11 11:07:47', '0');
INSERT INTO `t_machine_record` VALUES ('595', '2017-04-11 11:08:47', '0');
INSERT INTO `t_machine_record` VALUES ('596', '2017-04-11 11:30:28', '0');
INSERT INTO `t_machine_record` VALUES ('597', '2017-04-11 11:31:32', '0');
INSERT INTO `t_machine_record` VALUES ('598', '2017-04-11 11:32:42', '0');
INSERT INTO `t_machine_record` VALUES ('599', '2017-04-11 11:33:42', '0');
INSERT INTO `t_machine_record` VALUES ('600', '2017-04-11 11:34:42', '0');
INSERT INTO `t_machine_record` VALUES ('601', '2017-04-11 11:35:42', '0');
INSERT INTO `t_machine_record` VALUES ('602', '2017-04-11 11:38:24', '0');
INSERT INTO `t_machine_record` VALUES ('603', '2017-04-11 11:39:14', '0');
INSERT INTO `t_machine_record` VALUES ('604', '2017-04-11 11:40:14', '0');
INSERT INTO `t_machine_record` VALUES ('605', '2017-04-11 11:41:14', '0');
INSERT INTO `t_machine_record` VALUES ('606', '2017-04-11 11:42:54', '0');
INSERT INTO `t_machine_record` VALUES ('607', '2017-04-11 11:43:54', '0');
INSERT INTO `t_machine_record` VALUES ('608', '2017-04-11 11:44:54', '0');
INSERT INTO `t_machine_record` VALUES ('609', '2017-04-11 11:45:54', '0');
INSERT INTO `t_machine_record` VALUES ('610', '2017-04-11 11:46:54', '0');
INSERT INTO `t_machine_record` VALUES ('611', '2017-04-11 11:47:54', '0');
INSERT INTO `t_machine_record` VALUES ('612', '2017-04-11 11:48:54', '0');
INSERT INTO `t_machine_record` VALUES ('613', '2017-04-11 11:49:54', '0');
INSERT INTO `t_machine_record` VALUES ('614', '2017-04-11 11:50:54', '0');
INSERT INTO `t_machine_record` VALUES ('615', '2017-04-11 11:51:54', '0');
INSERT INTO `t_machine_record` VALUES ('616', '2017-04-11 11:52:54', '0');
INSERT INTO `t_machine_record` VALUES ('617', '2017-04-11 11:53:54', '0');
INSERT INTO `t_machine_record` VALUES ('618', '2017-04-11 11:54:54', '0');
INSERT INTO `t_machine_record` VALUES ('619', '2017-04-11 11:55:54', '0');
INSERT INTO `t_machine_record` VALUES ('620', '2017-04-11 11:56:54', '0');
INSERT INTO `t_machine_record` VALUES ('621', '2017-04-11 11:57:54', '0');
INSERT INTO `t_machine_record` VALUES ('622', '2017-04-11 11:58:54', '0');
INSERT INTO `t_machine_record` VALUES ('623', '2017-04-11 11:59:54', '0');
INSERT INTO `t_machine_record` VALUES ('624', '2017-04-11 12:00:54', '0');
INSERT INTO `t_machine_record` VALUES ('625', '2017-04-11 12:01:54', '0');
INSERT INTO `t_machine_record` VALUES ('626', '2017-04-11 12:02:54', '0');
INSERT INTO `t_machine_record` VALUES ('627', '2017-04-11 12:03:54', '0');
INSERT INTO `t_machine_record` VALUES ('628', '2017-04-11 12:04:54', '0');
INSERT INTO `t_machine_record` VALUES ('629', '2017-04-11 12:05:54', '0');
INSERT INTO `t_machine_record` VALUES ('630', '2017-04-11 12:06:54', '0');
INSERT INTO `t_machine_record` VALUES ('631', '2017-04-11 12:07:54', '0');
INSERT INTO `t_machine_record` VALUES ('632', '2017-04-11 12:08:54', '0');
INSERT INTO `t_machine_record` VALUES ('633', '2017-04-11 12:09:54', '0');
INSERT INTO `t_machine_record` VALUES ('634', '2017-04-11 12:10:54', '0');
INSERT INTO `t_machine_record` VALUES ('635', '2017-04-11 12:11:54', '0');
INSERT INTO `t_machine_record` VALUES ('636', '2017-04-11 12:12:54', '0');
INSERT INTO `t_machine_record` VALUES ('637', '2017-04-11 12:13:54', '0');
INSERT INTO `t_machine_record` VALUES ('638', '2017-04-11 12:14:54', '0');
INSERT INTO `t_machine_record` VALUES ('639', '2017-04-11 12:15:54', '0');
INSERT INTO `t_machine_record` VALUES ('640', '2017-04-11 12:16:54', '0');
INSERT INTO `t_machine_record` VALUES ('641', '2017-04-11 12:17:54', '0');
INSERT INTO `t_machine_record` VALUES ('642', '2017-04-11 12:18:54', '0');
INSERT INTO `t_machine_record` VALUES ('643', '2017-04-11 12:19:54', '0');
INSERT INTO `t_machine_record` VALUES ('644', '2017-04-11 12:20:54', '0');
INSERT INTO `t_machine_record` VALUES ('645', '2017-04-11 12:21:54', '0');
INSERT INTO `t_machine_record` VALUES ('646', '2017-04-11 12:22:54', '0');
INSERT INTO `t_machine_record` VALUES ('647', '2017-04-11 12:23:54', '0');
INSERT INTO `t_machine_record` VALUES ('648', '2017-04-11 12:24:54', '0');
INSERT INTO `t_machine_record` VALUES ('649', '2017-04-11 12:25:54', '0');
INSERT INTO `t_machine_record` VALUES ('650', '2017-04-11 12:26:54', '0');
INSERT INTO `t_machine_record` VALUES ('651', '2017-04-11 12:27:54', '0');
INSERT INTO `t_machine_record` VALUES ('652', '2017-04-11 12:28:54', '0');
INSERT INTO `t_machine_record` VALUES ('653', '2017-04-11 12:29:54', '0');
INSERT INTO `t_machine_record` VALUES ('654', '2017-04-11 12:30:54', '0');
INSERT INTO `t_machine_record` VALUES ('655', '2017-04-11 12:31:54', '0');
INSERT INTO `t_machine_record` VALUES ('656', '2017-04-11 12:32:54', '0');
INSERT INTO `t_machine_record` VALUES ('657', '2017-04-11 12:33:54', '0');
INSERT INTO `t_machine_record` VALUES ('658', '2017-04-11 12:34:54', '0');
INSERT INTO `t_machine_record` VALUES ('659', '2017-04-11 12:35:54', '0');
INSERT INTO `t_machine_record` VALUES ('660', '2017-04-11 12:36:54', '0');
INSERT INTO `t_machine_record` VALUES ('661', '2017-04-11 12:37:54', '0');
INSERT INTO `t_machine_record` VALUES ('662', '2017-04-11 12:38:54', '0');
INSERT INTO `t_machine_record` VALUES ('663', '2017-04-11 12:39:54', '0');
INSERT INTO `t_machine_record` VALUES ('664', '2017-04-11 12:40:54', '0');
INSERT INTO `t_machine_record` VALUES ('665', '2017-04-11 12:41:54', '0');
INSERT INTO `t_machine_record` VALUES ('666', '2017-04-11 12:42:54', '0');
INSERT INTO `t_machine_record` VALUES ('667', '2017-04-11 12:43:54', '0');
INSERT INTO `t_machine_record` VALUES ('668', '2017-04-11 12:44:54', '0');
INSERT INTO `t_machine_record` VALUES ('669', '2017-04-11 12:45:54', '0');
INSERT INTO `t_machine_record` VALUES ('670', '2017-04-11 12:46:54', '0');
INSERT INTO `t_machine_record` VALUES ('671', '2017-04-11 12:47:54', '0');
INSERT INTO `t_machine_record` VALUES ('672', '2017-04-11 12:48:54', '0');
INSERT INTO `t_machine_record` VALUES ('673', '2017-04-11 12:49:54', '0');
INSERT INTO `t_machine_record` VALUES ('674', '2017-04-11 12:50:54', '0');
INSERT INTO `t_machine_record` VALUES ('675', '2017-04-11 12:51:54', '0');
INSERT INTO `t_machine_record` VALUES ('676', '2017-04-11 12:52:54', '0');
INSERT INTO `t_machine_record` VALUES ('677', '2017-04-11 12:53:54', '0');
INSERT INTO `t_machine_record` VALUES ('678', '2017-04-11 12:54:54', '0');
INSERT INTO `t_machine_record` VALUES ('679', '2017-04-11 12:55:54', '0');
INSERT INTO `t_machine_record` VALUES ('680', '2017-04-11 12:56:54', '0');
INSERT INTO `t_machine_record` VALUES ('681', '2017-04-11 12:57:54', '0');
INSERT INTO `t_machine_record` VALUES ('682', '2017-04-11 12:58:54', '0');
INSERT INTO `t_machine_record` VALUES ('683', '2017-04-11 12:59:54', '0');
INSERT INTO `t_machine_record` VALUES ('684', '2017-04-11 13:00:54', '0');
INSERT INTO `t_machine_record` VALUES ('685', '2017-04-11 13:01:54', '0');
INSERT INTO `t_machine_record` VALUES ('686', '2017-04-11 13:02:54', '0');
INSERT INTO `t_machine_record` VALUES ('687', '2017-04-11 13:03:54', '0');
INSERT INTO `t_machine_record` VALUES ('688', '2017-04-11 13:04:54', '0');
INSERT INTO `t_machine_record` VALUES ('689', '2017-04-11 13:05:54', '0');
INSERT INTO `t_machine_record` VALUES ('690', '2017-04-11 13:06:54', '0');
INSERT INTO `t_machine_record` VALUES ('691', '2017-04-11 13:07:54', '0');
INSERT INTO `t_machine_record` VALUES ('692', '2017-04-11 13:08:54', '0');
INSERT INTO `t_machine_record` VALUES ('693', '2017-04-11 13:09:54', '0');
INSERT INTO `t_machine_record` VALUES ('694', '2017-04-11 13:10:54', '0');
INSERT INTO `t_machine_record` VALUES ('695', '2017-04-11 13:11:54', '0');
INSERT INTO `t_machine_record` VALUES ('696', '2017-04-11 13:12:54', '0');
INSERT INTO `t_machine_record` VALUES ('697', '2017-04-11 13:13:54', '0');
INSERT INTO `t_machine_record` VALUES ('698', '2017-04-11 13:14:54', '0');
INSERT INTO `t_machine_record` VALUES ('699', '2017-04-11 13:15:54', '0');
INSERT INTO `t_machine_record` VALUES ('700', '2017-04-11 13:16:54', '0');
INSERT INTO `t_machine_record` VALUES ('701', '2017-04-11 13:17:54', '0');
INSERT INTO `t_machine_record` VALUES ('702', '2017-04-11 13:18:54', '0');
INSERT INTO `t_machine_record` VALUES ('703', '2017-04-11 13:19:54', '0');
INSERT INTO `t_machine_record` VALUES ('704', '2017-04-11 13:20:54', '0');
INSERT INTO `t_machine_record` VALUES ('705', '2017-04-11 13:21:54', '0');
INSERT INTO `t_machine_record` VALUES ('706', '2017-04-11 13:22:54', '0');
INSERT INTO `t_machine_record` VALUES ('707', '2017-04-11 13:23:54', '0');
INSERT INTO `t_machine_record` VALUES ('708', '2017-04-12 10:11:47', '0');
INSERT INTO `t_machine_record` VALUES ('709', '2017-04-12 10:12:47', '0');
INSERT INTO `t_machine_record` VALUES ('710', '2017-04-12 10:13:47', '0');
INSERT INTO `t_machine_record` VALUES ('711', '2017-04-12 10:14:47', '0');
INSERT INTO `t_machine_record` VALUES ('712', '2017-04-12 10:15:47', '0');
INSERT INTO `t_machine_record` VALUES ('713', '2017-04-12 10:16:47', '0');
INSERT INTO `t_machine_record` VALUES ('714', '2017-04-12 10:17:47', '0');
INSERT INTO `t_machine_record` VALUES ('715', '2017-04-12 10:18:47', '0');
INSERT INTO `t_machine_record` VALUES ('716', '2017-04-12 10:19:47', '0');
INSERT INTO `t_machine_record` VALUES ('717', '2017-04-12 10:20:47', '0');
INSERT INTO `t_machine_record` VALUES ('718', '2017-04-12 10:21:47', '0');
INSERT INTO `t_machine_record` VALUES ('719', '2017-04-12 10:22:47', '0');
INSERT INTO `t_machine_record` VALUES ('720', '2017-04-12 10:40:18', '0');
INSERT INTO `t_machine_record` VALUES ('721', '2017-04-12 10:41:18', '0');
INSERT INTO `t_machine_record` VALUES ('722', '2017-04-12 10:42:18', '0');
INSERT INTO `t_machine_record` VALUES ('723', '2017-04-12 10:43:18', '0');
INSERT INTO `t_machine_record` VALUES ('724', '2017-04-12 10:44:18', '0');
INSERT INTO `t_machine_record` VALUES ('725', '2017-04-12 10:45:18', '0');
INSERT INTO `t_machine_record` VALUES ('726', '2017-04-12 10:46:18', '0');
INSERT INTO `t_machine_record` VALUES ('727', '2017-04-12 11:18:12', '0');
INSERT INTO `t_machine_record` VALUES ('728', '2017-04-12 11:19:12', '0');
INSERT INTO `t_machine_record` VALUES ('729', '2017-04-12 11:20:12', '0');
INSERT INTO `t_machine_record` VALUES ('730', '2017-04-12 11:21:12', '0');
INSERT INTO `t_machine_record` VALUES ('731', '2017-04-12 11:22:12', '0');
INSERT INTO `t_machine_record` VALUES ('732', '2017-04-12 11:23:12', '0');
INSERT INTO `t_machine_record` VALUES ('733', '2017-04-12 11:24:12', '0');
INSERT INTO `t_machine_record` VALUES ('734', '2017-04-12 11:25:12', '0');
INSERT INTO `t_machine_record` VALUES ('735', '2017-04-12 11:26:12', '0');
INSERT INTO `t_machine_record` VALUES ('736', '2017-04-12 11:27:12', '0');
INSERT INTO `t_machine_record` VALUES ('737', '2017-04-12 11:28:12', '0');
INSERT INTO `t_machine_record` VALUES ('738', '2017-04-12 11:29:12', '0');
INSERT INTO `t_machine_record` VALUES ('739', '2017-04-12 11:30:12', '0');
INSERT INTO `t_machine_record` VALUES ('740', '2017-04-12 11:31:12', '0');
INSERT INTO `t_machine_record` VALUES ('741', '2017-04-12 11:32:12', '0');
INSERT INTO `t_machine_record` VALUES ('742', '2017-04-12 11:33:12', '0');
INSERT INTO `t_machine_record` VALUES ('743', '2017-04-12 11:34:12', '0');
INSERT INTO `t_machine_record` VALUES ('744', '2017-04-12 11:35:12', '0');
INSERT INTO `t_machine_record` VALUES ('745', '2017-04-12 11:36:12', '0');
INSERT INTO `t_machine_record` VALUES ('746', '2017-04-12 11:37:12', '0');
INSERT INTO `t_machine_record` VALUES ('747', '2017-04-12 11:38:12', '0');
INSERT INTO `t_machine_record` VALUES ('748', '2017-04-12 11:39:12', '0');
INSERT INTO `t_machine_record` VALUES ('749', '2017-04-12 11:40:12', '0');
INSERT INTO `t_machine_record` VALUES ('750', '2017-04-12 11:41:12', '0');
INSERT INTO `t_machine_record` VALUES ('751', '2017-04-12 11:42:12', '0');
INSERT INTO `t_machine_record` VALUES ('752', '2017-04-12 11:43:12', '0');
INSERT INTO `t_machine_record` VALUES ('753', '2017-04-12 11:44:12', '0');
INSERT INTO `t_machine_record` VALUES ('754', '2017-04-12 14:03:52', '0');
INSERT INTO `t_machine_record` VALUES ('755', '2017-04-12 14:04:52', '0');
INSERT INTO `t_machine_record` VALUES ('756', '2017-04-12 14:05:52', '0');
INSERT INTO `t_machine_record` VALUES ('757', '2017-04-12 14:06:52', '0');
INSERT INTO `t_machine_record` VALUES ('758', '2017-04-12 14:28:23', '0');
INSERT INTO `t_machine_record` VALUES ('759', '2017-04-12 14:29:23', '0');
INSERT INTO `t_machine_record` VALUES ('760', '2017-04-12 14:30:23', '0');
INSERT INTO `t_machine_record` VALUES ('761', '2017-04-12 14:31:23', '0');
INSERT INTO `t_machine_record` VALUES ('762', '2017-04-12 14:32:23', '0');
INSERT INTO `t_machine_record` VALUES ('763', '2017-04-12 14:33:23', '0');
INSERT INTO `t_machine_record` VALUES ('764', '2017-04-12 14:34:23', '0');
INSERT INTO `t_machine_record` VALUES ('765', '2017-04-12 14:35:23', '0');
INSERT INTO `t_machine_record` VALUES ('766', '2017-04-12 14:36:23', '0');
INSERT INTO `t_machine_record` VALUES ('767', '2017-04-12 14:37:23', '0');
INSERT INTO `t_machine_record` VALUES ('768', '2017-04-12 14:38:23', '0');
INSERT INTO `t_machine_record` VALUES ('769', '2017-04-12 14:39:23', '0');
INSERT INTO `t_machine_record` VALUES ('770', '2017-04-12 14:40:23', '0');
INSERT INTO `t_machine_record` VALUES ('771', '2017-04-12 14:41:23', '0');
INSERT INTO `t_machine_record` VALUES ('772', '2017-04-12 14:42:23', '0');
INSERT INTO `t_machine_record` VALUES ('773', '2017-04-12 14:43:23', '0');
INSERT INTO `t_machine_record` VALUES ('774', '2017-04-12 14:44:23', '0');
INSERT INTO `t_machine_record` VALUES ('775', '2017-04-12 14:45:23', '0');
INSERT INTO `t_machine_record` VALUES ('776', '2017-04-12 14:46:23', '0');
INSERT INTO `t_machine_record` VALUES ('777', '2017-04-12 14:47:23', '0');
INSERT INTO `t_machine_record` VALUES ('778', '2017-04-12 14:48:23', '0');
INSERT INTO `t_machine_record` VALUES ('779', '2017-04-12 14:49:23', '0');
INSERT INTO `t_machine_record` VALUES ('780', '2017-04-12 14:50:23', '0');
INSERT INTO `t_machine_record` VALUES ('781', '2017-04-12 14:51:23', '0');
INSERT INTO `t_machine_record` VALUES ('782', '2017-04-12 14:52:23', '0');
INSERT INTO `t_machine_record` VALUES ('783', '2017-04-12 14:54:07', '0');
INSERT INTO `t_machine_record` VALUES ('784', '2017-04-12 14:55:31', '0');
INSERT INTO `t_machine_record` VALUES ('785', '2017-04-12 14:56:27', '0');
INSERT INTO `t_machine_record` VALUES ('786', '2017-04-12 14:58:46', '0');
INSERT INTO `t_machine_record` VALUES ('787', '2017-04-12 14:59:46', '0');
INSERT INTO `t_machine_record` VALUES ('788', '2017-04-12 15:00:46', '0');
INSERT INTO `t_machine_record` VALUES ('789', '2017-04-12 15:01:46', '0');
INSERT INTO `t_machine_record` VALUES ('790', '2017-04-12 15:02:46', '0');
INSERT INTO `t_machine_record` VALUES ('791', '2017-04-12 15:03:46', '0');
INSERT INTO `t_machine_record` VALUES ('792', '2017-04-12 15:05:14', '0');
INSERT INTO `t_machine_record` VALUES ('793', '2017-04-12 15:06:14', '0');
INSERT INTO `t_machine_record` VALUES ('794', '2017-04-12 15:07:04', '0');
INSERT INTO `t_machine_record` VALUES ('795', '2017-04-12 15:08:04', '0');
INSERT INTO `t_machine_record` VALUES ('796', '2017-04-12 15:09:04', '0');
INSERT INTO `t_machine_record` VALUES ('797', '2017-04-12 15:10:04', '0');
INSERT INTO `t_machine_record` VALUES ('798', '2017-04-12 15:11:04', '0');
INSERT INTO `t_machine_record` VALUES ('799', '2017-04-12 15:12:04', '0');
INSERT INTO `t_machine_record` VALUES ('800', '2017-04-12 15:14:15', '0');
INSERT INTO `t_machine_record` VALUES ('801', '2017-04-12 15:15:10', '0');
INSERT INTO `t_machine_record` VALUES ('802', '2017-04-12 15:16:10', '0');
INSERT INTO `t_machine_record` VALUES ('803', '2017-04-12 15:17:10', '0');
INSERT INTO `t_machine_record` VALUES ('804', '2017-04-12 15:18:10', '0');
INSERT INTO `t_machine_record` VALUES ('805', '2017-04-12 15:19:10', '0');
INSERT INTO `t_machine_record` VALUES ('806', '2017-04-12 15:20:55', '0');
INSERT INTO `t_machine_record` VALUES ('807', '2017-04-12 15:21:55', '0');
INSERT INTO `t_machine_record` VALUES ('808', '2017-04-12 15:22:55', '0');
INSERT INTO `t_machine_record` VALUES ('809', '2017-04-12 15:23:55', '0');
INSERT INTO `t_machine_record` VALUES ('810', '2017-04-12 15:24:55', '0');
INSERT INTO `t_machine_record` VALUES ('811', '2017-04-12 15:25:55', '0');
INSERT INTO `t_machine_record` VALUES ('812', '2017-04-12 15:26:55', '0');
INSERT INTO `t_machine_record` VALUES ('813', '2017-04-12 15:27:55', '0');
INSERT INTO `t_machine_record` VALUES ('814', '2017-04-12 15:28:55', '0');
INSERT INTO `t_machine_record` VALUES ('815', '2017-04-12 15:29:55', '0');
INSERT INTO `t_machine_record` VALUES ('816', '2017-04-12 15:30:55', '0');
INSERT INTO `t_machine_record` VALUES ('817', '2017-04-12 15:33:16', '0');
INSERT INTO `t_machine_record` VALUES ('818', '2017-04-12 15:35:06', '0');
INSERT INTO `t_machine_record` VALUES ('819', '2017-04-12 15:35:57', '0');
INSERT INTO `t_machine_record` VALUES ('820', '2017-04-12 15:36:57', '0');
INSERT INTO `t_machine_record` VALUES ('821', '2017-04-12 15:37:57', '0');
INSERT INTO `t_machine_record` VALUES ('822', '2017-04-12 15:38:57', '0');
INSERT INTO `t_machine_record` VALUES ('823', '2017-04-12 15:39:57', '0');
INSERT INTO `t_machine_record` VALUES ('824', '2017-04-12 15:40:57', '0');
INSERT INTO `t_machine_record` VALUES ('825', '2017-04-12 15:41:57', '0');
INSERT INTO `t_machine_record` VALUES ('826', '2017-04-12 15:43:09', '0');
INSERT INTO `t_machine_record` VALUES ('827', '2017-04-12 15:44:23', '0');
INSERT INTO `t_machine_record` VALUES ('828', '2017-04-12 15:45:23', '0');
INSERT INTO `t_machine_record` VALUES ('829', '2017-04-12 15:46:23', '0');
INSERT INTO `t_machine_record` VALUES ('830', '2017-04-12 15:47:23', '0');
INSERT INTO `t_machine_record` VALUES ('831', '2017-04-12 15:48:23', '0');
INSERT INTO `t_machine_record` VALUES ('832', '2017-04-12 15:49:23', '0');
INSERT INTO `t_machine_record` VALUES ('833', '2017-04-12 15:50:23', '0');
INSERT INTO `t_machine_record` VALUES ('834', '2017-04-12 15:51:23', '0');
INSERT INTO `t_machine_record` VALUES ('835', '2017-04-12 15:52:23', '0');
INSERT INTO `t_machine_record` VALUES ('836', '2017-04-12 15:53:23', '0');
INSERT INTO `t_machine_record` VALUES ('837', '2017-04-12 15:55:08', '0');
INSERT INTO `t_machine_record` VALUES ('838', '2017-04-12 15:56:08', '0');
INSERT INTO `t_machine_record` VALUES ('839', '2017-04-12 15:57:08', '0');
INSERT INTO `t_machine_record` VALUES ('840', '2017-04-12 15:58:08', '0');
INSERT INTO `t_machine_record` VALUES ('841', '2017-04-12 15:59:08', '0');
INSERT INTO `t_machine_record` VALUES ('842', '2017-04-12 16:00:08', '0');
INSERT INTO `t_machine_record` VALUES ('843', '2017-04-12 16:01:08', '0');
INSERT INTO `t_machine_record` VALUES ('844', '2017-04-12 16:02:08', '0');
INSERT INTO `t_machine_record` VALUES ('845', '2017-04-12 16:03:08', '0');
INSERT INTO `t_machine_record` VALUES ('846', '2017-04-12 16:04:08', '0');
INSERT INTO `t_machine_record` VALUES ('847', '2017-04-12 16:05:08', '0');
INSERT INTO `t_machine_record` VALUES ('848', '2017-04-12 16:06:08', '0');
INSERT INTO `t_machine_record` VALUES ('849', '2017-04-12 16:07:08', '0');
INSERT INTO `t_machine_record` VALUES ('850', '2017-04-12 16:08:08', '0');
INSERT INTO `t_machine_record` VALUES ('851', '2017-04-12 16:09:08', '0');
INSERT INTO `t_machine_record` VALUES ('852', '2017-04-12 16:10:08', '0');
INSERT INTO `t_machine_record` VALUES ('853', '2017-04-12 16:11:08', '0');
INSERT INTO `t_machine_record` VALUES ('854', '2017-04-12 16:12:08', '0');
INSERT INTO `t_machine_record` VALUES ('855', '2017-04-12 16:13:08', '0');
INSERT INTO `t_machine_record` VALUES ('856', '2017-04-12 16:14:08', '0');
INSERT INTO `t_machine_record` VALUES ('857', '2017-04-12 16:15:08', '0');
INSERT INTO `t_machine_record` VALUES ('858', '2017-04-12 16:16:08', '0');
INSERT INTO `t_machine_record` VALUES ('859', '2017-04-12 16:17:08', '0');
INSERT INTO `t_machine_record` VALUES ('860', '2017-04-12 16:18:08', '0');
INSERT INTO `t_machine_record` VALUES ('861', '2017-04-12 16:19:08', '0');
INSERT INTO `t_machine_record` VALUES ('862', '2017-04-13 10:48:28', '0');
INSERT INTO `t_machine_record` VALUES ('863', '2017-04-13 10:49:28', '0');
INSERT INTO `t_machine_record` VALUES ('864', '2017-04-13 10:50:28', '0');
INSERT INTO `t_machine_record` VALUES ('865', '2017-04-13 10:51:28', '0');
INSERT INTO `t_machine_record` VALUES ('866', '2017-04-13 10:52:28', '0');
INSERT INTO `t_machine_record` VALUES ('867', '2017-04-13 10:53:28', '0');
INSERT INTO `t_machine_record` VALUES ('868', '2017-04-13 10:54:28', '0');
INSERT INTO `t_machine_record` VALUES ('869', '2017-04-13 10:55:50', '0');
INSERT INTO `t_machine_record` VALUES ('870', '2017-04-13 10:56:50', '0');
INSERT INTO `t_machine_record` VALUES ('871', '2017-04-13 10:57:50', '0');
INSERT INTO `t_machine_record` VALUES ('872', '2017-04-13 10:58:50', '0');
INSERT INTO `t_machine_record` VALUES ('873', '2017-04-13 10:59:50', '0');
INSERT INTO `t_machine_record` VALUES ('874', '2017-04-13 11:00:50', '0');
INSERT INTO `t_machine_record` VALUES ('875', '2017-04-13 11:01:50', '0');
INSERT INTO `t_machine_record` VALUES ('876', '2017-04-13 11:02:50', '0');
INSERT INTO `t_machine_record` VALUES ('877', '2017-04-13 11:03:50', '0');
INSERT INTO `t_machine_record` VALUES ('878', '2017-04-13 11:04:50', '0');
INSERT INTO `t_machine_record` VALUES ('879', '2017-04-13 11:05:50', '0');
INSERT INTO `t_machine_record` VALUES ('880', '2017-04-13 11:06:50', '0');
INSERT INTO `t_machine_record` VALUES ('881', '2017-04-13 11:10:04', '0');
INSERT INTO `t_machine_record` VALUES ('882', '2017-04-13 11:11:03', '0');
INSERT INTO `t_machine_record` VALUES ('883', '2017-04-13 11:12:03', '0');
INSERT INTO `t_machine_record` VALUES ('884', '2017-04-13 11:13:03', '0');
INSERT INTO `t_machine_record` VALUES ('885', '2017-04-13 11:14:03', '0');
INSERT INTO `t_machine_record` VALUES ('886', '2017-04-13 11:15:04', '0');
INSERT INTO `t_machine_record` VALUES ('887', '2017-04-13 11:16:03', '0');
INSERT INTO `t_machine_record` VALUES ('888', '2017-04-13 11:17:03', '0');
INSERT INTO `t_machine_record` VALUES ('889', '2017-04-13 11:18:04', '0');
INSERT INTO `t_machine_record` VALUES ('890', '2017-04-13 11:19:04', '0');
INSERT INTO `t_machine_record` VALUES ('891', '2017-04-13 11:20:04', '0');
INSERT INTO `t_machine_record` VALUES ('892', '2017-04-13 11:21:04', '0');
INSERT INTO `t_machine_record` VALUES ('893', '2017-04-13 11:22:04', '0');
INSERT INTO `t_machine_record` VALUES ('894', '2017-04-13 11:23:04', '0');
INSERT INTO `t_machine_record` VALUES ('895', '2017-04-13 11:24:04', '0');
INSERT INTO `t_machine_record` VALUES ('896', '2017-04-13 11:25:04', '0');
INSERT INTO `t_machine_record` VALUES ('897', '2017-04-13 11:26:04', '0');
INSERT INTO `t_machine_record` VALUES ('898', '2017-04-13 11:27:04', '0');
INSERT INTO `t_machine_record` VALUES ('899', '2017-04-13 11:28:04', '0');
INSERT INTO `t_machine_record` VALUES ('900', '2017-04-13 11:29:04', '0');
INSERT INTO `t_machine_record` VALUES ('901', '2017-04-13 11:30:04', '0');
INSERT INTO `t_machine_record` VALUES ('902', '2017-04-13 11:31:04', '0');
INSERT INTO `t_machine_record` VALUES ('903', '2017-04-13 11:32:04', '0');
INSERT INTO `t_machine_record` VALUES ('904', '2017-04-13 11:34:52', '0');
INSERT INTO `t_machine_record` VALUES ('905', '2017-04-13 11:35:52', '0');
INSERT INTO `t_machine_record` VALUES ('906', '2017-04-13 11:36:52', '0');
INSERT INTO `t_machine_record` VALUES ('907', '2017-04-13 11:37:52', '0');
INSERT INTO `t_machine_record` VALUES ('908', '2017-04-13 11:38:52', '0');
INSERT INTO `t_machine_record` VALUES ('909', '2017-04-13 11:39:52', '0');
INSERT INTO `t_machine_record` VALUES ('910', '2017-04-13 11:40:52', '0');
INSERT INTO `t_machine_record` VALUES ('911', '2017-04-13 11:41:52', '0');
INSERT INTO `t_machine_record` VALUES ('912', '2017-04-13 11:42:52', '0');
INSERT INTO `t_machine_record` VALUES ('913', '2017-04-13 11:43:52', '0');
INSERT INTO `t_machine_record` VALUES ('914', '2017-04-13 11:44:52', '0');
INSERT INTO `t_machine_record` VALUES ('915', '2017-04-13 11:45:52', '0');
INSERT INTO `t_machine_record` VALUES ('916', '2017-04-13 11:46:52', '0');
INSERT INTO `t_machine_record` VALUES ('917', '2017-04-13 11:47:52', '0');
INSERT INTO `t_machine_record` VALUES ('918', '2017-04-13 11:48:52', '0');
INSERT INTO `t_machine_record` VALUES ('919', '2017-04-13 14:05:38', '0');
INSERT INTO `t_machine_record` VALUES ('920', '2017-04-13 14:06:38', '0');
INSERT INTO `t_machine_record` VALUES ('921', '2017-04-13 14:07:38', '0');
INSERT INTO `t_machine_record` VALUES ('922', '2017-04-13 14:08:38', '0');
INSERT INTO `t_machine_record` VALUES ('923', '2017-04-13 14:09:38', '0');
INSERT INTO `t_machine_record` VALUES ('924', '2017-04-13 14:10:38', '0');
INSERT INTO `t_machine_record` VALUES ('925', '2017-04-13 14:11:38', '0');
INSERT INTO `t_machine_record` VALUES ('926', '2017-04-13 14:12:38', '0');
INSERT INTO `t_machine_record` VALUES ('927', '2017-04-13 14:13:38', '0');
INSERT INTO `t_machine_record` VALUES ('928', '2017-04-13 14:14:38', '0');
INSERT INTO `t_machine_record` VALUES ('929', '2017-04-13 14:15:38', '0');
INSERT INTO `t_machine_record` VALUES ('930', '2017-04-13 14:16:38', '0');
INSERT INTO `t_machine_record` VALUES ('931', '2017-04-13 14:26:18', '0');
INSERT INTO `t_machine_record` VALUES ('932', '2017-04-13 14:27:18', '0');
INSERT INTO `t_machine_record` VALUES ('933', '2017-04-13 14:28:18', '0');
INSERT INTO `t_machine_record` VALUES ('934', '2017-04-13 14:29:51', '0');
INSERT INTO `t_machine_record` VALUES ('935', '2017-04-13 14:30:51', '0');
INSERT INTO `t_machine_record` VALUES ('936', '2017-04-13 14:31:51', '0');
INSERT INTO `t_machine_record` VALUES ('937', '2017-04-13 15:41:46', '0');
INSERT INTO `t_machine_record` VALUES ('938', '2017-04-14 15:25:23', '0');
INSERT INTO `t_machine_record` VALUES ('939', '2017-04-14 15:26:23', '0');
INSERT INTO `t_machine_record` VALUES ('940', '2017-04-14 15:27:23', '0');
INSERT INTO `t_machine_record` VALUES ('941', '2017-04-14 15:28:23', '0');
INSERT INTO `t_machine_record` VALUES ('942', '2017-04-14 15:29:23', '0');
INSERT INTO `t_machine_record` VALUES ('943', '2017-04-14 15:30:23', '0');
INSERT INTO `t_machine_record` VALUES ('944', '2017-04-14 15:31:23', '0');
INSERT INTO `t_machine_record` VALUES ('945', '2017-04-14 15:32:23', '0');
INSERT INTO `t_machine_record` VALUES ('946', '2017-04-14 15:33:23', '0');
INSERT INTO `t_machine_record` VALUES ('947', '2017-04-14 15:34:23', '0');
INSERT INTO `t_machine_record` VALUES ('948', '2017-04-14 15:35:23', '0');
INSERT INTO `t_machine_record` VALUES ('949', '2017-04-14 15:36:23', '0');
INSERT INTO `t_machine_record` VALUES ('950', '2017-04-14 15:38:06', '0');
INSERT INTO `t_machine_record` VALUES ('951', '2017-04-14 15:39:06', '0');
INSERT INTO `t_machine_record` VALUES ('952', '2017-04-14 15:40:06', '0');
INSERT INTO `t_machine_record` VALUES ('953', '2017-04-14 15:41:06', '0');
INSERT INTO `t_machine_record` VALUES ('954', '2017-04-14 15:42:06', '0');
INSERT INTO `t_machine_record` VALUES ('955', '2017-04-14 15:43:06', '0');
INSERT INTO `t_machine_record` VALUES ('956', '2017-04-14 15:44:06', '0');
INSERT INTO `t_machine_record` VALUES ('957', '2017-04-14 15:45:06', '0');
INSERT INTO `t_machine_record` VALUES ('958', '2017-04-14 15:46:06', '0');
INSERT INTO `t_machine_record` VALUES ('959', '2017-04-14 15:47:06', '0');
INSERT INTO `t_machine_record` VALUES ('960', '2017-04-14 15:48:06', '0');
INSERT INTO `t_machine_record` VALUES ('961', '2017-04-14 15:49:06', '0');
INSERT INTO `t_machine_record` VALUES ('962', '2017-04-14 15:50:06', '0');
INSERT INTO `t_machine_record` VALUES ('963', '2017-04-14 15:51:06', '0');
INSERT INTO `t_machine_record` VALUES ('964', '2017-04-14 15:52:06', '0');
INSERT INTO `t_machine_record` VALUES ('965', '2017-04-14 15:53:06', '0');
INSERT INTO `t_machine_record` VALUES ('966', '2017-04-14 15:54:06', '0');
INSERT INTO `t_machine_record` VALUES ('967', '2017-04-14 15:55:06', '0');
INSERT INTO `t_machine_record` VALUES ('968', '2017-04-14 15:56:06', '0');
INSERT INTO `t_machine_record` VALUES ('969', '2017-04-14 15:57:06', '0');
INSERT INTO `t_machine_record` VALUES ('970', '2017-04-14 15:58:06', '0');
INSERT INTO `t_machine_record` VALUES ('971', '2017-04-14 15:59:06', '0');
INSERT INTO `t_machine_record` VALUES ('972', '2017-04-14 16:00:06', '0');
INSERT INTO `t_machine_record` VALUES ('973', '2017-04-14 16:01:06', '0');
INSERT INTO `t_machine_record` VALUES ('974', '2017-04-14 16:02:06', '0');
INSERT INTO `t_machine_record` VALUES ('975', '2017-04-14 16:03:06', '0');
INSERT INTO `t_machine_record` VALUES ('976', '2017-04-14 16:04:06', '0');
INSERT INTO `t_machine_record` VALUES ('977', '2017-04-14 16:05:06', '0');
INSERT INTO `t_machine_record` VALUES ('978', '2017-04-14 16:06:06', '0');
INSERT INTO `t_machine_record` VALUES ('979', '2017-04-14 16:07:06', '0');
INSERT INTO `t_machine_record` VALUES ('980', '2017-04-14 16:08:06', '0');
INSERT INTO `t_machine_record` VALUES ('981', '2017-04-14 16:09:06', '0');
INSERT INTO `t_machine_record` VALUES ('982', '2017-04-14 16:10:06', '0');
INSERT INTO `t_machine_record` VALUES ('983', '2017-04-14 16:11:06', '0');
INSERT INTO `t_machine_record` VALUES ('984', '2017-04-14 16:12:06', '0');
INSERT INTO `t_machine_record` VALUES ('985', '2017-04-14 16:13:06', '0');
INSERT INTO `t_machine_record` VALUES ('986', '2017-04-14 16:14:06', '0');
INSERT INTO `t_machine_record` VALUES ('987', '2017-04-14 16:15:06', '0');
INSERT INTO `t_machine_record` VALUES ('988', '2017-04-14 16:16:06', '0');
INSERT INTO `t_machine_record` VALUES ('989', '2017-04-14 16:17:06', '0');
INSERT INTO `t_machine_record` VALUES ('990', '2017-04-14 16:18:06', '0');
INSERT INTO `t_machine_record` VALUES ('991', '2017-04-14 16:19:06', '0');
INSERT INTO `t_machine_record` VALUES ('992', '2017-04-14 16:20:06', '0');
INSERT INTO `t_machine_record` VALUES ('993', '2017-04-14 16:21:06', '0');
INSERT INTO `t_machine_record` VALUES ('994', '2017-04-14 16:22:06', '0');
INSERT INTO `t_machine_record` VALUES ('995', '2017-04-14 16:23:06', '0');
INSERT INTO `t_machine_record` VALUES ('996', '2017-04-14 16:24:06', '0');
INSERT INTO `t_machine_record` VALUES ('997', '2017-04-14 16:25:06', '0');
INSERT INTO `t_machine_record` VALUES ('998', '2017-04-14 16:26:06', '0');
INSERT INTO `t_machine_record` VALUES ('999', '2017-04-14 16:27:06', '0');
INSERT INTO `t_machine_record` VALUES ('1000', '2017-04-14 16:28:06', '0');
INSERT INTO `t_machine_record` VALUES ('1001', '2017-04-14 16:29:06', '0');
INSERT INTO `t_machine_record` VALUES ('1002', '2017-04-14 16:30:06', '0');
INSERT INTO `t_machine_record` VALUES ('1003', '2017-04-14 16:31:06', '0');
INSERT INTO `t_machine_record` VALUES ('1004', '2017-04-14 16:32:06', '0');
INSERT INTO `t_machine_record` VALUES ('1005', '2017-04-14 16:33:11', '0');
INSERT INTO `t_machine_record` VALUES ('1006', '2017-04-14 16:35:22', '0');
INSERT INTO `t_machine_record` VALUES ('1007', '2017-04-14 16:36:22', '0');
INSERT INTO `t_machine_record` VALUES ('1008', '2017-04-14 16:37:36', '0');
INSERT INTO `t_machine_record` VALUES ('1009', '2017-04-14 16:38:36', '0');
INSERT INTO `t_machine_record` VALUES ('1010', '2017-04-14 16:39:36', '0');
INSERT INTO `t_machine_record` VALUES ('1011', '2017-04-14 16:40:36', '0');
INSERT INTO `t_machine_record` VALUES ('1012', '2017-04-14 16:41:36', '0');
INSERT INTO `t_machine_record` VALUES ('1013', '2017-04-14 16:42:36', '0');
INSERT INTO `t_machine_record` VALUES ('1014', '2017-04-14 16:43:36', '0');
INSERT INTO `t_machine_record` VALUES ('1015', '2017-04-14 16:44:41', '0');
INSERT INTO `t_machine_record` VALUES ('1016', '2017-04-14 16:45:41', '0');
INSERT INTO `t_machine_record` VALUES ('1017', '2017-04-14 16:46:41', '0');
INSERT INTO `t_machine_record` VALUES ('1018', '2017-04-14 16:47:41', '0');
INSERT INTO `t_machine_record` VALUES ('1019', '2017-04-14 16:48:59', '0');
INSERT INTO `t_machine_record` VALUES ('1020', '2017-04-14 16:49:59', '0');
INSERT INTO `t_machine_record` VALUES ('1021', '2017-04-14 16:50:59', '0');
INSERT INTO `t_machine_record` VALUES ('1022', '2017-04-14 16:51:59', '0');
INSERT INTO `t_machine_record` VALUES ('1023', '2017-04-14 16:52:59', '0');
INSERT INTO `t_machine_record` VALUES ('1024', '2017-04-14 16:53:59', '0');
INSERT INTO `t_machine_record` VALUES ('1025', '2017-04-14 16:54:59', '0');
INSERT INTO `t_machine_record` VALUES ('1026', '2017-04-14 16:56:02', '0');
INSERT INTO `t_machine_record` VALUES ('1027', '2017-04-14 16:57:02', '0');
INSERT INTO `t_machine_record` VALUES ('1028', '2017-04-14 16:58:02', '0');
INSERT INTO `t_machine_record` VALUES ('1029', '2017-04-14 16:59:02', '0');
INSERT INTO `t_machine_record` VALUES ('1030', '2017-04-14 17:00:02', '0');
INSERT INTO `t_machine_record` VALUES ('1031', '2017-04-14 17:01:37', '0');
INSERT INTO `t_machine_record` VALUES ('1032', '2017-04-14 17:02:37', '0');
INSERT INTO `t_machine_record` VALUES ('1033', '2017-04-14 17:03:37', '0');
INSERT INTO `t_machine_record` VALUES ('1034', '2017-04-14 17:04:37', '0');
INSERT INTO `t_machine_record` VALUES ('1035', '2017-04-14 17:05:37', '0');
INSERT INTO `t_machine_record` VALUES ('1036', '2017-04-14 17:06:37', '0');
INSERT INTO `t_machine_record` VALUES ('1037', '2017-04-14 17:07:37', '0');
INSERT INTO `t_machine_record` VALUES ('1038', '2017-04-14 17:08:37', '0');
INSERT INTO `t_machine_record` VALUES ('1039', '2017-04-14 17:09:37', '0');
INSERT INTO `t_machine_record` VALUES ('1040', '2017-04-14 17:10:37', '0');
INSERT INTO `t_machine_record` VALUES ('1041', '2017-04-14 17:12:17', '0');
INSERT INTO `t_machine_record` VALUES ('1042', '2017-04-14 17:13:43', '0');
INSERT INTO `t_machine_record` VALUES ('1043', '2017-04-14 17:15:35', '0');
INSERT INTO `t_machine_record` VALUES ('1044', '2017-04-14 17:16:35', '0');
INSERT INTO `t_machine_record` VALUES ('1045', '2017-04-14 17:17:35', '0');
INSERT INTO `t_machine_record` VALUES ('1046', '2017-04-14 17:18:35', '0');
INSERT INTO `t_machine_record` VALUES ('1047', '2017-04-14 17:19:35', '0');
INSERT INTO `t_machine_record` VALUES ('1048', '2017-04-14 17:20:35', '0');
INSERT INTO `t_machine_record` VALUES ('1049', '2017-04-14 17:21:50', '0');
INSERT INTO `t_machine_record` VALUES ('1050', '2017-04-14 17:23:28', '0');
INSERT INTO `t_machine_record` VALUES ('1051', '2017-04-14 17:24:28', '0');
INSERT INTO `t_machine_record` VALUES ('1052', '2017-04-14 17:25:28', '0');
INSERT INTO `t_machine_record` VALUES ('1053', '2017-04-14 17:26:28', '0');
INSERT INTO `t_machine_record` VALUES ('1054', '2017-04-14 17:28:07', '0');
INSERT INTO `t_machine_record` VALUES ('1055', '2017-04-14 17:29:07', '0');
INSERT INTO `t_machine_record` VALUES ('1056', '2017-04-14 17:30:36', '0');
INSERT INTO `t_machine_record` VALUES ('1057', '2017-04-14 17:31:27', '0');
INSERT INTO `t_machine_record` VALUES ('1058', '2017-04-14 17:32:27', '0');
INSERT INTO `t_machine_record` VALUES ('1059', '2017-04-14 17:33:27', '0');
INSERT INTO `t_machine_record` VALUES ('1060', '2017-04-14 17:34:27', '0');
INSERT INTO `t_machine_record` VALUES ('1061', '2017-04-14 17:35:27', '0');
INSERT INTO `t_machine_record` VALUES ('1062', '2017-04-14 17:36:27', '0');
INSERT INTO `t_machine_record` VALUES ('1063', '2017-04-14 17:37:27', '0');
INSERT INTO `t_machine_record` VALUES ('1064', '2017-04-14 17:38:27', '0');
INSERT INTO `t_machine_record` VALUES ('1065', '2017-04-14 17:39:36', '0');
INSERT INTO `t_machine_record` VALUES ('1066', '2017-04-14 17:40:36', '0');
INSERT INTO `t_machine_record` VALUES ('1067', '2017-04-19 14:49:01', '0');
INSERT INTO `t_machine_record` VALUES ('1068', '2017-04-19 14:50:01', '0');
INSERT INTO `t_machine_record` VALUES ('1069', '2017-04-21 14:55:44', '0');
INSERT INTO `t_machine_record` VALUES ('1070', '2017-04-21 14:56:44', '0');
INSERT INTO `t_machine_record` VALUES ('1071', '2017-04-21 14:58:38', '0');
INSERT INTO `t_machine_record` VALUES ('1072', '2017-04-21 14:59:38', '0');
INSERT INTO `t_machine_record` VALUES ('1073', '2017-04-21 15:00:38', '0');
INSERT INTO `t_machine_record` VALUES ('1074', '2017-04-21 15:01:38', '0');
INSERT INTO `t_machine_record` VALUES ('1075', '2017-04-21 15:14:13', '0');
INSERT INTO `t_machine_record` VALUES ('1076', '2017-04-21 15:15:13', '0');
INSERT INTO `t_machine_record` VALUES ('1077', '2017-04-21 15:16:47', '0');
INSERT INTO `t_machine_record` VALUES ('1078', '2017-04-21 15:17:47', '0');
INSERT INTO `t_machine_record` VALUES ('1079', '2017-04-21 15:18:47', '0');
INSERT INTO `t_machine_record` VALUES ('1080', '2017-04-21 15:19:47', '0');
INSERT INTO `t_machine_record` VALUES ('1081', '2017-04-21 15:20:47', '0');
INSERT INTO `t_machine_record` VALUES ('1082', '2017-04-21 15:21:47', '0');
INSERT INTO `t_machine_record` VALUES ('1083', '2017-04-21 15:22:47', '0');

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_machine_user
-- ----------------------------
INSERT INTO `t_machine_user` VALUES ('4', null, null, null, 'oCmBsvwBS37C3MjyvwTyvepQL2EA', null, '2017-04-05 16:38:24', '0000016396', null);
INSERT INTO `t_machine_user` VALUES ('5', null, null, null, 'oCmBsv0_cbkml_N5ACG72km88-mc', null, '2017-04-07 17:28:59', null, null);
INSERT INTO `t_machine_user` VALUES ('6', null, null, null, 'oCmBsvwb7YFLtuk02FDj8TezL5ww', null, '2017-04-07 17:29:07', null, null);
INSERT INTO `t_machine_user` VALUES ('7', null, null, null, 'oCmBsv6x40cNiFWeuh6iu85AuHEo', null, '2017-04-07 17:29:17', null, null);

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
INSERT INTO `t_weixin_user` VALUES ('oCmBsv0_cbkml_N5ACG72km88-mc', '付博', '2017-04-07 17:28:59', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/ibRfeUD4CWbReR8Y5ljEH3XzUvxpJsRtibW5meJ3EficJ4zAqicBHz73L7bUNOpWoRynLjae6Z9BWqf0VNqaXQHsCjHkKfdterZd/0', null);
INSERT INTO `t_weixin_user` VALUES ('oCmBsv6x40cNiFWeuh6iu85AuHEo', '免惊', '2017-04-07 17:29:17', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/WDz0b5jMLg6QL0ib3kMcia1IflBU85Bv4BzgjRpYxK7rNENOPsUHz0D8ZGk1opRnjBeOYVrW5jmLnbLOBfjUjo9H9FBegsU9dv/0', null);
INSERT INTO `t_weixin_user` VALUES ('oCmBsvwb7YFLtuk02FDj8TezL5ww', '青盲', '2017-04-07 17:32:38', '1', '', '', '', 'http://wx.qlogo.cn/mmopen/PiajxSqBRaELdXeCHFlf8wpVYVu2nyxzTpXjCf2L4W2DE4NEicriahNAVsSib18J0FSHfymKGcOiagKEyzczIWbxmxQ/0', null);
INSERT INTO `t_weixin_user` VALUES ('oCmBsvwBS37C3MjyvwTyvepQL2EA', 'ahem!', '2017-04-19 14:50:21', '1', '', '', '中国', 'http://wx.qlogo.cn/mmopen/ajNVdqHZLLAP7oXpIAt7WnaV1AjeCUbC6bHuoNAEXLap8iaaxBWTPqFaP0pL8RAFCG5zGPEVSdMx5qaR6HiamHAg/0', null);

-- ----------------------------
-- View structure for `v_bet_record`
-- ----------------------------
DROP VIEW IF EXISTS `v_bet_record`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_bet_record` AS select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_1` AS `fruit_id`,sum(`r`.`bet_score_1`) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` union all select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_2` AS `fruit_id`,sum((`r`.`bet_score_2` * `r`.`bet_multiple`)) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` union all select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_3` AS `fruit_id`,sum(`r`.`bet_score_3`) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` union all select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_4` AS `fruit_id`,sum(`r`.`bet_score_4`) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` union all select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_5` AS `fruit_id`,sum(`r`.`bet_score_5`) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` union all select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_6` AS `fruit_id`,sum(`r`.`bet_score_6`) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` union all select `r`.`record_id` AS `record_id`,`r`.`bet_fruit_id_7` AS `fruit_id`,sum(`r`.`bet_score_7`) AS `sum_score` from `t_machine_bet_record` `r` group by `r`.`record_id`,`fruit_id` ;

-- ----------------------------
-- View structure for `v_bet_statistic`
-- ----------------------------
DROP VIEW IF EXISTS `v_bet_statistic`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_bet_statistic` AS select `t`.`record_id` AS `record_id`,`t`.`fruit_id` AS `fruit_id`,`f`.`cn_name` AS `fruit_name`,sum(`t`.`sum_score`) AS `sum_score`,ifnull((sum(`t`.`sum_score`) * `f`.`fruit_multiple`),0) AS `all_sum` from (`v_bet_record` `t` left join `t_machine_fruit` `f` on((`f`.`id` = `t`.`fruit_id`))) group by `t`.`record_id`,`t`.`fruit_id` order by `t`.`record_id` desc,`t`.`fruit_id` ;
