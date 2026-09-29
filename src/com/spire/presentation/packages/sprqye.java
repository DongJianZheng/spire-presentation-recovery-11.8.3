/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.sprbel;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprduk;
import com.spire.presentation.packages.sprfhfa;
import com.spire.presentation.packages.sprfxk;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlcl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlll;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sproyy;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqcl;
import com.spire.presentation.packages.sprrwk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvei;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryy;
import java.security.InvalidKeyException;

public class sprqye {
    public static spryy cfr_renamed_5664(sprvei arg0, byte[] arg1) throws InvalidKeyException {
        sprvei sprvei2 = arg0;
        spryy spryy2 = sprqye.cfr_renamed_5665(sprvei2.cfr_renamed_5666());
        if (sprvei2.cfr_renamed_5667() == null) {
            spryy spryy3 = spryy2;
            spryy3.cfr_renamed_5535(false, new sprtpk(arg1));
            return spryy3;
        }
        spryy spryy4 = spryy2;
        spryy4.cfr_renamed_5535(false, new sprtpk(sprqye.cfr_renamed_5668(arg0, arg1)));
        return spryy4;
    }

    public static spryy cfr_renamed_5669(sprvei arg0, byte[] arg1) throws InvalidKeyException {
        sprvei sprvei2 = arg0;
        spryy spryy2 = sprqye.cfr_renamed_5665(sprvei2.cfr_renamed_5666());
        if (sprvei2.cfr_renamed_5667() == null) {
            spryy spryy3 = spryy2;
            spryy3.cfr_renamed_5535(true, new sprtpk(arg1));
            return spryy3;
        }
        spryy spryy4 = spryy2;
        spryy4.cfr_renamed_5535(true, new sprtpk(sprqye.cfr_renamed_5668(arg0, arg1)));
        return spryy4;
    }

    public static spryy cfr_renamed_5665(String arg0) {
        if (arg0.equalsIgnoreCase(sprfhfa.cfr_renamed_9("\u0017n\u0005|\u0004j\u0006")) || arg0.equalsIgnoreCase(sproyy.cfr_renamed_9("\n^\u0018"))) {
            sprfxk sprfxk2 = new sprfxk(new sprael());
            return sprfxk2;
        }
        if (arg0.equalsIgnoreCase(sprfhfa.cfr_renamed_9("j\u0004b\u0017"))) {
            sprfxk sprfxk3 = new sprfxk(new sprbel());
            return sprfxk3;
        }
        if (arg0.equalsIgnoreCase(sproyy.cfr_renamed_9("X*v.w'r*"))) {
            sprfxk sprfxk4 = new sprfxk(new sprlcl());
            return sprfxk4;
        }
        if (arg0.equalsIgnoreCase(sprfhfa.cfr_renamed_9("x\u0013n\u0012"))) {
            sprfxk sprfxk5 = new sprfxk(new sprrwk());
            return sprfxk5;
        }
        if (arg0.equalsIgnoreCase(sproyy.cfr_renamed_9("\n^\u00186\u0000L\u001b"))) {
            sprqcl sprqcl2 = new sprqcl(new sprael());
            return sprqcl2;
        }
        if (arg0.equalsIgnoreCase(sprfhfa.cfr_renamed_9("h7F3G:B7\u0006\u001d|\u0006"))) {
            sprqcl sprqcl3 = new sprqcl(new sprlcl());
            return sprqcl3;
        }
        if (arg0.equalsIgnoreCase(sproyy.cfr_renamed_9("Z\u0019R\n6\u0000L\u001b"))) {
            sprqcl sprqcl4 = new sprqcl(new sprbel());
            return sprqcl4;
        }
        throw new UnsupportedOperationException(new StringBuilder().insert(0, sprfhfa.cfr_renamed_9("#E=E9\\8\u000b=N/\u000b7G1D$B\"C;\u0011v")).append(arg0).toString());
    }

    private static /* synthetic */ byte[] cfr_renamed_5668(sprvei arg0, byte[] arg1) throws InvalidKeyException {
        byte[] byArray;
        sprvei sprvei2 = arg0;
        sprddm sprddm2 = sprvei2.cfr_renamed_5667();
        byte[] byArray2 = sprvei2.cfr_renamed_5670();
        byte[] byArray3 = new byte[(sprvei2.cfr_renamed_2398() + 7) / 8];
        if (sprbr.cfr_renamed_0.cfr_renamed_5078(sprddm2.cfr_renamed_593())) {
            sprduk sprduk2;
            sprddm sprddm3 = sprddm.cfr_renamed_23(sprddm2.cfr_renamed_284());
            sprduk sprduk3 = sprduk2 = new sprduk(sprqye.cfr_renamed_5654(sprddm3.cfr_renamed_593()));
            sprduk sprduk4 = sprduk2;
            sprduk3.cfr_renamed_5671(new sprook(arg1, byArray2));
            sprduk3.cfr_renamed_2341(byArray3, 0, byArray3.length);
            byArray = arg1;
        } else if (sprbr.cfr_renamed_1337.cfr_renamed_5078(sprddm2.cfr_renamed_593())) {
            sprlll sprlll2;
            sprddm sprddm4 = sprddm.cfr_renamed_23(sprddm2.cfr_renamed_284());
            sprlll sprlll3 = sprlll2 = new sprlll(sprqye.cfr_renamed_5654(sprddm4.cfr_renamed_593()));
            sprlll3.cfr_renamed_5671(new sprook(arg1, byArray2));
            sprlll3.cfr_renamed_2341(byArray3, 0, byArray3.length);
            byArray = arg1;
        } else if (sprwr.spr\ufe34.cfr_renamed_5078(sprddm2.cfr_renamed_593())) {
            sprnil sprnil2 = new sprnil(256);
            sprnil2.cfr_renamed_1197(arg1, 0, arg1.length);
            sprnil2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprnil2.cfr_renamed_1199(byArray3, 0, byArray3.length);
            byArray = arg1;
        } else {
            throw new InvalidKeyException(new StringBuilder().insert(0, sproyy.cfr_renamed_9("N%i.x$|%r1~/;\u0000_\r!k")).append(sprddm2.cfr_renamed_593()).toString());
        }
        sproze.cfr_renamed_492(byArray, (byte)0);
        return byArray3;
    }

    public static sprgf cfr_renamed_5654(sprlem arg0) {
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_1226)) {
            return new sprohl();
        }
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_272)) {
            return new sprocl();
        }
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_1)) {
            return new sprnil(128);
        }
        if (arg0.cfr_renamed_5078(sprwr.spr\ufe34)) {
            return new sprnil(256);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfhfa.cfr_renamed_9("#E$N5D1E?Q3OvO?L3X\"\u000b\u0019b\u0012\u0011v")).append(arg0).toString());
    }
}

