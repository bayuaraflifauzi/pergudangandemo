package com.pergudangan.pergudangandemo.controller;

import com.pergudangan.pergudangandemo.service.SatuanBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bayu on 01/08/18.
 */

@RestController
public class SatuanBarangController {

    @Autowired
    private SatuanBarangService satuanBarangService;

    @RequestMapping(value = "/satuan-barang", method = RequestMethod.GET)
    ResponseEntity<?> getAllSatuanBarang(){
        return new ResponseEntity<Object>(satuanBarangService.getAllSatuanBarang(), HttpStatus.OK);
    }

    @RequestMapping(value = "/satuan-barang/{idSatuanBarang}", method = RequestMethod.GET)
    private ResponseEntity<?> getSatuanBarangkById(@PathVariable("idSatuanBarang") String idSatuanBarang){
        return new ResponseEntity<Object>(satuanBarangService.getSatuanBarangById(idSatuanBarang), HttpStatus.OK);
    }
}
