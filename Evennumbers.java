public class Evennumbers
{
    public static void main(String[] args)
    {
        int arr[] = {10, 55, 60, 23, 75, 42, 89, 15};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}