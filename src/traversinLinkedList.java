public class traversinLinkedList {
    public static void main(String[]args)
    {
        int[] data = {1,2,3,4,5,5,56,6,};
        int[] indexes = {1,2,3,4,5,6,7,-1};
        int currentValue = 0;
        while(currentValue != -1)
        {
            System.out.print(data[currentValue] + ", ");
            currentValue = indexes[currentValue];
        }
        System.out.println();
    }
}
