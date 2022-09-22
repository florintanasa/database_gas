update GAZ_SOCIETATI_PROIECTARE set ACTIV = false where ACTIV is null ;
alter table GAZ_SOCIETATI_PROIECTARE alter column ACTIV set not null ;
