/*
Navicat MySQL Data Transfer

Source Server         : 119.23.51.148_3306
Source Server Version : 50716
Source Host           : 119.23.51.148:3306
Source Database       : china

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-03-21 14:12:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `cityId` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `provinceId` int(10) unsigned NOT NULL COMMENT '省份编号',
  `cityName` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `cityDescription` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`cityId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '1', '梅州市', '客都之乡、足球之乡。');
INSERT INTO `city` VALUES ('2', '1', '广州市', '花城、羊城之称');
INSERT INTO `city` VALUES ('3', '1', '深圳市', '开放特区');
INSERT INTO `city` VALUES ('4', '1', '珠海市', '近海城市，空气新鲜，寓居城市');

-- ----------------------------
-- Table structure for county
-- ----------------------------
DROP TABLE IF EXISTS `county`;
CREATE TABLE `county` (
  `countyId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cityId` int(11) NOT NULL,
  `countyName` varchar(255) NOT NULL,
  `countyDescription` varchar(255) NOT NULL,
  PRIMARY KEY (`countyId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of county
-- ----------------------------
INSERT INTO `county` VALUES ('1', '1', '梅县区', '梅县区');
INSERT INTO `county` VALUES ('2', '1', '梅江区', '梅江区');
INSERT INTO `county` VALUES ('3', '1', '五华县', '五华县');
INSERT INTO `county` VALUES ('4', '1', '大埔县', '大埔县');
INSERT INTO `county` VALUES ('5', '1', '丰顺县', '丰顺县');

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `provinceId` int(11) NOT NULL AUTO_INCREMENT,
  `nationId` int(11) NOT NULL,
  `provinceName` varchar(255) NOT NULL,
  `provinceDescription` varchar(255) NOT NULL,
  PRIMARY KEY (`provinceId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES ('1', '1', '广东', '中国南大门，新时代广东');
