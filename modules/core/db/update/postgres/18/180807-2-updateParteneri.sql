-- update GAZ_PARTENERI set ID_TIP_PERSOANA_ID = <default_value> where ID_TIP_PERSOANA_ID is null ;
alter table GAZ_PARTENERI alter column ID_TIP_PERSOANA_ID set not null ;
