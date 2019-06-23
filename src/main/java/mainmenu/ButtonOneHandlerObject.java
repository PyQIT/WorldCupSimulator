package mainmenu;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import newgame.ButtonHandlerNewGame;
import newgame.TeamsList;

import java.io.FileInputStream;

public class ButtonOneHandlerObject extends ButtonHandler{
    private Stage primaryStage;

   public void buttonOneObject() {

        // create a input stream
        try {
            ButtonHandlerNewGame bnw = new ButtonHandlerNewGame();
            ButtonHandler bh = new ButtonHandler();
            TeamsList teamsList = new TeamsList();

            bnw.groupStyle();
            bnw.raffleStyle();
            bh.button5();
            // when button is pressed
            bnw.setScene(primaryStage);
            bnw.groups.setOnAction(bnw.eventGroups);
            bnw.raffle.setOnAction(bnw.eventRaffle);

            bh.setScene(primaryStage);
            bh.button5.setOnAction(bh.event5);

            root = new Pane();
            root.getChildren().addAll(bh.button5, bnw.groups, bnw.raffle, teamsList.printDatabase1());

            // create a scene
            Scene scene = new Scene(root, 1650, 928);

            FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\teams.jpg");

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

            //set the scene
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception r) {
            r.printStackTrace();
        }
    }

    public void setScene(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
}
