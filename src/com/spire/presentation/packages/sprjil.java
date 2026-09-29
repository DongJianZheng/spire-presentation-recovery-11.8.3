/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceea;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprrcba;
import com.spire.presentation.packages.sprvbl;
import com.spire.presentation.packages.sprzok;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprjil {
    public BigInteger cfr_renamed_132;
    public SecureRandom cfr_renamed_102;
    public BigInteger cfr_renamed_93;
    public BigInteger cfr_renamed_86;
    public BigInteger cfr_renamed_152;
    public BigInteger cfr_renamed_112;
    public BigInteger cfr_renamed_119;
    public BigInteger cfr_renamed_91;
    public BigInteger cfr_renamed_0;
    public BigInteger cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public sprgf cfr_renamed_4;

    public BigInteger cfr_renamed_3898() {
        sprjil sprjil2 = this;
        sprjil sprjil3 = this;
        return sprvbl.cfr_renamed_10597(sprjil2.cfr_renamed_4, sprjil2.cfr_renamed_112, sprjil3.cfr_renamed_86, sprjil3.cfr_renamed_102);
    }

    public boolean cfr_renamed_3903(BigInteger arg0) throws sprmml {
        if (this.cfr_renamed_93 == null || this.cfr_renamed_0 == null || this.cfr_renamed_1 == null) {
            throw new sprmml(sprceea.cfr_renamed_9("^'g%d9~({/7>xjt%z:b>rjv$sja/e#q37\u0007%p79x'rjs+c+7+e/7'~9d#y-7,e%zjc\"rjg8r<~%b97%g/e+c#x$dj?\u000b;\u0007&fDc"));
        }
        sprjil sprjil2 = this;
        sprjil sprjil3 = this;
        if (sprvbl.cfr_renamed_10601(sprjil2.cfr_renamed_4, sprjil2.cfr_renamed_112, sprjil3.cfr_renamed_93, sprjil3.cfr_renamed_0, this.cfr_renamed_1).equals(arg0)) {
            this.cfr_renamed_91 = arg0;
            return true;
        }
        return false;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (2 ^ 5);
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

    public BigInteger cfr_renamed_2802(byte[] arg0, byte[] arg1, byte[] arg2) {
        sprjil sprjil2 = this;
        sprjil sprjil3 = this;
        sprjil2.cfr_renamed_119 = sprvbl.cfr_renamed_10592(sprjil2.cfr_renamed_4, sprjil3.cfr_renamed_112, arg0, arg1, arg2);
        sprjil2.cfr_renamed_2 = sprjil3.cfr_renamed_3898();
        sprjil sprjil4 = this;
        sprjil2.cfr_renamed_93 = sprjil2.cfr_renamed_86.modPow(sprjil4.cfr_renamed_2, sprjil4.cfr_renamed_112);
        return sprjil2.cfr_renamed_93;
    }

    public void cfr_renamed_10606(sprzok arg0, sprgf arg1, SecureRandom arg2) {
        this.cfr_renamed_10607(arg0.cfr_renamed_1146(), arg0.cfr_renamed_1145(), arg1, arg2);
    }

    private /* synthetic */ BigInteger cfr_renamed_3896() {
        sprjil sprjil2 = this;
        sprjil sprjil3 = this;
        BigInteger bigInteger = sprvbl.cfr_renamed_10602(sprjil2.cfr_renamed_4, sprjil3.cfr_renamed_112, this.cfr_renamed_86);
        BigInteger bigInteger2 = sprjil2.cfr_renamed_3.multiply(this.cfr_renamed_119).add(this.cfr_renamed_2);
        sprjil sprjil4 = this;
        BigInteger bigInteger3 = sprjil3.cfr_renamed_86.modPow(sprjil4.cfr_renamed_119, sprjil4.cfr_renamed_112).multiply(bigInteger).mod(this.cfr_renamed_112);
        return sprjil2.cfr_renamed_132.subtract(bigInteger3).mod(this.cfr_renamed_112).modPow(bigInteger2, this.cfr_renamed_112);
    }

    public BigInteger cfr_renamed_3897() throws sprmml {
        if (this.cfr_renamed_1 == null || this.cfr_renamed_0 == null || this.cfr_renamed_91 == null) {
            throw new sprmml(sprrcba.cfr_renamed_9("Fk\u007fi|ufdcc/r`&libvzrj&Dcv</u`kj&kg{g/g}c/kfu|oaa/`}ib&{nj&\u007ftjpfizu/i\u007fc}g{o`h|&'U#K>*B4&"));
        }
        sprjil sprjil2 = this;
        this.cfr_renamed_152 = sprvbl.cfr_renamed_10598(sprjil2.cfr_renamed_4, sprjil2.cfr_renamed_112, this.cfr_renamed_1);
        return sprjil2.cfr_renamed_152;
    }

    public BigInteger cfr_renamed_3904() throws sprmml {
        if (this.cfr_renamed_93 == null || this.cfr_renamed_132 == null || this.cfr_renamed_1 == null) {
            throw new sprmml(sprceea.cfr_renamed_9("^'g%d9~({/7>xjt%z:b>rjZ{-jd%z/7.v>vjv8rjz#d9~$pjq8x'7>\u007f/7:e/a#x?djx:r8v>~%y97bVfUfDc"));
        }
        sprjil sprjil2 = this;
        sprjil sprjil3 = this;
        this.cfr_renamed_0 = sprvbl.cfr_renamed_10599(sprjil2.cfr_renamed_4, sprjil2.cfr_renamed_112, this.cfr_renamed_93, sprjil3.cfr_renamed_132, sprjil3.cfr_renamed_1);
        return sprjil2.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10607(BigInteger bigInteger, BigInteger bigInteger2, sprgf sprgf2, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        sprjil sprjil2 = this;
        sprjil sprjil3 = this;
        sprjil3.cfr_renamed_112 = arg0;
        sprjil3.cfr_renamed_86 = arg1;
        sprjil2.cfr_renamed_4 = arg2;
        sprjil2.cfr_renamed_102 = secureRandom;
    }

    public BigInteger cfr_renamed_2800(BigInteger arg0) throws sprmml {
        sprjil sprjil2 = this;
        sprjil2.cfr_renamed_132 = sprvbl.cfr_renamed_2792(sprjil2.cfr_renamed_112, arg0);
        sprjil sprjil3 = this;
        sprjil2.cfr_renamed_3 = sprvbl.cfr_renamed_10595(sprjil2.cfr_renamed_4, sprjil3.cfr_renamed_112, sprjil3.cfr_renamed_93, this.cfr_renamed_132);
        sprjil2.cfr_renamed_1 = sprjil2.cfr_renamed_3896();
        return sprjil2.cfr_renamed_1;
    }
}

