/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprtre;
import com.spire.presentation.packages.sprtzd;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprvte {
    private Hashtable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvte(sprche sprche2) {
        void arg0;
        sprvte sprvte2 = this;
        sprvte sprvte3 = this;
        sprvte2.cfr_renamed_4 = new Hashtable();
        sprvte2.cfr_renamed_4840(sprche2.cfr_renamed_204(), (sprche)arg0);
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

    public sprlre cfr_renamed_3968() {
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration = this.cfr_renamed_4.elements();
        while (enumeration.hasMoreElements()) {
            Object v = enumeration.nextElement();
            if (v instanceof Vector) {
                Enumeration enumeration2 = ((Vector)v).elements();
                while (enumeration2.hasMoreElements()) {
                    Enumeration enumeration3;
                    Enumeration enumeration4 = enumeration3;
                    enumeration2 = enumeration4;
                    sprlre2.cfr_renamed_49(sprche.cfr_renamed_23(enumeration4.nextElement()));
                }
                continue;
            }
            sprlre2.cfr_renamed_49(sprche.cfr_renamed_23(v));
        }
        return sprlre2;
    }

    public sprlre cfr_renamed_575(sprtzd arg0) {
        sprlre sprlre2 = new sprlre();
        Object v = this.cfr_renamed_4.get(arg0);
        if (v instanceof Vector) {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = ((Vector)v).elements();
            while (enumeration2.hasMoreElements()) {
                sprlre2.cfr_renamed_49((sprche)enumeration.nextElement());
                enumeration2 = enumeration;
            }
        } else if (v != null) {
            sprlre2.cfr_renamed_49((sprche)v);
        }
        return sprlre2;
    }

    public sprvte cfr_renamed_4842(sprtzd arg0, spra arg1) {
        sprvte sprvte2 = new sprvte(this.cfr_renamed_4);
        sprtzd sprtzd2 = arg0;
        sprtzd sprtzd3 = arg0;
        sprvte2.cfr_renamed_4840(sprtzd3, new sprche(sprtzd3, new sprcwe(arg1)));
        return sprvte2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvte(sprlre sprlre2) {
        void arg0;
        int n;
        sprvte sprvte2 = this;
        sprvte2.cfr_renamed_4 = new Hashtable();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprche sprche2 = sprche.cfr_renamed_23(arg0.cfr_renamed_576(n));
            this.cfr_renamed_4840(sprche2.cfr_renamed_204(), sprche2);
            n2 = ++n;
        }
    }

    public sprche cfr_renamed_625(sprtzd arg0) {
        Object v = this.cfr_renamed_4.get(arg0);
        if (v instanceof Vector) {
            return (sprche)((Vector)v).elementAt(0);
        }
        return (sprche)v;
    }

    public sprtre cfr_renamed_568() {
        return new sprtre(this.cfr_renamed_3968());
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

    public sprvte cfr_renamed_4843(sprtzd arg0) {
        sprvte sprvte2 = new sprvte(this.cfr_renamed_4);
        sprvte2.cfr_renamed_4.remove(arg0);
        return sprvte2;
    }

    public sprvte(sprtre arg0) {
        this(sprere.cfr_renamed_23(arg0.cfr_renamed_119()));
    }

    public sprvte(Hashtable hashtable) {
        sprvte sprvte2 = this;
        this.cfr_renamed_4 = new Hashtable();
        this.cfr_renamed_4 = this.cfr_renamed_4841(hashtable);
    }

    private /* synthetic */ void cfr_renamed_4840(sprtzd arg0, sprche arg1) {
        sprvte sprvte2;
        Vector<Object> vector;
        Object v = this.cfr_renamed_4.get(arg0);
        if (v == null) {
            this.cfr_renamed_4.put(arg0, arg1);
            return;
        }
        if (v instanceof sprche) {
            vector = new Vector<Object>();
            sprvte2 = this;
            Vector<Object> vector2 = vector;
            vector2.addElement(v);
            vector2.addElement(arg1);
        } else {
            vector = (Vector<Object>)v;
            sprvte2 = this;
            vector.addElement(arg1);
        }
        sprvte2.cfr_renamed_4.put(arg0, vector);
    }

    public Hashtable cfr_renamed_4095() {
        sprvte sprvte2 = this;
        return sprvte2.cfr_renamed_4841(sprvte2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprvte(sprere sprere2) {
        void arg0;
        int n;
        sprvte sprvte2 = this;
        sprvte2.cfr_renamed_4 = new Hashtable();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprche sprche2 = sprche.cfr_renamed_23(arg0.cfr_renamed_85(n));
            this.cfr_renamed_4840(sprche2.cfr_renamed_204(), sprche2);
            n2 = ++n;
        }
    }
}

