/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montrealcollege.springexam.model;

import javax.validation.constraints.NotNull;

/**
 *
 * @author Vish
 */

public class Countries {

    private String countryId;
    @NotNull
    private String countryName;
    private Integer regionId;

    @NotNull(message = "You must provide a name for the country")

    public Countries(String countryId, String countryName, Integer regionId) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.regionId = regionId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }




}
