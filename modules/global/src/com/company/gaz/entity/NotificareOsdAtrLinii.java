package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|idDenTarif")
@Table(name = "GAZ_NOTIFICARE_OSD_ATR_LINII")
@Entity(name = "gaz$NotificareOsdAtrLinii")
public class NotificareOsdAtrLinii extends StandardEntity {
    private static final long serialVersionUID = -5135582493614892613L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_NOTIFICARE_OSD_ATR_ID")
    protected NotificareOsdAtr idNotificareOsdAtr;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_DEN_TARIF_ID")
    protected CompTarifNotificare idDenTarif;

    @NotNull
    @Column(name = "PRET_TARIF", nullable = false)
    protected BigDecimal pretTarif;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_COTA_TVA_ID")
    protected Tva idCotaTva;

    @NotNull
    @Column(name = "TVA_TARIF", nullable = false)
    protected BigDecimal tvaTarif;

    @NotNull
    @Column(name = "PRET_TARIF_TVA", nullable = false)
    protected BigDecimal pretTarifTva;

    public void setIdNotificareOsdAtr(NotificareOsdAtr idNotificareOsdAtr) {
        this.idNotificareOsdAtr = idNotificareOsdAtr;
    }

    public NotificareOsdAtr getIdNotificareOsdAtr() {
        return idNotificareOsdAtr;
    }


    public void setIdDenTarif(CompTarifNotificare idDenTarif) {
        this.idDenTarif = idDenTarif;
    }

    public CompTarifNotificare getIdDenTarif() {
        return idDenTarif;
    }

    public void setPretTarif(BigDecimal pretTarif) {
        this.pretTarif = pretTarif;
    }

    public BigDecimal getPretTarif() {
        return pretTarif;
    }

    public void setIdCotaTva(Tva idCotaTva) {
        this.idCotaTva = idCotaTva;
    }

    public Tva getIdCotaTva() {
        return idCotaTva;
    }

    public void setTvaTarif(BigDecimal tvaTarif) {
        this.tvaTarif = tvaTarif;
    }

    public BigDecimal getTvaTarif() {
        return tvaTarif;
    }

    public void setPretTarifTva(BigDecimal pretTarifTva) {
        this.pretTarifTva = pretTarifTva;
    }

    public BigDecimal getPretTarifTva() {
        return pretTarifTva;
    }


}