package Day604;

public class StaticDemo {
    private int id;
    private String name;
    public int age;
    static String room;
    private static int idconcert = 0;

    public StaticDemo() {
        this.id=++idconcert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StaticDemo(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idconcert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
