/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsdn;
import com.spire.presentation.packages.sprwbf;
import com.spire.presentation.packages.sprwjl;
import java.io.ByteArrayOutputStream;

public class sprjml
implements sprgf {
    private long cfr_renamed_93;
    private long cfr_renamed_86;
    private long cfr_renamed_152;
    private long cfr_renamed_112;
    private long cfr_renamed_119;
    private long cfr_renamed_91;
    private long cfr_renamed_0;
    private ByteArrayOutputStream cfr_renamed_1;
    private long cfr_renamed_2;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprwbf.cfr_renamed_9("(Y1B5\u0017#B'Q$EaC.XaD)X3C"));
        }
        this.cfr_renamed_1.write(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1.reset();
    }

    private /* synthetic */ void cfr_renamed_10436(long arg0) {
        sprjml sprjml2 = this;
        this.cfr_renamed_2 = sprjml2.cfr_renamed_112 ^ this.cfr_renamed_119 ^ this.cfr_renamed_91 ^ this.cfr_renamed_0 ^ arg0 ^ this.cfr_renamed_119 & (this.cfr_renamed_112 ^ this.cfr_renamed_91 ^ this.cfr_renamed_3 ^ arg0);
        sprjml2.cfr_renamed_86 = sprjml2.cfr_renamed_112 ^ this.cfr_renamed_91 ^ this.cfr_renamed_0 ^ this.cfr_renamed_3 ^ arg0 ^ (this.cfr_renamed_119 ^ this.cfr_renamed_91 ^ arg0) & (this.cfr_renamed_119 ^ this.cfr_renamed_0);
        sprjml2.cfr_renamed_4 = sprjml2.cfr_renamed_119 ^ this.cfr_renamed_91 ^ this.cfr_renamed_3 ^ arg0 ^ this.cfr_renamed_0 & this.cfr_renamed_3;
        sprjml2.cfr_renamed_152 = sprjml2.cfr_renamed_112 ^ this.cfr_renamed_119 ^ this.cfr_renamed_91 ^ arg0 ^ (this.cfr_renamed_112 ^ 0xFFFFFFFFFFFFFFFFL) & (this.cfr_renamed_0 ^ this.cfr_renamed_3);
        sprjml2.cfr_renamed_93 = sprjml2.cfr_renamed_119 ^ this.cfr_renamed_0 ^ this.cfr_renamed_3 ^ (this.cfr_renamed_112 ^ this.cfr_renamed_3) & this.cfr_renamed_119;
        sprjml sprjml3 = this;
        sprjml sprjml4 = this;
        sprjml2.cfr_renamed_112 = sprjml2.cfr_renamed_2 ^ sprjml3.cfr_renamed_10508(sprjml3.cfr_renamed_2, 19L) ^ sprjml4.cfr_renamed_10508(sprjml4.cfr_renamed_2, 28L);
        sprjml sprjml5 = this;
        sprjml sprjml6 = this;
        sprjml2.cfr_renamed_119 = sprjml2.cfr_renamed_86 ^ sprjml5.cfr_renamed_10508(sprjml5.cfr_renamed_86, 39L) ^ sprjml6.cfr_renamed_10508(sprjml6.cfr_renamed_86, 61L);
        sprjml sprjml7 = this;
        sprjml sprjml8 = this;
        sprjml2.cfr_renamed_91 = sprjml2.cfr_renamed_4 ^ sprjml7.cfr_renamed_10508(sprjml7.cfr_renamed_4, 1L) ^ sprjml8.cfr_renamed_10508(sprjml8.cfr_renamed_4, 6L) ^ 0xFFFFFFFFFFFFFFFFL;
        sprjml sprjml9 = this;
        sprjml sprjml10 = this;
        sprjml2.cfr_renamed_0 = sprjml2.cfr_renamed_152 ^ sprjml9.cfr_renamed_10508(sprjml9.cfr_renamed_152, 10L) ^ sprjml10.cfr_renamed_10508(sprjml10.cfr_renamed_152, 17L);
        sprjml sprjml11 = this;
        sprjml sprjml12 = this;
        sprjml2.cfr_renamed_3 = sprjml2.cfr_renamed_93 ^ sprjml11.cfr_renamed_10508(sprjml11.cfr_renamed_93, 7L) ^ sprjml12.cfr_renamed_10508(sprjml12.cfr_renamed_93, 41L);
    }

    @Override
    public int cfr_renamed_1218() {
        return 32;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_1.write(arg0);
    }

    private /* synthetic */ void cfr_renamed_10509() {
        sprjml sprjml2 = this;
        sprjml sprjml3 = this;
        sprjml sprjml4 = this;
        sprjml sprjml5 = this;
        sprjml sprjml6 = this;
        sprjml sprjml7 = this;
        sprjml7.cfr_renamed_10436(240L);
        sprjml7.cfr_renamed_10436(225L);
        sprjml6.cfr_renamed_10436(210L);
        sprjml6.cfr_renamed_10436(195L);
        sprjml5.cfr_renamed_10436(180L);
        sprjml5.cfr_renamed_10436(165L);
        sprjml4.cfr_renamed_10436(150L);
        sprjml4.cfr_renamed_10436(135L);
        sprjml3.cfr_renamed_10436(120L);
        sprjml3.cfr_renamed_10436(105L);
        sprjml2.cfr_renamed_10436(90L);
        sprjml2.cfr_renamed_10436(75L);
    }

    private /* synthetic */ long cfr_renamed_10508(long arg0, long arg1) {
        return arg0 >>> (int)arg1 | arg0 << (int)(64L - arg1);
    }

    public long cfr_renamed_10510(long arg0) {
        return this.cfr_renamed_10508(arg0, 8L) & 0xFF000000FF000000L | this.cfr_renamed_10508(arg0, 24L) & 0xFF000000FF0000L | this.cfr_renamed_10508(arg0, 40L) & 0xFF000000FF00L | this.cfr_renamed_10508(arg0, 56L) & 0xFF000000FFL;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        if (32 + arg1 > arg0.length) {
            throw new sprwjl(sprsdn.cfr_renamed_9("\u0018Z\u0003_\u0002[WM\u0002I\u0011J\u0005\u000f\u001e\\W[\u0018@W\\\u001f@\u0005["));
        }
        sprjml sprjml2 = this;
        sprjml2.cfr_renamed_93 = 0L;
        sprjml2.cfr_renamed_152 = 0L;
        sprjml2.cfr_renamed_4 = 0L;
        sprjml2.cfr_renamed_86 = 0L;
        sprjml2.cfr_renamed_2 = 0L;
        sprjml sprjml3 = this;
        this.cfr_renamed_112 = -1255492011513352131L;
        sprjml3.cfr_renamed_119 = -8380609354527731710L;
        sprjml3.cfr_renamed_91 = -5437372128236807582L;
        this.cfr_renamed_0 = 4834782570098516968L;
        this.cfr_renamed_3 = 3787428097924915520L;
        byte[] byArray = this.cfr_renamed_1.toByteArray();
        int n = byArray.length;
        long[] lArray = new long[n >> 3];
        sprpxe.cfr_renamed_5173(byArray, 0, lArray, 0, lArray.length);
        int n2 = 0;
        int n3 = n;
        while (n3 >= 8) {
            sprjml sprjml4 = this;
            long l = sprjml4.cfr_renamed_112 ^ this.cfr_renamed_10510(lArray[n2]);
            ++n2;
            sprjml4.cfr_renamed_112 = l;
            sprjml4.cfr_renamed_10509();
            n3 = n -= 8;
        }
        this.cfr_renamed_112 ^= 128L << (7 - n << 3);
        int n4 = n;
        while (n4 > 0) {
            this.cfr_renamed_112 ^= ((long)byArray[(n2 << 3) + --n] & 0xFFL) << (7 - n << 3);
            n4 = n;
        }
        this.cfr_renamed_10509();
        long[] lArray2 = new long[4];
        int n5 = n2 = 0;
        while (n5 < 3) {
            sprjml sprjml5 = this;
            lArray2[++n2] = sprjml5.cfr_renamed_10510(this.cfr_renamed_112);
            sprjml5.cfr_renamed_10509();
            n5 = n2;
        }
        sprjml sprjml6 = this;
        lArray2[n2] = sprjml6.cfr_renamed_10510(sprjml6.cfr_renamed_112);
        sprpxe.cfr_renamed_459(lArray2, arg0, arg1);
        this.cfr_renamed_1.reset();
        return 32;
    }

    public sprjml() {
        sprjml sprjml2 = this;
        sprjml2.cfr_renamed_1 = new ByteArrayOutputStream();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprwbf.cfr_renamed_9("~\u0012v\u0011\u0017\tV2_");
    }
}

