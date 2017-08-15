package example;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloWorld extends Base {
  Logger logger = Logger.getLogger(Logger.class.getName ());

  public void weekdayCalculation() {
	logger.info("coveredByUnitTest1開始");

    String dayOfWeek = "";
    for (int i=0; i< 7 ;i++) {
    	Calendar calc = Calendar.getInstance();
    	    calc.add(Calendar.DATE, i);
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			switch (calc.get(Calendar.DAY_OF_WEEK)) {
			    case Calendar.SUNDAY:
			    	dayOfWeek = "日曜日";
			        break;
			    case Calendar.MONDAY:
			    	dayOfWeek = "月曜日";
			        break;
			    case Calendar.TUESDAY:
			    	dayOfWeek = "火曜日";
			        break;
			    case Calendar.WEDNESDAY:
			    	dayOfWeek = "水曜日";
			        break;
			    case Calendar.THURSDAY:
			    	dayOfWeek = "木曜日";
			        break;
			    case Calendar.FRIDAY:
			    	dayOfWeek = "金曜日";
			        break;
			    case Calendar.SATURDAY:
			    	dayOfWeek = "土曜日";
			        break;
			}
			logger.info(getFormatSystemDate(i) + "は" + dayOfWeek + "です");
    }
	logger.info("coveredByUnitTest1終了");
  }

}
