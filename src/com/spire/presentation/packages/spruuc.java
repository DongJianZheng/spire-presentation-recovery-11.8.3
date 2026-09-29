/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprjwc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Hashtable;

public final class spruuc {
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private sprbbd cfr_renamed_2;
    private int cfr_renamed_3;
    private short cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
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

    public int cfr_renamed_2840() {
        return this.cfr_renamed_3;
    }

    public /* synthetic */ spruuc(int arg0, short arg1, byte[] arg2, sprbbd arg3, byte[] arg4, sprjwc arg5) {
        this(arg0, arg1, arg2, arg3, arg4);
    }

    public sprbbd cfr_renamed_3071() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_2667() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruuc(int n, short s, byte[] byArray, sprbbd sprbbd2, byte[] byArray2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spruuc spruuc2 = this;
        spruuc spruuc3 = this;
        this.cfr_renamed_3 = arg0;
        spruuc3.cfr_renamed_4 = arg1;
        spruuc3.cfr_renamed_0 = sprzra.cfr_renamed_158((byte[])arg2);
        spruuc2.cfr_renamed_2 = arg3;
        spruuc2.cfr_renamed_1 = byArray2;
    }

    public Hashtable cfr_renamed_3072() throws IOException {
        if (this.cfr_renamed_1 == null) {
            return null;
        }
        return sprkxc.cfr_renamed_2849(new ByteArrayInputStream(this.cfr_renamed_1));
    }

    public void cfr_renamed_722() {
        if (this.cfr_renamed_0 != null) {
            sprzra.cfr_renamed_492(this.cfr_renamed_0, (byte)0);
        }
    }

    public short cfr_renamed_3050() {
        return this.cfr_renamed_4;
    }

    public spruuc cfr_renamed_461() {
        spruuc spruuc2 = this;
        spruuc spruuc3 = this;
        return new spruuc(spruuc2.cfr_renamed_3, spruuc2.cfr_renamed_4, spruuc3.cfr_renamed_0, spruuc3.cfr_renamed_2, this.cfr_renamed_1);
    }
}

