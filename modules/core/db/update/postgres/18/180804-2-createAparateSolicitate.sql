alter table GAZ_APARATE_SOLICITATE add constraint FK_GAZ_APARATE_SOLICITATE_ON_ID_CERERI_RACORDARE foreign key (ID_CERERI_RACORDARE_ID) references GAZ_CERERI_RACORDARE(ID);
alter table GAZ_APARATE_SOLICITATE add constraint FK_GAZ_APARATE_SOLICITATE_ON_ID_APARATE foreign key (ID_APARATE_ID) references GAZ_APARATE(ID);
create index IDX_GAZ_APARATE_SOLICITATE_ON_ID_CERERI_RACORDARE on GAZ_APARATE_SOLICITATE (ID_CERERI_RACORDARE_ID);
create index IDX_GAZ_APARATE_SOLICITATE_ON_ID_APARATE on GAZ_APARATE_SOLICITATE (ID_APARATE_ID);
