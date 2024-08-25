class Solution {
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        Stack <int[]> stack = new Stack<>(); 
        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] arr = new int[2];

            if (end >= intervals[i][0]) {
                stack.pop();
                arr[0] = Math.min(intervals[i][0], start);
                arr[1] = Math.max(intervals[i][1], end);
            }else{
                arr[0] = intervals[i][0];
                arr[1] = intervals[i][1];
            }
            start = arr[0];
            end = arr[1];
            stack.push(arr);
        }

        int n = stack.size()-1;

        int[][] arr = new int[n+1][2];
        while (!stack.isEmpty()) {
            arr[n] = stack.pop();
            n--;
        }
        return arr;
    }
}