public class Main {
    public static void main(String[] args) {
        Dog Rex = new Dog(7, "Rex");
        Dog Odin = new Dog(5, "Odin");

        //output first
        System.out.println(Rex.getAge());
        System.out.println(Rex.getName());

        System.out.println(Odin.getAge());
        System.out.println(Odin.getName());

        Rex.setAge(3);
        Rex.setName("Trogdor");
        Odin.setAge(4);
        Odin.setName("Thor");

        System.out.println(Rex.getAge());
        System.out.println(Rex.getName());

        System.out.println(Odin.getAge());
        System.out.println(Odin.getName());
    }

    public static class Dog {
        int age;
        String name;
        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
    }
}