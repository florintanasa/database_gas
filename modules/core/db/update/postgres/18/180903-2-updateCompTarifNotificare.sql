update GAZ_COMP_TARIF_NOTIFICARE set TIP_TARIF = '' where TIP_TARIF is null ;
alter table GAZ_COMP_TARIF_NOTIFICARE alter column TIP_TARIF set not null ;
