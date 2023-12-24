public class Dog {
    private int age;
    private String name;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
