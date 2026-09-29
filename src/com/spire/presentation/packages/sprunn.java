/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjqn;
import com.spire.presentation.packages.sprmjn;
import com.spire.presentation.packages.sprmsf;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprskn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtmn;
import com.spire.presentation.packages.sprtyo;
import com.spire.presentation.packages.spryno;
import java.util.Iterator;

@sprtea
public class sprunn {
    private static sprtyo<Integer, sprskn> cfr_renamed_2 = new sprtyo();
    private static int cfr_renamed_3;
    private static sprtyo<Integer, sprskn> cfr_renamed_4;

    static {
        cfr_renamed_4 = new sprtyo();
        sprunn.cfr_renamed_13066();
    }

    private static /* synthetic */ void cfr_renamed_13067(sprtyo arg0, sprjqn arg1) {
        boolean bl;
        boolean bl2 = arg1 == sprjqn.cfr_renamed_185;
        boolean bl3 = bl = arg1 == sprjqn.cfr_renamed_1600;
        if (!arg0.cfr_renamed_12143(1667460464)) {
            arg0.cfr_renamed_12160(1667460464, true);
        }
        if (!bl2 && !arg0.cfr_renamed_12143(1801810542)) {
            arg0.cfr_renamed_12160(1801810542, false);
        }
        if (!(bl2 || bl || arg0.cfr_renamed_12143(1818847073))) {
            arg0.cfr_renamed_12160(1818847073, false);
        }
    }

    private static /* synthetic */ void cfr_renamed_13066() {
        int n;
        int[] nArray = sprtmn.cfr_renamed_205();
        cfr_renamed_3 = nArray.length;
        int[] nArray2 = nArray;
        int n2 = nArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprskn sprskn2;
            sprskn sprskn3;
            int n4 = nArray2[n];
            sprskn sprskn4 = sprskn3 = new sprskn();
            sprskn sprskn5 = sprskn3;
            sprskn5.setStart(0);
            sprskn5.setEnd(Integer.MAX_VALUE);
            sprskn4.setTag(sprmjn.cfr_renamed_12969(sprunn.cfr_renamed_13068(n4)));
            sprskn4.setValue(0);
            sprskn sprskn6 = sprskn2 = new sprskn();
            sprskn sprskn7 = sprskn2;
            sprskn7.setStart(0);
            sprskn7.setEnd(Integer.MAX_VALUE);
            sprskn6.setTag(sprmjn.cfr_renamed_12969(sprunn.cfr_renamed_13068(n4)));
            sprskn6.setValue(1);
            cfr_renamed_2.cfr_renamed_12160(n4, sprskn3);
            cfr_renamed_4.cfr_renamed_12160(n4, sprskn2);
            n3 = ++n;
        }
    }

    @sprtea
    public static sprskn[] cfr_renamed_13062(int[] arg0, int[] arg1, boolean arg2, sprjqn arg3) {
        Iterator iterator;
        int n;
        int n2;
        sprtyo<Integer, Boolean> sprtyo2 = new sprtyo<Integer, Boolean>(cfr_renamed_3);
        Object[] objectArray = arg0;
        int n3 = arg0.length;
        int n4 = n2 = 0;
        while (n4 < n3) {
            n = objectArray[n2];
            sprtyo2.cfr_renamed_12160(n, true);
            n4 = ++n2;
        }
        objectArray = arg1;
        n3 = arg1.length;
        int n5 = n2 = 0;
        while (n5 < n3) {
            n = objectArray[n2];
            sprtyo2.cfr_renamed_12160(n, false);
            n5 = ++n2;
        }
        if (arg2) {
            sprunn.cfr_renamed_13067(sprtyo2, arg3);
        }
        objectArray = (Object[])((sprskn[])new sprskn().toArray(sprtyo2.size()));
        n3 = 0;
        Iterator iterator2 = iterator = sprtyo2.cfr_renamed_13069().iterator();
        while (iterator2.hasNext()) {
            sprnyja sprnyja2 = (sprnyja)iterator.next();
            int n6 = (Integer)sprnyja2.getKey();
            objectArray[n3] = (Boolean)sprnyja2.getValue() != false ? (int)cfr_renamed_4.cfr_renamed_12347(n6) : (int)cfr_renamed_2.cfr_renamed_12347(n6);
            ++n3;
            iterator2 = iterator;
        }
        return objectArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_13068(int arg0) {
        switch (arg0) {
            default: {
                return sprmsf.cfr_renamed_9("\u0000;\u000e(");
            }
            case 1818847073: {
                return spryno.cfr_renamed_9("\u007f/t'");
            }
            case 1919707495: {
                return sprmsf.cfr_renamed_9("\u00114\n?");
            }
            case 1668049255: {
                return spryno.cfr_renamed_9("p*z!");
            }
            case 1684826471: {
                return sprmsf.cfr_renamed_9("\u00074\n?");
            }
            case 1751935335: {
                return spryno.cfr_renamed_9("{*z!");
            }
            case 1886287213: {
                return sprmsf.cfr_renamed_9("\u00136\u00165");
            }
            case 1953396077: {
                return spryno.cfr_renamed_9("g(f+");
            }
            case 1819178349: {
                return sprmsf.cfr_renamed_9("\u000f6\u00165");
            }
            case 1869509997: {
                return spryno.cfr_renamed_9("|(f+");
            }
            case 1986359924: {
                return "vert";
            }
            case 1987212338: {
                return sprmsf.cfr_renamed_9("\u0015*\u0017j");
            }
            case 1936928817: {
                return spryno.cfr_renamed_9("`5#w");
            }
            case 1936928818: {
                return sprmsf.cfr_renamed_9("\u0010+Sj");
            }
            case 0x73733033: {
                return spryno.cfr_renamed_9("`5#u");
            }
            case 1936928820: {
                return sprmsf.cfr_renamed_9("\u0010+Sl");
            }
            case 1936928821: {
                return spryno.cfr_renamed_9("`5#s");
            }
            case 1936928822: {
                return sprmsf.cfr_renamed_9("\u0010+Sn");
            }
            case 0x73733037: {
                return spryno.cfr_renamed_9("`5#q");
            }
            case 1936928824: {
                return sprmsf.cfr_renamed_9("\u0010+S`");
            }
            case 1936928825: {
                return spryno.cfr_renamed_9("`5#\u007f");
            }
            case 1936929072: {
                return sprmsf.cfr_renamed_9("\u0010+Rh");
            }
            case 0x73733131: {
                return spryno.cfr_renamed_9("`5\"w");
            }
            case 1936929074: {
                return sprmsf.cfr_renamed_9("\u0010+Rj");
            }
            case 0x73733133: {
                return spryno.cfr_renamed_9("`5\"u");
            }
            case 1936929076: {
                return sprmsf.cfr_renamed_9("\u0010+Rl");
            }
            case 1936929077: {
                return spryno.cfr_renamed_9("`5\"s");
            }
            case 1936929078: {
                return sprmsf.cfr_renamed_9("\u0010+Rn");
            }
            case 0x73733137: {
                return spryno.cfr_renamed_9("`5\"q");
            }
            case 1936929080: {
                return sprmsf.cfr_renamed_9("\u0010+R`");
            }
            case 1936929081: {
                return spryno.cfr_renamed_9("`5\"\u007f");
            }
            case 1936929328: {
                return sprmsf.cfr_renamed_9("\u0010+Qh");
            }
            case 1801810542: 
        }
        return "kern";
    }
}

