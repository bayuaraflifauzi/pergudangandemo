package com.pergudangan.pergudangandemo.service.Impl;

import com.pergudangan.pergudangandemo.model.Barang;
import com.pergudangan.pergudangandemo.repository.BarangDao;
import com.pergudangan.pergudangandemo.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bayu on 02/08/18.
 */

@Service("BarangService")
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangDao barangDao;

    @Override
    public List<Barang> getAllBarang() {
        return barangDao.findAll();
    }

    @Override
    public Barang getBarangById(String idBarang) {
        return barangDao.getOne(idBarang);
    }
}
