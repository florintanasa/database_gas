create table GAZ_COMP_TARIF_NOTIFICARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEN_TARIF varchar(255) not null,
    EXPLICATII varchar(255),
    --
    primary key (ID)
);
