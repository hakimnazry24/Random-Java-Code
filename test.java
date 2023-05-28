public class test{
    public static void main (String[] args){
        AnotherDog dog1 = new AnotherDog();
        dog1.size = 80;

        AnotherDog dog2 = new AnotherDog();
        dog2.size = 20;

        dog1.bark();
        dog2.bark();
        System.out.println(dog1.get_size());
    }
}
class AnotherDog{
    int size;
    String name;

    void bark(){
        if (size > 60){
            System.out.println("Woof woof");
        }
        else if (size > 14){
            System.out.println("ruff ruff");
        }
        else{
            System.out.println("Yip yip");
        }
    }
    int get_size(){
        return size;
    }
}