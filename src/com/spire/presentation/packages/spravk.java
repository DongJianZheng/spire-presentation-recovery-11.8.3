/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproqo;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpsk;
import com.spire.presentation.packages.sprtpia;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzu;

public class spravk
implements sprzu {
    private byte[] cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private static final int cfr_renamed_137 = 512;
    private boolean cfr_renamed_79;
    private int cfr_renamed_107;
    private sprmr cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private sprpsk cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 8;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 64;
    private sprpsk cfr_renamed_3;
    private static final int cfr_renamed_4 = 4;

    /*
     * WARNING - void declaration
     */
    public spravk(sprmr sprmr2, int n) {
        void arg0;
        void v0 = arg0;
        spravk spravk2 = this;
        void v2 = arg0;
        spravk spravk3 = this;
        void v4 = arg0;
        spravk spravk4 = this;
        spravk spravk5 = this;
        spravk spravk6 = this;
        spravk5.cfr_renamed_3 = new sprpsk();
        spravk5.cfr_renamed_93 = new sprpsk();
        spravk5.cfr_renamed_107 = 4;
        spravk4.cfr_renamed_132 = arg0;
        spravk4.cfr_renamed_0 = arg0.cfr_renamed_1195();
        this.cfr_renamed_152 = new byte[v4.cfr_renamed_1195()];
        spravk3.cfr_renamed_119 = new byte[v4.cfr_renamed_1195()];
        spravk3.cfr_renamed_86 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_1 = new byte[v2.cfr_renamed_1195()];
        spravk2.cfr_renamed_102 = new byte[v2.cfr_renamed_1195()];
        spravk2.cfr_renamed_112 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_96 = new byte[v0.cfr_renamed_1195()];
        this.cfr_renamed_105 = new byte[v0.cfr_renamed_1195()];
        this.cfr_renamed_10026(n);
    }

    public spravk(sprmr arg0) {
        this(arg0, 4);
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return sproze.cfr_renamed_158(this.cfr_renamed_86);
    }

    private /* synthetic */ void cfr_renamed_10027(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = arg2;
        while (n2 > 0) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_132.cfr_renamed_1195()) {
                int n5 = n3;
                byte by = (byte)(this.cfr_renamed_1[n5] ^ arg0[arg1 + n3]);
                this.cfr_renamed_1[n5] = by;
                n4 = ++n3;
            }
            spravk spravk2 = this;
            spravk2.cfr_renamed_132.cfr_renamed_3064(spravk2.cfr_renamed_1, 0, this.cfr_renamed_1, 0);
            arg1 += this.cfr_renamed_132.cfr_renamed_1195();
            n2 = n -= this.cfr_renamed_132.cfr_renamed_1195();
        }
    }

    private /* synthetic */ void cfr_renamed_10028(byte[] arg0, int arg1, int arg2, int arg3) {
        int n;
        if (arg2 - arg1 < this.cfr_renamed_132.cfr_renamed_1195()) {
            throw new IllegalArgumentException(sproqo.cfr_renamed_9("V}C`cmO|\u0017jBnQmE(CgX(D`XzC"));
        }
        if (arg2 % this.cfr_renamed_132.cfr_renamed_1195() != 0) {
            throw new IllegalArgumentException(sprtpia.cfr_renamed_9("Og[bVhX&QiK&LsOvPtKc["));
        }
        System.arraycopy(this.cfr_renamed_152, 0, this.cfr_renamed_102, 0, this.cfr_renamed_152.length - this.cfr_renamed_107 - 1);
        spravk spravk2 = this;
        spravk2.cfr_renamed_10029(arg3, spravk2.cfr_renamed_112, 0);
        spravk spravk3 = this;
        System.arraycopy(spravk2.cfr_renamed_112, 0, spravk3.cfr_renamed_102, spravk3.cfr_renamed_152.length - this.cfr_renamed_107 - 1, 4);
        spravk spravk4 = this;
        spravk spravk5 = this;
        spravk4.cfr_renamed_102[spravk4.cfr_renamed_102.length - 1] = spravk5.cfr_renamed_10030(true, spravk5.cfr_renamed_0);
        spravk spravk6 = this;
        int n2 = arg2;
        spravk6.cfr_renamed_132.cfr_renamed_3064(spravk6.cfr_renamed_102, 0, this.cfr_renamed_1, 0);
        this.cfr_renamed_10029(n2, this.cfr_renamed_112, 0);
        if (n2 <= this.cfr_renamed_132.cfr_renamed_1195() - this.cfr_renamed_107) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg2) {
                int n5 = n3 + this.cfr_renamed_107;
                byte by = (byte)(this.cfr_renamed_112[n5] ^ arg0[arg1 + n3]);
                this.cfr_renamed_112[n5] = by;
                n4 = ++n3;
            }
            int n6 = n3 = 0;
            while (n6 < this.cfr_renamed_132.cfr_renamed_1195()) {
                int n7 = n3;
                byte by = (byte)(this.cfr_renamed_1[n7] ^ this.cfr_renamed_112[n3]);
                this.cfr_renamed_1[n7] = by;
                n6 = ++n3;
            }
            spravk spravk7 = this;
            spravk7.cfr_renamed_132.cfr_renamed_3064(spravk7.cfr_renamed_1, 0, this.cfr_renamed_1, 0);
            return;
        }
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_132.cfr_renamed_1195()) {
            int n9 = n;
            byte by = (byte)(this.cfr_renamed_1[n9] ^ this.cfr_renamed_112[n]);
            this.cfr_renamed_1[n9] = by;
            n8 = ++n;
        }
        spravk spravk8 = this;
        spravk8.cfr_renamed_132.cfr_renamed_3064(spravk8.cfr_renamed_1, 0, this.cfr_renamed_1, 0);
        n = arg2;
        int n10 = n;
        while (n10 != 0) {
            int n11;
            int n12 = n11 = 0;
            while (n12 < this.cfr_renamed_132.cfr_renamed_1195()) {
                int n13 = n11;
                byte by = (byte)(this.cfr_renamed_1[n13] ^ arg0[n11 + arg1]);
                this.cfr_renamed_1[n13] = by;
                n12 = ++n11;
            }
            spravk spravk9 = this;
            spravk9.cfr_renamed_132.cfr_renamed_3064(spravk9.cfr_renamed_1, 0, this.cfr_renamed_1, 0);
            arg1 += this.cfr_renamed_132.cfr_renamed_1195();
            n10 = n -= this.cfr_renamed_132.cfr_renamed_1195();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte cfr_renamed_10030(boolean arg0, int arg1) {
        String string;
        spravk spravk2;
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        if (arg0) {
            n = arg1;
            stringBuffer.append("1");
        } else {
            stringBuffer.append("0");
            n = arg1;
        }
        switch (n) {
            case 8: {
                stringBuffer.append(sproqo.cfr_renamed_9("\u00079\u0007"));
                spravk2 = this;
                break;
            }
            case 16: {
                stringBuffer.append(sprtpia.cfr_renamed_9("\u000f7\u000e"));
                spravk2 = this;
                break;
            }
            case 32: {
                stringBuffer.append(sproqo.cfr_renamed_9("\u00068\u0007"));
                spravk2 = this;
                break;
            }
            case 48: {
                stringBuffer.append(sprtpia.cfr_renamed_9("\u000e6\u000e"));
                spravk2 = this;
                break;
            }
            case 64: {
                stringBuffer.append(sproqo.cfr_renamed_9("\u00069\u0007"));
            }
            default: {
                spravk2 = this;
            }
        }
        String string2 = string = Integer.toBinaryString(spravk2.cfr_renamed_107 - 1);
        while (true) {
            if (string2.length() >= 4) {
                StringBuffer stringBuffer2 = stringBuffer;
                stringBuffer2.append(string);
                return (byte)Integer.parseInt(stringBuffer2.toString(), 2);
            }
            string2 = new StringBuffer(string).insert(0, "0").toString();
        }
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return arg0;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprbj sprbj2;
        spravk spravk2;
        if (arg1 instanceof sprtxk) {
            sprtxk sprtxk2 = (sprtxk)arg1;
            if (sprtxk2.cfr_renamed_2404() > 512 || sprtxk2.cfr_renamed_2404() < 64 || sprtxk2.cfr_renamed_2404() % 8 != 0) {
                throw new IllegalArgumentException(sprtpia.cfr_renamed_9("OQp^jVb\u001fk^e\u001fuV|Z&LvZeV`Vc["));
            }
            spravk2 = this;
            sprtxk sprtxk3 = sprtxk2;
            spravk spravk3 = this;
            spravk3.cfr_renamed_152 = sprtxk2.cfr_renamed_596();
            spravk3.cfr_renamed_0 = sprtxk2.cfr_renamed_2404() / 8;
            this.cfr_renamed_119 = sprtxk3.cfr_renamed_3388();
            sprbj2 = sprtxk3.cfr_renamed_1521();
        } else if (arg1 instanceof sprkpk) {
            this.cfr_renamed_152 = ((sprkpk)arg1).cfr_renamed_1205();
            this.cfr_renamed_0 = this.cfr_renamed_132.cfr_renamed_1195();
            this.cfr_renamed_119 = null;
            sprbj2 = ((sprkpk)arg1).cfr_renamed_284();
            spravk2 = this;
        } else {
            throw new IllegalArgumentException(sproqo.cfr_renamed_9("AY~Vd^l\u0017xVzVeR|RzD(DxRk^n^mS"));
        }
        spravk2.cfr_renamed_86 = new byte[this.cfr_renamed_0];
        spravk spravk4 = this;
        spravk4.cfr_renamed_79 = arg0;
        spravk4.cfr_renamed_132.cfr_renamed_5535(true, sprbj2);
        spravk4.cfr_renamed_105[0] = 1;
        if (spravk4.cfr_renamed_119 != null) {
            spravk spravk5 = this;
            spravk5.cfr_renamed_2417(this.cfr_renamed_119, 0, spravk5.cfr_renamed_119.length);
        }
    }

    private /* synthetic */ void cfr_renamed_10026(int arg0) {
        if (arg0 == 4 || arg0 == 6 || arg0 == 8) {
            this.cfr_renamed_107 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprtpia.cfr_renamed_9("H]&\u0002&\u000b&Vu\u001ftZePkRcQbZb\u001fdF&{UkS\b0\r2\u001fdJr\u001fe^h\u001fdZ&\\n^hXc[&Ki\u001fiQjF&\t&Pt\u001f>\u001foQ&KnVu\u001foRvScRcQr^rViQ"));
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg0.length < arg1 + arg2) {
            throw new sprddl(sproqo.cfr_renamed_9("aYxB|\u0017jBnQmE(CgX(D`XzC"));
        }
        this.cfr_renamed_93.write(arg0, arg1, arg2);
        return 0;
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        this.cfr_renamed_3.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_10031(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_105.length) {
            int n3 = n;
            byte by = (byte)(this.cfr_renamed_96[n3] + this.cfr_renamed_105[n]);
            this.cfr_renamed_96[n3] = by;
            n2 = ++n;
        }
        spravk spravk2 = this;
        spravk2.cfr_renamed_132.cfr_renamed_3064(spravk2.cfr_renamed_96, 0, this.cfr_renamed_112, 0);
        n = 0;
        int n4 = n;
        while (n4 < this.cfr_renamed_132.cfr_renamed_1195()) {
            int n5 = arg4 + n;
            byte by = (byte)(this.cfr_renamed_112[n] ^ arg0[arg1 + n]);
            arg3[n5] = by;
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprddl, IllegalStateException {
        void arg0;
        this.cfr_renamed_93.write((int)arg0);
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    public int cfr_renamed_3462(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalStateException, sprull {
        if (arg0.length - arg1 < arg2) {
            throw new sprddl(sprtpia.cfr_renamed_9("oQvJr\u001fdJ`YcM&KiP&LnPtK"));
        }
        if (arg3.length - arg4 < arg2) {
            throw new sprwjl(sproqo.cfr_renamed_9("X}CxB|\u0017jBnQmE(CgX(D`XzC"));
        }
        if (this.cfr_renamed_3.size() <= 0) ** GOTO lbl14
        if (this.cfr_renamed_79) {
            v0 = this;
            v1 = v0;
            v2 = this;
            v2.cfr_renamed_10028(v0.cfr_renamed_3.cfr_renamed_3461(), 0, v2.cfr_renamed_3.size(), this.cfr_renamed_93.size());
        } else {
            v3 = this;
            v3.cfr_renamed_10028(v3.cfr_renamed_3.cfr_renamed_3461(), 0, this.cfr_renamed_3.size(), this.cfr_renamed_93.size() - this.cfr_renamed_0);
lbl14:
            // 2 sources

            v1 = this;
        }
        if (v1.cfr_renamed_79) {
            if (arg2 % this.cfr_renamed_132.cfr_renamed_1195() != 0) {
                throw new sprddl(sprtpia.cfr_renamed_9("v^tKo^j\u001fdSi\\mL&QiK&LsOvPtKc["));
            }
            v4 = this;
            v4.cfr_renamed_10027(arg0, arg1, arg2);
            v4.cfr_renamed_132.cfr_renamed_3064(this.cfr_renamed_152, 0, this.cfr_renamed_96, 0);
            var6_6 = arg2;
            v5 = var6_6;
            while (v5 > 0) {
                this.cfr_renamed_10031(arg0, arg1, arg2, arg3, arg4);
                arg1 += this.cfr_renamed_132.cfr_renamed_1195();
                arg4 += this.cfr_renamed_132.cfr_renamed_1195();
                v5 = var6_6 -= this.cfr_renamed_132.cfr_renamed_1195();
            }
            v6 = var7_8 = 0;
            while (v6 < this.cfr_renamed_105.length) {
                v7 = var7_8;
                v8 = (byte)(this.cfr_renamed_96[v7] + this.cfr_renamed_105[var7_8]);
                this.cfr_renamed_96[v7] = v8;
                v6 = ++var7_8;
            }
            v9 = this;
            v9.cfr_renamed_132.cfr_renamed_3064(v9.cfr_renamed_96, 0, this.cfr_renamed_112, 0);
            var7_8 = 0;
            v10 = var7_8;
            while (v10 < this.cfr_renamed_0) {
                v11 = arg4 + var7_8;
                v12 = (byte)(this.cfr_renamed_112[var7_8] ^ this.cfr_renamed_1[var7_8]);
                arg3[v11] = v12;
                v10 = ++var7_8;
            }
            v13 = this;
            System.arraycopy(v13.cfr_renamed_1, 0, this.cfr_renamed_86, 0, this.cfr_renamed_0);
            v13.cfr_renamed_41();
            return arg2 + this.cfr_renamed_0;
        }
        if ((arg2 - this.cfr_renamed_0) % this.cfr_renamed_132.cfr_renamed_1195() != 0) {
            throw new sprddl(sproqo.cfr_renamed_9("xVzCaVd\u0017j[gTcD(YgC(D}GxXzCmS"));
        }
        v14 = this;
        v14.cfr_renamed_132.cfr_renamed_3064(v14.cfr_renamed_152, 0, this.cfr_renamed_96, 0);
        var6_7 = arg2 / this.cfr_renamed_132.cfr_renamed_1195();
        var7_9 = 0;
        v15 = var7_9;
        while (v15 < var6_7) {
            v16 = arg1;
            this.cfr_renamed_10031(arg0, v16, arg2, arg3, arg4);
            arg1 = v16 + this.cfr_renamed_132.cfr_renamed_1195();
            arg4 += this.cfr_renamed_132.cfr_renamed_1195();
            v15 = ++var7_9;
        }
        if (arg2 > arg1) {
            v17 = var7_9 = 0;
            while (v17 < this.cfr_renamed_105.length) {
                v18 = var7_9;
                v19 = (byte)(this.cfr_renamed_96[v18] + this.cfr_renamed_105[var7_9]);
                this.cfr_renamed_96[v18] = v19;
                v17 = ++var7_9;
            }
            v20 = this;
            v20.cfr_renamed_132.cfr_renamed_3064(v20.cfr_renamed_96, 0, this.cfr_renamed_112, 0);
            var7_9 = 0;
            v21 = var7_9;
            while (v21 < this.cfr_renamed_0) {
                v22 = arg4 + var7_9;
                v23 = (byte)(this.cfr_renamed_112[var7_9] ^ arg0[arg1 + var7_9]);
                arg3[v22] = v23;
                v21 = ++var7_9;
            }
            arg4 += this.cfr_renamed_0;
        }
        v24 = var7_9 = 0;
        while (v24 < this.cfr_renamed_105.length) {
            v25 = var7_9;
            v26 = (byte)(this.cfr_renamed_96[v25] + this.cfr_renamed_105[var7_9]);
            this.cfr_renamed_96[v25] = v26;
            v24 = ++var7_9;
        }
        v27 = this;
        v27.cfr_renamed_132.cfr_renamed_3064(v27.cfr_renamed_96, 0, this.cfr_renamed_112, 0);
        v28 = this;
        System.arraycopy(arg3, arg4 - v28.cfr_renamed_0, this.cfr_renamed_112, 0, this.cfr_renamed_0);
        v29 = this;
        v29.cfr_renamed_10027(arg3, 0, arg4 - this.cfr_renamed_0);
        System.arraycopy(v29.cfr_renamed_1, 0, this.cfr_renamed_86, 0, this.cfr_renamed_0);
        var7_10 = new byte[v28.cfr_renamed_0];
        System.arraycopy(v29.cfr_renamed_112, 0, var7_10, 0, this.cfr_renamed_0);
        if (!sproze.cfr_renamed_559(v27.cfr_renamed_86, var7_10)) {
            throw new sprull(sprtpia.cfr_renamed_9("k^e\u001feWc\\m\u001f`^oSc["));
        }
        this.cfr_renamed_41();
        return arg2 - this.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_41() {
        spravk spravk2 = this;
        sproze.cfr_renamed_492(spravk2.cfr_renamed_102, (byte)0);
        sproze.cfr_renamed_492(spravk2.cfr_renamed_112, (byte)0);
        sproze.cfr_renamed_492(spravk2.cfr_renamed_105, (byte)0);
        sproze.cfr_renamed_492(spravk2.cfr_renamed_1, (byte)0);
        spravk2.cfr_renamed_105[0] = 1;
        spravk2.cfr_renamed_93.reset();
        spravk2.cfr_renamed_3.reset();
        if (spravk2.cfr_renamed_119 != null) {
            spravk spravk3 = this;
            spravk3.cfr_renamed_2417(this.cfr_renamed_119, 0, spravk3.cfr_renamed_119.length);
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_132.cfr_renamed_1315()).append(sproqo.cfr_renamed_9("\u0018CtKz")).toString();
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_0;
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_132;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        spravk spravk2 = this;
        spravk spravk3 = this;
        int n = spravk3.cfr_renamed_3462(spravk2.cfr_renamed_93.cfr_renamed_3461(), 0, spravk3.cfr_renamed_93.size(), arg0, arg1);
        spravk2.cfr_renamed_41();
        return n;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10029(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2 + 3] = (byte)(arg0 >> 24);
        arg1[v1 + 2] = (byte)(arg0 >> 16);
        v0[v1 + true] = (byte)(arg0 >> 8);
        v0[n2] = (byte)arg0;
    }
}

