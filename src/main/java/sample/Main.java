package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import mainmenu.ButtonHandler;
import database.DatabaseConnection;

import java.io.*;

public class Main extends Application {
    private static int counter = 0;
    @Override
    public void start(final Stage primaryStage){


        try {
            ButtonHandler bt = new ButtonHandler();

            if(counter == 0) {
                DatabaseConnection db = new DatabaseConnection();
                db.initialConnectionDatabase();
                counter++;
            }
            // set title for the stage
            primaryStage.setTitle("World Cup Simulator");

            bt.button();
            bt.button2();
            bt.button3();
            bt.button4();
            bt.action();

            // add the label, text field and button
            Pane root = new Pane();
            root.getChildren().addAll(bt.button, bt.button2, bt.button3, bt.button4);

            // create a scene
            Scene scene = new Scene(root, 1650, 928);

            // create a input stream
            FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\wwsMainManu.jpg");

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

            // set the scene
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/icon.png")));
            primaryStage.show();

            bt.setScene(primaryStage);

        }

        catch (Exception e) {

            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        DatabaseConnection db = new DatabaseConnection();
        db.closeConnection();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
