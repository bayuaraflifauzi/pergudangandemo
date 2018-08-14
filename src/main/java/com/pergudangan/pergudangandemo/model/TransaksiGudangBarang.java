package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;

/**
 * Created by bayu on 02/08/18.
 */

@Entity
@Table(name = "transaksi_gudang_barang")
public class TransaksiGudangBarang {

    @Id
    @Column(name = "id_transaksi")
    private String idTransaksi;

    @Column(name = "kuantitas_barang_gudang")
    private int kuantitasBarangGudang;

    @Column(name = "status_barang")
    private String statusBarang;

    @ManyToOne
    @JoinColumn(name = "id_barang")
    public Barang barangJual;

    @ManyToOne
    @JoinColumn(name = "id_gudang")
    public Gudang gudang;

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getKuantitasBarangGudang() {
        return kuantitasBarangGudang;
    }

    public void setKuantitasBarangGudang(int kuantitasBarangGudang) {
        this.kuantitasBarangGudang = kuantitasBarangGudang;
    }

    public String getStatusBarang() {
        return statusBarang;
    }

    public void setStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
    }

    public Barang getBarangJual() {
        return barangJual;
    }

    public void setBarangJual(Barang barangJual) {
        this.barangJual = barangJual;
    }

    public Gudang getGudang() {
        return gudang;
    }

    public void setGudang(Gudang gudang) {
        this.gudang = gudang;
    }
}
