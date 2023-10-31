CREATE DATABASE  IF NOT EXISTS `airline` ;
USE `airline`;

DROP TABLE IF EXISTS `tbl_flight`;
CREATE TABLE `tbl_flight` (
                                `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
                                `start` varchar(100) CHARACTER SET utf8mb4  DEFAULT NULL COMMENT '出发地',
                                `end` varchar(100) CHARACTER SET utf8mb4  DEFAULT NULL COMMENT '目的地',
				                `date` datetime DEFAULT NULL COMMENT '出发时间',
				                `price` int DEFAULT NULL COMMENT '价格',
                                `start_time` datetime DEFAULT NULL COMMENT '出发时间',
                                `end_time` datetime DEFAULT NULL COMMENT '到达时间',
                                `number` int UNSIGNED NOT NULL DEFAULT '1' COMMENT '剩余座位数',
                                `company` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '航空公司',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='航班表';

DROP TABLE IF EXISTS `tbl_ticket`;
CREATE TABLE `tbl_ticket` (
                          `id` bigint NOT NULL AUTO_INCREMENT COMMENT '订单id',
                          `flight_id` bigint  COMMENT '航班id',
			              `user_id` bigint  COMMENT '乘客id',
                          `seat_preference` bigint COMMENT '座位偏好',
                          `true_name` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '乘客姓名',
			              `phone` varchar(11) COLLATE utf8_bin NOT NULL COMMENT '手机号',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='购票信息表';


DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
                          `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
                          `true_name` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '真实姓名',
                          `user_name` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '用户名',
                          `password` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '密码',
                          `phone` varchar(11) COLLATE utf8_bin NOT NULL COMMENT '手机号',
			              `money` int(11) UNSIGNED NULL DEFAULT 0 COMMENT '账户余额',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='用户表';



INSERT INTO tbl_user (true_name,user_name,password,phone)
VALUES ('张三', 'admin', '123456', '123456');

insert INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
values('武汉','北京','2023-10-26',500,'2023-10-26 20:00:00','2023-10-26 23:00:00',50,'中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('上海', '北京', '2023-10-26', 600, '2023-10-26 08:00:00', '2023-10-26 11:00:00', 50, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('广州', '深圳', '2023-10-26', 300, '2023-10-26 12:00:00', '2023-10-26 14:00:00', 100, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('北京', '上海', '2023-10-26', 550, '2023-10-26 09:00:00', '2023-10-26 12:00:00', 75, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('北京', '广州', '2023-10-27', 800, '2023-10-27 10:00:00', '2023-10-27 13:00:00', 60, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('上海', '深圳', '2023-10-28', 400, '2023-10-28 16:00:00', '2023-10-28 18:00:00', 90, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('广州', '北京', '2023-10-29', 550, '2023-10-29 11:00:00', '2023-10-29 14:00:00', 70, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('北京', '广州', '2023-10-31', 700, '2023-10-31 12:00:00', '2023-10-31 15:00:00', 80, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('上海', '深圳', '2023-11-01', 450, '2023-11-01 18:00:00', '2023-11-01 20:00:00', 100, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('深圳', '上海', '2023-11-03', 550, '2023-11-03 19:00:00', '2023-11-03 21:00:00', 95, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('北京', '广州', '2023-11-04', 750, '2023-11-04 14:00:00', '2023-11-04 17:00:00', 75, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('上海', '深圳', '2023-11-05', 500, '2023-11-05 20:00:00', '2023-11-05 22:00:00', 105, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('广州', '北京', '2023-11-06', 650, '2023-11-06 15:00:00', '2023-11-06 18:00:00', 80, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('北京', '广州', '2023-11-08', 800, '2023-11-08 16:00:00', '2023-11-08 19:00:00', 70, '中国民航');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('武汉', '北京', '2023-10-01', 500, '2023-10-01 20:00:00', '2023-10-01 23:00:00', 50, '中国航空');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('武汉', '北京', '2023-10-02', 550, '2023-10-02 19:30:00', '2023-10-02 22:30:00', 60, '中国航空');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('武汉', '北京', '2023-10-04', 650, '2023-10-04 17:30:00', '2023-10-04 20:30:00', 80, '中国航空');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('成都', '北京', '2023-10-08', 850, '2023-10-08 13:30:00', '2023-10-08 16:30:00', 120, '中国航空');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('呼和浩特', '北京', '2023-10-09', 900, '2023-10-09 12:00:00', '2023-10-09 15:00:00', 130, '中国航空');
INSERT INTO tbl_flight (start, end, date, price, start_time, end_time, number, company)
VALUES ('武汉', '成都', '2023-10-10', 950, '2023-10-10 11:30:00', '2023-10-10 14:30:00', 140, '中国航空');