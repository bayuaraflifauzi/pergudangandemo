package com.pergudangan.pergudangandemo.controller;

import com.pergudangan.pergudangandemo.service.PemasokService;
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
public class PemasokController {

    @Autowired
    private PemasokService pemasokService;

    @RequestMapping(value = "/pemasok", method = RequestMethod.GET)
    ResponseEntity<?> getAllPemasok(){
        return new ResponseEntity<Object>(pemasokService.getAllPemasok(), HttpStatus.OK);
    }

    @RequestMapping(value = "/pemasok/{idPemasok}", method = RequestMethod.GET)
    private ResponseEntity<?> getPemasokById(@PathVariable("idPemasok") String idPemasok){
        return new ResponseEntity<Object>(pemasokService.getPemasokById(idPemasok), HttpStatus.OK);
    }

}
