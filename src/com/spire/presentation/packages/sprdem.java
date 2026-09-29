/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahm;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprdem
extends sprqqe {
    public sprhgm cfr_renamed_91;
    public sprbxm cfr_renamed_0;
    public sprlem cfr_renamed_1;
    public sprktm cfr_renamed_2;
    public sprahm cfr_renamed_3;
    public sprktm cfr_renamed_4;

    public sprlem cfr_renamed_608() {
        return this.cfr_renamed_1;
    }

    public sprahm cfr_renamed_592() {
        return this.cfr_renamed_3;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprdem sprdem2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprdem2.cfr_renamed_3);
        if (sprdem2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_0 != null && this.cfr_renamed_0.cfr_renamed_587()) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        }
        if (this.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_91));
        }
        return new sprcen(sprrvm2);
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_91;
    }

    public static sprdem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdem) {
            return (sprdem)arg0;
        }
        if (arg0 != null) {
            return new sprdem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_11188(Object arg0, int arg1, int arg2) {
        if (arg0 != null || arg1 > arg2) {
            throw new IllegalArgumentException(sprtsa.cfr_renamed_9("J\u001dL\u0010Q\\X\u0010I\u001fM\u0018\b\u0013X\bA\u0013F\u001dD\\A\u0012\b\u000fM\r]\u0019F\u001fM"));
        }
    }

    public sprbxm cfr_renamed_609() {
        if (this.cfr_renamed_0 == null) {
            return sprbxm.cfr_renamed_4;
        }
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprdem(sprahm sprahm2, sprlem sprlem2, sprktm sprktm2, sprbxm sprbxm2, sprhgm sprhgm2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprdem sprdem2 = this;
        sprdem sprdem3 = this;
        sprdem sprdem4 = this;
        this.cfr_renamed_4 = new sprktm(1L);
        this.cfr_renamed_3 = arg0;
        sprdem3.cfr_renamed_1 = arg1;
        sprdem3.cfr_renamed_2 = arg2;
        sprdem2.cfr_renamed_0 = arg3;
        sprdem2.cfr_renamed_91 = sprhgm2;
    }

    public sprktm cfr_renamed_596() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdem(sprszm sprszm2) {
        int n;
        void arg0;
        sprdem sprdem2 = this;
        void v1 = arg0;
        int n2 = v1.cfr_renamed_84();
        int n3 = 0;
        sprdem2.cfr_renamed_4 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(0));
        int n4 = ++n3;
        sprdem2.cfr_renamed_3 = sprahm.cfr_renamed_23(sprszm2.cfr_renamed_85(n4));
        int n5 = n = ++n3;
        while (n5 < n2) {
            if (arg0.cfr_renamed_85(n) instanceof sprlem) {
                this.cfr_renamed_11188(this.cfr_renamed_1, n, 2);
                this.cfr_renamed_1 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (arg0.cfr_renamed_85(n) instanceof sprktm) {
                this.cfr_renamed_11188(this.cfr_renamed_2, n, 3);
                this.cfr_renamed_2 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (arg0.cfr_renamed_85(n) instanceof sprbxm) {
                this.cfr_renamed_11188(this.cfr_renamed_0, n, 4);
                this.cfr_renamed_0 = sprbxm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            } else if (arg0.cfr_renamed_85(n) instanceof sprnvm) {
                sprdem sprdem3 = this;
                int n6 = n;
                sprdem3.cfr_renamed_11188(sprdem3.cfr_renamed_91, n6, 5);
                sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n6);
                if (sprnvm2.cfr_renamed_312() == 0) {
                    this.cfr_renamed_91 = sprhgm.cfr_renamed_5085(sprnvm2, false);
                }
            } else {
                throw new IllegalArgumentException(spruzf.cfr_renamed_9("{\u0019g\u0013k\u0019z\u001eh\u001ek\u0013.\u0004z\u0005{\u0014z\u0002|\u0012.\u001e`W}\u0012\u007f\u0002k\u0019m\u0012"));
            }
            n5 = ++n;
        }
    }
}

