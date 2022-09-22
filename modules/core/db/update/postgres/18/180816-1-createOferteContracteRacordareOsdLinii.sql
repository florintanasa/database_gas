create table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII (
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
    ID_TARIFE_RACORDARE_FIXE_ID uuid not null,
    DISCOUNT decimal(19, 2),
    ID_TVA_ID uuid not null,
    TVA_TARIF decimal(19, 2) not null,
    TOTAL_TARIF boolean not null,
    --
    primary key (ID)
);
