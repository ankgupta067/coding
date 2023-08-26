package org.example;

public class Main {
    public static void main(String[] args) {
       EqualOverride eo = new EqualOverride("tola", "dsd");
       EqualOverride eo1 = new EqualOverride("Tola", null);
       if (eo1.equals(eo)){
           System.out.println("equals");
       }else {
           System.out.println("not equals");
       }
    }
}