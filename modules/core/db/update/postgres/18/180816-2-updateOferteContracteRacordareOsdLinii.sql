alter table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII rename column total_tarif to total_tarif__u55489 ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII alter column total_tarif__u55489 drop not null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII add column TOTAL_TARIF decimal(19, 2) ^
update GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII set TOTAL_TARIF = 0 where TOTAL_TARIF is null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII alter column TOTAL_TARIF set not null ;
