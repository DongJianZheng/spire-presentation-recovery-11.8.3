/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvh;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprpbd {
    public sprzuc cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public sprzuc cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    public static sprpbd cfr_renamed_2628(sprsc arg0, InputStream arg1) throws IOException {
        sprzuc sprzuc2 = null;
        if (sprzsc.cfr_renamed_2631(arg0)) {
            sprzuc2 = sprzuc.cfr_renamed_2661(arg1);
        }
        byte[] byArray = sprzsc.cfr_renamed_2629(arg1);
        return new sprpbd(sprzuc2, byArray);
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_2623(arg0);
        }
        sprzsc.cfr_renamed_2624(this.cfr_renamed_4, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprpbd(sprzuc sprzuc2, byte[] byArray) {
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprbvh.cfr_renamed_9("t&:2=4' !0tu04=;<!s76u= ?9"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }
}

