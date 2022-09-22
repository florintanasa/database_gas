create table GAZ_TARIFE_EXECUTIE_BRANSAMENTE (
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
    TIP_TARIF varchar(5) not null,
    DEN_TARIF varchar(255) not null,
    ID_DIAM_PE_ID uuid,
    ID_DIAM_OL_ID uuid,
    TARIF decimal(19, 2) not null,
    DATA_START date not null,
    DATA_STOP date,
    ACTIV boolean,
    EXPLICATII varchar(255),
    --
    primary key (ID)
);
