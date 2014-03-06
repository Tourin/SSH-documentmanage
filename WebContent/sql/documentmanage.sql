/*
Navicat MySQL Data Transfer

Source Server         : loacl
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : documentmanage

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2014-03-06 22:17:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `info_admin`
-- ----------------------------
DROP TABLE IF EXISTS `info_admin`;
CREATE TABLE `info_admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(32) DEFAULT NULL,
  `rname` varchar(20) DEFAULT NULL,
  `nname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_admin
-- ----------------------------
INSERT INTO `info_admin` VALUES ('1', '1', 'c4ca4238a0b923820dcc509a6f75849b', 'tt', 'tt');

-- ----------------------------
-- Table structure for `info_author`
-- ----------------------------
DROP TABLE IF EXISTS `info_author`;
CREATE TABLE `info_author` (
  `author_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `IDCard` varchar(20) DEFAULT NULL,
  `school` varchar(20) DEFAULT NULL,
  `specialty` varchar(20) DEFAULT NULL,
  `educational` varchar(10) DEFAULT NULL,
  `introduction` text,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_author
-- ----------------------------
INSERT INTO `info_author` VALUES ('1', 'tt', '123', '1233333222222222', '', 'dd', '本科', 'dd');
INSERT INTO `info_author` VALUES ('2', 'test', '1', '1233333222222222', '', '', '大专', '');
INSERT INTO `info_author` VALUES ('3', 'test', '1', '2222222222222222222', '', '', '大专', '');
INSERT INTO `info_author` VALUES ('4', '1', '1', '510322199125369090', '1', '啊啊', '大专', '啊啊啊');
INSERT INTO `info_author` VALUES ('5', '啊', '20', '510322199236030012', '大学', '计算机', '大专', '啊');

-- ----------------------------
-- Table structure for `info_comment`
-- ----------------------------
DROP TABLE IF EXISTS `info_comment`;
CREATE TABLE `info_comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `info` varchar(100) DEFAULT NULL,
  `thesis_id` int(11) DEFAULT NULL,
  `periodical_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `fk_info_comment_1` (`thesis_id`),
  KEY `fk_info_comment_2` (`periodical_id`),
  KEY `fk_info_comment_3` (`user_id`),
  KEY `fk_info_comment_4` (`admin_id`),
  CONSTRAINT `fk_info_comment_1` FOREIGN KEY (`thesis_id`) REFERENCES `info_thesis` (`thesis_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_info_comment_2` FOREIGN KEY (`periodical_id`) REFERENCES `info_periodical` (`periodical_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_info_comment_3` FOREIGN KEY (`user_id`) REFERENCES `info_user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_info_comment_4` FOREIGN KEY (`admin_id`) REFERENCES `info_admin` (`admin_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_comment
-- ----------------------------
INSERT INTO `info_comment` VALUES ('4', 'te', '7', null, '4', null, '2014-03-04 20:07:28');
INSERT INTO `info_comment` VALUES ('5', 'te', '8', null, '4', null, '2014-03-04 20:07:37');
INSERT INTO `info_comment` VALUES ('6', 'ssss', '8', null, '4', null, '2014-03-04 20:07:40');
INSERT INTO `info_comment` VALUES ('7', 'aa', '8', null, null, '1', '2014-03-04 20:25:49');
INSERT INTO `info_comment` VALUES ('9', '你好', '12', null, null, '1', '2014-03-04 20:28:59');
INSERT INTO `info_comment` VALUES ('10', 'cc', null, '4', null, '1', '2014-03-04 20:43:27');
INSERT INTO `info_comment` VALUES ('11', 'aa', '7', null, '4', null, '2014-03-04 21:21:25');
INSERT INTO `info_comment` VALUES ('12', 'aa', '7', null, '4', null, '2014-03-04 21:21:26');
INSERT INTO `info_comment` VALUES ('13', 'ee', '7', null, '4', null, '2014-03-04 21:21:28');
INSERT INTO `info_comment` VALUES ('14', 'ee', '7', null, '4', null, '2014-03-04 21:21:29');
INSERT INTO `info_comment` VALUES ('15', 'ff', '7', null, '4', null, '2014-03-04 21:21:31');
INSERT INTO `info_comment` VALUES ('16', 'aa', '7', null, '4', null, '2014-03-04 21:21:32');
INSERT INTO `info_comment` VALUES ('17', 'ee', '7', null, '4', null, '2014-03-04 21:21:33');
INSERT INTO `info_comment` VALUES ('18', 'ff', '7', null, '4', null, '2014-03-04 21:21:35');
INSERT INTO `info_comment` VALUES ('19', 'ee', '7', null, '4', null, '2014-03-04 21:21:38');
INSERT INTO `info_comment` VALUES ('20', 'h', '7', null, '4', null, '2014-03-04 21:21:41');
INSERT INTO `info_comment` VALUES ('21', 'a', '7', null, '4', null, '2014-03-04 21:21:44');
INSERT INTO `info_comment` VALUES ('22', 'hr', '7', null, '4', null, '2014-03-04 21:21:46');
INSERT INTO `info_comment` VALUES ('23', 'hr', '7', null, '4', null, '2014-03-04 21:21:49');
INSERT INTO `info_comment` VALUES ('24', 'hr', '7', null, '4', null, '2014-03-04 21:21:51');
INSERT INTO `info_comment` VALUES ('25', 'a', '7', null, '4', null, '2014-03-04 21:21:54');
INSERT INTO `info_comment` VALUES ('26', 'e', '7', null, '4', null, '2014-03-04 21:22:03');
INSERT INTO `info_comment` VALUES ('27', 'aa', '10', null, '4', null, '2014-03-05 20:42:19');

-- ----------------------------
-- Table structure for `info_periodical`
-- ----------------------------
DROP TABLE IF EXISTS `info_periodical`;
CREATE TABLE `info_periodical` (
  `periodical_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `path` text,
  `unit_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`periodical_id`),
  KEY `fk_info_periodical_1` (`unit_id`),
  CONSTRAINT `fk_info_periodical_1` FOREIGN KEY (`unit_id`) REFERENCES `info_unit` (`unit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_periodical
-- ----------------------------
INSERT INTO `info_periodical` VALUES ('4', 'tt', '1', 'tt', '/doc/2014/03/04/43de1792-2d4c-452d-8674-c808ecec0dfa.doc', '2');

-- ----------------------------
-- Table structure for `info_thesis`
-- ----------------------------
DROP TABLE IF EXISTS `info_thesis`;
CREATE TABLE `info_thesis` (
  `thesis_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL,
  `specialty` varchar(50) DEFAULT NULL,
  `educational` varchar(20) DEFAULT NULL,
  `path` text,
  `author_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`thesis_id`),
  KEY `fk_info_thesis_1` (`author_id`),
  CONSTRAINT `fk_info_thesis_1` FOREIGN KEY (`author_id`) REFERENCES `info_author` (`author_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_thesis
-- ----------------------------
INSERT INTO `info_thesis` VALUES ('7', '计算机', '计算机', '学士', '/doc/2014/03/03/fe81edb2-8b42-4e50-8845-fab4c722c45a.doc', '2');
INSERT INTO `info_thesis` VALUES ('8', 'test', 'test', '硕士', '/doc/2014/03/03/ce0ae983-cf43-4c4c-96d1-d96878dc4a13.doc', '1');
INSERT INTO `info_thesis` VALUES ('10', 'test', 'test', '硕士', '/doc/2014/03/03/f7357394-a157-4109-88f3-a1847a7f6215.doc', '1');
INSERT INTO `info_thesis` VALUES ('12', 'hh', 'hh', '学士', '/doc/2014/03/04/8562d420-c02b-40c5-9771-299bb50f9741.doc', '3');
INSERT INTO `info_thesis` VALUES ('13', '啊的论文', '计算机', '学士', '/doc/2014/03/05/9667a44e-19b4-4f4f-b402-979971b61ab7.docx', '5');
INSERT INTO `info_thesis` VALUES ('14', '啊的论文2', '计算机', '学士', '/doc/2014/03/06/07abf60f-e09e-479e-97a8-a634e7bd2aa8.docx', '5');
INSERT INTO `info_thesis` VALUES ('15', '2', '2', '学士', '/doc/2014/03/06/test1394114881774.doc', '1');
INSERT INTO `info_thesis` VALUES ('16', '啊的论文3', '计算机', '学士', '/doc/2014/03/06/需求分析1394115020726.docx', '5');

-- ----------------------------
-- Table structure for `info_unit`
-- ----------------------------
DROP TABLE IF EXISTS `info_unit`;
CREATE TABLE `info_unit` (
  `unit_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `scale` int(11) DEFAULT NULL,
  `industry` varchar(50) DEFAULT NULL,
  `introduction` text,
  PRIMARY KEY (`unit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_unit
-- ----------------------------
INSERT INTO `info_unit` VALUES ('2', 'test', '100', 'aa', 'aa');

-- ----------------------------
-- Table structure for `info_user`
-- ----------------------------
DROP TABLE IF EXISTS `info_user`;
CREATE TABLE `info_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(32) DEFAULT NULL,
  `rname` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `IDCard` varchar(20) DEFAULT NULL,
  `school` varchar(45) DEFAULT NULL,
  `pecialty` varchar(20) DEFAULT NULL,
  `educational` varchar(10) DEFAULT NULL,
  `per` varchar(20) DEFAULT NULL,
  `introduction` text,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_user
-- ----------------------------
INSERT INTO `info_user` VALUES ('4', '1', 'c4ca4238a0b923820dcc509a6f75849b', 'tourin', '1', '22222222222222234', 'XXXXXXXXX', 'test', '硕士', '', 'test.ee');
INSERT INTO `info_user` VALUES ('5', '2', 'c4ca4238a0b923820dcc509a6f75849b', '2', '2', '2', '2', '2', '大专', null, '2');
INSERT INTO `info_user` VALUES ('6', '3', 'c4ca4238a0b923820dcc509a6f75849b', '1', '1', '1212123123123123', '', '', '大专', null, '');
INSERT INTO `info_user` VALUES ('7', 'q', '7694f4a66316e53c8cdd9d9954bd611d', '123123', '123', '12312312312311231', '', '', '大专', null, '');
