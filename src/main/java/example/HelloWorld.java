package example;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloWorld {
	Logger logger = Logger.getLogger(Logger.class.getName());
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	/**
	 *
	 *  日付と曜日を表示する
	 *
	 */
	public void getDateAndWeekday() {
		logger.info("開始");

		// 日付のフォーマット
		String dayOfWeek = "";
		Calendar calc;
		for (int i = 0; i < 7; i++) {
			// 今日の日付
			calc = Calendar.getInstance();
			// 今日からi日後を算出
			calc.add(Calendar.DATE, i);
			// 曜日を求める
			switch (calc.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY:
				// 日曜日の場合
				dayOfWeek = "日曜日";
				break;
			case Calendar.MONDAY:
				// 月曜日の場合
				dayOfWeek = "月曜日";
				break;
			case Calendar.TUESDAY:
				// 火曜日の場合
				dayOfWeek = "火曜日";
				break;
			case Calendar.WEDNESDAY:
				// 水曜日の場合
				dayOfWeek = "水曜日";
				break;
			case Calendar.THURSDAY:
				// 木曜日の場合
				dayOfWeek = "木曜日";
				break;
			case Calendar.FRIDAY:
				// 金曜日の場合
				dayOfWeek = "金曜日";
				break;
			case Calendar.SATURDAY:
				// 土曜日の場合
				dayOfWeek = "土曜日";
				break;
			default:
				// 上記以外の場合
				dayOfWeek = "不明";
				break;
			}

			logger.info(getFormatSystemDate(calc) + "は" + dayOfWeek + "です");
		}
		logger.info("終了");
	}


	/**
	 *
	 *  日付を表示する
	 *
	 */
	public void getDate() {
		logger.info("開始");

		String dayOfWeek = "";
		// 今日の日付
		Calendar calc;
		for (int i = 0; i < 7; i++) {
			// 今日の日付
			calc = Calendar.getInstance();
			// 今日からi日後を算出
			logger.info("今日からi日後は" + sdf.format(calc.getTime()) + "です");
			logger.info(getFormatSystemDate(calc, i) + "は" + dayOfWeek + "です");
		}
		logger.info("終了");
	}

	  /**
	   * 対象の日付を指定のモードで文字列変換した値を返す。
	   *
	   * @param calc 対象の日付
	   * @param mode フォーマット変換モード
	   * @return 結果の日付文字列
	   */
	  private String getFormatSystemDate(final Calendar calc) {

	      return sdf.format(calc.getTime());
	  }

	  /**
	   * 対象の日付に日数を加減算した結果を指定のモードで文字列変換した値を返す。
	   *
	   * @param calc 対象の日付
	   * @param addDay 加算される日数(+で加算,マイナスで減算)
	   * @param mode フォーマット変換モード
	   * @return 結果の日付文字列
	   */
	  private String getFormatSystemDate(final Calendar calc , final int addDay) {
	      calc.add(Calendar.DATE, addDay);
	      return sdf.format(calc.getTime());
	  }
}
