package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter count;

  @Before
  public void setUp() {
    // DONE create the SUT instance
    this.count = count;
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    count = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(aMap.isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    Iterator itr = Arrays.asList("hey", "hi", "hello", "world", "hello", "hi").iterator();
    count.countWords(itr);
    assertEquals(2, count.getCount("hello"));
    assertEquals(2, count.getCount("hi"));
    assertNotEquals(2, count.getCount("world"));
    assertNotEquals(2, count.getCount("hey"));
    assertNotEquals(1, count.getCount("bye"));

  }
}
