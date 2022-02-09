package OopsConcepts;
class Square
{
    public void size()
    {
        System.out.println("square");
    }
}
class Polygon extends Square
{
    public void size()
    {
        System.out.println("polygon");
    }
}
class circle extends Polygon
{
    public void size()
    {
        System.out.println("circle");
    }
}
public class PolyMorphsim
{
    public static void main(String[] args)
    {
        Polygon p1=new Polygon();
        p1.size();
        circle c1=new circle();
        c1.size();
        Square s1=new Square();
        s1.size();
    }
}
