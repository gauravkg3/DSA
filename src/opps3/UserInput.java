package opps3;

public class UserInput {
        public static void main(String args[]) {
     /*       int numbers[]={1,45,85,2,99,63};
            System.out.println(Integer.MAX_VALUE);
            int min=numbers[0];
            for(int number:numbers)
            {
                if(min>number)
                {
                    min=number;
                }
            }
            System.out.println(min);*/

            int marks[][]={{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
            for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.print(marks[i][j]+" ");
                }
                System.out.println();
            }


        }
    }

