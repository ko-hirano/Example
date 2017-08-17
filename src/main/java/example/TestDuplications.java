package example;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;



/**
 *
 *  重複するクラス
 *
 */
public class TestDuplications extends Base {
  Logger logger = Logger.getLogger(Logger.class.getName ());

/**
 *
 *  重複するクラスを使う
 *
 */
  public void testDuplications() {
    final Calendar calc = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	logger.info("今日は" + sdf.format(calc.getTime()) + "です");
	logger.info("明日は" + getFormatSystemDate(1) + "です");
  }

}
