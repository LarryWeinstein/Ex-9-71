public class Main {
    public static void main(String[] args) {
        Dog Rex = new Dog("Rex", "Husky");
        Dog Odin = new Dog("Odin", "Labrador");

        //output first to confirm correct assignment from constructor
        System.out.println(Rex.getBreed());
        System.out.println(Rex.getName());

        System.out.println(Odin.getBreed());
        System.out.println(Odin.getName());

        Rex.setName("Trogdor");
        Rex.setBreed("German Shepherd");
        Odin.setName("Thor");
        Odin.setBreed("Thor");

        System.out.println(Rex.getBreed());
        System.out.println(Rex.getName());

        System.out.println(Odin.getBreed());
        System.out.println(Odin.getName());
    }
}