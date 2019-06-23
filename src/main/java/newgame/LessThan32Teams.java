package newgame;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class LessThan32Teams {

    static ArrayList<Integer> iDS = new ArrayList<Integer>();

    private static Statement statement;
    private int counter = 0;

    void generateTeams(){
        Random generator = new Random();

            int id;
            do {
                id = 0;
                id = generator.nextInt(211) + 1;

                if (iDS.contains(id)) {
                    continue;
                }else {
                    iDS.add(id);
                }
            }while(iDS.size() < 32);


    }



    public Pane printGroup() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;
        generateTeams();
        Collections.shuffle(iDS);

        do {
            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 4);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(55);
        tableView .setLayoutY(170);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupSecond() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 8);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(435);
        tableView .setLayoutY(170);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupThird() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 12);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(835);
        tableView .setLayoutY(170);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupFourth() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 16);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1235);
        tableView .setLayoutY(170);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");

        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupFivth() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 20);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(435);
        tableView .setLayoutY(480);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupSixth() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 24);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(835);
        tableView .setLayoutY(480);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupSeventh() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 28);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1235);
        tableView .setLayoutY(480);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public Pane printGroupEighth() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();
        ResultSet rs;

        do {

            try {
                rs = statement.executeQuery("select * from teams where id = " + iDS.get(counter));
                teamsList.add(new TeamsList.TeamClass(rs.getInt("id"), rs.getString("name"), rs.getDouble("power")));
                counter++;
            }catch(SQLException r){
                r.printStackTrace();
            }
        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(55);
        tableView .setLayoutY(480);
        tableView .setMaxSize(300,300);
        tableView .setMinSize(300,300);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(240);
        firstNameCol.setMaxWidth(244);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(55);
        secondNameCol.setMaxWidth(55);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,Integer>("points"));

        tableView.setItems(teamsList);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public void setArrayList(ArrayList<Integer> iD){
        this.iDS = iD;
    }

    public void setStatement(Statement statement){
        this.statement = statement;
    }
}
