package newgame;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TeamsList {
    private static Statement statement;
    public final static ArrayList<Integer> iDS = new ArrayList<Integer>();

    public Pane printDatabase1() {

        TeamsList.iDS.clear();

        // Create the Lists for the ListViews
        ObservableList<TeamClass> teamsList =
                FXCollections.observableArrayList();

        try {
            ResultSet rs = statement.executeQuery("select * from teams");
            while (rs.next()) {
                teamsList.add( new TeamClass(rs.getInt("id"), rs.getString("name"),rs.getDouble("power")));
            }
        }catch(SQLException r){
            r.printStackTrace();
        }

        final TableView<TeamClass> tableView = new TableView<TeamClass>();
        tableView .setLayoutX(320);
        tableView .setLayoutY(210);
        tableView .setMaxSize(1200,500);
        tableView .setMinSize(1200,500);
        tableView.setStyle("-fx-control-inner-background: transparent; -fx-base: transparent; -fx-background-color: transparent; " +
                "-fx-font-size:17.0; -fx-font-weight: BOLD;");


        TableColumn firstNameCol = new TableColumn("National football teams");
        firstNameCol.setMinWidth(845);
        firstNameCol.setMaxWidth(845);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamClass,String>("Nationality"));

        TableColumn secondNameCol = new TableColumn("Strength");
        secondNameCol.setMinWidth(280);
        secondNameCol.setMaxWidth(280);
        secondNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamClass,Double>("Strength"));

        TableColumn thirdNameCol = new TableColumn("No.");
        thirdNameCol.setMaxWidth(50);
        thirdNameCol.setMinWidth(50);
        thirdNameCol.setCellValueFactory(
                new PropertyValueFactory<TeamClass,Integer>("id"));

        tableView.getSelectionModel().setSelectionMode(
                SelectionMode.MULTIPLE
        );
        tableView.getSelectionModel().getSelectedItem();

        EventHandler<MouseEvent> mouseEventHandler = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {

                Node node = evt.getPickResult().getIntersectedNode();

                // go up from the target node until a row is found or it's clear the
                // target node wasn't a node.
                while (node != null && node != tableView && !(node instanceof TableRow)) {
                    node = node.getParent();
                }

                // if is part of a row or the row,
                // handle event instead of using standard handling
                if (node instanceof TableRow) {
                    // prevent further handling
                    evt.consume();

                    TableRow row = (TableRow) node;
                    TableView tv = row.getTableView();

                    // focus the tableview
                    tv.requestFocus();

                    if (!row.isEmpty()) {
                        // handle selection for non-empty nodes
                        int index = row.getIndex();
                        if (row.isSelected()) {
                            tv.getSelectionModel().clearSelection(index);
                            iDS.remove(iDS.indexOf(index + 1));
                        } else {
                            if(iDS.size() < 32) {
                                tv.getSelectionModel().select(index);
                                iDS.add(index + 1);
                            }
                            else{
                                try {
                                    Pane root = new Pane();
                                    Stage stage = new Stage();
                                    stage.setTitle("World Cup Simulator");
                                    stage.setScene(new Scene(root, 450, 253));
                                    FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\warning.jpg");

                                    // create a image
                                    Image image = new Image(inputBackground);

                                    // create a background image
                                    BackgroundImage backgroundimage = new BackgroundImage(image,
                                            BackgroundRepeat.NO_REPEAT,
                                            BackgroundRepeat.NO_REPEAT,
                                            BackgroundPosition.CENTER,
                                            BackgroundSize.DEFAULT);

                                    // create Background
                                    Background background = new Background(backgroundimage);

                                    // set background
                                    root.setBackground(background);
                                    stage.setResizable(false);
                                    stage.getIcons().add(new Image(TeamsList.class.getResourceAsStream("/icon.png")));
                                    stage.show();
                                    Thread.sleep(2500);
                                    stage.hide();
                                }
                                catch (Exception r) {
                                    r.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        };

        tableView.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEventHandler);
        tableView.setItems(teamsList);
        tableView.getColumns().addAll(thirdNameCol, firstNameCol,secondNameCol);

        // Create the HBox for the Months
        Pane teamSelection = new Pane();
        // Add the Label and the List to the HBox
        teamSelection.setPadding(new Insets(10,0,0,10));
        teamSelection.getChildren().addAll(tableView);

        return teamSelection;
    }

    public static class TeamClass {

        private final SimpleStringProperty nationality;
        private final SimpleDoubleProperty strength;
        private final SimpleIntegerProperty id;
        private final SimpleIntegerProperty points;

        TeamClass(int id, String nationality, double strength) {
            this.nationality = new SimpleStringProperty(nationality);
            this.strength = new SimpleDoubleProperty(strength);
            this.id = new SimpleIntegerProperty(id);
            this.points = new SimpleIntegerProperty(0);
        }

        public String getNationality() {
            return nationality.get();
        }
        public void setNationality(String nationality1) {
            nationality.set(nationality1);
        }

        public double getStrength() {
            return strength.get();
        }
        public void setStrength(double strength1) {
            strength.set(strength1);
        }

        public int getId(){
            return id.get();
        }

        public void setId(int id1){
            id.set(id1);
        }

        public int getPoints(){
            return points.get();
        }

        public void setPoints(int points1){
            points.set(points1);
        }
    }

    public void setStatement(Statement statement){
        this.statement = statement;
    }

}
