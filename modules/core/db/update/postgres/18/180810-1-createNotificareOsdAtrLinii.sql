create table GAZ_NOTIFICARE_OSD_ATR_LINII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_NOTIFICARE_OSD_ATR_ID uuid not null,
    ID_DEN_TARIF_ID uuid not null,
    PRET_TARIF decimal(19, 2) not null,
    ID_COTA_TVA_ID uuid not null,
    TVA_TARIF decimal(19, 2) not null,
    PRET_TARIF_TVA decimal(19, 2) not null,
    --
    primary key (ID)
);
