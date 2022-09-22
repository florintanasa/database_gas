alter table GAZ_EXECUTANT add column ACTIV boolean ^
update GAZ_EXECUTANT set ACTIV = false where ACTIV is null ;
alter table GAZ_EXECUTANT alter column ACTIV set not null ;
