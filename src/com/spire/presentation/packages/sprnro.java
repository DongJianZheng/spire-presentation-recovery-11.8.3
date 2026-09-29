/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlia;

@sprtea
public class sprnro {
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_17880() {
        return this.cfr_renamed_2;
    }

    public sprnro(sprbnja arg0) {
        sprnro sprnro2 = this;
        sprbnja sprbnja2 = arg0;
        sprnro sprnro3 = this;
        sprnro3.cfr_renamed_4 = arg0.cfr_renamed_1942();
        sprnro3.cfr_renamed_3 = arg0.cfr_renamed_1452();
        sprnro2.cfr_renamed_2 = sprbnja2.cfr_renamed_17880();
        sprbnja sprbnja3 = arg0;
        int n = sprbnja2.cfr_renamed_17880() * sprbnja3.cfr_renamed_1452();
        sprnro2.cfr_renamed_1 = new byte[n];
        sprtlia.cfr_renamed_17883(sprbnja3.cfr_renamed_17881(), this.cfr_renamed_1, 0, n);
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1942() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3;
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_1;
    }
}

