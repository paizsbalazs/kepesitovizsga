package hu.nive.ujratervezes.kepesitovizsga;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {

        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select breed, expected, actual from dinosaur order by breed")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {

                String name = rs.getString("breed");
                int expected = rs.getInt("expected");
                int actual = rs.getInt("actual");

                if (expected<actual) {
                    names.add(name);
                }

            }
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select dino", se);
        }

    }
}
