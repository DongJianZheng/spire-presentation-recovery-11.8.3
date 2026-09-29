/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbid;
import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprcd;
import com.spire.presentation.packages.sprdjd;
import com.spire.presentation.packages.sprfid;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprind;
import com.spire.presentation.packages.sprllb;
import com.spire.presentation.packages.sprofd;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprudd;
import com.spire.presentation.packages.sprved;
import com.spire.presentation.packages.sprvid;
import com.spire.presentation.packages.sprxpb;
import com.spire.presentation.packages.spryhd;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprywh;
import com.spire.presentation.packages.sprzjd;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprwkd {
    public static final Hashtable cfr_renamed_132;
    public static sprvid cfr_renamed_102;
    public static sprvid cfr_renamed_93;
    public static sprvid cfr_renamed_86;
    public static sprvid cfr_renamed_152;
    public static final Hashtable cfr_renamed_112;
    public static sprvid cfr_renamed_119;
    public static final Hashtable cfr_renamed_91;
    public static sprvid cfr_renamed_0;
    public static sprvid cfr_renamed_1;
    public static final Hashtable cfr_renamed_2;
    public static sprvid cfr_renamed_3;
    public static sprvid cfr_renamed_4;

    public static void cfr_renamed_3746(String arg0, sprtzd arg1, sprvid arg2) {
        cfr_renamed_2.put(arg0, arg2);
        cfr_renamed_112.put(arg0, arg1);
        cfr_renamed_132.put(arg1, arg0);
        cfr_renamed_91.put(arg1, arg2);
    }

    static {
        cfr_renamed_102 = new sprdjd();
        cfr_renamed_3 = new sprzjd();
        cfr_renamed_4 = new sprfid();
        cfr_renamed_1 = new sprudd();
        cfr_renamed_152 = new sprofd();
        cfr_renamed_86 = new sprind();
        cfr_renamed_0 = new spryhd();
        cfr_renamed_119 = new sprved();
        cfr_renamed_93 = new sprbid();
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_112 = new Hashtable();
        cfr_renamed_91 = new Hashtable();
        cfr_renamed_132 = new Hashtable();
        sprwkd.cfr_renamed_3747(sprywh.cfr_renamed_9("$o5l\"(r/v#"), cfr_renamed_102);
        sprwkd.cfr_renamed_3746(sprbye.cfr_renamed_9("|mlx>1=c>"), sprcd.cfr_renamed_2, cfr_renamed_3);
        sprwkd.cfr_renamed_3746(sprywh.cfr_renamed_9("i\"y7+~(5+"), sprcd.cfr_renamed_723, cfr_renamed_4);
        sprwkd.cfr_renamed_3746(sprbye.cfr_renamed_9("|mlx=:;c>"), sprcd.cfr_renamed_96, cfr_renamed_1);
        sprwkd.cfr_renamed_3746(sprywh.cfr_renamed_9("i\"y7(u.5+"), sprcd.cfr_renamed_133, cfr_renamed_152);
        sprwkd.cfr_renamed_3746(sprbye.cfr_renamed_9("|mlx==9c>"), sprcd.cfr_renamed_107, cfr_renamed_86);
        sprwkd.cfr_renamed_3746(sprywh.cfr_renamed_9("i\"y7(r,5+"), sprcd.cfr_renamed_114, cfr_renamed_0);
        sprwkd.cfr_renamed_3746(sprbye.cfr_renamed_9("|mlx<0;z>"), sprcd.cfr_renamed_4, cfr_renamed_119);
        sprwkd.cfr_renamed_3746(sprywh.cfr_renamed_9("i\"y7/u+5+"), sprcd.cfr_renamed_119, cfr_renamed_93);
        sprwkd.cfr_renamed_3748(sprbye.cfr_renamed_9("_%>1="), sprcd.cfr_renamed_723);
        sprwkd.cfr_renamed_3748(sprywh.cfr_renamed_9("Jj(u."), sprcd.cfr_renamed_133);
        sprwkd.cfr_renamed_3748(sprbye.cfr_renamed_9("_%==9"), sprcd.cfr_renamed_114);
        sprwkd.cfr_renamed_3748(sprywh.cfr_renamed_9("Jj)\u007f."), sprcd.cfr_renamed_4);
        sprwkd.cfr_renamed_3748(sprbye.cfr_renamed_9("_%::>"), sprcd.cfr_renamed_119);
    }

    public static void cfr_renamed_3748(String arg0, sprtzd arg1) {
        arg0 = sprywa.cfr_renamed_425(arg0);
        cfr_renamed_112.put(arg0, arg1);
        cfr_renamed_2.put(arg0, cfr_renamed_91.get(arg1));
    }

    public static sprfpd cfr_renamed_1837(String arg0) {
        sprvid sprvid2 = (sprvid)cfr_renamed_2.get(sprywa.cfr_renamed_425(arg0));
        if (sprvid2 == null) {
            return null;
        }
        return sprvid2.cfr_renamed_284();
    }

    public static String cfr_renamed_2316(sprtzd arg0) {
        return (String)cfr_renamed_132.get(arg0);
    }

    public static /* synthetic */ sprpib cfr_renamed_3749(sprpib arg0) {
        return arg0;
    }

    private static /* synthetic */ sprpib cfr_renamed_3750(sprpib arg0, sprllb arg1) {
        return arg0.cfr_renamed_1876().cfr_renamed_3751(new sprxpb(arg0, arg1)).cfr_renamed_1631();
    }

    public static void cfr_renamed_3747(String arg0, sprvid arg1) {
        cfr_renamed_2.put(arg0, arg1);
    }

    public static sprfpd cfr_renamed_2102(sprtzd arg0) {
        sprvid sprvid2 = (sprvid)cfr_renamed_91.get(arg0);
        if (sprvid2 == null) {
            return null;
        }
        return sprvid2.cfr_renamed_284();
    }

    public static Enumeration cfr_renamed_289() {
        return cfr_renamed_2.keys();
    }

    public static sprtzd cfr_renamed_2103(String arg0) {
        return (sprtzd)cfr_renamed_112.get(sprywa.cfr_renamed_425(arg0));
    }

    public static /* synthetic */ sprpib cfr_renamed_3752(sprpib arg0, sprllb arg1) {
        return sprwkd.cfr_renamed_3750(arg0, arg1);
    }
}

