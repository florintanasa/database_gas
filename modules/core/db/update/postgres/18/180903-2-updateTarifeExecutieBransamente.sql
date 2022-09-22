update GAZ_TARIFE_EXECUTIE_BRANSAMENTE set ACTIV = false where ACTIV is null ;
alter table GAZ_TARIFE_EXECUTIE_BRANSAMENTE alter column ACTIV set not null ;
