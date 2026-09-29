/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprnro;
import com.spire.presentation.packages.sprvbl;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprzok;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprtkl {
    public BigInteger cfr_renamed_132;
    public BigInteger cfr_renamed_102;
    public BigInteger cfr_renamed_93;
    public BigInteger cfr_renamed_86;
    public BigInteger cfr_renamed_152;
    public BigInteger cfr_renamed_112;
    public BigInteger cfr_renamed_119;
    public BigInteger cfr_renamed_91;
    public BigInteger cfr_renamed_0;
    public sprgf cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    public void cfr_renamed_10604(sprzok arg0, BigInteger arg1, sprgf arg2, SecureRandom arg3) {
        this.cfr_renamed_10605(arg0.cfr_renamed_1146(), arg0.cfr_renamed_1145(), arg1, arg2, arg3);
    }

    private /* synthetic */ BigInteger cfr_renamed_3896() {
        sprtkl sprtkl2 = this;
        sprtkl sprtkl3 = this;
        return sprtkl2.cfr_renamed_152.modPow(sprtkl2.cfr_renamed_93, this.cfr_renamed_102).multiply(this.cfr_renamed_132).mod(this.cfr_renamed_102).modPow(sprtkl3.cfr_renamed_3, sprtkl3.cfr_renamed_102);
    }

    public BigInteger cfr_renamed_2800(BigInteger arg0) throws sprmml {
        sprtkl sprtkl2 = this;
        sprtkl2.cfr_renamed_132 = sprvbl.cfr_renamed_2792(sprtkl2.cfr_renamed_102, arg0);
        sprtkl sprtkl3 = this;
        sprtkl2.cfr_renamed_93 = sprvbl.cfr_renamed_10595(sprtkl2.cfr_renamed_1, sprtkl3.cfr_renamed_102, sprtkl3.cfr_renamed_132, this.cfr_renamed_0);
        sprtkl2.cfr_renamed_91 = sprtkl2.cfr_renamed_3896();
        return sprtkl2.cfr_renamed_91;
    }

    public BigInteger cfr_renamed_3902() {
        sprtkl sprtkl2 = this;
        BigInteger bigInteger = sprvbl.cfr_renamed_10602(sprtkl2.cfr_renamed_1, this.cfr_renamed_102, this.cfr_renamed_112);
        this.cfr_renamed_3 = sprtkl2.cfr_renamed_3898();
        sprtkl sprtkl3 = this;
        sprtkl2.cfr_renamed_0 = bigInteger.multiply(this.cfr_renamed_152).mod(this.cfr_renamed_102).add(sprtkl3.cfr_renamed_112.modPow(sprtkl3.cfr_renamed_3, this.cfr_renamed_102)).mod(this.cfr_renamed_102);
        return sprtkl2.cfr_renamed_0;
    }

    public boolean cfr_renamed_3899(BigInteger arg0) throws sprmml {
        if (this.cfr_renamed_132 == null || this.cfr_renamed_0 == null || this.cfr_renamed_91 == null) {
            throw new sprmml(sprnro.cfr_renamed_9("\"E\u001bG\u0018[\u0002J\u0007MK\\\u0004\b\bG\u0006X\u001e\\\u000e\b\nF\u000f\b\u001dM\u0019A\rQKeZ\u0012K[\u0004E\u000e\b\u000fI\u001fIKI\u0019MKE\u0002[\u0018A\u0005OKN\u0019G\u0006\b\u001f@\u000e\b\u001bZ\u000e^\u0002G\u001e[KG\u001bM\u0019I\u001fA\u0004F\u0018\bCiGjG{B"));
        }
        sprtkl sprtkl2 = this;
        sprtkl sprtkl3 = this;
        if (sprvbl.cfr_renamed_10599(sprtkl2.cfr_renamed_1, sprtkl2.cfr_renamed_102, sprtkl3.cfr_renamed_132, sprtkl3.cfr_renamed_0, this.cfr_renamed_91).equals(arg0)) {
            this.cfr_renamed_86 = arg0;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_10605(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprgf sprgf2, SecureRandom secureRandom) {
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        sprtkl sprtkl2 = this;
        sprtkl sprtkl3 = this;
        this.cfr_renamed_102 = arg0;
        sprtkl3.cfr_renamed_112 = arg1;
        sprtkl3.cfr_renamed_152 = arg2;
        sprtkl2.cfr_renamed_4 = arg4;
        sprtkl2.cfr_renamed_1 = sprgf2;
    }

    public BigInteger cfr_renamed_3900() throws sprmml {
        if (this.cfr_renamed_132 == null || this.cfr_renamed_86 == null || this.cfr_renamed_91 == null) {
            throw new sprmml(sprvih.cfr_renamed_9("'i\u001ek\u001dw\u0007f\u0002aNp\u0001$\rk\u0003t\u001bp\u000b$#6T$\u001dk\u0003aN`\u000fp\u000f$\u000fv\u000b$\u0003m\u001dw\u0007j\t$\bv\u0001iNp\u0006aNt\u001ca\u0018m\u0001q\u001d$\u0001t\u000bv\u000fp\u0007k\u0000wN,/(#5BWG"));
        }
        sprtkl sprtkl2 = this;
        sprtkl sprtkl3 = this;
        this.cfr_renamed_2 = sprvbl.cfr_renamed_10601(sprtkl2.cfr_renamed_1, sprtkl2.cfr_renamed_102, this.cfr_renamed_132, sprtkl3.cfr_renamed_86, sprtkl3.cfr_renamed_91);
        return sprtkl2.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_3897() throws sprmml {
        if (this.cfr_renamed_91 == null || this.cfr_renamed_86 == null || this.cfr_renamed_2 == null) {
            throw new sprmml(sprnro.cfr_renamed_9("\"E\u001bG\u0018[\u0002J\u0007MK\\\u0004\b\bG\u0006X\u001e\\\u000e\b M\u0012\u0012K[\u0004E\u000e\b\u000fI\u001fIKI\u0019MKE\u0002[\u0018A\u0005OKN\u0019G\u0006\b\u001f@\u000e\b\u001bZ\u000e^\u0002G\u001e[KG\u001bM\u0019I\u001fA\u0004F\u0018\bC{GeZ\u0004&\u001aB"));
        }
        sprtkl sprtkl2 = this;
        this.cfr_renamed_119 = sprvbl.cfr_renamed_10598(sprtkl2.cfr_renamed_1, sprtkl2.cfr_renamed_102, this.cfr_renamed_91);
        return sprtkl2.cfr_renamed_119;
    }

    public BigInteger cfr_renamed_3898() {
        sprtkl sprtkl2 = this;
        sprtkl sprtkl3 = this;
        return sprvbl.cfr_renamed_10597(sprtkl2.cfr_renamed_1, sprtkl2.cfr_renamed_102, sprtkl3.cfr_renamed_112, sprtkl3.cfr_renamed_4);
    }
}

