/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprjmb;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprzdm
extends sprqqe {
    private sprgbf cfr_renamed_3;
    private sprktm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public static sprzdm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprzdm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_2618() {
        return this.cfr_renamed_4;
    }

    public static sprzdm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzdm) {
            return (sprzdm)arg0;
        }
        if (arg0 != null) {
            return new sprzdm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprzdm(sprgbf sprgbf2, sprktm sprktm2) {
        void arg0;
        void arg1;
        if (sprgbf2 == null) {
            throw new IllegalArgumentException(sprhnn.cfr_renamed_9(";\u0010y\u0006xD<\u0000}\rr\fhC~\u0006<\ri\u000fp"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprjmb.cfr_renamed_9("^\u0014\u001e\u0001\u0017'\u0016\u0011\u0017\u0010\u001c\u0016^D\u001a\u0005\u0017\n\u0016\u0010Y\u0006\u001cD\u0017\u0011\u0015\b"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    public sprgbf cfr_renamed_2113() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzdm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhnn.cfr_renamed_9("^\u0002xCo\u0006m\u0016y\r\u007f\u0006<\u0010u\u0019yY<")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprgbf.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

