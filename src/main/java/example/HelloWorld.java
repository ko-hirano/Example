package example;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloWorld extends Base {
	Logger logger = Logger.getLogger(Logger.class.getName());
	/**
	 *
	 *  日付から曜日を求める
	 *
	 */
	public void weekdayCalculation() {
		logger.info("開始");

		// 日付のフォーマット
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String dayOfWeek = "";
		// 今日の日付
		Calendar calc = Calendar.getInstance();
		for (int i = 0; i < 7; i++) {
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
			}
			logger.info(getFormatSystemDate(i) + "は" + dayOfWeek + "です");
		}
		logger.info("終了");
	}

}
