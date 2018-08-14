package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;

/**
 * Created by bayu on 02/08/18.
 */

@Entity
@Table(name = "transaksi_beli")
public class TransaksiBeli {

    @Id
    @Column(name = "id_transaksi_beli")
    private String idTransaksiBeli;

    @Column(name = "nomor_nota_transaksi_beli")
    private String nomorNotaTransaksiBeli;

    @Column(name = "tanggal_transaksi_beli")
    private Long tanggalTransaksiBeli;

    @Column(name = "kuantitas_transaksi_beli")
    private int kuantitasTransaksiBeli;

    @Column(name = "harga_satuan_transaksi_beli")
    private int hargaSatuanTransaksiBeli;

    @ManyToOne
    @JoinColumn(name = "id_barang")
    public Barang barangBeli;

    public String getIdTransaksiBeli() {
        return idTransaksiBeli;
    }

    public void setIdTransaksiBeli(String idTransaksiBeli) {
        this.idTransaksiBeli = idTransaksiBeli;
    }

    public String getNomorNotaTransaksiBeli() {
        return nomorNotaTransaksiBeli;
    }

    public void setNomorNotaTransaksiBeli(String nomorNotaTransaksiBeli) {
        this.nomorNotaTransaksiBeli = nomorNotaTransaksiBeli;
    }

    public Long getTanggalTransaksiBeli() {
        return tanggalTransaksiBeli;
    }

    public void setTanggalTransaksiBeli(Long tanggalTransaksiBeli) {
        this.tanggalTransaksiBeli = tanggalTransaksiBeli;
    }

    public int getKuantitasTransaksiBeli() {
        return kuantitasTransaksiBeli;
    }

    public void setKuantitasTransaksiBeli(int kuantitasTransaksiBeli) {
        this.kuantitasTransaksiBeli = kuantitasTransaksiBeli;
    }

    public int getHargaSatuanTransaksiBeli() {
        return hargaSatuanTransaksiBeli;
    }

    public void setHargaSatuanTransaksiBeli(int hargaSatuanTransaksiBeli) {
        this.hargaSatuanTransaksiBeli = hargaSatuanTransaksiBeli;
    }

    public Barang getBarangBeli() {
        return barangBeli;
    }

    public void setBarangBeli(Barang barangBeli) {
        this.barangBeli = barangBeli;
    }
}
