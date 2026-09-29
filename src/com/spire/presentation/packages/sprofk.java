/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbp;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjik;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqgy;
import com.spire.presentation.packages.sprtck;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprygk;
import java.security.SecureRandom;

public class sprofk
implements sprbp {
    private byte[] cfr_renamed_82;
    public static final int cfr_renamed_126 = 13260;
    private sprwn cfr_renamed_88;
    public static final int cfr_renamed_31 = 188;
    private byte[] cfr_renamed_272;
    private byte[] cfr_renamed_145;
    public static final int cfr_renamed_114 = 13772;
    private sprgf cfr_renamed_96;
    private SecureRandom cfr_renamed_105;
    public static final int cfr_renamed_137 = 12748;
    private int cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private int cfr_renamed_132;
    public static final int cfr_renamed_102 = 13516;
    private byte[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    public static final int cfr_renamed_152 = 14284;
    public static final int cfr_renamed_112 = 13004;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    public static final int cfr_renamed_3 = 14028;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprofk sprofk2;
        void arg0;
        sprkik sprkik2;
        void arg1;
        int n = this.cfr_renamed_91;
        if (sprbj2 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            sprkik2 = (sprkik)sprbgk2.cfr_renamed_284();
            if (arg0 != false) {
                this.cfr_renamed_105 = sprbgk2.cfr_renamed_1295();
            }
        } else if (arg1 instanceof sprjik) {
            sprjik sprjik2 = (sprjik)arg1;
            sprkik2 = (sprkik)sprjik2.cfr_renamed_284();
            this.cfr_renamed_272 = sprjik2.cfr_renamed_1477();
            n = this.cfr_renamed_272.length;
            if (this.cfr_renamed_272.length != this.cfr_renamed_91) {
                throw new IllegalArgumentException(sprtck.cfr_renamed_9("R>l2pwg6x#4>gw{14 f8z04;q9s#|"));
            }
        } else {
            sprkik2 = (sprkik)arg1;
            if (arg0 != false) {
                this.cfr_renamed_105 = sprybl.cfr_renamed_2794();
            }
        }
        sprofk sprofk3 = this;
        sprofk3.cfr_renamed_88.cfr_renamed_5535((boolean)arg0, sprkik2);
        this.cfr_renamed_119 = sprkik2.cfr_renamed_2295().bitLength();
        this.cfr_renamed_145 = new byte[(sprofk3.cfr_renamed_119 + 7) / 8];
        if (this.cfr_renamed_2 == 188) {
            this.cfr_renamed_82 = new byte[this.cfr_renamed_145.length - this.cfr_renamed_96.cfr_renamed_1218() - n - 1 - 1];
            sprofk2 = this;
        } else {
            this.cfr_renamed_82 = new byte[this.cfr_renamed_145.length - this.cfr_renamed_96.cfr_renamed_1218() - n - 1 - 2];
            sprofk2 = this;
        }
        sprofk2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_41() {
        sprofk sprofk2 = this;
        sprofk2.cfr_renamed_96.cfr_renamed_41();
        sprofk2.cfr_renamed_79 = 0;
        if (sprofk2.cfr_renamed_82 != null) {
            sprofk sprofk3 = this;
            sprofk3.cfr_renamed_3277(sprofk3.cfr_renamed_82);
        }
        if (this.cfr_renamed_93 != null) {
            sprofk sprofk4 = this;
            sprofk4.cfr_renamed_3277(sprofk4.cfr_renamed_93);
            sprofk4.cfr_renamed_93 = null;
        }
        this.cfr_renamed_1 = false;
        if (this.cfr_renamed_86 != null) {
            sprofk sprofk5 = this;
            this.cfr_renamed_86 = null;
            sprofk5.cfr_renamed_3277(sprofk5.cfr_renamed_107);
            sprofk5.cfr_renamed_107 = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3279(int n, byte[] byArray) {
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = (byte)(arg0 >>> 24);
        v1[1] = (byte)(arg0 >>> 16);
        v0[2] = (byte)(arg0 >>> 8);
        v0[3] = (byte)(arg0 >>> 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprofk(sprwn sprwn2, sprgf sprgf2, int n, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprofk sprofk2 = this;
        this.cfr_renamed_88 = arg0;
        this.cfr_renamed_96 = arg1;
        sprofk2.cfr_renamed_132 = this.cfr_renamed_96.cfr_renamed_1218();
        sprofk2.cfr_renamed_91 = arg2;
        if (bl) {
            this.cfr_renamed_2 = 188;
            return;
        }
        Integer n2 = sprygk.cfr_renamed_9913((sprgf)arg1);
        if (n2 != null) {
            this.cfr_renamed_2 = n2;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqgy.cfr_renamed_9("\u001d!S8\u0012\"\u001a*S:\u0001/\u001a\"\u0016<S(\u001c<S*\u001a)\u0016=\u0007tS")).append(arg1.cfr_renamed_1315()).toString());
    }

    @Override
    public boolean cfr_renamed_2425() {
        return this.cfr_renamed_1;
    }

    @Override
    public byte[] cfr_renamed_3276() {
        return this.cfr_renamed_93;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_86 == null) {
            sprofk sprofk2 = this;
            if (sprofk2.cfr_renamed_79 < sprofk2.cfr_renamed_82.length) {
                this.cfr_renamed_82[this.cfr_renamed_79++] = arg0;
                return;
            }
        }
        this.cfr_renamed_96.cfr_renamed_1221(arg0);
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ byte[] cfr_renamed_3278(byte[] arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[arg3];
        sprofk sprofk2 = this;
        byte[] byArray2 = new byte[sprofk2.cfr_renamed_132];
        byte[] byArray3 = new byte[4];
        int n = 0;
        sprofk2.cfr_renamed_96.cfr_renamed_41();
        int n2 = n;
        while (n2 < arg3 / this.cfr_renamed_132) {
            sprofk sprofk3 = this;
            sprofk3.cfr_renamed_3279(n, byArray3);
            sprofk3.cfr_renamed_96.cfr_renamed_1197(arg0, arg1, arg2);
            sprofk3.cfr_renamed_96.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_96.cfr_renamed_1219(byArray2, 0);
            int n3 = n * this.cfr_renamed_132;
            System.arraycopy(byArray2, 0, byArray, n3, this.cfr_renamed_132);
            n2 = ++n;
        }
        if (n * this.cfr_renamed_132 < arg3) {
            sprofk sprofk4 = this;
            sprofk4.cfr_renamed_3279(n, byArray3);
            sprofk4.cfr_renamed_96.cfr_renamed_1197(arg0, arg1, arg2);
            sprofk4.cfr_renamed_96.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_96.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, byArray, n * this.cfr_renamed_132, byArray.length - n * this.cfr_renamed_132);
        }
        return byArray;
    }

    private /* synthetic */ boolean cfr_renamed_3281(byte[] arg0, byte[] arg1) {
        int n;
        boolean bl = true;
        if (this.cfr_renamed_79 != arg1.length) {
            bl = false;
        }
        int n2 = n = 0;
        while (n2 != arg1.length) {
            if (arg0[n] != arg1[n]) {
                bl = false;
            }
            n2 = ++n;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3282(long l, byte[] byArray) {
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        void v2 = arg1;
        void v3 = arg1;
        v3[0] = (byte)(arg0 >>> 56);
        v3[1] = (byte)(arg0 >>> 48);
        v2[2] = (byte)(arg0 >>> 40);
        v2[3] = (byte)(arg0 >>> 32);
        v1[4] = (byte)(arg0 >>> 24);
        v1[5] = (byte)(arg0 >>> 16);
        v0[6] = (byte)(arg0 >>> 8);
        v0[7] = (byte)(arg0 >>> 0);
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprmml {
        sprofk sprofk2;
        int n;
        byte[] byArray;
        sprofk sprofk3;
        sprofk sprofk4 = this;
        byte[] byArray2 = new byte[sprofk4.cfr_renamed_96.cfr_renamed_1218()];
        byte[] byArray3 = new byte[8];
        sprofk sprofk5 = this;
        sprofk4.cfr_renamed_96.cfr_renamed_1219(byArray2, 0);
        sprofk5.cfr_renamed_3282(sprofk5.cfr_renamed_79 * 8, byArray3);
        sprofk5.cfr_renamed_96.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprofk sprofk6 = this;
        this.cfr_renamed_96.cfr_renamed_1197(sprofk6.cfr_renamed_82, 0, this.cfr_renamed_79);
        sprofk6.cfr_renamed_96.cfr_renamed_1197(byArray2, 0, byArray2.length);
        if (this.cfr_renamed_272 != null) {
            sprofk sprofk7 = this;
            sprofk3 = sprofk7;
            byArray = sprofk7.cfr_renamed_272;
        } else {
            sprofk sprofk8 = this;
            sprofk3 = sprofk8;
            byArray = new byte[sprofk8.cfr_renamed_91];
            sprofk8.cfr_renamed_105.nextBytes(byArray);
        }
        sprofk3.cfr_renamed_96.cfr_renamed_1197(byArray, 0, byArray.length);
        sprofk sprofk9 = this;
        byte[] byArray4 = new byte[sprofk9.cfr_renamed_96.cfr_renamed_1218()];
        sprofk9.cfr_renamed_96.cfr_renamed_1219(byArray4, 0);
        int n2 = 2;
        if (sprofk9.cfr_renamed_2 == 188) {
            n2 = 1;
        }
        int n3 = this.cfr_renamed_145.length - this.cfr_renamed_79 - byArray.length - this.cfr_renamed_132 - n2 - 1;
        sprofk sprofk10 = this;
        sprofk10.cfr_renamed_145[n3] = 1;
        System.arraycopy(sprofk10.cfr_renamed_82, 0, this.cfr_renamed_145, n3 + 1, this.cfr_renamed_79);
        System.arraycopy(byArray, 0, this.cfr_renamed_145, n3 + 1 + this.cfr_renamed_79, byArray.length);
        byte[] byArray5 = this.cfr_renamed_3278(byArray4, 0, byArray4.length, this.cfr_renamed_145.length - this.cfr_renamed_132 - n2);
        int n4 = n = 0;
        while (n4 != byArray5.length) {
            int n5 = n;
            byte by = (byte)(this.cfr_renamed_145[n5] ^ byArray5[n]);
            this.cfr_renamed_145[n5] = by;
            n4 = ++n;
        }
        sprofk sprofk11 = this;
        System.arraycopy(byArray4, 0, sprofk11.cfr_renamed_145, sprofk11.cfr_renamed_145.length - this.cfr_renamed_132 - n2, this.cfr_renamed_132);
        if (this.cfr_renamed_2 == 188) {
            sprofk sprofk12 = this;
            sprofk12.cfr_renamed_145[sprofk12.cfr_renamed_145.length - 1] = -68;
            sprofk2 = this;
        } else {
            sprofk sprofk13 = this;
            sprofk13.cfr_renamed_145[sprofk13.cfr_renamed_145.length - 2] = (byte)(this.cfr_renamed_2 >>> 8);
            sprofk sprofk14 = this;
            sprofk14.cfr_renamed_145[sprofk14.cfr_renamed_145.length - 1] = (byte)this.cfr_renamed_2;
            sprofk2 = this;
        }
        sprofk2.cfr_renamed_145[0] = (byte)(sprofk2.cfr_renamed_145[0] & 0x7F);
        sprofk sprofk15 = this;
        byte[] byArray6 = sprofk15.cfr_renamed_88.cfr_renamed_1337(sprofk15.cfr_renamed_145, 0, this.cfr_renamed_145.length);
        sprofk sprofk16 = this;
        sprofk16.cfr_renamed_93 = new byte[sprofk16.cfr_renamed_79];
        sprofk16.cfr_renamed_1 = sprofk16.cfr_renamed_79 <= this.cfr_renamed_82.length;
        System.arraycopy(this.cfr_renamed_82, 0, this.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        sprofk sprofk17 = this;
        sprofk sprofk18 = this;
        sprofk18.cfr_renamed_3277(sprofk18.cfr_renamed_82);
        sprofk17.cfr_renamed_3277(sprofk17.cfr_renamed_145);
        sprofk17.cfr_renamed_79 = 0;
        return byArray6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        int n;
        sprofk sprofk2;
        sprofk sprofk3;
        sprofk sprofk4 = this;
        byte[] byArray = new byte[sprofk4.cfr_renamed_132];
        sprofk4.cfr_renamed_96.cfr_renamed_1219(byArray, 0);
        int n2 = 0;
        if (sprofk4.cfr_renamed_86 == null) {
            try {
                this.cfr_renamed_3219(arg0);
                sprofk3 = this;
            }
            catch (Exception exception) {
                return false;
            }
        } else {
            if (!sproze.cfr_renamed_92(this.cfr_renamed_86, arg0)) {
                throw new IllegalStateException(sprtck.cfr_renamed_9("\"d3u#q\u0000}#|\u0005q4{!q%q3Y2g$u0qww6x;q348zwp>r1q%q9`wg>s9u#a%q"));
            }
            sprofk3 = this;
        }
        byte[] byArray2 = sprofk3.cfr_renamed_107;
        sprofk sprofk5 = this;
        n2 = sprofk5.cfr_renamed_0;
        int n3 = sprofk5.cfr_renamed_4;
        sprofk5.cfr_renamed_86 = null;
        sprofk5.cfr_renamed_107 = null;
        byte[] byArray3 = new byte[8];
        sprofk5.cfr_renamed_3282(sprofk5.cfr_renamed_93.length * 8, byArray3);
        this.cfr_renamed_96.cfr_renamed_1197(byArray3, 0, byArray3.length);
        if (this.cfr_renamed_93.length != 0) {
            sprofk sprofk6 = this;
            sprofk6.cfr_renamed_96.cfr_renamed_1197(sprofk6.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        }
        this.cfr_renamed_96.cfr_renamed_1197(byArray, 0, byArray.length);
        sprofk sprofk7 = this;
        if (this.cfr_renamed_272 != null) {
            sprofk7.cfr_renamed_96.cfr_renamed_1197(this.cfr_renamed_272, 0, this.cfr_renamed_272.length);
            sprofk2 = this;
        } else {
            sprofk7.cfr_renamed_96.cfr_renamed_1197(byArray2, n2 + this.cfr_renamed_93.length, this.cfr_renamed_91);
            sprofk2 = this;
        }
        byte[] byArray4 = new byte[sprofk2.cfr_renamed_96.cfr_renamed_1218()];
        this.cfr_renamed_96.cfr_renamed_1219(byArray4, 0);
        int n4 = byArray2.length - n3 - byArray4.length;
        boolean bl = true;
        int n5 = n = 0;
        while (n5 != byArray4.length) {
            if (byArray4[n] != byArray2[n4 + n]) {
                bl = false;
            }
            n5 = ++n;
        }
        this.cfr_renamed_3277(byArray2);
        this.cfr_renamed_3277(byArray4);
        if (!bl) {
            this.cfr_renamed_1 = false;
            this.cfr_renamed_79 = false;
            this.cfr_renamed_3277(this.cfr_renamed_93);
            return false;
        }
        if (this.cfr_renamed_79 != 0) {
            sprofk sprofk8 = this;
            if (!sprofk8.cfr_renamed_3281(this.cfr_renamed_82, sprofk8.cfr_renamed_93)) {
                sprofk sprofk9 = this;
                sprofk9.cfr_renamed_79 = 0;
                sprofk9.cfr_renamed_3277(sprofk9.cfr_renamed_82);
                return false;
            }
        }
        sprofk sprofk10 = this;
        sprofk10.cfr_renamed_79 = 0;
        sprofk10.cfr_renamed_3277(sprofk10.cfr_renamed_82);
        return true;
    }

    @Override
    public void cfr_renamed_3219(byte[] arg0) throws sprull {
        int n;
        Object object;
        sprofk sprofk2;
        int n2;
        byte[] byArray = this.cfr_renamed_88.cfr_renamed_1337(arg0, 0, arg0.length);
        if (byArray.length < (this.cfr_renamed_119 + 7) / 8) {
            byte[] byArray2 = new byte[(this.cfr_renamed_119 + 7) / 8];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            this.cfr_renamed_3277(byArray);
            byArray = byArray2;
        }
        if ((byArray[byArray.length - 1] & 0xFF ^ 0xBC) == 0) {
            n2 = 1;
            sprofk2 = this;
        } else {
            int n3 = (byArray[byArray.length - 2] & 0xFF) << 8 | byArray[byArray.length - 1] & 0xFF;
            object = sprygk.cfr_renamed_9913(this.cfr_renamed_96);
            if (object != null) {
                n = (Integer)object;
                if (n3 != n && (n != 15052 || n3 != 16588)) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprqgy.cfr_renamed_9("\u0000'\u0014 \u0016<S'\u001d'\u0007'\u0012\"\u001a=\u0016*S9\u001a:\u001bn\u0004<\u001c \u0014n\u0017'\u0014+\u0000:S(\u001c<S:\u0001/\u001a\"\u0016<S")).append(n3).toString());
                }
            } else {
                throw new IllegalArgumentException(sprtck.cfr_renamed_9("\"z%q4{0z>g2pw|6g?4>zwg>s9u#a%q"));
            }
            n2 = 2;
            sprofk2 = this;
        }
        byte[] byArray3 = new byte[sprofk2.cfr_renamed_132];
        sprofk sprofk3 = this;
        sprofk3.cfr_renamed_96.cfr_renamed_1219(byArray3, 0);
        object = sprofk3.cfr_renamed_3278(byArray, byArray.length - this.cfr_renamed_132 - n2, this.cfr_renamed_132, byArray.length - this.cfr_renamed_132 - n2);
        int n4 = n = 0;
        while (n4 != ((Object)object).length) {
            int n5 = n;
            byte by = (byte)(byArray[n5] ^ object[n]);
            byArray[n5] = by;
            n4 = ++n;
        }
        byArray[0] = (byte)(byArray[0] & 0x7F);
        int n6 = n = 0;
        while (n6 != byArray.length && byArray[n] != 1) {
            n6 = ++n;
        }
        if (++n >= byArray.length) {
            this.cfr_renamed_3277(byArray);
        }
        this.cfr_renamed_1 = n > 1;
        this.cfr_renamed_93 = new byte[((Object)object).length - n - this.cfr_renamed_91];
        System.arraycopy(byArray, n, this.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        System.arraycopy(this.cfr_renamed_93, 0, this.cfr_renamed_82, 0, this.cfr_renamed_93.length);
        sprofk sprofk4 = this;
        sprofk sprofk5 = this;
        sprofk5.cfr_renamed_86 = arg0;
        sprofk5.cfr_renamed_107 = byArray;
        sprofk4.cfr_renamed_0 = n;
        sprofk4.cfr_renamed_4 = n2;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_86 == null) {
            int n = arg2;
            while (n > 0) {
                sprofk sprofk2 = this;
                if (sprofk2.cfr_renamed_79 >= sprofk2.cfr_renamed_82.length) break;
                this.cfr_renamed_1221(arg0[arg1++]);
                n = --arg2;
            }
        }
        if (arg2 > 0) {
            this.cfr_renamed_96.cfr_renamed_1197(arg0, arg1, arg2);
        }
    }

    public sprofk(sprwn arg0, sprgf arg1, int arg2) {
        this(arg0, arg1, arg2, false);
    }
}

