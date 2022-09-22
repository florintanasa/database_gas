package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|stareCerereATR")
@Table(name = "GAZ_STATUS_CERERE_ATR")
@Entity(name = "gaz$StatusCerereATR")
public class StatusCerereATR extends StandardEntity {
    private static final long serialVersionUID = -3913599499757445802L;

    @NotNull
    @Column(name = "NR_ORD", nullable = false, unique = true)
    protected Integer nrOrd;

    @NotNull
    @Column(name = "STARE_CERERE_ATR", nullable = false, unique = true)
    protected String stareCerereATR;

    @NotNull
    @Column(name = "EXPLICATII", nullable = false)
    protected String explicatii;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setNrOrd(Integer nrOrd) {
        this.nrOrd = nrOrd;
    }

    public Integer getNrOrd() {
        return nrOrd;
    }

    public void setStareCerereATR(String stareCerereATR) {
        this.stareCerereATR = stareCerereATR;
    }

    public String getStareCerereATR() {
        return stareCerereATR;
    }

    public void setExplicatii(String explicatii) {
        this.explicatii = explicatii;
    }

    public String getExplicatii() {
        return explicatii;
    }

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


}