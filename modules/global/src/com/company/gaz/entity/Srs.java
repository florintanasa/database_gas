package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|numeSrs")
@Table(name = "GAZ_SRS")
@Entity(name = "gaz$Srs")
public class Srs extends StandardEntity {
    private static final long serialVersionUID = 4304028637667697900L;

    @NotNull
    @Column(name = "NUME_SRS", nullable = false, length = 10)
    protected String numeSrs;

    public void setNumeSrs(String numeSrs) {
        this.numeSrs = numeSrs;
    }

    public String getNumeSrs() {
        return numeSrs;
    }


}