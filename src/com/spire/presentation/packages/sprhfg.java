/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbzf;
import com.spire.presentation.packages.sprdng;
import com.spire.presentation.packages.sprhep;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.spriwf;
import com.spire.presentation.packages.sprlag;
import com.spire.presentation.packages.sproze;
import java.security.SecureRandom;

public class sprhfg {
    private final int cfr_renamed_185;
    public static final int spr\ufe34 = 32;
    private final int cfr_renamed_82;
    public static final int cfr_renamed_126 = 3329;
    private final int cfr_renamed_88;
    private sprdng cfr_renamed_31;
    private final int cfr_renamed_272;
    private final int cfr_renamed_145;
    public static final int cfr_renamed_114 = 384;
    private final int cfr_renamed_96;
    private final int cfr_renamed_105;
    private final int cfr_renamed_137;
    public static final int cfr_renamed_79 = 256;
    private final int cfr_renamed_107;
    private final int cfr_renamed_132;
    private final int cfr_renamed_102;
    private final int cfr_renamed_93;
    private static final int cfr_renamed_86 = 32;
    private final int cfr_renamed_152;
    private final int cfr_renamed_112;
    private final int cfr_renamed_119;
    public static final int cfr_renamed_91 = 62209;
    private static final int cfr_renamed_0 = 32;
    private final int cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private final sprlag cfr_renamed_3;
    private static final int cfr_renamed_4 = 2;

    public int cfr_renamed_7003() {
        return this.cfr_renamed_102;
    }

    public int cfr_renamed_7030() {
        return this.cfr_renamed_185;
    }

    public byte[][] cfr_renamed_7016() {
        sprhfg sprhfg2 = this;
        byte[][] byArray = sprhfg2.cfr_renamed_31.cfr_renamed_1223();
        byte[] byArray2 = new byte[sprhfg2.cfr_renamed_88];
        System.arraycopy(byArray[1], 0, byArray2, 0, this.cfr_renamed_88);
        byte[] byArray3 = new byte[32];
        sprhfg2.cfr_renamed_3.cfr_renamed_6090(byArray3, byArray[0], 0);
        byte[] byArray4 = new byte[32];
        sprhfg2.cfr_renamed_2.nextBytes(byArray4);
        byte[] byArray5 = new byte[sprhfg2.cfr_renamed_119];
        System.arraycopy(byArray[0], 0, byArray5, 0, this.cfr_renamed_119);
        byte[][] byArrayArray = new byte[5][];
        byArrayArray[0] = sproze.cfr_renamed_533(byArray5, 0, byArray5.length - 32);
        byArrayArray[1] = sproze.cfr_renamed_533(byArray5, byArray5.length - 32, byArray5.length);
        byArrayArray[2] = byArray2;
        byArrayArray[3] = byArray3;
        byArrayArray[4] = byArray4;
        return byArrayArray;
    }

