package vn.nhiempc.hirringcar.models;

public class FeeEntity {
    private String maMP;
    private String donGia;
    private String moTa;

    public FeeEntity() {
    }

    public FeeEntity(String maMP, String donGia, String moTa) {
        this.maMP = maMP;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    public String getMaMP() {
        return maMP;
    }

    public FeeEntity setMaMP(String maMP) {
        this.maMP = maMP;
        return this;
    }

    public String getDonGia() {
        return donGia;
    }

    public FeeEntity setDonGia(String donGia) {
        this.donGia = donGia;
        return this;
    }

    public String getMoTa() {
        return moTa;
    }

    public FeeEntity setMoTa(String moTa) {
        this.moTa = moTa;
        return this;
    }
}
