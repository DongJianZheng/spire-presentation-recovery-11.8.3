/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnam;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprzkl;
import com.spire.presentation.packages.sprzofa;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprynm {
    public static final Hashtable cfr_renamed_3 = new Hashtable();
    public static final Hashtable cfr_renamed_4 = new Hashtable();

    static {
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("S_$E "), sprhr.cfr_renamed_91);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("P?&\"+"), sprhr.cfr_renamed_1260);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("S_#J\""), sprhr.cfr_renamed_107);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("P? !!"), sprhr.cfr_renamed_805);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("S_ D\""), sprhr.cfr_renamed_112);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("Y?'%#"), sprhr.cfr_renamed_2);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("Z_%B("), sprhr.cfr_renamed_82);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("Y? *!"), sprhr.cfr_renamed_724);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("Z_#A\""), sprhr.cfr_renamed_953);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("Y?#$!"), sprhr.cfr_renamed_728);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("A_$@ "), sprhr.cfr_renamed_128);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("B?!*&"), sprhr.spr\ufe34);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("A_#G'"), sprhr.cfr_renamed_1);
        sprynm.cfr_renamed_11205(sprrvy.cfr_renamed_9("B?  &"), sprhr.cfr_renamed_957);
        sprynm.cfr_renamed_11205(sprzofa.cfr_renamed_9("A_ K#"), sprhr.cfr_renamed_88);
    }

    public static void cfr_renamed_11205(String arg0, sprlem arg1) {
        cfr_renamed_3.put(arg0, arg1);
        cfr_renamed_4.put(arg1, arg0);
    }

    public static Enumeration cfr_renamed_289() {
        return cfr_renamed_3.keys();
    }

    public static sprhfm cfr_renamed_7994(sprlem arg0) {
        if (cfr_renamed_4.containsKey(arg0)) {
            return sprnam.cfr_renamed_7994(arg0);
        }
        return null;
    }

    public static sprzkl cfr_renamed_7814(sprlem arg0) {
        if (cfr_renamed_4.containsKey(arg0)) {
            return sprnam.cfr_renamed_7814(arg0);
        }
        return null;
    }

    public static sprlem cfr_renamed_2103(String arg0) {
        return (sprlem)cfr_renamed_3.get(sprkoe.cfr_renamed_116(arg0));
    }

    public static sprhfm cfr_renamed_1837(String arg0) {
        sprlem sprlem2 = sprynm.cfr_renamed_2103(arg0);
        if (null != sprlem2) {
            return sprnam.cfr_renamed_7994(sprlem2);
        }
        return null;
    }

    public static sprzkl cfr_renamed_8048(String arg0) {
        sprlem sprlem2 = sprynm.cfr_renamed_2103(arg0);
        if (null != sprlem2) {
            return sprnam.cfr_renamed_7814(sprlem2);
        }
        return null;
    }

    public static String cfr_renamed_7555(sprlem arg0) {
        return (String)cfr_renamed_4.get(arg0);
    }
}

