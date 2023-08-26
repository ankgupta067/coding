package org.example;

import java.util.Objects;

public class EqualOverride implements Cloneable{

    public  String firstName;
    public String lastName;


    public EqualOverride(String fname , String lname){
        firstName =  Objects.requireNonNull(fname);
        lastName = lname;
    }

    @Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if( !(o instanceof EqualOverride)){
            return false;
        }
        EqualOverride eo =  (EqualOverride)o;
        if ((lastName == null && eo.lastName == null)){
           return firstName.equalsIgnoreCase(eo.firstName);
        }
        if (lastName != null){
            return lastName.equalsIgnoreCase(eo.lastName) && firstName.equalsIgnoreCase(eo.firstName);
        }
        return false;

    }

    @Override
    public String toString() {
        return "EqualOverride{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public EqualOverride clone() throws CloneNotSupportedException {
        return (EqualOverride) super.clone();
    }
}



