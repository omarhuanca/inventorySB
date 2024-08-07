/* **********************************************
 * SEQUENCES                                    *
 ************************************************/

CREATE SEQUENCE ln_seq;
CREATE SEQUENCE ntp_seq;
CREATE SEQUENCE ms_seq;

/*==============================================================*/
/* Table: Line                                                  */
/* Module: Line (LN)                 .                          */
/*==============================================================*/
CREATE TABLE ln_line (
    ln_id       BIGINT      NOT NULL,
    ln_name     VARCHAR(45) NOT NULL
);

ALTER TABLE ln_line
    ALTER COLUMN    ln_id       SET DEFAULT nextval('ln_seq'),
    ADD CONSTRAINT  pk_ln_id    PRIMARY KEY(ln_id);

CREATE TABLE ntp_not_provided_provider (
    ntp_id          BIGINT          NOT NULL,
    ntp_code        VARCHAR(45)     NOT NULL,
    ntp_description VARCHAR(100)    NOT NULL,
    ntp_ln_id       BIGINT          NOT NULL
);

ALTER TABLE ntp_not_provided_provider
    ALTER COLUMN    ntp_id          SET DEFAULT nextval('ntp_seq'),
    ADD CONSTRAINT  pk_ntp_id       PRIMARY KEY(ntp_id),
    ADD CONSTRAINT  fk_ntp_ln_id    FOREIGN KEY(ntp_ln_id) REFERENCES ln_line(ln_id) ON UPDATE CASCADE ON DELETE CASCADE;

CREATE TABLE ms_measurement (
    ms_id       BIGINT          NOT NULL,
    ms_code     VARCHAR(45)     NOT NULL
);

ALTER TABLE ms_measurement
    ALTER COLUMN    ms_id       SET DEFAULT nextval('ms_seq'),
    ADD CONSTRAINT  pk_ms_id    PRIMARY KEY(ms_id);
