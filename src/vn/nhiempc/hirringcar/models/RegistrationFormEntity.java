package vn.nhiempc.hirringcar.models;

import java.util.Date;

public class RegistrationFormEntity {
    private  String maDKCC;
    private Date ngayBatDauCungCap;
    private Date ngayKetThucCungCap;
    private int soLuongXeDangKy;
    private String maNhaCC;
    private String maLoaiDV;
    private String dongXe;
    private String maMP;

    public RegistrationFormEntity() {
    }

    public RegistrationFormEntity(String maDKCC, Date ngayBatDauCungCap, Date ngayKetThucCungCap, int soLuongXeDangKy, String maNhaCC, String maLoaiDV, String dongXe, String maMP) {
        this.maDKCC = maDKCC;
        this.ngayBatDauCungCap = ngayBatDauCungCap;
        this.ngayKetThucCungCap = ngayKetThucCungCap;
        this.soLuongXeDangKy = soLuongXeDangKy;
        this.maNhaCC = maNhaCC;
        this.maLoaiDV = maLoaiDV;
        this.dongXe = dongXe;
        this.maMP = maMP;
    }

    public String getMaDKCC() {
        return maDKCC;
    }

    public RegistrationFormEntity setMaDKCC(String maDKCC) {
        this.maDKCC = maDKCC;
        return this;
    }

    public Date getNgayBatDauCungCap() {
        return ngayBatDauCungCap;
    }

    public RegistrationFormEntity setNgayBatDauCungCap(Date ngayBatDauCungCap) {
        this.ngayBatDauCungCap = ngayBatDauCungCap;
        return this;
    }

    public Date getNgayKetThucCungCap() {
        return ngayKetThucCungCap;
    }

    public RegistrationFormEntity setNgayKetThucCungCap(Date ngayKetThucCungCap) {
        this.ngayKetThucCungCap = ngayKetThucCungCap;
        return this;
    }

    public int getSoLuongXeDangKy() {
        return soLuongXeDangKy;
    }

    public RegistrationFormEntity setSoLuongXeDangKy(int soLuongXeDangKy) {
        this.soLuongXeDangKy = soLuongXeDangKy;
        return this;
    }

    public String getMaNhaCC() {
        return maNhaCC;
    }

    public RegistrationFormEntity setMaNhaCC(String maNhaCC) {
        this.maNhaCC = maNhaCC;
        return this;
    }

    public String getMaLoaiDV() {
        return maLoaiDV;
    }

    public RegistrationFormEntity setMaLoaiDV(String maLoaiDV) {
        this.maLoaiDV = maLoaiDV;
        return this;
    }

    public String getDongXe() {
        return dongXe;
    }

    public RegistrationFormEntity setDongXe(String dongXe) {
        this.dongXe = dongXe;
        return this;
    }

    public String getMaMP() {
        return maMP;
    }

    public RegistrationFormEntity setMaMP(String maMP) {
        this.maMP = maMP;
        return this;
    }
}
