/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtmha;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;

@sprtea
public final class sprqho {
    @sprtea
    public static sprqho cfr_renamed_152 = new sprqho(sprgmg.cfr_renamed_9("m6E<A"), 0);
    private String cfr_renamed_112;
    private static final sprusca cfr_renamed_119;
    @sprtea
    public static sprqho cfr_renamed_91;
    private int cfr_renamed_0;
    private static sprdz cfr_renamed_1;
    private static int cfr_renamed_2;
    @sprtea
    public static sprqho cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    @sprtea
    public static sprqho cfr_renamed_15474(String arg0) {
        for (sprqho sprqho2 : cfr_renamed_1) {
            if (!sprraia.cfr_renamed_11730(sprqho2.cfr_renamed_112, arg0)) continue;
            return sprqho2;
        }
        throw new IllegalArgumentException(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqho(String string, int n) {
        void arg0;
        sprqho sprqho2 = this;
        sprqho2.cfr_renamed_112 = arg0;
        sprqho2.cfr_renamed_0 = cfr_renamed_2++;
        sprqho2.cfr_renamed_4 = n;
    }

    @sprtea
    public static sprdz cfr_renamed_15473() {
        return cfr_renamed_1;
    }

    static {
        cfr_renamed_3 = new sprqho(sprtmha.cfr_renamed_9("o\bJ\u0014A"), 1);
        cfr_renamed_91 = new sprqho(sprgmg.cfr_renamed_9("r2@>K"), 2);
        cfr_renamed_1 = new sprvrx();
        cfr_renamed_2 = 0;
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_152);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_3);
        cfr_renamed_1.cfr_renamed_12808(cfr_renamed_91);
        String[] stringArray = new String[3];
        stringArray[0] = sprtmha.cfr_renamed_9("g\u0010O\u001aK");
        stringArray[1] = sprgmg.cfr_renamed_9("e.@2K");
        stringArray[2] = sprtmha.cfr_renamed_9("x\u0014J\u0018A");
        cfr_renamed_119 = new sprusca(stringArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static sprqho cfr_renamed_141(String arg0) {
        switch (cfr_renamed_119.cfr_renamed_12854(arg0)) {
            case 0: {
                return cfr_renamed_152;
            }
            case 1: {
                return cfr_renamed_3;
            }
            case 2: {
                return cfr_renamed_91;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprgmg.cfr_renamed_9("\u593e\u5ac9\u4f77\u6867\u5f2b\u4e56\u650b\u635a\uff3e")).append(arg0).toString());
    }

    public String toString() {
        return this.cfr_renamed_112;
    }

    @sprtea
    public int cfr_renamed_15472() {
        return this.cfr_renamed_0;
    }
}

