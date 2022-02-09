package OopsConcepts;
//overloading

class Doge {
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }
}
class mesu extends Doge
{
    @Override
    public void display()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print("#");
        }
    }
}

class OverRiding{
    public static void main(String[] args) {
        Doge d1 = new Doge();
        d1.display();
        System.out.println();
        d1.display();
    }
}

