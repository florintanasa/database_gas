alter table GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII add column TVA_TARIF decimal(19, 2) ^
update GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII set TVA_TARIF = 0 where TVA_TARIF is null ;
alter table GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII alter column TVA_TARIF set not null ;
