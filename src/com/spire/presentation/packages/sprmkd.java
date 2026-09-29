/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbed;
import com.spire.presentation.packages.sprcid;
import com.spire.presentation.packages.sprdtaa;
import com.spire.presentation.packages.sprefd;
import com.spire.presentation.packages.sprgjd;
import com.spire.presentation.packages.sprkld;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.spryld;
import com.spire.presentation.packages.sprywz;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprmkd {
    private char[] cfr_renamed_126;
    private final BigInteger cfr_renamed_88;
    private final sprlc cfr_renamed_31;
    private BigInteger cfr_renamed_272;
    private BigInteger cfr_renamed_145;
    public static final int cfr_renamed_114 = 10;
    private final BigInteger cfr_renamed_96;
    public static final int cfr_renamed_105 = 0;
    private final BigInteger cfr_renamed_137;
    public static final int cfr_renamed_79 = 30;
    private int cfr_renamed_107;
    private final SecureRandom cfr_renamed_132;
    private String cfr_renamed_102;
    private final String cfr_renamed_93;
    private BigInteger cfr_renamed_86;
    public static final int cfr_renamed_152 = 50;
    public static final int cfr_renamed_112 = 70;
    public static final int cfr_renamed_119 = 60;
    public static final int cfr_renamed_91 = 40;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    public static final int cfr_renamed_3 = 20;
    private BigInteger cfr_renamed_4;

    public sprmkd(String arg0, char[] arg1) {
        this(arg0, arg1, sprcid.cfr_renamed_3);
    }

    public BigInteger cfr_renamed_3938() {
        if (this.cfr_renamed_107 >= 50) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprywz.cfr_renamed_9("\u000fZ=\u001f%S6Z%[=\u001f'^(\\1S%K![dY+Md")).append(this.cfr_renamed_93).toString());
        }
        if (this.cfr_renamed_107 < 40) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9("t\u001eS\u001fBC\u0006\u0001G\bJ\u001eG\u0015\u0006\u001cS\u0002RQD\u0014\u0006\u0007G\u001dO\u0015G\u0005C\u0015\u0006\u0001T\u0018I\u0003\u0006\u0005IQE\u0003C\u0010R\u0018H\u0016\u0006\u001aC\b\u0006\u0017I\u0003\u0006")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        BigInteger bigInteger = spryld.cfr_renamed_3906(sprmkd2.cfr_renamed_126);
        sprzra.cfr_renamed_529(sprmkd2.cfr_renamed_126, '\u0000');
        sprmkd2.cfr_renamed_126 = null;
        sprmkd sprmkd3 = this;
        BigInteger bigInteger2 = spryld.cfr_renamed_3922(sprmkd2.cfr_renamed_137, sprmkd3.cfr_renamed_96, sprmkd3.cfr_renamed_145, this.cfr_renamed_86, bigInteger, this.cfr_renamed_4);
        sprmkd2.cfr_renamed_0 = null;
        sprmkd2.cfr_renamed_86 = null;
        sprmkd2.cfr_renamed_4 = null;
        sprmkd2.cfr_renamed_107 = 50;
        return bigInteger2;
    }

    public void cfr_renamed_3939(sprefd arg0, BigInteger arg1) throws sprvmd {
        if (this.cfr_renamed_107 >= 70) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprywz.cfr_renamed_9("\u0012^(V ^0V+Qd^(M!^ Fd^0K!R4K![dY+MdM+J*[w\u001f4^=S+^ \u001f\"P6")).append(this.cfr_renamed_93).toString());
        }
        if (this.cfr_renamed_107 < 50) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9(":C\bO\u001fAQK\u0010R\u0014T\u0018G\u001d\u0006\u001cS\u0002RQD\u0014\u0006\u0012G\u001dE\u0004J\u0010R\u0014BQP\u0010J\u0018B\u0010R\u0014BQV\u0003O\u001eTQR\u001e\u0006\u0007G\u001dO\u0015G\u0005O\u001fAQt\u001eS\u001fBB\u0006\u0001G\bJ\u001eG\u0015\u0006\u0017I\u0003\u0006")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        sprmkd sprmkd3 = this;
        sprmkd sprmkd4 = this;
        spryld.cfr_renamed_3917(sprmkd4.cfr_renamed_93, arg0.cfr_renamed_3932());
        spryld.cfr_renamed_3927(sprmkd4.cfr_renamed_102, arg0.cfr_renamed_3932());
        sprmkd sprmkd5 = this;
        sprmkd sprmkd6 = this;
        spryld.cfr_renamed_3915(sprmkd4.cfr_renamed_93, sprmkd5.cfr_renamed_102, sprmkd5.cfr_renamed_2, sprmkd6.cfr_renamed_272, sprmkd6.cfr_renamed_1, this.cfr_renamed_145, arg1, this.cfr_renamed_31, arg0.cfr_renamed_3931());
        sprmkd3.cfr_renamed_2 = null;
        sprmkd3.cfr_renamed_272 = null;
        sprmkd2.cfr_renamed_1 = null;
        sprmkd2.cfr_renamed_145 = null;
        this.cfr_renamed_107 = 70;
    }

    public int cfr_renamed_3940() {
        return this.cfr_renamed_107;
    }

    public sprmkd(String arg0, char[] arg1, sprgjd arg2) {
        this(arg0, arg1, arg2, new sprtfd(), new SecureRandom());
    }

    public void cfr_renamed_3941(sprkld arg0) throws sprvmd {
        if (this.cfr_renamed_107 >= 20) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprywz.cfr_renamed_9("\u0012^(V ^0V+Qd^(M!^ Fd^0K!R4K![dY+MdM+J*[u\u001f4^=S+^ \u001f\"P6")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        sprkld sprkld2 = arg0;
        sprkld sprkld3 = arg0;
        this.cfr_renamed_102 = arg0.cfr_renamed_3932();
        this.cfr_renamed_1 = sprkld3.cfr_renamed_3935();
        this.cfr_renamed_145 = sprkld3.cfr_renamed_3934();
        BigInteger[] bigIntegerArray = sprkld2.cfr_renamed_3936();
        BigInteger[] bigIntegerArray2 = sprkld2.cfr_renamed_3937();
        spryld.cfr_renamed_3917(this.cfr_renamed_93, arg0.cfr_renamed_3932());
        spryld.cfr_renamed_3929(sprmkd2.cfr_renamed_145);
        sprmkd sprmkd3 = this;
        spryld.cfr_renamed_3926(sprmkd2.cfr_renamed_137, sprmkd3.cfr_renamed_96, sprmkd3.cfr_renamed_88, this.cfr_renamed_1, bigIntegerArray, arg0.cfr_renamed_3932(), this.cfr_renamed_31);
        sprmkd sprmkd4 = this;
        spryld.cfr_renamed_3926(sprmkd2.cfr_renamed_137, sprmkd4.cfr_renamed_96, sprmkd4.cfr_renamed_88, this.cfr_renamed_145, bigIntegerArray2, arg0.cfr_renamed_3932(), this.cfr_renamed_31);
        sprmkd2.cfr_renamed_107 = 20;
    }

    public void cfr_renamed_3942(sprbed arg0) throws sprvmd {
        if (this.cfr_renamed_107 >= 40) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9("p\u0010J\u0018B\u0010R\u0018I\u001f\u0006\u0010J\u0003C\u0010B\b\u0006\u0010R\u0005C\u001cV\u0005C\u0015\u0006\u0017I\u0003\u0006\u0003I\u0004H\u0015\u0014QV\u0010_\u001dI\u0010BQ@\u001eT")).append(this.cfr_renamed_93).toString());
        }
        if (this.cfr_renamed_107 < 20) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprywz.cfr_renamed_9("m+J*[u\u001f4^=S+^ \u001f)J7Kd]!\u001f2^(V ^0Z \u001f4M-P6\u001f0PdI%S-[%K-Q#\u001f\u0016P1Q \rdO%F(P%[dY+Md")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        sprmkd sprmkd3 = this;
        sprmkd sprmkd4 = this;
        BigInteger bigInteger = spryld.cfr_renamed_3910(sprmkd2.cfr_renamed_137, sprmkd3.cfr_renamed_1, sprmkd4.cfr_renamed_2, sprmkd4.cfr_renamed_272);
        sprmkd2.cfr_renamed_4 = arg0.cfr_renamed_1778();
        BigInteger[] bigIntegerArray = arg0.cfr_renamed_3933();
        spryld.cfr_renamed_3917(sprmkd3.cfr_renamed_93, arg0.cfr_renamed_3932());
        spryld.cfr_renamed_3927(sprmkd2.cfr_renamed_102, arg0.cfr_renamed_3932());
        spryld.cfr_renamed_3925(bigInteger);
        spryld.cfr_renamed_3926(sprmkd2.cfr_renamed_137, this.cfr_renamed_96, bigInteger, this.cfr_renamed_4, bigIntegerArray, arg0.cfr_renamed_3932(), this.cfr_renamed_31);
        sprmkd2.cfr_renamed_107 = 40;
    }

    public sprbed cfr_renamed_3943() {
        if (this.cfr_renamed_107 >= 30) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9("t\u001eS\u001fBC\u0006\u0001G\bJ\u001eG\u0015\u0006\u0010J\u0003C\u0010B\b\u0006\u0012T\u0014G\u0005C\u0015\u0006\u0017I\u0003\u0006")).append(this.cfr_renamed_93).toString());
        }
        if (this.cfr_renamed_107 < 20) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprywz.cfr_renamed_9("m+J*[u\u001f4^=S+^ \u001f)J7Kd]!\u001f2^(V ^0Z \u001f4M-P6\u001f0Pd\\6Z%K-Q#\u001f\u0016P1Q \rdO%F(P%[dY+Md")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        sprmkd sprmkd3 = this;
        sprmkd sprmkd4 = this;
        BigInteger bigInteger = spryld.cfr_renamed_3910(sprmkd2.cfr_renamed_137, sprmkd3.cfr_renamed_2, sprmkd4.cfr_renamed_1, sprmkd4.cfr_renamed_145);
        BigInteger bigInteger2 = spryld.cfr_renamed_3906(sprmkd2.cfr_renamed_126);
        BigInteger bigInteger3 = spryld.cfr_renamed_3919(sprmkd3.cfr_renamed_96, this.cfr_renamed_86, bigInteger2);
        BigInteger bigInteger4 = spryld.cfr_renamed_3907(sprmkd2.cfr_renamed_137, this.cfr_renamed_96, bigInteger, bigInteger3);
        sprmkd sprmkd5 = this;
        BigInteger[] bigIntegerArray = spryld.cfr_renamed_3920(sprmkd2.cfr_renamed_137, this.cfr_renamed_96, bigInteger, bigInteger4, bigInteger3, sprmkd5.cfr_renamed_93, sprmkd5.cfr_renamed_31, this.cfr_renamed_132);
        sprmkd2.cfr_renamed_107 = 30;
        return new sprbed(this.cfr_renamed_93, bigInteger4, bigIntegerArray);
    }

    public sprefd cfr_renamed_3944(BigInteger arg0) {
        if (this.cfr_renamed_107 >= 60) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9("t\u001eS\u001fBB\u0006\u0001G\bJ\u001eG\u0015\u0006\u0010J\u0003C\u0010B\b\u0006\u0012T\u0014G\u0005C\u0015\u0006\u0017I\u0003\u0006")).append(this.cfr_renamed_93).toString());
        }
        if (this.cfr_renamed_107 < 50) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprywz.cfr_renamed_9("t!F-Q#\u001f)^0Z6V%SdR1L0\u001f&Zd\\%S'J(^0Z \u001f4M-P6\u001f0Pd\\6Z%K-Q#\u001f\u0016P1Q \fdO%F(P%[dY+Md")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        sprmkd sprmkd3 = this;
        sprmkd sprmkd4 = this;
        BigInteger bigInteger = spryld.cfr_renamed_3916(sprmkd2.cfr_renamed_93, sprmkd2.cfr_renamed_102, sprmkd3.cfr_renamed_2, sprmkd3.cfr_renamed_272, sprmkd4.cfr_renamed_1, sprmkd4.cfr_renamed_145, arg0, this.cfr_renamed_31);
        sprmkd2.cfr_renamed_107 = 60;
        return new sprefd(this.cfr_renamed_93, bigInteger);
    }

    public sprkld cfr_renamed_3945() {
        if (this.cfr_renamed_107 >= 10) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9("t\u001eS\u001fB@\u0006\u0001G\bJ\u001eG\u0015\u0006\u0010J\u0003C\u0010B\b\u0006\u0012T\u0014G\u0005C\u0015\u0006\u0017I\u0003\u0006")).append(this.cfr_renamed_93).toString());
        }
        sprmkd sprmkd2 = this;
        sprmkd sprmkd3 = this;
        sprmkd2.cfr_renamed_0 = spryld.cfr_renamed_3909(sprmkd2.cfr_renamed_96, sprmkd3.cfr_renamed_132);
        sprmkd2.cfr_renamed_86 = spryld.cfr_renamed_3928(sprmkd3.cfr_renamed_96, this.cfr_renamed_132);
        sprmkd sprmkd4 = this;
        sprmkd2.cfr_renamed_2 = spryld.cfr_renamed_3908(sprmkd2.cfr_renamed_137, sprmkd4.cfr_renamed_88, sprmkd4.cfr_renamed_0);
        sprmkd sprmkd5 = this;
        sprmkd2.cfr_renamed_272 = spryld.cfr_renamed_3908(sprmkd2.cfr_renamed_137, sprmkd5.cfr_renamed_88, sprmkd5.cfr_renamed_86);
        sprmkd sprmkd6 = this;
        sprmkd sprmkd7 = this;
        sprmkd sprmkd8 = this;
        BigInteger[] bigIntegerArray = spryld.cfr_renamed_3920(sprmkd2.cfr_renamed_137, sprmkd6.cfr_renamed_96, sprmkd6.cfr_renamed_88, sprmkd7.cfr_renamed_2, sprmkd7.cfr_renamed_0, sprmkd8.cfr_renamed_93, sprmkd8.cfr_renamed_31, this.cfr_renamed_132);
        sprmkd sprmkd9 = this;
        sprmkd sprmkd10 = this;
        sprmkd sprmkd11 = this;
        BigInteger[] bigIntegerArray2 = spryld.cfr_renamed_3920(sprmkd2.cfr_renamed_137, sprmkd9.cfr_renamed_96, sprmkd9.cfr_renamed_88, sprmkd10.cfr_renamed_272, sprmkd10.cfr_renamed_86, sprmkd11.cfr_renamed_93, sprmkd11.cfr_renamed_31, this.cfr_renamed_132);
        sprmkd2.cfr_renamed_107 = 10;
        sprmkd sprmkd12 = this;
        return new sprkld(sprmkd12.cfr_renamed_93, sprmkd12.cfr_renamed_2, this.cfr_renamed_272, bigIntegerArray, bigIntegerArray2);
    }

    /*
     * WARNING - void declaration
     */
    public sprmkd(String string, char[] cArray, sprgjd sprgjd2, sprlc sprlc2, SecureRandom secureRandom) {
        void arg4;
        void arg0;
        void arg3;
        void arg2;
        void arg1;
        spryld.cfr_renamed_3930(string, sprywz.cfr_renamed_9("4^6K-\\-O%Q0v "));
        spryld.cfr_renamed_3930(arg1, "password");
        spryld.cfr_renamed_3930(arg2, "p");
        spryld.cfr_renamed_3930(arg3, "digest");
        spryld.cfr_renamed_3930(secureRandom, "random");
        if (cArray.length == 0) {
            throw new IllegalArgumentException(sprdtaa.cfr_renamed_9("v\u0010U\u0002Q\u001eT\u0015\u0006\u001cS\u0002RQH\u001eRQD\u0014\u0006\u0014K\u0001R\b\b"));
        }
        void v0 = arg1;
        this.cfr_renamed_93 = arg0;
        this.cfr_renamed_126 = sprzra.cfr_renamed_547((char[])v0, ((void)v0).length);
        sprmkd sprmkd2 = this;
        sprmkd sprmkd3 = this;
        void v3 = arg2;
        this.cfr_renamed_137 = arg2.cfr_renamed_1155();
        this.cfr_renamed_96 = v3.cfr_renamed_1604();
        sprmkd3.cfr_renamed_88 = v3.cfr_renamed_1145();
        sprmkd3.cfr_renamed_31 = arg3;
        sprmkd2.cfr_renamed_132 = arg4;
        sprmkd2.cfr_renamed_107 = 0;
    }
}

