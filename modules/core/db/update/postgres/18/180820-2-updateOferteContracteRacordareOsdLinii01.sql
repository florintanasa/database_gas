update GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII set TARIF_D = 0 where TARIF_D is null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII alter column TARIF_D set not null ;
