/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.sprugg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class spraxg {
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_3 + ":" + this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_1521() {
        byte[] byArray = new byte[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, byArray, 0, this.cfr_renamed_4.length);
        return byArray;
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    public static spraxg cfr_renamed_7702(String arg0) {
        Matcher matcher = Pattern.compile(sprtkm.cfr_renamed_9("\u000b\u0003G$\u0012s\u0010\"\ne\u000b\u0004\u0013r\u001a\u001e\u000e\u0019BrE\u0002\bv")).matcher(arg0);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(sprugg.cfr_renamed_9("Lwssuaya<doful<`rfsauk{%xjyv<ksq<h}q\u007fm<`duyfh`x%zjnh}q<9}i{j1kih\"? my}1ny|\""));
        }
        Matcher matcher2 = matcher;
        String string = matcher2.group(1);
        String string2 = matcher2.group(2);
        return new spraxg(Integer.parseInt(string), sprfqe.cfr_renamed_488(string2));
    }

    /*
     * WARNING - void declaration
     */
    public spraxg(int n, byte[] byArray) {
        void arg0;
        spraxg spraxg2 = this;
        spraxg2.cfr_renamed_3 = arg0;
        spraxg2.cfr_renamed_4 = byArray;
    }
}

