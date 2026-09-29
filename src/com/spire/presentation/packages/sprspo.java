/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprrbia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprspo {
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private sprqt cfr_renamed_112;
    private int cfr_renamed_119;
    private boolean cfr_renamed_91;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprqt cfr_renamed_12479() {
        return this.cfr_renamed_112;
    }

    public void cfr_renamed_13408(int arg0) {
        if (arg0 < 0 || arg0 > 100) {
            throw new IllegalArgumentException("value");
        }
        this.cfr_renamed_86 = arg0;
    }

    public boolean cfr_renamed_14188() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_14236() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_14242(int arg0) {
        if (arg0 <= 0) {
            throw new IllegalArgumentException("value");
        }
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_14237(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprrbia.cfr_renamed_9("<\u0005\u001e\u0005\u0001\u0001\u0018\u0001\u001eD\u0002\u0005\u0001\u0001VD\u001a\u0005\u0000\u0011\t"));
        }
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_14196(sprqt arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_14239(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_14240(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_14238() {
        return this.cfr_renamed_152;
    }

    public int cfr_renamed_13404() {
        return this.cfr_renamed_86;
    }

    public void cfr_renamed_14197(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public sprspo() {
        sprspo sprspo2 = this;
        sprspo sprspo3 = this;
        this.cfr_renamed_119 = 0;
        sprspo3.cfr_renamed_86 = 100;
        sprspo3.cfr_renamed_1 = true;
        sprspo2.cfr_renamed_4 = 220;
        sprspo2.cfr_renamed_3 = 0;
    }

    public boolean cfr_renamed_14204() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_14241(int arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public void cfr_renamed_14024(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public boolean cfr_renamed_14184() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_14173() {
        return this.cfr_renamed_119;
    }

    public boolean cfr_renamed_14023() {
        return this.cfr_renamed_1;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 5 << 3 ^ 4;
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

    public int cfr_renamed_14223() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_14174(int arg0) {
        this.cfr_renamed_119 = arg0;
    }
}

