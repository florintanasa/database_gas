alter table GAZ_SOCIETATI_PROIECTARE add constraint FK_GAZ_SOCIETATI_PROIECTARE_ON_IDEMAIL foreign key (IDEMAIL_ID) references GAZ_EMAIL(ID);
create index IDX_GAZ_SOCIETATI_PROIECTARE_ON_IDEMAIL on GAZ_SOCIETATI_PROIECTARE (IDEMAIL_ID);
