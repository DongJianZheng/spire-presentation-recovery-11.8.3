/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtcz;
import com.spire.presentation.packages.sprufd;
import com.spire.presentation.packages.sprukq;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;
import java.util.Hashtable;

public class sprutc
implements sprqd {
    private byte[] spr\ufe34;
    public static final int cfr_renamed_82 = 188;
    public static final int cfr_renamed_126 = 14284;
    private int cfr_renamed_88;
    private int cfr_renamed_31;
    private boolean cfr_renamed_272;
    public static final int cfr_renamed_145 = 13004;
    public static final int cfr_renamed_114 = 13772;
    private byte[] cfr_renamed_96;
    private int cfr_renamed_105;
    public static final int cfr_renamed_137 = 14028;
    private int cfr_renamed_79;
    private sprlc cfr_renamed_107;
    private static Hashtable cfr_renamed_132 = new Hashtable();
    private int cfr_renamed_102;
    private sprh cfr_renamed_93;
    private byte[] cfr_renamed_86;
    public static final int cfr_renamed_152 = 12748;
    private SecureRandom cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    public static final int cfr_renamed_2 = 13516;
    private byte[] cfr_renamed_3;
    public static final int cfr_renamed_4 = 13260;

    @Override
    public void cfr_renamed_41() {
        sprutc sprutc2 = this;
        sprutc2.cfr_renamed_107.cfr_renamed_41();
        sprutc2.cfr_renamed_79 = 0;
        if (sprutc2.spr\ufe34 != null) {
            sprutc sprutc3 = this;
            sprutc3.cfr_renamed_3277(sprutc3.spr\ufe34);
        }
        if (this.cfr_renamed_0 != null) {
            sprutc sprutc4 = this;
            sprutc4.cfr_renamed_3277(sprutc4.cfr_renamed_0);
            sprutc4.cfr_renamed_0 = null;
        }
        this.cfr_renamed_272 = false;
        if (this.cfr_renamed_86 != null) {
            sprutc sprutc5 = this;
            this.cfr_renamed_86 = null;
            sprutc5.cfr_renamed_3277(sprutc5.cfr_renamed_91);
            sprutc5.cfr_renamed_91 = null;
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

    public sprutc(sprh arg0, sprlc arg1, int arg2) {
        this(arg0, arg1, arg2, false);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        sprutc sprutc2;
        void arg0;
        sprmtc sprmtc2;
        void arg1;
        int n = this.cfr_renamed_102;
        if (sprt2 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            sprmtc2 = (sprmtc)spraed2.cfr_renamed_284();
            if (arg0 != false) {
                this.cfr_renamed_112 = spraed2.cfr_renamed_1295();
            }
        } else if (arg1 instanceof sprufd) {
            sprufd sprufd2 = (sprufd)arg1;
            sprmtc2 = (sprmtc)sprufd2.cfr_renamed_284();
            this.cfr_renamed_3 = sprufd2.cfr_renamed_1477();
            n = this.cfr_renamed_3.length;
            if (this.cfr_renamed_3.length != this.cfr_renamed_102) {
                throw new IllegalArgumentException(sprukq.cfr_renamed_9("}LC@_\u0005HDWQ\u001bLH\u0005TC\u001bRIJUB\u001bI^K\\QS"));
            }
        } else {
            sprmtc2 = (sprmtc)arg1;
            if (arg0 != false) {
                sprutc sprutc3 = this;
                sprutc3.cfr_renamed_112 = new SecureRandom();
            }
        }
        sprutc sprutc4 = this;
        sprutc4.cfr_renamed_93.cfr_renamed_1217((boolean)arg0, sprmtc2);
        this.cfr_renamed_88 = sprmtc2.cfr_renamed_2295().bitLength();
        this.cfr_renamed_96 = new byte[(sprutc4.cfr_renamed_88 + 7) / 8];
        if (this.cfr_renamed_119 == 188) {
            this.spr\ufe34 = new byte[this.cfr_renamed_96.length - this.cfr_renamed_107.cfr_renamed_1218() - n - 1 - 1];
            sprutc2 = this;
        } else {
            this.spr\ufe34 = new byte[this.cfr_renamed_96.length - this.cfr_renamed_107.cfr_renamed_1218() - n - 1 - 2];
            sprutc2 = this;
        }
        sprutc2.cfr_renamed_41();
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        int n;
        sprutc sprutc2;
        sprutc sprutc3 = this;
        byte[] byArray = new byte[sprutc3.cfr_renamed_105];
        sprutc3.cfr_renamed_107.cfr_renamed_1219(byArray, 0);
        int n2 = 0;
        if (sprutc3.cfr_renamed_86 == null) {
            try {
                this.cfr_renamed_3219(arg0);
                sprutc2 = this;
            }
            catch (Exception exception) {
                return false;
            }
        } else {
            if (!sprzra.cfr_renamed_92(this.cfr_renamed_86, arg0)) {
                throw new IllegalStateException(sprtcz.cfr_renamed_9("#g2v\"r\u0001~\"\u007f\u0004r5x r$r2Z3d%v1rvt7{:r279yvs?q0r$r8cvd?p8v\"b$r"));
            }
            sprutc2 = this;
        }
        byte[] byArray2 = sprutc2.cfr_renamed_91;
        sprutc sprutc4 = this;
        n2 = sprutc4.cfr_renamed_31;
        int n3 = sprutc4.cfr_renamed_1;
        sprutc4.cfr_renamed_86 = null;
        sprutc4.cfr_renamed_91 = null;
        byte[] byArray3 = new byte[8];
        sprutc4.cfr_renamed_3282(sprutc4.cfr_renamed_0.length * 8, byArray3);
        this.cfr_renamed_107.cfr_renamed_1197(byArray3, 0, byArray3.length);
        if (this.cfr_renamed_0.length != 0) {
            sprutc sprutc5 = this;
            sprutc5.cfr_renamed_107.cfr_renamed_1197(sprutc5.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        }
        this.cfr_renamed_107.cfr_renamed_1197(byArray, 0, byArray.length);
        this.cfr_renamed_107.cfr_renamed_1197(byArray2, n2 + this.cfr_renamed_0.length, this.cfr_renamed_102);
        sprutc sprutc6 = this;
        byte[] byArray4 = new byte[sprutc6.cfr_renamed_107.cfr_renamed_1218()];
        sprutc6.cfr_renamed_107.cfr_renamed_1219(byArray4, 0);
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
            sprutc sprutc7 = this;
            sprutc7.cfr_renamed_272 = false;
            sprutc7.cfr_renamed_3277(sprutc7.cfr_renamed_0);
            return false;
        }
        if (this.cfr_renamed_79 != 0) {
            sprutc sprutc8 = this;
            if (!sprutc8.cfr_renamed_3281(this.spr\ufe34, sprutc8.cfr_renamed_0)) {
                sprutc sprutc9 = this;
                sprutc9.cfr_renamed_3277(sprutc9.spr\ufe34);
                return false;
            }
            this.cfr_renamed_79 = 0;
        }
        sprutc sprutc10 = this;
        sprutc10.cfr_renamed_3277(sprutc10.spr\ufe34);
        return true;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_86 == null) {
            int n = arg2;
            while (n > 0) {
                sprutc sprutc2 = this;
                if (sprutc2.cfr_renamed_79 >= sprutc2.spr\ufe34.length) break;
                this.cfr_renamed_1221(arg0[arg1++]);
                n = --arg2;
            }
        }
        if (arg2 > 0) {
            this.cfr_renamed_107.cfr_renamed_1197(arg0, arg1, arg2);
        }
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

    static {
        cfr_renamed_132.put(sprukq.cfr_renamed_9("ilk`va\n\u0017\u0003"), spriwa.cfr_renamed_279(13004));
        cfr_renamed_132.put("RIPEMD160", spriwa.cfr_renamed_279(12748));
        cfr_renamed_132.put("SHA-1", spriwa.cfr_renamed_279(13260));
        cfr_renamed_132.put("SHA-256", spriwa.cfr_renamed_279(13516));
        cfr_renamed_132.put("SHA-384", spriwa.cfr_renamed_279(14028));
        cfr_renamed_132.put("SHA-512", spriwa.cfr_renamed_279(13772));
        cfr_renamed_132.put(sprtcz.cfr_renamed_9("@>~${&x9{"), spriwa.cfr_renamed_279(14284));
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprvmd {
        sprutc sprutc2;
        int n;
        byte[] byArray;
        sprutc sprutc3;
        sprutc sprutc4 = this;
        byte[] byArray2 = new byte[sprutc4.cfr_renamed_107.cfr_renamed_1218()];
        byte[] byArray3 = new byte[8];
        sprutc sprutc5 = this;
        sprutc4.cfr_renamed_107.cfr_renamed_1219(byArray2, 0);
        sprutc5.cfr_renamed_3282(sprutc5.cfr_renamed_79 * 8, byArray3);
        sprutc5.cfr_renamed_107.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprutc sprutc6 = this;
        this.cfr_renamed_107.cfr_renamed_1197(sprutc6.spr\ufe34, 0, this.cfr_renamed_79);
        sprutc6.cfr_renamed_107.cfr_renamed_1197(byArray2, 0, byArray2.length);
        if (this.cfr_renamed_3 != null) {
            sprutc sprutc7 = this;
            sprutc3 = sprutc7;
            byArray = sprutc7.cfr_renamed_3;
        } else {
            sprutc sprutc8 = this;
            sprutc3 = sprutc8;
            byArray = new byte[sprutc8.cfr_renamed_102];
            sprutc8.cfr_renamed_112.nextBytes(byArray);
        }
        sprutc3.cfr_renamed_107.cfr_renamed_1197(byArray, 0, byArray.length);
        sprutc sprutc9 = this;
        byte[] byArray4 = new byte[sprutc9.cfr_renamed_107.cfr_renamed_1218()];
        sprutc9.cfr_renamed_107.cfr_renamed_1219(byArray4, 0);
        int n2 = 2;
        if (sprutc9.cfr_renamed_119 == 188) {
            n2 = 1;
        }
        int n3 = this.cfr_renamed_96.length - this.cfr_renamed_79 - byArray.length - this.cfr_renamed_105 - n2 - 1;
        sprutc sprutc10 = this;
        sprutc10.cfr_renamed_96[n3] = 1;
        System.arraycopy(sprutc10.spr\ufe34, 0, this.cfr_renamed_96, n3 + 1, this.cfr_renamed_79);
        System.arraycopy(byArray, 0, this.cfr_renamed_96, n3 + 1 + this.cfr_renamed_79, byArray.length);
        byte[] byArray5 = this.cfr_renamed_3278(byArray4, 0, byArray4.length, this.cfr_renamed_96.length - this.cfr_renamed_105 - n2);
        int n4 = n = 0;
        while (n4 != byArray5.length) {
            int n5 = n;
            byte by = (byte)(this.cfr_renamed_96[n5] ^ byArray5[n]);
            this.cfr_renamed_96[n5] = by;
            n4 = ++n;
        }
        sprutc sprutc11 = this;
        System.arraycopy(byArray4, 0, sprutc11.cfr_renamed_96, sprutc11.cfr_renamed_96.length - this.cfr_renamed_105 - n2, this.cfr_renamed_105);
        if (this.cfr_renamed_119 == 188) {
            sprutc sprutc12 = this;
            sprutc12.cfr_renamed_96[sprutc12.cfr_renamed_96.length - 1] = -68;
            sprutc2 = this;
        } else {
            sprutc sprutc13 = this;
            sprutc13.cfr_renamed_96[sprutc13.cfr_renamed_96.length - 2] = (byte)(this.cfr_renamed_119 >>> 8);
            sprutc sprutc14 = this;
            sprutc14.cfr_renamed_96[sprutc14.cfr_renamed_96.length - 1] = (byte)this.cfr_renamed_119;
            sprutc2 = this;
        }
        sprutc2.cfr_renamed_96[0] = (byte)(sprutc2.cfr_renamed_96[0] & 0x7F);
        sprutc sprutc15 = this;
        byte[] byArray6 = sprutc15.cfr_renamed_93.cfr_renamed_1337(sprutc15.cfr_renamed_96, 0, this.cfr_renamed_96.length);
        sprutc sprutc16 = this;
        sprutc sprutc17 = this;
        sprutc17.cfr_renamed_3277(sprutc17.spr\ufe34);
        sprutc16.cfr_renamed_3277(sprutc16.cfr_renamed_96);
        sprutc16.cfr_renamed_79 = 0;
        return byArray6;
    }

    @Override
    public void cfr_renamed_3219(byte[] arg0) throws sprpjd {
        int n;
        Object object;
        sprutc sprutc2;
        int n2;
        byte[] byArray = this.cfr_renamed_93.cfr_renamed_1337(arg0, 0, arg0.length);
        if (byArray.length < (this.cfr_renamed_88 + 7) / 8) {
            byte[] byArray2 = new byte[(this.cfr_renamed_88 + 7) / 8];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            this.cfr_renamed_3277(byArray);
            byArray = byArray2;
        }
        if ((byArray[byArray.length - 1] & 0xFF ^ 0xBC) == 0) {
            n2 = 1;
            sprutc2 = this;
        } else {
            int n3 = (byArray[byArray.length - 2] & 0xFF) << 8 | byArray[byArray.length - 1] & 0xFF;
            object = (Integer)cfr_renamed_132.get(this.cfr_renamed_107.cfr_renamed_1315());
            if (object != null) {
                if (n3 != (Integer)object) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprukq.cfr_renamed_9("HL\\K^W\u001bLULOLZIRV^A\u001bRRQS\u0005LWTK\\\u0005_L\\@HQ\u001bCTW\u001bQIDRI^W\u001b")).append(n3).toString());
                }
            } else {
                throw new IllegalArgumentException(sprtcz.cfr_renamed_9("#y$r5x1y?d3sv\u007f7d>7?yvd?p8v\"b$r"));
            }
            n2 = 2;
            sprutc2 = this;
        }
        byte[] byArray3 = new byte[sprutc2.cfr_renamed_105];
        sprutc sprutc3 = this;
        sprutc3.cfr_renamed_107.cfr_renamed_1219(byArray3, 0);
        object = sprutc3.cfr_renamed_3278(byArray, byArray.length - this.cfr_renamed_105 - n2, this.cfr_renamed_105, byArray.length - this.cfr_renamed_105 - n2);
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
        this.cfr_renamed_272 = n > 1;
        this.cfr_renamed_0 = new byte[((Object)object).length - n - this.cfr_renamed_102];
        System.arraycopy(byArray, n, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        System.arraycopy(this.cfr_renamed_0, 0, this.spr\ufe34, 0, this.cfr_renamed_0.length);
        sprutc sprutc4 = this;
        sprutc sprutc5 = this;
        sprutc5.cfr_renamed_86 = arg0;
        sprutc5.cfr_renamed_91 = byArray;
        sprutc4.cfr_renamed_31 = n;
        sprutc4.cfr_renamed_1 = n2;
    }

    @Override
    public byte[] cfr_renamed_3276() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public boolean cfr_renamed_2425() {
        return this.cfr_renamed_272;
    }

    private /* synthetic */ byte[] cfr_renamed_3278(byte[] arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[arg3];
        sprutc sprutc2 = this;
        byte[] byArray2 = new byte[sprutc2.cfr_renamed_105];
        byte[] byArray3 = new byte[4];
        int n = 0;
        sprutc2.cfr_renamed_107.cfr_renamed_41();
        int n2 = n;
        while (n2 < arg3 / this.cfr_renamed_105) {
            sprutc sprutc3 = this;
            sprutc3.cfr_renamed_3279(n, byArray3);
            sprutc3.cfr_renamed_107.cfr_renamed_1197(arg0, arg1, arg2);
            sprutc3.cfr_renamed_107.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_107.cfr_renamed_1219(byArray2, 0);
            int n3 = n * this.cfr_renamed_105;
            System.arraycopy(byArray2, 0, byArray, n3, this.cfr_renamed_105);
            n2 = ++n;
        }
        if (n * this.cfr_renamed_105 < arg3) {
            sprutc sprutc4 = this;
            sprutc4.cfr_renamed_3279(n, byArray3);
            sprutc4.cfr_renamed_107.cfr_renamed_1197(arg0, arg1, arg2);
            sprutc4.cfr_renamed_107.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_107.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, byArray, n * this.cfr_renamed_105, byArray.length - n * this.cfr_renamed_105);
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprutc(sprh sprh2, sprlc sprlc2, int n, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprutc sprutc2 = this;
        this.cfr_renamed_93 = arg0;
        this.cfr_renamed_107 = arg1;
        sprutc2.cfr_renamed_105 = this.cfr_renamed_107.cfr_renamed_1218();
        sprutc2.cfr_renamed_102 = arg2;
        if (bl) {
            this.cfr_renamed_119 = 188;
            return;
        }
        Integer n2 = (Integer)cfr_renamed_132.get(arg1.cfr_renamed_1315());
        if (n2 != null) {
            this.cfr_renamed_119 = n2;
            return;
        }
        throw new IllegalArgumentException(sprukq.cfr_renamed_9("UJ\u001bSZIRA\u001bQIDRI^W\u001bCTW\u001bARB^VO"));
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_86 == null) {
            sprutc sprutc2 = this;
            if (sprutc2.cfr_renamed_79 < sprutc2.spr\ufe34.length) {
                this.spr\ufe34[this.cfr_renamed_79++] = arg0;
                return;
            }
        }
        this.cfr_renamed_107.cfr_renamed_1221(arg0);
    }
}

