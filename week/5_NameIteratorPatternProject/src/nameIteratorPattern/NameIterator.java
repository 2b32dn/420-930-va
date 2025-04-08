package nameIteratorPattern;

public class NameIterator implements Iterator {
  public String names[] = {
      "Robert",
      "Khan",
      "Lee",
      "Jessica"
  };
  int index;

  public NameIterator() {
    this.index = 0;
  }

  public boolean hasNext() {
    if (index < names.length)
      return true;
    return false;
  }

  // Traversal
  public Object next() {
    if (this.hasNext())
      return this.names[index++];
    return new Object();
  }
}
