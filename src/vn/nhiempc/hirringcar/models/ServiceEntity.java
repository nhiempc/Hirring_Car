package vn.nhiempc.hirringcar.models;

public class ServiceEntity {
    private String maLoaiDV;
    private String tenLoaiDV;

    public ServiceEntity() {
    }

    public ServiceEntity(String maLoaiDV, String tenLoaiDV) {
        this.maLoaiDV = maLoaiDV;
        this.tenLoaiDV = tenLoaiDV;
    }

    public String getMaLoaiDV() {
        return maLoaiDV;
    }

    public ServiceEntity setMaLoaiDV(String maLoaiDV) {
        this.maLoaiDV = maLoaiDV;
        return this;
    }

    public String getTenLoaiDV() {
        return tenLoaiDV;
    }

    public ServiceEntity setTenLoaiDV(String tenLoaiDV) {
        this.tenLoaiDV = tenLoaiDV;
        return this;
    }
}
