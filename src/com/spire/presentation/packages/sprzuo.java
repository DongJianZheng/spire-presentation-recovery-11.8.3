/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprowo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvso;

@sprtea
public class sprzuo {
    private int cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private int[] cfr_renamed_102;
    private int cfr_renamed_93;
    private byte cfr_renamed_86;
    private int cfr_renamed_152;
    public boolean cfr_renamed_112;
    private int cfr_renamed_119;
    private sprvso cfr_renamed_91;
    private boolean cfr_renamed_0;
    private sprowo[] cfr_renamed_1;
    private int cfr_renamed_2;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    public int[] cfr_renamed_18079() {
        return this.cfr_renamed_102;
    }

    public void cfr_renamed_18280(sprvso arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public short cfr_renamed_18281() {
        return this.cfr_renamed_8505().cfr_renamed_13487();
    }

    @sprtea
    public static void cfr_renamed_18282(sprzuo arg0, short arg1, short arg2) {
        int n;
        sprowo[] sprowoArray = arg0.cfr_renamed_18283();
        int n2 = n = sprowoArray.length - 1;
        while (n2 >= 0) {
            sprowoArray[--n] = sprowoArray[n].cfr_renamed_18276(arg1, arg2);
            n2 = n;
        }
        sprzuo sprzuo2 = arg0;
        sprvso sprvso2 = sprzuo2.cfr_renamed_8505();
        sprzuo sprzuo3 = arg0;
        sprzuo2.cfr_renamed_18280(new sprvso((short)(sprvso2.cfr_renamed_14887() + arg1), (short)(sprvso2.cfr_renamed_14888() + arg2), (short)(sprvso2.cfr_renamed_13487() + arg1), (short)(sprvso2.cfr_renamed_14889() + arg2)));
    }

    public short cfr_renamed_18284() {
        return this.cfr_renamed_8505().cfr_renamed_14888();
    }

    @sprtea
    public int cfr_renamed_18285() {
        return this.cfr_renamed_107;
    }

    @sprtea
    public int cfr_renamed_18286() {
        return this.cfr_renamed_93;
    }

    @sprtea
    public static void cfr_renamed_18287(sprzuo arg0, sprzuo arg1) {
        short s;
        sprzuo sprzuo2;
        short s2 = arg0.cfr_renamed_18079().length;
        if (s2 == 0) {
            sprzuo sprzuo3 = arg0;
            sprzuo3.cfr_renamed_18288((sprowo[])sprrzo.cfr_renamed_18289(sprzuo3.cfr_renamed_18283(), arg1.cfr_renamed_18283()));
            sprzuo sprzuo4 = arg0;
            sprzuo2 = sprzuo4;
            sprzuo4.cfr_renamed_18290(sprrzo.cfr_renamed_18291(sprzuo4.cfr_renamed_18079(), arg1.cfr_renamed_18079()));
        } else {
            sprzuo sprzuo5 = arg0;
            int n = (sprzuo5.cfr_renamed_18079()[s2 - 1] & 0xFFFF) + 1;
            sprzuo5.cfr_renamed_18288((sprowo[])sprrzo.cfr_renamed_18289(sprzuo5.cfr_renamed_18283(), arg1.cfr_renamed_18283()));
            sprzuo sprzuo6 = arg0;
            sprzuo6.cfr_renamed_18290(sprrzo.cfr_renamed_18291(sprzuo6.cfr_renamed_18079(), arg1.cfr_renamed_18079()));
            int n2 = sprzuo6.cfr_renamed_18079().length;
            short s3 = s = s2;
            while (s3 < n2) {
                short s4 = s++;
                arg0.cfr_renamed_18079()[s4] = arg0.cfr_renamed_18079()[s4] & 65535 + (n & 0xFFFF);
                s3 = s;
            }
            sprzuo2 = arg0;
        }
        sprvso sprvso2 = sprzuo2.cfr_renamed_8505();
        sprvso sprvso3 = arg1.cfr_renamed_8505();
        sprvso sprvso4 = sprvso2;
        s = sprrgga.cfr_renamed_18292(sprvso4.cfr_renamed_14887(), sprvso3.cfr_renamed_14887());
        short s5 = sprrgga.cfr_renamed_18292(sprvso4.cfr_renamed_14888(), sprvso3.cfr_renamed_14888());
        short s6 = sprrgga.cfr_renamed_13324(sprvso4.cfr_renamed_13487(), sprvso3.cfr_renamed_13487());
        short s7 = sprrgga.cfr_renamed_13324(sprvso4.cfr_renamed_14889(), sprvso3.cfr_renamed_14889());
        arg0.cfr_renamed_18280(new sprvso(s, s5, s6, s7));
    }

    private /* synthetic */ sprzuo(int n) {
        sprzuo sprzuo2 = this;
        sprzuo2.cfr_renamed_112 = true;
        sprzuo2.cfr_renamed_119 = n;
    }

    @sprtea
    public void cfr_renamed_18293(int arg0) {
        this.cfr_renamed_93 = arg0;
    }

    @sprtea
    public long cfr_renamed_18294() {
        return this.cfr_renamed_2;
    }

    public sprvso cfr_renamed_8505() {
        return this.cfr_renamed_91;
    }

    public boolean cfr_renamed_18295() {
        return this.cfr_renamed_18296() != null;
    }

    public int cfr_renamed_13072() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public long cfr_renamed_18297() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_18298(int arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public void cfr_renamed_18299(byte arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public static boolean cfr_renamed_18300(sprzuo arg0) {
        return arg0.cfr_renamed_0;
    }

    @sprtea
    public static void cfr_renamed_18301(sprzuo arg0, float arg1, float arg2, float arg3, float arg4) {
        int n;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        sprowo[] sprowoArray = arg0.cfr_renamed_18283();
        int n2 = n = 0;
        while (n2 < sprowoArray.length) {
            sprowo sprowo2 = sprowoArray[n];
            float f5 = sprowo2.cfr_renamed_3.cfr_renamed_0;
            float f6 = sprowo2.cfr_renamed_3.cfr_renamed_91;
            float f7 = (float)sprrgga.cfr_renamed_12793(f5 * arg1 + f6 * arg3);
            float f8 = (float)sprrgga.cfr_renamed_12793(f5 * arg2 + f6 * arg4);
            sprowoArray[n] = new sprowo(f7, f8, sprowo2.cfr_renamed_4);
            if (f7 < f) {
                f = f7;
            }
            if (f7 > f3) {
                f3 = f7;
            }
            if (f8 < f2) {
                f2 = f8;
            }
            if (f8 > f4) {
                f4 = f8;
            }
            n2 = ++n;
        }
        arg0.cfr_renamed_18280(new sprvso((short)f, (short)f2, (short)f3, (short)f4));
    }

    public void cfr_renamed_18288(sprowo[] arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @sprtea
    private /* synthetic */ void cfr_renamed_18302(long arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public static sprzuo cfr_renamed_18303(sprzuo arg0, int arg1) {
        int n;
        byte[] byArray;
        sprowo[] sprowoArray = (sprowo[])arg0.cfr_renamed_18283().clone();
        int[] nArray = (int[])arg0.cfr_renamed_18079().clone();
        sprvso sprvso2 = arg0.cfr_renamed_8505();
        if (arg0.cfr_renamed_18296() != null) {
            byArray = (byte[])arg0.cfr_renamed_18296().clone();
            n = arg1;
        } else {
            byArray = null;
            n = arg1;
        }
        return new sprzuo(sprowoArray, nArray, sprvso2, byArray, n);
    }

    @sprtea
    public byte[] cfr_renamed_18296() {
        return this.cfr_renamed_132;
    }

    @sprtea
    public void cfr_renamed_18304(byte[] arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public short cfr_renamed_18305() {
        return this.cfr_renamed_8505().cfr_renamed_14887();
    }

    public sprowo[] cfr_renamed_18283() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public void cfr_renamed_18306(int arg0) {
        this.cfr_renamed_107 = arg0;
    }

    public short cfr_renamed_18307() {
        return this.cfr_renamed_8505().cfr_renamed_14889();
    }

    public byte cfr_renamed_18308() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzuo(sprowo[] sprowoArray, int[] nArray, sprvso sprvso2, byte[] byArray, int n) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprzuo sprzuo2 = this;
        sprzuo sprzuo3 = this;
        sprzuo3.cfr_renamed_18288((sprowo[])arg0);
        sprzuo2.cfr_renamed_18290((int[])arg1);
        sprzuo2.cfr_renamed_18280((sprvso)arg2);
        this.cfr_renamed_18304((byte[])arg3);
        this.cfr_renamed_119 = n;
    }

    private /* synthetic */ void cfr_renamed_18290(int[] arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
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

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzuo(int n, long l, long l2, int n2) {
        void arg3;
        void arg2;
        void arg1;
        sprzuo sprzuo2 = this;
        this.cfr_renamed_18302((long)arg1);
        this.cfr_renamed_4 = arg2;
        sprzuo2.cfr_renamed_2 = arg3;
        sprzuo2.cfr_renamed_119 = n;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_18309(sprzuo sprzuo2, int n) {
        void arg1;
        sprzuo arg0;
        arg0.cfr_renamed_18298((int)arg1);
        arg0.cfr_renamed_0 = true;
    }

    public int cfr_renamed_18310() {
        return this.cfr_renamed_152;
    }
}

