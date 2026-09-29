/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprivo;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public class sprluo {
    public static boolean cfr_renamed_17069(int arg0, sprfzo arg1) {
        return arg1.cfr_renamed_17085(arg0);
    }

    public static boolean cfr_renamed_17086(String arg0, sprfzo arg1) {
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            if (!sprluo.cfr_renamed_17068((Integer)iterator.next(), arg1)) continue;
            return true;
        }
        return false;
    }

    public static boolean cfr_renamed_17068(int arg0, sprfzo arg1) {
        if (arg1 == null) {
            return false;
        }
        sprivo sprivo2 = arg1.cfr_renamed_13027().cfr_renamed_576(arg0);
        if (sprivo2 == null) {
            return true;
        }
        if (arg1.cfr_renamed_13027().cfr_renamed_15092() == null) {
            return false;
        }
        return sprivo2.cfr_renamed_13076() == arg1.cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_13076();
    }
}

