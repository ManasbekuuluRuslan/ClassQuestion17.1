public class Fish extends Animal{
    private String razmer;

    public Fish(String name, int age, String razmer) {
        super(name, age);
        this.razmer = razmer;
    }

    public String getRazmer() {
        return razmer;
    }

    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }

    @Override
    public String eat() {
        return "Mayda balyktardy, Suu Choptor";
    }

    @Override
    public String livePlace() {
        return "Koldo, Daryada, Okeanda";
    }

    @Override
    public String toString() {
        return "Fish {"+"Aty: "+getName() + ". Razmeri: " + razmer +
                "Jashy: "+getAge()+ ". Tamagy: "+eat()+". Jashagan jeri: "+livePlace()+'}';
    }
}
