/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprory;
import com.spire.presentation.packages.sprpdm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprnyl
extends sprqqe {
    public Hashtable cfr_renamed_3;
    public sprszm cfr_renamed_4;

    public static sprnyl cfr_renamed_5322(sprhgm arg0) {
        return sprnyl.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_114));
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }

    private /* synthetic */ sprnyl(sprszm arg0) {
        Enumeration enumeration;
        sprnyl sprnyl2 = this;
        sprnyl2.cfr_renamed_3 = new Hashtable();
        this.cfr_renamed_4 = arg0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            sprco sprco2 = (sprco)enumeration.nextElement();
            if (!(sprco2.cfr_renamed_119() instanceof sprlem)) {
                throw new IllegalArgumentException(sprory.cfr_renamed_9("bNAY\ra~n\u001coOJHCYiIECTDFDE_S\rAALBWHD\rIC\u0000hXYECDHDfETu^AJE\u0003"));
            }
            sprco sprco3 = sprco2;
            this.cfr_renamed_3.put(sprco3, sprco3);
            enumeration2 = enumeration;
        }
    }

    public static sprnyl cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprnyl.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public boolean cfr_renamed_5276(sprpdm arg0) {
        return this.cfr_renamed_3.get(arg0) != null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnyl(Vector vector) {
        Enumeration enumeration;
        void arg0;
        sprnyl sprnyl2 = this;
        sprnyl2.cfr_renamed_3 = new Hashtable();
        sprrvm sprrvm2 = new sprrvm(arg0.size());
        Enumeration enumeration2 = enumeration = arg0.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprpdm sprpdm2 = sprpdm.cfr_renamed_23(enumeration3.nextElement());
            sprrvm2.cfr_renamed_5004(sprpdm2);
            sprpdm sprpdm3 = sprpdm2;
            this.cfr_renamed_3.put(sprpdm3, sprpdm3);
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprnyl(sprpdm[] sprpdmArray) {
        int n;
        void arg0;
        sprnyl sprnyl2 = this;
        sprnyl2.cfr_renamed_3 = new Hashtable();
        sprrvm sprrvm2 = new sprrvm(((void)arg0).length);
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            sprrvm2.cfr_renamed_5004((sprco)arg0[n]);
            this.cfr_renamed_3.put(arg0[n], arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprnyl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnyl) {
            return (sprnyl)arg0;
        }
        if (arg0 != null) {
            return new sprnyl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprnyl(sprpdm arg0) {
        sprnyl sprnyl2 = this;
        sprnyl sprnyl3 = this;
        sprnyl2.cfr_renamed_3 = new Hashtable();
        sprnyl3.cfr_renamed_4 = new sprcen(arg0);
        sprpdm sprpdm2 = arg0;
        sprnyl2.cfr_renamed_3.put(sprpdm2, sprpdm2);
    }

    public sprpdm[] cfr_renamed_4524() {
        Enumeration enumeration;
        sprpdm[] sprpdmArray = new sprpdm[this.cfr_renamed_4.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprpdmArray[++n] = sprpdm.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprpdmArray;
    }
}

