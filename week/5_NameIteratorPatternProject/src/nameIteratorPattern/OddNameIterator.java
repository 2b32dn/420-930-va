package nameIteratorPattern;

public class OddNameIterator extends NameIterator { // Extending NameIterator's extension of Iterator
  public boolean hasNext() {
    if (index < names.length)
      return true;
    return false;
  }

  public Object next() {
    if (this.hasNext() && index % 2 == 1) {
      return this.names[index++];
    } else {
      index++;
    }
    return new Object();
  }
}
