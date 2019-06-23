package newgame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import mainmenu.ButtonOneHandlerObject;

import java.io.FileInputStream;


public class ButtonHandlerNewGame extends ButtonsNewGame {
    private Stage primaryStage;

    public void buttonNewGameObject(){
        try{
            GroupStageRand groupStageRand = new GroupStageRand();
            GroupShuffle groupShuffle = new GroupShuffle();
            button6();
            raffleStyle();
            groupStyle();
            // when button is pressed
            button6.setOnAction(event6);
            groups.setOnAction(eventSimulate);
            raffle.setOnAction(eventRaffleGroups);

            Pane root = new Pane();
            root.getChildren().addAll(button6, groups, raffle,
                    groupStageRand.printGroup(),groupStageRand.printGroupSecond(),groupStageRand.printGroupThird(),
                    groupStageRand.printGroupFourth(),groupStageRand.printGroupFivth(),groupStageRand.printGroupSixth(),
                    groupStageRand.printGroupSeventh(),groupStageRand.printGroupEighth());

            groupShuffle.setArrayList(groupStageRand.iDS);

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

   public EventHandler<ActionEvent> eventGroups = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e) {
            if(TeamsList.iDS.size() == 32) {
                GroupShuffle groupShuffle = new GroupShuffle();
                groupShuffle.setArrayList(TeamsList.iDS);
                ButtonHandlerNewGameShuffle bhnwgs = new ButtonHandlerNewGameShuffle();
                bhnwgs.setScene(primaryStage);
                bhnwgs.buttonNewGameObjectShuffle();
            }else if(TeamsList.iDS.size() == 0){
                ButtonHandlerNewGame bhnw = new ButtonHandlerNewGame();
                bhnw.setScene(primaryStage);
                bhnw.buttonNewGameObject();
            }else{
                LessThan32Teams lessThan32Teams = new LessThan32Teams();
                lessThan32Teams.setArrayList(TeamsList.iDS);
                HandlerLessThan32Teams handlerLessThan32Teams = new HandlerLessThan32Teams();
                handlerLessThan32Teams.setScene(primaryStage);
                handlerLessThan32Teams.buttonHandlerLesThan32Teams();
            }
        }
    };

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

    public EventHandler<ActionEvent> eventRaffle = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e) {
            ButtonHandlerNewGame bhnw = new ButtonHandlerNewGame();
            bhnw.setScene(primaryStage);
            bhnw.buttonNewGameObject();
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
