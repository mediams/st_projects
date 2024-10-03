package my20241002.inheritance;

public class Robot implements Walkable, CatchingSkills {
    private String name;
    private int id;
    private int version;

    public Robot(String name, int id, int version) {
        this.name = name;
        this.id = id;
        this.version = version;
    }

    public void introduce() {
        System.out.printf("Khm... Khm... Im Robot. My name is %s my version is %s.\n", name, version);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                " name='" + name + '\'' +
                ", id=" + id +
                ", version=" + version +
                '}';
    }

    @Override
    public void walk(Animal animal) {
        animal.setHungry(true);
        System.out.println("The animal has taken a walk and is hungry.");
    }

    public void walk(Animal... animal) {
        for (Animal a : animal) {
            walk(a);
        }
    }

    @Override
    public void catchMouse() {
        System.out.printf("%s %s catches mice.\n", this.getClass().getSimpleName(), name);
    }
}
