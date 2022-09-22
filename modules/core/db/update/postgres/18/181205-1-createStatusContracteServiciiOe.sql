create table GAZ_STATUS_CONTRACTE_SERVICII_OE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NR_ORD integer not null,
    STARE_CONTRACTE_SERVICII_OE varchar(255) not null,
    EXPLICATII varchar(255) not null,
    ACTIV varchar(255) not null,
    --
    primary key (ID)
);
