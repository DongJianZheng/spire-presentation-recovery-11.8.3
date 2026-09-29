/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprsrm
extends sprqqe {
    private final sprszm cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsrm(BigInteger bigInteger, sprddm sprddm2, byte[][] byArray) {
        int n;
        void arg2;
        void arg0;
        sprsrm sprsrm2 = this;
        this.cfr_renamed_4 = new sprktm((BigInteger)arg0);
        this.cfr_renamed_3 = sprddm2;
        sprrvm sprrvm2 = new sprrvm(((void)arg2).length);
        int n2 = n = 0;
        while (n2 != ((void)arg2).length) {
            void v2 = arg2[n];
            sprrvm2.cfr_renamed_5004(new sprfvg(sproze.cfr_renamed_158((byte[])v2)));
            n2 = ++n;
        }
        this.cfr_renamed_2 = new sprcen(sprrvm2);
    }

    public byte[][] cfr_renamed_11372() {
        int n;
        byte[][] byArrayArray = new byte[this.cfr_renamed_2.cfr_renamed_84()][];
        int n2 = n = 0;
        while (n2 != byArrayArray.length) {
            int n3 = n++;
            byArrayArray[n3] = sproze.cfr_renamed_158(sproug.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3)).cfr_renamed_186());
            n2 = n;
        }
        return byArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsrm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprnvc.cfr_renamed_9("7L=M,P;A*\u0002-G/W;L=G~Q7X;"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public BigInteger cfr_renamed_11373() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprsrm sprsrm2 = this;
        sprrvm2.cfr_renamed_5004(sprsrm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprsrm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_3;
    }

    public static sprsrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsrm) {
            return (sprsrm)arg0;
        }
        if (arg0 != null) {
            return new sprsrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

