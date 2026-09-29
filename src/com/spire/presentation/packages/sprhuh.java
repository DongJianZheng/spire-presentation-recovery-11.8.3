/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprmcp;
import java.math.BigInteger;

public class sprhuh {
    private static final long cfr_renamed_2 = 1L;
    private final int cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    public sprhuh cfr_renamed_8692(sprhuh arg0) {
        this.cfr_renamed_8703(arg0);
        return new sprhuh(this.cfr_renamed_4.add(arg0.cfr_renamed_4), this.cfr_renamed_3);
    }

    public sprhuh cfr_renamed_1864(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException(sprmcp.cfr_renamed_9("ass|w0\u007fqk0|\u007ff0pu2~wwsd{fw"));
        }
        if (arg0 == this.cfr_renamed_3) {
            return this;
        }
        return new sprhuh(this.cfr_renamed_4.shiftLeft(arg0 - this.cfr_renamed_3), arg0);
    }

    public sprhuh cfr_renamed_8693(sprhuh arg0) {
        return this.cfr_renamed_8692(arg0.cfr_renamed_1773());
    }

    public int cfr_renamed_1851() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1862() {
        sprhuh sprhuh2 = this;
        return sprhuh2.cfr_renamed_4.shiftRight(sprhuh2.cfr_renamed_3);
    }

    public int cfr_renamed_8704(sprhuh arg0) {
        sprhuh sprhuh2 = this;
        sprhuh2.cfr_renamed_8703(arg0);
        return sprhuh2.cfr_renamed_4.compareTo(arg0.cfr_renamed_4);
    }

    public sprhuh cfr_renamed_979(int arg0) {
        return new sprhuh(this.cfr_renamed_4.shiftLeft(arg0), this.cfr_renamed_3);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprhuh)) {
            return false;
        }
        sprhuh sprhuh2 = (sprhuh)arg0;
        return this.cfr_renamed_4.equals(sprhuh2.cfr_renamed_4) && this.cfr_renamed_3 == sprhuh2.cfr_renamed_3;
    }

    public sprhuh cfr_renamed_1852(BigInteger arg0) {
        return new sprhuh(this.cfr_renamed_4.subtract(arg0.shiftLeft(this.cfr_renamed_3)), this.cfr_renamed_3);
    }

    public sprhuh cfr_renamed_1863(BigInteger arg0) {
        return new sprhuh(this.cfr_renamed_4.divide(arg0), this.cfr_renamed_3);
    }

    public int cfr_renamed_1868() {
        return this.cfr_renamed_1862().intValue();
    }

    public sprhuh cfr_renamed_1830(BigInteger arg0) {
        return new sprhuh(this.cfr_renamed_4.multiply(arg0), this.cfr_renamed_3);
    }

    public BigInteger cfr_renamed_802() {
        sprhuh sprhuh2 = this;
        return sprhuh2.cfr_renamed_8692(new sprhuh(sprck.cfr_renamed_4, 1).cfr_renamed_1864(sprhuh2.cfr_renamed_3)).cfr_renamed_1862();
    }

    private /* synthetic */ void cfr_renamed_8703(sprhuh arg0) {
        if (this.cfr_renamed_3 != arg0.cfr_renamed_3) {
            throw new IllegalArgumentException(sprkuh.cfr_renamed_9("o_LH\u0000bI\\P]EsIVdTCXMPL\u0011OW\u0000BA\\E\u0011SRA]E\u0011A]L^WTD\u0011I_\u0000PRXTYMTTXC\u0011OAECAEI^NB"));
        }
    }

    public int cfr_renamed_1853(BigInteger arg0) {
        return this.cfr_renamed_4.compareTo(arg0.shiftLeft(this.cfr_renamed_3));
    }

    public sprhuh cfr_renamed_1773() {
        return new sprhuh(this.cfr_renamed_4.negate(), this.cfr_renamed_3);
    }

    public long cfr_renamed_1865() {
        return this.cfr_renamed_1862().longValue();
    }

    public String toString() {
        StringBuffer stringBuffer;
        int n;
        if (this.cfr_renamed_3 == 0) {
            return this.cfr_renamed_4.toString();
        }
        sprhuh sprhuh2 = this;
        BigInteger bigInteger = sprhuh2.cfr_renamed_1862();
        BigInteger bigInteger2 = sprhuh2.cfr_renamed_4.subtract(bigInteger.shiftLeft(this.cfr_renamed_3));
        if (sprhuh2.cfr_renamed_4.signum() == -1) {
            bigInteger2 = sprck.cfr_renamed_4.shiftLeft(this.cfr_renamed_3).subtract(bigInteger2);
        }
        if (bigInteger.signum() == -1 && !bigInteger2.equals(sprck.cfr_renamed_0)) {
            bigInteger = bigInteger.add(sprck.cfr_renamed_4);
        }
        String string = bigInteger.toString();
        sprhuh sprhuh3 = this;
        char[] cArray = new char[sprhuh3.cfr_renamed_3];
        String string2 = bigInteger2.toString(2);
        int n2 = string2.length();
        int n3 = sprhuh3.cfr_renamed_3 - n2;
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

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ this.cfr_renamed_3;
    }

    public sprhuh cfr_renamed_1859(BigInteger arg0) {
        return new sprhuh(this.cfr_renamed_4.add(arg0.shiftLeft(this.cfr_renamed_3)), this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprhuh(BigInteger bigInteger, int n) {
        void arg1;
        void arg0;
        if (n < 0) {
            throw new IllegalArgumentException(sprmcp.cfr_renamed_9("ass|w0\u007fqk0|\u007ff0pu2~wwsd{fw"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sprhuh cfr_renamed_8705(sprhuh arg0) {
        sprhuh sprhuh2 = this;
        sprhuh2.cfr_renamed_8703(arg0);
        BigInteger bigInteger = sprhuh2.cfr_renamed_4.shiftLeft(this.cfr_renamed_3);
        return new sprhuh(bigInteger.divide(arg0.cfr_renamed_4), this.cfr_renamed_3);
    }

    public sprhuh cfr_renamed_8697(sprhuh arg0) {
        this.cfr_renamed_8703(arg0);
        sprhuh sprhuh2 = this;
        return new sprhuh(this.cfr_renamed_4.multiply(arg0.cfr_renamed_4), sprhuh2.cfr_renamed_3 + sprhuh2.cfr_renamed_3);
    }

    public static sprhuh cfr_renamed_1860(BigInteger arg0, int arg1) {
        return new sprhuh(arg0.shiftLeft(arg1), arg1);
    }
}

