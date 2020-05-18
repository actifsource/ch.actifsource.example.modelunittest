package ch.actifsource.example.modelunittest;

import junit.framework.*;

public class AllTests {
  
  public static Test suite() {
    TestSuite suite = new TestSuite(AllTests.class.getName());
    //$JUnit-BEGIN$
    suite.addTest(ch.actifsource.example.modelunittest.model.AllTests.suite());
    //$JUnit-END$
    return suite;
  }
  
}
