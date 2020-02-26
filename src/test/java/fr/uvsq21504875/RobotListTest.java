package fr.uvsq21504875;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotListTest {
  @Test
  public void ajouterRobot() throws Exception {
    RobotList rList = new RobotList();
    Robot r = new Robot(0,0);
    rList.ajouterRobot(r);
    assertEquals(rList.tailleListe(),1);
  }

  @Test
  public void avancerTous() throws Exception {
    RobotList rList = new RobotList();
    rList.ajouterRobot(new Robot(0,1,Direction.NORD));
    rList.ajouterRobot(new Robot(1,4,Direction.SUD));
    rList.avancerTous();
  }

}