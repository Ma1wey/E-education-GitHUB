package veres.project;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class SubjectsDB{
    private final String URL = "jdbc:mysql://localhost:3306/e-education";
    private final String userName = "root";
    private final String password = "root";

    public DefaultTableModel getData() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Ім'я викладача");
        defaultTableModel.addColumn("Прізвище викладача");
        defaultTableModel.addColumn("Дисципліни");
 
        String sql = "SELECT * FROM teacher";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String subjects = resultSet.getString("subject");
                defaultTableModel.addRow(new String[]{name, surname, subjects});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }   }

