update GAZ_ACORD_ACCES set ACTIV = false where ACTIV is null ;
alter table GAZ_ACORD_ACCES alter column ACTIV set not null ;
