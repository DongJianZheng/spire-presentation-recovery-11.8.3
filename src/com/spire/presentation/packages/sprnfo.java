/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmro;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtza;

@sprtea
public final class sprnfo {
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 6;
    public static final int cfr_renamed_3 = -1;
    public static final int cfr_renamed_4 = 3;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = 1 << 3;
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

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprmro.cfr_renamed_9("s\u0018]8Q\u001aU\tX\b");
            }
            case 1: {
                return sprtza.cfr_renamed_9("\u001ey1x\u0005`3u2");
            }
            case 2: {
                return sprmro.cfr_renamed_9("4]\u001b\\-A\u001dX\u0015@\u0005");
            }
            case 3: {
                return sprtza.cfr_renamed_9("^9~3");
            }
            case 4: {
                return sprmro.cfr_renamed_9("|\u001dX\u001a");
            }
            case -1: {
                return sprtza.cfr_renamed_9("\u001f~ q:y2");
            }
        }
        return sprmro.cfr_renamed_9(")Z\u0017Z\u0013C\u0012\u0014;P\u0015d\u0015L\u0019X3R\u001aG\u0019@1[\u0018Q\\B\u001dX\tQR");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[6];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = -1;
        return nArray;
    }

    private /* synthetic */ sprnfo() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprtza.cfr_renamed_9("W2y\u0012u0q#|\"");
            }
            case 1: {
                return sprmro.cfr_renamed_9("4]\u001b\\/D\u0019Q\u0018");
            }
            case 2: {
                return sprtza.cfr_renamed_9("\u001ey1x\u0007e7|?d/");
            }
            case 3: {
                return sprmro.cfr_renamed_9("z\u0013Z\u0019");
            }
            case 4: {
                return sprtza.cfr_renamed_9("X7|0");
            }
            case -1: {
                return sprmro.cfr_renamed_9("5Z\nU\u0010]\u0018");
            }
        }
        return sprtza.cfr_renamed_9("\u0003~=~9g80\u0011t?@?h3|\u0019v0c3d\u001b\u007f2uvf7|#ux");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprmro.cfr_renamed_9("s\u0018]8Q\u001aU\tX\b").equals(arg0)) {
            return 0;
        }
        if (sprtza.cfr_renamed_9("\u001ey1x\u0005`3u2").equals(arg0)) {
            return 1;
        }
        if (sprmro.cfr_renamed_9("4]\u001b\\-A\u001dX\u0015@\u0005").equals(arg0)) {
            return 2;
        }
        if (sprtza.cfr_renamed_9("^9~3").equals(arg0)) {
            return 3;
        }
        if (sprmro.cfr_renamed_9("|\u001dX\u001a").equals(arg0)) {
            return 4;
        }
        if (sprtza.cfr_renamed_9("\u001f~ q:y2").equals(arg0)) {
            return -1;
        }
        throw new IllegalArgumentException(sprmro.cfr_renamed_9("a\u0012_\u0012[\u000bZ\\s\u0018],]\u0004Q\u0010{\u001aR\u000fQ\by\u0013P\u0019\u0014\u0012U\u0011QR"));
    }
}

