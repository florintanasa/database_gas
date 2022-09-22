create table GAZ_DOC_ANEX_CER_RAC (
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
    ID_TIP_DOCUMENTE_ID uuid not null,
    FISIER_DOCUMENT bytea,
    --
    primary key (ID)
);
