create table GAZ_APARATE_SOLICITATE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_CERERI_RACORDARE_ID uuid not null,
    ID_APARATE_ID uuid not null,
    NRBUC integer not null,
    --
    primary key (ID)
);
