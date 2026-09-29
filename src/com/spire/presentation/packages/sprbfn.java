/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprbfn
extends sprgbf {
    public static void cfr_renamed_11297(sproen arg0, boolean arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        arg0.cfr_renamed_11298(arg1, 3, arg2, arg3, arg4);
    }

    public static void cfr_renamed_11299(sproen arg0, boolean arg1, byte arg2, byte[] arg3, int arg4, int arg5) throws IOException {
        arg0.cfr_renamed_11300(arg1, 3, arg2, arg3, arg4, arg5);
    }

    public sprbfn(byte[] arg0, boolean arg1) {
        super(arg0, arg1);
    }

    public sprbfn(sprco arg0) throws IOException {
        super(arg0.cfr_renamed_119().cfr_renamed_104("DER"), 0);
    }

    public sprbfn(int arg0) {
        super(sprbfn.cfr_renamed_4491(arg0), sprbfn.cfr_renamed_4492(arg0));
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 3, this.cfr_renamed_3);
    }

    public static int cfr_renamed_11301(boolean arg0, int arg1) {
        return sproen.cfr_renamed_11214(arg0, arg1);
    }

    public sprbfn(byte[] arg0) {
        this(arg0, 0);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    public sprbfn(byte arg0, int arg1) {
        super(arg0, arg1);
    }

    public sprbfn(byte[] arg0, int arg1) {
        super(arg0, arg1);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }
}

