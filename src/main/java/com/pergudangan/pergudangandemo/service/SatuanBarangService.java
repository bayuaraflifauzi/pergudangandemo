package com.pergudangan.pergudangandemo.service;

import com.pergudangan.pergudangandemo.model.SatuanBarang;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */
public interface SatuanBarangService {

    List<SatuanBarang> getAllSatuanBarang();
    SatuanBarang getSatuanBarangById(String idSatuanBarang);

}
