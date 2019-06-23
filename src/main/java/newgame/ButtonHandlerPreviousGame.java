package newgame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import mainmenu.ButtonOneHandlerObject;
import matches.MatchOpponents;

import java.io.FileInputStream;


public class ButtonHandlerPreviousGame extends ButtonsNewGame {
    private Stage primaryStage;

    void buttonNewPreviousGame(){
        try{
            PreviousGroup previousGroup = new PreviousGroup();
            button6();
            raffleStyle();
            groupStyle();
            // when button is pressed
            button6.setOnAction(event6);
            groups.setOnAction(eventSimulate);
            raffle.setOnAction(eventRaffleGroups);

            Pane root = new Pane();
            root.getChildren().addAll(button6, groups, raffle,
                    previousGroup.printGroup(),previousGroup.printGroupSecond(),previousGroup.printGroupThird(),
                    previousGroup.printGroupFourth(),previousGroup.printGroupFivth(),previousGroup.printGroupSixth(),
                    previousGroup.printGroupSeventh(),previousGroup.printGroupEighth());

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
            MatchOpponents matchOpponents = new MatchOpponents();
            matchOpponents.setArrayList(GroupStageRand.teamsMainList);
            matchOpponents.chooseWinner();
            GroupSimulated.teamsMainList = matchOpponents.teamsMainList;
            ButtonHandlerSimulateGame bhsg = new ButtonHandlerSimulateGame();
            bhsg.setScene(primaryStage);
            bhsg.buttonSimulateObject();
        }
    };

    private EventHandler<ActionEvent> eventRaffleGroups = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e) {
            ButtonHandlerNewGameShuffle bhnwgs = new ButtonHandlerNewGameShuffle();
            bhnwgs.setScene(primaryStage);
            bhnwgs.buttonNewGameObjectShuffle();

        }
    };

    public void setScene(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
}
