package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // DONE complete this test class

  // DONE declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter count;

  @Before
  public void setUp() {
    // DONE create the SUT instance
    Map<String, Integer> map = new HashMap<String, Integer>();
    count = new WordCounter(map);
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    count = null;
  }

  @Test
  public void testGetCountEmpty() {

    // DONE verify that the SUT initially returns an empty map
    assertEquals(count.getCounts(), Collections.emptyMap());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    count.countWords(Arrays.asList("asdf", "oiu", "qwer", "oiu").iterator());

    assertEquals(count.getCount("asdf"), 1);
    assertEquals(count.getCount("oiu"), 2);
    // assertEquals(count.getCount("good"), 0);
    // assertEquals(count.getCount("grief"), 0);
  }
}
