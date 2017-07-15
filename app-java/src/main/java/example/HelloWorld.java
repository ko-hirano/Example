package example;

public class HelloWorld {

  public void coveredByUnitTest() {
    System.out.println("coveredByUnitTest1");
    for (int i=0; i< 10 ;i++) {
    if (i%2==0) {
    	System.out.println ( "iは"+ "偶数です(" + i + ")");
    }else{
    			System.out.println("iは"+ "奇数です(" + i + ")");
    }
    }
  }

  public void coveredByIntegrationTest() {
    System.out.println("coveredByIntegrationTest1");
    System.out.println("coveredByIntegrationTest2");
    System.out.println("coveredByIntegrationTest3");
  }

  public void notCovered() {
    System.out.println("notCovered");
  }

}
