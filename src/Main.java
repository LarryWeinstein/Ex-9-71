public class Main {
    public static void main(String[] args) {
        Dog Rex = new Dog("Rex", 7);
        Dog Odin = new Dog("Odin", 5);

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
}