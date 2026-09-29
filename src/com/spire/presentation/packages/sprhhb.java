/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartLegend;
import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.spriad;
import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;

public class sprhhb
implements AlgorithmParameterSpec {
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    public static final int cfr_renamed_1 = 50;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    public static final int cfr_renamed_4 = 11;

    public int cfr_renamed_1185() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprhhb(int n, int n2) throws InvalidParameterException {
        void arg1;
        void arg0;
        if (n < 1) {
            throw new InvalidParameterException(spriad.cfr_renamed_9("3T3\u0001-\u0000~\u0016;T.\u001b-\u001d*\u001d(\u0011"));
        }
        if (arg0 > 32) {
            throw new InvalidParameterException(ChartLegend.cfr_renamed_9("\u0017\u0011\u0013BZE\u0015^Z]\u001bC\u001dT"));
        }
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_91 = 1 << arg0;
        if (arg1 < 0) {
            throw new InvalidParameterException(spriad.cfr_renamed_9("*T3\u0001-\u0000~\u0016;T.\u001b-\u001d*\u001d(\u0011"));
        }
        if (arg1 > this.cfr_renamed_91) {
            throw new InvalidParameterException(ChartLegend.cfr_renamed_9("EZ\\\u000fB\u000e\u0011\u0018TZ]\u001fB\t\u0011\u000eY\u001b_Z_Z\fZ\u0003$\\"));
        }
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_3 = sprhna.cfr_renamed_826((int)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprhhb(int n) throws InvalidParameterException {
        void arg0;
        if (n < 1) {
            throw new InvalidParameterException(spriad.cfr_renamed_9("\u001f;\r~\u00077\u000e;T3\u0001-\u0000~\u0016;T.\u001b-\u001d*\u001d(\u0011"));
        }
        sprhhb sprhhb2 = this;
        sprhhb sprhhb3 = this;
        sprhhb3.cfr_renamed_0 = 0;
        sprhhb3.cfr_renamed_91 = 1;
        while (sprhhb2.cfr_renamed_91 < arg0) {
            sprhhb sprhhb4 = this;
            sprhhb2 = sprhhb4;
            sprhhb4.cfr_renamed_91 <<= 1;
            ++sprhhb4.cfr_renamed_0;
        }
        sprhhb sprhhb5 = this;
        sprhhb5.cfr_renamed_2 = sprhhb5.cfr_renamed_91 >>> 1;
        sprhhb5.cfr_renamed_2 /= this.cfr_renamed_0;
        sprhhb5.cfr_renamed_3 = sprhna.cfr_renamed_826(sprhhb5.cfr_renamed_0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (3 ^ 5);
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

    public sprhhb() {
        this(11, 50);
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_2;
    }

    public sprhhb(int arg0, int arg1, int arg2) throws InvalidParameterException {
        this.cfr_renamed_0 = arg0;
        if (this.cfr_renamed_0 < 1) {
            throw new InvalidParameterException(ChartLegend.cfr_renamed_9("\u0017\u0011\u0017D\tEZS\u001f\u0011\n^\tX\u000eX\fT"));
        }
        if (arg0 > 32) {
            throw new InvalidParameterException(spriad.cfr_renamed_9("T3T7\u0007~\u00001\u001b~\u0018?\u00069\u0011"));
        }
        this.cfr_renamed_91 = 1 << arg0;
        this.cfr_renamed_2 = arg1;
        if (arg1 < 0) {
            throw new InvalidParameterException(ChartLegend.cfr_renamed_9("\u000e\u0011\u0017D\tEZS\u001f\u0011\n^\tX\u000eX\fT"));
        }
        if (arg1 > this.cfr_renamed_91) {
            throw new InvalidParameterException(spriad.cfr_renamed_9("\u0000~\u0019+\u0007*T<\u0011~\u0018;\u0007-T*\u001c?\u001a~\u001a~I~F\u0000\u0019"));
        }
        if (sprhna.cfr_renamed_824(arg2) == arg0 && sprhna.cfr_renamed_827(arg2)) {
            this.cfr_renamed_3 = arg2;
            return;
        }
        throw new InvalidParameterException(ChartLegend.cfr_renamed_9("\n^\u0016H\u0014^\u0017X\u001b]ZX\t\u0011\u0014^\u000e\u0011\u001b\u0011\u001cX\u001f]\u001e\u0011\n^\u0016H\u0014^\u0017X\u001b]ZW\u0015CZv<\u0019Ho\u0017\u0018"));
    }
}

