package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|tipContor,tipG")
@Table(name = "GAZ_TIP_CONTOR")
@Entity(name = "gaz$TipContor")
public class TipContor extends StandardEntity {
    private static final long serialVersionUID = -1913098618128721113L;

    @NotNull
    @Column(name = "TIP_CONTOR", nullable = false, length = 25)
    protected String tipContor;

    @NotNull
    @Column(name = "TIP_G", nullable = false, length = 5)
    protected String tipG;

    @NotNull
    @Column(name = "Q_NOM", nullable = false, precision = 5, scale = 2)
    protected BigDecimal qNom;

    @NotNull
    @Column(name = "Q_MIN", nullable = false, precision = 5, scale = 2)
    protected BigDecimal qMin;

    @NotNull
    @Column(name = "Q_MAX", nullable = false, precision = 6, scale = 2)
    protected BigDecimal qMax;

    @NotNull
    @Column(name = "CADERE_PRESIUNE", nullable = false, precision = 3, scale = 2)
    protected BigDecimal caderePresiune;

    @Column(name = "EXPLICATII_TIP_CONTOR")
    protected String explicatiiTipContor;

    public void setTipContor(String tipContor) {
        this.tipContor = tipContor;
    }

    public String getTipContor() {
        return tipContor;
    }

    public void setTipG(String tipG) {
        this.tipG = tipG;
    }

    public String getTipG() {
        return tipG;
    }

    public void setQNom(BigDecimal qNom) {
        this.qNom = qNom;
    }

    public BigDecimal getQNom() {
        return qNom;
    }

    public void setQMin(BigDecimal qMin) {
        this.qMin = qMin;
    }

    public BigDecimal getQMin() {
        return qMin;
    }

    public void setQMax(BigDecimal qMax) {
        this.qMax = qMax;
    }

    public BigDecimal getQMax() {
        return qMax;
    }

    public void setCaderePresiune(BigDecimal caderePresiune) {
        this.caderePresiune = caderePresiune;
    }

    public BigDecimal getCaderePresiune() {
        return caderePresiune;
    }

    public void setExplicatiiTipContor(String explicatiiTipContor) {
        this.explicatiiTipContor = explicatiiTipContor;
    }

    public String getExplicatiiTipContor() {
        return explicatiiTipContor;
    }


}