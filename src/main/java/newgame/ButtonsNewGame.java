package newgame;

import javafx.scene.control.Button;

public class ButtonsNewGame {

   public Button groups = new Button();
   public Button raffle = new Button();
    Button button6 = new Button();


     public void groupStyle(){
        // create a button numer one
        groups.setLayoutY(785);
        groups.setLayoutX(1320);
        groups.setMinSize(262,105);
        groups.setMaxSize(262,105);
        groups.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

    void button6(){
        // create a button numer six
        button6.setLayoutY(745);
        button6.setLayoutX(32);
        button6.setMinSize(143,150);
        button6.setMaxSize(143,150);
        button6.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");

    }

    public void raffleStyle(){
        // create a button numer one
        raffle.setLayoutY(785);
        raffle.setLayoutX(986);
        raffle.setMinSize(262,105);
        raffle.setMaxSize(262,105);
        raffle.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }


}
