/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprjuy;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsfy;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprwjn {
    @sprtea
    public static String cfr_renamed_13418(float[] arg0, float arg1) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            sprghha.cfr_renamed_12279(stringBuilder, sprebp.cfr_renamed_13083(arg0[n3] * arg1));
            if (n3 < arg0.length - 1) {
                sprghha.cfr_renamed_12279(stringBuilder, " ");
            }
            n2 = ++n;
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ boolean cfr_renamed_13419(int arg0) {
        return arg0 == 2 || arg0 == 3;
    }

    private /* synthetic */ sprwjn() {
    }

    @sprtea
    public static String cfr_renamed_13420(sprqgp arg0) {
        return sprwjn.cfr_renamed_13421(arg0, 9);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_13422(int arg0) {
        switch (arg0) {
            case 1: {
                return "bevel";
            }
            case 2: {
                return "round";
            }
        }
        return "miter";
    }

    private static /* synthetic */ boolean cfr_renamed_13423(int arg0) {
        return arg0 == 1 || arg0 == 3;
    }

    @sprtea
    public static String cfr_renamed_13421(sprqgp arg0, int arg1) {
        Object[] objectArray = new Object[6];
        objectArray[0] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_12595(), arg1);
        objectArray[1] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_12596(), arg1);
        objectArray[2] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_12597(), arg1);
        objectArray[3] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_12598(), arg1);
        objectArray[4] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_12599(), arg1);
        objectArray[5] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_12600(), arg1);
        return sprraia.cfr_renamed_11562(sprsfy.cfr_renamed_9("\u0018&\u00015\u001c?]<E:Y<D:Y<G:Y<F:Y<A:Y<@:\\"), objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_13425(int arg0) {
        switch (arg0) {
            case 0: 
            case 3: 
            case 16: 
            case 19: 
            case 20: 
            case 240: 
            case 255: {
                return sprjuy.cfr_renamed_9("g*q+");
            }
            case 2: 
            case 18: {
                return "round";
            }
            case 1: 
            case 17: {
                return "square";
            }
        }
        return sprsfy.cfr_renamed_9("%\u00003\u0001");
    }

    @sprtea
    public static String cfr_renamed_13163(sprwbp arg0) {
        Object[] objectArray = new Object[3];
        objectArray[0] = arg0.cfr_renamed_3353();
        objectArray[1] = arg0.cfr_renamed_1145();
        objectArray[2] = arg0.cfr_renamed_1997();
        return sprraia.cfr_renamed_11562(sprjuy.cfr_renamed_9("|~o?'7\"~n?'7\"~m?'7\""), objectArray);
    }

    @sprtea
    public static String cfr_renamed_13426(sprwbp arg0) {
        if (arg0.cfr_renamed_1778() != 255) {
            Object[] objectArray = new Object[4];
            objectArray[0] = arg0.cfr_renamed_3353();
            objectArray[1] = arg0.cfr_renamed_1145();
            objectArray[2] = arg0.cfr_renamed_1997();
            objectArray[3] = sprebp.cfr_renamed_13427((float)arg0.cfr_renamed_1778() / 255.0f);
            return sprraia.cfr_renamed_11562(sprsfy.cfr_renamed_9("\u0007 \u0017&]<E:Y<D:Y<G:Y<F:\\"), objectArray);
        }
        return sprwjn.cfr_renamed_13163(arg0);
    }

    @sprtea
    public static String cfr_renamed_13428(sprgeja arg0, int arg1) {
        Object[] objectArray = new Object[4];
        objectArray[0] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_13342(), arg1);
        objectArray[1] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_13341(), arg1);
        objectArray[2] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_13429(), arg1);
        objectArray[3] = sprebp.cfr_renamed_13424(arg0.cfr_renamed_13430(), arg1);
        return sprraia.cfr_renamed_11562(sprjuy.cfr_renamed_9("-`<qw~ox/qs~nx/qs~mx/qs~lx/qv"), objectArray);
    }

    @sprtea
    public static String cfr_renamed_13431(int arg0) {
        if (sprwjn.cfr_renamed_13423(arg0)) {
            return "bold";
        }
        return "normal";
    }

    @sprtea
    public static String cfr_renamed_13432(int arg0) {
        if (sprwjn.cfr_renamed_13419(arg0)) {
            return "italic";
        }
        return "normal";
    }
}

