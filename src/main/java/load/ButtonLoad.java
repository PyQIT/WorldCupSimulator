package load;

import javafx.scene.control.Button;

public class ButtonLoad extends Load {

    public Button load = new Button();

    public void loadStyle(){
        // create a button numer one
        load.setLayoutY(785);
        load.setLayoutX(1321);
        load.setMinSize(262,105);
        load.setMaxSize(262,105);
        load.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

}
