DROP TABLE IF EXISTS `contact_info`;

CREATE TABLE `contact_info` (

  `id`              BIGINT(20) NOT NULL AUTO_INCREMENT,
  `address`         VARCHAR(255) DEFAULT NULL,
  `email`           VARCHAR(255) DEFAULT NULL,
  `phone`           VARCHAR(255) DEFAULT NULL,
  `city_code`       BIGINT(20) DEFAULT NULL,

  PRIMARY KEY (`id`),

  CONSTRAINT `contact_info_ibfk_1` FOREIGN KEY (`city_code`) REFERENCES `city` (`zip_code`) ON UPDATE CASCADE

) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

INSERT INTO `contact_info`
	(`id`, `address`, `email`, `phone`, `city_code`)
VALUES
	(1, 'Ul Vojislava Ilica 107', 'milovan.petrovic@proba.net', '+381 88 1234567', 11000),
	(2, 'Ul Aleksandra Belica 18', 'dragan.milovanovic@proba.net', '+381 83 623456', 18000),
        (3, 'Bulevar Mihajla Pupina', 'dalibor.lazic@proba.net', '+381 81 2234577', 21000),
        (4, 'Ul Vrsacka 24', 'jelisaveta22@proba.net', '+381 84 1234567', 37000),  
        (5, 'Ul Balkanska 45', 'boba.j@proba.net', '+381 88 7234567', 34000),  
        (6, 'Ul Vojvodjanskih brigada 48', 'dragana.vel@proba.net', '+381 88 8234567', 36000),  
        (7, 'Ul Vojvode Misica 11', 'grandanta@proba.net', '+381 88 9234567', 11000),  
        (8, 'Ul Branka Bjegovica 81', 'bora.daba@proba.net', '+381 88 0234567', 18000),  
        (9, 'Ul Maksima Gorkog 22', 'zare2323@proba.net', '+381 83 1234567', 15000),  
        (10, 'Ul Vojvode Stepe 14', 'stole011@proba.net', '+381 84 1234567', 14000),  
        (11, 'Ul Belotinacka 15', 'ema.rad123@proba.net', '+381 86 1234567', 18000),  
	(12, 'Ul Uspenska 68', 'nata123@proba.net', '+381 85 1234567', 21000);



