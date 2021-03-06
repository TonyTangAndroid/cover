package net.rafaeltoledo.coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Pojo2Test {

  @Test
  public void testPojo() {
    Pojo2 p = new Pojo2();

    p.setThing("String1");

    assertEquals("String1", p.getThing());
    assertEquals("String1", p.missedTest3());
    assertEquals("String1", p.fixedTest2());
    assertEquals("String1", p.coveredTestByJUnit4());
  }
}
