alter table GAZ_VERIFICATOR add constraint FK_GAZ_VERIFICATOR_ON_ID_EMAIL foreign key (ID_EMAIL_ID) references GAZ_EMAIL(ID);
create index IDX_GAZ_VERIFICATOR_ON_ID_EMAIL on GAZ_VERIFICATOR (ID_EMAIL_ID);