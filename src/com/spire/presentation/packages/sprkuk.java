/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdtq;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.spruip;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzu;
import java.util.Vector;

public class sprkuk
implements sprzu {
    private byte[] cfr_renamed_88;
    private int cfr_renamed_31;
    private byte[] cfr_renamed_272;
    private sprmr cfr_renamed_145;
    private int cfr_renamed_114;
    private long cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private byte[] cfr_renamed_137;
    private boolean cfr_renamed_79;
    private int cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private sprmr cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private long cfr_renamed_112;
    private static final int cfr_renamed_119 = 16;
    private byte[] cfr_renamed_91;
    private Vector cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3212(byte by) {
        void arg0;
        sprkuk sprkuk2 = this;
        this.cfr_renamed_86[sprkuk2.cfr_renamed_31] = arg0;
        if (++sprkuk2.cfr_renamed_31 == this.cfr_renamed_86.length) {
            this.cfr_renamed_3398();
        }
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_114;
        if (this.cfr_renamed_79) {
            return n + this.cfr_renamed_107;
        }
        if (n < this.cfr_renamed_107) {
            return 0;
        }
        return n - this.cfr_renamed_107;
    }

    public static int cfr_renamed_3403(byte[] arg0, byte[] arg1) {
        int n = 16;
        int n2 = 0;
        while (--n >= 0) {
            int n3 = arg0[n] & 0xFF;
            arg1[n] = (byte)(n3 << 1 | n2);
            n2 = n3 >>> 7 & 1;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sprkuk sprkuk2;
        sprkuk sprkuk3;
        sprtpk sprtpk2;
        sprkuk sprkuk4;
        int n;
        byte[] byArray;
        sprbj sprbj3;
        void arg1;
        void arg0;
        boolean bl2 = this.cfr_renamed_79;
        this.cfr_renamed_79 = arg0;
        this.cfr_renamed_105 = null;
        if (sprbj2 instanceof sprtxk) {
            sprbj3 = (sprtxk)arg1;
            byArray = ((sprtxk)sprbj3).cfr_renamed_596();
            sprbj sprbj4 = sprbj3;
            this.cfr_renamed_3 = ((sprtxk)sprbj4).cfr_renamed_3388();
            n = ((sprtxk)sprbj4).cfr_renamed_2404();
            if (n < 64 || n > 128 || n % 8 != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spruip.cfr_renamed_9("wkHdRlZ%HdRp[%XjL%sD}%MlD`\u0004%")).append(n).toString());
            }
            sprkuk4 = this;
            this.cfr_renamed_107 = n / 8;
            sprtpk2 = ((sprtxk)sprbj3).cfr_renamed_1521();
        } else if (arg1 instanceof sprkpk) {
            sprbj3 = (sprkpk)arg1;
            byArray = ((sprkpk)sprbj3).cfr_renamed_1205();
            sprkuk sprkuk5 = this;
            sprkuk5.cfr_renamed_3 = null;
            sprkuk5.cfr_renamed_107 = 16;
            sprtpk2 = (sprtpk)((sprkpk)sprbj3).cfr_renamed_284();
            sprkuk4 = this;
        } else {
            throw new IllegalArgumentException(sprdtq.cfr_renamed_9("&_9P#X+\u0011?P=P\"T;T=BoA.B<T+\u0011;^o~\fs"));
        }
        sprkuk4.cfr_renamed_86 = new byte[16];
        this.cfr_renamed_1 = new byte[arg0 != false ? 16 : 16 + this.cfr_renamed_107];
        if (byArray == null) {
            byArray = new byte[]{};
        }
        if (byArray.length > 15) {
            throw new IllegalArgumentException(spruip.cfr_renamed_9("wS\u001ehKvJ%\\`\u001ekQ%SjL`\u001eqVdP%\u000f0\u001egGq[v"));
        }
        if (sprtpk2 != null) {
            sprkuk sprkuk6 = this;
            sprkuk3 = sprkuk6;
            this.cfr_renamed_145.cfr_renamed_5535(true, sprtpk2);
            sprkuk6.cfr_renamed_93.cfr_renamed_5535((boolean)arg0, sprtpk2);
            sprkuk6.cfr_renamed_272 = null;
        } else {
            if (bl2 != arg0) {
                throw new IllegalArgumentException(sprdtq.cfr_renamed_9("R._!^;\u0011,Y._(ToT!R=H?E&_(\u0011<E.E*\u00118X;Y D;\u0011?C G&U&_(\u0011$T6\u001f"));
            }
            sprkuk3 = this;
        }
        sprkuk3.cfr_renamed_137 = new byte[16];
        sprkuk sprkuk7 = this;
        sprkuk7.cfr_renamed_145.cfr_renamed_3064(sprkuk7.cfr_renamed_137, 0, this.cfr_renamed_137, 0);
        sprkuk sprkuk8 = this;
        this.cfr_renamed_2 = sprkuk.cfr_renamed_3404(this.cfr_renamed_137);
        sprkuk sprkuk9 = this;
        sprkuk8.cfr_renamed_0 = new Vector();
        sprkuk8.cfr_renamed_0.addElement(sprkuk.cfr_renamed_3404(this.cfr_renamed_2));
        int n2 = sprkuk8.cfr_renamed_3405(byArray);
        n = n2 % 8;
        int n3 = n2 / 8;
        if (n == 0) {
            sprkuk sprkuk10 = this;
            sprkuk2 = sprkuk10;
            System.arraycopy(this.cfr_renamed_102, n3, sprkuk10.cfr_renamed_132, 0, 16);
        } else {
            int n4;
            int n5 = n4 = 0;
            while (n5 < 16) {
                sprkuk sprkuk11 = this;
                byte by = sprkuk11.cfr_renamed_102[n3];
                int n6 = by & 0xFF;
                int n7 = sprkuk11.cfr_renamed_102[++n3] & 0xFF;
                sprkuk11.cfr_renamed_132[n4++] = (byte)(n6 << n | n7 >>> 8 - n);
                n5 = n4;
            }
            sprkuk2 = this;
        }
        sprkuk2.cfr_renamed_31 = 0;
        sprkuk sprkuk12 = this;
        sprkuk sprkuk13 = this;
        sprkuk sprkuk14 = this;
        this.cfr_renamed_114 = 0;
        sprkuk14.cfr_renamed_112 = 0L;
        sprkuk14.cfr_renamed_96 = 0L;
        sprkuk13.cfr_renamed_152 = new byte[16];
        sprkuk13.cfr_renamed_4 = new byte[16];
        System.arraycopy(sprkuk12.cfr_renamed_132, 0, this.cfr_renamed_88, 0, 16);
        sprkuk12.cfr_renamed_91 = new byte[16];
        if (sprkuk12.cfr_renamed_3 != null) {
            sprkuk sprkuk15 = this;
            sprkuk15.cfr_renamed_2417(this.cfr_renamed_3, 0, sprkuk15.cfr_renamed_3.length);
        }
    }

    public byte[] cfr_renamed_3400(int arg0) {
        int n = arg0;
        while (n >= this.cfr_renamed_0.size()) {
            sprkuk sprkuk2 = this;
            sprkuk2.cfr_renamed_0.addElement(sprkuk.cfr_renamed_3404((byte[])sprkuk2.cfr_renamed_0.lastElement()));
            n = arg0;
        }
        return (byte[])this.cfr_renamed_0.elementAt(arg0);
    }

    public void cfr_renamed_3406(byte[] arg0, int arg1) {
        if (arg0.length < arg1 + 16) {
            throw new sprwjl(spruip.cfr_renamed_9("JKqNpJ%\\pXc[w\u001eqQj\u001evVjLq"));
        }
        if (this.cfr_renamed_79) {
            sprkuk.cfr_renamed_1122(this.cfr_renamed_91, this.cfr_renamed_1);
            this.cfr_renamed_114 = 0;
        }
        sprkuk sprkuk2 = this;
        sprkuk.cfr_renamed_1122(this.cfr_renamed_88, sprkuk2.cfr_renamed_3400(sprkuk.cfr_renamed_3401(++sprkuk2.cfr_renamed_96)));
        sprkuk sprkuk3 = this;
        sprkuk sprkuk4 = this;
        sprkuk.cfr_renamed_1122(sprkuk3.cfr_renamed_1, sprkuk4.cfr_renamed_88);
        sprkuk3.cfr_renamed_93.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_1, 0);
        sprkuk sprkuk5 = this;
        sprkuk.cfr_renamed_1122(this.cfr_renamed_1, sprkuk5.cfr_renamed_88);
        System.arraycopy(sprkuk5.cfr_renamed_1, 0, arg0, arg1, 16);
        if (!sprkuk4.cfr_renamed_79) {
            sprkuk sprkuk6 = this;
            sprkuk sprkuk7 = this;
            sprkuk.cfr_renamed_1122(sprkuk6.cfr_renamed_91, sprkuk7.cfr_renamed_1);
            System.arraycopy(sprkuk6.cfr_renamed_1, 16, this.cfr_renamed_1, 0, this.cfr_renamed_107);
            sprkuk6.cfr_renamed_114 = sprkuk7.cfr_renamed_107;
        }
    }

    @Override
    public byte[] cfr_renamed_1472() {
        if (this.cfr_renamed_105 == null) {
            return new byte[this.cfr_renamed_107];
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_105);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprddl {
        void arg0;
        sprkuk sprkuk2 = this;
        this.cfr_renamed_1[sprkuk2.cfr_renamed_114] = arg0;
        if (++sprkuk2.cfr_renamed_114 == this.cfr_renamed_1.length) {
            void arg2;
            void arg1;
            this.cfr_renamed_3406((byte[])arg1, (int)arg2);
            return 16;
        }
        return 0;
    }

    public void cfr_renamed_3398() {
        sprkuk sprkuk2 = this;
        sprkuk2.cfr_renamed_3399(sprkuk2.cfr_renamed_3400(sprkuk.cfr_renamed_3401(++sprkuk2.cfr_renamed_112)));
        this.cfr_renamed_31 = 0;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        int n;
        if (arg0.length < arg1 + arg2) {
            throw new sprddl(sprdtq.cfr_renamed_9("\u0006_?D;\u0011-D)W*CoE ^oB'^=E"));
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            sprkuk sprkuk2 = this;
            this.cfr_renamed_1[sprkuk2.cfr_renamed_114] = arg0[arg1 + n];
            if (++sprkuk2.cfr_renamed_114 == this.cfr_renamed_1.length) {
                int n4 = n2;
                n2 += 16;
                this.cfr_renamed_3406(arg3, arg4 + n4);
            }
            n3 = ++n;
        }
        return n2;
    }

    public int cfr_renamed_3405(byte[] arg0) {
        byte[] byArray = new byte[16];
        System.arraycopy(arg0, 0, byArray, byArray.length - arg0.length, arg0.length);
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(this.cfr_renamed_107 << 4);
        int n = 15 - arg0.length;
        byArray2[n] = (byte)(byArray2[n] | 1);
        byte[] byArray3 = byArray;
        int n2 = byArray[15] & 0x3F;
        byArray3[15] = (byte)(byArray3[15] & 0xC0);
        if (this.cfr_renamed_272 == null || !sproze.cfr_renamed_92(byArray, this.cfr_renamed_272)) {
            byte[] byArray4 = new byte[16];
            this.cfr_renamed_272 = byArray;
            this.cfr_renamed_145.cfr_renamed_3064(this.cfr_renamed_272, 0, byArray4, 0);
            System.arraycopy(byArray4, 0, this.cfr_renamed_102, 0, 16);
            int n3 = 0;
            int n4 = n3;
            while (n4 < 8) {
                int n5 = 16 + n3;
                byte by = (byte)(byArray4[n3] ^ byArray4[n3 + 1]);
                this.cfr_renamed_102[n5] = by;
                n4 = ++n3;
            }
        }
        return n2;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_93.cfr_renamed_1315()).append(spruip.cfr_renamed_9("\u0011J}G")).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprkuk sprkuk2;
        byte[] byArray = null;
        if (!this.cfr_renamed_79) {
            sprkuk sprkuk3 = this;
            if (sprkuk3.cfr_renamed_114 < sprkuk3.cfr_renamed_107) {
                throw new sprull(sprdtq.cfr_renamed_9("+P;PoE ^oB'^=E"));
            }
            sprkuk sprkuk4 = this;
            sprkuk sprkuk5 = this;
            sprkuk4.cfr_renamed_114 -= sprkuk5.cfr_renamed_107;
            byArray = new byte[sprkuk5.cfr_renamed_107];
            System.arraycopy(sprkuk4.cfr_renamed_1, this.cfr_renamed_114, byArray, 0, this.cfr_renamed_107);
        }
        if (this.cfr_renamed_31 > 0) {
            sprkuk sprkuk6 = this;
            sprkuk sprkuk7 = this;
            sprkuk.cfr_renamed_3407(sprkuk6.cfr_renamed_86, sprkuk7.cfr_renamed_31);
            sprkuk7.cfr_renamed_3399(sprkuk6.cfr_renamed_137);
        }
        if (this.cfr_renamed_114 > 0) {
            if (this.cfr_renamed_79) {
                sprkuk sprkuk8 = this;
                sprkuk.cfr_renamed_3407(this.cfr_renamed_1, sprkuk8.cfr_renamed_114);
                sprkuk.cfr_renamed_1122(sprkuk8.cfr_renamed_91, this.cfr_renamed_1);
            }
            sprkuk sprkuk9 = this;
            sprkuk.cfr_renamed_1122(sprkuk9.cfr_renamed_88, sprkuk9.cfr_renamed_137);
            byte[] byArray2 = new byte[16];
            this.cfr_renamed_145.cfr_renamed_3064(this.cfr_renamed_88, 0, byArray2, 0);
            sprkuk.cfr_renamed_1122(this.cfr_renamed_1, byArray2);
            if (arg0.length < arg1 + this.cfr_renamed_114) {
                throw new sprwjl(spruip.cfr_renamed_9("JKqNpJ%\\pXc[w\u001eqQj\u001evVjLq"));
            }
            sprkuk sprkuk10 = this;
            System.arraycopy(sprkuk10.cfr_renamed_1, 0, arg0, arg1, this.cfr_renamed_114);
            if (!sprkuk10.cfr_renamed_79) {
                sprkuk sprkuk11 = this;
                sprkuk.cfr_renamed_3407(this.cfr_renamed_1, sprkuk11.cfr_renamed_114);
                sprkuk.cfr_renamed_1122(sprkuk11.cfr_renamed_91, this.cfr_renamed_1);
            }
        }
        sprkuk sprkuk12 = this;
        sprkuk sprkuk13 = this;
        sprkuk.cfr_renamed_1122(sprkuk12.cfr_renamed_91, sprkuk13.cfr_renamed_88);
        sprkuk.cfr_renamed_1122(sprkuk12.cfr_renamed_91, this.cfr_renamed_2);
        sprkuk13.cfr_renamed_145.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
        sprkuk sprkuk14 = this;
        sprkuk.cfr_renamed_1122(sprkuk14.cfr_renamed_91, this.cfr_renamed_4);
        this.cfr_renamed_105 = new byte[sprkuk14.cfr_renamed_107];
        System.arraycopy(sprkuk14.cfr_renamed_91, 0, this.cfr_renamed_105, 0, this.cfr_renamed_107);
        int n = sprkuk14.cfr_renamed_114;
        if (sprkuk12.cfr_renamed_79) {
            if (arg0.length < arg1 + n + this.cfr_renamed_107) {
                throw new sprwjl(sprdtq.cfr_renamed_9("~:E?D;\u0011-D)W*CoE ^oB'^=E"));
            }
            sprkuk2 = this;
            System.arraycopy(this.cfr_renamed_105, 0, arg0, arg1 + n, this.cfr_renamed_107);
            n += this.cfr_renamed_107;
        } else {
            if (!sproze.cfr_renamed_559(this.cfr_renamed_105, byArray)) {
                throw new sprull(spruip.cfr_renamed_9("h_f\u001efV`]n\u001elP%qF|%XdWi[a"));
            }
            sprkuk2 = this;
        }
        sprkuk2.cfr_renamed_3402(false);
        return n;
    }

    public static void cfr_renamed_3407(byte[] arg0, int arg1) {
        arg0[arg1] = -128;
        while (++arg1 < 16) {
            arg0[arg1] = 0;
        }
    }

    public void cfr_renamed_3399(byte[] byArray) {
        sprkuk sprkuk2 = this;
        sprkuk.cfr_renamed_1122(sprkuk2.cfr_renamed_152, byArray);
        sprkuk sprkuk3 = this;
        sprkuk.cfr_renamed_1122(sprkuk2.cfr_renamed_86, sprkuk3.cfr_renamed_152);
        sprkuk3.cfr_renamed_145.cfr_renamed_3064(this.cfr_renamed_86, 0, this.cfr_renamed_86, 0);
        sprkuk sprkuk4 = this;
        sprkuk.cfr_renamed_1122(sprkuk4.cfr_renamed_4, sprkuk4.cfr_renamed_86);
    }

    /*
     * WARNING - void declaration
     */
    public sprkuk(sprmr sprmr2, sprmr sprmr3) {
        void arg1;
        void arg0;
        sprkuk sprkuk2 = this;
        sprkuk sprkuk3 = this;
        sprkuk3.cfr_renamed_272 = null;
        sprkuk3.cfr_renamed_102 = new byte[24];
        sprkuk2.cfr_renamed_132 = new byte[16];
        sprkuk2.cfr_renamed_88 = new byte[16];
        if (sprmr2 == null) {
            throw new IllegalArgumentException(sprdtq.cfr_renamed_9("\u0016'P<Y\fX?Y*Ch\u0011,P!_ EoS*\u0011!D#]"));
        }
        if (arg0.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(spruip.cfr_renamed_9("\"VdMm}lNm[w\u0019%SpMq\u001em_s[%_%\\iQfU%MlD`\u001ejX%\u000f3"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprdtq.cfr_renamed_9("\u0016\"P&_\fX?Y*Ch\u0011,P!_ EoS*\u0011!D#]"));
        }
        if (arg1.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(spruip.cfr_renamed_9("\"SdWk}lNm[w\u0019%SpMq\u001em_s[%_%\\iQfU%MlD`\u001ejX%\u000f3"));
        }
        if (!arg0.cfr_renamed_1315().equals(arg1.cfr_renamed_1315())) {
            throw new IllegalArgumentException(sprdtq.cfr_renamed_9("hY.B'r&A'T=\u0016oP!Uo\u0016\"P&_\fX?Y*Ch\u0011\"D<EoS*\u0011;Y*\u0011<P\"ToP#V C&E'\\"));
        }
        this.cfr_renamed_145 = arg0;
        this.cfr_renamed_93 = arg1;
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_93;
    }

    public void cfr_renamed_3402(boolean bl) {
        sprkuk sprkuk2 = this;
        sprkuk sprkuk3 = this;
        sprkuk sprkuk4 = this;
        sprkuk sprkuk5 = this;
        sprkuk5.cfr_renamed_145.cfr_renamed_41();
        sprkuk5.cfr_renamed_93.cfr_renamed_41();
        sprkuk5.cfr_renamed_3408(sprkuk5.cfr_renamed_86);
        sprkuk5.cfr_renamed_3408(sprkuk5.cfr_renamed_1);
        sprkuk4.cfr_renamed_31 = 0;
        sprkuk4.cfr_renamed_114 = 0;
        sprkuk3.cfr_renamed_112 = 0L;
        sprkuk3.cfr_renamed_96 = 0L;
        sprkuk2.cfr_renamed_3408(sprkuk2.cfr_renamed_152);
        sprkuk2.cfr_renamed_3408(sprkuk2.cfr_renamed_4);
        System.arraycopy(sprkuk2.cfr_renamed_132, 0, this.cfr_renamed_88, 0, 16);
        sprkuk2.cfr_renamed_3408(sprkuk2.cfr_renamed_91);
        if (bl) {
            this.cfr_renamed_105 = null;
        }
        if (this.cfr_renamed_3 != null) {
            sprkuk sprkuk6 = this;
            sprkuk6.cfr_renamed_2417(this.cfr_renamed_3, 0, sprkuk6.cfr_renamed_3.length);
        }
    }

    public void cfr_renamed_3408(byte[] arg0) {
        if (arg0 != null) {
            sproze.cfr_renamed_492(arg0, (byte)0);
        }
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_114;
        if (!this.cfr_renamed_79) {
            if (n < this.cfr_renamed_107) {
                return 0;
            }
            n -= this.cfr_renamed_107;
        }
        int n2 = n;
        return n2 - n2 % 16;
    }

    public static int cfr_renamed_3401(long arg0) {
        return sprtwe.cfr_renamed_5188(arg0);
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprkuk sprkuk2 = this;
            this.cfr_renamed_86[sprkuk2.cfr_renamed_31] = arg0[arg1 + n];
            if (++sprkuk2.cfr_renamed_31 == this.cfr_renamed_86.length) {
                this.cfr_renamed_3398();
            }
            n2 = ++n;
        }
    }

    public static byte[] cfr_renamed_3404(byte[] arg0) {
        byte[] byArray = new byte[16];
        int n = sprkuk.cfr_renamed_3403(arg0, byArray);
        byArray[15] = (byte)(byArray[15] ^ 135 >>> (1 - n << 3));
        return byArray;
    }

    public static void cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 15;
        while (n2 >= 0) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = --n;
        }
    }
}

