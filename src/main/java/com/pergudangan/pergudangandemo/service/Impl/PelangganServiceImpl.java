package com.pergudangan.pergudangandemo.service.Impl;

import com.pergudangan.pergudangandemo.model.Pelanggan;
import com.pergudangan.pergudangandemo.repository.PelangganDao;
import com.pergudangan.pergudangandemo.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */

@Service("PelangganService")
public class PelangganServiceImpl implements PelangganService {

    @Autowired
    private PelangganDao pelangganDao;

    @Override
    public List<Pelanggan> getAllPelanggan() {
        return pelangganDao.findAll();
    }

    @Override
    public Pelanggan getPelangganById(String idPelanggan) {
        return pelangganDao.getOne(idPelanggan);
    }
}
