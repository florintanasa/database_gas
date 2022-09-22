create table GAZ_OFERTE_CONTRACTE_RACORDARE_SD (
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
    NRINREG varchar(255) not null,
    DATAINREG date not null,
    ID_PARTENERI_ID uuid not null,
    ID_CI_CIF_ID uuid not null,
    LOCATIA_1_ID uuid not null,
    ID_TELEFOANE_ID uuid,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid,
    LOCATIA_2_ID uuid not null,
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    PREL_DOCUMENTE boolean,
    OBT_AVIZ_CU_AC boolean,
    PRO_EXEC_RAC boolean,
    VERIF_PROIECT boolean,
    URM_LUC_EXE_RAC boolean,
    REC_PIF boolean,
    DURATA_CONTRACT decimal(5, 2) not null,
    PREL_CONTRACT decimal(5, 2) not null,
    PROC_GARANTIE decimal(5, 2) not null,
    TARIF_RACORDARE decimal(19, 2) not null,
    ZILE_PLATA_TARIF integer not null,
    ZILE_NOTIF_REZ integer not null,
    --
    primary key (ID)
);