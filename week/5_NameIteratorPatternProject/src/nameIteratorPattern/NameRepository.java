package nameIteratorPattern;

public class NameRepository {
  Iterator getIterator() {
    return new NameIterator();
  }

  Iterator getOddIterator() {
    return new OddNameIterator();
  }
}
