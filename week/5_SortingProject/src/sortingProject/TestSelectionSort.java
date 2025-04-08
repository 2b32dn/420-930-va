package sortingProject;

public class TestSelectionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 2, 9, 3, 1 };

    for (int i = 0; i < arr.length; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[index]) {
          index = j;
        }
      }

      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }

    System.out.println("Printing");
    for (int num : arr) {
      System.out.println(num);
    }

    SelectionSort mySelectionSort = new SelectionSort();
    mySelectionSort.a = new int[] { 5, 2, 9, 3, 1 };
    System.out.println("Before Applying Selection Sort");
    for (int i = 0; i < mySelectionSort.a.length; i++) {
      System.out.print(mySelectionSort.a[i] + " ");
    }
  }

}
