/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.sprkxb;
import com.spire.presentation.packages.sprrgf;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprnhf {
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_865(int arg0) {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_3) {
            int n3 = arg0;
            arg0 = this.cfr_renamed_838(n3, n3);
            n2 = ++n;
        }
        return arg0;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprhxa.cfr_renamed_9("q\u0013Y\u0013C\u001f\u0017<^\u001f[\u001e\u0017=qR\u0005$")).append(this.cfr_renamed_3).append(sprkxb.cfr_renamed_9("\u0012v\u0006v")).append(sprhxa.cfr_renamed_9("p<\u001fH\u001e!o'\u0018F")).append(sprnhf.cfr_renamed_1088(this.cfr_renamed_4)).append(sprkxb.cfr_renamed_9("\u0005v")).toString();
    }

    public int cfr_renamed_813() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprnhf(sprnhf sprnhf2) {
        void arg0;
        sprnhf sprnhf3 = this;
        this.cfr_renamed_3 = 0;
        sprnhf3.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprnhf3.cfr_renamed_4 = sprnhf2.cfr_renamed_4;
    }

    public int cfr_renamed_817(int arg0) {
        int n = (1 << this.cfr_renamed_3) - 2;
        return this.cfr_renamed_1086(arg0, n);
    }

    public int hashCode() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_1087() {
        return this.cfr_renamed_862(sprybl.cfr_renamed_2794());
    }

    public int cfr_renamed_1086(int arg0, int arg1) {
        if (arg1 == 0) {
            return 1;
        }
        if (arg0 == 0) {
            return 0;
        }
        if (arg0 == 1) {
            return 1;
        }
        int n = 1;
        if (arg1 < 0) {
            arg0 = this.cfr_renamed_817(arg0);
            arg1 = -arg1;
        }
        int n2 = arg1;
        while (n2 != 0) {
            if ((arg1 & 1) == 1) {
                n = this.cfr_renamed_838(n, arg0);
            }
            int n3 = arg0;
            arg0 = this.cfr_renamed_838(n3, n3);
            n2 = arg1 >>> 1;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprnhf(int n) {
        void arg0;
        this.cfr_renamed_3 = 0;
        if (n >= 32) {
            throw new IllegalArgumentException(sprhxa.cfr_renamed_9("Zr\bE\u0015E@\u0017\u000e_\u001f\u0017\u001eR\u001dE\u001fRZX\u001c\u0017\u001c^\u001f[\u001e\u0017\u0013DZC\u0015XZ[\u001bE\u001dRZ"));
        }
        if (arg0 < true) {
            throw new IllegalArgumentException(sprkxb.cfr_renamed_9("\u001b\u0013I$T$\u0001vO>^v_3\\$^3\u001b9]v]?^:_vR%\u001b8T8\u0016&T%R\"R ^v"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = sprrgf.cfr_renamed_826(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        return sprfdf.cfr_renamed_886(this.cfr_renamed_4);
    }

    public int cfr_renamed_862(SecureRandom arg0) {
        int n;
        int n2;
        int n3 = 0x100000;
        int n4 = n2 = sprfhf.cfr_renamed_808(arg0, 1 << this.cfr_renamed_3);
        for (n = 0; n4 == 0 && n < n3; ++n) {
            n4 = n2 = sprfhf.cfr_renamed_808(arg0, 1 << this.cfr_renamed_3);
        }
        if (n == n3) {
            n2 = 1;
        }
        return n2;
    }

    public int cfr_renamed_863(SecureRandom arg0) {
        return sprfhf.cfr_renamed_808(arg0, 1 << this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprnhf(byte[] byArray) {
        void arg0;
        this.cfr_renamed_3 = 0;
        if (byArray.length != 4) {
            throw new IllegalArgumentException(sprhxa.cfr_renamed_9("\u0018N\u000eRZV\bE\u001bNZ^\t\u0017\u0014X\u000e\u0017\u001bYZR\u0014T\u0015S\u001fSZQ\u0013Y\u0013C\u001f\u0017\u001c^\u001f[\u001e"));
        }
        this.cfr_renamed_4 = sprfdf.cfr_renamed_887((byte[])arg0);
        if (!sprrgf.cfr_renamed_827(this.cfr_renamed_4)) {
            throw new IllegalArgumentException(sprkxb.cfr_renamed_9("4B\"^vZ$I7BvR%\u001b8T\"\u001b7Uv^8X9_3_v]?U?O3\u001b0R3W2"));
        }
        this.cfr_renamed_3 = sprrgf.cfr_renamed_824(this.cfr_renamed_4);
    }

    private static /* synthetic */ String cfr_renamed_1088(int arg0) {
        String string = "";
        if (arg0 == 0) {
            string = "0";
            return "0";
        }
        byte by = (byte)(arg0 & 1);
        if (by == 1) {
            string = "1";
        }
        int n = 1;
        int n2 = arg0 >>>= 1;
        while (n2 != 0) {
            by = (byte)(arg0 & 1);
            if (by == 1) {
                string = new StringBuilder().insert(0, string).append(sprhxa.cfr_renamed_9("QO$")).append(n).toString();
            }
            ++n;
            n2 = arg0 >>>= 1;
        }
        return string;
    }

    public int cfr_renamed_1085() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_825(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    public int cfr_renamed_838(int arg0, int arg1) {
        return sprrgf.cfr_renamed_828(arg0, arg1, this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprnhf(int n, int n2) {
        void arg0;
        void arg1;
        this.cfr_renamed_3 = 0;
        if (n != sprrgf.cfr_renamed_824((int)arg1)) {
            throw new IllegalArgumentException(sprkxb.cfr_renamed_9("v~$I9Il\u001b\"S3\u001b2^1I3^vR%\u001b8T\"\u001b5T$I3X\""));
        }
        if (!sprrgf.cfr_renamed_827((int)arg1)) {
            throw new IllegalArgumentException(sprhxa.cfr_renamed_9("Zr\bE\u0015E@\u0017\u001d^\fR\u0014\u0017\nX\u0016N\u0014X\u0017^\u001b[Z^\t\u0017\bR\u001eB\u0019^\u0018[\u001f"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprnhf)) {
            return false;
        }
        sprnhf sprnhf2 = (sprnhf)arg0;
        return this.cfr_renamed_3 == sprnhf2.cfr_renamed_3 && this.cfr_renamed_4 == sprnhf2.cfr_renamed_4;
    }

    public String cfr_renamed_867(int arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            if (((byte)arg0 & 1) == 0) {
                string = new StringBuilder().insert(0, "0").append(string).toString();
                n3 = arg0;
            } else {
                string = new StringBuilder().insert(0, "1").append(string).toString();
                n3 = arg0;
            }
            arg0 = n3 >>> 1;
            n2 = ++n;
        }
        return string;
    }

    public boolean cfr_renamed_839(int arg0) {
        if (this.cfr_renamed_3 == 31) {
            return arg0 >= 0;
        }
        return arg0 >= 0 && arg0 < 1 << this.cfr_renamed_3;
    }
}

