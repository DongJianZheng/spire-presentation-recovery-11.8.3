/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class spreto {
    private static final short cfr_renamed_91 = 176;
    private static final short cfr_renamed_0 = 183;
    private static final short cfr_renamed_1 = 65;
    private static final short cfr_renamed_2 = 64;
    private static final short cfr_renamed_3 = 191;
    private static final short cfr_renamed_4 = 184;

    @sprtea
    public static sprtvp cfr_renamed_18314(sprmzo arg0) {
        sprtvp sprtvp2 = sprtvp.cfr_renamed_14846();
        while (arg0.cfr_renamed_14060().cfr_renamed_3274() < arg0.cfr_renamed_14060().cfr_renamed_806()) {
            int n;
            int n2;
            boolean bl;
            short s = (short)(arg0.cfr_renamed_12137() & 0xFF);
            if (s == 64) {
                bl = false;
                n2 = arg0.cfr_renamed_12137() & 0xFF;
            } else if (s == 65) {
                bl = true;
                n2 = arg0.cfr_renamed_12137() & 0xFF;
            } else if (s >= 176 && s <= 183) {
                bl = false;
                n2 = s - 176 + 1;
            } else if (s >= 184 && s <= 191) {
                bl = true;
                n2 = s - 184 + 1;
            } else {
                arg0.cfr_renamed_14060().cfr_renamed_11548(arg0.cfr_renamed_14060().cfr_renamed_3274() - 1L);
                return sprtvp2;
            }
            int n3 = n = 0;
            while (n3 < n2) {
                sprmzo sprmzo2 = arg0;
                sprtvp2.cfr_renamed_12819(bl ? sprmzo2.cfr_renamed_12254() : sprmzo2.cfr_renamed_12137() & 0xFF);
                n3 = ++n;
            }
        }
        return sprtvp2;
    }

    private static /* synthetic */ void cfr_renamed_18315(sprruo sprruo2, int n) {
        sprruo arg0;
        sprruo sprruo3 = arg0;
        sprruo3.cfr_renamed_11594((byte)65);
        sprruo3.cfr_renamed_11594((byte)n);
    }

    public static void cfr_renamed_18316(sprruo arg0, short[] arg1) {
        int n = 0;
        while (n < arg1.length) {
            int n2;
            int n3 = sprrgga.cfr_renamed_12461(255, arg1.length - n);
            spreto.cfr_renamed_18315(arg0, n3);
            int n4 = n2 = 0;
            while (n4 < n3) {
                arg0.cfr_renamed_15085(arg1[n]);
                ++n;
                n4 = ++n2;
            }
        }
    }
}

