/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.umy.datamahasiswa;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author user
 */
@Controller
public class DatabaseController {
    @GetMapping(value="/datamahasiswa/xml", produces ={
        MediaType.APPLICATION_XML_VALUE
        })
    
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswaXML(){
        
        List<Datamahasiswa> datamahasiswa =  new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        try{
            datamahasiswa = controller.findDatamahasiswaEntities();
        }
        catch (Exception e) {}
        return datamahasiswa;
    }
    @CrossOrigin
    @GetMapping(value="/datamahasiswa/json", produces= {
        MediaType.APPLICATION_JSON_VALUE
    }) 
    
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswaJson(){
        
        List<Datamahasiswa> datamahasiswa =  new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        try{
            datamahasiswa = controller.findDatamahasiswaEntities();
        }
        catch (Exception e) {}
        return datamahasiswa;
    }
    
}
