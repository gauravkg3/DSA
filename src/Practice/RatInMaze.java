package Practice;

public class RatInMaze {
    public static void main(String[] args) {
        int mat[][]={{1,1,1,0},
                     {1,1,0,1},
                     {1,1,0,0},
                     {1,1,1,1},
        };
        int n=mat.length;//4
        int m=mat[0].length;
        boolean visited[][]=new boolean[n][m];
        visited[0][0]=true;
        String path="";
        ratInMaze(mat,visited,0,0,n,m,path);
    }
   static boolean isValid(int i,int j,int mat[][],boolean visited [][],int n,int m )
    {
    if(i<n && i>=0 && j>=0 && j<m && !visited[i][j] && mat[i][j]==1)
    {
        return true;
    }
    return false;
    }
    static void ratInMaze(int mat[][],boolean visited [][],int i,int j,int n,int m ,String path){
        if(i==n-1 && j==m-1){//bottomRightCorner reached
            System.out.println(path);
            return;
        }
        //direction DLRU
        if(isValid(i+1,j,mat,visited,n,m)) //D
        {
            visited[i+1][j]=true;
            ratInMaze(mat, visited, i+1, j, n, m, path+'D');
            visited[i+1][j]=false;
        }if(isValid(i,j-1,mat,visited,n,m)) //L
        {
            visited[i][j-1]=true;
            ratInMaze(mat, visited, i, j-1, n, m, path+'L');
            visited[i][j-1]=false;
        }if(isValid(i,j+1,mat,visited,n,m)) //R
        {
            visited[i][j+1]=true;
            ratInMaze(mat, visited, i, j+1, n, m, path+'R');
            visited[i][j+1]=false;
        }if(isValid(i-1,j,mat,visited,n,m)) //U
        {
            visited[i-1][j]=true;
            ratInMaze(mat, visited, i-1, j, n, m, path+'U');
            visited[i-1][j]=false;
        }


    }
}
