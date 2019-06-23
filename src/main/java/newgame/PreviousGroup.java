package newgame;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.util.Comparator;


public class PreviousGroup{

    // Create the Lists for the ListViews
    static ObservableList<TeamsList.TeamClass> teamsMainList =
            FXCollections.observableArrayList();

    private int counter = 0;


    public Pane printGroup() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 4);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 8);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 12);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 16);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 20);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 24);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 28);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
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

        do {
            teamsList.add(teamsMainList.get(counter));
            counter++;
        }while(counter < 32);

        Comparator<TeamsList.TeamClass> pointsComparator = Comparator.comparing(TeamsList.TeamClass::getNationality);

        teamsList.sorted(pointsComparator);
        SortedList<TeamsList.TeamClass> sortedPoints
                = new SortedList<>(teamsList, pointsComparator);

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

        tableView.setItems(sortedPoints);
        tableView.getColumns().addAll(firstNameCol, secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public void setObservableList(ObservableList<TeamsList.TeamClass> teamsMainList){
        GroupSimulated.teamsMainList = teamsMainList;
    }

}
