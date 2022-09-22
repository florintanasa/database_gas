package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|denInstElibActe")
@Table(name = "GAZ_INST_ELIB_ACTE")
@Entity(name = "gaz$InstElibActe")
public class InstElibActe extends StandardEntity {
    private static final long serialVersionUID = 2320581767223672190L;

    @NotNull
    @Column(name = "DEN_INST_ELIB_ACTE", nullable = false, length = 50)
    protected String denInstElibActe;

    @Column(name = "EXPLICATII_INST_ELIB_ACTE")
    protected String explicatiiInstElibActe;

    public void setExplicatiiInstElibActe(String explicatiiInstElibActe) {
        this.explicatiiInstElibActe = explicatiiInstElibActe;
    }

    public String getExplicatiiInstElibActe() {
        return explicatiiInstElibActe;
    }


    public void setDenInstElibActe(String denInstElibActe) {
        this.denInstElibActe = denInstElibActe;
    }

    public String getDenInstElibActe() {
        return denInstElibActe;
    }


}