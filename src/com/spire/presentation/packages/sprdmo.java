/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprdmo {
    private int cfr_renamed_119;
    private float cfr_renamed_91;
    private float cfr_renamed_0;
    private int cfr_renamed_1;
    private long cfr_renamed_2;
    private float cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_16536() {
        return this.cfr_renamed_1;
    }

    public boolean cfr_renamed_16537() {
        return (this.cfr_renamed_2 & 0x4000L) != 0L;
    }

    public int cfr_renamed_16538() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_16539(long arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public float cfr_renamed_16540() {
        return this.cfr_renamed_91;
    }

    public boolean cfr_renamed_16541() {
        return (this.cfr_renamed_2 & 0x1000L) != 0L;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5);
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

    public void cfr_renamed_16542(float arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public sprdmo() {
        sprdmo sprdmo2 = this;
        sprdmo sprdmo3 = this;
        sprdmo sprdmo4 = this;
        sprdmo4.cfr_renamed_1 = 0;
        sprdmo4.cfr_renamed_119 = 0;
        sprdmo3.cfr_renamed_91 = 0.16666667f;
        sprdmo3.cfr_renamed_0 = 0.16666667f;
        sprdmo2.cfr_renamed_3 = 1.03f;
        sprdmo2.cfr_renamed_4 = 1;
    }

    public void cfr_renamed_16543(float arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public static sprdmo cfr_renamed_16544(sprhio arg0) {
        sprdmo sprdmo2 = new sprdmo();
        arg0.cfr_renamed_12261();
        sprdmo2.cfr_renamed_2 = arg0.cfr_renamed_13220() & 0xFFFFFFFFL;
        arg0.cfr_renamed_12261();
        sprhio sprhio2 = arg0;
        sprdmo2.cfr_renamed_1 = arg0.cfr_renamed_12261();
        sprdmo2.cfr_renamed_119 = sprhio2.cfr_renamed_12261();
        sprhio2.cfr_renamed_12261();
        arg0.cfr_renamed_12261();
        arg0.cfr_renamed_16457();
        arg0.cfr_renamed_12261();
        sprdmo sprdmo3 = sprdmo2;
        sprhio sprhio3 = arg0;
        sprdmo2.cfr_renamed_91 = arg0.cfr_renamed_16457();
        sprdmo2.cfr_renamed_0 = sprhio3.cfr_renamed_16457();
        sprdmo3.cfr_renamed_3 = sprhio3.cfr_renamed_16457();
        sprdmo3.cfr_renamed_4 = arg0.cfr_renamed_12261();
        return sprdmo2;
    }

    public boolean cfr_renamed_16545() {
        return (this.cfr_renamed_2 & 0x800L) != 0L;
    }

    public long cfr_renamed_16546() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_16547(float arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_16548(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public int cfr_renamed_16549() {
        return this.cfr_renamed_119;
    }

    public float cfr_renamed_16550() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_16551() {
        return (this.cfr_renamed_2 & 1L) != 0L;
    }

    public void cfr_renamed_16552(int arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprdmo cfr_renamed_12099() {
        sprdmo sprdmo2 = new sprdmo();
        sprdmo sprdmo3 = this;
        sprdmo sprdmo4 = sprdmo2;
        sprdmo sprdmo5 = this;
        sprdmo2.cfr_renamed_2 = this.cfr_renamed_16546();
        sprdmo2.cfr_renamed_1 = sprdmo5.cfr_renamed_16536();
        sprdmo4.cfr_renamed_119 = sprdmo5.cfr_renamed_16549();
        sprdmo4.cfr_renamed_91 = this.cfr_renamed_16540();
        sprdmo2.cfr_renamed_0 = sprdmo3.cfr_renamed_16550();
        sprdmo2.cfr_renamed_3 = sprdmo3.cfr_renamed_16553();
        sprdmo2.cfr_renamed_4 = this.cfr_renamed_16538();
        return sprdmo2;
    }

    public float cfr_renamed_16553() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_16554(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public boolean cfr_renamed_16555() {
        return (this.cfr_renamed_2 & 0x2000L) != 0L;
    }

    public boolean cfr_renamed_16556() {
        return (this.cfr_renamed_2 & 2L) != 0L;
    }
}

