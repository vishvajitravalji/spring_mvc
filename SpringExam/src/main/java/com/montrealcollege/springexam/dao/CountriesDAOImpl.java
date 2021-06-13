/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montrealcollege.springexam.dao;

import com.montrealcollege.springexam.model.Countries;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.activation.DataSource;
import javax.swing.tree.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Vish
 */
@Repository
public class CountriesDAOImpl implements CountriesDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Countries getCountriesById(int id) {
        String sql = "SELECT country_name, region_id "
                + "FROM COUNTRIES WHERE COUNTRY_ID = ? ";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                new BeanPropertyRowMapper<>(CountriesDAO.class));
    }

    @Override
    public int insertCountry(Countries con) {
        String sql = "Insert into countries"
                + " (country_id,country_name,region_id)  "
                + "VALUES(?,?,?)";
        return jdbcTemplate.update(sql,
                new Object[]{con.getCountryId(), con.getCountryName(), con.getRegionId()});
    }
    
    @Override
    
    public Countries getCountriesByName(String  name) {
    String sql = "SELECT * FROM countries";
   
        listCountry = jdbcTemplate.query(sql, new RowMapper<Contact>() {
            
            public Countries mapRow(ResultSet rs, int rowNum) throws SQLException {
                Countries con1 = new con1();
                con1.setCountryId(rs.getCountryId("country_id"));
                con1.setCountryName(rs.getCountryName("country_name"));
                con1.setRegionId(rs.getRegionId("region_id"));
                
                return con1;
            }
            
        }
s