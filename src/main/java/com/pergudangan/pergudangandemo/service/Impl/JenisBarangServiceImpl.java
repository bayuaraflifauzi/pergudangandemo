package com.pergudangan.pergudangandemo.service.Impl;

import com.pergudangan.pergudangandemo.model.JenisBarang;
import com.pergudangan.pergudangandemo.repository.JenisBarangDao;
import com.pergudangan.pergudangandemo.service.JenisBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */

@Service("JenisBarangService")
public class JenisBarangServiceImpl implements JenisBarangService {

    @Autowired
    private JenisBarangDao jenisBarangDao;

    @Override
    public List<JenisBarang> getAllJenisBarang() {
        return jenisBarangDao.findAll();
    }

    @Override
    public JenisBarang getJenisBarangById(String idJenisbarang) {
        return jenisBarangDao.getOne(idJenisbarang);
    }
}
