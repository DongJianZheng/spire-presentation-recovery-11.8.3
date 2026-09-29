/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwmn;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzgp;
import com.spire.presentation.packages.sprznn;

@sprtea
public class sprcnn {
    public static final String cfr_renamed_272 = "/Lbl";
    public static final String cfr_renamed_145 = "/Table";
    public static final String cfr_renamed_114 = "/L";
    public static final String cfr_renamed_96 = "/TR";
    public static final String cfr_renamed_105 = "/Figure";
    public static final String cfr_renamed_137 = "/TD";
    public static final String cfr_renamed_79 = "/H";
    public static final String cfr_renamed_107 = "/Note";
    public static final String cfr_renamed_132 = "/LI";
    public static final String cfr_renamed_102 = "/LBody";
    public static final String cfr_renamed_93 = "/Footnote";
    public static final String cfr_renamed_86 = "/Part";
    public static final String cfr_renamed_152 = "/H";
    public static final String cfr_renamed_112 = "/P";
    public static final String cfr_renamed_119 = "/Annotation";
    public static final String cfr_renamed_91 = "/TH";
    public static final String cfr_renamed_0 = "/Artifact";
    public static final String cfr_renamed_1 = "/Endnote";
    public static final String cfr_renamed_2 = "/Formula";
    public static final String cfr_renamed_3 = "/Sect";
    public static final String cfr_renamed_4 = "/Link";

    public static void cfr_renamed_14678(spryjn spryjn2) {
        spryjn arg0;
        spryjn spryjn3 = arg0;
        arg0.cfr_renamed_14057(cfr_renamed_93, cfr_renamed_107);
        spryjn3.cfr_renamed_14057(cfr_renamed_1, cfr_renamed_107);
        spryjn3.cfr_renamed_14057(cfr_renamed_119, cfr_renamed_3);
    }

    public static String cfr_renamed_14691(int arg0) {
        Object[] objectArray = new Object[2];
        objectArray[0] = "/H";
        objectArray[1] = arg0;
        return sprraia.cfr_renamed_11562(sprzgp.cfr_renamed_9("P\bVC\u001aE"), objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_14692(sprznn arg0) {
        switch (arg0.cfr_renamed_324()) {
            case 0: 
            case 2: {
                return cfr_renamed_105;
            }
            case 1: {
                return cfr_renamed_2;
            }
        }
        return cfr_renamed_105;
    }

    public static String cfr_renamed_14693(sprwmn arg0) {
        if (arg0.cfr_renamed_13929()) {
            return cfr_renamed_91;
        }
        return cfr_renamed_137;
    }
}

