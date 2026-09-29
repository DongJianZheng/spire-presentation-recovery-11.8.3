/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraie;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgxf;
import com.spire.presentation.packages.sprsag;
import com.spire.presentation.packages.sprwvd;

public class sprhxf
extends sprsag
implements sprgf {
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        byte[] byArray = new byte[32];
        sprhxf sprhxf2 = this;
        sprhxf2.cfr_renamed_6039(byArray);
        sprhxf.cfr_renamed_6041(byArray, 0, this.cfr_renamed_1, 0, arg0, arg1, 32);
        sprhxf2.cfr_renamed_41();
        return arg0.length;
    }

    @Override
    public void cfr_renamed_41() {
        super.cfr_renamed_41();
    }

    @Override
    public String cfr_renamed_1315() {
        return spraie.cfr_renamed_9("\u0002:8:!:\u0019vxn|");
    }

    public sprhxf(sprgxf sprgxf2) {
        this.cfr_renamed_4 = sprgxf2.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_2 > 32 - arg2) {
            throw new IllegalArgumentException(sprwvd.cfr_renamed_9("Z\u000eZ\u0000BAG\u000f^\u0014ZAM\u0000@\u000fA\u0015\u000e\u0003KAC\u000e\\\u0004\u000e\u0015F\u0000@A\u001dS\u000e\u0003W\u0015K\u0012"));
        }
        sprhxf sprhxf2 = this;
        System.arraycopy(arg0, arg1, sprhxf2.cfr_renamed_1, sprhxf2.cfr_renamed_2, arg2);
        this.cfr_renamed_2 += arg2;
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_2 > 31) {
            throw new IllegalArgumentException(spraie.cfr_renamed_9("/%/+7j2$+?/j8+5$4>{(>j6%)/{>3+5jhx{(\">>9"));
        }
        this.cfr_renamed_1[this.cfr_renamed_2++] = arg0;
    }
}

