package com.company.gaz.web.notificareosdatrlinii;

import com.company.gaz.entity.NotificareOsdAtr;
import com.company.gaz.entity.Tva;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaz.entity.NotificareOsdAtrLinii;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class NotificareOsdAtrLiniiEdit extends AbstractEditor<NotificareOsdAtrLinii> {
    @Inject
    private CollectionDatasource<Tva, UUID> idCotaTvasDs;
    @Inject
    private Datasource<NotificareOsdAtrLinii> notificareOsdAtrLiniiDs;

    @Override
    public void init(Map<String, Object> params){
        idCotaTvasDs.addCollectionChangeListener(e -> calculTarifTva());
        idCotaTvasDs.addCollectionChangeListener(e -> calculPretTarifTva());
        notificareOsdAtrLiniiDs.addItemChangeListener(e -> calculTarifTva());
        notificareOsdAtrLiniiDs.addItemPropertyChangeListener(e -> calculTarifTva());
        notificareOsdAtrLiniiDs.addItemChangeListener(e -> calculPretTarifTva());
        notificareOsdAtrLiniiDs.addItemPropertyChangeListener(e -> calculPretTarifTva());
    }

    private void calculTarifTva(){
        BigDecimal calcul = BigDecimal.ZERO;
            if (getItem().getPretTarif()  == null || getItem().getIdCotaTva() == null)
            {
                calcul = new BigDecimal(0.00);
            }
            else
                {
                    calcul = getItem().getPretTarif().multiply(getItem().getIdCotaTva().getCotaTVA()).
                            divide(new BigDecimal(100.00),2,BigDecimal.ROUND_HALF_UP).
                            setScale(2,BigDecimal.ROUND_HALF_UP);
                    getItem().setTvaTarif(calcul);
                }
    }
    private void calculPretTarifTva(){
        BigDecimal calcul = BigDecimal.ZERO;
            if (getItem().getPretTarif()  == null || getItem().getIdCotaTva() == null)
            {
                calcul = new BigDecimal(0.00);
            }
            else
                {
                calcul = getItem().getPretTarif().add(getItem().getTvaTarif());
                getItem().setPretTarifTva(calcul);
                }
    }


}
