public class Practies {
    public static void main(String[] args) {

    int [] numbers={10,5,7,3,9,5};
        System.out.print( "Before the selection sort: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
            System.out.println();
        }

        for (int i = 0; i < numbers.length; i++) {
            int min=i;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]<numbers[min]){
                    min=j;
                }
            }
            int temp=numbers[i];
            numbers[i]=numbers[min];
            numbers[min]=temp;
        }
        System.out.println("after the selection sort");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( numbers[i] + " ");
            System.out.println();
        }


    }
}