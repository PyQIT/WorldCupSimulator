package newgame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ButtonHandlerBracketsGame{
    private Stage primaryStage;

    void buttonBracketsObject() {
        try {
            ButtonHandlerSimulateGame bhsg = new ButtonHandlerSimulateGame();

            bhsg.button6();
            bhsg.groupStyle();
            bhsg.setScene(primaryStage);
            // when button is pressed
            bhsg.button6.setOnAction(event6);

            Pane root = new Pane();
            root.getChildren().addAll(bhsg.button6);

            // create a scene
            Scene scene = new Scene(root, 1650, 928);


            FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\brackets.jpg");

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

    private EventHandler<ActionEvent> event6 = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            ButtonHandlerSimulateGame bhsg = new ButtonHandlerSimulateGame();
            bhsg.setScene(primaryStage);
            bhsg.buttonSimulateObject();
        }
    };

    public void setScene(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
}
