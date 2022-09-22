-- update GAZ_INSTALATORI_OSD set ID_SIRUTA_ID = <default_value> where ID_SIRUTA_ID is null ;
alter table GAZ_INSTALATORI_OSD alter column ID_SIRUTA_ID set not null ;
