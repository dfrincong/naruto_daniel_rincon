package com.mycompany.narutodanielrincon.ninja.modelo.DAO;

import com.mycompany.narutodanielrincon.ninja.modelo.clases.Ninja;
import com.mycompany.narutodanielrincon.persistencia.ConexionBD;
import com.mycompany.narutodanielrincon.persistencia.Operaciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NinjaDao {

    public List<Ninja> getAll() {
        Operaciones.setConnection(ConexionBD.MySQLConnection());
        String stmGet = "SELECT * FROM ninja;";
        try (PreparedStatement ps = Operaciones.getConnection().prepareStatement(stmGet)) {
            ResultSet rs = Operaciones.query_db(ps);
            List<Ninja> listNinja = new ArrayList<>();
            while (rs.next()) {
                Ninja ninja = new Ninja();
                ninja.setId(rs.getInt("id"));
                ninja.setNombre(rs.getString("nombre"));
                ninja.setRango(rs.getString("rango"));
                ninja.setAldea(rs.getString("aldea"));
                listNinja.add(ninja);
            }

            for (Ninja ninja : listNinja) {
                String stmRelations = "SELECT * FROM habilidad;";
                PreparedStatement ps2 = Operaciones.getConnection().prepareStatement(stmRelations);
                ResultSet rs2 = Operaciones.query_db(ps2);
            }

            return listNinja;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error has occurred: " + e.getMessage());
        }
        return null;
    }
    
}
