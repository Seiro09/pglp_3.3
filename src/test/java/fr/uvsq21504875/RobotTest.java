package fr.uvsq21504875;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

  @Test
  public void testRobot(){
    Robot r = new Robot(0,0);
    assertEquals(r.getPosition().getX(),0);
    assertEquals(r.getPosition().getY(),0);
  }

  @Test
  public void avance() {
    Robot r = new Robot(0,0);
    r.avance();
    assertEquals(r.getPosition().getX(),0);
    assertEquals(r.getPosition().getY(),1);
  }

}