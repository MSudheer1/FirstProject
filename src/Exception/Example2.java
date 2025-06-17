package Exception;

import java.sql.SQLException;

public class Example2 {
    public void division(int n1,int n2)throws SQLException {
        throw new SQLException("Exception");
    }
}
