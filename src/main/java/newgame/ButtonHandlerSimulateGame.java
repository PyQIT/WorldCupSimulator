package newgame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import matches.BracketMatchOpponents;
import matches.MatchOpponents;

import java.io.FileInputStream;

public class ButtonHandlerSimulateGame extends ButtonHandlerNewGame {
    private Stage primaryStage;

     void buttonSimulateObject() {
        try {
            ButtonHandlerNewGame bnw = new ButtonHandlerNewGame();
            GroupSimulated groupSimulated = new GroupSimulated();
            bnw.button6();
            bnw.groupStyle();
            bnw.raffleStyle();
            bnw.setScene(primaryStage);
            // when button is pressed
            bnw.button6.setOnAction(eventPrevious);
            bnw.groups.setOnAction(eventBrackets);
            bnw.raffle.setOnAction(eventRaffle);

            Pane root = new Pane();
            root.getChildren().addAll(bnw.button6, bnw.groups, bnw.raffle,
                    groupSimulated.printGroup(),groupSimulated.printGroupSecond(),groupSimulated.printGroupThird(),
                    groupSimulated.printGroupFourth(),groupSimulated.printGroupFivth(),groupSimulated.printGroupSixth(),
                    groupSimulated.printGroupSeventh(),groupSimulated.printGroupEighth());

            // create a scene
            Scene scene = new Scene(root, 1650, 928);


            FileInputStream inputBackground = new FileInputStream("C:\\Users\\Asus\\WorldCupSimulator\\src\\main\\resources\\groupsSimulated.jpg");

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

    private EventHandler<ActionEvent> eventBrackets = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            BracketMatchOpponents bracketMatchOpponents = new BracketMatchOpponents();
            bracketMatchOpponents.setArrayList(GroupSimulated.teamsMainList);
            bracketMatchOpponents.chooseWinner();
            ButtonHandlerBracketsGame bhbg = new ButtonHandlerBracketsGame();
            bhbg.setScene(primaryStage);
            bhbg.buttonBracketsObject();
        }
    };

    private EventHandler<ActionEvent> eventRaffle = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            MatchOpponents matchOpponents = new MatchOpponents();
            matchOpponents.setArrayList(GroupStageRand.teamsMainList);
            matchOpponents.chooseWinner();
            GroupSimulated.teamsMainList = matchOpponents.teamsMainList;
            ButtonHandlerSimulateGame bhsg = new ButtonHandlerSimulateGame();
            bhsg.setScene(primaryStage);
            bhsg.buttonSimulateObject();
        }
    };

    private EventHandler<ActionEvent> eventPrevious = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            PreviousGroup.teamsMainList = GroupSimulated.teamsMainList;
            ButtonHandlerPreviousGame bhpg = new ButtonHandlerPreviousGame();
            bhpg.setScene(primaryStage);
            bhpg.buttonNewPreviousGame();
        }
    };

    public void setScene(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
}
