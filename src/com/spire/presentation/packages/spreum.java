/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmlm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class spreum
extends sprqqe {
    public static final sprktm cfr_renamed_1;
    public static final sprktm cfr_renamed_2;
    private sprszm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public sprktm cfr_renamed_4812() {
        return this.cfr_renamed_4;
    }

    public spreum(sprmlm arg0) {
        sprmlm[] sprmlmArray;
        if (arg0 != null) {
            sprmlm[] sprmlmArray2 = new sprmlm[1];
            sprmlmArray = sprmlmArray2;
            sprmlmArray2[0] = arg0;
        } else {
            sprmlmArray = null;
        }
        this(sprmlmArray);
    }

    public sprmlm[] cfr_renamed_4813() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprmlm[] sprmlmArray = new sprmlm[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprmlmArray.length) {
            int n3 = n++;
            sprmlmArray[n3] = sprmlm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprmlmArray;
    }

    /*
     * WARNING - void declaration
     */
    public spreum(BigInteger bigInteger) {
        this(new sprktm((BigInteger)arg0));
        void arg0;
    }

    public spreum(sprktm sprktm2) {
        this.cfr_renamed_4 = sprktm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        spreum spreum2 = this;
        sprrvm2.cfr_renamed_5004(spreum2.cfr_renamed_4);
        if (spreum2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    public static spreum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreum) {
            return (spreum)arg0;
        }
        if (arg0 != null) {
            return new spreum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    static {
        cfr_renamed_2 = new sprktm(0L);
        cfr_renamed_1 = new sprktm(1L);
    }

    /*
     * WARNING - void declaration
     */
    public spreum(sprmlm[] sprmlmArray) {
        this.cfr_renamed_4 = cfr_renamed_1;
        if (sprmlmArray != null) {
            void arg0;
            spreum spreum2 = this;
            spreum2.cfr_renamed_3 = new sprcen((sprco[])arg0);
            return;
        }
        this.cfr_renamed_3 = null;
    }

    private /* synthetic */ spreum(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }
}

