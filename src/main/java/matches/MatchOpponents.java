package matches;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import newgame.TeamsList;


public class MatchOpponents {
    private ObservableList<TeamsList.TeamClass> teamsMainList =
            FXCollections.observableArrayList();

    void chooseWinner(){
        for(TeamsList.TeamClass i: teamsMainList){
            System.out.println(i);
        }

    }

    public void setArrayList(ObservableList<TeamsList.TeamClass> iD){
        this.teamsMainList = iD;
    }
}
