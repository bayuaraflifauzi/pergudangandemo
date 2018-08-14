package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bayu on 24/07/18.
 */

@Entity
@Table(name = "barang")
public class Barang {

    @Id
    @Column(name = "id_barang")
    private String idBarang;

    @Column(name = "nama_barang")
    private String namaBarang;

    @Column(name = "harga_modal_barang")
    private int hargaModalBarang;

    @OneToMany(mappedBy = "jualBarang")
    public List<TransaksiJual> daftarTransaksiJual;

    @OneToMany(mappedBy = "beliBarang")
    public List<TransaksiBeli> daftarTransaksiBeli;

    @OneToMany(mappedBy = "gudangBarang")
    public List<TransaksiGudangBarang> daftarGudangBarang;

    @ManyToOne
    @JoinColumn(name = "id_jenis_barang")
    public JenisBarang jenisBarang;

    @ManyToOne
    @JoinColumn(name = "id_satuan_barang")
    public SatuanBarang satuanBarang;

    @ManyToOne
    @JoinColumn(name = "id_pemasok")
    public Pemasok pemasok;

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaModalBarang() {
        return hargaModalBarang;
    }

    public void setHargaModalBarang(int hargaModalBarang) {
        this.hargaModalBarang = hargaModalBarang;
    }

    public List<TransaksiJual> getDaftarTransaksiJual() {
        return daftarTransaksiJual;
    }

    public void setDaftarTransaksiJual(List<TransaksiJual> daftarTransaksiJual) {
        this.daftarTransaksiJual = daftarTransaksiJual;
    }

    public List<TransaksiBeli> getDaftarTransaksiBeli() {
        return daftarTransaksiBeli;
    }

    public void setDaftarTransaksiBeli(List<TransaksiBeli> daftarTransaksiBeli) {
        this.daftarTransaksiBeli = daftarTransaksiBeli;
    }

    public List<TransaksiGudangBarang> getDaftarGudangBarang() {
        return daftarGudangBarang;
    }

    public void setDaftarGudangBarang(List<TransaksiGudangBarang> daftarGudangBarang) {
        this.daftarGudangBarang = daftarGudangBarang;
    }

    public JenisBarang getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(JenisBarang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public SatuanBarang getSatuanBarang() {
        return satuanBarang;
    }

    public void setSatuanBarang(SatuanBarang satuanBarang) {
        this.satuanBarang = satuanBarang;
    }

    public Pemasok getPemasok() {
        return pemasok;
    }

    public void setPemasok(Pemasok pemasok) {
        this.pemasok = pemasok;
    }
}
