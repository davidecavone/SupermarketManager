package dbConnection;

import java.sql.ResultSet;

public interface IDbConnection {
    ResultSet executeQuery(String query);
    int executeUpdate(String update);
    void close();
}
