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

@Table(name = "GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII")
@Entity(name = "gaz$OferteConRacOSDTarifExePostLinii")
public class OferteConRacOSDTarifExePostLinii extends StandardEntity {
    private static final long serialVersionUID = 6101120593320855885L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_OFERTE_CONTRACTE_RACORDARE_SD_ID")
    protected OferteContracteRacordareSD idOferteContracteRacordareSD;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TARIFE_EXECUTIE_POSTURI_ID")
    protected TarifeExecutiePosturi idTarifeExecutiePosturi;

    @NotNull
    @Column(name = "DISCOUNT", nullable = false)
    protected BigDecimal discount;

    @NotNull
    @Column(name = "BUC_ML", nullable = false)
    protected BigDecimal bucMl;

    @NotNull
    @Column(name = "TARIF_D", nullable = false)
    protected BigDecimal tarifD;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TVA_ID")
    protected Tva idTva;

    @NotNull
    @Column(name = "TVA_TARIF", nullable = false)
    protected BigDecimal tvaTarif;

    @NotNull
    @Column(name = "TOTAL_TARIF", nullable = false)
    protected BigDecimal totalTarif;

    public void setTvaTarif(BigDecimal tvaTarif) {
        this.tvaTarif = tvaTarif;
    }

    public BigDecimal getTvaTarif() {
        return tvaTarif;
    }


    public void setIdOferteContracteRacordareSD(OferteContracteRacordareSD idOferteContracteRacordareSD) {
        this.idOferteContracteRacordareSD = idOferteContracteRacordareSD;
    }

    public OferteContracteRacordareSD getIdOferteContracteRacordareSD() {
        return idOferteContracteRacordareSD;
    }

    public void setIdTarifeExecutiePosturi(TarifeExecutiePosturi idTarifeExecutiePosturi) {
        this.idTarifeExecutiePosturi = idTarifeExecutiePosturi;
    }

    public TarifeExecutiePosturi getIdTarifeExecutiePosturi() {
        return idTarifeExecutiePosturi;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setBucMl(BigDecimal bucMl) {
        this.bucMl = bucMl;
    }

    public BigDecimal getBucMl() {
        return bucMl;
    }

    public void setTarifD(BigDecimal tarifD) {
        this.tarifD = tarifD;
    }

    public BigDecimal getTarifD() {
        return tarifD;
    }

    public void setIdTva(Tva idTva) {
        this.idTva = idTva;
    }

    public Tva getIdTva() {
        return idTva;
    }

    public void setTotalTarif(BigDecimal totalTarif) {
        this.totalTarif = totalTarif;
    }

    public BigDecimal getTotalTarif() {
        return totalTarif;
    }


}