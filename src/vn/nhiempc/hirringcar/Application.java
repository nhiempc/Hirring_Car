package vn.nhiempc.hirringcar;

import vn.nhiempc.hirringcar.models.SupplierEntity;
import vn.nhiempc.hirringcar.models.VehicleTypeEntity;
import vn.nhiempc.hirringcar.services.HirringCarServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/thue_xe_cms", "root", "123456");
            System.out.println("SQL Connection to database established!");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
        }
        HirringCarServices vehicleTypeServices = new HirringCarServices(connection);
        System.out.println("Question 1: ");
        List<VehicleTypeEntity> question1 = vehicleTypeServices.Question1();
        if(question1==null||question1.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(VehicleTypeEntity result: question1){
                System.out.println("Dòng xe: "+result.getDongXe()+" | Số chỗ ngồi: "+result.getSoChoNgoi());
            }
        }
        System.out.println();
        System.out.println("Question 2: ");
        List<SupplierEntity> question2 = vehicleTypeServices.Question2();
        if(question2==null||question2.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(SupplierEntity result: question2){
                System.out.println("Mã NCC: "+result.getMaNhaCC()+" | Tên NCC: "+result.getTenNhaCC()+" | Địa chỉ: "+result.getDiaChi()+" | SĐT: "+result.getSoDT()+" | Mã số thuế: "+result.getMaSoThue());
            }
        }
        System.out.println();
        System.out.println("Question 3: ");
        List<SupplierEntity> question3 = vehicleTypeServices.Question3();
        if(question3==null||question3.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(SupplierEntity result: question3){
                System.out.println("Mã NCC: "+result.getMaNhaCC()+" | Tên NCC: "+result.getTenNhaCC()+" | Địa chỉ: "+result.getDiaChi()+" | SĐT: "+result.getSoDT()+" | Mã số thuế: "+result.getMaSoThue());
            }
        }
        System.out.println();
        System.out.println("Question 4: ");
        Map<String,Integer> question4 = vehicleTypeServices.Question4();
        if(question4==null||question4.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            Set<String> set = question4.keySet();
            for(String key: set){
                System.out.println("Mã NCC: "+key+" | Số lần đăng ký: "+question4.get(key));
            }
        }
        System.out.println();
        System.out.println("Question 5: ");
        List<String> question5 = vehicleTypeServices.Question5();
        if(question5==null||question5.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(String result: question5){
                System.out.println("Hãng: "+result);
            }
        }
        System.out.println();
        System.out.println("Question 6: ");
        List<List<String>> question6 = vehicleTypeServices.Question6();
        if(question6==null||question6.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(List<String> result: question6){
                System.out.println("Mã ĐKCC: "+result.get(0)+" | Mã NCC: "+result.get(1)+" | Tên NCC: "+result.get(2)+" | Địa chỉ: "+result.get(3)+" | Mã số thuế: "+result.get(4)+" | Tên loại DV: "+result.get(5)+" | Đơn giá: "+result.get(6)+" | Hãng xe: "+result.get(7));
            }
        }
        System.out.println();
        System.out.println("Question 7: ");
        List<SupplierEntity> question7 = vehicleTypeServices.Question7();
        if(question7==null||question7.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(SupplierEntity result: question7){
                System.out.println("Mã NCC: "+result.getMaNhaCC()+" | Tên NCC: "+result.getTenNhaCC()+" | Địa chỉ: "+result.getDiaChi()+" | SĐT: "+result.getSoDT()+" | Mã số thuế: "+result.getMaSoThue());
            }
        }
        System.out.println();
        System.out.println("Question 8: ");
        List<SupplierEntity> question8 = vehicleTypeServices.Question8();
        if(question8==null||question8.isEmpty()){
            System.out.println("Không có dữ liệu!");
        }else{
            for(SupplierEntity result: question8){
                System.out.println("Mã NCC: "+result.getMaNhaCC()+" | Tên NCC: "+result.getTenNhaCC()+" | Địa chỉ: "+result.getDiaChi()+" | SĐT: "+result.getSoDT()+" | Mã số thuế: "+result.getMaSoThue());
            }
        }
    }
}
