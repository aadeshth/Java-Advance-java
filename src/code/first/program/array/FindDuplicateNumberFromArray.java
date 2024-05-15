package code.first.program.array;

public class FindDuplicateNumberFromArray {
    // input array ={1,2,4,1,5,2}
    // in for check is number exist in all right elements
    // if element exists then print that number

    public static void main(String[] args) {
        int[] array = {1,2,4,1,5,2};
        for(int i = 0; i<array.length;i++)
        {
            for(int j= i+1; j<array.length; j++)
            {
                if(array[i]==array[j])
                {
                    System.out.println(String.format("Duplicate position are = %d, %d, value= %d ",i, j, array[i]));
                }

                /*
                iteration 1
                for loop of J
                // i =0 index  , j=1 index  ,
                if(array[0] == array[1]) // 1 == 2 = false
                  j = j+1;  j = 2

                  iteration 2
                   i= 0 , j = 2 , 2 < 6
                   if(array[0] == array[2]) // 1 == 4 == false

                   j = 2 +1 = 3

              iteration 3
           i= 0 , j = 3 , 3 < 6
          if(array[0] == array[3]) // 1 == 1 == true
                 */
            }

            // i = i+1
        }
    }





}
