alter table GAZ_SOCIETATI_EXECUTIE add constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_EMAIL foreign key (ID_EMAIL_ID) references GAZ_EMAIL(ID);
create index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_EMAIL on GAZ_SOCIETATI_EXECUTIE (ID_EMAIL_ID);
