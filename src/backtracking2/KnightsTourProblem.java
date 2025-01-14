package backtracking2;

public class KnightsTourProblem {
    public static void main(String[] args) {
    int n=6;
    int a[][]=knightTour(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
                }
            System.out.println();

        }
    }
    static int[][] knightTour(int n)
    {
        int a[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=-1;
            }
        }
        a[0][0]=0;
        int movesX[]={2,1,-1,-2,-2,-1,1,2};
        int movesY[]={1,2,2,1,-1,-2,-2,-1};
        knightTourHelper(n,a,movesX,movesY,0,0,1);
        return a;

    }
    static  boolean isValid(int n,int a[][],int x,int y)
    {
        if(x>=0 && y>=0 && x<n && y<n && a[x][y]==-1)
        {
            return true;
        }
        else return  false;
    }
    static boolean knightTourHelper(int n,int a[][],int movesX[],int movesY[],int currX,int currY,int step)
    {
    if(step==n*n) return true;
        for (int i = 0; i < 8; i++) {
            int nextX=currX+movesX[i];
            int nextY=currY+movesY[i];
            if(isValid(n,a,nextX,nextY))
            {
                a[nextX][nextY]=step;
                boolean isTourCompletedByGoingThere=knightTourHelper(n,a,movesX,movesY,nextX,nextY,step+1);
                if(isTourCompletedByGoingThere) {
                    return true;
                }
                else a[nextX][nextY]=-1;
            }
        }
        return  false;
    }
}
