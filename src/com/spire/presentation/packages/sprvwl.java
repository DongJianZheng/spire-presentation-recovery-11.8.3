/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprbsl;
import com.spire.presentation.packages.sprbyl;
import com.spire.presentation.packages.sprcmm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgkm;
import com.spire.presentation.packages.sprgtl;
import com.spire.presentation.packages.sprgyl;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjkm;
import com.spire.presentation.packages.sprjz;
import com.spire.presentation.packages.sprksl;
import com.spire.presentation.packages.sprlq;
import com.spire.presentation.packages.sprlsm;
import com.spire.presentation.packages.sprnlm;
import com.spire.presentation.packages.sprtwl;
import com.spire.presentation.packages.sprytm;
import java.util.ArrayList;
import java.util.List;

public class sprvwl {
    public static sprbyl cfr_renamed_10799(spridn arg0, sprddm arg1, sprjz arg2, sprlq arg3) {
        int n;
        ArrayList<sprctl> arrayList = new ArrayList<sprctl>();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprbpm sprbpm2 = sprbpm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            sprvwl.cfr_renamed_10800(arrayList, sprbpm2, arg1, arg2, arg3);
            n2 = ++n;
        }
        return new sprbyl(arrayList);
    }

    public static sprbyl cfr_renamed_10801(spridn arg0, sprddm arg1, sprjz arg2) {
        return sprvwl.cfr_renamed_10799(arg0, arg1, arg2, null);
    }

    private static /* synthetic */ void cfr_renamed_10800(List arg0, sprbpm arg1, sprddm arg2, sprjz arg3, sprlq arg4) {
        sprco sprco2 = arg1.cfr_renamed_3365();
        if (sprco2 instanceof sprlsm) {
            arg0.add(new sprbsl((sprlsm)sprco2, arg2, arg3, arg4));
            return;
        }
        if (sprco2 instanceof sprjkm) {
            sprjkm sprjkm2 = sprjkm.cfr_renamed_23(sprco2);
            if (sprgz.cfr_renamed_96.cfr_renamed_5078(sprjkm2.cfr_renamed_324())) {
                arg0.add(new sprgyl(sprytm.cfr_renamed_23(sprjkm2.cfr_renamed_97()), arg2, arg3, arg4));
                return;
            }
        } else {
            if (sprco2 instanceof sprgkm) {
                arg0.add(new sprksl((sprgkm)sprco2, arg2, arg3, arg4));
                return;
            }
            if (sprco2 instanceof sprnlm) {
                sprgtl.cfr_renamed_10684(arg0, (sprnlm)sprco2, arg2, arg3, arg4);
                return;
            }
            if (sprco2 instanceof sprcmm) {
                arg0.add(new sprtwl((sprcmm)sprco2, arg2, arg3, arg4));
            }
        }
    }
}

