import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class TesteInsert {
    
    
    public static void main (String [] args){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url, user, pass;
    url = "jdbc:mysql://localhost/teste";
    user = "root";
    pass = "";
    Connection cnt;
    cnt = DriverManager.getConnection(url, user, pass);
    
    String sql = "insert into cliente values(?, ?, ?)";
    PreparedStatement pst = cnt.prepareStatement(sql);
    //pst.setInt(1, 11);
    pst.setString(2, "Teste");
    pst.setString(3, "Teste@gmail.com");
    pst.executeUpdate();
    System.out.println("Executado com sucesso");
    } catch(ClassNotFoundException ex){
       System.out.println("Erro no registo" + ex.getMessage());
    } catch (SQLException ex){
        System.out.println("Erro no registro SQL" + ex.getMessage());
    }
    
    }
}
