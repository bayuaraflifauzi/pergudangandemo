package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;

/**
 * Created by bayu on 02/08/18.
 */

@Entity
@Table(name = "transaksi_jual")
public class TransaksiJual {

    @Id
    @Column(name = "id_transaksi_jual")
    private String idTransaksiJual;

    @Column(name = "nomor_invoice_transaksi_jual")
    private String nomorInvoiceTransaksiJual;

    @Column(name = "tanggal_transaksi_jual")
    private Long tanggalTransaksiJual;

    @Column(name = "kuantitas_transaksi_jual")
    private int kuantitasTransaksiJual;

    @Column(name = "harga_jual_transaksi_jual")
    private int hargaJualTransaksiJual;

    @Column(name = "sub_total_transaksi_jual")
    private int subTotalTransaksiJual;

    @ManyToOne
    @JoinColumn(name = "id_barang")
    public Barang barangJual;

    @ManyToOne
    @JoinColumn(name = "id_pelanggan")
    public Pelanggan pelanggan;

    public String getIdTransaksiJual() {
        return idTransaksiJual;
    }

    public void setIdTransaksiJual(String idTransaksiJual) {
        this.idTransaksiJual = idTransaksiJual;
    }

    public String getNomorInvoiceTransaksiJual() {
        return nomorInvoiceTransaksiJual;
    }

    public void setNomorInvoiceTransaksiJual(String nomorInvoiceTransaksiJual) {
        this.nomorInvoiceTransaksiJual = nomorInvoiceTransaksiJual;
    }

    public Long getTanggalTransaksiJual() {
        return tanggalTransaksiJual;
    }

    public void setTanggalTransaksiJual(Long tanggalTransaksiJual) {
        this.tanggalTransaksiJual = tanggalTransaksiJual;
    }

    public int getKuantitasTransaksiJual() {
        return kuantitasTransaksiJual;
    }

    public void setKuantitasTransaksiJual(int kuantitasTransaksiJual) {
        this.kuantitasTransaksiJual = kuantitasTransaksiJual;
    }

    public int getHargaJualTransaksiJual() {
        return hargaJualTransaksiJual;
    }

    public void setHargaJualTransaksiJual(int hargaJualTransaksiJual) {
        this.hargaJualTransaksiJual = hargaJualTransaksiJual;
    }

    public int getSubTotalTransaksiJual() {
        return subTotalTransaksiJual;
    }

    public void setSubTotalTransaksiJual(int subTotalTransaksiJual) {
        this.subTotalTransaksiJual = subTotalTransaksiJual;
    }

    public Barang getBarangJual() {
        return barangJual;
    }

    public void setBarangJual(Barang barangJual) {
        this.barangJual = barangJual;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
}
