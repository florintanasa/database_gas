update GAZ_TARIFE_RACORDARE_FIXE set ACTIV = false where ACTIV is null ;
alter table GAZ_TARIFE_RACORDARE_FIXE alter column ACTIV set not null ;
