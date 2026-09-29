/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprljaa;
import com.spire.presentation.packages.sproel;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrgl;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryky;

public class sprcjl
implements sprud,
sprgf {
    private final spriil cfr_renamed_102;
    private final sproel cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private static final byte[] cfr_renamed_112 = sprkoe.cfr_renamed_433(sprljaa.cfr_renamed_9("3U\u0011U\u000fX\u0006X+U\u0010\\"));
    private final int cfr_renamed_119;
    private final int cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private final sproel cfr_renamed_2;
    private final int cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, spryky.cfr_renamed_9("-3\u000f3\u0011>\u0018>53\u000e:")).append(this.cfr_renamed_2.cfr_renamed_1315().substring(6)).toString();
    }

    @Override
    public void cfr_renamed_41() {
        sprcjl sprcjl2 = this;
        sprcjl2.cfr_renamed_2.cfr_renamed_41();
        sproze.cfr_renamed_3408(sprcjl2.cfr_renamed_1);
        byte[] byArray = sprrgl.cfr_renamed_10114(sprcjl2.cfr_renamed_91);
        sprcjl2.cfr_renamed_2.cfr_renamed_1197(byArray, 0, byArray.length);
        sprcjl sprcjl3 = this;
        this.cfr_renamed_152 = 0;
        sprcjl3.cfr_renamed_86 = 0;
        sprcjl3.cfr_renamed_4 = true;
    }

    /*
     * WARNING - void declaration
     */
    public sprcjl(int n, byte[] byArray, int n2, int n3, spriil spriil2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprcjl sprcjl2 = this;
        sprcjl sprcjl3 = this;
        sprcjl sprcjl4 = this;
        sprcjl sprcjl5 = this;
        sprcjl sprcjl6 = this;
        sprcjl5.cfr_renamed_2 = new sproel((int)arg0, cfr_renamed_112, (byte[])arg1);
        sprcjl5.cfr_renamed_93 = new sproel((int)arg0, new byte[0], new byte[0]);
        sprcjl5.cfr_renamed_3 = arg0;
        sprcjl4.cfr_renamed_91 = arg2;
        sprcjl4.cfr_renamed_119 = (arg3 + 7) / 8;
        sprcjl3.cfr_renamed_1 = new byte[arg2];
        sprcjl3.cfr_renamed_0 = new byte[arg0 * 2 / 8];
        sprcjl2.cfr_renamed_102 = arg4;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprcjl2, n, (spriil)arg4));
        sprcjl2.cfr_renamed_41();
    }

    private /* synthetic */ void cfr_renamed_10498(byte[] arg0, int arg1, int arg2) {
        sprcjl sprcjl2 = this;
        sprcjl2.cfr_renamed_93.cfr_renamed_1197(arg0, arg1, arg2);
        sprcjl2.cfr_renamed_93.cfr_renamed_1199(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        sprcjl sprcjl3 = this;
        sprcjl3.cfr_renamed_2.cfr_renamed_1197(sprcjl3.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        ++this.cfr_renamed_152;
    }

    public sprcjl(int arg0, byte[] arg1, int arg2, int arg3) {
        this(arg0, arg1, arg2, arg3, spriil.cfr_renamed_0);
    }

    public sprcjl(sprcjl sprcjl2) {
        sprcjl sprcjl3 = sprcjl2;
        sprcjl sprcjl4 = this;
        sprcjl sprcjl5 = sprcjl2;
        sprcjl sprcjl6 = this;
        sprcjl sprcjl7 = sprcjl2;
        sprcjl sprcjl8 = this;
        this.cfr_renamed_2 = new sproel(sprcjl2.cfr_renamed_2);
        sprcjl8.cfr_renamed_93 = new sproel(sprcjl2.cfr_renamed_93);
        this.cfr_renamed_3 = sprcjl7.cfr_renamed_3;
        sprcjl6.cfr_renamed_91 = sprcjl7.cfr_renamed_91;
        sprcjl6.cfr_renamed_119 = sprcjl2.cfr_renamed_119;
        this.cfr_renamed_1 = sproze.cfr_renamed_158(sprcjl5.cfr_renamed_1);
        sprcjl4.cfr_renamed_0 = sproze.cfr_renamed_158(sprcjl5.cfr_renamed_0);
        sprcjl4.cfr_renamed_102 = sprcjl2.cfr_renamed_102;
        this.cfr_renamed_4 = sprcjl3.cfr_renamed_4;
        this.cfr_renamed_152 = sprcjl3.cfr_renamed_152;
        this.cfr_renamed_86 = sprcjl2.cfr_renamed_86;
        sprcjl sprcjl9 = this;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprcjl9, this.cfr_renamed_3, sprcjl9.cfr_renamed_102));
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_4) {
            sprcjl sprcjl2 = this;
            sprcjl2.cfr_renamed_10475(sprcjl2.cfr_renamed_119);
        }
        sprcjl sprcjl3 = this;
        int n = sprcjl3.cfr_renamed_2.cfr_renamed_1199(arg0, arg1, this.cfr_renamed_1218());
        sprcjl3.cfr_renamed_41();
        return n;
    }

    public sprcjl(int arg0, byte[] arg1, int arg2) {
        int n = arg0;
        this(n, arg1, arg2, n * 2, spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_119;
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4) {
            this.cfr_renamed_10475(0);
        }
        return this.cfr_renamed_2.cfr_renamed_6410(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4) {
            sprcjl sprcjl2 = this;
            sprcjl2.cfr_renamed_10475(sprcjl2.cfr_renamed_119);
        }
        sprcjl sprcjl3 = this;
        int n = sprcjl3.cfr_renamed_2.cfr_renamed_1199(arg0, arg1, arg2);
        sprcjl3.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        this.cfr_renamed_1[this.cfr_renamed_86++] = arg0;
        sprcjl sprcjl2 = this;
        if (sprcjl2.cfr_renamed_86 == sprcjl2.cfr_renamed_1.length) {
            this.cfr_renamed_10499();
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        arg2 = Math.max(0, arg2);
        int n = 0;
        if (this.cfr_renamed_86 != 0) {
            int n2 = n;
            while (n2 < arg2) {
                sprcjl sprcjl2 = this;
                if (sprcjl2.cfr_renamed_86 == sprcjl2.cfr_renamed_1.length) break;
                int n3 = arg1 + n;
                this.cfr_renamed_1[this.cfr_renamed_86++] = arg0[n3];
                n2 = ++n;
            }
            sprcjl sprcjl3 = this;
            if (sprcjl3.cfr_renamed_86 == sprcjl3.cfr_renamed_1.length) {
                this.cfr_renamed_10499();
            }
        }
        if (n < arg2) {
            int n4 = arg2;
            while (n4 - n >= this.cfr_renamed_91) {
                int n5 = n;
                sprcjl sprcjl4 = this;
                sprcjl4.cfr_renamed_10498(arg0, arg1 + n5, sprcjl4.cfr_renamed_91);
                n = n5 + this.cfr_renamed_91;
                n4 = arg2;
            }
        }
        int n6 = n;
        while (n6 < arg2) {
            int n7 = arg1 + n;
            this.cfr_renamed_1221(arg0[n7]);
            n6 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_10475(int arg0) {
        if (this.cfr_renamed_86 != 0) {
            this.cfr_renamed_10499();
        }
        sprcjl sprcjl2 = this;
        byte[] byArray = sprrgl.cfr_renamed_10112(sprcjl2.cfr_renamed_152);
        byte[] byArray2 = sprrgl.cfr_renamed_10112(arg0 * 8);
        sprcjl2.cfr_renamed_2.cfr_renamed_1197(byArray, 0, byArray.length);
        this.cfr_renamed_2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        this.cfr_renamed_4 = false;
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_2.cfr_renamed_3248();
    }

    private /* synthetic */ void cfr_renamed_10499() {
        sprcjl sprcjl2 = this;
        sprcjl2.cfr_renamed_10498(sprcjl2.cfr_renamed_1, 0, this.cfr_renamed_86);
        sprcjl2.cfr_renamed_86 = 0;
    }
}

