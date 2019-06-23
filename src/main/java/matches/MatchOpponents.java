package matches;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import newgame.TeamsList;

import java.util.Random;


public class MatchOpponents {
    public ObservableList<TeamsList.TeamClass> teamsMainList = FXCollections.observableArrayList();
    private int i = 0;
    private Random generator = new Random();
    double rand;

    public void chooseWinner(){
            firstGroup();
            secondGroup();
            thirdGroup();
            fourthGroup();
            fifthGroup();
            sixthGroup();
            seventhGroup();
            eighthGroup();
    }

    private void firstGroup(){
        int counter = 0;

        while(i < 3){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void secondGroup(){
        int counter = 0;
        i = 4;

        while(i < 7){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void thirdGroup(){
        int counter = 0;
        i = 8;

        while(i < 11){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void fourthGroup(){
        int counter = 0;
        i = 12;

        while(i < 15){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void fifthGroup(){
        int counter = 0;
        i = 16;

        while(i < 19){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void sixthGroup(){
        int counter = 0;
        i = 20;

        while(i < 23){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void seventhGroup(){
        int counter = 0;
        i = 24;

        while(i < 27){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    private void eighthGroup(){
        int counter = 0;
        i = 28;

        while(i < 31){
            rand = 0;
            rand = generator.nextDouble() * 0.09 + 0.95;
            if(teamsMainList.get(i).getStrength()*rand < teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
            }
            else if(teamsMainList.get(i).getStrength()*rand > teamsMainList.get(i+1).getStrength()*rand){
                teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
            }
            else{
                if(teamsMainList.get(i).getStrength() < teamsMainList.get(i+1).getStrength()) {
                    teamsMainList.get(i + 1).setPoints(teamsMainList.get(i + 1).getPoints() + 3);
                }
                else if(teamsMainList.get(i).getStrength() > teamsMainList.get(i+1).getStrength()){
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                }
                else{
                    int rand = 0;
                    rand = generator.nextInt(2);
                    if(rand == 1)
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints()+3);
                    else
                        teamsMainList.get(i+1).setPoints(teamsMainList.get(i+1).getPoints()+3);
                }
            }
            if(counter < 2) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 2).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 2).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 2).setPoints(teamsMainList.get(i + 2).getPoints() + 3);
                    }
                }
            }
            if(counter < 1) {
                if (teamsMainList.get(i).getStrength() * rand < teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                } else if (teamsMainList.get(i).getStrength() * rand > teamsMainList.get(i + 3).getStrength() * rand) {
                    teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                } else {
                    if (teamsMainList.get(i).getStrength() < teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    } else if (teamsMainList.get(i).getStrength() > teamsMainList.get(i + 3).getStrength()) {
                        teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                    } else {
                        int rand = 0;
                        rand = generator.nextInt(2);
                        if (rand == 1)
                            teamsMainList.get(i).setPoints(teamsMainList.get(i).getPoints() + 3);
                        else
                            teamsMainList.get(i + 3).setPoints(teamsMainList.get(i + 3).getPoints() + 3);
                    }
                }
            }
            i++;
            counter++;
        }
    }

    public void setArrayList(ObservableList<TeamsList.TeamClass> iD){
        this.teamsMainList = iD;
    }
}
