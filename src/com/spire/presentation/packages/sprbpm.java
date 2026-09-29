/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdmp;
import com.spire.presentation.packages.sprgkm;
import com.spire.presentation.packages.sprjkm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlsm;
import com.spire.presentation.packages.sprnlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpwz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprbpm
extends sprqqe
implements sprlm {
    public sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbpm(sprcmm sprcmm2) {
        void arg0;
        sprbpm sprbpm2 = this;
        sprbpm2.cfr_renamed_4 = new sprycn(false, 3, (sprco)arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprco cfr_renamed_3365() {
        if (!(this.cfr_renamed_4 instanceof sprnvm)) {
            return sprlsm.cfr_renamed_23(this.cfr_renamed_4);
        }
        sprnvm sprnvm2 = (sprnvm)this.cfr_renamed_4;
        switch (sprnvm2.cfr_renamed_312()) {
            case 1: {
                return sprnlm.cfr_renamed_5085(sprnvm2, false);
            }
            case 2: {
                return this.cfr_renamed_11328(sprnvm2);
            }
            case 3: {
                return sprcmm.cfr_renamed_5085(sprnvm2, false);
            }
            case 4: {
                return sprjkm.cfr_renamed_5085(sprnvm2, false);
            }
        }
        throw new IllegalStateException(sprdmp.cfr_renamed_9("%m;m?t>#$b7"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprktm cfr_renamed_3() {
        if (!(this.cfr_renamed_4 instanceof sprnvm)) {
            return sprlsm.cfr_renamed_23(this.cfr_renamed_4).cfr_renamed_3();
        }
        sprnvm sprnvm2 = (sprnvm)this.cfr_renamed_4;
        switch (sprnvm2.cfr_renamed_312()) {
            case 1: {
                return sprnlm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_3();
            }
            case 2: {
                return this.cfr_renamed_11328(sprnvm2).cfr_renamed_3();
            }
            case 3: {
                return sprcmm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_3();
            }
            case 4: {
                return new sprktm(0L);
            }
        }
        throw new IllegalStateException(sprpwz.cfr_renamed_9("\u00163\b3\f*\r}\u0017<\u0004"));
    }

    public boolean cfr_renamed_3972() {
        return this.cfr_renamed_4 instanceof sprnvm;
    }

    public sprbpm(sprlsm sprlsm2) {
        this.cfr_renamed_4 = sprlsm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbpm(sprnlm sprnlm2) {
        void arg0;
        sprbpm sprbpm2 = this;
        sprbpm2.cfr_renamed_4 = new sprycn(false, 1, (sprco)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprbpm(sprjkm sprjkm2) {
        void arg0;
        sprbpm sprbpm2 = this;
        sprbpm2.cfr_renamed_4 = new sprycn(false, 4, (sprco)arg0);
    }

    public sprbpm(sprxgf sprxgf2) {
        this.cfr_renamed_4 = sprxgf2;
    }

    public static sprbpm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprbpm) {
            return (sprbpm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprbpm((sprszm)arg0);
        }
        if (arg0 instanceof sprnvm) {
            return new sprbpm((sprnvm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdmp.cfr_renamed_9("%m;m?t>#?a:f3wpj>#6b3w?q)9p")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    private /* synthetic */ sprgkm cfr_renamed_11328(sprnvm arg0) {
        if (arg0.cfr_renamed_4567()) {
            return sprgkm.cfr_renamed_5085(arg0, true);
        }
        return sprgkm.cfr_renamed_5085(arg0, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprbpm(sprgkm sprgkm2) {
        void arg0;
        sprbpm sprbpm2 = this;
        sprbpm2.cfr_renamed_4 = new sprycn(false, 2, (sprco)arg0);
    }
}

