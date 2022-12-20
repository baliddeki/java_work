package serialization_deserialization;

import java.io.Serializable;

public class Implement_Details implements Serializable {
    public String lec_Details(String name, int age) {
        String n = "Your lecturer is " + name + " and he is aged " + age + "years";
        return n;
    }

}

