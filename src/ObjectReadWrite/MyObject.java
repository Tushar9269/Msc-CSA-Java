package ObjectReadWrite;

import java.io.Serializable;

public class MyObject implements Serializable {
    private String Name;
    private int Age;

    MyObject(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public String toString(){
        return "Name: " + Name + ", Age: " + Age;
    }
}
