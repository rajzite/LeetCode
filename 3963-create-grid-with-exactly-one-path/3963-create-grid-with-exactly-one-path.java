class Solution {
    public String[] createGrid(int m, int n) {
         String[] arr = new String[m];
        if (m==1 || n==1){
            for (int i=0;i<m;i++){
                StringBuilder str = new StringBuilder();
                for (int j=0;j<n;j++){
                    str.append(".");
                }
                arr[i] = str.toString();
            }
        }
        else{
            for (int i=0;i<m;i++){
                StringBuilder str = new StringBuilder();
                if (i==0){
                    for (int j=0;j<n;j++){
                        if (j != n-1){
                            str.append(".");
                        }else{
                            str.append("#");
                        }
                    }
                }else if(i==1){
                    for (int j=0;j<n;j++){
                        if (j >= n-2){
                            str.append(".");
                        }else{
                            str.append("#");
                        }
                    }
                }else{
                    for (int j=0;j<n;j++){
                        if (j == n-1){
                            str.append(".");
                        }else {
                            str.append("#");
                        }
                    }
                }
                arr[i] = str.toString();
            }
        }
        return arr;
    }
}