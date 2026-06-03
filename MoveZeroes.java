class Solution{
    public void moveZeroes (int[] z){
        int insertpos = 0;
        for(int i=0;i<z.length;i++){
            if(z[i] != 0){
                z[insertpos] = z[i];
                insertpos++;
            }

        }
        for(int j=insertpos;j<z.length;j++){
        z[j]=0;
        }

    }
}
