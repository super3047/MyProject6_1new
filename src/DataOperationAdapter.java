public class DataOperationAdapter implements DataOperation {
    private final QuickSort quickSort = new QuickSort();
    private final BinarySearch binarySearch = new BinarySearch();

    @Override
    public void Sort(int[] array) {
        quickSort.quickSort(array);
    }

    @Override
    public int Search(int[] array, int target) {
        return binarySearch.binarySearch(array, target);
    }
}