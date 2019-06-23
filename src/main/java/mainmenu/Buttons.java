package mainmenu;

import javafx.scene.control.Button;

public class Buttons {

    public Button button = new Button();
    public Button button2 = new Button();
    public Button button3 = new Button();
    public Button button4 = new Button();
    Button button5 = new Button();

   public void button(){
        // create a button numer one
        button.setLayoutY(185);
        button.setMinSize(520,140);
        button.setMaxSize(520,140);
        button.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

   public void button2(){
        // create a button numer two
        button2.setLayoutY(326);
        button2.setMinSize(520,140);
        button2.setMaxSize(520,140);
        button2.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

   public void button3(){
        // create a button numer three
        button3.setLayoutY(467);
        button3.setMinSize(520,140);
        button3.setMaxSize(520,140);
        button3.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

   public void button4(){
        // create a button numer four
        button4.setLayoutY(760);
        button4.setMinSize(520,140);
        button4.setMaxSize(520,140);
        button4.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

    void button5(){
        // create a button numer five
        button5.setLayoutY(745);
        button5.setLayoutX(32);
        button5.setMinSize(142,150);
        button5.setMaxSize(142,150);
        button5.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }
}