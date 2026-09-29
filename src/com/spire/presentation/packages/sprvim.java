/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprxgf;

public class sprvim
extends sprqqe {
    private byte[] cfr_renamed_4;

    public static sprvim cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvim) {
            return (sprvim)arg0;
        }
        if (arg0 != null) {
            return new sprvim(sproug.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprvim cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprvim.cfr_renamed_23(sproug.cfr_renamed_5085(arg0, arg1));
    }

    public sprvim(byte[] byArray) {
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    public sprvim(sproug arg0) {
        this(arg0.cfr_renamed_186());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprfvg(this.cfr_renamed_327());
    }

    public static sprvim cfr_renamed_5322(sprhgm arg0) {
        return sprvim.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_126));
    }

    public byte[] cfr_renamed_327() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

