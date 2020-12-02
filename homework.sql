CREATE TABLE `area` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `area_name` varchar(45) NOT NULL,
  `id_countries` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_countries_area_id_idx` (`id_countries`),
  CONSTRAINT `fk_countries_area_id` FOREIGN KEY (`id_countries`) REFERENCES `countries` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM countries.region;

CREATE TABLE `city` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `city_name` varchar(45) NOT NULL DEFAULT 'Village',
  `area_id` int unsigned NOT NULL,
  `region_id` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_city_area_id_idx` (`area_id`),
  KEY `fk_city_region_id_idx` (`region_id`),
  CONSTRAINT `fk_city_area_id` FOREIGN KEY (`area_id`) REFERENCES `area` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_city_region_id` FOREIGN KEY (`region_id`) REFERENCES `region` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `countries` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `country_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `region` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `region_name` varchar(45) DEFAULT NULL,
  `area_id` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_region_area_id_idx` (`area_id`),
  CONSTRAINT `fk_region_area_id` FOREIGN KEY (`area_id`) REFERENCES `area` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
