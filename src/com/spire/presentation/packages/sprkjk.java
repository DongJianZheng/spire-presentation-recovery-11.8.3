/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdv;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprfql;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprlgk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpcr;
import com.spire.presentation.packages.sprvth;
import com.spire.presentation.packages.sprwj;
import com.spire.presentation.packages.sprymk;
import com.spire.presentation.packages.sprynm;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;

public class sprkjk
implements sprdv {
    private static final int cfr_renamed_953 = 4096;
    private static final BigInteger cfr_renamed_133;
    private static final BigInteger cfr_renamed_185;
    private byte[] spr\ufe34;
    private static final BigInteger cfr_renamed_82;
    private static final int cfr_renamed_126 = 4096;
    private sprvth cfr_renamed_88;
    private static final sprlgk[] cfr_renamed_31;
    private int cfr_renamed_272;
    private static final BigInteger cfr_renamed_145;
    private static final int cfr_renamed_114 = 4096;
    private static final BigInteger cfr_renamed_96;
    private sprwj cfr_renamed_105;
    private long cfr_renamed_137;
    private static final BigInteger cfr_renamed_79;
    private static final BigInteger cfr_renamed_107;
    private spreuh cfr_renamed_132;
    private static final BigInteger cfr_renamed_102;
    private static final BigInteger cfr_renamed_93;
    private int cfr_renamed_86;
    private spreuh cfr_renamed_152;
    private int cfr_renamed_112;
    private static final BigInteger cfr_renamed_119;
    private int cfr_renamed_91;
    private sprfe cfr_renamed_0;
    private sprgf cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private static final long cfr_renamed_3 = 0x80000000L;
    private static final BigInteger cfr_renamed_4;

    public sprkjk(sprgf arg0, int arg1, sprwj arg2, byte[] arg3, byte[] arg4) {
        this(cfr_renamed_31, arg0, arg1, arg2, arg3, arg4);
    }

    private /* synthetic */ byte[] cfr_renamed_3300() {
        byte[] byArray = this.cfr_renamed_105.cfr_renamed_3300();
        if (byArray.length < (this.cfr_renamed_112 + 7) / 8) {
            throw new IllegalStateException(sprfql.cfr_renamed_9("pxJc_pPuPsWb\u0019sWbKyIo\u0019fKyO\u007f]s]6[o\u0019sWbKyIo\u0019eVcKu\\"));
        }
        return byArray;
    }

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        if (sprymk.cfr_renamed_3306(arg0, 512)) {
            throw new IllegalArgumentException(sprpcr.cfr_renamed_9("p3U>E>^9P;\u0011>_'D#\u0011$E%X9VwE8^w]6C0T"));
        }
        sprkjk sprkjk2 = this;
        byte[] byArray = sprkjk2.cfr_renamed_3300();
        sprkjk sprkjk3 = this;
        byte[] byArray2 = sproze.cfr_renamed_527(sprkjk3.cfr_renamed_3314(sprkjk2.spr\ufe34, sprkjk3.cfr_renamed_272), byArray, arg0);
        sprkjk2.spr\ufe34 = sprymk.cfr_renamed_9963(sprkjk2.cfr_renamed_1, byArray2, this.cfr_renamed_272);
        sprkjk2.cfr_renamed_137 = 0L;
    }

    /*
     * WARNING - void declaration
     */
    public sprkjk(sprlgk[] sprlgkArray, sprgf sprgf2, int n, sprwj sprwj2, byte[] byArray, byte[] byArray2) {
        sprkjk sprkjk2;
        byte[] byArray3;
        block6: {
            void arg0;
            int n2;
            void arg4;
            void arg5;
            void arg2;
            void arg3;
            void arg1;
            sprkjk sprkjk3 = this;
            sprkjk sprkjk4 = this;
            this.cfr_renamed_0 = new sprzph();
            this.cfr_renamed_1 = arg1;
            sprkjk3.cfr_renamed_105 = arg3;
            sprkjk3.cfr_renamed_112 = arg2;
            if (sprymk.cfr_renamed_3306(byArray, 512)) {
                throw new IllegalArgumentException(sprfql.cfr_renamed_9("F\\dJyWwU\u007fCwM\u007fVx\u0019eMdPx^6MyV6UwKq\\"));
            }
            if (arg3.cfr_renamed_3225() < arg2 || arg3.cfr_renamed_3225() > 4096) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprpcr.cfr_renamed_9("t9E%^'H\u0004^\"C4Tw\\\"B#\u0011'C8G>U2\u00115T#F2T9\u0011")).append((int)arg2).append(sprfql.cfr_renamed_9("\u0019wWr\u0019")).append(4096).append(sprpcr.cfr_renamed_9("\u00115X#B")).toString());
            }
            byArray3 = sproze.cfr_renamed_527(this.cfr_renamed_3300(), (byte[])arg5, (byte[])arg4);
            int n3 = n2 = 0;
            while (n3 != ((void)arg0).length) {
                if (arg2 <= arg0[n2].cfr_renamed_3316()) {
                    if (sprymk.cfr_renamed_9962((sprgf)arg1) < arg0[n2].cfr_renamed_3316()) {
                        throw new IllegalArgumentException(sprfql.cfr_renamed_9("D\\gLsJb\\r\u0019e\\uLdPb@6JbKsWqM~\u0019\u007fJ6WyM6JcIfVdMs]6[o\u0019rPq\\eM"));
                    }
                    sprkjk2 = this;
                    sprkjk sprkjk5 = this;
                    void v5 = arg0;
                    int n4 = n2;
                    this.cfr_renamed_272 = arg0[n4].cfr_renamed_3317();
                    this.cfr_renamed_91 = v5[n4].cfr_renamed_3318() / 8;
                    sprkjk5.cfr_renamed_132 = v5[n2].cfr_renamed_1155();
                    sprkjk5.cfr_renamed_152 = arg0[n2].cfr_renamed_1604();
                    break block6;
                }
                n3 = ++n2;
            }
            sprkjk2 = this;
        }
        if (sprkjk2.cfr_renamed_132 == null) {
            throw new IllegalArgumentException(sprpcr.cfr_renamed_9("B2R\"C>E.\u0011$E%T9V#YwR6_9^#\u00115TwV%T6E2CwE?P9\u0011e\u0004a\u00115X#B"));
        }
        sprkjk sprkjk6 = this;
        this.spr\ufe34 = sprymk.cfr_renamed_9963(sprkjk6.cfr_renamed_1, byArray3, this.cfr_renamed_272);
        sprkjk6.cfr_renamed_86 = sprkjk6.spr\ufe34.length;
        this.cfr_renamed_137 = 0L;
    }

    private /* synthetic */ byte[] cfr_renamed_3314(byte[] arg0, int arg1) {
        int n;
        if (arg1 % 8 == 0) {
            return arg0;
        }
        int n2 = 8 - arg1 % 8;
        int n3 = 0;
        int n4 = n = arg0.length - 1;
        while (n4 >= 0) {
            int n5 = arg0[n] & 0xFF;
            arg0[n--] = (byte)(n5 << n2 | n3 >> 8 - n2);
            n3 = n5;
            n4 = n;
        }
        return arg0;
    }

    private /* synthetic */ byte[] cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n;
        if (arg1 == null) {
            return arg0;
        }
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = n;
            byte by = (byte)(arg0[n] ^ arg1[n3]);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        int n;
        byte[] byArray;
        BigInteger bigInteger;
        int n2 = arg0.length * 8;
        int n3 = arg0.length / this.cfr_renamed_91;
        if (sprymk.cfr_renamed_3306(arg1, 512)) {
            throw new IllegalArgumentException(sprfql.cfr_renamed_9("W]rPbPyWwU6PxIcM6MyV6UwKq\\"));
        }
        if (this.cfr_renamed_137 + (long)n3 > 0x80000000L) {
            return -1;
        }
        if (arg2) {
            this.cfr_renamed_3299(arg1);
            arg1 = null;
        }
        if (arg1 != null) {
            arg1 = sprymk.cfr_renamed_9963(this.cfr_renamed_1, arg1, this.cfr_renamed_272);
            sprkjk sprkjk2 = this;
            bigInteger = new BigInteger(1, sprkjk2.cfr_renamed_1122(sprkjk2.spr\ufe34, arg1));
            byArray = arg0;
        } else {
            bigInteger = new BigInteger(1, this.spr\ufe34);
            byArray = arg0;
        }
        sproze.cfr_renamed_492(byArray, (byte)0);
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < n3) {
            int n6;
            sprkjk sprkjk3 = this;
            byte[] byArray2 = sprkjk3.cfr_renamed_9965(sprkjk3.cfr_renamed_152, bigInteger = sprkjk3.cfr_renamed_9965(sprkjk3.cfr_renamed_132, bigInteger)).toByteArray();
            if (byArray2.length > this.cfr_renamed_91) {
                System.arraycopy(byArray2, byArray2.length - this.cfr_renamed_91, arg0, n4, this.cfr_renamed_91);
                n6 = n4;
            } else {
                System.arraycopy(byArray2, 0, arg0, n4 + (this.cfr_renamed_91 - byArray2.length), byArray2.length);
                n6 = n4;
            }
            n4 = n6 + this.cfr_renamed_91;
            ++this.cfr_renamed_137;
            n5 = ++n;
        }
        if (n4 < arg0.length) {
            sprkjk sprkjk4;
            sprkjk sprkjk5 = this;
            bigInteger = sprkjk5.cfr_renamed_9965(sprkjk5.cfr_renamed_132, bigInteger);
            byte[] byArray3 = sprkjk5.cfr_renamed_9965(sprkjk5.cfr_renamed_152, bigInteger).toByteArray();
            int n7 = arg0.length - n4;
            if (byArray3.length > this.cfr_renamed_91) {
                System.arraycopy(byArray3, byArray3.length - this.cfr_renamed_91, arg0, n4, n7);
                sprkjk4 = this;
            } else {
                System.arraycopy(byArray3, 0, arg0, n4 + (this.cfr_renamed_91 - byArray3.length), n7);
                sprkjk4 = this;
            }
            ++sprkjk4.cfr_renamed_137;
        }
        sprkjk sprkjk6 = this;
        this.spr\ufe34 = sprhdf.cfr_renamed_512(this.cfr_renamed_86, sprkjk6.cfr_renamed_9965(sprkjk6.cfr_renamed_132, bigInteger));
        return n2;
    }

    static {
        cfr_renamed_185 = new BigInteger(sprpcr.cfr_renamed_9("aSf\u00063\u00001\u00032\u0000eRc\u0003c\u00061\t5R2\u00072\u0004a\u00026\u0005c\u00011\u0003`\u0006g\u0002`Uo\u0000eU2Sd\u00026\u00011\u00056\u0000d\bc\u00043\tn\t4\u0003n\u0007"), 16);
        cfr_renamed_4 = new BigInteger(sprfql.cfr_renamed_9("\"_s\n\"\u000bs\u000bp\\'X!_/[.\\s\u000es[\"X!Z&_/\\'\u000f$[u\\%\n#\u000e [%\b#\\u\\u[t\u000f\"\t \u0001%\u000et_#\bp\f"), 16);
        cfr_renamed_2 = new BigInteger(sprpcr.cfr_renamed_9("4\b`\u0005c\u00041\u0005bR3T1\b1\u00013\u00022\u0001bTfTb\tbW4\u0003n\u0006e\u0002bSo\u00035\u00045ToW1\u00022W4Pa\u00064\u0004n\tb\u0003g\u0000o\u0000n\u0003"), 16);
        cfr_renamed_93 = new BigInteger(sprfql.cfr_renamed_9("t\u000b.\\p\f#\u000etX%\br_u[r]$\bwZ\"\u000fs\u000bw\u0000'\\%Z%\t\"_\"\ru[.\u000e&\f.XrX$Zt\u0001'\f'\f'\\ \b&\t\"\u000f"), 16);
        cfr_renamed_79 = new BigInteger(sprpcr.cfr_renamed_9("6Po\u00064Pe\u00035ToSg\u0004d\u0006oT5\u00004\u0006fT1\u0002e\u00016U`\u0005aTfUdSa\u0003oS6\u0006nSn\tb\b1\u0006c\u00002\u0001o\u0003b\u0005ePd\tb\u0004g\u00031\u0003bU5Wb\u0004e\baRdPb\u0005bTd\t`\u0003`\u0007gP5\u0006"), 16);
        cfr_renamed_107 = new BigInteger(sprfql.cfr_renamed_9("%\u000f'\u000er\\\"X/\u000f$\u000f$Z _#]/\\/\u0001t_/\u000b/\u000brZ$\u0000p\u0001p\r']t]$\u0001/X'\r!Zs\u0000rX%\b'\nt\fp\tt\u0001u\t&X \tt\bu\\']!\\.\b/]!X\"\n']!Z/\tsX&\\#_"), 16);
        cfr_renamed_145 = new BigInteger(sprpcr.cfr_renamed_9("oT`\u0003eU2\u0002f\u0003bS3U5\u0001b\u0004o\u0001f\u0007cS1Te\u00015\t5\u0005d\u0003e\u0000aPa\u0003n\u0003aRb\u0006b\u0001eR2T3Td\u00004\u0005`\tf\u00072U3\u00002\tn\u0006a\bf\u0003c\u0000`\b3\u00015\u0007n\u0004f\u0001a\u0005e\to\u0000b\u0001a\u0004"), 16);
        cfr_renamed_102 = new BigInteger(sprfql.cfr_renamed_9("&\u000b%['\u000f \tr]!\t']&\u0001%\u0000p]\"\fs\\u\n _/\\s\u000et\n$\\'\nt\n'\frZ&\u000b \b&Xw\bt\u000f%\u000fs\n\"\u000fr_ \u000e'_!\u0000&_.\ru\fs\t/[&\f \u000e\"]t[!\\\"\fu\u0001&\nr]"), 16);
        cfr_renamed_82 = new BigInteger(sprpcr.cfr_renamed_9("4\u0007o\u0004oTg\u00075\u0006g\u0005g\u00052\b4UnTdT4Sa\u0007e\u0002n\u00045\u0005c\u0003nRa\u0005o\u0000d\bg\u0004dW5\u0004e\u00001\te\t6Wa\u0001aScUdU5P6\u0000cSbT`\u00062W2\u0006b\be\t1TfU4\u0000e\u00066\u00031W6\t3Td\u0002c\t5\u00024\u0000o\u0004aPc\u0003nS1\b`T`Td\u00004\u00032\u00045Ua\u0007"), 16);
        cfr_renamed_119 = new BigInteger(sprfql.cfr_renamed_9("\b'\u0001%\u0000$\u0000 X!\u0001/X%[u\t&\r#Z.X#_t\r$Z!]'[r\u0000/\u0001p\f\"\r\"\u0000#\u000e/[\"\r \u0001'\u000ew_t]'\u000e$\u000e%\\ \u000f$Z/\u000es\\!\u000b/\u0000#\\p\r$\u000f\"\tu\f#\tt\u0000&\b%_w]&\u000e \b%\f%Z!\t.\u000fw\u000b!\u000bu\u000b\"\t.\u0001t\\/\r!\u000f/_r\b \u000f#\t"), 16);
        cfr_renamed_96 = new BigInteger(sprpcr.cfr_renamed_9("\u00005\b1PdTb\u0000oUa\tdRaSa\u0004`\u0007d\u0007n\u00056RoT1S6T4\u00071P5\u0005cWe\u0003`\u0007f\u0006fPc\u0003`\u0003a\u0004g\u00063Ug\t6U3\u00054\u00025\u00021\u00054\u00002S4\u00045\u0000e\u0003eU3S6\u0001`\u00061\u0006e\u0003n\u0005dSe\u00054\u00022U1PgWo\u00041Te\u00053\u00014\t4\u0001f\u0004n\u00001\u00015TaWa\u0002"), 16);
        cfr_renamed_133 = new BigInteger(sprfql.cfr_renamed_9("\bp\nt]tX#\u0001#\u000b/\fr\u0000w\b'\b&]']p\bp\u0000\"\n&\\p\u0001\"\r$Z#\t'\u0001/\u000e _p\n\"\n!\\p\u0000'[.\brZ&[.\b%\u000bu\u0001r\fu\n/Z%\u000br\ts\t&\rw\n&\u0000$[!]%\u000b!Z&\\!X\"]$\u000fr\u000bu\u000et\u000f/[#\u0001p\u0000&\u000f \u000f#\u000b/\b'\\\"\f!\u000e!\u0000r\\"), 16);
        cfr_renamed_31 = new sprlgk[3];
        sprvth sprvth2 = (sprvth)sprynm.cfr_renamed_8048(sprpcr.cfr_renamed_9("az\u0003b\u0007")).cfr_renamed_1769();
        sprkjk.cfr_renamed_31[0] = new sprlgk(128, sprvth2.cfr_renamed_1996(cfr_renamed_185, cfr_renamed_4), sprvth2.cfr_renamed_1996(cfr_renamed_2, cfr_renamed_93), 1);
        sprvth2 = (sprvth)sprynm.cfr_renamed_8048(sprfql.cfr_renamed_9("i;\n.\r")).cfr_renamed_1769();
        sprkjk.cfr_renamed_31[1] = new sprlgk(192, sprvth2.cfr_renamed_1996(cfr_renamed_79, cfr_renamed_107), sprvth2.cfr_renamed_1996(cfr_renamed_145, cfr_renamed_102), 1);
        sprvth2 = (sprvth)sprynm.cfr_renamed_8048(sprpcr.cfr_renamed_9("az\u0004e\u0000")).cfr_renamed_1769();
        sprkjk.cfr_renamed_31[2] = new sprlgk(256, sprvth2.cfr_renamed_1996(cfr_renamed_82, cfr_renamed_119), sprvth2.cfr_renamed_1996(cfr_renamed_96, cfr_renamed_133), 1);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_91 * 8;
    }

    private /* synthetic */ BigInteger cfr_renamed_9965(spreuh arg0, BigInteger arg1) {
        return this.cfr_renamed_0.cfr_renamed_8926(arg0, arg1).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779();
    }
}

