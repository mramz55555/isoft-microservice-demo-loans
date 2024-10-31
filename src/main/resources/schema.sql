CREATE TABLE IF NOT EXISTS `loan`
(
    `id`                 int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `mobile_number`      varchar(15)     NOT NULL,
    `loan_number`        varchar(100)    NOT NULL,
    `loan_type`          varchar(100)    NOT NULL,
    `total_loan`         int             NOT NULL,
    `amount_paid`        int             NOT NULL,
    `outstanding_amount` int             NOT NULL,
    `created_date`       date            NOT NULL,
    `created_user`       varchar(20)     NOT NULL,
    `updated_date`       date        DEFAULT NULL,
    `updated_user`       varchar(20) DEFAULT NULL
);