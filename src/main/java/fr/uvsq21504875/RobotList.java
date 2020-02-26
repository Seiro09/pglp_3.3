package fr.uvsq21504875;

public class RobotList {
  private List<Robot> Robots;

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
