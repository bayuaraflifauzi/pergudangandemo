package com.pergudangan.pergudangandemo.service;

import com.pergudangan.pergudangandemo.model.Pelanggan;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */
public interface PelangganService {

    List<Pelanggan> getAllPelanggan();
    Pelanggan getPelangganById(String idPelanggan);
}
