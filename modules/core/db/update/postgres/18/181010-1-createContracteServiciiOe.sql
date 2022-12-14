create table GAZ_CONTRACTE_SERVICII_OE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    NRINREG integer not null,
    DATAINREG date not null,
    ID_SOCIETATI_PROIECTARE_ID uuid,
    ID_VERIFICATOR_ID uuid,
    ID_SOCIETATI_EXECUTIE_ID uuid,
    ID_NOTIFICARE_OSD_ATR_ID uuid not null,
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    DURATA_CONTRACT integer not null,
    ZILE_REP_GARANTIE integer not null,
    PROC_ELIB_GARANTIE1 decimal(5, 2) not null,
    PROC_ELIB_GARANTIE2 decimal(5, 2) not null,
    TARIF_PROIECTARE date,
    DATA_TERM_PROIECT date,
    TARIF_VERIFICARE decimal(19, 2),
    DATA_TERM_VERIFCARE date,
    TARIF_EXECUTIE decimal(19, 2),
    DATA_TERM_EXE date,
    --
    primary key (ID)
);
