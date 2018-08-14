package com.pergudangan.pergudangandemo.service;

import com.pergudangan.pergudangandemo.model.Gudang;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */
public interface GudangService {

    List<Gudang> getAllGudang();
    Gudang getGudangById(String idGudang);
}
