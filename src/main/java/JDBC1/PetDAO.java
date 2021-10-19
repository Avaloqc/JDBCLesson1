package JDBC1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetDAO {

    public List<Pet> list() {
        List<Pet> pets = new ArrayList<>();

        try (Connection conx = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM test.pets";
            PreparedStatement prst = conx.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();

            if (rs.next()) {
               String name = rs.getString("name");
               String owner = rs.getString("owner");
               String species = rs.getString("species");
               String sex = rs.getString("sex");
               String birth = rs.getString("birth");
               String death = rs.getString("death");

               Pet pet = new Pet(name, owner, species, sex, birth, death);
               pets.add(pet);
                System.out.println(pets.get(0));
            }

        } catch (SQLException e) {

            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }

        return pets;
    }

}
