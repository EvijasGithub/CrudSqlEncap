import java.sql.*;

public class Crud {
    //Private variables declared
    private String CR;
    private String USER;
    private String PASSWORD;
    //Getting methods
    public String getCR(){
        return CR;
    }
    public String getUSER(){
        return USER;
    }
    public String getPASSWORD(){
        return PASSWORD;
    }
    //Setting methods
    public void setCR(String newCR){
        CR=newCR;
    }
    public void setUSER(String newUSER){
        USER=newUSER;
    }
    public void setPASSWORD(String newPASSWORD){
        PASSWORD=newPASSWORD;
    }

    //insert
    public void insert(){
        try{

            Connection connection= DriverManager.getConnection(CR,USER,PASSWORD);
            Statement statement=connection.createStatement();

            String mySQL="INSERT INTO users(email, name) VALUES('D@D.com','David')";
            statement.executeUpdate(mySQL);
            System.out.println("Data was successfully added");

        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    //delete
    public void delete(){
        try{

            Connection connection= DriverManager.getConnection(CR,USER,PASSWORD);
            Statement statement=connection.createStatement();

            String mySQL="DELETE FROM users WHERE id = 3";
            statement.executeUpdate(mySQL);
            System.out.println("Data was deleted");

        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    //update
    public void update(){
        try{

            Connection connection= DriverManager.getConnection(CR,USER,PASSWORD);
            Statement statement=connection.createStatement();

            String sql="UPDATE users SET email='x@x.lv' WHERE id=1";
            statement.executeUpdate(sql);
            System.out.println("Data was updated");

        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    //select
    public void select(){
        try{

            Connection connection= DriverManager.getConnection(CR,USER,PASSWORD);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT id,email,name FROM users");

            String mySQL="UPDATE users SET email='g@g.com' WHERE id=4";
            while(resultSet.next()){
                System.out.println("id: "+resultSet.getInt("id"));
                System.out.println("email: "+resultSet.getString("email"));
                System.out.println("name: "+resultSet.getString("name"));
                System.out.println("   ");

            }

        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
}
