update GAZ_TARIFE_EXECUTIE_POSTURI set ACTIV = false where ACTIV is null ;
alter table GAZ_TARIFE_EXECUTIE_POSTURI alter column ACTIV set not null ;
