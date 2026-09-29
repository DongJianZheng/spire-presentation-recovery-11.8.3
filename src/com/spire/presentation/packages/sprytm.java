/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmvr;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtnm;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprytm
extends sprqqe {
    private final sproug cfr_renamed_152;
    private final sprddm cfr_renamed_112;
    private final sprktm cfr_renamed_119;
    private final sprddm cfr_renamed_91;
    private final sprktm cfr_renamed_0;
    private final sprtnm cfr_renamed_1;
    private final sproug cfr_renamed_2;
    private final sproug cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    public sprddm cfr_renamed_7446() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprytm(sprszm sprszm2) {
        sprytm sprytm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprmvr.cfr_renamed_9("\u0010s\u0012c\u0006x\u0000sC{\u0016e\u00176\u0000y\re\ne\u00176\fpC%Cs\u000fs\u000es\rb\u0010"));
        }
        void v0 = arg0;
        sprytm sprytm3 = this;
        void v2 = arg0;
        this.cfr_renamed_0 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprtnm.cfr_renamed_23(v2.cfr_renamed_85(1));
        sprytm3.cfr_renamed_4 = sprddm.cfr_renamed_23(v2.cfr_renamed_85(2));
        sprytm3.cfr_renamed_152 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(3));
        this.cfr_renamed_112 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(4));
        this.cfr_renamed_119 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(5));
        int n = 6;
        if (arg0.cfr_renamed_85(6) instanceof sprnvm) {
            sprytm2 = this;
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
            this.cfr_renamed_3 = sproug.cfr_renamed_5085(sprnvm2, true);
        } else {
            sprytm2 = this;
            this.cfr_renamed_3 = null;
        }
        sprytm2.cfr_renamed_91 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n));
        this.cfr_renamed_2 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(++n));
        ++n;
    }

    public sprddm cfr_renamed_10729() {
        return this.cfr_renamed_91;
    }

    public sproug cfr_renamed_11329() {
        return this.cfr_renamed_152;
    }

    public static sprytm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprytm) {
            return (sprytm)arg0;
        }
        if (arg0 != null) {
            return new sprytm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprytm(sprtnm sprtnm2, sprddm sprddm2, sproug sproug2, sprddm sprddm3, sprktm sprktm2, sproug sproug3, sprddm sprddm4, sproug sproug4) {
        void arg7;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg6;
        if (sprddm2 == null) {
            throw new NullPointerException(sprvnd.cfr_renamed_9("\u0001X\u0007\u001d\t\\\u0004S\u0005IJ_\u000f\u001d\u0004H\u0006Q"));
        }
        if (arg6 == null) {
            throw new NullPointerException(sprmvr.cfr_renamed_9("\u0014d\u0002fCu\u0002x\ry\u00176\u0001sCx\u0016z\u000f"));
        }
        sprytm sprytm2 = this;
        sprytm sprytm3 = this;
        sprytm sprytm4 = this;
        sprytm sprytm5 = this;
        sprytm5.cfr_renamed_0 = new sprktm(0L);
        sprytm5.cfr_renamed_1 = arg0;
        sprytm4.cfr_renamed_4 = arg1;
        sprytm4.cfr_renamed_152 = arg2;
        sprytm3.cfr_renamed_112 = arg3;
        sprytm3.cfr_renamed_119 = arg4;
        sprytm2.cfr_renamed_3 = arg5;
        sprytm2.cfr_renamed_91 = arg6;
        this.cfr_renamed_2 = arg7;
    }

    public sproug cfr_renamed_4010() {
        return this.cfr_renamed_2;
    }

    public sprddm cfr_renamed_11330() {
        return this.cfr_renamed_112;
    }

    public byte[] cfr_renamed_7453() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    public sprtnm cfr_renamed_4020() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm();
        sprytm sprytm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprytm sprytm3 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm2.cfr_renamed_5004(sprytm3.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprytm3.cfr_renamed_152);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_112);
        sprrvm2.cfr_renamed_5004(sprytm2.cfr_renamed_119);
        if (sprytm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_3));
        }
        sprrvm sprrvm5 = sprrvm2;
        sprytm sprytm4 = this;
        sprrvm5.cfr_renamed_5004(sprytm4.cfr_renamed_91);
        sprrvm5.cfr_renamed_5004(sprytm4.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }
}

