create table GAZ_NOTIFICARE_OSD_ATR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NRINREG integer not null,
    DATAINREG date not null,
    ID_PARTENERI_ID uuid not null,
    ID_CI_CIF_ID uuid not null,
    LOCATIA_1_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    ID_TELEFOANE varchar(255),
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    ID_SOCIETATI_PROIECTARE_ID uuid,
    ID_VERIFICATOR_ID uuid,
    ID_SOCIETATI_EXECUTIE_ID uuid,
    --
    primary key (ID)
);
