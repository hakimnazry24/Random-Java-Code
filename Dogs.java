public class Dogs {
    public static void main(String[] args){
        Dog[] dogs = new Dog[4];
        for (int i = 0; i < dogs.length; i++){
            dogs[i] = new Dog();
        }
        dogs[0].name = "Sweet";
        dogs[1].name = "Tim";
        dogs[2].name = "Cutie";
        dogs[3].name = "Paul";

        // public members are inherited
        // private members are not inherited 

        int i = 0;
        while (i < dogs.length){
            dogs[i].bark();
            i++;
        }
    }
}
class Dog{
    String name;
    String breed;
    int age;

    public void bark(){
        System.out.println(name + " is barking");
    }
}
