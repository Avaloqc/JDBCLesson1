package JDBC1;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;


public class QueryExecution {

    public static void main(String[] args) {

        System.out.println("Test");

        PetDAO pet = new PetDAO();

        // =========================== 1 - Consulta =================================================
        List<Pet> pets = pet.list();
        System.out.println(pets.get(0));
        pets.stream().forEach(System.out::println);



    }


}
