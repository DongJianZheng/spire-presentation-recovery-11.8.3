/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprmaaa;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprmvo {
    public static void cfr_renamed_17418(long arg0, spreen arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            long l = arg0;
            arg1.cfr_renamed_11594((byte)(l & 0xFFFFFFFFL));
            arg0 = (l & 0xFFFFFFFFL) >> 8;
            n2 = ++n;
        }
    }

    private /* synthetic */ sprmvo() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_12452(spreen arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprfvd.cfr_renamed_9("1|!]6|'o/"));
        }
        byte[] byArray = new byte[(int)arg0.cfr_renamed_806()];
        sprpdja sprpdja2 = new sprpdja(byArray);
        try {
            arg0.cfr_renamed_11548(0L);
            sprmvo.cfr_renamed_12186(arg0, sprpdja2);
            byte[] byArray2 = byArray;
            return byArray2;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    public static void cfr_renamed_17419(spreen arg0, int arg1) {
        spreen spreen2 = arg0;
        int n = spryxp.cfr_renamed_17420(spreen2.cfr_renamed_3274(), arg1);
        if (spreen2.cfr_renamed_806() < (long)n) {
            arg0.cfr_renamed_11561(n);
        }
        arg0.cfr_renamed_11548(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] cfr_renamed_17421(spreen arg0, int arg1) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            sprpdja sprpdja3;
            block6: {
                int n;
                byte[] byArray = new byte[arg1];
                int n2 = n = 0;
                while (n2 < arg1) {
                    int n3 = arg0.cfr_renamed_11556(byArray, 0, byArray.length);
                    n += n3;
                    if (n3 <= 0) {
                        sprpdja3 = sprpdja2;
                        break block6;
                    }
                    sprpdja2.cfr_renamed_4924(byArray, 0, n3);
                    n2 = n;
                }
                sprpdja3 = sprpdja2;
            }
            byte[] byArray = sprpdja3.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    public static byte[] cfr_renamed_17422(spreen arg0, int arg1) {
        spreen spreen2 = arg0;
        long l = spreen2.cfr_renamed_3274();
        byte[] byArray = new byte[arg1];
        spreen2.cfr_renamed_11556(byArray, 0, byArray.length);
        arg0.cfr_renamed_11548(l);
        return byArray;
    }

    public static void cfr_renamed_17423(String arg0, spreen arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length()) {
            arg1.cfr_renamed_11594((byte)arg0.charAt(n++));
            n2 = n;
        }
    }

    public static boolean cfr_renamed_17424(sprujo arg0, int arg1) {
        return (long)arg1 <= arg0.cfr_renamed_14060().cfr_renamed_806() - arg0.cfr_renamed_14060().cfr_renamed_3274();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_17425(String arg0, spreen arg1) {
        sprgfja sprgfja2 = sprbhja.cfr_renamed_11773(arg0);
        try {
            sprmvo.cfr_renamed_12186(sprgfja2, arg1);
            if (sprgfja2 == null) return;
            sprgfja2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (sprgfja2 == null) throw throwable;
            sprgfja2.cfr_renamed_2637();
            throw throwable;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        char c = '\u0001';
        while (n4 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ c);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static sprpdja cfr_renamed_17139(spreen arg0) {
        sprpdja sprpdja2;
        if (arg0 instanceof sprpdja) {
            return (sprpdja)arg0;
        }
        sprpdja sprpdja3 = sprpdja2 = new sprpdja((int)arg0.cfr_renamed_806());
        sprmvo.cfr_renamed_12186(arg0, sprpdja3);
        return sprpdja3;
    }

    public static void cfr_renamed_12186(spreen arg0, spreen arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprmaaa.cfr_renamed_9("v\u0003f\"q\u0003`\u0010h"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprfvd.cfr_renamed_9("&}6]6|'o/"));
        }
        byte[] byArray = new byte[4096];
        spreen spreen2 = arg0;
        int n;
        while ((n = spreen2.cfr_renamed_11556(byArray, 0, byArray.length)) > 0) {
            arg1.cfr_renamed_4924(byArray, 0, n);
            spreen2 = arg0;
        }
        return;
    }

    public static void cfr_renamed_16697(sprpdja arg0) {
        arg0.dispose();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_17426(String arg0) {
        sprgfja sprgfja2 = sprbhja.cfr_renamed_11773(arg0);
        try {
            byte[] byArray = sprmvo.cfr_renamed_12452(sprgfja2);
            return byArray;
        }
        finally {
            if (sprgfja2 != null) {
                sprgfja2.cfr_renamed_2637();
            }
        }
    }
}

