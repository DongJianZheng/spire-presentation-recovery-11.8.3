/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.sprau;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprhrk;
import com.spire.presentation.packages.sprjxk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnjo;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprysk;
import com.spire.presentation.packages.sprzu;

public class sprltk
implements sprzu {
    private static final int cfr_renamed_272 = 16;
    private static final int cfr_renamed_145 = 0x7FFFFFE7;
    private static final int cfr_renamed_114 = 8;
    private final byte[] cfr_renamed_96;
    private static final int cfr_renamed_105 = 2;
    private final sprysk cfr_renamed_137;
    private byte[] cfr_renamed_79;
    private sprjxk cfr_renamed_107;
    private final sprysk cfr_renamed_132;
    private int cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private final sprmr cfr_renamed_86;
    private final sprau cfr_renamed_152;
    private final byte[] cfr_renamed_112;
    private static final byte cfr_renamed_119 = -128;
    private static final int cfr_renamed_91 = 12;
    private static final int cfr_renamed_0 = 1;
    private byte[] cfr_renamed_1;
    private static final byte cfr_renamed_2 = -31;
    private sprjxk cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_10036() {
        byte[] byArray = new byte[16];
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_10037();
        sprltk.cfr_renamed_10038(sprltk2.cfr_renamed_96, 0, 16, byArray);
        return byArray;
    }

    public static /* synthetic */ void cfr_renamed_10039(byte[] arg0, int arg1, int arg2, byte[] arg3) {
        sprltk.cfr_renamed_10038(arg0, arg1, arg2, arg3);
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_10040(1);
        sprltk2.cfr_renamed_132.cfr_renamed_10041(arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_86.cfr_renamed_1315()).append(sproxfa.cfr_renamed_9(". @*.4J1")).toString();
    }

    private /* synthetic */ void cfr_renamed_10037() {
        byte[] byArray = new byte[16];
        sprpxe.cfr_renamed_450(8L * this.cfr_renamed_137.cfr_renamed_10042(), byArray, 0);
        sprpxe.cfr_renamed_450(8L * this.cfr_renamed_132.cfr_renamed_10042(), byArray, 8);
        this.cfr_renamed_10043(byArray);
    }

    public static /* synthetic */ void cfr_renamed_10044(sprltk arg0, byte[] arg1) {
        arg0.cfr_renamed_10043(arg1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_2417(byte[] byArray, int n, int n2) {
        void arg0;
        void arg1;
        void arg2;
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_10040((int)arg2);
        sprltk.cfr_renamed_10045(byArray, (int)arg1, (int)arg2, false);
        sprltk2.cfr_renamed_132.cfr_renamed_10046((byte[])arg0, (int)arg1, (int)arg2);
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_10047(1);
        if (sprltk2.cfr_renamed_4) {
            sprltk sprltk3 = this;
            sprltk3.cfr_renamed_3.write(arg0);
            sprltk3.cfr_renamed_137.cfr_renamed_10041(arg0);
        } else {
            this.cfr_renamed_107.write(arg0);
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_505(byte[] byArray, int n, int n2, byte[] byArray2, int n3) throws sprddl {
        void arg0;
        void arg1;
        void arg2;
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_10047((int)arg2);
        sprltk.cfr_renamed_10045(byArray, (int)arg1, (int)arg2, false);
        if (sprltk2.cfr_renamed_4) {
            sprltk sprltk3 = this;
            sprltk3.cfr_renamed_3.write((byte[])arg0, (int)arg1, (int)arg2);
            sprltk3.cfr_renamed_137.cfr_renamed_10046((byte[])arg0, (int)arg1, (int)arg2);
        } else {
            this.cfr_renamed_107.write((byte[])arg0, (int)arg1, (int)arg2);
        }
        return 0;
    }

    private /* synthetic */ int cfr_renamed_10048(byte[] arg0, byte[] arg1, int arg2) {
        sprltk sprltk2 = this;
        byte[] byArray = sprltk2.cfr_renamed_3.cfr_renamed_3461();
        byte[] byArray2 = sproze.cfr_renamed_158(arg0);
        byArray2[15] = (byte)(byArray2[15] | 0xFFFFFF80);
        byte[] byArray3 = new byte[16];
        int n = sprltk2.cfr_renamed_3.size();
        int n2 = 0;
        int n3 = n;
        while (n3 > 0) {
            this.cfr_renamed_86.cfr_renamed_3064(byArray2, 0, byArray3, 0);
            int n4 = Math.min(16, n);
            sprltk.cfr_renamed_10049(byArray3, byArray, n2, n4);
            System.arraycopy(byArray3, 0, arg1, arg2 + n2, n4);
            n2 += n4;
            sprltk.cfr_renamed_10050(byArray2);
            n3 = n -= n4;
        }
        return this.cfr_renamed_3.size();
    }

    private static /* synthetic */ void cfr_renamed_10050(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = n++;
            arg0[n3] = (byte)(arg0[n3] + 1);
            if (arg0[n3] != 0) {
                return;
            }
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_10043(byte[] arg0) {
        sprltk sprltk2 = this;
        sprltk.cfr_renamed_10051(sprltk2.cfr_renamed_96, arg0);
        sprltk2.cfr_renamed_152.cfr_renamed_3237(this.cfr_renamed_96);
    }

    private /* synthetic */ void cfr_renamed_10052(sprtpk arg0) {
        byte[] byArray = new byte[16];
        byte[] byArray2 = new byte[16];
        byte[] byArray3 = new byte[16];
        byte[] byArray4 = new byte[arg0.cfr_renamed_4600()];
        sprltk sprltk2 = this;
        System.arraycopy(sprltk2.cfr_renamed_93, 0, byArray, 4, 12);
        sprltk2.cfr_renamed_86.cfr_renamed_5535(true, arg0);
        int n = 0;
        sprltk2.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
        System.arraycopy(byArray2, 0, byArray3, n, 8);
        byArray[0] = (byte)(byArray[0] + 1);
        this.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
        byte[] byArray5 = byArray;
        System.arraycopy(byArray2, 0, byArray3, n += 8, 8);
        byArray5[0] = (byte)(byArray5[0] + 1);
        n = 0;
        this.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
        System.arraycopy(byArray2, 0, byArray4, n, 8);
        byArray[0] = (byte)(byArray[0] + 1);
        this.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
        System.arraycopy(byArray2, 0, byArray4, n += 8, 8);
        if (byArray4.length == 32) {
            byArray[0] = (byte)(byArray[0] + 1);
            this.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
            System.arraycopy(byArray2, 0, byArray4, n += 8, 8);
            byArray[0] = (byte)(byArray[0] + 1);
            this.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
            System.arraycopy(byArray2, 0, byArray4, n += 8, 8);
        }
        sprltk sprltk3 = this;
        this.cfr_renamed_86.cfr_renamed_5535(true, new sprtpk(byArray4));
        sprltk.cfr_renamed_10038(byArray3, 0, 16, byArray2);
        sprltk.cfr_renamed_10053(byArray2);
        sprltk3.cfr_renamed_152.cfr_renamed_148(byArray2);
        sprltk3.cfr_renamed_102 |= 1;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return 0;
    }

    private static /* synthetic */ void cfr_renamed_10038(byte[] arg0, int arg1, int arg2, byte[] arg3) {
        int n = 0;
        int n2 = 15;
        int n3 = n;
        while (n3 < arg2) {
            byte by = arg0[arg1 + n];
            arg3[n2] = by;
            --n2;
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprltk(sprmr sprmr2, sprau sprau2) {
        void arg1;
        void arg0;
        sprltk sprltk2 = this;
        this.cfr_renamed_96 = new byte[16];
        sprltk2.cfr_renamed_112 = new byte[16];
        sprltk2.cfr_renamed_1 = new byte[16];
        if (sprmr2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprnjo.cfr_renamed_9("vDEEP_\u0015_P\\@DGHQ\rBDAE\u0015L\u0015OYBVF\u0015^\\WP\rZK\u0015\u001c\u0003\u0003"));
        }
        sprltk sprltk3 = this;
        sprltk sprltk4 = this;
        sprltk4.cfr_renamed_86 = arg0;
        sprltk3.cfr_renamed_152 = arg1;
        sprltk sprltk5 = this;
        sprltk4.cfr_renamed_132 = new sprysk(this, null);
        sprltk3.cfr_renamed_137 = new sprysk(this, null);
    }

    private static /* synthetic */ void cfr_renamed_10053(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 16) {
            byte by = arg0[n];
            arg0[n] = (byte)(by >> 1 & 0x7F | n2);
            n2 = (by & 1) == 0 ? 0 : -128;
            n3 = ++n;
        }
        if (n2 != 0) {
            arg0[0] = (byte)(arg0[0] ^ 0xFFFFFFE1);
        }
    }

    private /* synthetic */ void cfr_renamed_10040(int arg0) {
        if ((this.cfr_renamed_102 & 1) == 0) {
            throw new IllegalStateException(sproxfa.cfr_renamed_9("$j\u0017k\u0002qGj\u0014#\tl\u0013#\u000em\u000ew\u000eb\u000bj\u0014f\u0003"));
        }
        if ((this.cfr_renamed_102 & 2) != 0) {
            throw new IllegalStateException(sprnjo.cfr_renamed_9("lplq\rQLAL\u0015NTC[BA\rWH\u0015]GBVHF^PI\u0015LSYP_\u0015BGI\\CT_L\rQLAL"));
        }
        if (this.cfr_renamed_132.cfr_renamed_10042() + Long.MIN_VALUE > (long)(0x7FFFFFE7 - arg0) + Long.MIN_VALUE) {
            throw new IllegalStateException(sproxfa.cfr_renamed_9("B\"B##\u0005z\u0013fG`\bv\twGf\u001f`\u0002f\u0003f\u0003"));
        }
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_86;
    }

    public sprltk() {
        this(sprael.cfr_renamed_7529());
    }

    public static /* synthetic */ byte[] cfr_renamed_10046(sprltk arg0) {
        return arg0.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        if (this.cfr_renamed_4) {
            return arg0 + this.cfr_renamed_3.size() + 16;
        }
        int n = arg0 + this.cfr_renamed_107.size();
        if (n > 16) {
            return n - 16;
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_10054() throws sprull {
        sprltk sprltk2 = this;
        byte[] byArray = sprltk2.cfr_renamed_107.cfr_renamed_3461();
        int n = sprltk2.cfr_renamed_107.size() - 16;
        if (n < 0) {
            throw new sprull(sprnjo.cfr_renamed_9("qLAL\u0015YZB\u0015^]BGY"));
        }
        int n2 = n;
        byte[] byArray2 = sproze.cfr_renamed_533(byArray, n2, n2 + 16);
        byte[] byArray3 = sproze.cfr_renamed_158(byArray2);
        byArray3[15] = (byte)(byArray3[15] | 0xFFFFFF80);
        byte[] byArray4 = new byte[16];
        int n3 = 0;
        int n4 = n;
        while (n4 > 0) {
            this.cfr_renamed_86.cfr_renamed_3064(byArray3, 0, byArray4, 0);
            int n5 = Math.min(16, n);
            sprltk sprltk3 = this;
            sprltk.cfr_renamed_10049(byArray4, byArray, n3, n5);
            sprltk3.cfr_renamed_3.write(byArray4, 0, n5);
            sprltk3.cfr_renamed_137.cfr_renamed_10046(byArray4, 0, n5);
            n3 += n5;
            sprltk.cfr_renamed_10050(byArray3);
            n4 = n -= n5;
        }
        byte[] byArray5 = this.cfr_renamed_10055();
        if (!sproze.cfr_renamed_559(byArray5, byArray2)) {
            this.cfr_renamed_41();
            throw new sprull(sproxfa.cfr_renamed_9("n\u0006`G`\u000ff\u0004hGe\u0006j\u000bf\u0003"));
        }
        System.arraycopy(byArray5, 0, this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
    }

    private static /* synthetic */ void cfr_renamed_10051(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public sprltk(sprmr arg0) {
        this(arg0, new sprhrk());
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        byte[] byArray;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        sprtpk sprtpk2 = null;
        if (arg1 instanceof sprtxk) {
            sprtxk sprtxk2 = (sprtxk)arg1;
            byArray2 = sprtxk2.cfr_renamed_3388();
            byArray3 = sprtxk2.cfr_renamed_596();
            sprtpk2 = sprtxk2.cfr_renamed_1521();
            byArray = byArray3;
        } else if (arg1 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byArray3 = sprkpk2.cfr_renamed_1205();
            sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
            byArray = byArray3;
        } else {
            throw new IllegalArgumentException(sprnjo.cfr_renamed_9("\\CCLYDQ\rELGLXHAHG^\u0015]T^FHQ\rAB\u0015jv`\u0018~|{"));
        }
        if (byArray == null || byArray3.length != 12) {
            throw new IllegalArgumentException(sproxfa.cfr_renamed_9(".m\u0011b\u000bj\u0003#\tl\t`\u0002"));
        }
        if (sprtpk2 == null || sprtpk2.cfr_renamed_4600() != 16 && sprtpk2.cfr_renamed_4600() != 32) {
            throw new IllegalArgumentException(sprnjo.cfr_renamed_9("d[[TA\\I\u0015FPT"));
        }
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_4 = arg0;
        sprltk2.cfr_renamed_79 = byArray2;
        this.cfr_renamed_93 = byArray3;
        this.cfr_renamed_10052(sprtpk2);
        this.cfr_renamed_10056();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_10056();
    }

    private /* synthetic */ byte[] cfr_renamed_10055() {
        int n;
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_137.cfr_renamed_10057();
        byte[] byArray = sprltk2.cfr_renamed_10036();
        byte[] byArray2 = new byte[16];
        int n2 = n = 0;
        while (n2 < 12) {
            int n3 = n;
            byte by = (byte)(byArray[n3] ^ this.cfr_renamed_93[n]);
            byArray[n3] = by;
            n2 = ++n;
        }
        byArray[15] = (byte)(byArray[15] & 0xFFFFFF7F);
        this.cfr_renamed_86.cfr_renamed_3064(byArray, 0, byArray2, 0);
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) throws IllegalStateException, sprull {
        void arg0;
        void arg1;
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_10047(0);
        sprltk.cfr_renamed_10045(byArray, (int)arg1, this.cfr_renamed_1202(0), true);
        if (sprltk2.cfr_renamed_4) {
            byte[] byArray2 = this.cfr_renamed_10055();
            int n2 = 16 + this.cfr_renamed_10048(byArray2, (byte[])arg0, (int)arg1);
            System.arraycopy(byArray2, 0, arg0, (int)(arg1 + this.cfr_renamed_3.size()), 16);
            System.arraycopy(byArray2, 0, this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
            this.cfr_renamed_10056();
            return n2;
        }
        sprltk sprltk3 = this;
        sprltk3.cfr_renamed_10054();
        int n3 = sprltk3.cfr_renamed_3.size();
        byte[] byArray3 = sprltk3.cfr_renamed_3.cfr_renamed_3461();
        System.arraycopy(byArray3, 0, arg0, (int)arg1, n3);
        sprltk3.cfr_renamed_10056();
        return n3;
    }

    private static /* synthetic */ void cfr_renamed_10045(byte[] arg0, int arg1, int arg2, boolean arg3) {
        boolean bl;
        int n = sprltk.cfr_renamed_10058(arg0);
        int n2 = arg1 + arg2;
        boolean bl2 = bl = arg2 < 0 || arg1 < 0 || n2 < 0;
        if (bl || n2 > n) {
            throw arg3 ? new sprwjl(sproxfa.cfr_renamed_9("L\u0012w\u0017v\u0013#\u0005v\u0001e\u0002qGw\blGp\u000fl\u0015wI")) : new sprddl(sprnjo.cfr_renamed_9("d[]@Y\u0015O@KSHG\rABZ\rFEZ_A\u0003"));
        }
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_10056() {
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_10059();
        }
        sprltk sprltk2 = this;
        sprltk2.cfr_renamed_132.cfr_renamed_41();
        sprltk2.cfr_renamed_137.cfr_renamed_41();
        sprltk sprltk3 = this;
        sprltk3.cfr_renamed_3 = new sprjxk();
        sprltk2.cfr_renamed_107 = sprltk2.cfr_renamed_4 ? null : new sprjxk();
        sprltk sprltk4 = this;
        sprltk4.cfr_renamed_102 &= 0xFFFFFFFD;
        sproze.cfr_renamed_492(sprltk4.cfr_renamed_96, (byte)0);
        if (sprltk4.cfr_renamed_79 != null) {
            sprltk sprltk5 = this;
            sprltk5.cfr_renamed_132.cfr_renamed_10046(sprltk5.cfr_renamed_79, 0, this.cfr_renamed_79.length);
        }
    }

    private /* synthetic */ void cfr_renamed_10047(int arg0) {
        if ((this.cfr_renamed_102 & 1) == 0) {
            throw new IllegalStateException(sproxfa.cfr_renamed_9("$j\u0017k\u0002qGj\u0014#\tl\u0013#\u000em\u000ew\u000eb\u000bj\u0014f\u0003"));
        }
        if ((this.cfr_renamed_102 & 2) == 0) {
            sprltk sprltk2 = this;
            sprltk2.cfr_renamed_132.cfr_renamed_10057();
            sprltk2.cfr_renamed_102 |= 2;
        }
        long l = 0x7FFFFFE7L;
        sprltk sprltk3 = this;
        long l2 = sprltk3.cfr_renamed_3.size();
        if (!sprltk3.cfr_renamed_4) {
            l += 16L;
            l2 = this.cfr_renamed_107.size();
        }
        if (l2 + Long.MIN_VALUE > l - (long)arg0 + Long.MIN_VALUE) {
            throw new IllegalStateException(sprnjo.cfr_renamed_9("OLYP\rVB@CA\rPUVHPIPI"));
        }
    }

    private static /* synthetic */ int cfr_renamed_10058(byte[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        return arg0.length;
    }

    private static /* synthetic */ void cfr_renamed_10049(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < arg3) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n + arg2]);
            arg0[n3] = by;
            n2 = ++n;
        }
    }
}

