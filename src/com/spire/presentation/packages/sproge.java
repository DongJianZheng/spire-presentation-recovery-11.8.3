/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spresy;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwae;
import com.spire.presentation.packages.spryte;

public class sproge
extends sprkra
implements sprkj {
    private spra cfr_renamed_3;
    private int cfr_renamed_4;

    public spra cfr_renamed_648() {
        return this.cfr_renamed_3;
    }

    public static sproge cfr_renamed_341(spryte arg0, boolean arg1) {
        return sproge.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sproge sproge2 = this;
        return new sprhse(false, sproge2.cfr_renamed_4, sproge2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sproge(int n, spra spra2) {
        void arg0;
        sproge sproge2 = this;
        sproge2.cfr_renamed_4 = arg0;
        sproge2.cfr_renamed_3 = spra2;
    }

    public sproge(sprwae sprwae2) {
        sproge sproge2 = this;
        sproge2.cfr_renamed_4 = 1;
        sproge2.cfr_renamed_3 = sprwae2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sproge(spryte arg0) {
        spryte spryte2 = arg0;
        this.cfr_renamed_4 = spryte2.cfr_renamed_312();
        switch (spryte2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_3 = sprume.cfr_renamed_3;
                return;
            }
            case 1: {
                this.cfr_renamed_3 = sprwae.cfr_renamed_341(arg0, false);
                return;
            }
            case 2: {
                this.cfr_renamed_3 = sprume.cfr_renamed_3;
                return;
            }
        }
    }

    public int cfr_renamed_312() {
        return this.cfr_renamed_4;
    }

    public sproge() {
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_3 = sprume.cfr_renamed_3;
    }

    public static sproge cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sproge) {
            return (sproge)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sproge((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spresy.cfr_renamed_9("TVJVNOO\u0018NZK]BL\u0001QO\u0018GYBLNJX\u0002\u0001")).append(arg0.getClass().getName()).toString());
    }
}

