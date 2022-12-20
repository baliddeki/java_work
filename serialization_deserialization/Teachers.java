package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Teachers {
    public static void main(String[] args) {
        try {
            School_Administrator sch_ad = new School_Administrator();
            sch_ad.School_Administrator("Ssentongo Godfrey");
            FileOutputStream fos = new FileOutputStream("admin_file.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sch_ad);
            //oos.close();
            //fos.close();

            FileInputStream fis = new FileInputStream("admin_file.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            School_Administrator adm = (School_Administrator) ois.readObject();
            System.out.println("file output: " + adm.admin_name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
