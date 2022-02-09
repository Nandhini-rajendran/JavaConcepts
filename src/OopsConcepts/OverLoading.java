package OopsConcepts;
//overloading

class Dog {
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

class OverLoading {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.display();
        System.out.println();
        d1.display('#');
    }
}
