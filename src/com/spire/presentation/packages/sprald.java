/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprjnd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprytf;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprald {
    public SecureRandom cfr_renamed_132;
    public BigInteger cfr_renamed_102;
    public BigInteger cfr_renamed_93;
    public BigInteger cfr_renamed_86;
    public BigInteger cfr_renamed_152;
    public BigInteger cfr_renamed_112;
    public sprlc cfr_renamed_119;
    public BigInteger cfr_renamed_91;
    public BigInteger cfr_renamed_0;
    public BigInteger cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_3898() {
        sprald sprald2 = this;
        sprald sprald3 = this;
        return sprjnd.cfr_renamed_3894(sprald2.cfr_renamed_119, sprald2.cfr_renamed_102, sprald3.cfr_renamed_152, sprald3.cfr_renamed_132);
    }

    public BigInteger cfr_renamed_3897() throws sprvmd {
        if (this.cfr_renamed_2 == null || this.cfr_renamed_0 == null || this.cfr_renamed_1 == null) {
            throw new sprvmd(sprjaaa.cfr_renamed_9("(\"\u0011 \u0012<\b-\r*A;\u000eo\u0002 \f?\u0014;\u0004o**\u0018uA<\u000e\"\u0004o\u0005.\u0015.A.\u0013*A\"\b<\u0012&\u000f(A)\u0013 \fo\u0015'\u0004o\u0011=\u00049\b \u0014<A \u0011*\u0013.\u0015&\u000e!\u0012oI\u001cM\u0002Pc,}H"));
        }
        sprald sprald2 = this;
        this.cfr_renamed_3 = sprjnd.cfr_renamed_3889(sprald2.cfr_renamed_119, sprald2.cfr_renamed_102, this.cfr_renamed_2);
        return sprald2.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 3 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public BigInteger cfr_renamed_2800(BigInteger arg0) throws sprvmd {
        sprald sprald2 = this;
        sprald2.cfr_renamed_93 = sprjnd.cfr_renamed_2792(sprald2.cfr_renamed_102, arg0);
        sprald sprald3 = this;
        sprald2.cfr_renamed_91 = sprjnd.cfr_renamed_3893(sprald2.cfr_renamed_119, sprald3.cfr_renamed_102, sprald3.cfr_renamed_112, this.cfr_renamed_93);
        sprald2.cfr_renamed_2 = sprald2.cfr_renamed_3896();
        return sprald2.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_2802(byte[] arg0, byte[] arg1, byte[] arg2) {
        sprald sprald2 = this;
        sprald sprald3 = this;
        sprald2.cfr_renamed_4 = sprjnd.cfr_renamed_3886(sprald2.cfr_renamed_119, sprald3.cfr_renamed_102, arg0, arg1, arg2);
        sprald2.cfr_renamed_86 = sprald3.cfr_renamed_3898();
        sprald sprald4 = this;
        sprald2.cfr_renamed_112 = sprald2.cfr_renamed_152.modPow(sprald4.cfr_renamed_86, sprald4.cfr_renamed_102);
        return sprald2.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2793(BigInteger bigInteger, BigInteger bigInteger2, sprlc sprlc2, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        sprald sprald2 = this;
        sprald sprald3 = this;
        sprald3.cfr_renamed_102 = arg0;
        sprald3.cfr_renamed_152 = arg1;
        sprald2.cfr_renamed_119 = arg2;
        sprald2.cfr_renamed_132 = secureRandom;
    }

    public boolean cfr_renamed_3903(BigInteger arg0) throws sprvmd {
        if (this.cfr_renamed_112 == null || this.cfr_renamed_0 == null || this.cfr_renamed_2 == null) {
            throw new sprvmd(sprytf.cfr_renamed_9("C\u000bz\ty\u0015c\u0004f\u0003*\u0012eFi\tg\u0016\u007f\u0012oFk\bnF|\u0003x\u000fl\u001f*+8\\*\u0015e\u000boFn\u0007~\u0007*\u0007x\u0003*\u000bc\u0015y\u000fd\u0001*\u0000x\tgF~\u000eoFz\u0014o\u0010c\t\u007f\u0015*\tz\u0003x\u0007~\u000fe\byF\"'&+;JYO"));
        }
        sprald sprald2 = this;
        sprald sprald3 = this;
        if (sprjnd.cfr_renamed_3895(sprald2.cfr_renamed_119, sprald2.cfr_renamed_102, sprald3.cfr_renamed_112, sprald3.cfr_renamed_0, this.cfr_renamed_2).equals(arg0)) {
            this.cfr_renamed_1 = arg0;
            return true;
        }
        return false;
    }

    private /* synthetic */ BigInteger cfr_renamed_3896() {
        sprald sprald2 = this;
        sprald sprald3 = this;
        BigInteger bigInteger = sprjnd.cfr_renamed_3891(sprald2.cfr_renamed_119, sprald3.cfr_renamed_102, this.cfr_renamed_152);
        BigInteger bigInteger2 = sprald2.cfr_renamed_91.multiply(this.cfr_renamed_4).add(this.cfr_renamed_86);
        sprald sprald4 = this;
        BigInteger bigInteger3 = sprald3.cfr_renamed_152.modPow(sprald4.cfr_renamed_4, sprald4.cfr_renamed_102).multiply(bigInteger).mod(this.cfr_renamed_102);
        return sprald2.cfr_renamed_93.subtract(bigInteger3).mod(this.cfr_renamed_102).modPow(bigInteger2, this.cfr_renamed_102);
    }

    public BigInteger cfr_renamed_3904() throws sprvmd {
        if (this.cfr_renamed_112 == null || this.cfr_renamed_93 == null || this.cfr_renamed_2 == null) {
            throw new sprvmd(sprjaaa.cfr_renamed_9("\u0006\f?\u000e<\u0012&\u0003#\u0004o\u0015 A,\u000e\"\u0011:\u0015*A\u0002PuA<\u000e\"\u0004o\u0005.\u0015.A.\u0013*A\"\b<\u0012&\u000f(A)\u0013 \fo\u0015'\u0004o\u0011=\u00049\b \u0014<A \u0011*\u0013.\u0015&\u000e!\u0012oI\u000eM\rM\u001cH"));
        }
        sprald sprald2 = this;
        sprald sprald3 = this;
        this.cfr_renamed_0 = sprjnd.cfr_renamed_3890(sprald2.cfr_renamed_119, sprald2.cfr_renamed_102, this.cfr_renamed_112, sprald3.cfr_renamed_93, sprald3.cfr_renamed_2);
        return sprald2.cfr_renamed_0;
    }
}

