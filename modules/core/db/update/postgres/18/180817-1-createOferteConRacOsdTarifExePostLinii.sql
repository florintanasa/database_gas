create table GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_OFERTE_CONTRACTE_RACORDARE_SD_ID uuid not null,
    ID_TARIFE_EXECUTIE_POSTURI_ID uuid not null,
    DISCOUNT decimal(19, 2) not null,
    BUC_ML decimal(19, 2) not null,
    TARIF_D decimal(19, 2) not null,
    ID_TVA_ID uuid not null,
    TOTAL_TARIF decimal(19, 2) not null,
    --
    primary key (ID)
);
