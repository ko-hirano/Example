package example;

import org.junit.Test;

public class HelloWorldUnitTest {

  @Test
  public void getDateAndWeekdayTest() {
    new HelloWorld().getDateAndWeekday();
  }

  @Test
  public void getDateTest() {
    new HelloWorld().getDate();
  }
}
