package fr.uvsq21504875;

import java.util.List;
import java.util.ArrayList;

public class RobotList {
  private List<Robot> Robots;

  public RobotList(){
    this.Robots = new ArrayList<>();
  }

  public void ajouterRobot(Robot r){
    this.Robots.add(r);
  }

  public int tailleListe(){return Robots.size();}

  public void avancerTous(){
    for (Robot r : Robots){
      r.avance();
    }
  }
}
