import dbConnection.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDbConnection {
    public static void main(String[] args) throws SQLException {
        IDbConnection conn = DbConnection.getInstance();

        int deRo = conn.executeUpdate("DELETE FROM product");
        System.out.println("Deleted Rows: " + deRo);

        int afRo = conn.executeUpdate("INSERT INTO product (barcode, pr_name, price, category)" +
                "VALUES ('11000', 'Patatine Pringles alla cipolla', 2.49, 'FOOD')");

        System.out.println("Inserted rows: " + afRo);

        ResultSet rs = conn.executeQuery("SELECT * FROM product;");
        while(rs.next()){
            System.out.println("Barcode: " + rs.getString("barcode"));
            System.out.println("Product name: " + rs.getDouble("price"));
            System.out.println("Category: " + rs.getString("category"));
        }

        conn.close();


    }
}
