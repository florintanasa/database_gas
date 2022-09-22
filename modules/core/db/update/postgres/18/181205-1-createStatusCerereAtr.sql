create table GAZ_STATUS_CERERE_ATR (
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
    STARE_CERERE_ATR varchar(255) not null,
    EXPLICATII varchar(255) not null,
    ACTIV boolean not null,
    --
    primary key (ID)
);
