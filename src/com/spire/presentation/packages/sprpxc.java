/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdwy;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprygn;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;

public final class sprpxc {
    private int cfr_renamed_112;
    public static final sprpxc cfr_renamed_119;
    public static final sprpxc cfr_renamed_91;
    public static final sprpxc cfr_renamed_0;
    public static final sprpxc cfr_renamed_1;
    private String cfr_renamed_2;
    public static final sprpxc cfr_renamed_3;
    public static final sprpxc cfr_renamed_4;

    public boolean equals(Object arg0) {
        return this == arg0 || arg0 instanceof sprpxc && this.cfr_renamed_3084((sprpxc)arg0);
    }

    public int cfr_renamed_2703() {
        return this.cfr_renamed_112 >> 8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprpxc cfr_renamed_2658(int arg0, int arg1) throws IOException {
        switch (arg0) {
            case 3: {
                switch (arg1) {
                    case 0: {
                        return cfr_renamed_0;
                    }
                    case 1: {
                        return cfr_renamed_91;
                    }
                    case 2: {
                        return cfr_renamed_1;
                    }
                    case 3: {
                        return cfr_renamed_119;
                    }
                }
                return sprpxc.cfr_renamed_3086(arg0, arg1, "TLS");
            }
            case 254: {
                switch (arg1) {
                    case 255: {
                        return cfr_renamed_4;
                    }
                    case 254: {
                        throw new spryad(47);
                    }
                    case 253: {
                        return cfr_renamed_3;
                    }
                }
                return sprpxc.cfr_renamed_3086(arg0, arg1, sprdwy.cfr_renamed_9("\u001d6\u00151"));
            }
        }
        throw new spryad(47);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpxc(int n, String string) {
        void arg0;
        sprpxc sprpxc2 = this;
        sprpxc2.cfr_renamed_112 = arg0 & 0xFFFF;
        sprpxc2.cfr_renamed_2 = string;
    }

    public int hashCode() {
        return this.cfr_renamed_112;
    }

    public boolean cfr_renamed_2684() {
        return this == cfr_renamed_0;
    }

    public boolean cfr_renamed_3087() {
        return this.cfr_renamed_2703() == 3;
    }

    private static /* synthetic */ sprpxc cfr_renamed_3086(int arg0, int arg1, String arg2) throws IOException {
        sprzsc.cfr_renamed_2639(arg0);
        sprzsc.cfr_renamed_2639(arg1);
        int n = arg0 << 8 | arg1;
        String string = sprywa.cfr_renamed_116(Integer.toHexString(0x10000 | n).substring(1));
        return new sprpxc(n, arg2 + sprygn.cfr_renamed_9("Wz\u000f") + string);
    }

    public int cfr_renamed_3088() {
        return this.cfr_renamed_112;
    }

    public boolean cfr_renamed_2848() {
        return this.cfr_renamed_2703() == 254;
    }

    public int cfr_renamed_2704() {
        return this.cfr_renamed_112 & 0xFF;
    }

    public boolean cfr_renamed_3084(sprpxc arg0) {
        return arg0 != null && this.cfr_renamed_112 == arg0.cfr_renamed_112;
    }

    public boolean cfr_renamed_3089(sprpxc arg0) {
        if (this.cfr_renamed_2703() != arg0.cfr_renamed_2703()) {
            return false;
        }
        int n = arg0.cfr_renamed_2704() - this.cfr_renamed_2704();
        if (this.cfr_renamed_2848()) {
            return n > 0;
        }
        return n < 0;
    }

    public sprpxc cfr_renamed_2743() {
        if (!this.cfr_renamed_2848()) {
            return this;
        }
        if (this == cfr_renamed_4) {
            return cfr_renamed_1;
        }
        return cfr_renamed_119;
    }

    public String toString() {
        return this.cfr_renamed_2;
    }

    static {
        cfr_renamed_0 = new sprpxc(768, sprdwy.cfr_renamed_9("1\n.yQwR"));
        cfr_renamed_91 = new sprpxc(769, sprygn.cfr_renamed_9("#\u0006$jFdG"));
        cfr_renamed_1 = new sprpxc(770, sprdwy.cfr_renamed_9("6\u00151ySwS"));
        cfr_renamed_119 = new sprpxc(771, sprygn.cfr_renamed_9("#\u0006$jFdE"));
        cfr_renamed_4 = new sprpxc(65279, sprdwy.cfr_renamed_9("\u001d6\u00151ySwR"));
        cfr_renamed_3 = new sprpxc(65277, sprygn.cfr_renamed_9("\u000e#\u0006$jFdE"));
    }

    public boolean cfr_renamed_2742(sprpxc arg0) {
        if (this.cfr_renamed_2703() != arg0.cfr_renamed_2703()) {
            return false;
        }
        int n = arg0.cfr_renamed_2704() - this.cfr_renamed_2704();
        if (this.cfr_renamed_2848()) {
            return n <= 0;
        }
        return n >= 0;
    }
}

