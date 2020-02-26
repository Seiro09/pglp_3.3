package fr.uvsq21504875;

import java.util.List;
import java.util.ArrayList;

public class RobotList {
  private ArrayList<Robot> Robots;

  public RobotList(){
    this.Robots = new ArrayList()<>;
  }

  public void ajouterRobot(Robot r){
    this.Robots.add(r);
  }

  public void avancerTous(){
    for (Robot r : Robots){
      r.avance();
    }
  }
}
