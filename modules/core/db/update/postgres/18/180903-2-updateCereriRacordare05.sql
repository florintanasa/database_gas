alter table GAZ_CERERI_RACORDARE add constraint FK_GAZ_CERERI_RACORDARE_ON_ID_EMAIL_SOL foreign key (ID_EMAIL_SOL_ID) references GAZ_EMAIL(ID);
create index IDX_GAZ_CERERI_RACORDARE_ON_ID_EMAIL_SOL on GAZ_CERERI_RACORDARE (ID_EMAIL_SOL_ID);
