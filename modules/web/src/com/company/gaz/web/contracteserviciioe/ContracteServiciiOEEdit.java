package com.company.gaz.web.contracteserviciioe;

import com.company.gaz.entity.NotificareOsdAtr;
import com.haulmont.cuba.core.entity.KeyValueEntity;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.ContracteServiciiOE;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class ContracteServiciiOEEdit extends AbstractEditor<ContracteServiciiOE> {

    @Inject
    private CollectionDatasource<KeyValueEntity, Object> dateFinalizareDs;
    @Inject
    private CollectionDatasource<KeyValueEntity, Object> pretTarifRacordareDs;
    @Inject
    private CollectionDatasource<KeyValueEntity, Object> pretTarifProiectareDs;
    @Inject
    private CollectionDatasource<KeyValueEntity, Object> pretTarifVerificareDs;
    @Inject
    private CollectionDatasource<KeyValueEntity, Object> pretTarifExecutieDs;

    @Inject
    private CollectionDatasource<NotificareOsdAtr, UUID> idNotificareOsdAtrsDs;

    @Inject
    private Datasource<ContracteServiciiOE> contracteServiciiOEDs;

    @Inject
    private Component labelTextDiferente;


    @Override
    public void init(Map<String, Object> params){
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> scotDataCurenta());
        contracteServiciiOEDs.addItemChangeListener(e -> autoCompleteaza());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> autoCompleteaza());

        contracteServiciiOEDs.addItemPropertyChangeListener(e -> scotDateFinalizare());
        contracteServiciiOEDs.addItemChangeListener(e -> scotDateFinalizare());

        idNotificareOsdAtrsDs.addItemChangeListener(e -> scotPretTarifRacordare());
        idNotificareOsdAtrsDs.addItemPropertyChangeListener(e -> scotPretTarifRacordare());

        idNotificareOsdAtrsDs.addItemPropertyChangeListener(e -> scotPretTarifProiectare());
        idNotificareOsdAtrsDs.addItemChangeListener(e -> scotPretTarifProiectare());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> calculTarif1Proiectare());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> calculTarif2Proiectare());

        idNotificareOsdAtrsDs.addItemPropertyChangeListener(e -> scotPretTarifVerificare());
        idNotificareOsdAtrsDs.addItemChangeListener(e -> scotPretTarifVerificare());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> calculTarif1Verificare());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> calculTarif2Verificare());

        idNotificareOsdAtrsDs.addItemPropertyChangeListener(e -> scotpretTarifExecutie());
        idNotificareOsdAtrsDs.addItemChangeListener(e -> scotpretTarifExecutie());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> calculTarif1Executie());
        contracteServiciiOEDs.addItemPropertyChangeListener(e -> calculTarif2Executie());


    }

    private void autoCompleteaza(){
        if (getItem().getProc1TarifExecutie()==null || getItem().getProc1TarifProiectare()==null ||
                getItem().getProc1TarifVerificare()==null || getItem().getProc2TarifExecutie()==null ||
                getItem().getProc2TarifProiectare()==null || getItem().getProc1TarifVerificare()==null ||

                getItem().getTarifRacordare()==null ||
                getItem().getTarifExecutie()==null ||
                getItem().getTarifProiectare()==null ||
                getItem().getTarifVerificare()==null ||

                getItem().getTarif1Executie()==null || getItem().getProc1TarifProiectare()==null ||
                getItem().getTarif1Verificare()==null || getItem().getTarif2Executie()==null ||
                getItem().getTarif2Proiectare()==null || getItem().getTarif2Verificare()==null){

            getItem().setProc1TarifExecutie(new BigDecimal(20.00));
            getItem().setProc1TarifProiectare(new BigDecimal(20.00));
            getItem().setProc1TarifVerificare(new BigDecimal(20.00));
            getItem().setProc2TarifExecutie(new BigDecimal(80.00));
            getItem().setProc2TarifProiectare(new BigDecimal(80.00));
            getItem().setProc2TarifVerificare(new BigDecimal(80.00));

            getItem().setTarifRacordare(new BigDecimal(0.00));
            getItem().setTarifExecutie(new BigDecimal(0.00));
            getItem().setTarifProiectare(new BigDecimal(0.00));
            getItem().setTarifVerificare(new BigDecimal(0.00));

            getItem().setTarif1Executie(new BigDecimal(0.00));
            getItem().setTarif1Proiectare(new BigDecimal(0.00));
            getItem().setTarif1Verificare(new BigDecimal(0.00));
            getItem().setTarif2Executie(new BigDecimal(0.00));
            getItem().setTarif2Proiectare(new BigDecimal(0.00));
            getItem().setTarif2Verificare(new BigDecimal(0.00));

            getItem().setDurataContract(150);
            getItem().setZileRepGarantie(5);
            getItem().setProcElibGarantie1(new BigDecimal(30.00));
            getItem().setProcElibGarantie2(new BigDecimal(70.00));
            
        }
    }
    private void calculTarif1Proiectare(){
        BigDecimal CalculTarif1Proiectare = BigDecimal.ZERO;
        CalculTarif1Proiectare = getItem().getProc1TarifProiectare().
                divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP).
                multiply(getItem().getTarifProiectare()).setScale(2,BigDecimal.ROUND_HALF_UP);
        getItem().setTarif1Proiectare(CalculTarif1Proiectare);
    }
    private void calculTarif2Proiectare() {
        BigDecimal CalculTarif2Proiectare = BigDecimal.ZERO;
        CalculTarif2Proiectare = getItem().getProc2TarifProiectare().
                divide(new BigDecimal(100.00), 2, BigDecimal.ROUND_HALF_UP).
                multiply(getItem().getTarifProiectare()).setScale(2, BigDecimal.ROUND_HALF_UP);
        getItem().setTarif2Proiectare(CalculTarif2Proiectare);
    }
    private void calculTarif1Verificare(){
        BigDecimal CalculTarif1Verificare = BigDecimal.ZERO;
        CalculTarif1Verificare = getItem().getProc1TarifVerificare().
                divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP).
                multiply(getItem().getTarifVerificare()).setScale(2,BigDecimal.ROUND_HALF_UP);
        getItem().setTarif1Verificare(CalculTarif1Verificare);
    }
    private void calculTarif2Verificare() {
        BigDecimal CalculTarif2Verificare = BigDecimal.ZERO;
        CalculTarif2Verificare = getItem().getProc2TarifVerificare().
                divide(new BigDecimal(100.00), 2, BigDecimal.ROUND_HALF_UP).
                multiply(getItem().getTarifVerificare()).setScale(2, BigDecimal.ROUND_HALF_UP);
        getItem().setTarif2Verificare(CalculTarif2Verificare);
    }
    private void calculTarif1Executie(){
        BigDecimal CalculTarif1Executie = BigDecimal.ZERO;
        CalculTarif1Executie = getItem().getProc1TarifExecutie().
                divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP).
                multiply(getItem().getTarifExecutie()).setScale(2,BigDecimal.ROUND_HALF_UP);
        getItem().setTarif1Executie(CalculTarif1Executie);
    }
    private void calculTarif2Executie(){
        BigDecimal CalculTarif2Executie = BigDecimal.ZERO;
        CalculTarif2Executie = getItem().getProc2TarifExecutie().
                divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP).
                multiply(getItem().getTarifExecutie()).setScale(2,BigDecimal.ROUND_HALF_UP);
        getItem().setTarif2Executie(CalculTarif2Executie);
    }
    private void scotDateFinalizare(){
       for( KeyValueEntity data : dateFinalizareDs.getItems()){
           getItem().setDataTermProiect(data.getValue("DataTerminProiect"));
       }
       for (KeyValueEntity data : dateFinalizareDs.getItems()){
           getItem().setDataTermVerifcare(data.getValue("DataTerminVerificare"));
       }
       for (KeyValueEntity data : dateFinalizareDs.getItems()){
           getItem().setDataTermExe(data.getValue("DataTerminExecutie"));
       }
    }
    private void scotPretTarifRacordare(){
        for (KeyValueEntity data : pretTarifRacordareDs.getItems()){
            getItem().setTarifRacordare(data.getValue("PretTarifRacordare"));
        }
    }
    private void scotPretTarifProiectare(){
        for (KeyValueEntity data : pretTarifProiectareDs.getItems()){
            getItem().setTarifProiectare(data.getValue("PretTarifProiectare"));
        }
    }
    private void scotPretTarifVerificare(){
        for (KeyValueEntity data : pretTarifVerificareDs.getItems()){
            getItem().setTarifVerificare(data.getValue("PretTarifVerificare"));
        }
    }
    private void scotpretTarifExecutie(){
        for (KeyValueEntity data : pretTarifExecutieDs.getItems()){
            getItem().setTarifExecutie(data.getValue("PretTarifExecutie"));
        }
    }
    private void scotDataCurenta(){
        if (getItem().getDatainreg()==null){
            Date dataCurenta = new Date();
            getItem().setDatainreg(dataCurenta);
        }
    }
    private void calculDiferente(){

    }
}
