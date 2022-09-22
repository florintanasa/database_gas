alter table GAZ_VERIFICATOR add column ID_NUME_VERIFICATOR_ID uuid ;
alter table GAZ_VERIFICATOR add column DATA_SFARSIT_ATESTAT_VERIFICATOR date ^
update GAZ_VERIFICATOR set DATA_SFARSIT_ATESTAT_VERIFICATOR = current_date where DATA_SFARSIT_ATESTAT_VERIFICATOR is null ;
alter table GAZ_VERIFICATOR alter column DATA_SFARSIT_ATESTAT_VERIFICATOR set not null ;
alter table GAZ_VERIFICATOR add column ID_LOCATII_ID uuid ;
alter table GAZ_VERIFICATOR add column ID_TELEFOANE_ID uuid ;
alter table GAZ_VERIFICATOR add column ID_FAX_ID uuid ;
alter table GAZ_VERIFICATOR add column ID_EMAIL_ID uuid ;
alter table GAZ_VERIFICATOR add column ACTIV boolean ;
