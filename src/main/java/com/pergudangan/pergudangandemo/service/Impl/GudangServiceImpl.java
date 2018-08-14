package com.pergudangan.pergudangandemo.service.Impl;

import com.pergudangan.pergudangandemo.model.Gudang;
import com.pergudangan.pergudangandemo.repository.GudangDao;
import com.pergudangan.pergudangandemo.service.GudangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */
@Service("GudangService")
public class GudangServiceImpl implements GudangService {

    @Autowired
    private GudangDao gudangDao;

    @Override
    public List<Gudang> getAllGudang() {
        return gudangDao.findAll();
    }

    @Override
    public Gudang getGudangById(String idGudang) {
        return gudangDao.getOne(idGudang);
    }
}
