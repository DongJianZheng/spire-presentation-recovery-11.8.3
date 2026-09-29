/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjto;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprqbb;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprwr;

public class sprref {
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
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjto.cfr_renamed_9("g\u001d`\u0016q\u001cu\u001d{\tw\u00172\u0017{\u0014w\u0000fS]:VI2")).append(arg0).toString());
    }

    public static sprlem cfr_renamed_5655(String arg0) {
        if (arg0.equals("SHA-256")) {
            return sprwr.cfr_renamed_1226;
        }
        if (arg0.equals("SHA-512")) {
            return sprwr.cfr_renamed_272;
        }
        if (arg0.equals("SHAKE128")) {
            return sprwr.cfr_renamed_1;
        }
        if (arg0.equals("SHAKE256")) {
            return sprwr.spr\ufe34;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqbb.cfr_renamed_9("\u001dc\u001ah\u000bb\u000fc\u0001w\riHi\u0001j\r~\u001c7H")).append(arg0).toString());
    }

    public static String cfr_renamed_5656(sprlem arg0) {
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_1226)) {
            return "SHA256";
        }
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_272)) {
            return "SHA512";
        }
        if (arg0.cfr_renamed_5078(sprwr.cfr_renamed_1)) {
            return "SHAKE128";
        }
        if (arg0.cfr_renamed_5078(sprwr.spr\ufe34)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjto.cfr_renamed_9("g\u001d`\u0016q\u001cu\u001d{\tw\u00172\u0017{\u0014w\u0000fS]:VI2")).append(arg0).toString());
    }

    public static int cfr_renamed_5657(sprgf arg0) {
        if (arg0 instanceof sprud) {
            return arg0.cfr_renamed_1218() * 2;
        }
        return arg0.cfr_renamed_1218();
    }

    public static byte[] cfr_renamed_5652(sprgf arg0) {
        sprgf sprgf2 = arg0;
        byte[] byArray = new byte[sprref.cfr_renamed_5657(sprgf2)];
        if (sprgf2 instanceof sprud) {
            ((sprud)arg0).cfr_renamed_1199(byArray, 0, byArray.length);
            return byArray;
        }
        arg0.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

