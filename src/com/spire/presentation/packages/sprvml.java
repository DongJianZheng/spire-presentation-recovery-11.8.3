/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfrk;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjod;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsap;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;
import java.util.Iterator;
import java.util.Stack;

public class sprvml
implements sprpl,
sprhx,
sprud {
    private static final int cfr_renamed_722 = 10;
    private static final int cfr_renamed_955 = 4;
    private static final int cfr_renamed_1228 = 11;
    private static final int cfr_renamed_1260 = 12;
    private static final int cfr_renamed_499 = 1024;
    private static final int cfr_renamed_135 = 0;
    private static final int cfr_renamed_956 = 2;
    private static final int cfr_renamed_952 = 64;
    private final int[] cfr_renamed_728;
    private static final int cfr_renamed_128 = 14;
    private int cfr_renamed_957;
    private final int[] cfr_renamed_314;
    private static final int cfr_renamed_951 = 64;
    private static final int cfr_renamed_84 = 16;
    private static final int cfr_renamed_723 = 32;
    private static final int[] cfr_renamed_1226;
    private static final int cfr_renamed_287 = 7;
    private final byte[] cfr_renamed_724;
    private static final int cfr_renamed_953 = 2;
    private static final int cfr_renamed_133 = 6;
    private int cfr_renamed_185;
    private long spr\ufe34;
    private final byte[] cfr_renamed_82;
    private final int cfr_renamed_126;
    private boolean cfr_renamed_88;
    private static final int cfr_renamed_31 = 8;
    private long cfr_renamed_272;
    private final spriil cfr_renamed_145;
    private static final int cfr_renamed_114 = 8;
    private static final int cfr_renamed_96 = 7;
    private static final int cfr_renamed_105 = 1;
    private static final byte[] cfr_renamed_137;
    private final Stack cfr_renamed_79;
    private static final int cfr_renamed_107 = 5;
    private int cfr_renamed_132;
    private int cfr_renamed_102;
    private static final int cfr_renamed_93 = 1;
    private final int[] cfr_renamed_86;
    private static final String cfr_renamed_152 = "Already outputting";
    private static final int cfr_renamed_112 = 4;
    private static final int cfr_renamed_119 = 15;
    private static final int cfr_renamed_91 = 9;
    private static final int cfr_renamed_0 = 3;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 13;
    private static final int cfr_renamed_3 = 8;
    private final int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_10499() {
        int n;
        this.cfr_renamed_10534();
        int n2 = n = 0;
        while (n2 < 6) {
            sprvml sprvml2 = this;
            sprvml2.cfr_renamed_10535();
            sprvml2.cfr_renamed_10536();
            n2 = ++n;
        }
        sprvml sprvml3 = this;
        sprvml3.cfr_renamed_10535();
        sprvml3.cfr_renamed_10537();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        sprvml sprvml2 = this;
        return sprvml2.cfr_renamed_1199(byArray, (int)arg1, sprvml2.cfr_renamed_1218());
    }

    private /* synthetic */ void cfr_renamed_10538(int arg0, boolean arg1) {
        System.arraycopy(this.cfr_renamed_1 == 0 ? this.cfr_renamed_314 : this.cfr_renamed_4, 0, this.cfr_renamed_86, 0, 8);
        System.arraycopy(cfr_renamed_1226, 0, this.cfr_renamed_86, 8, 4);
        sprvml sprvml2 = this;
        sprvml2.cfr_renamed_86[12] = (int)this.cfr_renamed_272;
        sprvml sprvml3 = this;
        sprvml2.cfr_renamed_86[13] = (int)(sprvml3.cfr_renamed_272 >> 32);
        sprvml3.cfr_renamed_86[14] = arg0;
        sprvml sprvml4 = this;
        sprvml2.cfr_renamed_86[15] = sprvml4.cfr_renamed_957 + (sprvml4.cfr_renamed_1 == 0 ? 1 : 0) + (arg1 ? 2 : 0);
        sprvml sprvml5 = this;
        sprvml5.cfr_renamed_1 += arg0;
        if (sprvml5.cfr_renamed_1 >= 1024) {
            sprvml sprvml6 = this;
            sprvml6.cfr_renamed_10539();
            sprvml6.cfr_renamed_86[15] = sprvml6.cfr_renamed_86[15] | 2;
        }
        if (arg1 && this.cfr_renamed_79.isEmpty()) {
            this.cfr_renamed_10540();
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_126;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprsap.cfr_renamed_9("kphwl\u000f");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10541(byte[] byArray) {
        void arg0;
        sprpxe.cfr_renamed_454((byte[])arg0, 0, this.cfr_renamed_314);
        this.cfr_renamed_957 = 16;
    }

    private /* synthetic */ void cfr_renamed_10542(byte[] arg0, int arg1) {
        sprpxe.cfr_renamed_454(arg0, arg1, this.cfr_renamed_728);
    }

    private /* synthetic */ void cfr_renamed_10543(int arg0) {
        sprvml sprvml2 = this;
        sprvml2.cfr_renamed_10538(arg0, true);
        sprvml2.cfr_renamed_10542(sprvml2.cfr_renamed_724, 0);
        sprvml2.cfr_renamed_10499();
        sprvml2.cfr_renamed_10544();
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg1 > arg0.length - arg2) {
            throw new sprwjl(sprjod.cfr_renamed_9("\u001f&\u0004#\u0005'P1\u00055\u00166\u0002s\u0004<\u001fs\u0003;\u001f!\u0004"));
        }
        if (!this.cfr_renamed_88) {
            sprvml sprvml2 = this;
            sprvml2.cfr_renamed_10543(sprvml2.cfr_renamed_102);
        }
        if (arg2 < 0 || this.spr\ufe34 >= 0L && (long)arg2 > this.spr\ufe34) {
            throw new IllegalArgumentException(sprsap.cfr_renamed_9("`RZIOZ@_@YGH\t^PHLO\tNLQHUGUG["));
        }
        int n2 = arg2;
        int n3 = arg1;
        if (this.cfr_renamed_102 < 64) {
            n = Math.min(n2, 64 - this.cfr_renamed_102);
            sprvml sprvml3 = this;
            System.arraycopy(this.cfr_renamed_724, sprvml3.cfr_renamed_102, arg0, n3, n);
            sprvml3.cfr_renamed_102 += n;
            n3 += n;
            n2 -= n;
        }
        int n4 = n2;
        while (n4 > 0) {
            sprvml sprvml4 = this;
            sprvml4.cfr_renamed_10545();
            n = Math.min(n2, 64);
            System.arraycopy(sprvml4.cfr_renamed_724, 0, arg0, n3, n);
            sprvml4.cfr_renamed_102 += n;
            n3 += n;
            n4 = n2 - n;
        }
        this.spr\ufe34 -= (long)arg2;
        return arg2;
    }

    private /* synthetic */ void cfr_renamed_10534() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_82.length) {
            int n3 = n;
            this.cfr_renamed_82[n3] = n3;
            n2 = n = (int)((byte)(n3 + 1));
        }
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_10546();
        this.cfr_renamed_102 = 0;
        this.cfr_renamed_88 = false;
        sproze.cfr_renamed_492(this.cfr_renamed_724, (byte)0);
    }

    public sprvml() {
        this(256);
    }

    private /* synthetic */ void cfr_renamed_10547() {
        sprvml sprvml2 = this;
        sprvml sprvml3 = this;
        System.arraycopy(sprvml2.cfr_renamed_314, 0, sprvml3.cfr_renamed_86, 0, 8);
        System.arraycopy(cfr_renamed_1226, 0, this.cfr_renamed_86, 8, 4);
        sprvml3.cfr_renamed_86[12] = 0;
        sprvml2.cfr_renamed_86[13] = 0;
        sprvml2.cfr_renamed_86[14] = 64;
        sprvml2.cfr_renamed_86[15] = this.cfr_renamed_957 | 4;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprvml(this);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        Iterator iterator;
        sprvml sprvml2;
        sprvml sprvml3 = sprvml2 = (sprvml)arg0;
        sprvml sprvml4 = this;
        sprvml sprvml5 = sprvml2;
        sprvml sprvml6 = this;
        sprvml sprvml7 = sprvml2;
        this.cfr_renamed_272 = sprvml7.cfr_renamed_272;
        sprvml6.cfr_renamed_1 = sprvml7.cfr_renamed_1;
        sprvml6.cfr_renamed_957 = sprvml2.cfr_renamed_957;
        this.cfr_renamed_88 = sprvml5.cfr_renamed_88;
        sprvml4.spr\ufe34 = sprvml5.spr\ufe34;
        sprvml4.cfr_renamed_132 = sprvml2.cfr_renamed_132;
        this.cfr_renamed_185 = sprvml3.cfr_renamed_185;
        System.arraycopy(sprvml3.cfr_renamed_4, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        System.arraycopy(sprvml2.cfr_renamed_314, 0, this.cfr_renamed_314, 0, this.cfr_renamed_314.length);
        System.arraycopy(sprvml2.cfr_renamed_728, 0, this.cfr_renamed_728, 0, this.cfr_renamed_728.length);
        this.cfr_renamed_79.clear();
        Iterator iterator2 = iterator = sprvml2.cfr_renamed_79.iterator();
        while (iterator2.hasNext()) {
            this.cfr_renamed_79.push(sproze.cfr_renamed_535((int[])iterator.next()));
            iterator2 = iterator;
        }
        System.arraycopy(sprvml2.cfr_renamed_724, 0, this.cfr_renamed_724, 0, this.cfr_renamed_724.length);
        this.cfr_renamed_102 = sprvml2.cfr_renamed_102;
    }

    private /* synthetic */ void cfr_renamed_10548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg0 << 1;
        sprvml sprvml2 = this;
        int n2 = arg1;
        sprvml sprvml3 = this;
        byte by = sprvml3.cfr_renamed_82[n];
        ++n;
        sprvml2.cfr_renamed_86[n2] = sprvml2.cfr_renamed_86[n2] + (this.cfr_renamed_86[arg2] + sprvml3.cfr_renamed_728[by]);
        sprvml sprvml4 = this;
        sprvml2.cfr_renamed_86[arg4] = spruaf.cfr_renamed_493(sprvml4.cfr_renamed_86[arg4] ^ this.cfr_renamed_86[arg1], 16);
        int n3 = arg3;
        sprvml4.cfr_renamed_86[n3] = sprvml4.cfr_renamed_86[n3] + this.cfr_renamed_86[arg4];
        int n4 = arg2;
        sprvml2.cfr_renamed_86[n4] = spruaf.cfr_renamed_493(this.cfr_renamed_86[n4] ^ this.cfr_renamed_86[arg3], 12);
        int n5 = arg1;
        sprvml sprvml5 = this;
        sprvml2.cfr_renamed_86[n5] = sprvml2.cfr_renamed_86[n5] + (this.cfr_renamed_86[arg2] + sprvml5.cfr_renamed_728[sprvml5.cfr_renamed_82[n]]);
        int n6 = arg4;
        sprvml2.cfr_renamed_86[n6] = spruaf.cfr_renamed_493(this.cfr_renamed_86[n6] ^ this.cfr_renamed_86[arg1], 8);
        int n7 = arg3;
        sprvml2.cfr_renamed_86[n7] = sprvml2.cfr_renamed_86[n7] + this.cfr_renamed_86[arg4];
        int n8 = arg2;
        sprvml2.cfr_renamed_86[n8] = spruaf.cfr_renamed_493(this.cfr_renamed_86[n8] ^ this.cfr_renamed_86[arg3], 7);
    }

    /*
     * WARNING - void declaration
     */
    public sprvml(sprvml sprvml2) {
        void arg0;
        void v0 = arg0;
        sprvml sprvml3 = this;
        sprvml sprvml4 = this;
        sprvml sprvml5 = this;
        sprvml5.cfr_renamed_724 = new byte[64];
        sprvml5.cfr_renamed_314 = new int[8];
        sprvml4.cfr_renamed_4 = new int[8];
        sprvml4.cfr_renamed_86 = new int[16];
        sprvml3.cfr_renamed_728 = new int[16];
        sprvml3.cfr_renamed_82 = new byte[16];
        sprvml sprvml6 = this;
        sprvml3.cfr_renamed_79 = new Stack();
        this.cfr_renamed_126 = v0.cfr_renamed_126;
        this.cfr_renamed_145 = v0.cfr_renamed_145;
        this.cfr_renamed_5183(sprvml2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_88) {
            throw new IllegalStateException(cfr_renamed_152);
        }
        if (this.cfr_renamed_724.length - this.cfr_renamed_102 == 0) {
            sprvml sprvml2 = this;
            sprvml2.cfr_renamed_10549(this.cfr_renamed_724, 0);
            sproze.cfr_renamed_492(sprvml2.cfr_renamed_724, (byte)0);
            sprvml2.cfr_renamed_102 = 0;
        }
        sprvml sprvml3 = this;
        sprvml3.cfr_renamed_724[sprvml3.cfr_renamed_102] = arg0;
        ++sprvml3.cfr_renamed_102;
    }

    private /* synthetic */ void cfr_renamed_10550() {
        System.arraycopy(cfr_renamed_1226, 0, this.cfr_renamed_314, 0, 8);
    }

    private /* synthetic */ void cfr_renamed_10544() {
        sprvml sprvml2 = this;
        while (!sprvml2.cfr_renamed_79.isEmpty()) {
            System.arraycopy((int[])this.cfr_renamed_79.pop(), 0, this.cfr_renamed_728, 0, 8);
            sprvml sprvml3 = this;
            sprvml sprvml4 = this;
            System.arraycopy(sprvml3.cfr_renamed_4, 0, sprvml4.cfr_renamed_728, 8, 8);
            sprvml4.cfr_renamed_10547();
            if (sprvml3.cfr_renamed_79.isEmpty()) {
                this.cfr_renamed_10540();
            }
            sprvml sprvml5 = this;
            sprvml2 = sprvml5;
            sprvml5.cfr_renamed_10499();
        }
    }

    private /* synthetic */ void cfr_renamed_10545() {
        sprvml sprvml2 = this;
        ++sprvml2.cfr_renamed_272;
        sprvml sprvml3 = this;
        System.arraycopy(sprvml2.cfr_renamed_4, 0, sprvml3.cfr_renamed_86, 0, 8);
        System.arraycopy(cfr_renamed_1226, 0, this.cfr_renamed_86, 8, 4);
        sprvml3.cfr_renamed_86[12] = (int)this.cfr_renamed_272;
        sprvml2.cfr_renamed_86[13] = (int)(this.cfr_renamed_272 >> 32);
        sprvml2.cfr_renamed_86[14] = this.cfr_renamed_185;
        sprvml2.cfr_renamed_86[15] = this.cfr_renamed_132;
        sprvml2.cfr_renamed_10499();
    }

    /*
     * WARNING - void declaration
     */
    public sprvml(int n, spriil spriil2) {
        void arg0;
        void arg1;
        sprvml sprvml2 = this;
        sprvml sprvml3 = this;
        sprvml sprvml4 = this;
        sprvml sprvml5 = this;
        sprvml sprvml6 = this;
        sprvml6.cfr_renamed_724 = new byte[64];
        sprvml6.cfr_renamed_314 = new int[8];
        sprvml5.cfr_renamed_4 = new int[8];
        sprvml5.cfr_renamed_86 = new int[16];
        sprvml4.cfr_renamed_728 = new int[16];
        sprvml4.cfr_renamed_82 = new byte[16];
        sprvml sprvml7 = this;
        sprvml4.cfr_renamed_79 = new Stack();
        sprvml3.cfr_renamed_145 = arg1;
        sprvml3.cfr_renamed_126 = arg0 / 8;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprvml2, sprvml2.cfr_renamed_1218() * 8, (spriil)arg1));
        sprvml2.cfr_renamed_10122(null);
    }

    private /* synthetic */ void cfr_renamed_10540() {
        sprvml sprvml2 = this;
        sprvml sprvml3 = this;
        sprvml3.cfr_renamed_86[15] = sprvml3.cfr_renamed_86[15] | 8;
        sprvml3.cfr_renamed_132 = sprvml3.cfr_renamed_86[15];
        sprvml2.cfr_renamed_185 = sprvml3.cfr_renamed_86[14];
        sprvml2.cfr_renamed_272 = 0L;
        this.cfr_renamed_88 = true;
        this.spr\ufe34 = -1L;
        System.arraycopy(this.cfr_renamed_86, 0, this.cfr_renamed_4, 0, 8);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg0 == null || arg2 == 0) {
            return;
        }
        if (this.cfr_renamed_88) {
            throw new IllegalStateException(cfr_renamed_152);
        }
        int n2 = 0;
        if (this.cfr_renamed_102 != 0) {
            n2 = 64 - this.cfr_renamed_102;
            if (n2 >= arg2) {
                sprvml sprvml2 = this;
                System.arraycopy(arg0, arg1, sprvml2.cfr_renamed_724, this.cfr_renamed_102, arg2);
                sprvml2.cfr_renamed_102 += arg2;
                return;
            }
            sprvml sprvml3 = this;
            System.arraycopy(arg0, arg1, sprvml3.cfr_renamed_724, sprvml3.cfr_renamed_102, n2);
            sprvml sprvml4 = this;
            sprvml4.cfr_renamed_10549(this.cfr_renamed_724, 0);
            sprvml4.cfr_renamed_102 = 0;
            sproze.cfr_renamed_492(sprvml4.cfr_renamed_724, (byte)0);
        }
        int n3 = arg1 + arg2 - 64;
        int n4 = n = arg1 + n2;
        while (n4 < n3) {
            int n5 = n;
            this.cfr_renamed_10549(arg0, n5);
            n4 = n += 64;
        }
        int n6 = arg2 - n;
        sprvml sprvml5 = this;
        System.arraycopy(arg0, n, sprvml5.cfr_renamed_724, 0, arg1 + n6);
        sprvml5.cfr_renamed_102 += arg1 + n6;
    }

    private /* synthetic */ void cfr_renamed_10539() {
        ++this.cfr_renamed_272;
        this.cfr_renamed_1 = 0;
    }

    static {
        byte[] byArray = new byte[16];
        byArray[0] = 2;
        byArray[1] = 6;
        byArray[2] = 3;
        byArray[3] = 10;
        byArray[4] = 7;
        byArray[5] = 0;
        byArray[6] = 4;
        byArray[7] = 13;
        byArray[8] = 1;
        byArray[9] = 11;
        byArray[10] = 12;
        byArray[11] = 5;
        byArray[12] = 9;
        byArray[13] = 14;
        byArray[14] = 15;
        byArray[15] = 8;
        cfr_renamed_137 = byArray;
        int[] nArray = new int[8];
        nArray[0] = 1779033703;
        nArray[1] = -1150833019;
        nArray[2] = 1013904242;
        nArray[3] = -1521486534;
        nArray[4] = 1359893119;
        nArray[5] = -1694144372;
        nArray[6] = 528734635;
        nArray[7] = 1541459225;
        cfr_renamed_1226 = nArray;
    }

    private /* synthetic */ void cfr_renamed_10546() {
        sprvml sprvml2 = this;
        sprvml2.cfr_renamed_272 = 0L;
        sprvml2.cfr_renamed_1 = 0;
    }

    private /* synthetic */ void cfr_renamed_10551() {
        System.arraycopy(this.cfr_renamed_86, 0, this.cfr_renamed_314, 0, 8);
        this.cfr_renamed_957 = 64;
    }

    public void cfr_renamed_10122(sprfrk arg0) {
        byte[] byArray = arg0 == null ? null : arg0.cfr_renamed_1521();
        byte[] byArray2 = arg0 == null ? null : arg0.cfr_renamed_2820();
        this.cfr_renamed_41();
        if (byArray != null) {
            this.cfr_renamed_10541(byArray);
            sproze.cfr_renamed_492(byArray, (byte)0);
            return;
        }
        sprvml sprvml2 = this;
        if (byArray2 != null) {
            sprvml2.cfr_renamed_10550();
            this.cfr_renamed_957 = 32;
            this.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprvml sprvml3 = this;
            sprvml3.cfr_renamed_1219(sprvml3.cfr_renamed_724, 0);
            sprvml sprvml4 = this;
            sprvml4.cfr_renamed_10551();
            sprvml4.cfr_renamed_41();
            return;
        }
        sprvml2.cfr_renamed_10550();
        this.cfr_renamed_957 = 0;
    }

    private /* synthetic */ void cfr_renamed_10537() {
        int n;
        if (this.cfr_renamed_88) {
            int n2;
            int n3 = n2 = 0;
            while (n3 < 8) {
                sprvml sprvml2 = this;
                int n4 = n2;
                sprvml2.cfr_renamed_86[n4] = sprvml2.cfr_renamed_86[n4] ^ this.cfr_renamed_86[n2 + 8];
                int n5 = n2 + 8;
                int n6 = sprvml2.cfr_renamed_86[n5] ^ this.cfr_renamed_4[n2];
                sprvml2.cfr_renamed_86[n5] = n6;
                n3 = ++n2;
            }
            sprvml sprvml3 = this;
            sprpxe.cfr_renamed_449(sprvml3.cfr_renamed_86, sprvml3.cfr_renamed_724, 0);
            this.cfr_renamed_102 = 0;
            return;
        }
        int n7 = n = 0;
        while (n7 < 8) {
            sprvml sprvml4 = this;
            int n8 = n;
            int n9 = sprvml4.cfr_renamed_86[n] ^ this.cfr_renamed_86[n8 + 8];
            sprvml4.cfr_renamed_4[n8] = n9;
            n7 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_10552() {
        sprvml sprvml2;
        block2: {
            long l;
            long l2 = l = this.cfr_renamed_272;
            while (l2 > 0L) {
                if ((l & 1L) == 1L) {
                    sprvml2 = this;
                    break block2;
                }
                System.arraycopy((int[])this.cfr_renamed_79.pop(), 0, this.cfr_renamed_728, 0, 8);
                sprvml sprvml3 = this;
                sprvml sprvml4 = this;
                System.arraycopy(sprvml3.cfr_renamed_4, 0, sprvml4.cfr_renamed_728, 8, 8);
                sprvml4.cfr_renamed_10547();
                sprvml3.cfr_renamed_10499();
                l2 = l >> 1;
            }
            sprvml2 = this;
        }
        sprvml2.cfr_renamed_79.push(sproze.cfr_renamed_541(this.cfr_renamed_4, 8));
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        sprvml sprvml2 = this;
        int n = sprvml2.cfr_renamed_6410(arg0, arg1, arg2);
        sprvml2.cfr_renamed_41();
        return n;
    }

    private /* synthetic */ void cfr_renamed_10549(byte[] arg0, int arg1) {
        sprvml sprvml2 = this;
        sprvml sprvml3 = this;
        sprvml3.cfr_renamed_10538(64, false);
        sprvml3.cfr_renamed_10542(arg0, arg1);
        sprvml2.cfr_renamed_10499();
        if (sprvml2.cfr_renamed_1 == 0) {
            this.cfr_renamed_10552();
        }
    }

    public sprvml(int arg0) {
        this(arg0 > 100 ? arg0 : arg0 * 8, spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_3248() {
        return 64;
    }

    private /* synthetic */ void cfr_renamed_10536() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_82.length) {
            int n3 = n;
            this.cfr_renamed_82[n3] = cfr_renamed_137[this.cfr_renamed_82[n]];
            n2 = n = (int)((byte)(n3 + 1));
        }
    }

    private /* synthetic */ void cfr_renamed_10535() {
        sprvml sprvml2 = this;
        sprvml sprvml3 = this;
        sprvml sprvml4 = this;
        sprvml sprvml5 = this;
        sprvml5.cfr_renamed_10548(0, 0, 4, 8, 12);
        sprvml5.cfr_renamed_10548(1, 1, 5, 9, 13);
        sprvml4.cfr_renamed_10548(2, 2, 6, 10, 14);
        sprvml4.cfr_renamed_10548(3, 3, 7, 11, 15);
        sprvml3.cfr_renamed_10548(4, 0, 5, 10, 15);
        sprvml3.cfr_renamed_10548(5, 1, 6, 11, 12);
        sprvml2.cfr_renamed_10548(6, 2, 7, 8, 13);
        sprvml2.cfr_renamed_10548(7, 3, 4, 9, 14);
    }
}

