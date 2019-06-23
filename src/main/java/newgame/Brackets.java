package newgame;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class Brackets {

    // Create the Lists for the ListViews
    static ObservableList<TeamsList.TeamClass> teamsMainList =
            FXCollections.observableArrayList();

    private int counter = 0;


    public Pane printGroup() {
        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList = FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 4);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(11);
        tableView .setLayoutY(136);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                            " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 8);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(11);
        tableView .setLayoutY(293);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 12);


        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(11);
        tableView .setLayoutY(454);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 16);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(11);
        tableView .setLayoutY(619);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 20);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1425);
        tableView .setLayoutY(136);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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
//
//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 24);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1425);
        tableView .setLayoutY(294);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 28);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1425);
        tableView .setLayoutY(456);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");

        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupEight() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1425);
        tableView .setLayoutY(620);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupTenth() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(243);
        tableView .setLayoutY(209);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupEleventh() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(243);
        tableView .setLayoutY(534);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupTwelvth() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1195);
        tableView .setLayoutY(210);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupThirthteen() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(1195);
        tableView .setLayoutY(536);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupFourthteen() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(473);
        tableView .setLayoutY(372);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupFifthteen() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(971);
        tableView .setLayoutY(372);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupSixteen() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(723);
        tableView .setLayoutY(619);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public Pane printGroupSeventhen() {

        // Create the Lists for the ListViews
        ObservableList<TeamsList.TeamClass> teamsList =
                FXCollections.observableArrayList();

//        do {
//            teamsList.add(teamsMainList.get(counter));
//            counter++;
//        }while(counter < 32);

        final TableView<TeamsList.TeamClass> tableView = new TableView<TeamsList.TeamClass>();
        tableView .setLayoutX(723);
        tableView .setLayoutY(372);
        tableView .setMaxSize(213,85);
        tableView .setMinSize(213,85);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; "  +
                " -fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("Teams");
        firstNameCol.setMinWidth(180);
        firstNameCol.setMaxWidth(180);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamsList.TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Pts");
        secondNameCol.setMinWidth(32);
        secondNameCol.setMaxWidth(32);
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

    public void setObservableList(ObservableList<TeamsList.TeamClass> teamsMainList){
        GroupSimulated.teamsMainList = teamsMainList;
    }

}