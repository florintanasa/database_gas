alter table GAZ_TARIFE_EXECUTIE_POSTURI add constraint FK_GAZ_TARIFE_EXECUTIE_POSTURI_ON_ID_SIRUTA foreign key (ID_SIRUTA_ID) references GAZ_SIRUTA(ID);
create index IDX_GAZ_TARIFE_EXECUTIE_POSTURI_ON_ID_SIRUTA on GAZ_TARIFE_EXECUTIE_POSTURI (ID_SIRUTA_ID);
