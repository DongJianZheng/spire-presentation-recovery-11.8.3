/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprwr;

public class sprnkf {
    public static byte[] cfr_renamed_5652(sprgf arg0) {
        sprgf sprgf2 = arg0;
        byte[] byArray = new byte[sprnkf.cfr_renamed_5657(sprgf2)];
        if (sprgf2 instanceof sprud) {
            ((sprud)arg0).cfr_renamed_1199(byArray, 0, byArray.length);
            return byArray;
        }
        arg0.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public static int cfr_renamed_5657(sprgf arg0) {
        if (arg0 instanceof sprud) {
            return arg0.cfr_renamed_1218() * 2;
        }
        return arg0.cfr_renamed_1218();
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
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprazo.cfr_renamed_9("UzRqC{GzInEp\u0000pIsEgT4o]d.\u0000")).append(arg0).toString());
    }
}

