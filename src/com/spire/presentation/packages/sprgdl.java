/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spregl;
import com.spire.presentation.packages.sprfal;
import com.spire.presentation.packages.sprjlk;
import com.spire.presentation.packages.sprknk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruml;

public class sprgdl
extends spregl {
    private static /* synthetic */ boolean cfr_renamed_10430(byte arg0, int arg1) {
        return (arg0 & 1 << arg1) != 0;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprtpk sprtpk2;
        sprbj sprbj2;
        if (arg1 instanceof sprbgk) {
            sprbj2 = (sprbgk)arg1;
            arg1 = ((sprbgk)sprbj2).cfr_renamed_284();
        }
        sprbj2 = (sprknk)arg1;
        byte[] byArray = null;
        if (((sprknk)sprbj2).cfr_renamed_284() instanceof sprjlk) {
            sprtpk2 = (sprtpk)((sprjlk)((sprknk)sprbj2).cfr_renamed_284()).cfr_renamed_284();
            byArray = ((sprjlk)((sprknk)sprbj2).cfr_renamed_284()).cfr_renamed_3345();
        } else {
            sprtpk2 = (sprtpk)((sprknk)sprbj2).cfr_renamed_284();
        }
        sprtpk2 = new sprtpk(sprgdl.cfr_renamed_10431(sprtpk2.cfr_renamed_1521(), ((sprknk)sprbj2).cfr_renamed_9207(), byArray));
        if (byArray != null) {
            super.cfr_renamed_5535(arg0, new sprknk(new sprjlk(sprtpk2, byArray), ((sprknk)sprbj2).cfr_renamed_9207()));
            return;
        }
        super.cfr_renamed_5535(arg0, new sprknk(sprtpk2, ((sprknk)sprbj2).cfr_renamed_9207()));
    }

    private static /* synthetic */ byte[] cfr_renamed_10431(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != 8) {
            sprfal sprfal2;
            int n3;
            int n4 = 0;
            int n5 = 0;
            int n6 = n3 = 0;
            while (n6 != 8) {
                int n7 = sprpxe.cfr_renamed_439(arg0, n3 * 4);
                if (sprgdl.cfr_renamed_10430(arg1[n], n3)) {
                    n4 += n7;
                } else {
                    n5 += n7;
                }
                n6 = ++n3;
            }
            byte[] byArray = new byte[8];
            sprpxe.cfr_renamed_437(n4, byArray, 0);
            sprpxe.cfr_renamed_437(n5, byArray, 4);
            sprfal sprfal3 = sprfal2 = new sprfal(new spruml());
            sprfal3.cfr_renamed_5535(true, new sprkpk(new sprjlk(new sprtpk(arg0), arg2), byArray));
            sprfal3.cfr_renamed_3064(arg0, 0, arg0, 0);
            sprfal2.cfr_renamed_3064(arg0, 8, arg0, 8);
            sprfal2.cfr_renamed_3064(arg0, 16, arg0, 16);
            sprfal2.cfr_renamed_3064(arg0, 24, arg0, 24);
            n2 = ++n;
        }
        return arg0;
    }
}

