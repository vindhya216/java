public class Maxelement
{
    public static void main(String[] args)
    {
        int arr[] = {10, 55, 60, 23, 75, 42, 89, 15};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}