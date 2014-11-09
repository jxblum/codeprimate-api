package org.codeprimate.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The ArrayUtilsTest class is a test suite of test cases testing the contract and functionality
 * of the ArrayUtils class.
 *
 * @author jblum
 * @see org.codeprimate.util.ArrayUtils
 * @since 1.0.0
 */
public class ArrayUtilsTest {

  @Test
  @SuppressWarnings("null")
  public void testGetElementAtIndex() {
    Object[] array = { "test", "testing", "tested" };

    assertEquals("test", ArrayUtils.elementAt(array, 0, null));
    assertEquals("testing", ArrayUtils.elementAt(array, 1, null));
    assertEquals("tested", ArrayUtils.elementAt(array, 2, null));
  }

  @Test
  public void testGetElementAtIndexThrowingArrayIndexOutOfBoundsException() {
    assertEquals("test", ArrayUtils.elementAt(new Object[0], 0, "test"));
  }

  @Test
  public void testGetElementAtIndexThrowingArrayIndexOutOfBoundsExceptionOnNonEmptyArray() {
    assertEquals("defaultValue", ArrayUtils.elementAt(new Object[] { "test" }, 1, "defaultValue"));
  }

  @Test
  public void testGetFirst() {
    assertEquals("first", ArrayUtils.getFirst("first", "second", "third"));
    assertEquals("null", ArrayUtils.getFirst("null", "nil", null));
    assertEquals("test", ArrayUtils.getFirst("test"));
    assertNull(ArrayUtils.getFirst((Object[]) null));
    assertNull(ArrayUtils.getFirst(new Object[0]));
    assertNull(ArrayUtils.getFirst(null, null, null));
  }

  @Test
  public void testGetLast() {
    assertEquals("third", ArrayUtils.getLast("first", "second", "third"));
    assertNull(ArrayUtils.getLast("null", "nil", null));
    assertEquals("test", ArrayUtils.getLast("test"));
    assertNull(ArrayUtils.getLast((Object[]) null));
    assertNull(ArrayUtils.getLast(new Object[0]));
    assertNull(ArrayUtils.getLast(null, null, null));
  }

  @Test
  public void testToString() {
    Object[] array = { "test", "testing", "tested" };

    assertEquals("[test, testing, tested]", ArrayUtils.toString(array));
  }

  @Test
  public void testToStringWithEmptyArray() {
    assertEquals("[]", ArrayUtils.toString((new Object[0])));
  }

  @Test
  public void testToStringWithNullArray() {
    assertEquals("[]", ArrayUtils.toString((Object[]) null));
  }

}