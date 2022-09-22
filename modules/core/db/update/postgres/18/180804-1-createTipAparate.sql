create table GAZ_TIP_APARATE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENUMIRE varchar(255) not null,
    DEBIT decimal(6, 2) not null,
    --
    primary key (ID)
);