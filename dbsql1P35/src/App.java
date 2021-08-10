import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class App {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            //Select
            Connection conexion = DriverManager.getConnection(jdbcUrl);
            String sql = "select * from employees where salary>10000";
            Statement stm = conexion.createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                Integer id = resultado.getInt("employee_id");
                String nombre = resultado.getString("first_name");
                String apellido = resultado. getString("last_name");
                String telefono = resultado.getString("phone_number");
                Double salario = resultado.getDouble("salary");
                System.out.println(id + "\t" + nombre+"\t"+apellido+"\t"+telefono+"\t"+salario);
            }     
            resultado.close();
            stm.close();
            conexion.close();  
        } catch (Exception e) {
            System.out.println("Error al acceder a la base de datos");
            System.out.println(e.getMessage());
        }
        //Insert
        try {
            Connection conexioni = DriverManager.getConnection(jdbcUrl);
            String sqli = "insert into locations (location_id, city, country_id) values(4551,'Cali',57)";
            Statement stmi = conexioni.createStatement();
            int rows = stmi.executeUpdate(sqli);
            if (rows > 0){
                System.out.println("Registro creado con éxito");
            }
        } catch (Exception e) {
            System.out.println("No se pudo crear el registro");
            System.out.println(e.getMessage());
        }
        //update
        try {
            Connection conexionu = DriverManager.getConnection(jdbcUrl);
            String sqlu = "update locations set city = 'Pereira' where location_id = 4551";
            Statement stmu = conexionu.createStatement();
            int rows = stmu.executeUpdate(sqlu);
            if (rows >0){
                System.out.println("Registro actualizado");
            }
        } catch (Exception e) {
                System.out.println("No se pudo actualizar el registro");
        }
        //delete 
        try {
            Connection conexiond= DriverManager.getConnection(jdbcUrl);
            String sqld = "delete from departments where department_id between 23 and 37";
            Statement stmd = conexiond.createStatement();
            int rows = stmd.executeUpdate(sqld);
            if (rows >0){
                System.out.println("Registro borrado");
            }

        } catch (Exception e) {
            System.out.println("No se pudo borrar el registro");
        }
    }
}
