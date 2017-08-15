package example;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class TestDuplications extends Base {
  Logger logger = Logger.getLogger(Logger.class.getName ());

  public void testDuplications() {
    final Calendar calc = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
	logger.info("今日は" + sdf.format(calc.getTime()) + ")です");
	logger.info("明日は" + getFormatSystemDate(1) + ")です");

  }




}
