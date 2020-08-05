package vn.nhiempc.hirringcar.services;

import vn.nhiempc.hirringcar.models.SupplierEntity;
import vn.nhiempc.hirringcar.models.VehicleTypeEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class HirringCarServices {
    private Connection connection;

    public HirringCarServices() {
    }

    public HirringCarServices(Connection connection) {
        this.connection = connection;
    }

    private List<VehicleTypeEntity> querryDatabase(String sql){
        List<VehicleTypeEntity> vehicleTypeEntities = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                VehicleTypeEntity vehicleTypeEntity = new VehicleTypeEntity(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3)
                );
                vehicleTypeEntities.add(vehicleTypeEntity);
            }
        }catch (Exception e){
            System.out.println("Error!");
        }
        return vehicleTypeEntities;
    }
    public List<VehicleTypeEntity> Question1(){
        String sql = "select * from dongxe where SoChoNgoi>5";
        List<VehicleTypeEntity> vehicleTypeEntities = querryDatabase(sql);
        return vehicleTypeEntities;
    }
    public List<SupplierEntity> Question2(){
        List<SupplierEntity> supplierEntities = new ArrayList<>();
        List<String> maNCC = new ArrayList<>();
        String getMaNCC = "select distinct MaNhaCC from mucphi mp join dangkycungcap dkcc on mp.MaMP=dkcc.MaMP join dongxe dx on dx.DongXe = dkcc.DongXe where (mp.DonGia=15000 && dx.HangXe like 'Toyota') OR (mp.DonGia=20000 && dx.HangXe like 'KIA')";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(getMaNCC);
            while (rs.next()){
                maNCC.add(rs.getString(1));
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        for (int i = 0; i<maNCC.size();i++){
            String getNCC = "select * from nhacungcap where MaNhaCC = '"+maNCC.get(i)+"'";
            try {
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(getNCC);
                while (rs.next()){
                    SupplierEntity supplierEntity = new SupplierEntity(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5)
                    );
                    supplierEntities.add(supplierEntity);
                }
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return supplierEntities;
    }
    public List<SupplierEntity> Question3(){
        List<SupplierEntity> supplierEntities = new ArrayList<>();
        String sql = "select * from nhacungcap order by TenNhaCC asc, MaSoThue desc";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                SupplierEntity supplierEntity = new SupplierEntity(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
                supplierEntities.add(supplierEntity);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        return supplierEntities;
    }
    public Map<String,Integer> Question4(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        String sql = "select MaNhaCC, count(MaNhaCC) from dangkycungcap where NgayBatDauCungCap = '2015-11-20' group by MaNhaCC";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                map.put(rs.getString(1), rs.getInt(2));
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        return map;
    }
    public List<String> Question5(){
        List<String> hangXe = new ArrayList<>();
        String sql = "select distinct HangXe from dongxe";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                hangXe.add(rs.getString(1));
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        return hangXe;
    }
    public List<List<String>> Question6(){
        List<List<String>> obj = new ArrayList<>();
        String sql = "select MaDKCC, dkcc.MaNhaCC, TenNhaCC, DiaChi, MaSoThue, TenLoaiDV, DonGia, HangXe, NgayBatDauCungCap, NgayKetThucCungCap from nhacungcap ncc left join dangkycungcap dkcc on ncc.MaNhaCC = dkcc.MaNhaCC left join mucphi mp on mp.MaMP = dkcc.MaMP left join loaidichvu ldv on ldv.MaLoaiDV = dkcc.MaLoaiDV left join dongxe dx on dx.DongXe = dkcc.DongXe";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                List<String> stringList = new ArrayList<>();
                stringList.add(rs.getString(1));
                stringList.add(rs.getString(2));
                stringList.add(rs.getString(3));
                stringList.add(rs.getString(4));
                stringList.add(rs.getString(5));
                stringList.add(rs.getString(6));
                stringList.add(rs.getString(7));
                stringList.add(rs.getString(8));
                stringList.add(rs.getString(9));
                stringList.add(rs.getString(10));
                obj.add(stringList);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        return obj;
    }
    public List<SupplierEntity> Question7(){
        List<SupplierEntity> supplierEntities = new ArrayList<>();
        List<String> maNCC = new ArrayList<>();
        String getMaNCC = "select distinct dkcc.MaNhaCC from nhacungcap ncc join dangkycungcap dkcc on ncc.MaNhaCC = dkcc.MaNhaCC join dongxe dx on dx.DongXe = dkcc.DongXe where dx.DongXe = 'Hiace' or dx.DongXe ='Cerato'";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(getMaNCC);
            while (rs.next()){
                maNCC.add(rs.getString(1));
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        for (int i = 0; i<maNCC.size();i++){
            String getNCC = "select * from nhacungcap where MaNhaCC = '"+maNCC.get(i)+"'";
            try {
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(getNCC);
                while (rs.next()){
                    SupplierEntity supplierEntity = new SupplierEntity(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5)
                    );
                    supplierEntities.add(supplierEntity);
                }
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return supplierEntities;
    }
    public List<SupplierEntity> Question8(){
        List<SupplierEntity> supplierEntities = new ArrayList<>();
        String sql = "select * from nhacungcap where MaNhaCC NOT IN(select distinct MaNhaCC from dangkycungcap group by MaNhaCC)";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                SupplierEntity supplierEntity = new SupplierEntity(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
                supplierEntities.add(supplierEntity);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        return supplierEntities;
    }
}
