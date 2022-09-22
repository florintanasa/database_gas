create table GAZ_SOCIETATI_EXECUTIE (
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
    TIP_AUT_SOCIETATE_EXECUTIE varchar(10) not null,
    NR_AUT_SOCIETATE_EXECUTIE integer not null,
    DATA_START_AUT_SOCIETATE_EXECUTIE date not null,
    DATA_STOP_AUT_SOCIETATE_EXECUTIE date not null,
    ID_LOCATII_ID uuid not null,
    ID_TELEFOANE_ID uuid not null,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid not null,
    ACTIV boolean not null,
    --
    primary key (ID)
);
