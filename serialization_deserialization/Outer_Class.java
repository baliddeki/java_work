package serialization_deserialization;

import org.w3c.dom.ls.LSOutput;

public class Outer_Class {
    int a;
    int b;

    public Outer_Class(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int add() {
        return a + b;

    }

    class Inner_Class {
        int c = 10;

        public int add() {
            return a + b + c;

        }


    }


    public static void main(String[] args) {
        Outer_Class out = new Outer_Class(10, 5);
        Outer_Class.Inner_Class inn = out.new Inner_Class();

        System.out.println(inn.add());


    }
}
