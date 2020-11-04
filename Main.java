package lesson2;

import java.io.*;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;


        public static void main(String[] args) throws IOException, SQLException {
            try {
                connect();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            Scanner sc = new Scanner(new File("D:/text.txt"));
            int valueForId;
            String [] splitted;
            String valueForName;
            int valueForScore;
            preparedStatement = connection.prepareStatement("INSERT INTO main (id, name, score) VALUES (?, ?, ?);");
            while(sc.hasNext()){
                splitted = sc.nextLine().split(" ");
                valueForId = Integer.parseInt(splitted[0]);
                valueForName = splitted[1];
                valueForScore = Integer.parseInt(splitted[2]);
                preparedStatement.setInt(1, valueForId);
                preparedStatement.setString(2, valueForName);
                preparedStatement.setInt(3, valueForScore);
                preparedStatement.executeUpdate();
            }


            disconnect();
        }


    private static void connect() throws ClassNotFoundException, SQLException {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:D:/SQLIte/SQLiteStudio/maindb.db");
            statement = connection.createStatement();

    }

    private static void disconnect(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void createTable() {
        String createSQL = "CREATE TABLE MyNewTable " +
                "( id   INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " name TEXT," +
                " score INTEGER )";
        try {
            statement.executeUpdate(createSQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void addValueInTable() {
            try {
            statement.executeUpdate("INSERT INTO main (name, score) VALUES ('BOB7', '50');");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void deleteFromTable() {
        try {
            statement.executeUpdate("DELETE FROM main WHERE id=7;");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void deleteTable() {
        try {
            statement.executeUpdate("DROP TABLE MyNewTable;");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
