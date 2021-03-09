package com.mb.models;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {

    @XmlAttribute
    private Long code;

    @XmlElement
    private double  amount;

    @XmlTransient
    private Date dateCreated;

    public Account() {
    }

    public Account(Long code, double amount, Date dateCreated) {
        this.code = code;
        this.amount = amount;
        this.dateCreated = dateCreated;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
