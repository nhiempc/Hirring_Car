package vn.nhiempc.hirringcar.models;

public class SupplierEntity {
    private String maNhaCC;
    private String tenNhaCC;
    private String diaChi;
    private String soDT;
    private String maSoThue;

    public SupplierEntity() {
    }

    public SupplierEntity(String maNhaCC, String tenNhaCC, String diaChi, String soDT, String maSoThue) {
        this.maNhaCC = maNhaCC;
        this.tenNhaCC = tenNhaCC;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.maSoThue = maSoThue;
    }

    public String getMaNhaCC() {
        return maNhaCC;
    }

    public SupplierEntity setMaNhaCC(String maNhaCC) {
        this.maNhaCC = maNhaCC;
        return this;
    }

    public String getTenNhaCC() {
        return tenNhaCC;
    }

    public SupplierEntity setTenNhaCC(String tenNhaCC) {
        this.tenNhaCC = tenNhaCC;
        return this;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public SupplierEntity setDiaChi(String diaChi) {
        this.diaChi = diaChi;
        return this;
    }

    public String getSoDT() {
        return soDT;
    }

    public SupplierEntity setSoDT(String soDT) {
        this.soDT = soDT;
        return this;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public SupplierEntity setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
        return this;
    }
}
