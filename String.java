class StringDemo {
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "hello";
        System.out.println(a);
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        if(a.equals(b))
        {
            System.out.println("a is equal to b");
        }
        else
        {
            System.out.println("a is not equal to b");
        }
    }
}