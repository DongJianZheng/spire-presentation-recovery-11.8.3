/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

@sprtea
public class sprdye
extends sprgbf {
    public static sprdye cfr_renamed_11308(sproug arg0) {
        return new sprdye(arg0.cfr_renamed_186(), true);
    }

    public sprdye(byte[] arg0, boolean arg1) {
        super(arg0, arg1);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    public static sprdye cfr_renamed_11309(sprgbf arg0) {
        return (sprdye)arg0.cfr_renamed_4615();
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    public sprdye(sprco arg0) throws IOException {
        super(arg0.cfr_renamed_119().cfr_renamed_104("DER"), 0);
    }

    public sprdye(byte arg0, int arg1) {
        super(arg0, arg1);
    }

    public sprdye(int arg0) {
        super(sprdye.cfr_renamed_4491(arg0), sprdye.cfr_renamed_4492(arg0));
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return this;
    }

    public sprdye(byte[] arg0, int arg1) {
        super(arg0, arg1);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        sprdye sprdye2 = this;
        int n = sprdye2.cfr_renamed_3[0] & 0xFF;
        int n2 = sprdye2.cfr_renamed_3.length - 1;
        sprdye sprdye3 = this;
        byte by = sprdye3.cfr_renamed_3[n2];
        byte by2 = (byte)(sprdye3.cfr_renamed_3[n2] & 255 << n);
        if (by == by2) {
            arg0.cfr_renamed_11219(arg1, 3, this.cfr_renamed_3);
            return;
        }
        arg0.cfr_renamed_11310(arg1, 3, this.cfr_renamed_3, 0, n2, by2);
    }

    public sprdye(byte[] arg0) {
        this(arg0, 0);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }
}

