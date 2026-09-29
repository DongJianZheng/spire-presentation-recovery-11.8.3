/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprjnd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprwtz;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprned {
    public BigInteger cfr_renamed_132;
    public BigInteger cfr_renamed_102;
    public BigInteger cfr_renamed_93;
    public BigInteger cfr_renamed_86;
    public BigInteger cfr_renamed_152;
    public BigInteger cfr_renamed_112;
    public BigInteger cfr_renamed_119;
    public BigInteger cfr_renamed_91;
    public BigInteger cfr_renamed_0;
    public BigInteger cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public sprlc cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    private /* synthetic */ BigInteger cfr_renamed_3896() {
        sprned sprned2 = this;
        sprned sprned3 = this;
        return sprned2.cfr_renamed_152.modPow(sprned2.cfr_renamed_119, this.cfr_renamed_112).multiply(this.cfr_renamed_91).mod(this.cfr_renamed_112).modPow(sprned3.cfr_renamed_2, sprned3.cfr_renamed_112);
    }

    public BigInteger cfr_renamed_3897() throws sprvmd {
        if (this.cfr_renamed_132 == null || this.cfr_renamed_0 == null || this.cfr_renamed_102 == null) {
            throw new sprvmd(spriai.cfr_renamed_9("5f\fd\u000fx\u0015i\u0010n\\\u007f\u0013+\u001fd\u0011{\t\u007f\u0019+7n\u00051\\x\u0013f\u0019+\u0018j\bj\\j\u000en\\f\u0015x\u000fb\u0012l\\m\u000ed\u0011+\bc\u0019+\fy\u0019}\u0015d\tx\\d\fn\u000ej\bb\u0013e\u000f+TXPFM'19U"));
        }
        sprned sprned2 = this;
        this.cfr_renamed_86 = sprjnd.cfr_renamed_3889(sprned2.cfr_renamed_3, sprned2.cfr_renamed_112, this.cfr_renamed_132);
        return sprned2.cfr_renamed_86;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ 3;
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

    public BigInteger cfr_renamed_3898() {
        sprned sprned2 = this;
        sprned sprned3 = this;
        return sprjnd.cfr_renamed_3894(sprned2.cfr_renamed_3, sprned2.cfr_renamed_112, sprned3.cfr_renamed_93, sprned3.cfr_renamed_4);
    }

    public boolean cfr_renamed_3899(BigInteger arg0) throws sprvmd {
        if (this.cfr_renamed_91 == null || this.cfr_renamed_1 == null || this.cfr_renamed_132 == null) {
            throw new sprvmd(sprwtz.cfr_renamed_9("]\bd\ng\u0016}\u0007x\u00004\u0011{Ew\ny\u0015a\u0011qEu\u000bpEb\u0000f\fr\u001c4(%_4\u0016{\bqEp\u0004`\u00044\u0004f\u00004\b}\u0016g\fz\u00024\u0003f\nyE`\rqEd\u0017q\u0013}\na\u00164\nd\u0000f\u0004`\f{\u000bgE<$8'86="));
        }
        sprned sprned2 = this;
        sprned sprned3 = this;
        if (sprjnd.cfr_renamed_3890(sprned2.cfr_renamed_3, sprned2.cfr_renamed_112, sprned3.cfr_renamed_91, sprned3.cfr_renamed_1, this.cfr_renamed_132).equals(arg0)) {
            this.cfr_renamed_0 = arg0;
            return true;
        }
        return false;
    }

    public BigInteger cfr_renamed_3900() throws sprvmd {
        if (this.cfr_renamed_91 == null || this.cfr_renamed_0 == null || this.cfr_renamed_132 == null) {
            throw new sprvmd(spriai.cfr_renamed_9("5f\fd\u000fx\u0015i\u0010n\\\u007f\u0013+\u001fd\u0011{\t\u007f\u0019+19F+\u000fd\u0011n\\o\u001d\u007f\u001d+\u001dy\u0019+\u0011b\u000fx\u0015e\u001b+\u001ay\u0013f\\\u007f\u0014n\\{\u000en\nb\u0013~\u000f+\u0013{\u0019y\u001d\u007f\u0015d\u0012x\\#='1:PXU"));
        }
        sprned sprned2 = this;
        sprned sprned3 = this;
        this.cfr_renamed_102 = sprjnd.cfr_renamed_3895(sprned2.cfr_renamed_3, sprned2.cfr_renamed_112, this.cfr_renamed_91, sprned3.cfr_renamed_0, sprned3.cfr_renamed_132);
        return sprned2.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3901(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprlc sprlc2, SecureRandom secureRandom) {
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        sprned sprned2 = this;
        sprned sprned3 = this;
        this.cfr_renamed_112 = arg0;
        sprned3.cfr_renamed_93 = arg1;
        sprned3.cfr_renamed_152 = arg2;
        sprned2.cfr_renamed_4 = arg4;
        sprned2.cfr_renamed_3 = sprlc2;
    }

    public BigInteger cfr_renamed_3902() {
        sprned sprned2 = this;
        BigInteger bigInteger = sprjnd.cfr_renamed_3891(sprned2.cfr_renamed_3, this.cfr_renamed_112, this.cfr_renamed_93);
        this.cfr_renamed_2 = sprned2.cfr_renamed_3898();
        sprned sprned3 = this;
        sprned2.cfr_renamed_1 = bigInteger.multiply(this.cfr_renamed_152).mod(this.cfr_renamed_112).add(sprned3.cfr_renamed_93.modPow(sprned3.cfr_renamed_2, this.cfr_renamed_112)).mod(this.cfr_renamed_112);
        return sprned2.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_2800(BigInteger arg0) throws sprvmd {
        sprned sprned2 = this;
        sprned2.cfr_renamed_91 = sprjnd.cfr_renamed_2792(sprned2.cfr_renamed_112, arg0);
        sprned sprned3 = this;
        sprned2.cfr_renamed_119 = sprjnd.cfr_renamed_3893(sprned2.cfr_renamed_3, sprned3.cfr_renamed_112, sprned3.cfr_renamed_91, this.cfr_renamed_1);
        sprned2.cfr_renamed_132 = sprned2.cfr_renamed_3896();
        return sprned2.cfr_renamed_132;
    }
}

