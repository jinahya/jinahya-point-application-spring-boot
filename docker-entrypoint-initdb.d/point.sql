CREATE TABLE IF NOT EXISTS `point`.`point_client`
(
    `id_`        INT          NOT NULL,
    `created_at` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `id`         VARCHAR(255) NOT NULL COMMENT 'A virtual column of payload$pointClientId',
    `payload`    JSON         NOT NULL,
    PRIMARY KEY (`id_`),
    INDEX `created_at_idx` (`created_at` ASC) VISIBLE,
    INDEX `updated_at_idx` (`updated_at` ASC) VISIBLE,
    UNIQUE INDEX `point_client_id_UNIQUE` (`id` ASC) VISIBLE
) ENGINE = InnoDB
;
