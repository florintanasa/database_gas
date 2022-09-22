update GAZ_INSTALATORI_OSD set ACTIV = false where ACTIV is null ;
alter table GAZ_INSTALATORI_OSD alter column ACTIV set not null ;
