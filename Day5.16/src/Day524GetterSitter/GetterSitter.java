package Day524GetterSitter;

public class GetterSitter {
    private String name;
    private int age;
    private boolean male;//特例

    public void setMale(boolean male) {
        this.male = male;
        male=true;
    }

    public boolean isMale() {
        return male;
    }

    public void setname(String name) {
          this.name=name;
          name="蔡徐坤";
    }
    public String getname(){
        return name;

    }

    public void setAge(int age) {
        this.age = age;
        age=19;
    }

    public int getAge() {
        return age;
    }
}
