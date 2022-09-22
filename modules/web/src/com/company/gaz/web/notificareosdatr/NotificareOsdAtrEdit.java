package com.company.gaz.web.notificareosdatr;

import com.company.gaz.entity.NotificareOsdAtrLinii;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.NotificareOsdAtr;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class NotificareOsdAtrEdit extends AbstractEditor<NotificareOsdAtr> {

    @Inject
    private CollectionDatasource<NotificareOsdAtrLinii, UUID> idNotificareOsdAtrLiniiDs;

    @Override
    public void init(Map<String, Object> params){
        idNotificareOsdAtrLiniiDs.addCollectionChangeListener(e -> calculTotalPretTarif());
        idNotificareOsdAtrLiniiDs.addCollectionChangeListener(e -> calculTotalTVA());
        idNotificareOsdAtrLiniiDs.addCollectionChangeListener(e -> calculTotalPretTarifTva());
    }
    private void calculTotalPretTarif(){
        BigDecimal totalprettarif = BigDecimal.ZERO;
        for (NotificareOsdAtrLinii linie: idNotificareOsdAtrLiniiDs.getItems()){
            totalprettarif = totalprettarif.add(linie.getPretTarif());
        }
        getItem().setTotalPretTarif(totalprettarif);
    }
    private void calculTotalTVA() {
        BigDecimal totaltva = BigDecimal.ZERO;
        for (NotificareOsdAtrLinii linie : idNotificareOsdAtrLiniiDs.getItems()) {
            totaltva = totaltva.add(linie.getTvaTarif());
        }
        getItem().setTotalTVA(totaltva);
    }
    private void calculTotalPretTarifTva() {
        BigDecimal totalprettariftva = BigDecimal.ZERO;
        for (NotificareOsdAtrLinii linie : idNotificareOsdAtrLiniiDs.getItems()) {
            totalprettariftva = totalprettariftva.add(linie.getPretTarifTva());
        }
        getItem().setTotalPretTarifTva(totalprettariftva);
    }
}
