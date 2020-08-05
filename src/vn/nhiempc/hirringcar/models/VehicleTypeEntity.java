package vn.nhiempc.hirringcar.models;

public class VehicleTypeEntity {
    private String dongXe;
    private String hangXe;
    private int soChoNgoi;

    public VehicleTypeEntity() {
    }

    public VehicleTypeEntity(String dongXe, String hangXe, int soChoNgoi) {
        this.dongXe = dongXe;
        this.hangXe = hangXe;
        this.soChoNgoi = soChoNgoi;
    }

    public String getDongXe() {
        return dongXe;
    }

    public VehicleTypeEntity setDongXe(String dongXe) {
        this.dongXe = dongXe;
        return this;
    }

    public String getHangXe() {
        return hangXe;
    }

    public VehicleTypeEntity setHangXe(String hangXe) {
        this.hangXe = hangXe;
        return this;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public VehicleTypeEntity setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
        return this;
    }
}
