package com.pergudangan.pergudangandemo.service;

import com.pergudangan.pergudangandemo.model.JenisBarang;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */
public interface JenisBarangService {

    List<JenisBarang> getAllJenisBarang();
    JenisBarang getJenisBarangById(String idJenisbarang);

}
