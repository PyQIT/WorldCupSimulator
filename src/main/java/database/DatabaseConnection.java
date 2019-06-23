package database;

import newgame.GroupShuffle;
import newgame.GroupStageRand;
import newgame.LessThan32Teams;
import newgame.TeamsList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private Connection connection = null;

    public void initialConnectionDatabase() {
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:teams.db");
            Statement statement = connection.createStatement();
            InsertsToDatabase itd = new InsertsToDatabase();
            TeamsList teamsList = new TeamsList();
            teamsList.setStatement(statement);
            GroupStageRand groupStageRand = new GroupStageRand();
            groupStageRand.setStatement(statement);
            GroupShuffle groupShuffle = new GroupShuffle();
            groupShuffle.setStatement(statement);
            LessThan32Teams lessThan32Teams = new LessThan32Teams();
            lessThan32Teams.setStatement(statement);

            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            statement.executeUpdate("drop table if exists teams");
            statement.executeUpdate("create table if not exists teams (id integer, name string, power double)");
            itd.doInserts(statement);
//            ResultSet rs = statement.executeQuery("select * from teams");
//            while (rs.next()) {
//                // read the result set
//                System.out.println("name = " + rs.getString("name"));
//                System.out.println("id = " + rs.getInt("id"));
//            }
        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            // connection close failed.
            System.err.println(e.getMessage());
        }
    }
}
