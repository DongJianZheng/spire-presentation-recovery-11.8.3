/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruuy;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class spromm
extends sprqqe {
    private sprhmm cfr_renamed_1;
    private final sproug cfr_renamed_2;
    private final sprktm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public sprktm cfr_renamed_4420() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        spromm spromm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(spromm2.cfr_renamed_3);
        if (spromm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public sproug cfr_renamed_629() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public spromm(byte[] byArray, sprktm sprktm2) {
        void arg0;
        spromm spromm2 = this;
        this.cfr_renamed_2 = new sprfvg((byte[])arg0);
        this.cfr_renamed_3 = sprktm2;
    }

    public sprddm cfr_renamed_4881() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ spromm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_2 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        if (sprszm2.cfr_renamed_84() > 2) {
            int n;
            int n2 = n = 2;
            while (n2 < arg0.cfr_renamed_84()) {
                sprxgf sprxgf2 = arg0.cfr_renamed_85(n).cfr_renamed_119();
                if (sprxgf2 instanceof sprszm) {
                    this.cfr_renamed_1 = sprhmm.cfr_renamed_23(sprxgf2);
                }
                if (sprxgf2 instanceof sprnvm) {
                    sprnvm sprnvm2 = (sprnvm)sprxgf2;
                    if (sprnvm2.cfr_renamed_312() != 0) {
                        throw new IllegalArgumentException(new StringBuilder().insert(0, spruuy.cfr_renamed_9("\u0010\u001c\u000e\u001c\n\u0005\u000bR\u0011\u0013\u0002R")).append(sprnvm2.cfr_renamed_312()).toString());
                    }
                    this.cfr_renamed_4 = sprddm.cfr_renamed_5085(sprnvm2, true);
                }
                n2 = ++n;
            }
        }
    }

    public sprhmm cfr_renamed_4422() {
        return this.cfr_renamed_1;
    }

    public spromm(byte[] arg0, BigInteger arg1) {
        byte[] byArray = arg0;
        this(arg0, new sprktm(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spromm(byte[] byArray, BigInteger bigInteger, sprhmm sprhmm2, sprddm sprddm2) {
        void arg2;
        void arg1;
        void arg0;
        spromm spromm2 = this;
        spromm spromm3 = this;
        this.cfr_renamed_2 = new sprfvg((byte[])arg0);
        spromm3.cfr_renamed_3 = new sprktm((BigInteger)arg1);
        spromm2.cfr_renamed_1 = arg2;
        spromm2.cfr_renamed_4 = sprddm2;
    }

    /*
     * WARNING - void declaration
     */
    public spromm(byte[] byArray, BigInteger bigInteger, sprhmm sprhmm2) {
        void arg1;
        void arg0;
        spromm spromm2 = this;
        spromm spromm3 = this;
        spromm2.cfr_renamed_2 = new sprfvg((byte[])arg0);
        spromm2.cfr_renamed_3 = new sprktm((BigInteger)arg1);
        spromm2.cfr_renamed_1 = sprhmm2;
    }

    public static spromm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spromm) {
            return (spromm)arg0;
        }
        if (arg0 != null) {
            return new spromm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

