lass Solution {
    public int[][] merge(int[][] intervals) {
        int n= intervals.length;

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int []a ,int []b)
            {
                return a[0]-b[0];
            }
        });
        List<int[]>merged =new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            if(merged.isEmpty() || intervals[i][0] > merged.get(merged.size()-1)[1]){
                merged.add(new int[]{intervals[i][0],intervals[i][1]});
            }
            else
            {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
            }
        }
        int [][]result= new int[merged.size()][2];
        for(int i= 0; i<merged.size() ;i++){
            result[i] =merged.get(i);
        }
        return result;
    }
}
