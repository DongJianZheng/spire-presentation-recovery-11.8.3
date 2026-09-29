/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.sprypm;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprjpm {
    private Hashtable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjpm(sprrvm sprrvm2) {
        void arg0;
        int n;
        sprjpm sprjpm2 = this;
        sprjpm2.cfr_renamed_4 = new Hashtable();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            spruem spruem2 = spruem.cfr_renamed_23(arg0.cfr_renamed_576(n));
            this.cfr_renamed_11334(spruem2.cfr_renamed_204(), spruem2);
            n2 = ++n;
        }
    }

    public sprjpm cfr_renamed_11335(sprlem arg0, sprco arg1) {
        sprjpm sprjpm2 = new sprjpm(this.cfr_renamed_4);
        sprlem sprlem2 = arg0;
        sprlem sprlem3 = arg0;
        sprjpm2.cfr_renamed_11334(sprlem3, new spruem(sprlem3, new sprocn(arg1)));
        return sprjpm2;
    }

    public spruem cfr_renamed_5299(sprlem arg0) {
        Object v = this.cfr_renamed_4.get(arg0);
        if (v instanceof Vector) {
            return (spruem)((Vector)v).elementAt(0);
        }
        return (spruem)v;
    }

    /*
     * WARNING - void declaration
     */
    public sprjpm(spruem spruem2) {
        void arg0;
        sprjpm sprjpm2 = this;
        sprjpm sprjpm3 = this;
        sprjpm2.cfr_renamed_4 = new Hashtable();
        sprjpm2.cfr_renamed_11334(spruem2.cfr_renamed_204(), (spruem)arg0);
    }

    public sprjpm(Hashtable hashtable) {
        sprjpm sprjpm2 = this;
        this.cfr_renamed_4 = new Hashtable();
        this.cfr_renamed_4 = this.cfr_renamed_4841(hashtable);
    }

    private /* synthetic */ Hashtable cfr_renamed_4841(Hashtable arg0) {
        Enumeration enumeration;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration2 = enumeration = arg0.keys();
        while (enumeration2.hasMoreElements()) {
            Object k;
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            Object k2 = k = enumeration3.nextElement();
            hashtable.put(k2, arg0.get(k2));
        }
        return hashtable;
    }

    private /* synthetic */ void cfr_renamed_11334(sprlem arg0, spruem arg1) {
        sprjpm sprjpm2;
        Vector<Object> vector;
        Object v = this.cfr_renamed_4.get(arg0);
        if (v == null) {
            this.cfr_renamed_4.put(arg0, arg1);
            return;
        }
        if (v instanceof spruem) {
            vector = new Vector<Object>();
            sprjpm2 = this;
            Vector<Object> vector2 = vector;
            vector2.addElement(v);
            vector2.addElement(arg1);
        } else {
            vector = (Vector<Object>)v;
            sprjpm2 = this;
            vector.addElement(arg1);
        }
        sprjpm2.cfr_renamed_4.put(arg0, vector);
    }

    public sprrvm cfr_renamed_5278(sprlem arg0) {
        sprrvm sprrvm2 = new sprrvm();
        Object v = this.cfr_renamed_4.get(arg0);
        if (v instanceof Vector) {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = ((Vector)v).elements();
            while (enumeration2.hasMoreElements()) {
                sprrvm2.cfr_renamed_5004((spruem)enumeration.nextElement());
                enumeration2 = enumeration;
            }
        } else if (v != null) {
            sprrvm2.cfr_renamed_5004((spruem)v);
        }
        return sprrvm2;
    }

    public sprjpm cfr_renamed_11336(sprlem arg0) {
        sprjpm sprjpm2 = new sprjpm(this.cfr_renamed_4);
        sprjpm2.cfr_renamed_4.remove(arg0);
        return sprjpm2;
    }

    public sprrvm cfr_renamed_3968() {
        sprrvm sprrvm2 = new sprrvm();
        Enumeration enumeration = this.cfr_renamed_4.elements();
        while (enumeration.hasMoreElements()) {
            Object v = enumeration.nextElement();
            if (v instanceof Vector) {
                Enumeration enumeration2 = ((Vector)v).elements();
                while (enumeration2.hasMoreElements()) {
                    Enumeration enumeration3;
                    Enumeration enumeration4 = enumeration3;
                    enumeration2 = enumeration4;
                    sprrvm2.cfr_renamed_5004(spruem.cfr_renamed_23(enumeration4.nextElement()));
                }
                continue;
            }
            sprrvm2.cfr_renamed_5004(spruem.cfr_renamed_23(v));
        }
        return sprrvm2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprjpm(sprypm arg0) {
        this(spridn.cfr_renamed_23(arg0.cfr_renamed_119()));
    }

    public int cfr_renamed_84() {
        int n = 0;
        Enumeration enumeration = this.cfr_renamed_4.elements();
        while (enumeration.hasMoreElements()) {
            Object v = enumeration.nextElement();
            if (v instanceof Vector) {
                n += ((Vector)v).size();
                continue;
            }
            ++n;
        }
        return n;
    }

    public sprypm cfr_renamed_568() {
        return new sprypm(this.cfr_renamed_3968());
    }

    /*
     * WARNING - void declaration
     */
    public sprjpm(spridn spridn2) {
        void arg0;
        int n;
        sprjpm sprjpm2 = this;
        sprjpm2.cfr_renamed_4 = new Hashtable();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            spruem spruem2 = spruem.cfr_renamed_23(arg0.cfr_renamed_85(n));
            this.cfr_renamed_11334(spruem2.cfr_renamed_204(), spruem2);
            n2 = ++n;
        }
    }

    public Hashtable cfr_renamed_4095() {
        sprjpm sprjpm2 = this;
        return sprjpm2.cfr_renamed_4841(sprjpm2.cfr_renamed_4);
    }
}

