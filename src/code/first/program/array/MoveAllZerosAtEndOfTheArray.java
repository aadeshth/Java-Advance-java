package code.first.program.array;

public class MoveAllZerosAtEndOfTheArray {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 0, 5, 2};  //1,4,5,2,5,2 zeroCount=2
        int j = 0;
        for (int i = 0; i < array.length; i++) {
           if(array[i]!=0)
            {
            array[j] = array[i];
            j = j + 1;
            }
        }
        System.out.println("J: "+j);
        for (int i = 0 ; i<array.length; i++)
            System.out.print(","+array[i]);

        while(j<array.length)
        {
            array[j] = 0;
            j ++;
        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
       for (int i = 0 ; i<array.length; i++)
        System.out.print(array[i]);
    }
}
