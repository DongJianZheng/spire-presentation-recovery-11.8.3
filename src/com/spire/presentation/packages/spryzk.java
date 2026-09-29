/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtk;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjil;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryzk
implements sprxk {
    private boolean cfr_renamed_119;
    private static final BigInteger cfr_renamed_91 = BigInteger.valueOf(1L);
    private SecureRandom cfr_renamed_0;
    private sprjs cfr_renamed_1;
    private final int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryzk(int n, sprjs sprjs2, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        spryzk spryzk2 = this;
        spryzk spryzk3 = this;
        spryzk spryzk4 = this;
        spryzk4.cfr_renamed_2 = arg0;
        spryzk4.cfr_renamed_1 = arg1;
        spryzk3.cfr_renamed_0 = arg2;
        spryzk3.cfr_renamed_119 = false;
        spryzk2.cfr_renamed_3 = false;
        spryzk2.cfr_renamed_4 = false;
    }

    public spryzk(int arg0, sprjs arg1, SecureRandom arg2, boolean arg3, boolean arg4, boolean arg5) {
        spryzk spryzk2;
        spryzk spryzk3 = this;
        this.cfr_renamed_1 = arg1;
        spryzk3.cfr_renamed_0 = arg2;
        spryzk3.cfr_renamed_2 = arg0;
        this.cfr_renamed_119 = arg3;
        if (this.cfr_renamed_119) {
            spryzk2 = this;
            this.cfr_renamed_3 = false;
        } else {
            spryzk2 = this;
            this.cfr_renamed_3 = arg4;
        }
        spryzk2.cfr_renamed_4 = arg5;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_10124(boolean arg0, sprjs arg1, int arg2, byte[] arg3, byte[] arg4) {
        byte[] byArray = arg4;
        if (!arg0) {
            byArray = sproze.cfr_renamed_543(arg3, arg4);
            sproze.cfr_renamed_492(arg4, (byte)0);
        }
        try {
            arg1.cfr_renamed_5671(new sprook(byArray, null));
            byte[] byArray2 = new byte[arg2];
            arg1.cfr_renamed_2341(byArray2, 0, byArray2.length);
            byte[] byArray3 = byArray2;
            return byArray3;
        }
        finally {
            sproze.cfr_renamed_492(byArray, (byte)0);
        }
    }

    private /* synthetic */ sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        if (!(arg0 instanceof sprmuk)) {
            throw new IllegalArgumentException(sprjil.cfr_renamed_9("r\\\u0017tRf\u0017mRnBvEzS"));
        }
        sprnzk sprnzk2 = (sprnzk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprqgo.cfr_renamed_9("]!Q'K)}\u000f"), sprrkl.cfr_renamed_9917(sprnzk2.cfr_renamed_284().cfr_renamed_1769()), arg0, spriil.cfr_renamed_3));
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sprgxh sprgxh2 = sprqxk2.cfr_renamed_1769();
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        BigInteger bigInteger2 = sprqxk2.cfr_renamed_1153();
        BigInteger bigInteger3 = sprhdf.cfr_renamed_513(cfr_renamed_91, bigInteger, this.cfr_renamed_0);
        BigInteger bigInteger4 = this.cfr_renamed_3 ? bigInteger3.multiply(bigInteger2).mod(bigInteger) : bigInteger3;
        sprfe sprfe2 = this.cfr_renamed_3284();
        spreuh[] spreuhArray = new spreuh[2];
        spreuhArray[0] = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger3);
        spreuhArray[1] = sprnzk2.cfr_renamed_1604().cfr_renamed_1830(bigInteger4);
        spreuh[] spreuhArray2 = spreuhArray;
        sprgxh2.cfr_renamed_8691(spreuhArray2);
        spreuh spreuh2 = spreuhArray2[0];
        spreuh spreuh3 = spreuhArray2[1];
        byte[] byArray = spreuh2.cfr_renamed_1972(false);
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        byte[] byArray3 = spreuh3.cfr_renamed_1969().cfr_renamed_91();
        spryzk spryzk2 = this;
        return new sprbtk(spryzk.cfr_renamed_10124(spryzk2.cfr_renamed_4, spryzk2.cfr_renamed_1, this.cfr_renamed_2, byArray, byArray3), byArray2);
    }
}

