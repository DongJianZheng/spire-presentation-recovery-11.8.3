/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprtjp {
    private byte cfr_renamed_2;
    private int cfr_renamed_3 = 0;
    private int cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_19098(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = arg0[0];
        int n4 = n = 1;
        while (n4 < arg0.length) {
            if (n3 == 0) {
                return n2;
            }
            if (arg0[n] < n3) {
                n2 = n;
                n3 = arg0[n];
            }
            n4 = ++n;
        }
        return n2;
    }

    @sprtea
    public sprtjp() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 3 ^ 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ 2;
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

    private static /* synthetic */ byte[] cfr_renamed_19099(byte arg0, int arg1) {
        int n;
        byte[] byArray = new byte[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            byArray[n++] = arg0;
            n2 = n;
        }
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte[] cfr_renamed_19100(byte arg0) {
        switch (this.cfr_renamed_3) {
            case 0: {
                this.cfr_renamed_2 = arg0;
                this.cfr_renamed_3 = 1;
                return sprkpp.cfr_renamed_4;
            }
            case 1: {
                if (arg0 == this.cfr_renamed_2) {
                    this.cfr_renamed_3 = 2;
                    return sprkpp.cfr_renamed_4;
                }
                return sprtjp.cfr_renamed_19099(arg0, 1);
            }
            case 2: {
                if (arg0 == 0) {
                    this.cfr_renamed_3 = 1;
                    return sprtjp.cfr_renamed_19099(this.cfr_renamed_2, 1);
                }
                this.cfr_renamed_4 = arg0 & 0xFF;
                this.cfr_renamed_3 = 3;
                return sprkpp.cfr_renamed_4;
            }
            case 3: {
                this.cfr_renamed_3 = 1;
                return sprtjp.cfr_renamed_19099(arg0, this.cfr_renamed_4);
            }
        }
        return sprkpp.cfr_renamed_4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public static byte[] cfr_renamed_496(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            int n;
            sprtjp sprtjp2 = new sprtjp();
            int n2 = n = 0;
            while (n2 < arg0.length) {
                byte[] byArray = sprtjp2.cfr_renamed_19100(arg0[n]);
                if (byArray.length > 0) {
                    sprpdja2.cfr_renamed_4924(byArray, 0, byArray.length);
                }
                n2 = ++n;
            }
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @sprtea
    public static byte[] cfr_renamed_485(byte[] arg0) {
        byte by;
        int[] nArray = new int[256];
        byte by2 = by = 0;
        while (by2 < arg0.length) {
            int n = arg0[by] & 0xFF;
            nArray[n] = nArray[n] + 1;
            by2 = ++by;
        }
        by = (byte)sprtjp.cfr_renamed_19098(nArray);
        sprpdja sprpdja2 = new sprpdja();
        try {
            int n;
            sprpdja2.cfr_renamed_11594(by);
            int n2 = n = 0;
            while (n2 < arg0.length) {
                int n3;
                byte by3 = 1;
                int n4 = n;
                while (n4 + (by3 & 0xFF) < arg0.length && arg0[n + (by3 & 0xFF)] == arg0[n] && (by3 & 0xFF) < 255) {
                    by3 = (byte)(by3 + 1);
                    n4 = n;
                }
                if ((by3 & 0xFF) > 3) {
                    int n5 = n;
                    n3 = n5;
                    sprpdja sprpdja3 = sprpdja2;
                    sprpdja3.cfr_renamed_11594(by);
                    sprpdja3.cfr_renamed_11594(by3);
                    sprpdja2.cfr_renamed_11594(arg0[n5]);
                } else {
                    by3 = 1;
                    sprpdja2.cfr_renamed_11594(arg0[n]);
                    if (arg0[n] == by) {
                        sprpdja2.cfr_renamed_11594((byte)0);
                    }
                    n3 = n;
                }
                n2 = n3 + (by3 & 0xFF);
            }
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }
}

