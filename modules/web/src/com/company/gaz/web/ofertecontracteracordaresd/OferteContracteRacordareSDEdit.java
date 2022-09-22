package com.company.gaz.web.ofertecontracteracordaresd;

import com.company.gaz.entity.OferteConRacOSDTarifExeBrLinii;
import com.company.gaz.entity.OferteConRacOSDTarifExePostLinii;
import com.company.gaz.entity.OferteContracteRacordareOSDLinii;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.OferteContracteRacordareSD;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class OferteContracteRacordareSDEdit extends AbstractEditor<OferteContracteRacordareSD> {

    @Inject
    private CollectionDatasource<OferteContracteRacordareOSDLinii, UUID> idOferteContracteRacordareOSDLiniiDs;
    @Inject
    private CollectionDatasource<OferteConRacOSDTarifExePostLinii, UUID> idOferteConRacOSDTarifExePostLiniiDs;
    @Inject
    private CollectionDatasource<OferteConRacOSDTarifExeBrLinii, UUID> idOferteConRacOSDTarifExeBrLiniiDs;
    @Inject
    private Datasource<OferteContracteRacordareSD> oferteContracteRacordareSDDs;

    @Override
    public void init(Map<String, Object> params){
        oferteContracteRacordareSDDs.addItemPropertyChangeListener(e -> calculTaxaISC01());
        oferteContracteRacordareSDDs.addItemChangeListener(e -> calculTaxaISC01());

        oferteContracteRacordareSDDs.addItemPropertyChangeListener(e -> calculTaxaISC05());
        oferteContracteRacordareSDDs.addItemChangeListener(e -> calculTaxaISC05());

        oferteContracteRacordareSDDs.addItemPropertyChangeListener(e -> calculTarifRacordare());
        oferteContracteRacordareSDDs.addItemChangeListener(e -> calculTarifRacordare());

        oferteContracteRacordareSDDs.addItemPropertyChangeListener(e -> calculTvaTarifRacordare());
        oferteContracteRacordareSDDs.addItemChangeListener(e -> calculTvaTarifRacordare());

        oferteContracteRacordareSDDs.addItemPropertyChangeListener(e -> calculTotalTarifRacordare());
        oferteContracteRacordareSDDs.addItemChangeListener(e -> calculTotalTarifRacordare());

        idOferteContracteRacordareOSDLiniiDs.addCollectionChangeListener(e -> calculTarifRacordare());
        idOferteConRacOSDTarifExePostLiniiDs.addCollectionChangeListener(e -> calculTarifRacordare());
        idOferteConRacOSDTarifExeBrLiniiDs.addCollectionChangeListener(e -> calculTarifRacordare());

        idOferteContracteRacordareOSDLiniiDs.addCollectionChangeListener(e -> calculTvaTarifRacordare());
        idOferteConRacOSDTarifExePostLiniiDs.addCollectionChangeListener(e -> calculTvaTarifRacordare());
        idOferteConRacOSDTarifExeBrLiniiDs.addCollectionChangeListener(e -> calculTvaTarifRacordare());

        idOferteContracteRacordareOSDLiniiDs.addCollectionChangeListener(e -> calculTotalTarifRacordare());
        idOferteConRacOSDTarifExePostLiniiDs.addCollectionChangeListener(e -> calculTotalTarifRacordare());
        idOferteConRacOSDTarifExeBrLiniiDs.addCollectionChangeListener(e -> calculTotalTarifRacordare());
    }
    private void calculTarifRacordare(){
        BigDecimal tarifracordare = BigDecimal.ZERO;
        if (getItem().getProcTaxaISC1() == null || getItem().getProcTaxaISC2() == null)
        {
            getItem().setProcTaxaISC1(new BigDecimal(0.10));
            getItem().setTaxaISC1(new BigDecimal(0.00));
            getItem().setProcTaxaISC2(new BigDecimal(0.50));
            getItem().setTaxaISC2(new BigDecimal(0.00));
        }
        for (OferteContracteRacordareOSDLinii linie : idOferteContracteRacordareOSDLiniiDs.getItems()){
            tarifracordare = tarifracordare.add(linie.getTarifD());
        }
        for (OferteConRacOSDTarifExePostLinii linie : idOferteConRacOSDTarifExePostLiniiDs.getItems()){
            tarifracordare = tarifracordare.add(linie.getTarifD());
        }
        for (OferteConRacOSDTarifExeBrLinii linie : idOferteConRacOSDTarifExeBrLiniiDs.getItems()){
            tarifracordare = tarifracordare.add(linie.getTarifD());
        }
        tarifracordare =tarifracordare.add(getItem().getTaxaISC1()).add(getItem().getTaxaISC2());
        getItem().setTarifRacordare(tarifracordare);
    }
    private void calculTvaTarifRacordare(){
        BigDecimal tvatarifracordare = BigDecimal.ZERO;
        for (OferteContracteRacordareOSDLinii linie : idOferteContracteRacordareOSDLiniiDs.getItems()){
            tvatarifracordare = tvatarifracordare.add(linie.getTvaTarif());
        }
        for (OferteConRacOSDTarifExePostLinii linie : idOferteConRacOSDTarifExePostLiniiDs.getItems()){
            tvatarifracordare = tvatarifracordare.add(linie.getTvaTarif());
        }
        for (OferteConRacOSDTarifExeBrLinii linie : idOferteConRacOSDTarifExeBrLiniiDs.getItems()){
            tvatarifracordare = tvatarifracordare.add(linie.getTvaTarif());
        }
        getItem().setTvaTarifRacordare(tvatarifracordare);
    }
    private void calculTotalTarifRacordare(){
        BigDecimal totaltarifracordare = BigDecimal.ZERO;
        if (getItem().getProcTaxaISC1() == null || getItem().getProcTaxaISC2() == null)
        {
            getItem().setProcTaxaISC1(new BigDecimal(0.10));
            getItem().setTaxaISC1(new BigDecimal(0.00));
            getItem().setProcTaxaISC2(new BigDecimal(0.50));
            getItem().setTaxaISC2(new BigDecimal(0.00));
        }
        for (OferteContracteRacordareOSDLinii linie : idOferteContracteRacordareOSDLiniiDs.getItems()){
            totaltarifracordare = totaltarifracordare.add(linie.getTotalTarif());
        }
        for (OferteConRacOSDTarifExePostLinii linie : idOferteConRacOSDTarifExePostLiniiDs.getItems()){
            totaltarifracordare = totaltarifracordare.add(linie.getTotalTarif());
        }
        for (OferteConRacOSDTarifExeBrLinii linie : idOferteConRacOSDTarifExeBrLiniiDs.getItems()){
            totaltarifracordare = totaltarifracordare.add(linie.getTotalTarif());
        }
        totaltarifracordare = totaltarifracordare.add(getItem().getTaxaISC1()).add(getItem().getTaxaISC2());
        getItem().setTotalTarifRacordare(totaltarifracordare);
    }
    private void calculTaxaISC01(){
        BigDecimal calcultaxaisc01 = BigDecimal.ZERO;
        if (getItem().getProcTaxaISC1() == null)
        {
            calcultaxaisc01 = new BigDecimal(0.10);
            getItem().setProcTaxaISC1(calcultaxaisc01);
            getItem().setTaxaISC1(new BigDecimal(0.00));
        }
        for (OferteConRacOSDTarifExePostLinii linie : idOferteConRacOSDTarifExePostLiniiDs.getItems()){
            calcultaxaisc01 = calcultaxaisc01.add(linie.getTarifD());
        }
        for (OferteConRacOSDTarifExeBrLinii linie : idOferteConRacOSDTarifExeBrLiniiDs.getItems()){
            calcultaxaisc01 = calcultaxaisc01.add(linie.getTarifD());
        }
        calcultaxaisc01 = calcultaxaisc01.divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP).multiply(getItem().getProcTaxaISC1()).setScale(2,BigDecimal.ROUND_HALF_UP);
        getItem().setTaxaISC1(calcultaxaisc01);
    }
    private void calculTaxaISC05(){
        BigDecimal calcultaxaisc05 = BigDecimal.ZERO;
        if (getItem().getProcTaxaISC2() == null)
        {
            calcultaxaisc05 = new BigDecimal(0.50);
            getItem().setProcTaxaISC2(calcultaxaisc05);
            getItem().setTaxaISC2(new BigDecimal(0.00));
        }
        for (OferteConRacOSDTarifExePostLinii linie : idOferteConRacOSDTarifExePostLiniiDs.getItems()){
            calcultaxaisc05 = calcultaxaisc05.add(linie.getTarifD());
        }
        for (OferteConRacOSDTarifExeBrLinii linie : idOferteConRacOSDTarifExeBrLiniiDs.getItems()){
            calcultaxaisc05 = calcultaxaisc05.add(linie.getTarifD());
        }
        calcultaxaisc05 = calcultaxaisc05.divide(new BigDecimal(100.00),2, BigDecimal.ROUND_HALF_UP).multiply(getItem().getProcTaxaISC2()).setScale(2,BigDecimal.ROUND_HALF_UP);
        getItem().setTaxaISC2(calcultaxaisc05);
    }
}