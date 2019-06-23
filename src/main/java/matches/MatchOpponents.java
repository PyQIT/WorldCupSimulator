package matches;

import java.sql.Statement;
import java.util.ArrayList;

public class MatchOpponents {
    private static Statement statement;
    ArrayList<Integer> iDS = new ArrayList<Integer>();

    void chooseWinner(){
        for(int i: iDS){
            System.out.println(i);
        }

    }

    public void setArrayList(ArrayList<Integer> iD){
        this.iDS = iD;
    }

    public void setStatement(Statement statement){
        this.statement = statement;
    }
}
