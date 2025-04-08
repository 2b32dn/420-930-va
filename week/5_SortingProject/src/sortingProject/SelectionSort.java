package sortingProject;

public class SelectionSort {
  // Singleton Pattern to populate collection
  // Original Array [5 2 3 9 1]
  public int a[];

  public SelectionSort() {
    a = new int[] { 5, 2, 3, 9, 1 }; // Initialize the array with default values
    for (int i = 0; i < a.length; i++) {
      int min = a[i]; // first round = 5
      int minId = i; // first round = 0
      for (int j = i + 1; j < a.length; j++) { // Correct the loop condition
        // comparison
        if (a[j] < min) { // 2 < 5
          min = a[j]; // 2
          minId = j; // 1
        }
      }
      // at the end of the inner loop
      // min = a[4] = 1, minId = 4
      int temp = a[i];
      a[i] = min; // 5 is swapped with min = 1
      a[minId] = temp;
    }
  }
}
