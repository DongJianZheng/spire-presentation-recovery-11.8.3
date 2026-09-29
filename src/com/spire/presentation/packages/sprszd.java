/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprszd
extends sprkra {
    private Hashtable cfr_renamed_3;
    private Vector cfr_renamed_4;

    public sprszd(sprtie arg0) {
        sprszd sprszd2 = this;
        sprszd sprszd3 = this;
        sprszd2.cfr_renamed_3 = new Hashtable();
        sprszd3.cfr_renamed_4 = new Vector();
        sprszd2.cfr_renamed_4.addElement(arg0.cfr_renamed_4521());
        sprszd2.cfr_renamed_3.put(arg0.cfr_renamed_4521(), arg0);
    }

    private /* synthetic */ sprtzd[] cfr_renamed_4462(Vector arg0) {
        int n;
        sprtzd[] sprtzdArray = new sprtzd[arg0.size()];
        int n2 = n = 0;
        while (n2 != sprtzdArray.length) {
            int n3 = n++;
            sprtzdArray[n3] = (sprtzd)arg0.elementAt(n3);
            n2 = n;
        }
        return sprtzdArray;
    }

    public static sprszd cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprszd.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprtzd[] cfr_renamed_583() {
        sprszd sprszd2 = this;
        return sprszd2.cfr_renamed_4462(sprszd2.cfr_renamed_4);
    }

    public boolean cfr_renamed_4522(sprszd arg0) {
        if (this.cfr_renamed_3.size() != arg0.cfr_renamed_3.size()) {
            return false;
        }
        Enumeration enumeration = this.cfr_renamed_3.keys();
        while (enumeration.hasMoreElements()) {
            Object k = enumeration.nextElement();
            if (this.cfr_renamed_3.get(k).equals(arg0.cfr_renamed_3.get(k))) continue;
            return false;
        }
        return true;
    }

    public sprtzd[] cfr_renamed_662() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public sprvva cfr_renamed_119() {
        Enumeration enumeration;
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.elements();
        while (enumeration2.hasMoreElements()) {
            sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
            sprtie sprtie2 = (sprtie)this.cfr_renamed_3.get(sprtzd2);
            enumeration2 = enumeration;
            sprlre2.cfr_renamed_49(sprtie2);
        }
        return new sprpse(sprlre2);
    }

    public sprtzd[] cfr_renamed_665() {
        return this.cfr_renamed_78(false);
    }

    private /* synthetic */ sprtzd[] cfr_renamed_78(boolean arg0) {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprszd sprszd2 = this;
            Object e = sprszd2.cfr_renamed_4.elementAt(n);
            if (((sprtie)sprszd2.cfr_renamed_3.get(e)).cfr_renamed_101() == arg0) {
                vector.addElement(e);
            }
            n2 = ++n;
        }
        return this.cfr_renamed_4462(vector);
    }

    /*
     * WARNING - void declaration
     */
    public sprszd(sprtie[] sprtieArray) {
        void arg0;
        int n;
        sprszd sprszd2 = this;
        this.cfr_renamed_3 = new Hashtable();
        sprszd2.cfr_renamed_4 = new Vector();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            void var3_3 = arg0[n];
            sprszd sprszd3 = this;
            sprszd3.cfr_renamed_4.addElement(var3_3.cfr_renamed_4521());
            sprszd3.cfr_renamed_3.put(var3_3.cfr_renamed_4521(), var3_3);
            n2 = ++n;
        }
    }

    private /* synthetic */ sprszd(sprbne sprbne2) {
        Enumeration enumeration;
        sprszd sprszd2 = this;
        this.cfr_renamed_3 = new Hashtable();
        sprszd2.cfr_renamed_4 = new Vector();
        Enumeration enumeration2 = enumeration = sprbne2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprtie sprtie2 = sprtie.cfr_renamed_23(enumeration3.nextElement());
            this.cfr_renamed_3.put(sprtie2.cfr_renamed_4521(), sprtie2);
            this.cfr_renamed_4.addElement(sprtie2.cfr_renamed_4521());
        }
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        return (sprtie)this.cfr_renamed_3.get(arg0);
    }

    public spra cfr_renamed_4477(sprtzd arg0) {
        sprtie sprtie2 = this.cfr_renamed_100(arg0);
        if (sprtie2 != null) {
            return sprtie2.cfr_renamed_372();
        }
        return null;
    }

    public static sprszd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprszd) {
            return (sprszd)arg0;
        }
        if (arg0 != null) {
            return new sprszd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public Enumeration cfr_renamed_99() {
        return this.cfr_renamed_4.elements();
    }
}

