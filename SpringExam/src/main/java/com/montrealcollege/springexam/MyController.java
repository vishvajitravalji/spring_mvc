/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.montrealcollege.springexam;


import com.montrealcollege.springexam.dao.CountriesDAO;
import com.montrealcollege.springexam.model.Countries;
import javax.enterprise.inject.Model;
import static javax.swing.text.StyleConstants.ModelAttribute;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vish
 */
@Controller
@RequestMapping("/countries")
public class MyController {
        @Autowired
    private CountriesDAO dao;

    @GetMapping
    public String showForm(Model model){
        model.addAttribute("country", new Countries());
        return "countryForm";
    }
    
    @PostMapping
    public String createCountry(@ModelAttribute @Valid Countries country, 
                        BindingResult binding, Model model) {
        System.out.println("Errors:" + binding.hasErrors());
        if(binding.hasErrors()){
            return "countryForm"; 
        } else {
            dao.insertCountry(Countries);
            return "result"; 
        }
        
    }
}
