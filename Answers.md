### Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?

 HashMap is O(1). and TreeMap is always O(log(n)). HashMap is faster because it is less complex. 

### What happens if you invoke `countWords` multiple times for different String iterators?

It would only return the last iterator becuase it refreshes the counter every time you call it. 

### What crucial role does the Iterator abstraction play in making `WordCounter` testable?

It goes through each word one by one, which makes the methods run properly becuase strings are being inputed one at a time instead of all at once.