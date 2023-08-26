package org.example.CloneExample;

import org.example.EqualOverride;

import java.util.Arrays;

public class Clone implements Cloneable{

    public int a;
    public int b;

    public EqualOverride eq;

    public EqualOverride[] eqarr;

    public Clone(int a, int b) {
        this.a = a;
        this.b = b;
        eq = new EqualOverride("err","dsd");
        eqarr = new EqualOverride[]{eq};
    }

    @Override
    protected Clone clone() throws CloneNotSupportedException {
        Clone clone = (Clone) super.clone();
        clone.eq = eq.clone();
        clone.eqarr = Arrays.copyOf(eqarr,1);
        return clone;
    }

    @Override
    public String toString() {
        return "Clone{" +
                "a=" + a +
                ", b=" + b +
                ", eq=" + eq +
                "eqarr=" + eqarr[0].hashCode()+
                '}';
    }
}
