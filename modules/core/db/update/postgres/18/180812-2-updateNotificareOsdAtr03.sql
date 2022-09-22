-- update GAZ_NOTIFICARE_OSD_ATR set ID_SIRUTA_ID = <default_value> where ID_SIRUTA_ID is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column ID_SIRUTA_ID set not null ;
