/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprjbl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmsk;
import com.spire.presentation.packages.sprseo;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvzca;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;
import java.io.ByteArrayOutputStream;

public class sprhuk
implements spriw {
    private byte[] cfr_renamed_953;
    private final int cfr_renamed_133 = 16;
    private final byte[][] cfr_renamed_185;
    private final ByteArrayOutputStream spr\ufe34;
    private final int cfr_renamed_82 = 16;
    private final int cfr_renamed_126;
    private final int cfr_renamed_88 = 3;
    private final byte[][] cfr_renamed_31;
    private boolean cfr_renamed_272;
    private boolean cfr_renamed_145;
    private byte[] cfr_renamed_114;
    private final int cfr_renamed_96 = 16;
    private final int cfr_renamed_105 = 7;
    private boolean cfr_renamed_137;
    private byte[] cfr_renamed_79;
    private final int cfr_renamed_107;
    private final int cfr_renamed_132 = 3;
    private byte[][] cfr_renamed_102;
    private final int cfr_renamed_93 = 12;
    private byte[] cfr_renamed_86;
    private final byte[] cfr_renamed_152;
    private final int cfr_renamed_112;
    private final int cfr_renamed_119 = 64;
    private final int cfr_renamed_91 = 4;
    private final int cfr_renamed_0;
    private final ByteArrayOutputStream cfr_renamed_1;
    private boolean cfr_renamed_2;
    private final int cfr_renamed_3 = 8;
    private byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprseo.cfr_renamed_9(";;\" &u0 437'r!=:r&:: !"));
        }
        this.cfr_renamed_1.write(arg0, arg1, arg2);
        return 0;
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_107;
    }

    private /* synthetic */ void cfr_renamed_10349() {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 64) {
            byte[] byArray = this.cfr_renamed_102[n2 >>> 3];
            int n4 = n2 & 7;
            byte by = (byte)((this.cfr_renamed_114[n2 >> 1] & 0xFF) >>> 4 * (n2 & 1) & 0xF);
            byArray[n4] = by;
            n3 = ++n2;
        }
        int n5 = n = 0;
        while (n5 < 12) {
            int n6;
            int n7 = n2 = 0;
            while (n7 < 8) {
                byte[] byArray = this.cfr_renamed_102[n2];
                byte by = (byte)(byArray[0] ^ this.cfr_renamed_31[n2][n]);
                byArray[0] = by;
                n7 = ++n2;
            }
            int n8 = n2 = 0;
            while (n8 < 8) {
                int n9 = n6 = 0;
                while (n9 < 8) {
                    sprhuk sprhuk2 = this;
                    int n10 = n6++;
                    this.cfr_renamed_102[n2][n10] = sprhuk2.cfr_renamed_152[sprhuk2.cfr_renamed_102[n2][n10]];
                    n9 = n6;
                }
                n8 = ++n2;
            }
            int n11 = n2 = 1;
            while (n11 < 8) {
                sprhuk sprhuk3 = this;
                System.arraycopy(sprhuk3.cfr_renamed_102[n2], 0, this.cfr_renamed_114, 0, 8);
                sprhuk sprhuk4 = this;
                System.arraycopy(sprhuk3.cfr_renamed_114, n2, sprhuk4.cfr_renamed_102[n2], 0, 8 - n2);
                System.arraycopy(sprhuk4.cfr_renamed_114, 0, this.cfr_renamed_102[n2], 8 - n2, n2++);
                n11 = n2;
            }
            int n12 = n6 = 0;
            while (n12 < 8) {
                int n13 = n2 = 0;
                while (n13 < 8) {
                    int n14;
                    byte by = 0;
                    int n15 = n14 = 0;
                    while (n15 < 8) {
                        int n16;
                        sprhuk sprhuk5 = this;
                        int n17 = sprhuk5.cfr_renamed_185[n2][n14];
                        int n18 = 0;
                        byte by2 = sprhuk5.cfr_renamed_102[n14][n6];
                        int n19 = n16 = 0;
                        while (n19 < 4) {
                            if ((by2 >>> n16 & 1) != 0) {
                                n18 ^= n17;
                            }
                            int n20 = n17;
                            if ((n17 >>> 3 & 1) != 0) {
                                n17 = n20 << 1;
                                n17 ^= 3;
                            } else {
                                n17 = n20 << 1;
                            }
                            n19 = ++n16;
                        }
                        by = (byte)(by ^ n18 & 0xF);
                        n15 = ++n14;
                    }
                    this.cfr_renamed_114[n2++] = by;
                    n13 = n2;
                }
                int n21 = n2 = 0;
                while (n21 < 8) {
                    byte[] byArray = this.cfr_renamed_102[n2];
                    byte by = this.cfr_renamed_114[n2];
                    byArray[n6] = by;
                    n21 = ++n2;
                }
                n12 = ++n6;
            }
            n5 = ++n;
        }
        int n22 = n2 = 0;
        while (n22 < 64) {
            int n23 = n2 >>> 1;
            byte by = (byte)(this.cfr_renamed_102[n2 >>> 3][n2 & 7] & 0xF | (this.cfr_renamed_102[n2 >>> 3][n2 + 1 & 7] & 0xF) << 4);
            this.cfr_renamed_114[n23] = by;
            n22 = n2 += 2;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvzca.cfr_renamed_9("0\u0010\u000f\f\u000f\u0016M:\u0005\u001d\u0014\u0014\u0005X!=!<");
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        this.spr\ufe34.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_10350(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n++;
            byte by = (byte)(this.cfr_renamed_114[n3] ^ arg0[arg1]);
            ++arg1;
            this.cfr_renamed_114[n3] = by;
            n2 = n;
        }
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + 16;
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return this.cfr_renamed_505(byArray, 0, 1, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_10351(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        byte[] byArray = this.cfr_renamed_102[0];
        int n2 = Math.min(arg4, this.cfr_renamed_0);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_0 - 1) {
            int n4 = n;
            byte by = (byte)((this.cfr_renamed_114[n] & 0xFF) >>> 1 | (this.cfr_renamed_114[n4 + 1] & 1) << 7);
            byArray[n4] = by;
            n3 = ++n;
        }
        byArray[this.cfr_renamed_0 - 1] = (byte)((this.cfr_renamed_114[n] & 0xFF) >>> 1 | (this.cfr_renamed_114[0] & 1) << 7);
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = n + arg1;
            byte by = this.cfr_renamed_114[n + this.cfr_renamed_0];
            int n7 = n + arg3;
            arg0[n6] = (byte)(by ^ arg2[n7]);
            n5 = ++n;
        }
        int n8 = n;
        while (n8 < arg4) {
            int n9 = n + arg1;
            byte by = byArray[n - this.cfr_renamed_0];
            int n10 = n + arg3;
            arg0[n9] = (byte)(by ^ arg2[n10]);
            n8 = ++n;
        }
        sprhuk sprhuk2 = this;
        if (this.cfr_renamed_272) {
            sprhuk2.cfr_renamed_10350(arg2, arg3, arg4);
            return;
        }
        sprhuk2.cfr_renamed_10350(arg0, arg3, arg4);
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprseo.cfr_renamed_9(";;\" &u0 437'r!=:r&:: !"));
        }
        this.spr\ufe34.write(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprhuk sprhuk2;
        int n;
        int n2;
        int n3;
        int n4;
        boolean bl;
        int n5;
        boolean bl2;
        if (!this.cfr_renamed_145) {
            throw new IllegalArgumentException(sprvzca.cfr_renamed_9(".\u001d\u0005\u001c@\u001b\u0001\u0014\fX\t\u0016\t\f@\u001e\u0015\u0016\u0003\f\t\u0017\u000eX\u0002\u001d\u0006\u0017\u0012\u001d@\u001d\u000e\u001b\u0012\u0001\u0010\f\t\u0017\u000eW\u0004\u001d\u0003\n\u0019\b\u0014\u0011\u000f\u0016"));
        }
        int n6 = this.cfr_renamed_1.size() - (this.cfr_renamed_272 ? 0 : 16);
        if (this.cfr_renamed_272 && n6 + 16 + arg1 > arg0.length || !this.cfr_renamed_272 && n6 + arg1 > arg0.length) {
            throw new sprwjl(sprseo.cfr_renamed_9(":'!\" &u0 437'r!=:r&:: !"));
        }
        sprhuk sprhuk3 = this;
        byte[] byArray = sprhuk3.cfr_renamed_1.toByteArray();
        int n7 = 0;
        sprhuk3.cfr_renamed_86 = sprhuk3.spr\ufe34.toByteArray();
        int n8 = sprhuk3.cfr_renamed_86.length;
        if (n8 != 0 || n6 != 0) {
            this.cfr_renamed_2 = false;
        }
        if (n6 != 0) {
            bl2 = true;
            n5 = n8;
        } else {
            bl2 = false;
            n5 = n8;
        }
        byte by = this.cfr_renamed_10352(bl2, n5 % this.cfr_renamed_107 == 0, (byte)3, (byte)4);
        if (n8 != 0) {
            bl = true;
            n4 = n6;
        } else {
            bl = false;
            n4 = n6;
        }
        byte by2 = this.cfr_renamed_10352(bl, n4 % this.cfr_renamed_107 == 0, (byte)5, (byte)6);
        if (n8 != 0) {
            n3 = (n8 + this.cfr_renamed_107 - 1) / this.cfr_renamed_107;
            int n9 = n2 = 0;
            while (n9 < n3 - 1) {
                sprhuk sprhuk4 = this;
                sprhuk4.cfr_renamed_10349();
                sprhuk sprhuk5 = this;
                int n10 = n2 * sprhuk5.cfr_renamed_107;
                sprhuk5.cfr_renamed_10350(sprhuk4.cfr_renamed_86, n10, this.cfr_renamed_107);
                n9 = ++n2;
            }
            this.cfr_renamed_10349();
            sprhuk sprhuk6 = this;
            n = n8 - n2 * sprhuk6.cfr_renamed_107;
            this.cfr_renamed_10350(sprhuk6.cfr_renamed_86, n2 * this.cfr_renamed_107, n);
            if (n < this.cfr_renamed_107) {
                int n11 = n;
                this.cfr_renamed_114[n11] = (byte)(this.cfr_renamed_114[n11] ^ 1);
            }
            sprhuk sprhuk7 = this;
            byte[] byArray2 = sprhuk7.cfr_renamed_114;
            int n12 = sprhuk7.cfr_renamed_112 - 1;
            byArray2[n12] = (byte)(byArray2[n12] ^ by << this.cfr_renamed_126);
        }
        if (n6 != 0) {
            n3 = (n6 + this.cfr_renamed_107 - 1) / this.cfr_renamed_107;
            int n13 = n2 = 0;
            while (n13 < n3 - 1) {
                sprhuk sprhuk8 = this;
                sprhuk8.cfr_renamed_10349();
                int n14 = arg1 + n2 * this.cfr_renamed_107;
                int n15 = n7 + n2 * this.cfr_renamed_107;
                sprhuk8.cfr_renamed_10351(arg0, n14, byArray, n15, this.cfr_renamed_107);
                n13 = ++n2;
            }
            this.cfr_renamed_10349();
            n = n6 - n2 * this.cfr_renamed_107;
            this.cfr_renamed_10351(arg0, arg1 + n2 * this.cfr_renamed_107, byArray, n7 + n2 * this.cfr_renamed_107, n);
            if (n < this.cfr_renamed_107) {
                int n16 = n;
                this.cfr_renamed_114[n16] = (byte)(this.cfr_renamed_114[n16] ^ 1);
            }
            sprhuk sprhuk9 = this;
            byte[] byArray3 = sprhuk9.cfr_renamed_114;
            int n17 = sprhuk9.cfr_renamed_112 - 1;
            byArray3[n17] = (byte)(byArray3[n17] ^ by2 << this.cfr_renamed_126);
        }
        arg1 += n6;
        if (this.cfr_renamed_2) {
            sprhuk sprhuk10 = this;
            byte[] byArray4 = sprhuk10.cfr_renamed_114;
            int n18 = sprhuk10.cfr_renamed_112 - 1;
            byArray4[n18] = (byte)(byArray4[n18] ^ 1 << this.cfr_renamed_126);
        }
        sprhuk sprhuk11 = this;
        sprhuk11.cfr_renamed_10349();
        this.cfr_renamed_4 = new byte[16];
        System.arraycopy(sprhuk11.cfr_renamed_114, 0, this.cfr_renamed_4, 0, 16);
        if (this.cfr_renamed_272) {
            sprhuk sprhuk12 = this;
            sprhuk2 = sprhuk12;
            n6 += 16;
            System.arraycopy(sprhuk12.cfr_renamed_4, 0, arg0, arg1, 16);
        } else {
            int n19 = n2 = 0;
            while (n19 < 16) {
                if (this.cfr_renamed_4[n2] != byArray[n6 + n2]) {
                    throw new IllegalArgumentException(sprvzca.cfr_renamed_9("-\u0019\u0003X\u0004\u0017\u0005\u000b@\u0016\u000f\f@\u0015\u0001\f\u0003\u0010"));
                }
                n19 = ++n2;
            }
            sprhuk2 = this;
        }
        sprhuk2.cfr_renamed_3402(false);
        return n6;
    }

    private /* synthetic */ void cfr_renamed_3402(boolean arg0) {
        if (arg0) {
            this.cfr_renamed_4 = null;
        }
        sprhuk sprhuk2 = this;
        sprhuk2.cfr_renamed_2 = true;
        sprhuk2.spr\ufe34.reset();
        sprhuk2.cfr_renamed_1.reset();
        System.arraycopy(sprhuk2.cfr_renamed_953, 0, this.cfr_renamed_114, 0, this.cfr_renamed_953.length);
        sprhuk sprhuk3 = this;
        System.arraycopy(this.cfr_renamed_79, 0, sprhuk3.cfr_renamed_114, sprhuk3.cfr_renamed_953.length, this.cfr_renamed_79.length);
        this.cfr_renamed_137 = false;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        return arg0;
    }

    public int cfr_renamed_10299() {
        return 16;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_272 = arg0;
        if (!(sprbj2 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprseo.cfr_renamed_9("\u0005::&:<x\u001007!>0r\u0014\u0017\u0014\u0016u;;;!r%3'387!7'!u? !!r<<6> 60r4<u\u001b\u0003"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        this.cfr_renamed_79 = sprkpk2.cfr_renamed_1205();
        if (this.cfr_renamed_79 == null || this.cfr_renamed_79.length != 16) {
            throw new IllegalArgumentException(sprvzca.cfr_renamed_9("0\u0010\u000f\f\u000f\u0016M:\u0005\u001d\u0014\u0014\u0005X!=!<@\n\u0005\t\u0015\u0011\u0012\u001d\u0013X\u0005\u0000\u0001\u001b\u0014\u0014\u0019XQN@\u001a\u0019\f\u0005\u000b@\u0017\u0006X)."));
        }
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprseo.cfr_renamed_9("\u0005::&:<x\u001007!>0r\u0014\u0017\u0014\u0016u;;;!r%3'387!7'!u? !!r<<6> 60r4r>7,"));
        }
        sprtpk sprtpk2 = (sprtpk)sprkpk2.cfr_renamed_284();
        this.cfr_renamed_953 = sprtpk2.cfr_renamed_1521();
        if (this.cfr_renamed_953.length != 16) {
            throw new IllegalArgumentException(sprvzca.cfr_renamed_9("0\u0010\u000f\f\u000f\u0016M:\u0005\u001d\u0014\u0014\u0005X!=!<@\u0013\u0005\u0001@\u0015\u0015\u000b\u0014X\u0002\u001d@IR@@\u001a\t\f\u0013X\f\u0017\u000e\u001f"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915((boolean)arg0)));
        this.cfr_renamed_114 = new byte[this.cfr_renamed_112];
        this.cfr_renamed_102 = new byte[8][8];
        this.cfr_renamed_4 = new byte[16];
        this.cfr_renamed_145 = true;
        this.cfr_renamed_3402(false);
    }

    public int cfr_renamed_10294() {
        return 16;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprhuk(sprjbl sprjbl2) {
        void arg0;
        sprhuk sprhuk2 = this;
        sprhuk sprhuk3 = this;
        sprhuk sprhuk4 = this;
        sprhuk sprhuk5 = this;
        sprhuk sprhuk6 = this;
        sprhuk sprhuk7 = this;
        sprhuk sprhuk8 = this;
        sprhuk7.spr\ufe34 = new ByteArrayOutputStream();
        sprhuk7.cfr_renamed_1 = new ByteArrayOutputStream();
        sprhuk7.cfr_renamed_133 = 16;
        sprhuk6.cfr_renamed_82 = 16;
        sprhuk6.cfr_renamed_96 = 16;
        sprhuk5.cfr_renamed_93 = 12;
        sprhuk5.cfr_renamed_3 = 8;
        sprhuk4.cfr_renamed_88 = 3;
        sprhuk4.cfr_renamed_105 = 7;
        sprhuk3.cfr_renamed_119 = 64;
        sprhuk3.cfr_renamed_91 = 4;
        sprhuk2.cfr_renamed_132 = 3;
        byte[][] byArrayArray = new byte[8][];
        byte[] byArray = new byte[12];
        byArray[0] = 1;
        byArray[1] = 3;
        byArray[2] = 7;
        byArray[3] = 14;
        byArray[4] = 13;
        byArray[5] = 11;
        byArray[6] = 6;
        byArray[7] = 12;
        byArray[8] = 9;
        byArray[9] = 2;
        byArray[10] = 5;
        byArray[11] = 10;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[12];
        byArray2[0] = 0;
        byArray2[1] = 2;
        byArray2[2] = 6;
        byArray2[3] = 15;
        byArray2[4] = 12;
        byArray2[5] = 10;
        byArray2[6] = 7;
        byArray2[7] = 13;
        byArray2[8] = 8;
        byArray2[9] = 3;
        byArray2[10] = 4;
        byArray2[11] = 11;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[12];
        byArray3[0] = 2;
        byArray3[1] = 0;
        byArray3[2] = 4;
        byArray3[3] = 13;
        byArray3[4] = 14;
        byArray3[5] = 8;
        byArray3[6] = 5;
        byArray3[7] = 15;
        byArray3[8] = 10;
        byArray3[9] = 1;
        byArray3[10] = 6;
        byArray3[11] = 9;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[12];
        byArray4[0] = 6;
        byArray4[1] = 4;
        byArray4[2] = 0;
        byArray4[3] = 9;
        byArray4[4] = 10;
        byArray4[5] = 12;
        byArray4[6] = 1;
        byArray4[7] = 11;
        byArray4[8] = 14;
        byArray4[9] = 5;
        byArray4[10] = 2;
        byArray4[11] = 13;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[12];
        byArray5[0] = 14;
        byArray5[1] = 12;
        byArray5[2] = 8;
        byArray5[3] = 1;
        byArray5[4] = 2;
        byArray5[5] = 4;
        byArray5[6] = 9;
        byArray5[7] = 3;
        byArray5[8] = 6;
        byArray5[9] = 13;
        byArray5[10] = 10;
        byArray5[11] = 5;
        byArrayArray[4] = byArray5;
        byte[] byArray6 = new byte[12];
        byArray6[0] = 15;
        byArray6[1] = 13;
        byArray6[2] = 9;
        byArray6[3] = 0;
        byArray6[4] = 3;
        byArray6[5] = 5;
        byArray6[6] = 8;
        byArray6[7] = 2;
        byArray6[8] = 7;
        byArray6[9] = 12;
        byArray6[10] = 11;
        byArray6[11] = 4;
        byArrayArray[5] = byArray6;
        byte[] byArray7 = new byte[12];
        byArray7[0] = 13;
        byArray7[1] = 15;
        byArray7[2] = 11;
        byArray7[3] = 2;
        byArray7[4] = 1;
        byArray7[5] = 7;
        byArray7[6] = 10;
        byArray7[7] = 0;
        byArray7[8] = 5;
        byArray7[9] = 14;
        byArray7[10] = 9;
        byArray7[11] = 6;
        byArrayArray[6] = byArray7;
        byte[] byArray8 = new byte[12];
        byArray8[0] = 9;
        byArray8[1] = 11;
        byArray8[2] = 15;
        byArray8[3] = 6;
        byArray8[4] = 5;
        byArray8[5] = 3;
        byArray8[6] = 14;
        byArray8[7] = 4;
        byArray8[8] = 1;
        byArray8[9] = 10;
        byArray8[10] = 13;
        byArray8[11] = 2;
        byArrayArray[7] = byArray8;
        sprhuk2.cfr_renamed_31 = byArrayArray;
        byte[][] byArrayArray2 = new byte[8][];
        byte[] byArray9 = new byte[8];
        byArray9[0] = 2;
        byArray9[1] = 4;
        byArray9[2] = 2;
        byArray9[3] = 11;
        byArray9[4] = 2;
        byArray9[5] = 8;
        byArray9[6] = 5;
        byArray9[7] = 6;
        byArrayArray2[0] = byArray9;
        byte[] byArray10 = new byte[8];
        byArray10[0] = 12;
        byArray10[1] = 9;
        byArray10[2] = 8;
        byArray10[3] = 13;
        byArray10[4] = 7;
        byArray10[5] = 7;
        byArray10[6] = 5;
        byArray10[7] = 2;
        byArrayArray2[1] = byArray10;
        byte[] byArray11 = new byte[8];
        byArray11[0] = 4;
        byArray11[1] = 4;
        byArray11[2] = 13;
        byArray11[3] = 13;
        byArray11[4] = 9;
        byArray11[5] = 4;
        byArray11[6] = 13;
        byArray11[7] = 9;
        byArrayArray2[2] = byArray11;
        byte[] byArray12 = new byte[8];
        byArray12[0] = 1;
        byArray12[1] = 6;
        byArray12[2] = 5;
        byArray12[3] = 1;
        byArray12[4] = 12;
        byArray12[5] = 13;
        byArray12[6] = 15;
        byArray12[7] = 14;
        byArrayArray2[3] = byArray12;
        byte[] byArray13 = new byte[8];
        byArray13[0] = 15;
        byArray13[1] = 12;
        byArray13[2] = 9;
        byArray13[3] = 13;
        byArray13[4] = 14;
        byArray13[5] = 5;
        byArray13[6] = 14;
        byArray13[7] = 13;
        byArrayArray2[4] = byArray13;
        byte[] byArray14 = new byte[8];
        byArray14[0] = 9;
        byArray14[1] = 14;
        byArray14[2] = 5;
        byArray14[3] = 15;
        byArray14[4] = 4;
        byArray14[5] = 12;
        byArray14[6] = 9;
        byArray14[7] = 6;
        byArrayArray2[5] = byArray14;
        byte[] byArray15 = new byte[8];
        byArray15[0] = 12;
        byArray15[1] = 2;
        byArray15[2] = 2;
        byArray15[3] = 10;
        byArray15[4] = 3;
        byArray15[5] = 1;
        byArray15[6] = 1;
        byArray15[7] = 14;
        byArrayArray2[6] = byArray15;
        byte[] byArray16 = new byte[8];
        byArray16[0] = 15;
        byArray16[1] = 1;
        byArray16[2] = 13;
        byArray16[3] = 10;
        byArray16[4] = 5;
        byArray16[5] = 10;
        byArray16[6] = 2;
        byArray16[7] = 3;
        byArrayArray2[7] = byArray16;
        this.cfr_renamed_185 = byArrayArray2;
        byte[] byArray17 = new byte[16];
        byArray17[0] = 12;
        byArray17[1] = 5;
        byArray17[2] = 6;
        byArray17[3] = 11;
        byArray17[4] = 9;
        byArray17[5] = 0;
        byArray17[6] = 10;
        byArray17[7] = 13;
        byArray17[8] = 3;
        byArray17[9] = 14;
        byArray17[10] = 15;
        byArray17[11] = 8;
        byArray17[12] = 4;
        byArray17[13] = 7;
        byArray17[14] = 1;
        byArray17[15] = 2;
        this.cfr_renamed_152 = byArray17;
        int n = 0;
        int n2 = 0;
        switch (sprmsk.cfr_renamed_4[arg0.ordinal()]) {
            case 1: {
                n2 = 32;
                n = 224;
                sprhuk sprhuk9 = this;
                break;
            }
            case 2: {
                n2 = 128;
                n = 128;
            }
            default: {
                sprhuk sprhuk9 = this;
            }
        }
        sprhuk9.cfr_renamed_107 = n2 + 7 >>> 3;
        this.cfr_renamed_0 = this.cfr_renamed_107 >>> 1;
        int n3 = n2 + n;
        this.cfr_renamed_112 = n3 + 7 >>> 3;
        this.cfr_renamed_126 = n3 - (this.cfr_renamed_112 - 1 << 3) - 3;
        this.cfr_renamed_145 = false;
    }

    private /* synthetic */ byte cfr_renamed_10352(boolean arg0, boolean arg1, byte arg2, byte arg3) {
        if (arg0 && arg1) {
            return 1;
        }
        if (arg0) {
            return 2;
        }
        if (arg1) {
            return arg2;
        }
        return arg3;
    }

    @Override
    public void cfr_renamed_41() {
        if (!this.cfr_renamed_145) {
            throw new IllegalArgumentException(sprseo.cfr_renamed_9("\u001c071r639>u;;;!r3';1!;:<u004: 0r0<6 ,\"!;:<z601'+%&<=;"));
        }
        this.cfr_renamed_3402(true);
    }
}

