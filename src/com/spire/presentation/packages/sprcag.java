/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprcag {
    public int cfr_renamed_6891(byte[] arg0, int arg1) {
        int n = 0;
        n = this.cfr_renamed_6964(arg0[arg1 + 0]) << 0 | this.cfr_renamed_6964(arg0[arg1 + 1]) << 8 | this.cfr_renamed_6964(arg0[arg1 + 2]) << 16 | this.cfr_renamed_6964(arg0[arg1 + 3]) << 24;
        return n;
    }

    public byte[] cfr_renamed_6894(int arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byArray[0] = (byte)(arg0 >>> 0);
        byArray[1] = (byte)(arg0 >>> 8);
        byArray2[2] = (byte)(arg0 >>> 16);
        byArray[3] = (byte)(arg0 >>> 24);
        return byArray2;
    }

    public long cfr_renamed_6889(byte[] arg0, int arg1) {
        long l = 0L;
        l = this.cfr_renamed_6965(arg0[arg1 + 0]) << 0 | this.cfr_renamed_6965(arg0[arg1 + 1]) << 8 | this.cfr_renamed_6965(arg0[arg1 + 2]) << 16 | this.cfr_renamed_6965(arg0[arg1 + 3]) << 24 | this.cfr_renamed_6965(arg0[arg1 + 4]) << 32 | this.cfr_renamed_6965(arg0[arg1 + 5]) << 40 | this.cfr_renamed_6965(arg0[arg1 + 6]) << 48 | this.cfr_renamed_6965(arg0[arg1 + 7]) << 56;
        return l;
    }

    public int[] cfr_renamed_6890(byte[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2];
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n;
            int n4 = this.cfr_renamed_6891(arg0, arg1 + 4 * n);
            nArray[n3] = n4;
            n2 = ++n;
        }
        return nArray;
    }

    public byte[] cfr_renamed_6892(long arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[8];
        byArray[0] = (byte)(arg0 >>> 0);
        byArray[1] = (byte)(arg0 >>> 8);
        byArray[2] = (byte)(arg0 >>> 16);
        byArray[3] = (byte)(arg0 >>> 24);
        byArray[4] = (byte)(arg0 >>> 32);
        byArray[5] = (byte)(arg0 >>> 40);
        byArray2[6] = (byte)(arg0 >>> 48);
        byArray[7] = (byte)(arg0 >>> 56);
        return byArray2;
    }

    private /* synthetic */ long cfr_renamed_6965(byte arg0) {
        return (long)arg0 & 0xFFL;
    }

    private /* synthetic */ int cfr_renamed_6964(byte arg0) {
        return arg0 & 0xFF;
    }
}

