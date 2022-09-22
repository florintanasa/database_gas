-- update GAZ_COMP_TARIF_NOTIFICARE set ID_SIRUTA_ID = <default_value> where ID_SIRUTA_ID is null ;
alter table GAZ_COMP_TARIF_NOTIFICARE alter column ID_SIRUTA_ID set not null ;
