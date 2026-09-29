/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcd;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprirca;
import com.spire.presentation.packages.sprqbz;
import com.spire.presentation.packages.sprsie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprywa;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprnae {
    public static final Hashtable cfr_renamed_3 = new Hashtable();
    public static final Hashtable cfr_renamed_4 = new Hashtable();

    public static sprfpd cfr_renamed_1837(String arg0) {
        sprtzd sprtzd2 = (sprtzd)cfr_renamed_3.get(sprywa.cfr_renamed_116(arg0));
        if (sprtzd2 != null) {
            return sprnae.cfr_renamed_2102(sprtzd2);
        }
        return null;
    }

    public static void cfr_renamed_4608(String arg0, sprtzd arg1) {
        cfr_renamed_3.put(arg0, arg1);
        cfr_renamed_4.put(arg1, arg0);
    }

    public static String cfr_renamed_2316(sprtzd arg0) {
        return (String)cfr_renamed_4.get(arg0);
    }

    static {
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("bO\u0015U\u0011"), sprcd.cfr_renamed_105);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("\"XTEY"), sprcd.cfr_renamed_82);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("bO\u0012Z\u0013"), sprcd.cfr_renamed_93);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("\"XRFS"), sprcd.cfr_renamed_84);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("bO\u0011T\u0013"), sprcd.cfr_renamed_3);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("+XUBQ"), sprcd.cfr_renamed_132);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("kO\u0014R\u0019"), sprcd.cfr_renamed_102);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("+XRMS"), sprcd.cfr_renamed_272);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("kO\u0012Q\u0013"), sprcd.cfr_renamed_185);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("+XQCS"), sprcd.cfr_renamed_137);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("pO\u0015P\u0011"), sprcd.cfr_renamed_119);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("0XSMT"), sprcd.cfr_renamed_4);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("pO\u0012W\u0016"), sprcd.cfr_renamed_114);
        sprnae.cfr_renamed_4608(sprqbz.cfr_renamed_9("0XRGT"), sprcd.cfr_renamed_133);
        sprnae.cfr_renamed_4608(sprirca.cfr_renamed_9("pO\u0011[\u0012"), sprcd.cfr_renamed_723);
    }

    public static Enumeration cfr_renamed_289() {
        return cfr_renamed_3.keys();
    }

    public static sprtzd cfr_renamed_2103(String arg0) {
        return (sprtzd)cfr_renamed_3.get(sprywa.cfr_renamed_116(arg0));
    }

    public static sprfpd cfr_renamed_2102(sprtzd arg0) {
        return sprsie.cfr_renamed_2102(arg0);
    }
}

