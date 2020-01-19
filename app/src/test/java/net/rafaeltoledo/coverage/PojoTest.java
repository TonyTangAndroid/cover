package net.rafaeltoledo.coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PojoTest {

  @Test
  public void testPojo() {
    Pojo p = new Pojo();

    p.setThing("String1");

    assertEquals("String1", p.getThing());
  }
}
