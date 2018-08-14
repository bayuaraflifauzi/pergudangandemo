package com.pergudangan.pergudangandemo.service.Impl;

import com.pergudangan.pergudangandemo.model.SatuanBarang;
import com.pergudangan.pergudangandemo.repository.SatuanBarangDao;
import com.pergudangan.pergudangandemo.service.SatuanBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */

@Service("SatuanBarangService")
public class SatuanBarangServiceImpl implements SatuanBarangService {

    @Autowired
    private SatuanBarangDao satuanBarangDao;

    @Override
    public List<SatuanBarang> getAllSatuanBarang() {
        return satuanBarangDao.findAll();
    }

    @Override
    public SatuanBarang getSatuanBarangById(String idSatuanBarang) {
        return satuanBarangDao.getOne(idSatuanBarang);
    }
}
