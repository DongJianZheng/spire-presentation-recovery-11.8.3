/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprfvg
extends sproug {
    public sprfvg(byte[] arg0) {
        super(arg0);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }

    public sprfvg(sprco arg0) throws IOException {
        super(arg0.cfr_renamed_119().cfr_renamed_104("DER"));
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 4, this.cfr_renamed_4);
    }

    public static void cfr_renamed_11297(sproen arg0, boolean arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        arg0.cfr_renamed_11298(arg1, 4, arg2, arg3, arg4);
    }

    public static int cfr_renamed_11301(boolean arg0, int arg1) {
        return sproen.cfr_renamed_11214(arg0, arg1);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return this;
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }
}

