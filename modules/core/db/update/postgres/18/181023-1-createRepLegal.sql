create table GAZ_REP_LEGAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CALITATE_REP_LEGAL varchar(255) not null,
    --
    primary key (ID)
);
