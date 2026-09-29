/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqy;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprupn {
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return spraqy.cfr_renamed_9("w<W6");
            }
            case 1: {
                return sprlxg.cfr_renamed_9("\u0015T+T/M.");
            }
            case 2: {
                return spraqy.cfr_renamed_9("\u001eP=P>L>");
            }
            case 3: {
                return sprlxg.cfr_renamed_9("|5V,");
            }
        }
        return spraqy.cfr_renamed_9("\u0006W8W<N=\u0019\u0000Z!P#M\u0000Q2I:W4u6O6UsO2U&\\}");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprlxg.cfr_renamed_9("t/T%");
            }
            case 1: {
                return spraqy.cfr_renamed_9("\u0006W8W<N=");
            }
            case 2: {
                return sprlxg.cfr_renamed_9("\rS.S-O-");
            }
            case 3: {
                return spraqy.cfr_renamed_9("\u007f&U?");
            }
        }
        return sprlxg.cfr_renamed_9("\u0015T+T/M.\u001a\u0013Y2S0N\u0013R!J)T'v%L%V`L!V5_n");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 2 << 1;
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = 5 << 3 ^ 1;
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

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }

    private /* synthetic */ sprupn() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (spraqy.cfr_renamed_9("w<W6").equals(arg0)) {
            return 0;
        }
        if (sprlxg.cfr_renamed_9("\u0015T+T/M.").equals(arg0)) {
            return 1;
        }
        if (spraqy.cfr_renamed_9("\u001eP=P>L>").equals(arg0)) {
            return 2;
        }
        if (sprlxg.cfr_renamed_9("|5V,").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(spraqy.cfr_renamed_9("l=R=V$Wsj0K:I'j;X#P=^\u001f\\%\\?\u0019=X>\\}"));
    }
}

