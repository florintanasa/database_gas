create table GAZ_CONTRACTE_RACORDARE_SD (
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
    LOCATIA_1_ID uuid not null,
    --
    primary key (ID)
);
