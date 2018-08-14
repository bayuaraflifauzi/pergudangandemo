package com.pergudangan.pergudangandemo.service;

import com.pergudangan.pergudangandemo.model.Barang;

import java.util.List;

/**
 * Created by bayu on 02/08/18.
 */
public interface BarangService {

    List<Barang> getAllBarang();
    Barang getBarangById(String idBarang);
}