    private /* synthetic */ void cfr_renamed_7033(byte[] arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            System.arraycopy(arg1, 0, arg0, 0, arg2);
            return;
        }
        System.arraycopy(arg0, 0, arg0, 0, arg2);
    }

    public int cfr_renamed_7034() {
        return this.cfr_renamed_96;
    }

    public int cfr_renamed_6977() {
        return this.cfr_renamed_107;
    }

    public byte[][] cfr_renamed_7017(byte[] arg0) {
        byte[][] byArrayArray;
        byte[] byArray = new byte[64];
        byte[] byArray2 = new byte[64];
        byte[] byArray3 = new byte[32];
        sprhfg sprhfg2 = this;
        sprhfg sprhfg3 = this;
        this.cfr_renamed_2.nextBytes(byArray3);
        sprhfg3.cfr_renamed_3.cfr_renamed_6090(byArray3, byArray3, 0);
        System.arraycopy(byArray3, 0, byArray, 0, 32);
        sprhfg3.cfr_renamed_3.cfr_renamed_6090(byArray, arg0, 32);
        sprhfg2.cfr_renamed_3.cfr_renamed_6089(byArray2, byArray);
        byte[] byArray4 = sprhfg2.cfr_renamed_31.cfr_renamed_7023(sproze.cfr_renamed_533(byArray, 0, 32), arg0, sproze.cfr_renamed_533(byArray2, 32, byArray2.length));
        sprhfg sprhfg4 = this;
        sprhfg4.cfr_renamed_3.cfr_renamed_6090(byArray2, byArray4, 32);
        byte[] byArray5 = new byte[sprhfg4.cfr_renamed_93];
        sprhfg4.cfr_renamed_3.cfr_renamed_6969(byArray5, byArray2);
        byte[][] byArrayArray2 = byArrayArray = new byte[2][];
        byArrayArray2[0] = byArray5;
        byArrayArray[1] = byArray4;
        return byArrayArray2;
    }

    public int cfr_renamed_7035() {
        return this.cfr_renamed_132;
    }

    public sprlag cfr_renamed_7011() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_7036() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_7031(byte[] arg0) {
        this.cfr_renamed_2.nextBytes(arg0);
    }

    public byte[] cfr_renamed_7018(byte[] arg0, byte[] arg1) {
        byte[] byArray = new byte[64];
        byte[] byArray2 = new byte[64];
        byte[] byArray3 = sproze.cfr_renamed_533(arg1, this.cfr_renamed_88, arg1.length);
        sprhfg sprhfg2 = this;
        System.arraycopy(this.cfr_renamed_31.cfr_renamed_123(arg0, arg1), 0, byArray, 0, 32);
        System.arraycopy(arg1, sprhfg2.cfr_renamed_82 - 64, byArray, 32, 32);
        sprhfg2.cfr_renamed_3.cfr_renamed_6089(byArray2, byArray);
        byte[] byArray4 = sprhfg2.cfr_renamed_31.cfr_renamed_7023(sproze.cfr_renamed_533(byArray, 0, 32), byArray3, sproze.cfr_renamed_533(byArray2, 32, byArray2.length));
        boolean bl = !sproze.cfr_renamed_559(arg0, byArray4);
        sprhfg sprhfg3 = this;
        sprhfg sprhfg4 = this;
        sprhfg4.cfr_renamed_3.cfr_renamed_6090(byArray2, arg0, 32);
        sprhfg4.cfr_renamed_7033(byArray2, sproze.cfr_renamed_533(arg1, this.cfr_renamed_82 - 32, this.cfr_renamed_82), 32, bl);
        byte[] byArray5 = new byte[sprhfg3.cfr_renamed_93];
        sprhfg3.cfr_renamed_3.cfr_renamed_6969(byArray5, byArray2);
        return byArray5;
    }

    public void cfr_renamed_3251(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public int cfr_renamed_7037() {
        return this.cfr_renamed_88;
    }

    public int cfr_renamed_7029() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_7038() {
        return this.cfr_renamed_82;
    }

    public int cfr_renamed_7039() {
        return this.cfr_renamed_152;
    }

    public int cfr_renamed_6982() {
        return this.cfr_renamed_137;
    }

    public sprhfg(int arg0, boolean arg1) {
        sprhfg sprhfg2;
        this.cfr_renamed_107 = arg0;
        switch (this.cfr_renamed_107) {
            case 2: {
                sprhfg sprhfg3 = this;
                while (false) {
                }
                sprhfg sprhfg4 = this;
                sprhfg sprhfg5 = this;
                sprhfg5.cfr_renamed_272 = 3;
                sprhfg5.cfr_renamed_102 = 128;
                sprhfg4.cfr_renamed_137 = arg0 * 320;
                sprhfg4.cfr_renamed_93 = 16;
                break;
            }
            case 3: {
                sprhfg sprhfg3 = this;
                sprhfg sprhfg6 = this;
                sprhfg sprhfg7 = this;
                sprhfg7.cfr_renamed_272 = 2;
                sprhfg7.cfr_renamed_102 = 128;
                sprhfg6.cfr_renamed_137 = arg0 * 320;
                sprhfg6.cfr_renamed_93 = 24;
                break;
            }
            case 4: {
                sprhfg sprhfg3 = this;
                sprhfg sprhfg8 = this;
                sprhfg sprhfg9 = this;
                sprhfg9.cfr_renamed_272 = 2;
                sprhfg9.cfr_renamed_102 = 160;
                sprhfg8.cfr_renamed_137 = arg0 * 352;
                sprhfg8.cfr_renamed_93 = 32;
                break;
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprhql.cfr_renamed_9("l?\u0007")).append(arg0).append(sprhep.cfr_renamed_9(",\u0000\u007fIb\u0006xI\u007f\u001c|\u0019c\u001bx\fhIj\u0006~IO\u001bu\u001ax\b`\u001a,\"u\u000bi\u001b")).toString());
            }
        }
        sprhfg3.cfr_renamed_145 = arg0 * 384;
        sprhfg sprhfg10 = this;
        sprhfg sprhfg11 = this;
        sprhfg11.cfr_renamed_119 = sprhfg11.cfr_renamed_145 + 32;
        sprhfg11.cfr_renamed_88 = sprhfg11.cfr_renamed_145;
        sprhfg11.cfr_renamed_185 = sprhfg11.cfr_renamed_137 + this.cfr_renamed_102;
        sprhfg11.cfr_renamed_1 = sprhfg11.cfr_renamed_119;
        sprhfg11.cfr_renamed_82 = sprhfg11.cfr_renamed_88 + this.cfr_renamed_119 + 64;
        this.cfr_renamed_152 = sprhfg11.cfr_renamed_185;
        sprhfg10.cfr_renamed_132 = 32;
        sprhfg10.cfr_renamed_96 = this.cfr_renamed_82;
        sprhfg10.cfr_renamed_112 = sprhfg10.cfr_renamed_1;
        sprhfg10.cfr_renamed_105 = sprhfg10.cfr_renamed_152;
        sprhfg sprhfg12 = this;
        if (arg1) {
            sprhfg sprhfg13 = this;
            sprhfg12.cfr_renamed_3 = new sprbzf();
            sprhfg2 = this;
        } else {
            sprhfg12.cfr_renamed_3 = new spriwf();
            sprhfg2 = this;
        }
        sprhfg2.cfr_renamed_31 = new sprdng(this);
    }

    public int cfr_renamed_7040() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_7020() {
        return this.cfr_renamed_105;
    }

    public int cfr_renamed_6978() {
        return this.cfr_renamed_145;
    }

    public static int cfr_renamed_7010() {
        return 2;
    }

    public static int cfr_renamed_7005() {
        return 32;
    }

    public int cfr_renamed_7009() {
        return this.cfr_renamed_272;
    }
}

