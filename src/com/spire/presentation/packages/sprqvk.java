/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgn;
import com.spire.presentation.packages.sprnsk;
import com.spire.presentation.packages.sproze;

public class sprqvk {
    private static final int cfr_renamed_114 = 3;
    public static final int cfr_renamed_96 = 1;
    private final int cfr_renamed_105;
    private static final int cfr_renamed_137 = 12;
    private final int cfr_renamed_79;
    private static final int cfr_renamed_107 = 1;
    public static final int cfr_renamed_132 = 0;
    public static final int cfr_renamed_102 = 19;
    private static final int cfr_renamed_93 = 1;
    private final sprgn cfr_renamed_86;
    public static final int cfr_renamed_152 = 16;
    private final int cfr_renamed_112;
    private final byte[] cfr_renamed_119;
    private final int cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private static final int cfr_renamed_1 = 19;
    public static final int cfr_renamed_2 = 2;
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public int cfr_renamed_10000() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_10001() {
        return this.cfr_renamed_79;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public byte[] cfr_renamed_3880() {
        return sproze.cfr_renamed_158(this.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqvk(int n, byte[] byArray, byte[] byArray2, byte[] byArray3, int n2, int n3, int n4, int n5, sprgn sprgn2) {
        void arg0;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprqvk sprqvk2 = this;
        sprqvk sprqvk3 = this;
        sprqvk sprqvk4 = this;
        sprqvk sprqvk5 = this;
        this.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
        sprqvk5.cfr_renamed_119 = sproze.cfr_renamed_158((byte[])arg2);
        sprqvk5.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg3);
        sprqvk4.cfr_renamed_105 = arg4;
        sprqvk4.cfr_renamed_3 = arg5;
        sprqvk3.cfr_renamed_79 = arg6;
        sprqvk3.cfr_renamed_91 = arg7;
        sprqvk2.cfr_renamed_112 = arg0;
        sprqvk2.cfr_renamed_86 = sprgn2;
    }

    public int cfr_renamed_1490() {
        return this.cfr_renamed_105;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_722() {
        sprqvk sprqvk2 = this;
        sproze.cfr_renamed_3408(sprqvk2.cfr_renamed_4);
        sproze.cfr_renamed_3408(sprqvk2.cfr_renamed_119);
        sproze.cfr_renamed_3408(sprqvk2.cfr_renamed_0);
    }

    public byte[] cfr_renamed_1477() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public /* synthetic */ sprqvk(int arg0, byte[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, sprgn arg8, sprnsk arg9) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_112;
    }

    public sprgn cfr_renamed_10002() {
        return this.cfr_renamed_86;
    }

    public byte[] cfr_renamed_10003() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }
}

