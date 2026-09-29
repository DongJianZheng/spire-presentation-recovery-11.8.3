/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcl;
import com.spire.presentation.packages.sprhxg;
import com.spire.presentation.packages.sprnzja;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtwn;
import com.spire.presentation.packages.sprxam;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class sprkah
implements sprcl {
    public sprsm cfr_renamed_1;
    public sprhxg cfr_renamed_2;
    public InputStream cfr_renamed_3;
    public sprxam cfr_renamed_4;

    public int cfr_renamed_3() {
        throw new UnsupportedOperationException(sprtwn.cfr_renamed_9("6p,?+j(o7m,z<?u?7i=m*v<zxm=n-v*z<"));
    }

    public InputStream cfr_renamed_2920() {
        return this.cfr_renamed_4.cfr_renamed_2920();
    }

    public boolean cfr_renamed_7846() {
        return this.cfr_renamed_4 instanceof sproam;
    }

    public int cfr_renamed_593() {
        throw new UnsupportedOperationException(sprnzja.cfr_renamed_9("WyM6JcIfVdMs]6\u00146V`\\dK\u007f]s\u0019d\\gL\u007fKs]"));
    }

    public sprkah(sprxam sprxam2) {
        this.cfr_renamed_4 = sprxam2;
    }

    public boolean cfr_renamed_1626() throws sprtqg, IOException {
        int n;
        OutputStream outputStream;
        if (!this.cfr_renamed_7846()) {
            throw new sprtqg(sprtwn.cfr_renamed_9("<~,~xq7kxv6k=x*v,fxo*p,z;k={v"));
        }
        sprkah sprkah2 = this;
        while (sprkah2.cfr_renamed_3.read() >= 0) {
            sprkah2 = this;
        }
        sprkah sprkah3 = this;
        int[] nArray = sprkah3.cfr_renamed_2.cfr_renamed_7869();
        OutputStream outputStream2 = outputStream = sprkah3.cfr_renamed_1.cfr_renamed_470();
        outputStream2.write((byte)nArray[0]);
        outputStream2.write((byte)nArray[1]);
        byte[] byArray = sprkah3.cfr_renamed_1.cfr_renamed_580();
        byte[] byArray2 = new byte[byArray.length];
        int n2 = n = 0;
        while (n2 != byArray2.length) {
            int n3 = n++;
            byArray2[n3] = (byte)nArray[n3 + 2];
            n2 = n;
        }
        return sproze.cfr_renamed_559(byArray, byArray2);
    }
}

