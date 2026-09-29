/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrum;
import com.spire.presentation.packages.spruir;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprhlm
extends sprqqe
implements sprlm {
    private int cfr_renamed_3;
    private sprco cfr_renamed_4;

    public sprhlm(sprrum sprrum2) {
        sprhlm sprhlm2 = this;
        sprhlm2.cfr_renamed_3 = 1;
        sprhlm2.cfr_renamed_4 = sprrum2;
    }

    public int cfr_renamed_312() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprhlm sprhlm2 = this;
        return new sprycn(false, sprhlm2.cfr_renamed_3, sprhlm2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprhlm(int n, sprco sprco2) {
        void arg0;
        sprhlm sprhlm2 = this;
        sprhlm2.cfr_renamed_3 = arg0;
        sprhlm2.cfr_renamed_4 = sprco2;
    }

    public static sprhlm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprhlm) {
            return (sprhlm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprhlm((sprnvm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("SEMEI\\H\u000bIILNE_\u0006BH\u000b@JE_IY_\u0011\u0006")).append(arg0.getClass().getName()).toString());
    }

    public sprco cfr_renamed_648() {
        return this.cfr_renamed_4;
    }

    public sprhlm() {
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_4 = sprpen.cfr_renamed_4;
    }

    public static sprhlm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhlm.cfr_renamed_23(arg0.cfr_renamed_11204());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhlm(sprnvm sprnvm2) {
        int n = sprnvm2.cfr_renamed_312();
        switch (n) {
            case 0: {
                void arg0;
                while (false) {
                }
                sprhlm sprhlm2 = this;
                this.cfr_renamed_4 = sprfan.cfr_renamed_5085((sprnvm)arg0, false);
                break;
            }
            case 1: {
                void arg0;
                sprhlm sprhlm2 = this;
                this.cfr_renamed_4 = sprrum.cfr_renamed_5085((sprnvm)arg0, false);
                break;
            }
            case 2: {
                void arg0;
                sprhlm sprhlm2 = this;
                this.cfr_renamed_4 = sprfan.cfr_renamed_5085((sprnvm)arg0, false);
                break;
            }
            default: {
                void arg0;
                throw new IllegalArgumentException(new StringBuilder().insert(0, spruir.cfr_renamed_9("\u0011|/|+e*20s#2!|'}1|0w6w (d")).append(sprvan.cfr_renamed_11184((sprnvm)arg0)).toString());
            }
        }
        sprhlm2.cfr_renamed_3 = n;
    }
}

