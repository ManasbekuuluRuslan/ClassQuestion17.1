public class Cow extends Animal{
    private int weight;

    public Cow(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String eat() {
        return "crass";
    }

    @Override
    public String toString() {
        return "Cow {"+"Aty: "+getName() + ". Salmagy: " + weight +
                "Jashy: "+getAge()+ ". Tamagy: "+eat()+". Jashagan jeri: "+livePlace()+'}';
    }

    @Override
    public String livePlace() {
       return "HomeAnimals";

    }
}
