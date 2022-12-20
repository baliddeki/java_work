package serialization_deserialization;

import java.io.Serializable;

public class School_Administrator implements Serializable {
    String admin_name;

    public void School_Administrator(String admin_name) {
        this.admin_name = admin_name;
    }
}
