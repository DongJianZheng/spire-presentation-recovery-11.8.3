/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczm;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmt;
import com.spire.presentation.packages.sprzkl;
import com.spire.presentation.packages.sprzyo;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

public class spruan {
    public static final Hashtable cfr_renamed_1;
    public static final Hashtable cfr_renamed_2;
    public static final Hashtable cfr_renamed_3;
    public static sprzkl cfr_renamed_4;

    public static sprzkl cfr_renamed_7814(sprlem arg0) {
        return (sprzkl)cfr_renamed_1.get(arg0);
    }

    static {
        cfr_renamed_4 = new sprczm();
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_1 = new Hashtable();
        cfr_renamed_3 = new Hashtable();
        spruan.cfr_renamed_11117(sprzyo.cfr_renamed_9("h\u001d~}\u001byX~"), sprmt.cfr_renamed_4, cfr_renamed_4);
    }

    public static sprhfm cfr_renamed_1837(String arg0) {
        sprlem sprlem2 = spruan.cfr_renamed_2103(arg0);
        if (sprlem2 == null) {
            return null;
        }
        return spruan.cfr_renamed_7994(sprlem2);
    }

    public static sprzkl cfr_renamed_8048(String arg0) {
        sprlem sprlem2 = spruan.cfr_renamed_2103(arg0);
        if (sprlem2 == null) {
            return null;
        }
        return spruan.cfr_renamed_7814(sprlem2);
    }

    public static /* synthetic */ sprgxh cfr_renamed_11118(sprgxh arg0) {
        return arg0;
    }

    public static String cfr_renamed_7555(sprlem arg0) {
        return (String)cfr_renamed_3.get(arg0);
    }

    public static /* synthetic */ sprfim cfr_renamed_11119(sprgxh arg0, String arg1) {
        return spruan.cfr_renamed_10462(arg0, arg1);
    }

    public static /* synthetic */ BigInteger cfr_renamed_2408(String arg0) {
        return spruan.cfr_renamed_4592(arg0);
    }

    public static sprhfm cfr_renamed_7994(sprlem arg0) {
        sprzkl sprzkl2 = spruan.cfr_renamed_7814(arg0);
        if (sprzkl2 == null) {
            return null;
        }
        return sprzkl2.cfr_renamed_284();
    }

    private static /* synthetic */ sprfim cfr_renamed_10462(sprgxh arg0, String arg1) {
        sprfim sprfim2 = new sprfim(arg0, sprfqe.cfr_renamed_5217(arg1));
        sprdvh.cfr_renamed_8641(sprfim2.cfr_renamed_2322());
        return sprfim2;
    }

    public static void cfr_renamed_11117(String arg0, sprlem arg1, sprzkl arg2) {
        cfr_renamed_2.put(sprkoe.cfr_renamed_425(arg0), arg1);
        cfr_renamed_3.put(arg1, arg0);
        cfr_renamed_1.put(arg1, arg2);
    }

    public static Enumeration cfr_renamed_289() {
        return cfr_renamed_3.elements();
    }

    private static /* synthetic */ BigInteger cfr_renamed_4592(String arg0) {
        return new BigInteger(1, sprfqe.cfr_renamed_5217(arg0));
    }

    public static sprlem cfr_renamed_2103(String arg0) {
        return (sprlem)cfr_renamed_2.get(sprkoe.cfr_renamed_425(arg0));
    }
}

