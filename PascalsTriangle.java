import java.util.ArrayList;
import java.util.List;
class Solution{
    public List<List<Integer>> generate(int numRows) { 
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else{
                    List<Integer> prevRow = ans.get(i - 1);
                    int sum = prevRow.get(j) + prevRow.get(j - 1);
                    row.add(sum);
                }
            }
            ans.add(row);
        }
        return ans;
    }
}