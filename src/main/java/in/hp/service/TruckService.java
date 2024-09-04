package in.hp.service;

import in.hp.entity.Truck;
import in.hp.utils.ConnectionDetails;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TruckService {
    public String addTruck(Truck truck){
        String status = null;
        String sql = "insert into truck(name,model,capacity,driver_name) values (?,?,?,?)";
        try{
            Connection con = ConnectionDetails.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,truck.getName());
            pst.setString(2,truck.getModel());
            pst.setInt(3,truck.getCapacity());
            pst.setString(4,truck.getDriver_name());

            int rowsAffected = pst.executeUpdate();
            status = "Rows Inserted : "+rowsAffected;
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }

    public Truck getTruckByID(int id){
        String sql = "select * from truck where id = ?";
        Truck truck = null;
        try{
            Connection con = ConnectionDetails.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                truck.setId(rs.getInt("id"));
                truck.setName(rs.getString("name"));
                truck.setModel(rs.getString("model"));
                truck.setModel(rs.getString("capacity"));
                truck.setModel(rs.getString("driver_name"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return truck;
    }

    public void updateTruck(Truck truck){
        String sql = "update truck name = ?, model = ?, capacity = ?, driver_name = ? where id = ?";
        try{
            Connection con = ConnectionDetails.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,truck.getName());
            pst.setString(2,truck.getModel());
            pst.setInt(3,truck.getCapacity());
            pst.setString(4,truck.getDriver_name());
            pst.setInt(5,truck.getId());

            int rowsAffected = pst.executeUpdate();

            System.out.println("Rows Updated : "+ rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Truck> getAllTrucks(){
        String sql = "select * from truck";
        List<Truck> trucks = new ArrayList<Truck>();
        try{
            Connection con = ConnectionDetails.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                Truck truck = new Truck();
                truck.setId(rs.getInt("id"));
                truck.setName(rs.getString("name"));
                truck.setModel(rs.getString("model"));
                truck.setCapacity(rs.getInt("capacity"));
                truck.setDriver_name(rs.getString("driver_name"));
                trucks.add(truck);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return trucks;
    }

    public void deleteTruck(int id){
        String sql = "delete from truck where id = ?";
        try{
            Connection con = ConnectionDetails.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            int rowsAffected = pst.executeUpdate();
            System.out.println("Rows Deleted : "+rowsAffected);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean alreadyExist(Truck truck){
        String sql = "select * from truck";
        boolean bool = true;
        try{
            Connection con = ConnectionDetails.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("name").equals(truck.getName())){
                    bool = true;
                }
                else{
                    bool = false;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }
}
