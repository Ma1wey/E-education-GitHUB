package veres.project2;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class ShowDBContent{
    private final String URL = "jdbc:mysql://localhost:3306/e-education";
    private final String userName = "root";
    private final String password = "root";

    public DefaultTableModel getDataSI31Math() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Ім'я");
        defaultTableModel.addColumn("Прізвище");
        defaultTableModel.addColumn("Група");
        defaultTableModel.addColumn("Предмет");
        //SQL STATEMENT
        String sql = "SELECT studentName, studentSurname, studentGroup, studentSubject FROM subjectstudent where studentSubject LIKE '%Math%' AND studentGroup = 'SI31'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                
                String studentName = resultSet.getString("studentName");
                String studentSurname = resultSet.getString("studentSurname");
                String studentGroup = resultSet.getString("studentGroup");
                String studentSubject = resultSet.getString("studentSubject");
 
                defaultTableModel.addRow(new String[]{studentName, studentSurname, studentGroup, studentSubject});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }  
    public DefaultTableModel getDataSI32Math() {
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Ім'я");
        defaultTableModel.addColumn("Прізвище");
        defaultTableModel.addColumn("Група");
        defaultTableModel.addColumn("Предмет");
        
        String sql = "SELECT studentName, studentSurname, studentGroup, studentSubject FROM subjectstudent where studentSubject LIKE '%Math%' AND studentGroup = 'SI32'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                
                String studentName = resultSet.getString("studentName");
                String studentSurname = resultSet.getString("studentSurname");
                String studentGroup = resultSet.getString("studentGroup");
                String studentSubject = resultSet.getString("studentSubject");
 
                defaultTableModel.addRow(new String[]{studentName, studentSurname, studentGroup, studentSubject});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    } 
    
       public DefaultTableModel getDataSI31DB() {
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Ім'я");
        defaultTableModel.addColumn("Прізвище");
        defaultTableModel.addColumn("Група");
        defaultTableModel.addColumn("Предмет");
        
        String sql = "SELECT studentName, studentSurname, studentGroup, studentSubject FROM subjectstudent where studentSubject LIKE '%DB%' AND studentGroup = 'SI31'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                
                String studentName = resultSet.getString("studentName");
                String studentSurname = resultSet.getString("studentSurname");
                String studentGroup = resultSet.getString("studentGroup");
                String studentSubject = resultSet.getString("studentSubject");
 
                defaultTableModel.addRow(new String[]{studentName, studentSurname, studentGroup, studentSubject});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    } 
       
        public DefaultTableModel getDataSI32DB() {
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Ім'я");
        defaultTableModel.addColumn("Прізвище");
        defaultTableModel.addColumn("Група");
        defaultTableModel.addColumn("Предмет");
        
        String sql = "SELECT studentName, studentSurname, studentGroup, studentSubject FROM subjectstudent where studentSubject LIKE '%DB%' AND studentGroup = 'SI32'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                
                String studentName = resultSet.getString("studentName");
                String studentSurname = resultSet.getString("studentSurname");
                String studentGroup = resultSet.getString("studentGroup");
                String studentSubject = resultSet.getString("studentSubject");
 
                defaultTableModel.addRow(new String[]{studentName, studentSurname, studentGroup, studentSubject});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    } 
}


