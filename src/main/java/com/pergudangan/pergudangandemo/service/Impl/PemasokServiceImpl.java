package com.pergudangan.pergudangandemo.service.Impl;

import com.pergudangan.pergudangandemo.model.Pemasok;
import com.pergudangan.pergudangandemo.repository.PemasokDao;
import com.pergudangan.pergudangandemo.service.PemasokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bayu on 01/08/18.
 */

@Service("PemasokService")
public class PemasokServiceImpl implements PemasokService {

    @Autowired
    private PemasokDao pemasokDao;

    @Override
    public List<Pemasok> getAllPemasok() {
        return pemasokDao.findAll();
    }

    @Override
    public Pemasok getPemasokById(String idPemasok) {
        return pemasokDao.getOne(idPemasok);
    }
}
