public class Main {
    public static void main(String[] args) {

    Animal cow = new Cow("Ak uy",4,180);
    Animal wolf = new Wolf("Kok boru",2,"Oto zloy");
    Animal fish = new Fish("Akula",3,"2metr");
    Animal[] animals = {cow, wolf, fish};
        for (Animal a: animals) {
            System.out.println(a);
        }
    }
}