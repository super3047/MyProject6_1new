import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DataOperation operation = new DataOperationAdapter();

        int[] data = {9, 2, 5, 1, 7, 3, 6, 8, 4};
        System.out.println("原始数组: " + Arrays.toString(data));

        operation.Sort(data);
        System.out.println("排序后数组: " + Arrays.toString(data));

        int[] targets = {5, 8, 10};
        for (int target : targets) {
            int index = operation.Search(data, target);
            if (index != -1) {
                System.out.println("元素 " + target + " 找到在索引 " + index);
            } else {
                System.out.println("元素 " + target + " 未找到");
            }
        }
    }
}