package delete;

import javafx.scene.control.Button;

public class ButtonDelete extends Delete {

    public Button delete = new Button();

    public void deleteStyle(){
        // create a button numer one
        delete.setLayoutY(785);
        delete.setLayoutX(1319);
        delete.setMinSize(262,105);
        delete.setMaxSize(262,105);
        delete.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }

}
