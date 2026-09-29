/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprpgp;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprwwc {
    public String cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprwwc sprwwc2 = this;
        sprzsc.cfr_renamed_2624(sprywa.cfr_renamed_433(sprwwc2.cfr_renamed_3), arg0);
        if (sprwwc2.cfr_renamed_4 == null) {
            sprzsc.cfr_renamed_2625(0, arg0);
            return;
        }
        sprzsc.cfr_renamed_2625(1, arg0);
        arg0.write(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_2626() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwwc(String string, byte[] byArray) {
        void arg1;
        void arg0;
        if (string == null || arg0.length() < 1 || arg0.length() >= 65536) {
            throw new IllegalArgumentException(sprpgp.cfr_renamed_9("`G5^`\u0012*G4FgZ&D\"\u0012+W)U3ZgT5]*\u0012v\u00123]g\u001aulv\u0004g\u001fg\u0003n"));
        }
        if (arg1 != null && ((void)arg1).length != 20) {
            throw new IllegalArgumentException(sprjth.cfr_renamed_9("\nxEj\u001cCLxE,\rfXxY+Ej[n\rgHeJ\u007fE+\u00106\r9\u001d'\rbK+]yHxHeY"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    public String cfr_renamed_2627() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprwwc cfr_renamed_2628(sprsc arg0, InputStream arg1) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2629(arg1);
        if (byArray.length < 1) {
            throw new spryad(47);
        }
        String string = sprywa.cfr_renamed_184(byArray);
        byte[] byArray2 = null;
        switch (sprzsc.cfr_renamed_2630(arg1)) {
            case 0: {
                if (!sprzsc.cfr_renamed_2631(arg0)) return new sprwwc(string, byArray2);
                throw new spryad(47);
            }
            case 1: {
                byArray2 = sprzsc.cfr_renamed_2632(20, arg1);
                return new sprwwc(string, byArray2);
            }
        }
        throw new spryad(47);
    }
}

