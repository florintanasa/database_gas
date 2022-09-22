-- alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_SIRUTA_ID uuid ^
-- update GAZ_CONTRACTE_RACORDARE_SD set ID_SIRUTA_ID = <default_value> ;
-- alter table GAZ_CONTRACTE_RACORDARE_SD alter column ID_SIRUTA_ID set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_SIRUTA_ID uuid not null ;
