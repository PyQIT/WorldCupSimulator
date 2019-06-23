package matches;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import newgame.TeamsList;

import java.util.Random;

public class BracketMatchOpponents {
    public ObservableList<TeamsList.TeamClass> teamsMainList = FXCollections.observableArrayList();
    private Random generator = new Random();
    private double rand;

    public void chooseWinner(){

        for(TeamsList.TeamClass i: teamsMainList){
            System.out.println(i);
        }

        clearPoints();
        tenthGroup();
        eleventhGroup();
        twelvthGroup();
        thirthteenGroup();
        fourthteenGroup();
        fifthteenGroup();
        sixthteenGroup();
        seventhteenGroup();
    }

    private void clearPoints(){
        for(TeamsList.TeamClass i: teamsMainList){
            i.setPoints(0);
        }
    }

    private TeamsList.TeamClass firstGroup() {
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(0).getStrength() * rand;
        double b = teamsMainList.get(5).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(5).setPoints(teamsMainList.get(5).getPoints() + 1);
            return teamsMainList.get(5);
        } else if (a > b) {
            teamsMainList.get(0).setPoints(teamsMainList.get(0).getPoints() + 1);
            return teamsMainList.get(0);
        } else {
                if (teamsMainList.get(0).getStrength() < teamsMainList.get(5).getStrength()) {
                    teamsMainList.get(5).setPoints(teamsMainList.get(5).getPoints() + 1);
                    return teamsMainList.get(5);
                } else if (teamsMainList.get(0).getStrength() > teamsMainList.get(5).getStrength()) {
                    teamsMainList.get(0).setPoints(teamsMainList.get(0).getPoints() + 1);
                    return teamsMainList.get(0);
                }
                else {
                        rand = generator.nextInt(2);
                        if (rand == 1) {
                            teamsMainList.get(0).setPoints(teamsMainList.get(0).getPoints() + 1);
                            return teamsMainList.get(0);
                        }
                        else {
                            teamsMainList.get(5).setPoints(teamsMainList.get(5).getPoints() + 1);
                            return teamsMainList.get(5);
                        }
                }
        }
    }

    private TeamsList.TeamClass secondGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(1).getStrength() * rand;
        double b = teamsMainList.get(4).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(4).setPoints(teamsMainList.get(4).getPoints() + 1);
            return teamsMainList.get(4);
        } else if (a > b) {
            teamsMainList.get(1).setPoints(teamsMainList.get(1).getPoints() + 1);
            return teamsMainList.get(1);
        } else {
            if (teamsMainList.get(1).getStrength() < teamsMainList.get(4).getStrength()) {
                teamsMainList.get(4).setPoints(teamsMainList.get(4).getPoints() + 1);
                return teamsMainList.get(4);
            } else if (teamsMainList.get(1).getStrength() > teamsMainList.get(4).getStrength()) {
                teamsMainList.get(1).setPoints(teamsMainList.get(1).getPoints() + 1);
                return teamsMainList.get(1);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(1).setPoints(teamsMainList.get(1).getPoints() + 1);
                    return teamsMainList.get(1);
                }
                else {
                    teamsMainList.get(4).setPoints(teamsMainList.get(4).getPoints() + 1);
                    return teamsMainList.get(4);
                }
            }
        }
    }

    private TeamsList.TeamClass thirdGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(8).getStrength() * rand;
        double b = teamsMainList.get(13).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(13).setPoints(teamsMainList.get(13).getPoints() + 1);
            return teamsMainList.get(13);
        } else if (a > b) {
            teamsMainList.get(8).setPoints(teamsMainList.get(8).getPoints() + 1);
            return teamsMainList.get(8);
        } else {
            if (teamsMainList.get(8).getStrength() < teamsMainList.get(13).getStrength()) {
                teamsMainList.get(13).setPoints(teamsMainList.get(13).getPoints() + 1);
                return teamsMainList.get(13);
            } else if (teamsMainList.get(8).getStrength() > teamsMainList.get(13).getStrength()) {
                teamsMainList.get(8).setPoints(teamsMainList.get(8).getPoints() + 1);
                return teamsMainList.get(8);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(8).setPoints(teamsMainList.get(8).getPoints() + 1);
                    return teamsMainList.get(8);
                }
                else {
                    teamsMainList.get(13).setPoints(teamsMainList.get(13).getPoints() + 1);
                    return teamsMainList.get(13);
                }
            }
        }
    }

    private TeamsList.TeamClass fourthGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(9).getStrength() * rand;
        double b = teamsMainList.get(12).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(12).setPoints(teamsMainList.get(12).getPoints() + 1);
            return teamsMainList.get(12);
        } else if (a > b) {
            teamsMainList.get(9).setPoints(teamsMainList.get(9).getPoints() + 1);
            return teamsMainList.get(9);
        } else {
            if (teamsMainList.get(9).getStrength() < teamsMainList.get(12).getStrength()) {
                teamsMainList.get(12).setPoints(teamsMainList.get(12).getPoints() + 1);
                return teamsMainList.get(12);
            } else if (teamsMainList.get(9).getStrength() > teamsMainList.get(12).getStrength()) {
                teamsMainList.get(9).setPoints(teamsMainList.get(9).getPoints() + 1);
                return teamsMainList.get(9);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(9).setPoints(teamsMainList.get(9).getPoints() + 1);
                    return teamsMainList.get(9);
                }
                else {
                    teamsMainList.get(12).setPoints(teamsMainList.get(12).getPoints() + 1);
                    return teamsMainList.get(12);
                }
            }
        }
    }

    private TeamsList.TeamClass fifthGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(16).getStrength() * rand;
        double b = teamsMainList.get(21).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(21).setPoints(teamsMainList.get(21).getPoints() + 1);
            return teamsMainList.get(21);
        } else if (a > b) {
            teamsMainList.get(16).setPoints(teamsMainList.get(16).getPoints() + 1);
            return teamsMainList.get(16);
        } else {
            if (teamsMainList.get(16).getStrength() < teamsMainList.get(21).getStrength()) {
                teamsMainList.get(21).setPoints(teamsMainList.get(21).getPoints() + 1);
                return teamsMainList.get(21);
            } else if (teamsMainList.get(16).getStrength() > teamsMainList.get(21).getStrength()) {
                teamsMainList.get(16).setPoints(teamsMainList.get(16).getPoints() + 1);
                return teamsMainList.get(16);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(16).setPoints(teamsMainList.get(16).getPoints() + 1);
                    return teamsMainList.get(16);
                }
                else {
                    teamsMainList.get(21).setPoints(teamsMainList.get(21).getPoints() + 1);
                    return teamsMainList.get(21);
                }
            }
        }
    }

    private TeamsList.TeamClass sixthGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(17).getStrength() * rand;
        double b = teamsMainList.get(20).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(20).setPoints(teamsMainList.get(20).getPoints() + 1);
            return teamsMainList.get(20);
        } else if (a > b) {
            teamsMainList.get(17).setPoints(teamsMainList.get(17).getPoints() + 1);
            return teamsMainList.get(17);
        } else {
            if (teamsMainList.get(17).getStrength() < teamsMainList.get(20).getStrength()) {
                teamsMainList.get(20).setPoints(teamsMainList.get(20).getPoints() + 1);
                return teamsMainList.get(20);
            } else if (teamsMainList.get(17).getStrength() > teamsMainList.get(20).getStrength()) {
                teamsMainList.get(17).setPoints(teamsMainList.get(17).getPoints() + 1);
                return teamsMainList.get(17);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(17).setPoints(teamsMainList.get(17).getPoints() + 1);
                    return teamsMainList.get(17);
                }
                else {
                    teamsMainList.get(20).setPoints(teamsMainList.get(20).getPoints() + 1);
                    return teamsMainList.get(20);
                }
            }
        }
    }

    private TeamsList.TeamClass seventhGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(24).getStrength() * rand;
        double b = teamsMainList.get(29).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(29).setPoints(teamsMainList.get(29).getPoints() + 1);
            return teamsMainList.get(29);
        } else if (a > b) {
            teamsMainList.get(24).setPoints(teamsMainList.get(24).getPoints() + 1);
            return teamsMainList.get(24);
        } else {
            if (teamsMainList.get(24).getStrength() < teamsMainList.get(29).getStrength()) {
                teamsMainList.get(29).setPoints(teamsMainList.get(29).getPoints() + 1);
                return teamsMainList.get(29);
            } else if (teamsMainList.get(24).getStrength() > teamsMainList.get(29).getStrength()) {
                teamsMainList.get(24).setPoints(teamsMainList.get(24).getPoints() + 1);
                return teamsMainList.get(24);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(24).setPoints(teamsMainList.get(24).getPoints() + 1);
                    return teamsMainList.get(24);
                }
                else {
                    teamsMainList.get(29).setPoints(teamsMainList.get(29).getPoints() + 1);
                    return teamsMainList.get(29);
                }
            }
        }
    }

    private TeamsList.TeamClass eighthGroup(){
        rand = generator.nextDouble() * 0.12 + 0.92;

        double a = teamsMainList.get(25).getStrength() * rand;
        double b = teamsMainList.get(28).getStrength() * rand;

        if (a < b) {
            teamsMainList.get(28).setPoints(teamsMainList.get(28).getPoints() + 1);
            return teamsMainList.get(28);
        } else if (a > b) {
            teamsMainList.get(25).setPoints(teamsMainList.get(25).getPoints() + 1);
            return teamsMainList.get(25);
        } else {
            if (teamsMainList.get(25).getStrength() < teamsMainList.get(28).getStrength()) {
                teamsMainList.get(28).setPoints(teamsMainList.get(28).getPoints() + 1);
                return teamsMainList.get(28);
            } else if (teamsMainList.get(25).getStrength() > teamsMainList.get(28).getStrength()) {
                teamsMainList.get(25).setPoints(teamsMainList.get(25).getPoints() + 1);
                return teamsMainList.get(25);
            }
            else {
                rand = generator.nextInt(2);
                if (rand == 1) {
                    teamsMainList.get(25).setPoints(teamsMainList.get(25).getPoints() + 1);
                    return teamsMainList.get(25);
                }
                else {
                    teamsMainList.get(28).setPoints(teamsMainList.get(28).getPoints() + 1);
                    return teamsMainList.get(28);
                }
            }
        }
    }

    private TeamsList.TeamClass tenthGroup(){
        System.out.println("---------------------");
        System.out.println(firstGroup());
        System.out.println("---------------------");
        System.out.println(secondGroup());
    }

    private TeamsList.TeamClass eleventhGroup(){
        System.out.println("---------------------");
        System.out.println(thirdGroup());
        System.out.println("---------------------");
        System.out.println(fourthGroup());
    }

    private TeamsList.TeamClass twelvthGroup(){
        System.out.println("---------------------");
        System.out.println(fifthGroup());
        System.out.println("---------------------");
        System.out.println(sixthGroup());
    }

    private TeamsList.TeamClass thirthteenGroup(){
        System.out.println("---------------------");
        System.out.println(seventhGroup());
        System.out.println("---------------------");
        System.out.println(eighthGroup());
    }

    private TeamsList.TeamClass fourthteenGroup(){
        System.out.println("---------------------");
        System.out.println(tenthGroup());
        System.out.println("---------------------");
        System.out.println(eleventhGroup());
    }

    private TeamsList.TeamClass fifthteenGroup(){
        System.out.println("---------------------");
        System.out.println(twelvthGroup());
        System.out.println("---------------------");
        System.out.println(thirthteenGroup());
    }

    private TeamsList.TeamClass sixthteenGroup(){

    }

    private TeamsList.TeamClass seventhteenGroup(){
        System.out.println("---------------------");
        System.out.println(fourthteenGroup());
        System.out.println("---------------------");
        System.out.println(fifthteenGroup());
    }

    public void setArrayList(ObservableList<TeamsList.TeamClass> iD){
        this.teamsMainList = iD;
    }
}
