package newgame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import mainmenu.ButtonOneHandlerObject;

import java.io.FileInputStream;


public class HandlerLessThan32Teams extends ButtonsNewGame {
    private Stage primaryStage;

    void buttonHandlerLesThan32Teams(){
        try{
            LessThan32Teams lessThan32Teams = new LessThan32Teams();
            button6();
            raffleStyle();
            groupStyle();
            // when button is pressed
            button6.setOnAction(event6);
            groups.setOnAction(eventSimulate);
            raffle.setOnAction(eventRaffleGroups);

            Pane root = new Pane();
            root.getChildren().addAll(button6, groups, raffle,
                    lessThan32Teams.printGroup(),lessThan32Teams.printGroupSecond(),lessThan32Teams.printGroupThird(),
                    lessThan32Teams.printGroupFourth(),lessThan32Teams.printGroupFivth(),lessThan32Teams.printGroupSixth(),
                    lessThan32Teams.printGroupSeventh(),lessThan32Teams.printGroupEighth());

            // create a scene
            Scene scene = new Scene(root, 1650, 928);


            FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\groups.jpg");

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

    private EventHandler<ActionEvent> event6 = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            ButtonOneHandlerObject boho = new ButtonOneHandlerObject();
            boho.setScene(primaryStage);
            boho.buttonOneObject();
        }
    };

    private EventHandler<ActionEvent> eventSimulate = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e) {
            ButtonHandlerSimulateGame bhsg = new ButtonHandlerSimulateGame();
            bhsg.setScene(primaryStage);
            bhsg.buttonSimulateObject();
        }
    };

    private EventHandler<ActionEvent> eventRaffleGroups = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e) {
            GroupShuffle groupShuffle = new GroupShuffle();
            groupShuffle.setArrayList(LessThan32Teams.iDS);
            ButtonHandlerNewGameShuffle bhnwgs = new ButtonHandlerNewGameShuffle();
            bhnwgs.setScene(primaryStage);
            bhnwgs.buttonNewGameObjectShuffle();

        }
    };

    public void setScene(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
}
