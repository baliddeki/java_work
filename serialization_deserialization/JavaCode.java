package serialization_deserialization;

import java.io.*;
import java.util.*;

public class JavaCode {

    public static void main(String[] args) {
        try {
            Implement_Details that = new Implement_Details();
            System.out.println("Enter your details");
            Scanner scan = new Scanner(System.in);
            System.out.println("name: ");
            String name = scan.next();
            System.out.println("age: ");
            int age = scan.nextInt();
            FileWriter f = new FileWriter("serialization_deserialization/oop_file");
            f.write(that.lec_Details(name, age));
            f.close();
            FileOutputStream fos = new FileOutputStream("serialization_deserialization/oop_file.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(that);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
