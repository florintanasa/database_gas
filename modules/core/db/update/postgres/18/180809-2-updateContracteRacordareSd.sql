-- alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_CI_CIF_ID uuid ^
-- update GAZ_CONTRACTE_RACORDARE_SD set ID_CI_CIF_ID = <default_value> ;
-- alter table GAZ_CONTRACTE_RACORDARE_SD alter column ID_CI_CIF_ID set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_CI_CIF_ID uuid not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_TELEFOANE_ID uuid ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_CONTURI_BANCARE_PARTENERI_ID uuid ;
-- alter table GAZ_CONTRACTE_RACORDARE_SD add column LOCATIA_2_ID uuid ^
-- update GAZ_CONTRACTE_RACORDARE_SD set LOCATIA_2_ID = <default_value> ;
-- alter table GAZ_CONTRACTE_RACORDARE_SD alter column LOCATIA_2_ID set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column LOCATIA_2_ID uuid not null ;
-- alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_ACORD_TEHNIC_RACORDARE_ID uuid ^
-- update GAZ_CONTRACTE_RACORDARE_SD set ID_ACORD_TEHNIC_RACORDARE_ID = <default_value> ;
-- alter table GAZ_CONTRACTE_RACORDARE_SD alter column ID_ACORD_TEHNIC_RACORDARE_ID set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_ACORD_TEHNIC_RACORDARE_ID uuid not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column PREL_DOCUMENTE boolean ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column OBT_AVIZ_CU_AC boolean ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column PRO_EXEC_RAC boolean ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column VERIF_PROIECT boolean ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column URM_LUC_EXE_RAC boolean ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column REC_PIF boolean ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column DURATA_CONTRACT decimal(3, 2) ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column PREL_CONTRACT decimal(3, 2) ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ID_NOTIFICARE_OSD_ATR_ID uuid ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column PROC_GARANTIE decimal(3, 2) ^
update GAZ_CONTRACTE_RACORDARE_SD set PROC_GARANTIE = 0 where PROC_GARANTIE is null ;
alter table GAZ_CONTRACTE_RACORDARE_SD alter column PROC_GARANTIE set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column TARIF_RACORDARE decimal(19, 2) ^
update GAZ_CONTRACTE_RACORDARE_SD set TARIF_RACORDARE = 0 where TARIF_RACORDARE is null ;
alter table GAZ_CONTRACTE_RACORDARE_SD alter column TARIF_RACORDARE set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ZILE_PLATA_TARIF integer ^
update GAZ_CONTRACTE_RACORDARE_SD set ZILE_PLATA_TARIF = 0 where ZILE_PLATA_TARIF is null ;
alter table GAZ_CONTRACTE_RACORDARE_SD alter column ZILE_PLATA_TARIF set not null ;
alter table GAZ_CONTRACTE_RACORDARE_SD add column ZILE_NOTIF_REZ integer ^
update GAZ_CONTRACTE_RACORDARE_SD set ZILE_NOTIF_REZ = 0 where ZILE_NOTIF_REZ is null ;
alter table GAZ_CONTRACTE_RACORDARE_SD alter column ZILE_NOTIF_REZ set not null ;
