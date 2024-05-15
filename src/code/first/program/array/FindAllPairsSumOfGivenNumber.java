package code.first.program.array;

public class FindAllPairsSumOfGivenNumber {
    public static void main(String[] args) {
        int[] array = {1,2,4,1,5,2};
        int sum=5;
        for(int i= 0; i < array.length; i++)
            for(int j = i+1; j < array.length; j++)
            {
               if(array[i]+array[j] == sum)
                   System.out.println(array[i] + "+"+array[j]+"="+sum);
            }

    }
}
