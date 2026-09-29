/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfrk;
import com.spire.presentation.packages.sprjvg;
import com.spire.presentation.packages.sproxc;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvml;

public class sprwtk
implements spraq {
    private final sprvml cfr_renamed_4;

    public sprwtk(sprvml sprvml2) {
        this.cfr_renamed_4 = sprvml2;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_1315()).append(sproxc.cfr_renamed_9(":I\u0014")).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        return this.cfr_renamed_4.cfr_renamed_1219(arg0, arg1);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_4.cfr_renamed_1218();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprbj sprbj2 = arg0;
        if (sprbj2 instanceof sprtpk) {
            sprbj2 = sprfrk.cfr_renamed_9999(((sprtpk)sprbj2).cfr_renamed_1521());
        }
        if (!(sprbj2 instanceof sprfrk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjvg.cfr_renamed_9("9V\u0006Y\u001cQ\u0014\u0018\u0000Y\u0002Y\u001d]\u0004]\u0002\u0018\u0000Y\u0003K\u0015\\PL\u001f\u00182T\u0011S\u0015\u000b=Y\u0013\u0018\u0019V\u0019LP\u0015P")).append(arg0.getClass().getName()).toString());
        }
        sprfrk sprfrk2 = (sprfrk)sprbj2;
        if (sprfrk2.cfr_renamed_1521() == null) {
            throw new IllegalArgumentException(sproxc.cfr_renamed_9("5D\u0016C\u0012\u001b:I\u0014\b\u0005M\u0006]\u001eZ\u0012[WIWC\u0012QWX\u0016Z\u0016E\u0012\\\u0012ZY"));
        }
        this.cfr_renamed_4.cfr_renamed_10122(sprfrk2);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

