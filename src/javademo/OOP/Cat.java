package javademo.OOP;

public class Cat extends Animal {
    private String LittlerPreference;

    public String getLittlerPreference() {
        return LittlerPreference;
    }

    public void setLittlerPreference(String littlerPreference) {
        LittlerPreference = littlerPreference;
    }

    public Cat() {
        this.name = "Nameless Cat";
        this.age = 0;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
