public class Wolf extends Animal{
    private String angry;

    public Wolf(String name, int age, String angry) {
        super(name, age);
        this.angry = angry;
    }

    public String getAngry() {
        return angry;
    }

    public void setAngry(String angry) {
        this.angry = angry;
    }

    @Override
    public String eat() {
        return "Koy, Kiyik, Took";
    }

    @Override
    public String livePlace() {
        return "Tokoydo";
    }

    @Override
    public String toString() {
        return "Wolf {"+"Aty: "+getName() + ". Munozu: " + angry +
                "Jashy: "+getAge()+ ". Tamagy: "+eat()+". Jashagan jeri: "+livePlace()+'}';
    }
}
