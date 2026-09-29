/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdmia;
import com.spire.presentation.packages.sprfuy;
import com.spire.presentation.packages.sprhrn;
import com.spire.presentation.packages.spriifa;

public final class sprlhn
extends Enum<sprlhn> {
    private static final /* synthetic */ sprlhn[] cfr_renamed_112;
    public static final /* enum */ sprlhn cfr_renamed_119;
    private int cfr_renamed_91;
    public static final int cfr_renamed_0 = 4;
    private String cfr_renamed_1;
    public static final /* enum */ sprlhn cfr_renamed_2;
    public static final /* enum */ sprlhn cfr_renamed_3;
    public static final /* enum */ sprlhn cfr_renamed_4;

    public static sprlhn[] values() {
        return (sprlhn[])cfr_renamed_112.clone();
    }

    public int cfr_renamed_97() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlhn(String string2, int string2) {
        void var4_2;
        void arg2;
        void arg1;
        void arg0;
        sprlhn sprlhn2 = this;
        sprlhn2.cfr_renamed_1 = arg2;
        sprlhn2.cfr_renamed_91 = var4_2;
    }

    public static sprlhn cfr_renamed_12867(int arg0) {
        int n;
        sprlhn[] sprlhnArray = sprlhn.cfr_renamed_205();
        int n2 = n = 0;
        while (n2 < sprlhnArray.length) {
            if (arg0 == sprlhnArray[n].cfr_renamed_97()) {
                return sprlhnArray[n];
            }
            n2 = ++n;
        }
        throw new sprdmia(new StringBuilder().insert(0, sprfuy.cfr_renamed_9("\u00074i3(-,{=3 (i-(7<>i")).append(arg0).toString());
    }

    public static sprlhn[] cfr_renamed_205() {
        sprlhn[] sprlhnArray = new sprlhn[4];
        sprlhnArray[0] = cfr_renamed_4;
        sprlhnArray[1] = cfr_renamed_119;
        sprlhnArray[2] = cfr_renamed_3;
        sprlhnArray[3] = cfr_renamed_2;
        return sprlhnArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_12868(sprlhn arg0) {
        switch (sprhrn.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                return spriifa.cfr_renamed_9("!\t\u00160\u001d\u0019\u0007\u0011\u0017");
            }
            case 2: {
                return sprfuy.cfr_renamed_9("\n7((:\u0016&?<7,");
            }
            case 3: {
                return spriifa.cfr_renamed_9("0\u0001;\u001d\u000f\u001f");
            }
            case 4: {
                return sprfuy.cfr_renamed_9("\u001f&8<6,5=");
            }
        }
        return spriifa.cfr_renamed_9("(\u001c\u0016\u001c\u0012\u0005\u0013R+0<?\u0012\u0016\b\u001e\u0018&\u0004\u0002\u0018R\u000b\u0013\u0011\u0007\u0018\\");
    }

    public static sprlhn cfr_renamed_5644(String arg0) {
        if (sprfuy.cfr_renamed_9("\u001a/-\u0016&?<7,").equals(arg0)) {
            return cfr_renamed_4;
        }
        if (spriifa.cfr_renamed_9("1\u0011\u0013\u000e\u00010\u001d\u0019\u0007\u0011\u0017").equals(arg0)) {
            return cfr_renamed_119;
        }
        if (sprfuy.cfr_renamed_9("\u0016:\u001d&)$").equals(arg0)) {
            return cfr_renamed_3;
        }
        if (spriifa.cfr_renamed_9("9\u001d\u001e\u0007\u0010\u0017\u0013\u0006").equals(arg0)) {
            return cfr_renamed_2;
        }
        throw new IllegalArgumentException(sprfuy.cfr_renamed_9("\u001c5\"5&,'{\u001f\u0019\b\u0016&?<7,\u000f0+,{':$>g"));
    }

    static {
        cfr_renamed_4 = new sprlhn(spriifa.cfr_renamed_9("!\t\u00160\u001d\u0019\u0007\u0011\u0017"), 0, sprfuy.cfr_renamed_9("\u001a/-\u0016&?<7,"), 0);
        cfr_renamed_119 = new sprlhn(spriifa.cfr_renamed_9("1\u0011\u0013\u000e\u00010\u001d\u0019\u0007\u0011\u0017"), 1, sprfuy.cfr_renamed_9("\n7((:\u0016&?<7,"), 1);
        cfr_renamed_3 = new sprlhn(spriifa.cfr_renamed_9("0\u0001;\u001d\u000f\u001f"), 2, sprfuy.cfr_renamed_9("\u0016:\u001d&)$"), 2);
        cfr_renamed_2 = new sprlhn(spriifa.cfr_renamed_9("9\u001d\u001e\u0007\u0010\u0017\u0013\u0006"), 3, sprfuy.cfr_renamed_9("\u001f&8<6,5="), 3);
        sprlhn[] sprlhnArray = new sprlhn[4];
        sprlhnArray[0] = cfr_renamed_4;
        sprlhnArray[1] = cfr_renamed_119;
        sprlhnArray[2] = cfr_renamed_3;
        sprlhnArray[3] = cfr_renamed_2;
        cfr_renamed_112 = sprlhnArray;
    }

    public static sprlhn valueOf(String arg0) {
        return Enum.valueOf(sprlhn.class, arg0);
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_12869(sprlhn arg0) {
        switch (sprhrn.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                return spriifa.cfr_renamed_9("!\t\u00160\u001d\u0019\u0007\u0011\u0017");
            }
            case 2: {
                return sprfuy.cfr_renamed_9("\n7((:\u0016&?<7,");
            }
            case 3: {
                return spriifa.cfr_renamed_9("0\u0001;\u001d\u000f\u001f");
            }
            case 4: {
                return sprfuy.cfr_renamed_9("\u001f&8<6,5=");
            }
        }
        return spriifa.cfr_renamed_9("(\u001c\u0016\u001c\u0012\u0005\u0013R+0<?\u0012\u0016\b\u001e\u0018&\u0004\u0002\u0018R\u000b\u0013\u0011\u0007\u0018\\");
    }
}

