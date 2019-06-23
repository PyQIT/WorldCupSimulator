package mainmenu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import sample.Main;
import java.io.FileInputStream;

public class ButtonHandler extends Buttons {
    private Stage primaryStage;
    Pane root;

   private EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            ButtonOneHandlerObject boho = new ButtonOneHandlerObject();
            boho.setScene(primaryStage);
            boho.buttonOneObject();
        }
    };


    private EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {

        public void handle(ActionEvent e) {

            // create a input stream
            try {
                button5();
                // when button is pressed
                button5.setOnAction(event5);
                root = new Pane();
                root.getChildren().addAll(button5);

                // create a scene
                Scene scene = new Scene(root, 1650, 928);


                FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\author.jpg");

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

            }catch(Exception r){
                r.printStackTrace();
            }
        }
    };

    EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            Main main = new Main();
            main.start(primaryStage);
        }
    };

    public void setScene(Stage primaryStage){
       this.primaryStage = primaryStage;
    }


    public void action(){

        // when button is pressed
        button.setOnAction(event);
        // when button is pressed
        button4.setOnAction(event4);
    }

}
