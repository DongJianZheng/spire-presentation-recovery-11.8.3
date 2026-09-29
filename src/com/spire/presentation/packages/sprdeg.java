/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbvh;
import com.spire.presentation.packages.sprceg;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprkwf;
import com.spire.presentation.packages.sprldg;
import com.spire.presentation.packages.sprspx;
import com.spire.presentation.packages.sprytf;
import java.io.IOException;

public class sprdeg
implements sprgm {
    private sprceg cfr_renamed_3;
    private sprldg cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            this.cfr_renamed_3 = (sprceg)arg1;
            return;
        }
        this.cfr_renamed_4 = (sprldg)arg1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        try {
            return sprytf.cfr_renamed_6499(this.cfr_renamed_3, arg0).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprspx.cfr_renamed_9("?\u000e+\u0002&\u0005j\u0014%@/\u000e)\u000f.\u0005j\u0013#\u0007$\u0001>\u00158\u0005p@")).append(iOException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        try {
            return sprytf.cfr_renamed_6500(this.cfr_renamed_4, sprkwf.cfr_renamed_6501(arg1, this.cfr_renamed_4.cfr_renamed_2331()), arg0);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprbvh.cfr_renamed_9("&;27?0s!<u700:70s&:2=4' !0iu")).append(iOException.getMessage()).toString());
        }
    }
}

