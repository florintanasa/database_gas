package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|cotaTVA")
@Table(name = "GAZ_TVA")
@Entity(name = "gaz$Tva")
public class Tva extends StandardEntity {
    private static final long serialVersionUID = 5543409340219129793L;

    @NotNull
    @Column(name = "COTA_TVA", nullable = false)
    protected BigDecimal cotaTVA;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START", nullable = false)
    protected Date dataStart;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_STOP")
    protected Date dataStop;

    @NotNull
    @Column(name = "VALABIL", nullable = false)
    protected Boolean valabil = false;

    public void setCotaTVA(BigDecimal cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public BigDecimal getCotaTVA() {
        return cotaTVA;
    }

    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    public Date getDataStart() {
        return dataStart;
    }

    public void setDataStop(Date dataStop) {
        this.dataStop = dataStop;
    }

    public Date getDataStop() {
        return dataStop;
    }

    public void setValabil(Boolean valabil) {
        this.valabil = valabil;
    }

    public Boolean getValabil() {
        return valabil;
    }


}