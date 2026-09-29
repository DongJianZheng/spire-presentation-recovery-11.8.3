/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public abstract class sprvqo {
    private sprdsp cfr_renamed_119;
    private sprdsp cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprdsp cfr_renamed_2;
    private String cfr_renamed_3;
    private sprfzo cfr_renamed_4;

    public int cfr_renamed_13303() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_13326(int arg0, int arg1) {
        if (!this.cfr_renamed_119.cfr_renamed_14000(arg0)) {
            this.cfr_renamed_119.cfr_renamed_12962(arg0, arg1);
        }
    }

    public void cfr_renamed_16254(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_18606() {
        sprvqo sprvqo2 = this;
        int n = sprvqo2.cfr_renamed_13325(sprvqo2.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_13076());
        sprvqo2.cfr_renamed_13326(sprvqo2.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_12561(), n);
    }

    public abstract boolean cfr_renamed_14867();

    public abstract int cfr_renamed_18605(int var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public void cfr_renamed_18607(sprqt arg0, int arg1, String arg2) {
        if (arg0 != null) {
            arg0.cfr_renamed_12477(arg1, 13, arg2);
        }
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_3;
    }

    public abstract sprrpp cfr_renamed_13482(sprqt var1);

    public abstract void cfr_renamed_16893(spreen var1);

    public int cfr_renamed_13308(int arg0) {
        if (this.cfr_renamed_119.cfr_renamed_14000(arg0)) {
            return (Integer)this.cfr_renamed_119.cfr_renamed_576(arg0);
        }
        sprvqo sprvqo2 = this;
        int n = sprvqo2.cfr_renamed_13325(sprvqo2.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_13469(arg0).cfr_renamed_13076());
        sprvqo2.cfr_renamed_13326(arg0, n);
        return n;
    }

    public int cfr_renamed_13325(int arg0) {
        if (this.cfr_renamed_2.cfr_renamed_14000(arg0)) {
            return (Integer)this.cfr_renamed_2.cfr_renamed_576(arg0);
        }
        if (this.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_18331(arg0) == null) {
            return (Integer)this.cfr_renamed_2.cfr_renamed_576(0);
        }
        sprvqo sprvqo2 = this;
        int n = sprvqo2.cfr_renamed_18605(arg0);
        sprvqo2.cfr_renamed_2.cfr_renamed_12962(arg0, n);
        return n;
    }

    public sprvqo(sprfzo sprfzo2) {
        sprvqo sprvqo2 = this;
        this.cfr_renamed_1 = 63743;
        sprvqo sprvqo3 = this;
        this.cfr_renamed_2 = new sprdsp();
        sprvqo2.cfr_renamed_119 = new sprdsp();
        sprvqo2.cfr_renamed_91 = new sprdsp();
        sprvqo2.cfr_renamed_4 = sprfzo2;
    }

    public int cfr_renamed_14126(int[] arg0) {
        int n;
        if (arg0 == null) {
            return 0;
        }
        if (arg0.length == 1) {
            return arg0[0];
        }
        int n2 = 0;
        int[] nArray = arg0;
        int n3 = arg0.length;
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = nArray[n];
            n2 += n5;
            n4 = ++n;
        }
        if (n2 > 0) {
            int n6 = this.cfr_renamed_91.cfr_renamed_18610(n2);
            if (n6 >= 0) {
                Object object = this.cfr_renamed_91.cfr_renamed_13485(n6);
                return (Integer)object;
            }
            sprvqo sprvqo2 = this;
            n3 = sprvqo2.cfr_renamed_1--;
            sprvqo2.cfr_renamed_91.cfr_renamed_13414(n2, n3);
            return n3;
        }
        return 0;
    }

    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprdsp cfr_renamed_13323() {
        return this.cfr_renamed_2;
    }

    public sprdsp cfr_renamed_13484() {
        return this.cfr_renamed_119;
    }

    public abstract void cfr_renamed_14127(spreen var1);

    public sprfzo cfr_renamed_13261() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_18611(String arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_13308(n);
        }
    }

    public abstract void cfr_renamed_13227(spreen var1);
}

