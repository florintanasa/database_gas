alter table GAZ_ACORD_ACCES add constraint FK_GAZ_ACORD_ACCES_ON_ID_CONDUCTA foreign key (ID_CONDUCTA_ID) references GAZ_CONDUCTA(ID);
create index IDX_GAZ_ACORD_ACCES_ON_ID_CONDUCTA on GAZ_ACORD_ACCES (ID_CONDUCTA_ID);
