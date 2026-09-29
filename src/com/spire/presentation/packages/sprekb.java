/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmky;
import com.spire.presentation.packages.sprmqr;
import com.spire.presentation.packages.sprpb;
import java.math.BigInteger;

public class sprekb {
    private final BigInteger cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public int cfr_renamed_1851() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1853(BigInteger arg0) {
        return this.cfr_renamed_2.compareTo(arg0.shiftLeft(this.cfr_renamed_3));
    }

    public sprekb cfr_renamed_1852(BigInteger arg0) {
        return new sprekb(this.cfr_renamed_2.subtract(arg0.shiftLeft(this.cfr_renamed_3)), this.cfr_renamed_3);
    }

    public sprekb cfr_renamed_1859(BigInteger arg0) {
        return new sprekb(this.cfr_renamed_2.add(arg0.shiftLeft(this.cfr_renamed_3)), this.cfr_renamed_3);
    }

    public static sprekb cfr_renamed_1860(BigInteger arg0, int arg1) {
        return new sprekb(arg0.shiftLeft(arg1), arg1);
    }

    private /* synthetic */ void cfr_renamed_1861(sprekb arg0) {
        if (this.cfr_renamed_3 != arg0.cfr_renamed_3) {
            throw new IllegalArgumentException(sprmky.cfr_renamed_9("t\u0016W\u0001\u001b+R\u0015K\u0014^:R\u001f\u007f\u001dX\u0011V\u0019WXT\u001e\u001b\u000bZ\u0015^XH\u001bZ\u0014^XZ\u0014W\u0017L\u001d_XR\u0016\u001b\u0019I\u0011O\u0010V\u001dO\u0011XXT\b^\nZ\fR\u0017U\u000b"));
        }
    }

    public sprekb cfr_renamed_1847(sprekb arg0) {
        this.cfr_renamed_1861(arg0);
        sprekb sprekb2 = this;
        return new sprekb(this.cfr_renamed_2.multiply(arg0.cfr_renamed_2), sprekb2.cfr_renamed_3 + sprekb2.cfr_renamed_3);
    }

    public BigInteger cfr_renamed_1862() {
        sprekb sprekb2 = this;
        return sprekb2.cfr_renamed_2.shiftRight(sprekb2.cfr_renamed_3);
    }

    public sprekb cfr_renamed_1830(BigInteger arg0) {
        return new sprekb(this.cfr_renamed_2.multiply(arg0), this.cfr_renamed_3);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprekb)) {
            return false;
        }
        sprekb sprekb2 = (sprekb)arg0;
        return this.cfr_renamed_2.equals(sprekb2.cfr_renamed_2) && this.cfr_renamed_3 == sprekb2.cfr_renamed_3;
    }

    public sprekb cfr_renamed_1863(BigInteger arg0) {
        return new sprekb(this.cfr_renamed_2.divide(arg0), this.cfr_renamed_3);
    }

    public sprekb cfr_renamed_979(int arg0) {
        return new sprekb(this.cfr_renamed_2.shiftLeft(arg0), this.cfr_renamed_3);
    }

    public sprekb cfr_renamed_1864(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprmqr.cfr_renamed_9("L%^*ZfR'FfQ)Kf]#\u001f(Z!^2V0Z"));
        }
        if (arg0 == this.cfr_renamed_3) {
            return this;
        }
        return new sprekb(this.cfr_renamed_2.shiftLeft(arg0 - this.cfr_renamed_3), arg0);
    }

    public BigInteger cfr_renamed_802() {
        sprekb sprekb2 = this;
        return sprekb2.cfr_renamed_1848(new sprekb(sprpb.cfr_renamed_0, 1).cfr_renamed_1864(sprekb2.cfr_renamed_3)).cfr_renamed_1862();
    }

    public long cfr_renamed_1865() {
        return this.cfr_renamed_1862().longValue();
    }

    public sprekb cfr_renamed_1849(sprekb arg0) {
        return this.cfr_renamed_1848(arg0.cfr_renamed_1773());
    }

    /*
     * WARNING - void declaration
     */
    public sprekb(BigInteger bigInteger, int n) {
        void arg1;
        void arg0;
        if (n < 0) {
            throw new IllegalArgumentException(sprmky.cfr_renamed_9("\u000bX\u0019W\u001d\u001b\u0015Z\u0001\u001b\u0016T\f\u001b\u001a^XU\u001d\\\u0019O\u0011M\u001d"));
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sprekb cfr_renamed_1866(sprekb arg0) {
        sprekb sprekb2 = this;
        sprekb2.cfr_renamed_1861(arg0);
        BigInteger bigInteger = sprekb2.cfr_renamed_2.shiftLeft(this.cfr_renamed_3);
        return new sprekb(bigInteger.divide(arg0.cfr_renamed_2), this.cfr_renamed_3);
    }

    public String toString() {
        StringBuffer stringBuffer;
        int n;
        if (this.cfr_renamed_3 == 0) {
            return this.cfr_renamed_2.toString();
        }
        sprekb sprekb2 = this;
        BigInteger bigInteger = sprekb2.cfr_renamed_1862();
        BigInteger bigInteger2 = sprekb2.cfr_renamed_2.subtract(bigInteger.shiftLeft(this.cfr_renamed_3));
        if (sprekb2.cfr_renamed_2.signum() == -1) {
            bigInteger2 = sprpb.cfr_renamed_0.shiftLeft(this.cfr_renamed_3).subtract(bigInteger2);
        }
        if (bigInteger.signum() == -1 && !bigInteger2.equals(sprpb.cfr_renamed_1)) {
            bigInteger = bigInteger.add(sprpb.cfr_renamed_0);
        }
        String string = bigInteger.toString();
        sprekb sprekb3 = this;
        char[] cArray = new char[sprekb3.cfr_renamed_3];
        String string2 = bigInteger2.toString(2);
        int n2 = string2.length();
        int n3 = sprekb3.cfr_renamed_3 - n2;
        int n4 = n = 0;
        while (n4 < n3) {
            cArray[n++] = 48;
            n4 = n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = n3 + n;
            char c = string2.charAt(n);
            cArray[n6] = c;
            n5 = ++n;
        }
        String string3 = new String(cArray);
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer(string);
        stringBuffer.append(".");
        stringBuffer2.append(string3);
        return stringBuffer2.toString();
    }

    public sprekb cfr_renamed_1848(sprekb arg0) {
        this.cfr_renamed_1861(arg0);
        return new sprekb(this.cfr_renamed_2.add(arg0.cfr_renamed_2), this.cfr_renamed_3);
    }

    public int cfr_renamed_1867(sprekb arg0) {
        sprekb sprekb2 = this;
        sprekb2.cfr_renamed_1861(arg0);
        return sprekb2.cfr_renamed_2.compareTo(arg0.cfr_renamed_2);
    }

    public int cfr_renamed_1868() {
        return this.cfr_renamed_1862().intValue();
    }

    public sprekb cfr_renamed_1773() {
        return new sprekb(this.cfr_renamed_2.negate(), this.cfr_renamed_3);
    }

    public int hashCode() {
        return this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_3;
    }
}

