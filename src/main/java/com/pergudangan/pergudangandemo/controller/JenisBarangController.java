package com.pergudangan.pergudangandemo.controller;

import com.pergudangan.pergudangandemo.service.JenisBarangService;
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
public class JenisBarangController {

    @Autowired
    private JenisBarangService jenisBarangService;

    @RequestMapping(value = "/jenis-barang", method = RequestMethod.GET)
    private ResponseEntity<?> getAllJenisBarang(){
        return new ResponseEntity<Object>(jenisBarangService.getAllJenisBarang(), HttpStatus.OK);
    }

    @RequestMapping(value = "/jenis-barang/{idJenisBarang}", method = RequestMethod.GET)
    private ResponseEntity<?> getJenisBarangById(@PathVariable("idJenisBarang") String idJenisBarang){
        return new ResponseEntity<Object>(jenisBarangService.getAllJenisBarang(), HttpStatus.OK);
    }

}
