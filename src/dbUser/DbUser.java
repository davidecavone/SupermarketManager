package dbUser;

public class DbUser {
    private static DbUser instance = new DbUser();
    private String schemaName;
    private String userName;
    private String pwd;

    private DbUser() {
        schemaName = "supermarket_db";
        userName = "YOUR_USERNAME_HERE";
        pwd = "YOUR_PASSWORD_HERE";
    }

    public static DbUser getInstance() {
        return instance;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPwd() {
        return pwd;
    }

}
