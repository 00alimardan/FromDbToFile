package Exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SaveToDatabase {
    private static final List<Person> people = Application.getPeople();

    public static void loadPeopleToDb(){
        connectToDatabase(people.toString());
    }
    public static void getFromDb(){
        people.forEach(System.out::println);
    }

    private static void connectToDatabase(String data) {
        try {
            Connection connection = DriverManager.getConnection(
                    "url",
                    "postgres",
                    "password");
            String createTableQuery = "CREATE TABLE IF NOT EXISTS TABLE_NAME (data TEXT)";
            String insertDataQuery = "INSERT INTO TABLE.NAME(data) VALUES (?)";

            PreparedStatement createTableStatement = connection.prepareStatement(createTableQuery);
            createTableStatement.executeUpdate();

            PreparedStatement insertDataStatement = connection.prepareStatement(insertDataQuery);
            insertDataStatement.setString(1,data);
            insertDataStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
