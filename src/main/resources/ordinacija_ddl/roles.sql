DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (

  `app_user`       BIGINT(20) NOT NULL,
  `roles`          VARCHAR(255) DEFAULT NULL,

  CONSTRAINT `roles_ibfk_1` FOREIGN KEY (`app_user`) REFERENCES `app_user` (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO  `roles`
        (`app_user`, `roles`)
VALUES
        (1, 'ADMIN'),
        (1, 'DOCTOR'),
        (1, 'NURSE'),
        (2, 'DOCTOR'),
        (2, 'NURSE'),
        (3, 'DOCTOR'),
        (3, 'NURSE'),
        (4, 'DOCTOR'),
        (4, 'NURSE'),
        (5, 'NURSE'),
        (6, 'NURSE'),
        (7, 'NURSE');
