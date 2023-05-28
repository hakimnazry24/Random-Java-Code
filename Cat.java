public class Cat {
    private int age;
    private String color;

    // setter and getter
    public int getCatAge(){
        return age;
    }
    public void setCatAge(int a){
        age = a;
    }
}
class TestDrive{
    public static void main (String[] args){
        Cat cat1 = new Cat();
        cat1.setCatAge(10);
        System.out.println(cat1.getCatAge());
    }
}

    public void makeSound(){}
    public void eat(){
        System.out.println("cat is eating");
    }
    public static void main(String[] args){
        HouseCat cat = new HouseCat(2, "Tompol", 4);
        Tiger tiger= new Tiger(10, "Belang", 20);
        cat.makeSound();
        tiger.makeSound();
        cat.eat();
        tiger.eat();
    }
}
class HouseCat extends Cat{
    HouseCat(int a, String n, int w){
        age = a;
        name = n;
        weight = w;
    }
    public void makeSound(){
        System.out.println("meow");
    }
}
class Tiger extends Cat{
    Tiger(int a, String n, int w){
        age = a;
        name = n;
        weight = w;
    }
    public void makeSound(){
        System.out.println("rawr");
    }
}