/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprba;
import com.spire.presentation.packages.sprbcq;
import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprseo;
import com.spire.presentation.packages.sprsya;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.spryqd;
import com.spire.presentation.packages.sprzxd;
import java.security.Provider;
import java.security.SecureRandom;

public class sprasd {
    private sprzxd cfr_renamed_0;
    private final sprtzd cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private static final sprba cfr_renamed_3 = sprsya.cfr_renamed_3;
    private final int cfr_renamed_4;

    public sprasd cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sproa cfr_renamed_1451() throws sprlqd {
        sprasd sprasd2 = this;
        sprasd sprasd3 = this;
        return new spryqd(sprasd3, sprasd2.cfr_renamed_1, sprasd2.cfr_renamed_4, sprasd3.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprasd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_0 = new sprzxd(new sprqrd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprasd(sprtzd sprtzd2, int n) {
        void arg1;
        void arg0;
        sprasd sprasd2 = this;
        this.cfr_renamed_0 = new sprzxd(new sprypd());
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_4 = n;
        void v1 = arg0;
        int n2 = cfr_renamed_3.cfr_renamed_1513((sprtzd)v1);
        if (v1.equals(sprm.cfr_renamed_1262)) {
            if (arg1 != 168 && arg1 != n2) {
                throw new IllegalArgumentException(sprseo.cfr_renamed_9(";;1: '76&u90+\u0006;/7u4: u7;1'+%&<=;\u001d\u001c\u0016u\"4!&71r!=u0 ;960 {"));
            }
        } else if (n2 > 0 && n2 != arg1) {
            throw new IllegalArgumentException(sprbcq.cfr_renamed_9("9\u00193\u0018\"\u00055\u0014$W;\u0012)$9\r5W6\u0018\"W5\u00193\u0005)\u0007$\u001e?\u0019\u001f>\u0014W \u0016#\u00045\u0013p\u0003?W2\u00029\u001b4\u0012\"Y"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprasd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_0 = new sprzxd(new sprbqd((String)arg0));
        return this;
    }

    public sprasd(sprtzd arg0) {
        sprtzd sprtzd2 = arg0;
        this(sprtzd2, cfr_renamed_3.cfr_renamed_1513(sprtzd2));
    }

    public static /* synthetic */ sprzxd cfr_renamed_4066(sprasd arg0) {
        return arg0.cfr_renamed_0;
    }
}

