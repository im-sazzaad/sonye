

class Parent{
    String name;
    int age;
    public Parent(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("parent");
    }
    public void printAge(){
        System.out.println("parents age 55");
    }

}
class Child extends Parent{
    String gender;
    public Child(String name, int age, String gender){
        super(name, age);
        this.gender=gender;
        System.out.println("child");
    }
    public void printAge(){
        System.out.println("age was 13");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c =new Child("bolaka",12, "male");
        Parent p = new Parent("bagdum", 56);
        p.printAge();
        c.printAge();
        System.out.println("name: "+c.name+" age: "+c.age+" gender: "+c.gender);

    }
}