package net.rafaeltoledo.coverage;

public class Pojo2 {

  private Object thing;

  public Object getThing() {
    return thing;
  }

  public void setThing(Object thing) {
    this.thing = thing;
  }

  public Object missedTest2() {
    return thing;
  }

  public Object coveredTestByAndroid() {
    return thing;
  }

  public Object coveredTestByJUnit4() {
    return thing;
  }
}
