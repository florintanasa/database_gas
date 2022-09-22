alter table GAZ_PROIECTANT rename column data_stop_aut_societate_proiectare to data_stop_aut_societate_proiectare__u15658 ;
alter table GAZ_PROIECTANT alter column data_stop_aut_societate_proiectare__u15658 drop not null ;
alter table GAZ_PROIECTANT rename column data_start_aut_societate_proiectare to data_start_aut_societate_proiectare__u62854 ;
alter table GAZ_PROIECTANT alter column data_start_aut_societate_proiectare__u62854 drop not null ;
alter table GAZ_PROIECTANT rename column nr_aut_societate_proiectare to nr_aut_societate_proiectare__u90430 ;
alter table GAZ_PROIECTANT alter column nr_aut_societate_proiectare__u90430 drop not null ;
alter table GAZ_PROIECTANT rename column tip_aut_societate_proiectare to tip_aut_societate_proiectare__u72238 ;
alter table GAZ_PROIECTANT alter column tip_aut_societate_proiectare__u72238 drop not null ;
alter table GAZ_PROIECTANT rename column den_soc_proiectare to den_soc_proiectare__u54097 ;
alter table GAZ_PROIECTANT alter column den_soc_proiectare__u54097 drop not null ;
-- alter table GAZ_PROIECTANT add column ID_SOCIETATI_PROIECTARE_ID uuid ^
-- update GAZ_PROIECTANT set ID_SOCIETATI_PROIECTARE_ID = <default_value> ;
-- alter table GAZ_PROIECTANT alter column ID_SOCIETATI_PROIECTARE_ID set not null ;
alter table GAZ_PROIECTANT add column ID_SOCIETATI_PROIECTARE_ID uuid not null ;
