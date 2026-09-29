/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprhoo;
import com.spire.presentation.packages.sprieo;
import com.spire.presentation.packages.sprnmo;
import com.spire.presentation.packages.sprrmo;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprufo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwio;

@sprtea
public class sprpgo {
    private sprhhp cfr_renamed_137;
    private int cfr_renamed_79;
    private sprwbp cfr_renamed_107;
    private sprufo cfr_renamed_132;
    private int cfr_renamed_102;
    private sprsuja cfr_renamed_93 = sprsuja.cfr_renamed_13377();
    private sprwbp cfr_renamed_86;
    private sprieo cfr_renamed_152;
    private sprnmo cfr_renamed_112;
    private sprwio cfr_renamed_119;
    private sprrmo cfr_renamed_91;
    private int cfr_renamed_0;
    private sprtbp cfr_renamed_1;
    private int cfr_renamed_2;
    private sprhoo cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_119 != null) {
            this.cfr_renamed_119.cfr_renamed_11665();
        }
    }

    public void cfr_renamed_16198(sprsuja arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public void cfr_renamed_16341(sprieo arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public sprhoo cfr_renamed_16131() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_16287() {
        return this.cfr_renamed_102;
    }

    public void cfr_renamed_16342(sprnmo arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public sprwbp cfr_renamed_16215() {
        return this.cfr_renamed_107;
    }

    public int cfr_renamed_16343() {
        return this.cfr_renamed_4;
    }

    public sprnmo cfr_renamed_16344() {
        return this.cfr_renamed_112;
    }

    public sprrmo cfr_renamed_16345() {
        return this.cfr_renamed_91;
    }

    public sprieo cfr_renamed_16346() {
        return this.cfr_renamed_152;
    }

    public void cfr_renamed_13741(sprhhp arg0) {
        this.cfr_renamed_137 = arg0;
    }

    public void cfr_renamed_16347(sprrmo arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 3 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
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

    public void cfr_renamed_16226(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_16348() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_16349(sprhoo arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprhhp cfr_renamed_13257() {
        return this.cfr_renamed_137;
    }

    public void cfr_renamed_16207(int arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public void cfr_renamed_16350(sprwio arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public sprwbp cfr_renamed_12676() {
        return this.cfr_renamed_86;
    }

    public sprsuja cfr_renamed_16115() {
        return this.cfr_renamed_93;
    }

    public sprufo cfr_renamed_16351() {
        return this.cfr_renamed_132;
    }

    public void cfr_renamed_16157(sprwbp arg0) {
        this.cfr_renamed_107 = arg0;
    }

    public void cfr_renamed_16156(int arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public void cfr_renamed_16352(sprufo arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public void cfr_renamed_16158(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_12591(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprwio cfr_renamed_16353() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_12505(sprtbp arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprtbp cfr_renamed_12571() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_16155(sprwbp arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public int cfr_renamed_12609() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_16354() {
        return this.cfr_renamed_79;
    }
}

