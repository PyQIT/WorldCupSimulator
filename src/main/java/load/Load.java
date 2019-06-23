package load;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import newgame.ButtonHandlerNewGame;

import java.io.FileInputStream;

public class Load {

    private Stage primaryStage;

    public EventHandler<ActionEvent> eventLoad = new EventHandler<ActionEvent>() {

        public void handle(ActionEvent e) {
            Pane root;
            try {

                ButtonHandlerNewGame bnw = new ButtonHandlerNewGame();

                bnw.groupStyle();
                bnw.setScene(primaryStage);
                bnw.buttonNewGameObject();

                root = new Pane();
                Stage stage = new Stage();
                stage.setTitle("World Cup Simulator");
                stage.setScene(new Scene(root, 450, 253));
                FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\success.jpg");

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
                stage.getIcons().add(new Image(Load.class.getResourceAsStream("/icon.png")));
                stage.show();
                Thread.sleep(2500);
                stage.hide();
            }
            catch (Exception r) {
                r.printStackTrace();
            }
        }
    };

    public void setScene(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
}
