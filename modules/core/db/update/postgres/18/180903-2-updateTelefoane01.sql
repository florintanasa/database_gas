update GAZ_TELEFOANE set PRINCIPAL = false where PRINCIPAL is null ;
alter table GAZ_TELEFOANE alter column PRINCIPAL set not null ;
update GAZ_TELEFOANE set ACTIV = false where ACTIV is null ;
alter table GAZ_TELEFOANE alter column ACTIV set not null ;
