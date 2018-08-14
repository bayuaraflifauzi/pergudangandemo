package com.pergudangan.pergudangandemo.controller;

import com.pergudangan.pergudangandemo.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bayu on 02/08/18.
 */

@RestController
public class BarangController {

    @Autowired
    private BarangService barangService;

    @RequestMapping(value = "/barang", method = RequestMethod.GET)
    private ResponseEntity<?> getAllBarang(){
        return new ResponseEntity<Object>(barangService.getAllBarang(), HttpStatus.OK);
    }

    @RequestMapping(value = "/barang/{idBarang}", method = RequestMethod.GET)
    private ResponseEntity<?> getBarangById(@PathVariable("idBarang") String idBarang){
        return new ResponseEntity<Object>(barangService.getBarangById(idBarang), HttpStatus.OK);
    }

}
