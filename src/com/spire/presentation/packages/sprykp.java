/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprjuy;
import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtjp;
import com.spire.presentation.packages.sprudp;
import com.spire.presentation.packages.spryyo;

@sprtea
public class sprykp {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_19139(byte[] arg0, int arg1) {
        if (arg0 == null) throw new NullPointerException("data");
        if (arg0.length == 0) {
            throw new NullPointerException("data");
        }
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            spryyo spryyo2 = new spryyo(sprpdja2, true);
            boolean bl = false;
            if (arg1 == 0) {
                bl = spryyo2.cfr_renamed_17445();
            }
            spryyo spryyo3 = spryyo2;
            byte[] byArray = sprykp.cfr_renamed_19140(spryyo3, (int)spryyo3.cfr_renamed_17444(24));
            if (bl) {
                byte[] byArray2 = sprtjp.cfr_renamed_496(byArray);
                return byArray2;
            }
            byte[] byArray3 = byArray;
            return byArray3;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    @sprtea
    public static byte[] cfr_renamed_19092(byte[] arg0) {
        return sprykp.cfr_renamed_19139(arg0, 0);
    }

    private static /* synthetic */ int cfr_renamed_19141(sprudp arg0, int arg1) {
        int n;
        int n2 = (arg1 - 256) / 8 + 1;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = arg0.cfr_renamed_19127().cfr_renamed_19142();
            n3 <<= 3;
            n3 += n5;
            n4 = ++n;
        }
        return ++n3;
    }

    private static /* synthetic */ int cfr_renamed_19143(sprudp arg0, int arg1) {
        int n;
        int n2 = 4;
        int n3 = 3;
        int n4 = (arg1 - 256) % 8;
        int n5 = n = 0;
        while (true) {
            n = n5 << 2;
            n += n4 & n3;
            if ((n4 & n2) == 0) break;
            n4 = arg0.cfr_renamed_19129().cfr_renamed_19142();
            n5 = n;
        }
        return n += 2;
    }

    private static /* synthetic */ byte[] cfr_renamed_19144(sprudp arg0, spreen arg1, int arg2, int arg3) {
        long l;
        if (arg1.cfr_renamed_3274() - (long)arg2 < -7168L) {
            throw new IllegalStateException(sprrvy.cfr_renamed_9("[|ds~{v2q}bk2{fw\u007f2}ttawf<"));
        }
        if (arg3 > arg2) {
            throw new IllegalStateException(sprjuy.cfr_renamed_9("\u0016k)d3l;%<j/|\u007fl+`2%3`1b+mq"));
        }
        byte[] byArray = new byte[arg3];
        long l2 = arg1.cfr_renamed_3274() - (long)arg2;
        if (l2 < 0L) {
            l = 7168L + l2;
            long l3 = sprrgga.cfr_renamed_19145(7168L - l, arg3);
            System.arraycopy(arg0.cfr_renamed_19101(), (int)l, byArray, 0, (int)l3);
        }
        if (l2 + (long)arg3 > 0L) {
            l = sprrgga.cfr_renamed_11753(0L, l2);
            int n = (int)(l2 + (long)arg3 - l);
            System.arraycopy(sprykp.cfr_renamed_19146(arg1, l, n), 0, byArray, arg3 - n, n);
        }
        return byArray;
    }

    private static /* synthetic */ byte[] cfr_renamed_19146(spreen arg0, long arg1, int arg2) {
        spreen spreen2 = arg0;
        long l = spreen2.cfr_renamed_3274();
        byte[] byArray = new byte[arg2];
        spreen2.cfr_renamed_11548(arg1);
        spreen2.cfr_renamed_11556(byArray, 0, arg2);
        arg0.cfr_renamed_11548(l);
        return byArray;
    }

    private static /* synthetic */ byte cfr_renamed_19147(sprudp arg0, spreen arg1, int arg2) {
        return sprykp.cfr_renamed_19144(arg0, arg1, arg2, 1)[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ byte[] cfr_renamed_19140(spryyo arg0, int arg1) {
        if (arg1 == 0) {
            return sprkpp.cfr_renamed_4;
        }
        sprpdja sprpdja2 = new sprpdja(arg1);
        try {
            sprudp sprudp2 = new sprudp(arg1, arg0);
            while (sprpdja2.cfr_renamed_3274() < (long)arg1) {
                int n;
                int n2 = sprudp2.cfr_renamed_19112().cfr_renamed_19142();
                if (n2 < 256) {
                    sprpdja2.cfr_renamed_11594((byte)n2);
                    continue;
                }
                if (n2 == sprudp2.cfr_renamed_19120()) {
                    sprpdja sprpdja3 = sprpdja2;
                    n = sprykp.cfr_renamed_19147(sprudp2, sprpdja3, 2);
                    sprpdja3.cfr_renamed_11594((byte)n);
                    continue;
                }
                if (n2 == sprudp2.cfr_renamed_19125()) {
                    sprpdja sprpdja4 = sprpdja2;
                    n = sprykp.cfr_renamed_19147(sprudp2, sprpdja4, 4);
                    sprpdja4.cfr_renamed_11594((byte)n);
                    continue;
                }
                if (n2 == sprudp2.cfr_renamed_19126()) {
                    sprpdja sprpdja5 = sprpdja2;
                    byte by = sprykp.cfr_renamed_19147(sprudp2, sprpdja5, 6);
                    n = by;
                    sprpdja5.cfr_renamed_11594(by);
                    continue;
                }
                sprudp sprudp3 = sprudp2;
                n = sprykp.cfr_renamed_19143(sprudp3, n2);
                int n3 = sprykp.cfr_renamed_19141(sprudp3, n2);
                if (n3 >= 512) {
                    ++n;
                }
                byte[] byArray = sprykp.cfr_renamed_19144(sprudp2, sprpdja2, n3 + n - 1, n);
                sprpdja2.cfr_renamed_4924(byArray, 0, byArray.length);
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

