/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprspm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprspm(sprktm sprktm2) {
        this(new sprcen(new sprcen((sprco)arg0)));
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprspm(BigInteger bigInteger) {
        this(new sprktm((BigInteger)arg0));
        void arg0;
    }

    private static /* synthetic */ sprcen[] cfr_renamed_11340(sprktm[] arg0) {
        int n;
        sprcen[] sprcenArray = new sprcen[arg0.length];
        int n2 = n = 0;
        while (n2 != sprcenArray.length) {
            int n3 = n;
            sprcen sprcen2 = new sprcen(arg0[n]);
            sprcenArray[n3] = sprcen2;
            n2 = ++n;
        }
        return sprcenArray;
    }

    public sprspm(BigInteger[] arg0) {
        this(sprspm.cfr_renamed_11341(arg0));
    }

    public BigInteger[] cfr_renamed_11342() {
        int n;
        BigInteger[] bigIntegerArray = new BigInteger[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != bigIntegerArray.length) {
            int n3 = n++;
            bigIntegerArray[n3] = sprktm.cfr_renamed_23(sprszm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3)).cfr_renamed_85(0)).cfr_renamed_97();
            n2 = n;
        }
        return bigIntegerArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprspm(sprktm[] sprktmArray) {
        this(new sprcen(sprspm.cfr_renamed_11340((sprktm[])arg0)));
        void arg0;
    }

    private /* synthetic */ sprspm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    public static sprspm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprspm) {
            return (sprspm)arg0;
        }
        if (arg0 != null) {
            return new sprspm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private static /* synthetic */ sprktm[] cfr_renamed_11343(sprszm arg0) {
        int n;
        sprktm[] sprktmArray = new sprktm[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprktmArray.length) {
            int n3 = n++;
            sprktmArray[n3] = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprktmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ sprktm[] cfr_renamed_11341(BigInteger[] arg0) {
        int n;
        sprktm[] sprktmArray = new sprktm[arg0.length];
        int n2 = n = 0;
        while (n2 != sprktmArray.length) {
            int n3 = n;
            sprktm sprktm2 = new sprktm(arg0[n]);
            sprktmArray[n3] = sprktm2;
            n2 = ++n;
        }
        return sprktmArray;
    }

    public sprktm[][] cfr_renamed_4855() {
        int n;
        sprktm[][] sprktmArray = new sprktm[this.cfr_renamed_4.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 != sprktmArray.length) {
            int n3 = n++;
            sprktmArray[n3] = sprspm.cfr_renamed_11343((sprszm)this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprktmArray;
    }
}

