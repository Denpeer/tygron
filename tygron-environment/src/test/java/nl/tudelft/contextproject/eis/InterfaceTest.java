package nl.tudelft.contextproject.eis;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import eis.iilang.Action;

import org.junit.BeforeClass;
import org.junit.Test;

public class InterfaceTest {
  private static TygronInterface envinterface;

  @BeforeClass
  public static void initObject() {
    envinterface = new TygronInterface();
  }

  @Test
  public void test_environmentSupport() {
    assertNotNull(envinterface);
    Action action = new Action("testAction");
    assertFalse(envinterface.isSupportedByEnvironment(action));
  }

  @Test
  public void testTypeSupport() {
    Action action = new Action("testAction");
    assertFalse(envinterface.isSupportedByType(action, "testType"));
  }
}