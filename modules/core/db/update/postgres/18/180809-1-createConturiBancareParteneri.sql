create table GAZ_CONTURI_BANCARE_PARTENERI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    IBAN varchar(24) not null,
    ID_BANCI_ID uuid not null,
    --
    primary key (ID)
);
