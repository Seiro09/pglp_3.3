package fr.uvsq21504875;

public class RobotStatique{
  protected Direction direction;

  public RobotStatique(){
    this.direction = Direction.NORD;
  }

  public RobotStatique(Direction d){
    this.direction = d;
  }

  public void tourne(){

  }
}
