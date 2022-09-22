package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|stareOferteContracteRacordareSD")
@Table(name = "GAZ_STATUS_OFERTE_CONTRACTE_RACORDARE_SD")
@Entity(name = "gaz$StatusOferteContracteRacordareSD")
public class StatusOferteContracteRacordareSD extends StandardEntity {
    private static final long serialVersionUID = -8052589591387139436L;

    @NotNull
    @Column(name = "NR_ORD", nullable = false, unique = true)
    protected Integer nrOrd;

    @NotNull
    @Column(name = "STARE_OFERTE_CONTRACTE_RACORDARE_SD", nullable = false, unique = true)
    protected String stareOferteContracteRacordareSD;

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

    public void setStareOferteContracteRacordareSD(String stareOferteContracteRacordareSD) {
        this.stareOferteContracteRacordareSD = stareOferteContracteRacordareSD;
    }

    public String getStareOferteContracteRacordareSD() {
        return stareOferteContracteRacordareSD;
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