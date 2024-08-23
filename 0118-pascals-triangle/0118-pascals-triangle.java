class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> l = new ArrayList<Integer>();
            int icj = 1;

            for (int j = 0; j <= i; j++) {

                l.add(icj);
                int icjp1 = icj * (i-j) / (j+1);
                icj = icjp1;
            }
            list.add(l);
        }

        return list;

    }
}