/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawja;
import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprkgp;
import com.spire.presentation.packages.sprkw;
import com.spire.presentation.packages.sprncn;
import com.spire.presentation.packages.sprniaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrdn;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.spryql;

@sprtea
public class sprdym {
    private static sprkw cfr_renamed_2;
    public static sprszca cfr_renamed_3;
    public static sprszca cfr_renamed_4;

    @sprtea
    public static String cfr_renamed_11895(byte[] arg0, sprszca arg1) {
        return arg1.cfr_renamed_11595(arg0, 0, arg0.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public static sprgtja cfr_renamed_11892(int arg0) throws sprrdn {
        boolean bl;
        if (arg0 == 65535) return new sprgtja(1995, 1, 1, 0, 0, 0, 0);
        if (arg0 == 0) {
            return new sprgtja(1995, 1, 1, 0, 0, 0, 0);
        }
        short s = (short)(arg0 & 0xFFFF);
        short s2 = (short)(((long)arg0 & 0xFFFF0000L) >> 16);
        int n = 1980 + ((s2 & 0xFE00) >> 9);
        int n2 = (s2 & 0x1E0) >> 5;
        int n3 = s2 & 0x1F;
        int n4 = (s & 0xF800) >> 11;
        int n5 = (s & 0x7E0) >> 5;
        int n6 = (s & 0x1F) * 2;
        if (n6 >= 60) {
            n6 = 0;
            ++n5;
        }
        if (n5 >= 60) {
            n5 = 0;
            ++n4;
        }
        if (n4 >= 24) {
            n4 = 0;
            ++n3;
        }
        sprgtja sprgtja2 = sprgtja.cfr_renamed_11979();
        boolean bl2 = false;
        try {
            return new sprgtja(n, n2, n3, n4, n5, n6, 0);
        }
        catch (sprawja sprawja2) {
            if (n == 1980 && n2 == 0 && n3 == 0) {
                try {
                    return new sprgtja(1980, 1, 1, n4, n5, n6, 0);
                }
                catch (sprawja sprawja3) {
                    try {
                        return new sprgtja(1980, 1, 1, 0, 0, 0, 0);
                    }
                    catch (sprawja sprawja4) {}
                }
            } else {
                try {
                    int n7 = n;
                    while (n7 < 1980) {
                        n7 = ++n;
                    }
                    int n8 = n;
                    while (n8 > 2030) {
                        n8 = --n;
                    }
                    int n9 = n2;
                    while (n9 < 1) {
                        n9 = ++n2;
                    }
                    int n10 = n2;
                    while (n10 > 12) {
                        n10 = --n2;
                    }
                    int n11 = n3;
                    while (n11 < 1) {
                        n11 = ++n3;
                    }
                    int n12 = n3;
                    while (n12 > 28) {
                        n12 = --n3;
                    }
                    int n13 = n5;
                    while (n13 < 0) {
                        n13 = ++n5;
                    }
                    int n14 = n5;
                    while (n14 > 59) {
                        n14 = --n5;
                    }
                    int n15 = n6;
                    while (n15 < 0) {
                        n15 = ++n6;
                    }
                    int n16 = n6;
                    while (n16 > 59) {
                        n16 = --n6;
                    }
                    return new sprgtja(n, n2, n3, n4, n5, n6, 0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
            bl = bl2;
        }
        if (bl) return sprgtja2;
        Object[] objectArray = new Object[6];
        objectArray[0] = n;
        objectArray[1] = n2;
        objectArray[2] = n3;
        objectArray[3] = n4;
        objectArray[4] = n5;
        objectArray[5] = n6;
        String string = sprraia.cfr_renamed_11562(sprniaa.cfr_renamed_9("d\u0003f\u001b`\u0002=F5P,V4\u000by\u0003f\u0019`\u0002=C5P.V4\u000bp\u0003f\u001f`\u0002=X5P(V4"), objectArray);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = string;
        throw new sprrdn(sprraia.cfr_renamed_11562(spryql.cfr_renamed_9("`\u0011FPF\u0011V\u0015\r\u0004K\u001dGPD\u001fP\u001dC\u0004\u0002\u0019LPV\u0018GPX\u0019RPD\u0019N\u0015\fP\n\u000b\u0012\r\u000b"), objectArray2));
    }

    @sprtea
    public static String cfr_renamed_11966(String arg0) {
        if (arg0.startsWith(sprniaa.cfr_renamed_9("\u00052"))) {
            arg0 = arg0.substring(2);
        }
        arg0 = arg0.replace(spryql.cfr_renamed_9("\r^\r"), "/");
        arg0 = new sprruha(sprniaa.cfr_renamed_9("C\u00033\u00012\u0002\u007f\u00145pC\u0004Aw3v6\u0004Aw3wA\u00052\u00025\u00056\u00029")).cfr_renamed_12004(arg0, spryql.cfr_renamed_9("T\u0013T\u0011"));
        return arg0;
    }

    private /* synthetic */ sprdym() {
    }

    @sprtea
    public static int cfr_renamed_12005(int arg0) {
        byte[] byArray = new byte[arg0];
        cfr_renamed_2.cfr_renamed_1354(byArray);
        return sprrgga.cfr_renamed_6433(sprtzja.cfr_renamed_11604(byArray, 0)) % arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public static int cfr_renamed_11920(spreen arg0, byte[] arg1, int arg2, int arg3, String arg4) throws Exception {
        int n = 0;
        boolean bl = false;
        boolean bl2 = false;
        return arg0.cfr_renamed_11556(arg1, arg2, arg3);
    }

    private static /* synthetic */ int cfr_renamed_12006(spreen arg0, String arg1) throws Exception {
        byte[] byArray = new byte[4];
        if (arg0.cfr_renamed_11556(byArray, 0, byArray.length) != byArray.length) {
            Object[] objectArray = new Object[1];
            objectArray[0] = arg0.cfr_renamed_3274();
            throw new sprncn(sprraia.cfr_renamed_11562(arg1, objectArray));
        }
        return (((byArray[3] & 0xFF) * 256 + (byArray[2] & 0xFF)) * 256 + (byArray[1] & 0xFF)) * 256 + (byArray[0] & 0xFF);
    }

    @sprtea
    public static sprgtja cfr_renamed_12007(sprgtja arg0) {
        return arg0;
    }

    @sprtea
    public static int cfr_renamed_11750(spreen arg0) throws Exception {
        return sprdym.cfr_renamed_12006(arg0, sprniaa.cfr_renamed_9("hr^qO=Er_=YxJy\u000b\u007fGrHv\u000b0\u000bsD=O|_|\n=\u000b5[rXt_tDs\u000b-Sf\u001b's%V4"));
    }

    @sprtea
    public static long cfr_renamed_11754(spreen arg0, int arg1) throws Exception {
        boolean bl;
        long l;
        block4: {
            int n;
            l = arg0.cfr_renamed_3274();
            int n2 = 65536;
            byte[] byArray = new byte[]{(byte)(arg1 >> 24), (byte)((arg1 & 0xFF0000) >> 16), (byte)((arg1 & 0xFF00) >> 8), (byte)(arg1 & 0xFF)};
            byte[] byArray2 = new byte[n2];
            boolean bl2 = false;
            while ((n = arg0.cfr_renamed_11556(byArray2, 0, byArray2.length)) != 0) {
                int n3;
                int n4 = n3 = 0;
                while (n4 < n) {
                    if (byArray2[n3] == byArray[3]) {
                        spreen spreen2 = arg0;
                        long l2 = spreen2.cfr_renamed_3274();
                        spreen2.cfr_renamed_11547(n3 - n, 1);
                        boolean bl3 = bl2 = sprdym.cfr_renamed_11855(spreen2) == arg1;
                        if (bl2) break;
                        arg0.cfr_renamed_11547(l2, 0);
                    }
                    n4 = ++n3;
                }
                if (!bl2) continue;
                bl = bl2;
                break block4;
            }
            bl = bl2;
        }
        if (!bl) {
            arg0.cfr_renamed_11547(l, 0);
            return -1L;
        }
        long l3 = arg0.cfr_renamed_3274() - l - 4L;
        return l3;
    }

    @sprtea
    public static int cfr_renamed_11855(spreen arg0) throws Exception {
        int n = 0;
        n = sprdym.cfr_renamed_12006(arg0, spryql.cfr_renamed_9("L\u0005N"));
        return n;
    }

    @sprtea
    public static sprgtja cfr_renamed_11969(sprgtja arg0) {
        return arg0;
    }

    @sprtea
    public static String cfr_renamed_11837(String arg0) {
        if (arg0.startsWith(sprniaa.cfr_renamed_9("\u0005A"))) {
            arg0 = arg0.substring(2);
        }
        arg0 = arg0.replace(spryql.cfr_renamed_9("~^~"), "\\");
        arg0 = new sprruha(sprniaa.cfr_renamed_9("C\u00033\u0001Aw4\u00145pCwAw3v6wAw3w3wA\u00025\u00056\u00029")).cfr_renamed_12004(arg0, spryql.cfr_renamed_9("T\u0013T\u0011"));
        return arg0;
    }

    @sprtea
    public static int cfr_renamed_11958(sprgtja arg0) {
        arg0 = arg0.cfr_renamed_11925();
        sprgtja sprgtja2 = arg0 = sprdym.cfr_renamed_12007(arg0);
        int n = (arg0.cfr_renamed_12008() & 0x1F | arg0.cfr_renamed_12009() << 5 & 0x1E0 | sprgtja2.cfr_renamed_12010() - 1980 << 9 & 0xFE00) & 0xFFFF;
        int n2 = (sprgtja2.cfr_renamed_12011() / 2 & 0x1F | arg0.cfr_renamed_12012() << 5 & 0x7E0 | arg0.cfr_renamed_12013() << 11 & 0xF800) & 0xFFFF;
        return (int)((long)((n & 0xFFFF) << 16) | (long)(n2 & 0xFFFF));
    }

    @sprtea
    public static String cfr_renamed_11894(byte[] arg0) {
        return sprdym.cfr_renamed_11895(arg0, cfr_renamed_3);
    }

    private static /* synthetic */ String cfr_renamed_12014(int arg0, int arg1) {
        int n;
        boolean bl = arg1 == 0;
        String string = "";
        char[] cArray = new char[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            if (bl) {
                arg1 = sprdym.cfr_renamed_12005(2) == 0 ? 65 : 97;
            }
            cArray[n++] = sprdym.cfr_renamed_12015(arg1);
            n2 = n;
        }
        string = new String(cArray);
        return string;
    }

    public static String cfr_renamed_11702() {
        String string;
        while (sprbhja.cfr_renamed_11642(string = new StringBuilder().insert(0, sprniaa.cfr_renamed_9("or_SNiqt[0")).append(sprdym.cfr_renamed_12014(8, 97)).append(spryql.cfr_renamed_9("^V\u001dR")).toString())) {
        }
        return string;
    }

    private static /* synthetic */ char cfr_renamed_12015(int arg0) {
        return (char)(sprdym.cfr_renamed_12005(26) + arg0);
    }

    public static String cfr_renamed_11746(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return arg0;
        }
        if (arg0.length() < 2) {
            return arg0.replace('\\', '/');
        }
        return (arg0.charAt(1) == ':' && arg0.charAt(2) == '\\' ? arg0.substring(3) : arg0).replace('\\', '/');
    }

    static {
        cfr_renamed_4 = sprszca.cfr_renamed_11625(sprniaa.cfr_renamed_9("b_f)\u0018*"));
        cfr_renamed_3 = sprszca.cfr_renamed_11625("UTF-8");
        cfr_renamed_2 = sprkgp.cfr_renamed_12016(3);
    }

    @sprtea
    public static byte[] cfr_renamed_12017(String arg0, sprszca arg1) {
        return arg1.cfr_renamed_11606(arg0);
    }

    @sprtea
    public static byte[] cfr_renamed_11987(String arg0) {
        return sprdym.cfr_renamed_12017(arg0, cfr_renamed_4);
    }
}

