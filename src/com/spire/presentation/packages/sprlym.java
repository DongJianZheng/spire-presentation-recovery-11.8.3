/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpoy;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprugg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprlym {
    public static final int cfr_renamed_2 = 2;
    public static final short cfr_renamed_3 = 8;
    public static final short cfr_renamed_4 = 2048;

    public static String cfr_renamed_12194(short arg0) {
        if (8 == arg0) {
            return sprpoy.cfr_renamed_9("AxhtSwft`Uses");
        }
        if (2048 == arg0) {
            return "Unicode";
        }
        return sprugg.cfr_renamed_9("Ikwksrr%[`r`ndpUiwljo`^lhCpd{v<s}ii`2");
    }

    public static Set<String> cfr_renamed_12195(short arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((8 & arg0) == 8) {
            hashSet.add(sprpoy.cfr_renamed_9("AxhtSwft`Uses"));
        }
        if ((0x800 & arg0) == 2048) {
            hashSet.add("Unicode");
        }
        return hashSet;
    }

    public static short[] cfr_renamed_205() {
        short[] sArray = new short[2];
        sArray[0] = 8;
        sArray[1] = 2048;
        return sArray;
    }

    public static short cfr_renamed_5644(String arg0) {
        if (sprugg.cfr_renamed_9("Olf`]ch`nA}q}").equals(arg0)) {
            return 8;
        }
        if ("Unicode".equals(arg0)) {
            return 2048;
        }
        throw new IllegalArgumentException(sprpoy.cfr_renamed_9("D|z|~e\u007f2Vw\u007fwcs}Bd`a}bwS{eT}sva1|p\u007ft<"));
    }

    public static short cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        short s = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            s = (short)(s | sprlym.cfr_renamed_5644(string));
            iterator2 = iterator;
        }
        return s;
    }

    private /* synthetic */ sprlym() {
    }

    public static String cfr_renamed_12196(short arg0) {
        if (8 == arg0) {
            return sprugg.cfr_renamed_9("Olf`]ch`nA}q}");
        }
        if (2048 == arg0) {
            return "Unicode";
        }
        return sprpoy.cfr_renamed_9("G\u007fy\u007f}f|1Ut|t`p~Agcb~atPxfW~pub2gs}gt<");
    }
}

