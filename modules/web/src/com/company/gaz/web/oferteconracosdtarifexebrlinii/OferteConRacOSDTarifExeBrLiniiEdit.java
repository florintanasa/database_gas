package com.company.gaz.web.oferteconracosdtarifexebrlinii;

import com.company.gaz.entity.TarifeExecutieBransamente;
import com.company.gaz.entity.Tva;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.OferteConRacOSDTarifExeBrLinii;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class OferteConRacOSDTarifExeBrLiniiEdit extends AbstractEditor<OferteConRacOSDTarifExeBrLinii> {

    @Inject
    private CollectionDatasource<TarifeExecutieBransamente, UUID> idTarifeExecutieBransamentesDs;
    @Inject
    private CollectionDatasource<Tva, UUID> idTvasDs;
    @Inject
    private Datasource<OferteConRacOSDTarifExeBrLinii> oferteConRacOSDTarifExeBrLiniiDs;

    @Override
    public void init(Map<String, Object> params){
        idTvasDs.addCollectionChangeListener(e -> calculTvaTarif());
        idTvasDs.addItemChangeListener(e -> calculTvaTarif());
        idTvasDs.addItemPropertyChangeListener(e -> calculTvaTarif());

        oferteConRacOSDTarifExeBrLiniiDs.addItemChangeListener(e -> calculTvaTarif());
        oferteConRacOSDTarifExeBrLiniiDs.addItemPropertyChangeListener(e -> calculTvaTarif());
        oferteConRacOSDTarifExeBrLiniiDs.addItemPropertyChangeListener(e -> calculTarifD());
        oferteConRacOSDTarifExeBrLiniiDs.addItemChangeListener(e -> calculTarifD());
        oferteConRacOSDTarifExeBrLiniiDs.addItemChangeListener(e -> calculTarif());
        oferteConRacOSDTarifExeBrLiniiDs.addItemPropertyChangeListener(e -> calculTarif());

    }
    private void calculTvaTarif(){
        BigDecimal calcul = BigDecimal.ZERO;
        if(getItem().getDiscount() == null || getItem().getBucMl() == null ||
                getItem().getIdTarifeExecutieBransamente() == null || getItem().getIdTva() == null)
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
            calcul = getItem().getIdTarifeExecutieBransamente().getTarif().
                    subtract(getItem().getIdTarifeExecutieBransamente().getTarif().multiply(getItem().getDiscount().
                            divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).multiply(getItem().getIdTva().getCotaTVA().
                    divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP)).multiply(getItem().getBucMl()).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTvaTarif(calcul);
        }
    }
    private void calculTarifD(){
        BigDecimal calcul = BigDecimal.ZERO;
        if(getItem().getDiscount() == null || getItem().getBucMl() == null ||
                getItem().getIdTarifeExecutieBransamente() == null || getItem().getIdTva() == null)
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
            calcul = getItem().getIdTarifeExecutieBransamente().getTarif().
                    subtract(getItem().getIdTarifeExecutieBransamente().getTarif().
                            multiply(getItem().getDiscount().divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    multiply(getItem().getBucMl()).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTarifD(calcul);
        }
    }
    private void calculTarif(){
        BigDecimal calcul = BigDecimal.ZERO;
        if(getItem().getDiscount() == null || getItem().getBucMl() == null ||
                getItem().getIdTarifeExecutieBransamente() == null || getItem().getIdTva() == null)
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
            calcul = getItem().getIdTarifeExecutieBransamente().getTarif().
                    subtract(getItem().getIdTarifeExecutieBransamente().getTarif().
                            multiply(getItem().getDiscount().divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    multiply(getItem().getBucMl()).add(getItem().getIdTarifeExecutieBransamente().getTarif().
                    subtract(getItem().getIdTarifeExecutieBransamente().getTarif().multiply(getItem().getDiscount().
                            divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).multiply(getItem().getIdTva().getCotaTVA().
                    divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP)).multiply(getItem().getBucMl())).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTotalTarif(calcul);
        }
    }
}