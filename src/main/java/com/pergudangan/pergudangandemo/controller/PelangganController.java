package com.pergudangan.pergudangandemo.controller;

import com.pergudangan.pergudangandemo.service.GudangService;
import com.pergudangan.pergudangandemo.service.PelangganService;
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
public class PelangganController {

    @Autowired
    private PelangganService pelangganService;

    @RequestMapping(value = "/pelanggan", method = RequestMethod.GET)
    ResponseEntity<?> getAllPelanggan(){
        return new ResponseEntity<Object>(pelangganService.getAllPelanggan(), HttpStatus.OK);
    }

    @RequestMapping(value = "/jenis-barang/{idPelanggan}", method = RequestMethod.GET)
    private ResponseEntity<?> getPelangganById(@PathVariable("idPelanggan") String idPelanggan){
        return new ResponseEntity<Object>(pelangganService.getPelangganById(idPelanggan), HttpStatus.OK);
    }

}
