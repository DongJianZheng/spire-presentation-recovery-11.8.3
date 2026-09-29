/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwn;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprhgm
extends sprqqe {
    private Vector cfr_renamed_3;
    private Hashtable cfr_renamed_4;

    private /* synthetic */ sprhgm(sprszm sprszm2) {
        Enumeration enumeration;
        sprhgm sprhgm2 = this;
        this.cfr_renamed_4 = new Hashtable();
        sprhgm2.cfr_renamed_3 = new Vector();
        Enumeration enumeration2 = enumeration = sprszm2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            sprrdm sprrdm2 = sprrdm.cfr_renamed_23(enumeration.nextElement());
            if (this.cfr_renamed_4.containsKey(sprrdm2.cfr_renamed_4521())) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprbwn.cfr_renamed_9("ohmh|yxi=heyxcndrc=krxsi'-")).append(sprrdm2.cfr_renamed_4521()).toString());
            }
            this.cfr_renamed_4.put(sprrdm2.cfr_renamed_4521(), sprrdm2);
            this.cfr_renamed_3.addElement(sprrdm2.cfr_renamed_4521());
            enumeration2 = enumeration;
        }
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        return (sprrdm)this.cfr_renamed_4.get(arg0);
    }

    public static sprhgm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhgm) {
            return (sprhgm)arg0;
        }
        if (arg0 != null) {
            return new sprhgm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprhgm(sprrdm arg0) {
        sprhgm sprhgm2 = this;
        sprhgm sprhgm3 = this;
        sprhgm2.cfr_renamed_4 = new Hashtable();
        sprhgm3.cfr_renamed_3 = new Vector();
        sprhgm2.cfr_renamed_3.addElement(arg0.cfr_renamed_4521());
        sprhgm2.cfr_renamed_4.put(arg0.cfr_renamed_4521(), arg0);
    }

    public sprco cfr_renamed_11148(sprlem arg0) {
        sprrdm sprrdm2 = this.cfr_renamed_5024(arg0);
        if (sprrdm2 != null) {
            return sprrdm2.cfr_renamed_372();
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        Enumeration enumeration;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_3.size());
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3.elements();
        while (enumeration2.hasMoreElements()) {
            sprlem sprlem2 = (sprlem)enumeration.nextElement();
            sprrdm sprrdm2 = (sprrdm)this.cfr_renamed_4.get(sprlem2);
            enumeration2 = enumeration;
            sprrvm2.cfr_renamed_5004(sprrdm2);
        }
        return new sprcen(sprrvm2);
    }

    public static sprhgm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhgm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprrdm cfr_renamed_11149(sprhgm arg0, sprlem arg1) {
        if (null == arg0) {
            return null;
        }
        return arg0.cfr_renamed_5024(arg1);
    }

    public sprlem[] cfr_renamed_662() {
        return this.cfr_renamed_78(true);
    }

    public sprlem[] cfr_renamed_583() {
        sprhgm sprhgm2 = this;
        return sprhgm2.cfr_renamed_4462(sprhgm2.cfr_renamed_3);
    }

    public sprlem[] cfr_renamed_665() {
        return this.cfr_renamed_78(false);
    }

    private /* synthetic */ sprlem[] cfr_renamed_78(boolean arg0) {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            sprhgm sprhgm2 = this;
            Object e = sprhgm2.cfr_renamed_3.elementAt(n);
            if (((sprrdm)sprhgm2.cfr_renamed_4.get(e)).cfr_renamed_101() == arg0) {
                vector.addElement(e);
            }
            n2 = ++n;
        }
        return this.cfr_renamed_4462(vector);
    }

    public Enumeration cfr_renamed_99() {
        return this.cfr_renamed_3.elements();
    }

    /*
     * WARNING - void declaration
     */
    public sprhgm(sprrdm[] sprrdmArray) {
        void arg0;
        int n;
        sprhgm sprhgm2 = this;
        this.cfr_renamed_4 = new Hashtable();
        sprhgm2.cfr_renamed_3 = new Vector();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            void var3_3 = arg0[n];
            sprhgm sprhgm3 = this;
            sprhgm3.cfr_renamed_3.addElement(var3_3.cfr_renamed_4521());
            sprhgm3.cfr_renamed_4.put(var3_3.cfr_renamed_4521(), var3_3);
            n2 = ++n;
        }
    }

    public boolean cfr_renamed_11150(sprhgm arg0) {
        if (this.cfr_renamed_4.size() != arg0.cfr_renamed_4.size()) {
            return false;
        }
        Enumeration enumeration = this.cfr_renamed_4.keys();
        while (enumeration.hasMoreElements()) {
            Object k = enumeration.nextElement();
            if (this.cfr_renamed_4.get(k).equals(arg0.cfr_renamed_4.get(k))) continue;
            return false;
        }
        return true;
    }

    public static sprco cfr_renamed_11135(sprhgm arg0, sprlem arg1) {
        if (null == arg0) {
            return null;
        }
        return arg0.cfr_renamed_11148(arg1);
    }

    private /* synthetic */ sprlem[] cfr_renamed_4462(Vector arg0) {
        int n;
        sprlem[] sprlemArray = new sprlem[arg0.size()];
        int n2 = n = 0;
        while (n2 != sprlemArray.length) {
            int n3 = n++;
            sprlemArray[n3] = (sprlem)arg0.elementAt(n3);
            n2 = n;
        }
        return sprlemArray;
    }
}

