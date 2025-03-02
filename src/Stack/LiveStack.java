    package Stack;

    import java.util.ArrayDeque;

    public class LiveStack {
        public static void main(String[] args) {
            //int arr[]={2,1,6,6,2,3};
            //System.out.println(maxAreaInHistogram(arr));
            int arr[][]={{1,0,1,0,0},{1,1,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
            System.out.println(largestMatrixWithAllOne(arr));
        }

        static  int largestMatrixWithAllOne(int arr[][])
        {
            int row= arr.length;;
            if(row==0) return 0;
            int col=arr[0].length;
            int hist[]=new int[col];
            int maxArea=0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(arr[i][j]==0)
                    {
                        hist[i]=0;
                    }else{
                        hist[i]++;
                    }
                }
                int currArea=maxAreaInHistogram(hist);
                maxArea=Math.max(currArea,maxArea);
                }
            return  maxArea;
        }
        static int maxAreaInHistogram(int a[])
        {
        int n=a.length;
        int ps[]=previousSmaller(a);
        int ns[]=nextSmaller(a);
        int max=0;
            for (int i = 0; i < n; i++) {
                max=Math.max(max,(ns[i]-ps[i]-1)*a[i]);
            }
            return  max;
        }
        static int[] previousSmaller(int arr[])
        {
            ArrayDeque<Integer> stack=new ArrayDeque<>();
            int n=arr.length;
            int ans[]=new int[n];

            for (int i = 0; i < n; i++) {
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    ans[i]=-1;
                }
                else{
                    ans[i]=stack.peek();
                }
                stack.push(i);
            }
            return ans;
        }
        static int[] nextSmaller(int arr[])
        {
            ArrayDeque<Integer> stack=new ArrayDeque<>();
            int n=arr.length;
            int ans[]=new int[n];

            for (int i = n-1; i >=0; i--) {
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    ans[i]=n;
                }
                else{
                    ans[i]=stack.peek();
                }
                stack.push(i);
            }
            return ans;
        }
    }


