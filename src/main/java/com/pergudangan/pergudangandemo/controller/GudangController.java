package com.pergudangan.pergudangandemo.controller;

import com.pergudangan.pergudangandemo.service.GudangService;
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
public class GudangController {

    @Autowired
    private GudangService gudangService;

    @RequestMapping(value = "/gudang", method = RequestMethod.GET)
    private ResponseEntity<?> getAllGudang(){
        return new ResponseEntity<Object>(gudangService.getAllGudang(), HttpStatus.OK);
    }

    @RequestMapping(value = "/gudang/{idGudang}", method = RequestMethod.GET)
    private ResponseEntity<?> getGudangById(@PathVariable("idGudang") String idGudang){
        return new ResponseEntity<Object>(gudangService.getGudangById(idGudang), HttpStatus.OK);
    }

}
