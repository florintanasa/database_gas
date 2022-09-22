package com.company.gaz.web.ofertecontracteracordareosdlinii;

import com.company.gaz.entity.TarifeRacordareFixe;
import com.company.gaz.entity.Tva;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.OferteContracteRacordareOSDLinii;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class OferteContracteRacordareOSDLiniiEdit extends AbstractEditor<OferteContracteRacordareOSDLinii> {

    @Inject
    private CollectionDatasource<TarifeRacordareFixe, UUID> idTarifeRacordareFixesDs;
    @Inject
    private CollectionDatasource<Tva, UUID> idTvasDs;
    @Inject
    private Datasource<OferteContracteRacordareOSDLinii> oferteContracteRacordareOSDLiniiDs;

    @Override
    public void init(Map<String, Object> params){

        idTarifeRacordareFixesDs.addCollectionChangeListener(e -> calculTvaTarif());
        idTarifeRacordareFixesDs.addItemChangeListener(e -> calculTvaTarif());
        idTarifeRacordareFixesDs.addItemPropertyChangeListener(e -> calculTvaTarif());

        idTarifeRacordareFixesDs.addCollectionChangeListener(e -> calculTarif());
        idTarifeRacordareFixesDs.addItemChangeListener(e -> calculTarif());
        idTarifeRacordareFixesDs.addItemPropertyChangeListener(e -> calculTarif());

        idTvasDs.addCollectionChangeListener(e -> calculTvaTarif());
        idTvasDs.addItemChangeListener(e -> calculTvaTarif());
        idTvasDs.addItemPropertyChangeListener(e -> calculTvaTarif());

        idTvasDs.addCollectionChangeListener(e -> calculTarif());
        idTvasDs.addItemChangeListener(e -> calculTarif());
        idTvasDs.addItemPropertyChangeListener(e -> calculTarif());

        oferteContracteRacordareOSDLiniiDs.addItemChangeListener(e -> calculTvaTarif());
        oferteContracteRacordareOSDLiniiDs.addItemPropertyChangeListener(e -> calculTvaTarif());
        oferteContracteRacordareOSDLiniiDs.addItemChangeListener(e -> calculTarif());
        oferteContracteRacordareOSDLiniiDs.addItemPropertyChangeListener(e -> calculTarif());
        oferteContracteRacordareOSDLiniiDs.addItemChangeListener(e -> calculTarifD());
        oferteContracteRacordareOSDLiniiDs.addItemPropertyChangeListener(e -> calculTarifD());

    }

    private void calculTvaTarif(){
        BigDecimal calcul = BigDecimal.ZERO;
        if (getItem().getIdTva() == null || getItem().getIdTarifeRacordareFixe() == null ||
                getItem().getDiscount() == null)
        {
            calcul = new BigDecimal(0.00);
            getItem().setDiscount(new BigDecimal(0.00));
            getItem().setTvaTarif(calcul);

        }
        else
        {
            calcul = getItem().getIdTarifeRacordareFixe().getTarif().subtract(getItem().getIdTarifeRacordareFixe().
                    getTarif().multiply(getItem().getDiscount().
                    divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    multiply(getItem().getIdTva().getCotaTVA().
                            divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP)).
                    setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTvaTarif(calcul);
        }
    }

    private void  calculTarif(){
        BigDecimal calcul = BigDecimal.ZERO;
        if (getItem().getIdTarifeRacordareFixe() == null || getItem().getDiscount() == null ||
                getItem().getIdTva() == null || getItem().getTvaTarif() == null)
        {
            calcul = new BigDecimal(0.00);
            getItem().setDiscount(new BigDecimal(0.00));
            getItem().setTotalTarif(calcul);
        }
        else
        {
            calcul = getItem().getIdTarifeRacordareFixe().getTarif().subtract(getItem().getIdTarifeRacordareFixe().
                    getTarif().multiply(getItem().getDiscount().
                    divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    add(getItem().getTvaTarif()).setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTotalTarif(calcul);
        }
    }

    private void calculTarifD(){
        BigDecimal calcul = BigDecimal.ZERO;
        if (getItem().getIdTarifeRacordareFixe() == null || getItem().getDiscount() == null ||
                getItem().getIdTva() == null || getItem().getTvaTarif() == null || getItem().getTarifD() == null)
        {
            calcul = new BigDecimal(0.00);
            getItem().setDiscount(calcul);
            getItem().setTarifD(calcul);
            getItem().setTotalTarif(calcul);
        }
        else
        {
            calcul=getItem().getIdTarifeRacordareFixe().getTarif().
                    subtract(getItem().getIdTarifeRacordareFixe().getTarif().
                            multiply(getItem().getDiscount().
                                    divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP))).
                    setScale(2,BigDecimal.ROUND_HALF_UP);
            getItem().setTarifD(calcul);
        }

    }
}