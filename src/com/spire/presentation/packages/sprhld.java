/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprewl;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprfi;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprmo;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprvcd;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.sprznd;
import com.spire.presentation.packages.sprzra;

public class sprhld
implements sprpj {
    private byte[] cfr_renamed_31;
    private byte[] cfr_renamed_272;
    private byte[] cfr_renamed_145;
    private byte[] cfr_renamed_114;
    private static final int cfr_renamed_96 = 16;
    private sprfi cfr_renamed_105;
    private byte[] cfr_renamed_137;
    private int cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private byte[] cfr_renamed_132;
    private boolean cfr_renamed_102;
    private long cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private long cfr_renamed_152;
    private int cfr_renamed_112;
    private sprmo cfr_renamed_119;
    private long cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprff cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_504(byte by, byte[] byArray, int n) throws sprjkd {
        void arg0;
        sprhld sprhld2 = this;
        this.cfr_renamed_137[sprhld2.cfr_renamed_79] = arg0;
        if (++sprhld2.cfr_renamed_79 == this.cfr_renamed_137.length) {
            void arg2;
            void arg1;
            this.cfr_renamed_3411((byte[])arg1, (int)arg2);
            return 16;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        sprhld sprhld2;
        sprhld sprhld3;
        void v2;
        sprnld sprnld2;
        sprt sprt3;
        void arg1;
        void arg0;
        sprhld sprhld4 = this;
        sprhld4.cfr_renamed_102 = arg0;
        sprhld4.cfr_renamed_2 = null;
        if (sprt2 instanceof sprxfd) {
            sprt3 = (sprxfd)arg1;
            sprxfd sprxfd2 = sprt3;
            this.cfr_renamed_1 = ((sprxfd)sprt3).cfr_renamed_596();
            this.cfr_renamed_107 = sprxfd2.cfr_renamed_3388();
            int n = sprxfd2.cfr_renamed_2404();
            if (n < 32 || n > 128 || n % 8 != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprewl.cfr_renamed_9("\\\u0003c\fy\u0004qMc\fy\u0018pMs\u0002gMX,VMf\u0004o\b/M")).append(n).toString());
            }
            this.cfr_renamed_112 = n / 8;
            sprnld2 = ((sprxfd)sprt3).cfr_renamed_1521();
            v2 = arg0;
        } else if (arg1 instanceof sprnjd) {
            sprt3 = (sprnjd)arg1;
            sprhld sprhld5 = this;
            this.cfr_renamed_1 = ((sprnjd)sprt3).cfr_renamed_1205();
            sprhld5.cfr_renamed_107 = null;
            sprhld5.cfr_renamed_112 = 16;
            sprnld2 = (sprnld)((sprnjd)sprt3).cfr_renamed_284();
            v2 = arg0;
        } else {
            throw new IllegalArgumentException(sprjvm.cfr_renamed_9("K\bT\u0007N\u000fFFR\u0007P\u0007O\u0003V\u0003P\u0015\u0002\u0016C\u0015Q\u0003FFV\t\u0002!a+"));
        }
        int n = v2 != false ? 16 : 16 + this.cfr_renamed_112;
        this.cfr_renamed_137 = new byte[n];
        if (this.cfr_renamed_1 == null || this.cfr_renamed_1.length < 1) {
            throw new IllegalArgumentException(sprewl.cfr_renamed_9("\\;5\u0000`\u001eaMw\b5\faMy\bt\u001eaM$Mw\u0014a\b"));
        }
        sprhld sprhld6 = this;
        if (sprnld2 != null) {
            sprhld6.cfr_renamed_4.cfr_renamed_1217(true, sprnld2);
            this.cfr_renamed_86 = new byte[16];
            this.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_86, 0, this.cfr_renamed_86, 0);
            sprhld3 = this;
            sprhld sprhld7 = this;
            sprhld7.cfr_renamed_119.cfr_renamed_148(sprhld7.cfr_renamed_86);
            this.cfr_renamed_105 = null;
        } else {
            if (sprhld6.cfr_renamed_86 == null) {
                throw new IllegalArgumentException(sprjvm.cfr_renamed_9("-G\u001f\u0002\u000bW\u0015VF@\u0003\u0002\u0015R\u0003A\u000fD\u000fG\u0002\u0002\u000fLFK\bK\u0012K\u0007NFK\bK\u0012"));
            }
            sprhld3 = this;
        }
        sprhld3.cfr_renamed_31 = new byte[16];
        if (this.cfr_renamed_1.length == 12) {
            System.arraycopy(this.cfr_renamed_1, 0, this.cfr_renamed_31, 0, this.cfr_renamed_1.length);
            sprhld sprhld8 = this;
            sprhld2 = sprhld8;
            sprhld8.cfr_renamed_31[15] = 1;
        } else {
            sprhld sprhld9 = this;
            sprhld9.cfr_renamed_3412(sprhld9.cfr_renamed_31, sprhld9.cfr_renamed_1, this.cfr_renamed_1.length);
            byte[] byArray = new byte[16];
            sprtsa.cfr_renamed_450((long)this.cfr_renamed_1.length * 8L, byArray, 8);
            sprhld sprhld10 = this;
            sprhld2 = sprhld10;
            sprhld10.cfr_renamed_3413(sprhld10.cfr_renamed_31, byArray);
        }
        sprhld2.cfr_renamed_145 = new byte[16];
        sprhld sprhld11 = this;
        sprhld sprhld12 = this;
        sprhld sprhld13 = this;
        sprhld13.cfr_renamed_114 = new byte[16];
        sprhld13.cfr_renamed_132 = new byte[16];
        sprhld12.cfr_renamed_272 = new byte[16];
        sprhld12.cfr_renamed_0 = 0;
        sprhld11.cfr_renamed_152 = 0L;
        sprhld11.cfr_renamed_91 = 0L;
        this.cfr_renamed_3 = sprzra.cfr_renamed_158(this.cfr_renamed_31);
        this.cfr_renamed_79 = 0;
        this.cfr_renamed_93 = 0L;
        if (this.cfr_renamed_107 != null) {
            sprhld sprhld14 = this;
            sprhld14.cfr_renamed_2417(this.cfr_renamed_107, 0, sprhld14.cfr_renamed_107.length);
        }
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_2);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        int n;
        if (arg0.length < arg1 + arg2) {
            throw new sprjkd(sprewl.cfr_renamed_9("\\\u0003e\u0018aMw\u0018s\u000bp\u001f5\u0019z\u00025\u001e}\u0002g\u0019"));
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            sprhld sprhld2 = this;
            this.cfr_renamed_137[sprhld2.cfr_renamed_79] = arg0[arg1 + n];
            if (++sprhld2.cfr_renamed_79 == this.cfr_renamed_137.length) {
                int n4 = n2;
                n2 += 16;
                this.cfr_renamed_3411(arg3, arg4 + n4);
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3414(byte[] byArray, byte[] byArray2, int n) {
        void arg0;
        sprhld sprhld2 = this;
        byte[] byArray3 = sprhld2.cfr_renamed_3415();
        sprhld.cfr_renamed_1122(byArray3, byArray);
        System.arraycopy(byArray3, 0, byArray2, n, 16);
        sprhld sprhld3 = this;
        sprhld3.cfr_renamed_3413(sprhld2.cfr_renamed_145, (byte[])(sprhld3.cfr_renamed_102 ? byArray3 : arg0));
        this.cfr_renamed_93 += 16L;
    }

    private static /* synthetic */ void cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 15;
        while (n2 >= 0) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = --n;
        }
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_79;
        if (this.cfr_renamed_102) {
            return n + this.cfr_renamed_112;
        }
        if (n < this.cfr_renamed_112) {
            return 0;
        }
        return n - this.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprpjd {
        sprhld sprhld2;
        if (this.cfr_renamed_93 == 0L) {
            this.cfr_renamed_3416();
        }
        sprhld sprhld3 = this;
        int n = sprhld3.cfr_renamed_79;
        if (!sprhld3.cfr_renamed_102) {
            if (n < this.cfr_renamed_112) {
                throw new sprpjd(sprjvm.cfr_renamed_9("F\u0007V\u0007\u0002\u0012M\t\u0002\u0015J\tP\u0012"));
            }
            n -= this.cfr_renamed_112;
        }
        if (n > 0) {
            if (arg0.length < arg1 + n) {
                throw new spreid(sprewl.cfr_renamed_9("\"`\u0019e\u0018aMw\u0018s\u000bp\u001f5\u0019z\u00025\u001e}\u0002g\u0019"));
            }
            sprhld sprhld4 = this;
            sprhld4.cfr_renamed_3417(sprhld4.cfr_renamed_137, 0, n, arg0, arg1);
        }
        sprhld sprhld5 = this;
        sprhld5.cfr_renamed_152 += (long)this.cfr_renamed_0;
        if (sprhld5.cfr_renamed_152 > this.cfr_renamed_91) {
            if (this.cfr_renamed_0 > 0) {
                sprhld sprhld6 = this;
                sprhld6.cfr_renamed_3418(this.cfr_renamed_114, sprhld6.cfr_renamed_272, 0, this.cfr_renamed_0);
            }
            if (this.cfr_renamed_91 > 0L) {
                sprhld sprhld7 = this;
                sprhld.cfr_renamed_1122(sprhld7.cfr_renamed_114, sprhld7.cfr_renamed_132);
            }
            sprhld sprhld8 = this;
            long l = sprhld8.cfr_renamed_93 * 8L + 127L >>> 7;
            byte[] byArray = new byte[16];
            if (sprhld8.cfr_renamed_105 == null) {
                this.cfr_renamed_105 = new sprvcd();
                this.cfr_renamed_105.cfr_renamed_148(this.cfr_renamed_86);
            }
            sprhld sprhld9 = this;
            sprhld9.cfr_renamed_105.cfr_renamed_3419(l, byArray);
            sprhld.cfr_renamed_3420(sprhld9.cfr_renamed_114, byArray);
            sprhld.cfr_renamed_1122(sprhld9.cfr_renamed_145, this.cfr_renamed_114);
        }
        byte[] byArray = new byte[16];
        sprhld sprhld10 = this;
        sprhld sprhld11 = this;
        sprtsa.cfr_renamed_450(sprhld11.cfr_renamed_152 * 8L, byArray, 0);
        sprtsa.cfr_renamed_450(sprhld11.cfr_renamed_93 * 8L, byArray, 8);
        sprhld10.cfr_renamed_3413(sprhld11.cfr_renamed_145, byArray);
        byte[] byArray2 = new byte[16];
        sprhld10.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_31, 0, byArray2, 0);
        sprhld.cfr_renamed_1122(byArray2, this.cfr_renamed_145);
        int n2 = n;
        this.cfr_renamed_2 = new byte[this.cfr_renamed_112];
        System.arraycopy(byArray2, 0, this.cfr_renamed_2, 0, this.cfr_renamed_112);
        if (sprhld10.cfr_renamed_102) {
            if (arg0.length < arg1 + n + this.cfr_renamed_112) {
                throw new spreid(sprjvm.cfr_renamed_9(")W\u0012R\u0013VF@\u0013D\u0000G\u0014\u0002\u0012M\t\u0002\u0015J\tP\u0012"));
            }
            sprhld2 = this;
            System.arraycopy(this.cfr_renamed_2, 0, arg0, arg1 + this.cfr_renamed_79, this.cfr_renamed_112);
            n2 += this.cfr_renamed_112;
        } else {
            sprhld sprhld12 = this;
            byte[] byArray3 = new byte[sprhld12.cfr_renamed_112];
            System.arraycopy(sprhld12.cfr_renamed_137, n, byArray3, 0, this.cfr_renamed_112);
            if (!sprzra.cfr_renamed_559(sprhld12.cfr_renamed_2, byArray3)) {
                throw new sprpjd(sprewl.cfr_renamed_9("\u0000t\u000e5\u000e}\bv\u00065\u0004{MR.XMs\f|\u0001p\t"));
            }
            sprhld2 = this;
        }
        sprhld2.cfr_renamed_3402(false);
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3417(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg0;
        sprhld sprhld2 = this;
        byte[] byArray3 = sprhld2.cfr_renamed_3415();
        sprhld.cfr_renamed_3421(byArray3, byArray, n, n2);
        System.arraycopy(byArray3, 0, byArray2, n3, n2);
        sprhld sprhld3 = this;
        sprhld3.cfr_renamed_3418(sprhld2.cfr_renamed_145, (byte[])(sprhld3.cfr_renamed_102 ? byArray3 : arg0), 0, (int)arg2);
        this.cfr_renamed_93 += (long)arg2;
    }

    private /* synthetic */ void cfr_renamed_3416() {
        if (this.cfr_renamed_152 > 0L) {
            sprhld sprhld2 = this;
            System.arraycopy(this.cfr_renamed_114, 0, sprhld2.cfr_renamed_132, 0, 16);
            this.cfr_renamed_91 = sprhld2.cfr_renamed_152;
        }
        if (this.cfr_renamed_0 > 0) {
            sprhld sprhld3 = this;
            sprhld sprhld4 = this;
            sprhld3.cfr_renamed_3418(sprhld3.cfr_renamed_132, sprhld4.cfr_renamed_272, 0, this.cfr_renamed_0);
            sprhld4.cfr_renamed_91 += (long)this.cfr_renamed_0;
        }
        if (this.cfr_renamed_91 > 0L) {
            System.arraycopy(this.cfr_renamed_132, 0, this.cfr_renamed_145, 0, 16);
        }
    }

    private static /* synthetic */ void cfr_renamed_3422(byte[] arg0) {
        int n = 0;
        int n2 = 0;
        byte[] byArray = arg0;
        while (true) {
            int n3 = byArray[n] & 0xFF;
            arg0[n++] = (byte)(n3 >>> 1 | n2);
            if (n == 16) {
                return;
            }
            n2 = (n3 & 1) << 7;
            byArray = arg0;
        }
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3402(boolean bl) {
        void arg0;
        sprhld sprhld2 = this;
        sprhld sprhld3 = this;
        sprhld sprhld4 = this;
        this.cfr_renamed_4.cfr_renamed_41();
        this.cfr_renamed_145 = new byte[16];
        sprhld4.cfr_renamed_114 = new byte[16];
        sprhld4.cfr_renamed_132 = new byte[16];
        sprhld3.cfr_renamed_272 = new byte[16];
        sprhld3.cfr_renamed_0 = 0;
        sprhld2.cfr_renamed_152 = 0L;
        sprhld2.cfr_renamed_91 = 0L;
        this.cfr_renamed_3 = sprzra.cfr_renamed_158(this.cfr_renamed_31);
        this.cfr_renamed_79 = 0;
        this.cfr_renamed_93 = 0L;
        if (this.cfr_renamed_137 != null) {
            sprzra.cfr_renamed_492(this.cfr_renamed_137, (byte)0);
        }
        if (arg0 != false) {
            this.cfr_renamed_2 = null;
        }
        if (this.cfr_renamed_107 != null) {
            sprhld sprhld5 = this;
            sprhld5.cfr_renamed_2417(this.cfr_renamed_107, 0, sprhld5.cfr_renamed_107.length);
        }
    }

    private /* synthetic */ byte[] cfr_renamed_3415() {
        int n;
        int n2 = n = 15;
        while (n2 >= 12) {
            byte by;
            sprhld sprhld2 = this;
            sprhld2.cfr_renamed_3[n] = by = (byte)(sprhld2.cfr_renamed_3[n] + 1 & 0xFF);
            if (by != 0) break;
            n2 = --n;
        }
        byte[] byArray = new byte[16];
        sprhld sprhld3 = this;
        sprhld3.cfr_renamed_4.cfr_renamed_3064(sprhld3.cfr_renamed_3, 0, byArray, 0);
        return byArray;
    }

    @Override
    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ void cfr_renamed_3421(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n = arg3;
        while (true) {
            --arg3;
            if (n <= 0) break;
            int n2 = arg3;
            byte[] byArray = arg0;
            n = n2;
            byArray[n2] = (byte)(byArray[n2] ^ arg1[arg2 + arg3]);
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_1315()).append(sprjvm.cfr_renamed_9("\r!a+")).toString();
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprhld sprhld2 = this;
            this.cfr_renamed_272[sprhld2.cfr_renamed_0] = arg0[arg1 + n];
            if (++sprhld2.cfr_renamed_0 == 16) {
                sprhld sprhld3 = this;
                sprhld sprhld4 = this;
                sprhld3.cfr_renamed_3413(sprhld4.cfr_renamed_114, sprhld4.cfr_renamed_272);
                sprhld3.cfr_renamed_0 = 0;
                sprhld3.cfr_renamed_152 += 16L;
            }
            n2 = ++n;
        }
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_79;
        if (!this.cfr_renamed_102) {
            if (n < this.cfr_renamed_112) {
                return 0;
            }
            n -= this.cfr_renamed_112;
        }
        int n2 = n;
        return n2 - n2 % 16;
    }

    private /* synthetic */ void cfr_renamed_3412(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = Math.min(arg2 - n, 16);
            int n4 = n;
            this.cfr_renamed_3418(arg0, arg1, n4, n3);
            n2 = n += 16;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3212(byte by) {
        void arg0;
        sprhld sprhld2 = this;
        this.cfr_renamed_272[sprhld2.cfr_renamed_0] = arg0;
        if (++sprhld2.cfr_renamed_0 == 16) {
            sprhld sprhld3 = this;
            sprhld sprhld4 = this;
            sprhld3.cfr_renamed_3413(sprhld4.cfr_renamed_114, sprhld4.cfr_renamed_272);
            sprhld3.cfr_renamed_0 = 0;
            sprhld3.cfr_renamed_152 += 16L;
        }
    }

    private static /* synthetic */ void cfr_renamed_3420(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = sprzra.cfr_renamed_158(arg0);
        byte[] byArray2 = new byte[16];
        int n2 = n = 0;
        while (n2 < 16) {
            int n3;
            byte by = arg1[n];
            int n4 = n3 = 7;
            while (n4 >= 0) {
                if ((by & 1 << n3) != 0) {
                    sprhld.cfr_renamed_1122(byArray2, byArray);
                }
                boolean bl = (byArray[15] & 1) != 0;
                sprhld.cfr_renamed_3422(byArray);
                if (bl) {
                    byArray[0] = (byte)(byArray[0] ^ 0xFFFFFFE1);
                }
                n4 = --n3;
            }
            n2 = ++n;
        }
        System.arraycopy(byArray2, 0, arg0, 0, 16);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3413(byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprhld.cfr_renamed_1122((byte[])arg0, (byte[])arg1);
        this.cfr_renamed_119.cfr_renamed_3237((byte[])arg0);
    }

    private /* synthetic */ void cfr_renamed_3411(byte[] arg0, int arg1) {
        if (arg0.length < arg1 + 16) {
            throw new spreid(sprewl.cfr_renamed_9("\"`\u0019e\u0018aMw\u0018s\u000bp\u001f5\u0019z\u00025\u001e}\u0002g\u0019"));
        }
        if (this.cfr_renamed_93 == 0L) {
            this.cfr_renamed_3416();
        }
        sprhld sprhld2 = this;
        sprhld2.cfr_renamed_3414(sprhld2.cfr_renamed_137, arg0, arg1);
        if (sprhld2.cfr_renamed_102) {
            this.cfr_renamed_79 = 0;
            return;
        }
        sprhld sprhld3 = this;
        System.arraycopy(this.cfr_renamed_137, 16, sprhld3.cfr_renamed_137, 0, this.cfr_renamed_112);
        this.cfr_renamed_79 = sprhld3.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprhld(sprff sprff2, sprmo sprmo2) {
        void arg0;
        sprznd arg1;
        if (sprff2.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprjvm.cfr_renamed_9("A\u000fR\u000eG\u0014\u0002\u0014G\u0017W\u000fP\u0003FFU\u000fV\u000e\u0002\u0007\u0002\u0004N\tA\r\u0002\u0015K\u001cGFM\u0000\u0002W\u0014H"));
        }
        if (arg1 == null) {
            arg1 = new sprznd();
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_119 = arg1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3418(byte[] byArray, byte[] byArray2, int n, int n2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhld.cfr_renamed_3421((byte[])arg0, (byte[])arg1, (int)arg2, (int)arg3);
        this.cfr_renamed_119.cfr_renamed_3237((byte[])arg0);
    }

    public sprhld(sprff arg0) {
        this(arg0, null);
    }
}

