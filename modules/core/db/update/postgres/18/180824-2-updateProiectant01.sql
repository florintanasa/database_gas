alter table GAZ_PROIECTANT add constraint FK_GAZ_PROIECTANT_ON_ID_SOCIETATI_PROIECTARE foreign key (ID_SOCIETATI_PROIECTARE_ID) references GAZ_SOCIETATI_PROIECTARE(ID);
create index IDX_GAZ_PROIECTANT_ON_ID_SOCIETATI_PROIECTARE on GAZ_PROIECTANT (ID_SOCIETATI_PROIECTARE_ID);
