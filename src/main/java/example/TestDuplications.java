package example;

import org.apache.log4j.Logger;



public class TestDuplications {
  Logger logger = Logger.getLogger(Logger.class.getName ());

  public void testDuplications() {
	logger.info("coveredByUnitTest1開始");
    for (int i=0; i< 10 ;i++) {
	if (i%2==0) {
	logger.info("i(" + i + ")は偶数です");
	switch(i) {
	case 2:
		logger.info( "iは2です");
	case 4:
		logger.info( "iは4です");
	case 6:
		logger.info( "iは6です");
	case 8:
		logger.info( "iは8です");
	case 10:
		logger.info( "iは10です");
	default:
	}
	}else{
	logger.info("i(" + i + ")は奇数です");
	switch(i) {
	case 1:
		logger.info( "iは1です");
	case 3:
		logger.info( "iは3です");
	case 5:
		logger.info( "iは5です");
	case 7:
		logger.info( "iは7です");
	case 9:
		logger.info( "iは9です");
	default:break;
	}
	    }
    }
	logger.info("coveredByUnitTest1終了");
  }

  public void notCovered() {
    System.out.println("notCovered");
  }

}
