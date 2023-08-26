package org.example.CloneExample;

public class CloneTest{
    public static void main(String[] args) {
        Clone clone = new Clone(20,30);
        try {
            Clone clone1 = clone.clone();
            clone.eq.lastName = "sadad";
            System.out.println(clone);
            System.out.println(clone1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
