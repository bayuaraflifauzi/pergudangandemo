package com.pergudangan.pergudangandemo.service;

import com.pergudangan.pergudangandemo.model.Pemasok;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */
public interface PemasokService {

    List<Pemasok> getAllPemasok();
    Pemasok getPemasokById(String idPemasok);
}
