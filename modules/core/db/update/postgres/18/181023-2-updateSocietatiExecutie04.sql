alter table GAZ_SOCIETATI_EXECUTIE add constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_CALITATE_REP_LEGAL foreign key (ID_CALITATE_REP_LEGAL_ID) references GAZ_REP_LEGAL(ID);
create index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_CALITATE_REP_LEGAL on GAZ_SOCIETATI_EXECUTIE (ID_CALITATE_REP_LEGAL_ID);