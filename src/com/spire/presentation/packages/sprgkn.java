/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdr;
import com.spire.presentation.packages.sprfrn;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtin;
import com.spire.presentation.packages.sprxy;

@sprtea
public class sprgkn
implements sprdr {
    @Override
    public void dispose() {
    }

    @Override
    public sprxy cfr_renamed_12967(String arg0, byte[] arg1, int arg2) {
        if (arg0 == null) {
            throw new NullPointerException("fontId");
        }
        if (arg1 == null) {
            throw new NullPointerException(sprgtb.cfr_renamed_9("\u001cl\u0014w8o\u0015a"));
        }
        return new sprfrn(arg1, arg2);
    }

    private /* synthetic */ sprgkn() {
    }

    @Override
    public sprxy cfr_renamed_12966(String arg0, int arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprizc.cfr_renamed_9("zqrjL\u007fhv"));
        }
        return new sprfrn(arg0, arg1);
    }

    public static sprdr cfr_renamed_1631() {
        return new sprtin(new sprgkn());
    }
}

