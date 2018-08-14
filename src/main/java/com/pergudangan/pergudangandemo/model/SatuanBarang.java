package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bayu on 24/07/18.
 */
@Entity
@Table(name = "satuan_barang")
public class SatuanBarang {

    @Id
    @Column(name = "id_satuan_barang")
    private String idSatuanBarang;

    @Column(name = "nama_satuan_barang")
    private String namaSatuanBarang;

    @OneToMany(mappedBy = "satuanBarang")
    public List<Barang> daftarBarang;

    public String getIdSatuanBarang() {
        return idSatuanBarang;
    }

    public void setIdSatuanBarang(String idSatuanBarang) {
        this.idSatuanBarang = idSatuanBarang;
    }

    public String getNamaSatuanBarang() {
        return namaSatuanBarang;
    }

    public void setNamaSatuanBarang(String namaSatuanBarang) {
        this.namaSatuanBarang = namaSatuanBarang;
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(List<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
}
