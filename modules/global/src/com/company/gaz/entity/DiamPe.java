package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|diamPe")
@Table(name = "GAZ_DIAM_PE")
@Entity(name = "gaz$DiamPe")
public class DiamPe extends StandardEntity {
    private static final long serialVersionUID = 3267626462079666334L;

    @NotNull
    @Column(name = "DIAM_PE", nullable = false, unique = true)
    protected Integer diamPe;

    public void setDiamPe(Integer diamPe) {
        this.diamPe = diamPe;
    }

    public Integer getDiamPe() {
        return diamPe;
    }


}