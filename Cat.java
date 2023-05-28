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
