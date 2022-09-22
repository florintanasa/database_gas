package com.company.gaz.web.oferteconracosdtarifexepostlinii;

import com.company.gaz.entity.TarifeExecutiePosturi;
import com.company.gaz.entity.Tva;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.OferteConRacOSDTarifExePostLinii;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class OferteConRacOSDTarifExePostLiniiEdit extends AbstractEditor<OferteConRacOSDTarifExePostLinii> {

    @Inject
    private CollectionDatasource<TarifeExecutiePosturi, UUID> idTarifeExecutiePosturisDs;
    @Inject
    private CollectionDatasource<Tva, UUID> idTvasDs;
    @Inject
    private Datasource<OferteConRacOSDTarifExePostLinii> oferteConRacOSDTarifExePostLiniiDs;

    @Override
    public void init(Map<String, Object> params){

        idTvasDs.addCollectionChangeListener(e -> calculTvaTarif());
        idTvasDs.addItemChangeListener(e -> calculTvaTarif());
        idTvasDs.addItemPropertyChangeListener(e -> calculTvaTarif());

        oferteConRacOSDTarifExePostLiniiDs.addItemChangeListener(e -> calculTvaTarif());
        oferteConRacOSDTarifExePostLiniiDs.addItemPropertyChangeListener(e -> calculTvaTarif());
        oferteConRacOSDTarifExePostLiniiDs.addItemChangeListener(e -> calculTarif());
        oferteConRacOSDTarifExePostLiniiDs.addItemPropertyChangeListener(e -> calculTarif());

        oferteConRacOSDTarifExePostLiniiDs.addItemChangeListener(e -> calculTarifD());
        oferteConRacOSDTarifExePostLiniiDs.addItemPropertyChangeListener(e -> calculTarifD());
        oferteConRacOSDTarifExePostLiniiDs.addItemChangeListener(e -> calculTarif());
        oferteConRacOSDTarifExePostLiniiDs.addItemPropertyChangeListener(e -> calculTarif());



    }
    private void calculTvaTarif(){
        BigDecimal calcul = BigDecimal.ZERO;
        if (getItem().getDiscount() == null || getItem().getBucMl() == null ||
                getItem().getIdTarifeExecutiePosturi() == null ||
                getItem().getIdTva() == null)
        {
            calcul = new BigDecimal(0.00);
            getItem().setBucMl(calcul);
            getItem().setDiscount(calcul);
            getItem().setTarifD(calcul);
            getItem().setTvaTarif(calcul);
            getItem().setTotalTarif(calcul);
        }
        else
        {
            calcul = getItem().getIdTarifeExecutiePosturi().getTarif().subtract(getItem().getIdTarifeExecutiePosturi().
                    getTarif().multiply(getItem().getDiscount().
                    divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).multiply(getItem().
                    getIdTva().getCotaTVA().divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP)).
                    multiply(getItem().getBucMl()).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTvaTarif(calcul);
        }
    }
    private void calculTarifD(){
        BigDecimal calcul = BigDecimal.ZERO;
        if (getItem().getDiscount() == null || getItem().getBucMl() == null ||
                getItem().getIdTarifeExecutiePosturi() == null ||
                getItem().getIdTva() == null)
        {
            calcul = new BigDecimal(0.00);
            getItem().setBucMl(calcul);
            getItem().setDiscount(calcul);
            getItem().setTarifD(calcul);
            getItem().setTvaTarif(calcul);
            getItem().setTotalTarif(calcul);
        }
        else
        {
            calcul = getItem().getIdTarifeExecutiePosturi().getTarif().
                    subtract(getItem().getIdTarifeExecutiePosturi().getTarif().
                    multiply(getItem().getDiscount().divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    multiply(getItem().getBucMl()).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTarifD(calcul);
        }
    }
    private void calculTarif(){
        BigDecimal calcul = BigDecimal.ZERO;
        if (getItem().getDiscount() == null || getItem().getBucMl() == null ||
                getItem().getIdTarifeExecutiePosturi() == null ||
                getItem().getIdTva() == null)
        {
            calcul = new BigDecimal(0.00);
            getItem().setBucMl(calcul);
            getItem().setDiscount(calcul);
            getItem().setTarifD(calcul);
            getItem().setTvaTarif(calcul);
            getItem().setTotalTarif(calcul);
        }
        else
        {
            calcul = getItem().getIdTarifeExecutiePosturi().getTarif().
                    subtract(getItem().getIdTarifeExecutiePosturi().getTarif().multiply(getItem().getDiscount().
                            divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    multiply(getItem().getBucMl()).
                    add(getItem().getIdTarifeExecutiePosturi().getTarif().subtract(getItem().getIdTarifeExecutiePosturi().
                    getTarif().multiply(getItem().getDiscount().
                            divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).multiply(getItem().
                    getIdTva().getCotaTVA().divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP)).
                            multiply(getItem().getBucMl())).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTotalTarif(calcul);
        }
    }
}