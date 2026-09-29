/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrgf;
import com.spire.presentation.packages.sprvse;
import com.spire.presentation.packages.spryky;
import java.security.spec.AlgorithmParameterSpec;

public class sprzef
implements AlgorithmParameterSpec {
    private final int cfr_renamed_102;
    private final int cfr_renamed_93;
    public static final String cfr_renamed_86 = "SHA-1";
    public static final String cfr_renamed_152 = "SHA-384";
    public static final int cfr_renamed_112 = 50;
    public static final String cfr_renamed_119 = "SHA-224";
    public static final int cfr_renamed_91 = 11;
    public static final String cfr_renamed_0 = "SHA-256";
    private final String cfr_renamed_1;
    public static final String cfr_renamed_2 = "SHA-512";
    private final int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_1186() {
        return this.cfr_renamed_3;
    }

    public sprzef(int arg0, int arg1) {
        this(arg0, arg1, cfr_renamed_0);
    }

    public String cfr_renamed_580() {
        return this.cfr_renamed_1;
    }

    public sprzef(int arg0) {
        this(arg0, cfr_renamed_0);
    }

    public sprzef() {
        this(11, 50, cfr_renamed_0);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_93;
    }

    public sprzef(int arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzef(int n, int n2, String string) {
        void arg2;
        void arg1;
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(sprvse.cfr_renamed_9("@;@n^o\ryH;]t^rYr[~"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(spryky.cfr_renamed_9("\u0010r\u0014!]&\u0012=]>\u001c \u001a7"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_102 = 1 << arg0;
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprvse.cfr_renamed_9("Y;@n^o\ryH;]t^rYr[~"));
        }
        if (arg1 > this.cfr_renamed_102) {
            throw new IllegalArgumentException(spryky.cfr_renamed_9("&]?\b!\tr\u001f7]>\u0018!\u000er\t:\u001c<]<]o]`#?"));
        }
        sprzef sprzef2 = this;
        sprzef2.cfr_renamed_93 = arg1;
        sprzef2.cfr_renamed_4 = sprrgf.cfr_renamed_826((int)arg0);
        this.cfr_renamed_1 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzef(int n, String string) {
        void arg1;
        void arg0;
        int n2;
        if (n < 1) {
            throw new IllegalArgumentException(sprvse.cfr_renamed_9("pHb\rhDaH;@n^o\ryH;]t^rYr[~"));
        }
        int n3 = 0;
        int n4 = n2 = 1;
        while (n4 < arg0) {
            ++n3;
            n4 = n2 <<= 1;
        }
        sprzef sprzef2 = this;
        sprzef sprzef3 = this;
        sprzef3.cfr_renamed_93 = (n2 >>> 1) / n3;
        sprzef3.cfr_renamed_3 = n3;
        sprzef2.cfr_renamed_102 = n2;
        sprzef2.cfr_renamed_4 = sprrgf.cfr_renamed_826(n3);
        this.cfr_renamed_1 = arg1;
    }

    public sprzef(int arg0, int arg1, int arg2, String arg3) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3 < 1) {
            throw new IllegalArgumentException(spryky.cfr_renamed_9("\u0010r\u0010'\u000e&]0\u0018r\r=\u000e;\t;\u000b7"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(sprvse.cfr_renamed_9(";@;Dh\roBt\rwLiJ~"));
        }
        this.cfr_renamed_102 = 1 << arg0;
        this.cfr_renamed_93 = arg1;
        if (arg1 < 0) {
            throw new IllegalArgumentException(spryky.cfr_renamed_9("\tr\u0010'\u000e&]0\u0018r\r=\u000e;\t;\u000b7"));
        }
        if (arg1 > this.cfr_renamed_102) {
            throw new IllegalArgumentException(sprvse.cfr_renamed_9("o\rvXhY;O~\rwHh^;YsLu\ru\r&\r)sv"));
        }
        if (sprrgf.cfr_renamed_824(arg2) != arg0 || !sprrgf.cfr_renamed_827(arg2)) {
            throw new IllegalArgumentException(spryky.cfr_renamed_9("\r=\u0011+\u0013=\u0010;\u001c>];\u000er\u0013=\tr\u001cr\u001b;\u0018>\u0019r\r=\u0011+\u0013=\u0010;\u001c>]4\u0012 ]\u0015;zO\f\u0010{"));
        }
        sprzef sprzef2 = this;
        sprzef2.cfr_renamed_4 = arg2;
        sprzef2.cfr_renamed_1 = arg3;
    }

    public int cfr_renamed_1185() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_102;
    }
}

