/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbaa;
import com.spire.presentation.packages.sprgwc;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprzmd;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;

public class sprctc {
    public sprmgd cfr_renamed_4;

    public static sprctc cfr_renamed_2661(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        BigInteger bigInteger = sprgwc.cfr_renamed_3027(inputStream);
        BigInteger bigInteger2 = sprgwc.cfr_renamed_3027(inputStream);
        BigInteger bigInteger3 = sprgwc.cfr_renamed_3027(inputStream);
        return new sprctc(new sprmgd(bigInteger3, new sprzmd(bigInteger, bigInteger2)));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ 2 << 1;
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

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprctc sprctc2 = this;
        sprzmd sprzmd2 = sprctc2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprctc2.cfr_renamed_4.spr\u3181();
        sprzmd sprzmd3 = sprzmd2;
        OutputStream outputStream = arg0;
        sprgwc.cfr_renamed_3029(sprzmd3.cfr_renamed_1155(), outputStream);
        sprgwc.cfr_renamed_3029(sprzmd3.cfr_renamed_1145(), arg0);
        sprgwc.cfr_renamed_3029(bigInteger, outputStream);
    }

    /*
     * WARNING - void declaration
     */
    public sprctc(sprmgd sprmgd2) {
        void arg0;
        if (sprmgd2 == null) {
            throw new IllegalArgumentException(sprcbaa.cfr_renamed_9(")r{`bkmIk{)\"mc`lav.`k\"`wbn"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public sprmgd cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }
}

