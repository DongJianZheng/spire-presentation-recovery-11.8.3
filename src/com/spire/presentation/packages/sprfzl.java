/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprykaa;
import com.spire.presentation.packages.sprzok;
import java.math.BigInteger;
import java.util.Hashtable;

public class sprfzl
extends sprqqe {
    public static final int cfr_renamed_88 = 5;
    public static final int cfr_renamed_31 = 6;
    public static final int cfr_renamed_272 = 4;
    public static final int cfr_renamed_145 = 2;
    private static final Hashtable cfr_renamed_114;
    public static final int cfr_renamed_96 = 5;
    public static final int cfr_renamed_105 = 9;
    public static final int cfr_renamed_137 = 8;
    public static final int cfr_renamed_79 = 1;
    public static final int cfr_renamed_107 = 3;
    private sprqvg cfr_renamed_132;
    private static final String[] cfr_renamed_102;
    public static final int cfr_renamed_93 = 4;
    public static final int cfr_renamed_86 = 1;
    public static final int cfr_renamed_152 = 2;
    public static final int cfr_renamed_112 = 0;
    public static final int cfr_renamed_119 = 10;
    public static final int cfr_renamed_91 = 8;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 10;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 9;
    public static final int cfr_renamed_4 = 6;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfzl(int n) {
        void arg0;
        if (n < 0) {
            throw new IllegalArgumentException(sprzok.cfr_renamed_9("\\oc`yhq!VSY!gdtrzo5;5ozu5h{!=1;/X@M("));
        }
        this.cfr_renamed_132 = new sprqvg((int)arg0);
    }

    public String toString() {
        int n = this.cfr_renamed_97().intValue();
        String string = n < 0 || n > 10 ? "invalid" : cfr_renamed_102[n];
        return new StringBuilder().insert(0, sprykaa.cfr_renamed_9("U\u000bz+s\u0018e\u0016xC6")).append(string).toString();
    }

    static {
        String[] stringArray = new String[11];
        stringArray[0] = sprzok.cfr_renamed_9("t{redvhshpe");
        stringArray[1] = sprykaa.cfr_renamed_9("}\u001co:y\u0014f\u000by\u0014\u007f\ns");
        stringArray[2] = sprzok.cfr_renamed_9("v@Vnxqgnxhfd");
        stringArray[3] = sprykaa.cfr_renamed_9("\u0018p\u001f\u007f\u0015\u007f\u0018b\u0010y\u0017U\u0011w\u0017q\u001cr");
        stringArray[4] = sprzok.cfr_renamed_9("ftedgrpepe");
        stringArray[5] = sprykaa.cfr_renamed_9("\u001as\ne\u0018b\u0010y\u0017Y\u001fY\ts\u000bw\r\u007f\u0016x");
        stringArray[6] = sprzok.cfr_renamed_9("bpsahshv`ad]nye");
        stringArray[7] = "unknown";
        stringArray[8] = sprykaa.cfr_renamed_9("d\u001c{\u0016`\u001cP\u000by\u0014U+Z");
        stringArray[9] = sprzok.cfr_renamed_9("es|w|mpfpV|u}eg`bo");
        stringArray[10] = sprykaa.cfr_renamed_9("\u0018W:y\u0014f\u000by\u0014\u007f\ns");
        cfr_renamed_102 = stringArray;
        cfr_renamed_114 = new Hashtable();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_132;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_132.cfr_renamed_97();
    }

    public static sprfzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfzl) {
            return (sprfzl)arg0;
        }
        if (arg0 != null) {
            return sprfzl.cfr_renamed_4272(sprqvg.cfr_renamed_23(arg0).cfr_renamed_5023());
        }
        return null;
    }

    public static sprfzl cfr_renamed_4272(int arg0) {
        Integer n = spruaf.cfr_renamed_279(arg0);
        if (!cfr_renamed_114.containsKey(n)) {
            cfr_renamed_114.put(n, new sprfzl(arg0));
        }
        return (sprfzl)cfr_renamed_114.get(n);
    }
}

