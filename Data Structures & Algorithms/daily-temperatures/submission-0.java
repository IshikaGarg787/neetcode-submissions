class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int n = temperatures.length; 

        for(int i=0; i<n; i++){
            int j = i+1;
            int count = 1;

            while(j<n){
                if(temperatures[j] > temperatures[i]){
                    break;
                }
                j++;
                count++;
            }

            if(j == n){
                count = 0;
            }
            else{
                count = count;
            }
            res[i] = count;
        }
        return res;
    }
}
