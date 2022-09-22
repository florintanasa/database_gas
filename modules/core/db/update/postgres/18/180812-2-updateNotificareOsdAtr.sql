alter table GAZ_NOTIFICARE_OSD_ATR add column TOTAL_PRET_TARIF decimal(19, 2) ^
update GAZ_NOTIFICARE_OSD_ATR set TOTAL_PRET_TARIF = 0 where TOTAL_PRET_TARIF is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column TOTAL_PRET_TARIF set not null ;
alter table GAZ_NOTIFICARE_OSD_ATR add column TOTAL_TVA decimal(19, 2) ^
update GAZ_NOTIFICARE_OSD_ATR set TOTAL_TVA = 0 where TOTAL_TVA is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column TOTAL_TVA set not null ;
alter table GAZ_NOTIFICARE_OSD_ATR add column TOTAL_PRET_TARIF_TVA decimal(19, 2) ^
update GAZ_NOTIFICARE_OSD_ATR set TOTAL_PRET_TARIF_TVA = 0 where TOTAL_PRET_TARIF_TVA is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column TOTAL_PRET_TARIF_TVA set not null ;
