package OopsConcepts;

    class calc
    {
        int z;
        public void add(int x,int y)
        {
            z=x+y;
            System.out.println(z);
        }
        public void sub(int x,int y)
        {
            z=x-y;
            System.out.println(z);
        }
    }
    public class Inheritance extends calc
    {
        public void mul(int x,int y)
        {
            z=x*y;
            System.out.println(z);
        }

        public static void main(String[] args)
        {
            int a=10,b=20;
            Inheritance me=new Inheritance();
            me.add(a,b);
            me.sub(a,b);
            me.mul(a,b);

        }
    }


