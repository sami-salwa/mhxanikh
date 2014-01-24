package museum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect
    {
        public static void main(String[] args)
        {
            try
            {
                Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

                String userName = "root";
                String password = "";
                String url = "jdbc:mysql://localhost:3306/image_db?zeroDateTimeBehavior=convertToNull [root on Default schema]2";
                Connection con = DriverManager.getConnection(url, userName, password);
                Statement s1 = con.createStatement();
                ResultSet rs = s1.executeQuery("SELECT * FROM foto");
                String[] result = new String[20];
                if(rs!=null){
                    while (rs.next()){
                        for(int i = 0; i <result.length ;i++)
                        {
                            for(int j = 0; j <result.length;j++)
                            {
                                result[j]=rs.getString(i);
                            System.out.println(result[j]);
                        }
                        }
                    }
                }

                //String result = new result[20];

            } catch (Exception e)
            {
                e.printStackTrace();
            }
    }


}

    