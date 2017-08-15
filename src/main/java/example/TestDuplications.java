package example;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class TestDuplications {
  Logger logger = Logger.getLogger(Logger.class.getName ());

  public void testDuplications() {
    final Calendar calc = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
	logger.info("今日は" + sdf.format(calc.getTime()) + ")です");
	logger.info("明日は" + getFormatSystemDate(1) + ")です");

  }



  /**
   * システム日付に日数を加減算した結果を指定のモードで文字列変換した値を返す。
   *
   * @param addDay 加算される日数(+で加算,マイナスで減算)
   * @param mode フォーマット変換モード
   * @return 結果の日付文字列
   */
  public static String getFormatSystemDate(final int addDay) {
      final Calendar calc = Calendar.getInstance();

      calc.add(Calendar.DATE, addDay);
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
      return sdf.format(calc.getTime());
  }

}
