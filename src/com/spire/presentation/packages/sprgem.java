/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgjy;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhlaa;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class sprgem {
    private static final Set cfr_renamed_2;
    private Vector cfr_renamed_3;
    private Hashtable cfr_renamed_4;

    public void cfr_renamed_10854(sprlem arg0, boolean arg1, sprco arg2) throws IOException {
        this.cfr_renamed_10844(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER"));
    }

    public void cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws IOException {
        this.cfr_renamed_5013(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER"));
    }

    public sprgem() {
        sprgem sprgem2 = this;
        this.cfr_renamed_4 = new Hashtable();
        sprgem2.cfr_renamed_3 = new Vector();
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.isEmpty();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10844(sprlem sprlem2, boolean bl, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_10851(new sprrdm((sprlem)arg0, (boolean)arg1, (byte[])arg2));
    }

    public void cfr_renamed_41() {
        sprgem sprgem2 = this;
        sprgem2.cfr_renamed_4 = new Hashtable();
        sprgem2.cfr_renamed_3 = new Vector();
    }

    public void cfr_renamed_10855(sprlem arg0) {
        if (!this.cfr_renamed_4.containsKey(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhlaa.cfr_renamed_9("3>\"#85?)8f")).append(arg0).append(sprgjy.cfr_renamed_9("et*nej7\u007f6\u007f+n")).toString());
        }
        this.cfr_renamed_3.removeElement(arg0);
        this.cfr_renamed_4.remove(arg0);
    }

    static {
        HashSet<sprlem> hashSet = new HashSet<sprlem>();
        hashSet.add(sprrdm.cfr_renamed_137);
        hashSet.add(sprrdm.cfr_renamed_3);
        hashSet.add(sprrdm.cfr_renamed_88);
        hashSet.add(sprrdm.cfr_renamed_119);
        cfr_renamed_2 = Collections.unmodifiableSet(hashSet);
    }

    public void cfr_renamed_10851(sprrdm arg0) {
        if (!this.cfr_renamed_4.containsKey(arg0.cfr_renamed_4521())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhlaa.cfr_renamed_9("3>\"#85?)8f")).append(arg0.cfr_renamed_4521()).append(sprgjy.cfr_renamed_9("et*nej7\u007f6\u007f+n")).toString());
        }
        this.cfr_renamed_4.put(arg0.cfr_renamed_4521(), arg0);
    }

    public sprhgm cfr_renamed_31() {
        int n;
        sprrdm[] sprrdmArray = new sprrdm[this.cfr_renamed_3.size()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            sprgem sprgem2 = this;
            int n3 = n++;
            sprrdmArray[n3] = (sprrdm)sprgem2.cfr_renamed_4.get(sprgem2.cfr_renamed_3.elementAt(n3));
            n2 = n;
        }
        return new sprhgm(sprrdmArray);
    }

    public void cfr_renamed_5283(sprrdm arg0) {
        if (this.cfr_renamed_4.containsKey(arg0.cfr_renamed_4521())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhlaa.cfr_renamed_9("3>\"#85?)8f")).append(arg0.cfr_renamed_4521()).append(sprgjy.cfr_renamed_9("e{)h {!ce{!~ ~")).toString());
        }
        sprgem sprgem2 = this;
        sprgem2.cfr_renamed_3.addElement(arg0.cfr_renamed_4521());
        sprgem2.cfr_renamed_4.put(arg0.cfr_renamed_4521(), arg0);
    }

    public boolean cfr_renamed_10849(sprlem arg0) {
        return this.cfr_renamed_4.containsKey(arg0);
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        return (sprrdm)this.cfr_renamed_4.get(arg0);
    }

    public void cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) {
        if (this.cfr_renamed_4.containsKey(arg0)) {
            if (cfr_renamed_2.contains(arg0)) {
                Enumeration enumeration;
                sprszm sprszm2 = sprszm.cfr_renamed_23(sprfvg.cfr_renamed_23(((sprrdm)this.cfr_renamed_4.get(arg0)).cfr_renamed_103()).cfr_renamed_186());
                sprszm sprszm3 = sprszm.cfr_renamed_23(arg2);
                sprrvm sprrvm2 = new sprrvm(sprszm2.cfr_renamed_84() + sprszm3.cfr_renamed_84());
                Enumeration enumeration2 = enumeration = sprszm2.cfr_renamed_329();
                while (enumeration2.hasMoreElements()) {
                    sprrvm2.cfr_renamed_5004((sprco)enumeration.nextElement());
                    enumeration2 = enumeration;
                }
                Enumeration enumeration3 = enumeration = sprszm3.cfr_renamed_329();
                while (enumeration3.hasMoreElements()) {
                    sprrvm2.cfr_renamed_5004((sprco)enumeration.nextElement());
                    enumeration3 = enumeration;
                }
                try {
                    sprlem sprlem2 = arg0;
                    sprlem sprlem3 = arg0;
                    this.cfr_renamed_4.put(sprlem3, new sprrdm(sprlem3, arg1, new sprcen(sprrvm2).cfr_renamed_91()));
                    return;
                }
                catch (IOException iOException) {
                    throw new sprhbn(iOException.getMessage(), iOException);
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhlaa.cfr_renamed_9("3>\"#85?)8f")).append(arg0).append(sprgjy.cfr_renamed_9("e{)h {!ce{!~ ~")).toString());
        }
        sprgem sprgem2 = this;
        sprgem2.cfr_renamed_3.addElement(arg0);
        sprlem sprlem4 = arg0;
        sprgem2.cfr_renamed_4.put(sprlem4, new sprrdm(sprlem4, arg1, (sproug)new sprfvg(sproze.cfr_renamed_158(arg2))));
    }

    public void cfr_renamed_11147(sprhgm arg0) {
        int n;
        sprlem[] sprlemArray = arg0.cfr_renamed_583();
        int n2 = n = 0;
        while (n2 != sprlemArray.length) {
            sprlem sprlem2 = sprlemArray[n];
            sprrdm sprrdm2 = arg0.cfr_renamed_5024(sprlem2);
            this.cfr_renamed_5013(sprlem.cfr_renamed_23(sprlem2), sprrdm2.cfr_renamed_101(), sprrdm2.cfr_renamed_103().cfr_renamed_186());
            n2 = ++n;
        }
    }
}

