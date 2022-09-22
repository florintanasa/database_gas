create table GAZ_TVA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COTA_TVA decimal(19, 2) not null,
    DATA_START date not null,
    DATA_STOP date,
    VALABIL boolean not null,
    --
    primary key (ID)
);
