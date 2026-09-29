/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprqmn;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprxbn {
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 3;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 7;
    public static final int cfr_renamed_4 = 6;

    public static int cfr_renamed_5644(String arg0) {
        if (sprmvo.cfr_renamed_9("anAd").equals(arg0)) {
            return 0;
        }
        if ("Text".equals(arg0)) {
            return 1;
        }
        if (sprqmn.cfr_renamed_9("\u00170#7-?-:%70\u000e,00<7)%:!").equals(arg0)) {
            return 2;
        }
        if (sprmvo.cfr_renamed_9("xiFuJr_`Ld").equals(arg0)) {
            return 4;
        }
        if (sprqmn.cfr_renamed_9("\r!!0\u0018*=\u00170#7-?-:%70").equals(arg0)) {
            return 3;
        }
        if (sprmvo.cfr_renamed_9("{dWunoKRFfAhIhL`AunoKHHo@sNcCd").equals(arg0)) {
            return 7;
        }
        throw new IllegalArgumentException(sprqmn.cfr_renamed_9("\u00117/7+.*y\u001c4(\u001d+:14!70\r!!0\u0011%7 5-7#y*8)<j"));
    }

    private /* synthetic */ sprxbn() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprmvo.cfr_renamed_9("anAd");
            }
            case 1: {
                return "Text";
            }
            case 2: {
                return sprqmn.cfr_renamed_9("\u00170#7-?-:%70\u000e,00<7)%:!");
            }
            case 4: {
                return sprmvo.cfr_renamed_9("xiFuJr_`Ld");
            }
            case 3: {
                return sprqmn.cfr_renamed_9("\r!!0\u0018*=\u00170#7-?-:%70");
            }
            case 7: {
                return sprmvo.cfr_renamed_9("{dWunoKRFfAhIhL`AunoKHHo@sNcCd");
            }
        }
        return sprqmn.cfr_renamed_9("\f*2*637d\u0001)5\u00006',)<*-\u0010<<-\f8*=(0*>d/%51<j");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprmvo.cfr_renamed_9("anAd");
            }
            case 1: {
                return "Text";
            }
            case 2: {
                return sprqmn.cfr_renamed_9("\u00170#7-?-:%70\u000e,00<7)%:!");
            }
            case 4: {
                return sprmvo.cfr_renamed_9("xiFuJr_`Ld");
            }
            case 3: {
                return sprqmn.cfr_renamed_9("\r!!0\u0018*=\u00170#7-?-:%70");
            }
            case 7: {
                return sprmvo.cfr_renamed_9("{dWunoKRFfAhIhL`AunoKHHo@sNcCd");
            }
        }
        return sprqmn.cfr_renamed_9("\f*2*637d\u0001)5\u00006',)<*-\u0010<<-\f8*=(0*>d/%51<j");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sprmvo.cfr_renamed_9("anAd"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add("Text");
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprqmn.cfr_renamed_9("\u00170#7-?-:%70\u000e,00<7)%:!"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprmvo.cfr_renamed_9("xiFuJr_`Ld"));
        }
        if ((3 & arg0) == 3) {
            hashSet.add(sprqmn.cfr_renamed_9("\r!!0\u0018*=\u00170#7-?-:%70"));
        }
        if ((7 & arg0) == 7) {
            hashSet.add(sprmvo.cfr_renamed_9("{dWunoKRFfAhIhL`AunoKHHo@sNcCd"));
        }
        return hashSet;
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprxbn.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[6];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 4;
        nArray[4] = 3;
        nArray[5] = 7;
        return nArray;
    }
}

