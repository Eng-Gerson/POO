package program;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
import db.DbException;
import db.DB;

public class Program{
    public static void main(String[] nogueira)throws Exception{
        try(Connection conn = DB.getConnection()){
        CdeCriar(conn);
        RdeLer(conn);
     //UdeActualizar(conn);
     //DdeDeletar();
        } catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        DB.closeConnection();	 
    }
    
    public static int inteiro(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }
    public static String varchar(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }
    public static void CdeCriar(Connection conn)throws Exception{
         String sql = "INSERT INTO aluno (id_aluno,nome,cidade,idade) VALUES (?, ?, ?, ?)";
         try(PreparedStatement stmt = conn.prepareStatement(sql)){
         stmt.setInt(1,inteiro("Insira o id do aluno"));
         stmt.setString(2,varchar("Insira o nome do aluno"));
         stmt.setString(3,varchar("Insira a província de origem do aluno"));
         stmt.setInt(4, inteiro("Insira a idade do aluno"));
         stmt.executeUpdate();
         }
         catch(SQLException e){
             throw new DbException(e.getMessage());
         }
    }
    
    public static void RdeLer(Connection conn)throws Exception{
            String sql1 = "SELECT * FROM aluno";
            try(PreparedStatement stmt1 = conn.prepareStatement(sql1);ResultSet rs = stmt1.executeQuery()){
            System.out.println("#============DADOS DOS ALUNOS============#");
            while (rs.next()) {
                int id = rs.getInt("id_aluno");
                String nome = rs.getString("nome");
                String cidade = rs.getString("cidade");
                int idade = rs.getInt("idade");
                System.out.println(id + " - "+nome+" - "+cidade+" - "+idade);
            } 
            }catch(SQLException e){
                        throw new DbException(e.getMessage());
                    }
    }
    
    /*public static void UdeActualizar(Connection conn)throws Exception{
        String sql = "UPDATE idade FROM aluno";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){}catch(SQLExceptio e){throw new DbException(e.getMessage())}
    }*/
}