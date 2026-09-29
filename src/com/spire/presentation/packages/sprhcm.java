/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcnx;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtjm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;

public class sprhcm
extends sprqqe {
    private sprtjm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    private static /* synthetic */ sprrvm cfr_renamed_4505(Vector arg0) {
        Enumeration enumeration;
        sprrvm sprrvm2 = new sprrvm(arg0.size());
        Enumeration enumeration2 = enumeration = arg0.elements();
        while (enumeration2.hasMoreElements()) {
            sprrvm sprrvm3;
            sprktm sprktm2;
            Object e = enumeration.nextElement();
            if (e instanceof BigInteger) {
                sprktm2 = new sprktm((BigInteger)e);
                sprrvm3 = sprrvm2;
            } else if (e instanceof Integer) {
                sprktm2 = new sprktm(((Integer)e).intValue());
                sprrvm3 = sprrvm2;
            } else {
                throw new IllegalArgumentException();
            }
            sprrvm3.cfr_renamed_5004(sprktm2);
            enumeration2 = enumeration;
        }
        return sprrvm2;
    }

    public sprhcm(String arg0, Vector arg1) {
        this(arg0, sprhcm.cfr_renamed_4505(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprhcm(sprtjm sprtjm2, sprrvm sprrvm2) {
        void arg1;
        this.cfr_renamed_3 = sprtjm2;
        sprhcm sprhcm2 = this;
        this.cfr_renamed_4 = new sprcen((sprrvm)arg1);
    }

    public sprktm[] cfr_renamed_4503() {
        int n;
        sprktm[] sprktmArray = new sprktm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprktmArray[n3] = sprktm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprktmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprhcm(String string, sprrvm sprrvm2) {
        this(new sprtjm((String)arg0), (sprrvm)arg1);
        void arg1;
        void arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhcm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcnx.cfr_renamed_9("\u0007-!l6)49 \"&)e?,6 ve")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprtjm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprtjm cfr_renamed_4504() {
        return this.cfr_renamed_3;
    }

    public static sprhcm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhcm) {
            return (sprhcm)arg0;
        }
        if (arg0 != null) {
            return new sprhcm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

