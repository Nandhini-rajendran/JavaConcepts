interface I1
{
    final int i=10;
    default void display()
    {
        System.out.println("geeksforgeeks");
    }
}

 class Interface implements I1
{
    public static void main(String[] args)
    {
        Interface t=new Interface();
        t.display();
    }
}
