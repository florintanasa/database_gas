alter table GAZ_PROIECTANT add column ACTIV boolean ^
update GAZ_PROIECTANT set ACTIV = false where ACTIV is null ;
alter table GAZ_PROIECTANT alter column ACTIV set not null ;
