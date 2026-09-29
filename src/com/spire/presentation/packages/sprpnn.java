/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnas;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxmf;

@sprtea
public final class sprpnn {
    public static final int cfr_renamed_0 = 4;
    @sprtea
    public static final int cfr_renamed_1 = 2;
    @sprtea
    public static final int cfr_renamed_2 = 1;
    @sprtea
    public static final int cfr_renamed_3 = 0;
    @sprtea
    public static final int cfr_renamed_4 = 0;

    @sprtea
    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 0;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprnas.cfr_renamed_9("~J]JGJ]@tWRU[@^@@\u0005O\u0005w@UDFIG");
            }
            case 1: {
                return sprxmf.cfr_renamed_9("@zczyzcpN}lglvyp\u007ff");
            }
            case 2: {
                return "Characters";
            }
        }
        return sprnas.cfr_renamed_9("fKXK\\R]\u0005pIFVG@AiVSVI\u0013SRIF@\u001d");
    }

    @sprtea
    public static int cfr_renamed_5644(String arg0) {
        if (sprxmf.cfr_renamed_9("Xb{bab{hR\u007ft}}hxhf").equals(arg0)) {
            return 0;
        }
        if (sprnas.cfr_renamed_9("h\\K\\Q\\KVf[DADPQVW@").equals(arg0)) {
            return 1;
        }
        if ("Characters".equals(arg0)) {
            return 2;
        }
        if ("Default".equals(arg0)) {
            return 0;
        }
        throw new IllegalArgumentException(sprxmf.cfr_renamed_9("X{f{bbc5Nyxfyp\u007fYhchy-{lxh;"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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
    @sprtea
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprnas.cfr_renamed_9("~J]JGJ]@tWRU[@^@@\u0005O\u0005w@UDFIG");
            }
            case 1: {
                return sprxmf.cfr_renamed_9("@zczyzcpN}lglvyp\u007ff");
            }
            case 2: {
                return "Characters";
            }
        }
        return sprnas.cfr_renamed_9("fKXK\\R]\u0005pIFVG@AiVSVI\u0013SRIF@\u001d");
    }

    private /* synthetic */ sprpnn() {
    }
}

