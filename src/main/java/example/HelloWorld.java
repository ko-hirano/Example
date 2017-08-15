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
			    case Calendar.SUNDAY:     // Calendar.SUNDAY:1 （値。意味はない）
			        //日曜日
			    	dayOfWeek = "日曜日";
			        break;
			    case Calendar.MONDAY:     // Calendar.MONDAY:2
			        //月曜日
			    	dayOfWeek = "月曜日";
			        break;
			    case Calendar.TUESDAY:    // Calendar.TUESDAY:3
			        //火曜日
			    	dayOfWeek = "火曜日";
			        break;
			    case Calendar.WEDNESDAY:  // Calendar.WEDNESDAY:4
			        //水曜日
			    	dayOfWeek = "水曜日";
			        break;
			    case Calendar.THURSDAY:   // Calendar.THURSDAY:5
			        //木曜日
			    	dayOfWeek = "木曜日";
			        break;
			    case Calendar.FRIDAY:     // Calendar.FRIDAY:6
			        //金曜日
			    	dayOfWeek = "金曜日";
			        break;
			    case Calendar.SATURDAY:   // Calendar.SATURDAY:7
			        //土曜日
			    	dayOfWeek = "土曜日";
			        break;
			}
			logger.info(getFormatSystemDate(i) + "は" + dayOfWeek + "です");
    }
	logger.info("coveredByUnitTest1終了");
  }

}
