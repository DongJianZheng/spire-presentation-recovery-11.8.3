/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdjm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprzam
extends sprqqe {
    public sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzam(sprdjm sprdjm2, sprdjm sprdjm3) {
        void arg1;
        void arg0;
        sprrvm sprrvm2;
        this.cfr_renamed_4 = null;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004((sprco)arg0);
        sprrvm3.cfr_renamed_5004((sprco)arg1);
        sprzam sprzam2 = this;
        this.cfr_renamed_4 = new sprcen(new sprcen(sprrvm2));
    }

    /*
     * WARNING - void declaration
     */
    public sprzam(Hashtable hashtable) {
        Enumeration enumeration;
        void arg0;
        this.cfr_renamed_4 = null;
        sprrvm sprrvm2 = new sprrvm(arg0.size());
        Enumeration enumeration2 = enumeration = arg0.keys();
        while (enumeration2.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            String string2 = (String)arg0.get(string);
            sprrvm sprrvm3 = new sprrvm(2);
            enumeration2 = enumeration;
            sprrvm sprrvm4 = sprrvm3;
            sprrvm4.cfr_renamed_5004(new sprlem(string));
            sprrvm4.cfr_renamed_5004(new sprlem(string2));
            sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzam(sprdjm[] sprdjmArray, sprdjm[] sprdjmArray2) {
        int n;
        void arg0;
        this.cfr_renamed_4 = null;
        sprrvm sprrvm2 = new sprrvm(((void)arg0).length);
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            void arg1;
            sprrvm sprrvm3;
            sprrvm sprrvm4 = sprrvm3 = new sprrvm(2);
            int n3 = n++;
            sprrvm4.cfr_renamed_5004((sprco)arg0[n3]);
            sprrvm4.cfr_renamed_5004((sprco)arg1[n3]);
            sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
            n2 = n;
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    private /* synthetic */ sprzam(sprszm sprszm2) {
        sprzam sprzam2 = this;
        sprzam2.cfr_renamed_4 = null;
        sprzam2.cfr_renamed_4 = sprszm2;
    }

    public static sprzam cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzam) {
            return (sprzam)arg0;
        }
        if (arg0 != null) {
            return new sprzam(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

