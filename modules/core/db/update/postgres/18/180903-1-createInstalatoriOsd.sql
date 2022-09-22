create table GAZ_INSTALATORI_OSD (
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
    TIP_AUTORIZATIE varchar(10) not null,
    NR_AUTORIZATIE integer not null,
    DATA_START_AUTORIZATIE date not null,
    DATA_STOP_AUTORIZATIE date not null,
    ACTIV boolean,
    --
    primary key (ID)
);
