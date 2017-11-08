package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // DONE complete this main program
    // 1. create a WordCounter instance
    
    Map<String, Integer> map = new HashMap<>();
    WordCounter count = new WordCounter(map);
    // 2. use this to count the words in the input
    
    count.countWords(input);
    // 3. determine the size of the resulting map
    
    int size = count.getCounts().size();
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    
    List<Map.Entry<String, Integer>> list = new ArrayList<>(size);
    list.addAll(count.getCounts().entrySet());
    // 6. sort the ArrayList in descending order by count
    //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
    
    Collections.sort(list, new DescendingByCount());
    // 7. print the (up to) ten most frequent words in the text
    
    if (count.getCounts().size() < 11) {
      for (int i = 0; i < count.getCounts().size(); i++) {
        System.out.println(list.get(i));
      }
    } else {
      for (int i = 0; i < 10; i++) {
        System.out.println(list.get(i));
      }
    }

  }
}
