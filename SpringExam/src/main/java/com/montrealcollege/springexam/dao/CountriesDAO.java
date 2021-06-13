/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montrealcollege.springexam.dao;

import com.montrealcollege.springexam.model.Countries;

/**
 *
 * @author Vish
 */
public interface CountriesDAO {
    
    public Countries getCountriesById(int id);
    public int insertCountry(Countries con);
    public Countries getCountriesByName(String  name);
}
