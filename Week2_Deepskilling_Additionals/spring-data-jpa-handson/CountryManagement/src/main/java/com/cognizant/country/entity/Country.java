package com.cognizant.country.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code", length = 2)
    private String coCode;

    @Column(name = "co_name", length = 100, nullable = false)
    private String coName;

    // Constructors
    public Country() {
    }

    public Country(String coCode, String coName) {
        this.coCode = coCode;
        this.coName = coName;
    }

    // Getters and Setters
    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }
}
