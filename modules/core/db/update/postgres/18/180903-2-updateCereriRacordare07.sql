alter table GAZ_CERERI_RACORDARE add constraint FK_GAZ_CERERI_RACORDARE_ON_ID_TELEFOANE_MAN foreign key (ID_TELEFOANE_MAN_ID) references GAZ_TELEFOANE(ID);
create index IDX_GAZ_CERERI_RACORDARE_ON_ID_TELEFOANE_MAN on GAZ_CERERI_RACORDARE (ID_TELEFOANE_MAN_ID);
