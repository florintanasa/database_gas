create table GAZ_BANCI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEN_UZUALA varchar(25) not null,
    DEN_COMPLETA varchar(255) not null,
    --
    primary key (ID)
);
