/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprbe;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.spref;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnae;
import com.spire.presentation.packages.sproxz;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtjb;
import com.spire.presentation.packages.spruin;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzrc;
import java.math.BigInteger;

public class sprovc
implements spref {
    private sprlc cfr_renamed_953;
    private static final int cfr_renamed_133 = 4096;
    private static final BigInteger cfr_renamed_185;
    private static final int spr\ufe34 = 4096;
    private static final int cfr_renamed_82 = 4096;
    private int cfr_renamed_126;
    private sprrlb cfr_renamed_88;
    private byte[] cfr_renamed_31;
    private sprbe cfr_renamed_272;
    private static final BigInteger cfr_renamed_145;
    private sprtjb cfr_renamed_114;
    private static final BigInteger cfr_renamed_96;
    private int cfr_renamed_105;
    private static final BigInteger cfr_renamed_137;
    private static final long cfr_renamed_79 = 0x80000000L;
    private long cfr_renamed_107;
    private int cfr_renamed_132;
    private static final BigInteger cfr_renamed_102;
    private static final BigInteger cfr_renamed_93;
    private spreb cfr_renamed_86;
    private static final BigInteger cfr_renamed_152;
    private static final BigInteger cfr_renamed_112;
    private static final spratc[] cfr_renamed_119;
    private static final BigInteger cfr_renamed_91;
    private sprrlb cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private int cfr_renamed_4;

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

    private /* synthetic */ BigInteger cfr_renamed_3315(sprrlb arg0, BigInteger arg1) {
        return this.cfr_renamed_86.cfr_renamed_1968(arg0, arg1).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779();
    }

    static {
        cfr_renamed_102 = new BigInteger(sproxz.cfr_renamed_9("\u0000w\u0007\"R$P'S$\u0004v\u0002'\u0002\"P-TvS#S \u0000&W!\u0002%P'\u0001\"\u0006&\u0001q\u000e$\u0004qSw\u0005&W%P!W$\u0005,\u0002 R-\u000f-U'\u000f#"), 16);
        cfr_renamed_96 = new BigInteger(spruin.cfr_renamed_9(",\u0003}V,W}W~\u0000)\u0004/\u0003!\u0007 \u0000}R}\u0007,\u0004/\u0006(\u0003!\u0000)S*\u0007{\u0000+V-R.\u0007+T-\u0000{\u0000{\u0007zS,U.]+Rz\u0003-T~P"), 16);
        cfr_renamed_2 = new BigInteger(sproxz.cfr_renamed_9("U,\u0001!\u0002 P!\u0003vRpP,P%R&S%\u0003p\u0007p\u0003-\u0003sU'\u000f\"\u0004&\u0003w\u000e'T Tp\u000esP&SsUt\u0000\"U \u000f-\u0003'\u0006$\u000e$\u000f'"), 16);
        cfr_renamed_137 = new BigInteger(spruin.cfr_renamed_9("zW \u0000~P-Rz\u0004+T|\u0003{\u0007|\u0001*Ty\u0006,S}Wy\\)\u0000+\u0006+U,\u0003,Q{\u0007 R(P \u0004|\u0004*\u0006z])P)P)\u0000.T(U,S"), 16);
        cfr_renamed_91 = new BigInteger(sproxz.cfr_renamed_9("Wt\u000e\"Ut\u0004'Tp\u000ew\u0006 \u0005\"\u000epT$U\"\u0007pP&\u0004%Wq\u0001!\u0000p\u0007q\u0005w\u0000'\u000ewW\"\u000fw\u000f-\u0003,P\"\u0002$S%\u000e'\u0003!\u0004t\u0005-\u0003 \u0006'P'\u0003qTs\u0003 \u0004,\u0000v\u0005t\u0003!\u0003p\u0005-\u0001'\u0001#\u0006tT\""), 16);
        cfr_renamed_185 = new BigInteger(spruin.cfr_renamed_9("+S)R|\u0000,\u0004!S*S*\u0006.\u0003-\u0001!\u0000!]z\u0003!W!W|\u0006*\\~]~Q)\u0001z\u0001*]!\u0004)Q/\u0006}\\|\u0004+T)VzP~Uz]{U(\u0004.UzT{\u0000)\u0001/\u0000 T!\u0001/\u0004,V)\u0001/\u0006!U}\u0004(\u0000-\u0003"), 16);
        cfr_renamed_152 = new BigInteger(sproxz.cfr_renamed_9("\u000ep\u0001'\u0004qS&\u0007'\u0003wRqT%\u0003 \u000e%\u0007#\u0002wPp\u0004%T-T!\u0005'\u0004$\u0000t\u0000'\u000f'\u0000v\u0003\"\u0003%\u0004vSpRp\u0005$U!\u0001-\u0007#SqR$S-\u000f\"\u0000,\u0007'\u0002$\u0001,R%T#\u000f \u0007%\u0000!\u0004-\u000e$\u0003%\u0000 "), 16);
        cfr_renamed_1 = new BigInteger(spruin.cfr_renamed_9("(W+\u0007)S.U|\u0001/U)\u0001(]+\\~\u0001,P}\u0000{V.\u0003!\u0000}RzV*\u0000)VzV)P|\u0006(W.T(\u0004yTzS+S}V,S|\u0003.R)\u0003/\\(\u0003 Q{P}U!\u0007(P.R,\u0001z\u0007/\u0000,P{](V|\u0001"), 16);
        cfr_renamed_3 = new BigInteger(sproxz.cfr_renamed_9("U#\u000e \u000ep\u0006#T\"\u0006!\u0006!S,Uq\u000fp\u0005pUw\u0000#\u0004&\u000f T!\u0002'\u000fv\u0000!\u000e$\u0005,\u0006 \u0005sT \u0004$P-\u0004-Ws\u0000%\u0000w\u0002q\u0005qTtW$\u0002w\u0003p\u0001\"SsS\"\u0003,\u0004-Pp\u0007qU$\u0004\"W'PsW-Rp\u0005&\u0002-T&U$\u000e \u0000t\u0002'\u000fwP,\u0001p\u0001p\u0005$U'S Tq\u0000#"), 16);
        cfr_renamed_112 = new BigInteger(spruin.cfr_renamed_9("T)]+\\*\\.\u0004/]!\u0004+\u0007{U(Q-\u0006 \u0004-\u0003zQ*\u0006/\u0001)\u0007|\\!]~P,Q,\\-R!\u0007,Q.])Ry\u0003z\u0001)R*R+\u0000.S*\u0006!R}\u0000/W!\\-\u0000~Q*S,U{P-Uz\\(T+\u0003y\u0001(R.T+P+\u0006/U SyW/W{W,U ]z\u0000!Q/S!\u0003|T.S-U"), 16);
        cfr_renamed_145 = new BigInteger(sproxz.cfr_renamed_9("$T,Pt\u0005p\u0003$\u000eq\u0000-\u0005v\u0000w\u0000 \u0001#\u0005#\u000f!Wv\u000epPwWpU#PtT!\u0002s\u0004'\u0001#\u0007\"\u0007t\u0002'\u0001'\u0000 \u0006\"Rq\u0006-WqR!U&T&P!U$SwU T$\u0004'\u0004qRwW%\u0001\"P\"\u0004'\u000f!\u0005w\u0004!U&SqPt\u0006s\u000e Pp\u0004!R%U-U%\u0007 \u000f$P%Tp\u0000s\u0000&"), 16);
        cfr_renamed_93 = new BigInteger(spruin.cfr_renamed_9("T~Vz\u0001z\u0004-]-W!P|\\yT)T(\u0001)\u0001~T~\\,V(\u0000~],Q*\u0006-U)]!R.\u0003~V,V/\u0000~\\)\u0007 T|\u0006(\u0007 T+W{]|P{V!\u0006+W|U}U(QyV(\\*\u0007/\u0001+W/\u0006(\u0000/\u0004,\u0001*S|W{RzS!\u0007-]~\\(S.S-W!T)\u0000,P/R/\\|\u0000"), 16);
        cfr_renamed_119 = new spratc[3];
        sprtjb sprtjb2 = (sprtjb)sprnae.cfr_renamed_1837(sproxz.cfr_renamed_9("E\u001b'\u0003#")).cfr_renamed_1769();
        sprovc.cfr_renamed_119[0] = new spratc(128, sprtjb2.cfr_renamed_1996(cfr_renamed_102, cfr_renamed_96), sprtjb2.cfr_renamed_1996(cfr_renamed_2, cfr_renamed_137), 1);
        sprtjb2 = (sprtjb)sprnae.cfr_renamed_1837(spruin.cfr_renamed_9("55V Q")).cfr_renamed_1769();
        sprovc.cfr_renamed_119[1] = new spratc(192, sprtjb2.cfr_renamed_1996(cfr_renamed_91, cfr_renamed_185), sprtjb2.cfr_renamed_1996(cfr_renamed_152, cfr_renamed_1), 1);
        sprtjb2 = (sprtjb)sprnae.cfr_renamed_1837(sproxz.cfr_renamed_9("E\u001b \u0004$")).cfr_renamed_1769();
        sprovc.cfr_renamed_119[2] = new spratc(256, sprtjb2.cfr_renamed_1996(cfr_renamed_3, cfr_renamed_112), sprtjb2.cfr_renamed_1996(cfr_renamed_145, cfr_renamed_93), 1);
    }

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        if (sprzrc.cfr_renamed_3306(arg0, 512)) {
            throw new IllegalArgumentException(spruin.cfr_renamed_9("$|\u0001q\u0011q\nv\u0004tEq\u000bh\u0010lEk\u0011j\fv\u00028\u0011w\n8\ty\u0017\u007f\u0000"));
        }
        sprovc sprovc2 = this;
        byte[] byArray = sprovc2.cfr_renamed_272.cfr_renamed_3300();
        sprovc sprovc3 = this;
        byte[] byArray2 = sprzra.cfr_renamed_527(sprovc3.cfr_renamed_3314(sprovc2.cfr_renamed_31, sprovc3.cfr_renamed_105), byArray, arg0);
        sprovc2.cfr_renamed_31 = sprzrc.cfr_renamed_3305(sprovc2.cfr_renamed_953, byArray2, this.cfr_renamed_105);
        sprovc2.cfr_renamed_107 = 0L;
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        int n;
        byte[] byArray;
        BigInteger bigInteger;
        int n2 = arg0.length * 8;
        int n3 = arg0.length / this.cfr_renamed_132;
        if (sprzrc.cfr_renamed_3306(arg1, 512)) {
            throw new IllegalArgumentException(sproxz.cfr_renamed_9("wqR|B|Y{Wy\u0016|XeCa\u0016aYz\u0016yWgQp"));
        }
        if (this.cfr_renamed_107 + (long)n3 > 0x80000000L) {
            return -1;
        }
        if (arg2) {
            this.cfr_renamed_3299(arg1);
            arg1 = null;
        }
        if (arg1 != null) {
            arg1 = sprzrc.cfr_renamed_3305(this.cfr_renamed_953, arg1, this.cfr_renamed_105);
            sprovc sprovc2 = this;
            bigInteger = new BigInteger(1, sprovc2.cfr_renamed_1122(sprovc2.cfr_renamed_31, arg1));
            byArray = arg0;
        } else {
            bigInteger = new BigInteger(1, this.cfr_renamed_31);
            byArray = arg0;
        }
        sprzra.cfr_renamed_492(byArray, (byte)0);
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < n3) {
            int n6;
            sprovc sprovc3 = this;
            byte[] byArray2 = sprovc3.cfr_renamed_3315(sprovc3.cfr_renamed_88, bigInteger = sprovc3.cfr_renamed_3315(sprovc3.cfr_renamed_0, bigInteger)).toByteArray();
            if (byArray2.length > this.cfr_renamed_132) {
                System.arraycopy(byArray2, byArray2.length - this.cfr_renamed_132, arg0, n4, this.cfr_renamed_132);
                n6 = n4;
            } else {
                System.arraycopy(byArray2, 0, arg0, n4 + (this.cfr_renamed_132 - byArray2.length), byArray2.length);
                n6 = n4;
            }
            n4 = n6 + this.cfr_renamed_132;
            ++this.cfr_renamed_107;
            n5 = ++n;
        }
        if (n4 < arg0.length) {
            sprovc sprovc4;
            sprovc sprovc5 = this;
            bigInteger = sprovc5.cfr_renamed_3315(sprovc5.cfr_renamed_0, bigInteger);
            byte[] byArray3 = sprovc5.cfr_renamed_3315(sprovc5.cfr_renamed_88, bigInteger).toByteArray();
            int n7 = arg0.length - n4;
            if (byArray3.length > this.cfr_renamed_132) {
                System.arraycopy(byArray3, byArray3.length - this.cfr_renamed_132, arg0, n4, n7);
                sprovc4 = this;
            } else {
                System.arraycopy(byArray3, 0, arg0, n4 + (this.cfr_renamed_132 - byArray3.length), n7);
                sprovc4 = this;
            }
            ++sprovc4.cfr_renamed_107;
        }
        sprovc sprovc6 = this;
        this.cfr_renamed_31 = sprvpa.cfr_renamed_512(this.cfr_renamed_126, sprovc6.cfr_renamed_3315(sprovc6.cfr_renamed_0, bigInteger));
        return n2;
    }

    public sprovc(sprlc arg0, int arg1, sprbe arg2, byte[] arg3, byte[] arg4) {
        this(cfr_renamed_119, arg0, arg1, arg2, arg3, arg4);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_132 * 8;
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

    /*
     * WARNING - void declaration
     */
    public sprovc(spratc[] spratcArray, sprlc sprlc2, int n, sprbe sprbe2, byte[] byArray, byte[] byArray2) {
        sprovc sprovc2;
        byte[] byArray3;
        block6: {
            void arg0;
            int n2;
            void arg4;
            void arg5;
            void arg2;
            void arg3;
            void arg1;
            sprovc sprovc3 = this;
            sprovc sprovc4 = this;
            this.cfr_renamed_86 = new sprelb();
            this.cfr_renamed_953 = arg1;
            sprovc3.cfr_renamed_272 = arg3;
            sprovc3.cfr_renamed_4 = arg2;
            if (sprzrc.cfr_renamed_3306(byArray, 512)) {
                throw new IllegalArgumentException(spruin.cfr_renamed_9("H\u0000j\u0016w\u000by\tq\u001fy\u0011q\nvEk\u0011j\fv\u00028\u0011w\n8\ty\u0017\u007f\u0000"));
            }
            if (arg3.cfr_renamed_3225() < arg2 || arg3.cfr_renamed_3225() > 4096) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sproxz.cfr_renamed_9("PXaDzFlezCgUp\u0016xCfB5FgYc_qS5TpBbSpX5")).append((int)arg2).append(spruin.cfr_renamed_9("Ey\u000b|E")).append(4096).append(sproxz.cfr_renamed_9("5T|Bf")).toString());
            }
            byArray3 = sprzra.cfr_renamed_527(arg3.cfr_renamed_3300(), (byte[])arg5, (byte[])arg4);
            int n3 = n2 = 0;
            while (n3 != ((void)arg0).length) {
                if (arg2 <= arg0[n2].cfr_renamed_3316()) {
                    if (sprzrc.cfr_renamed_3307((sprlc)arg1) < arg0[n2].cfr_renamed_3316()) {
                        throw new IllegalArgumentException(spruin.cfr_renamed_9("J\u0000i\u0010}\u0016l\u0000|Ek\u0000{\u0010j\fl\u001c8\u0016l\u0017}\u000b\u007f\u0011pEq\u00168\u000bw\u00118\u0016m\u0015h\nj\u0011}\u00018\u0007aE|\f\u007f\u0000k\u0011"));
                    }
                    sprovc2 = this;
                    sprovc sprovc5 = this;
                    void v5 = arg0;
                    int n4 = n2;
                    this.cfr_renamed_105 = arg0[n4].cfr_renamed_3317();
                    this.cfr_renamed_132 = v5[n4].cfr_renamed_3318() / 8;
                    sprovc5.cfr_renamed_0 = v5[n2].cfr_renamed_1155();
                    sprovc5.cfr_renamed_88 = arg0[n2].cfr_renamed_1604();
                    break block6;
                }
                n3 = ++n2;
            }
            sprovc2 = this;
        }
        if (sprovc2.cfr_renamed_0 == null) {
            throw new IllegalArgumentException(sproxz.cfr_renamed_9("fSvCg_aO5EaDpXrB}\u0016vW{XzB5Tp\u0016rDpWaSg\u0016a^tX5\u0004 \u00005T|Bf"));
        }
        sprovc sprovc6 = this;
        this.cfr_renamed_31 = sprzrc.cfr_renamed_3305(sprovc6.cfr_renamed_953, byArray3, this.cfr_renamed_105);
        sprovc6.cfr_renamed_126 = sprovc6.cfr_renamed_31.length;
        this.cfr_renamed_107 = 0L;
    }
}

