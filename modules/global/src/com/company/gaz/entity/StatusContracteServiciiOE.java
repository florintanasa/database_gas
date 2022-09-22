package com.company.gaz.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|stareContracteServiciiOE")
@Table(name = "GAZ_STATUS_CONTRACTE_SERVICII_OE")
@Entity(name = "gaz$StatusContracteServiciiOE")
public class StatusContracteServiciiOE extends StandardEntity {
    private static final long serialVersionUID = 8257550496373762023L;

    @NotNull
    @Column(name = "NR_ORD", nullable = false, unique = true)
    protected Integer nrOrd;

    @NotNull
    @Column(name = "STARE_CONTRACTE_SERVICII_OE", nullable = false, unique = true)
    protected String stareContracteServiciiOE;

    @NotNull
    @Column(name = "EXPLICATII", nullable = false)
    protected String explicatii;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }

    public void setNrOrd(Integer nrOrd) {
        this.nrOrd = nrOrd;
    }

    public Integer getNrOrd() {
        return nrOrd;
    }

    public void setStareContracteServiciiOE(String stareContracteServiciiOE) {
        this.stareContracteServiciiOE = stareContracteServiciiOE;
    }

    public String getStareContracteServiciiOE() {
        return stareContracteServiciiOE;
    }

    public void setExplicatii(String explicatii) {
        this.explicatii = explicatii;
    }

    public String getExplicatii() {
        return explicatii;
    }


}