/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreql;
import com.spire.presentation.packages.sprevl;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhmg;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprrrl;
import com.spire.presentation.packages.sprsi;
import com.spire.presentation.packages.sprsvl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprwnl;
import com.spire.presentation.packages.sprwv;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class sprexl {
    private sprwv cfr_renamed_1;
    private sprsi cfr_renamed_2;
    private sprlj cfr_renamed_3;
    private sprwnl cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
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

    /*
     * WARNING - void declaration
     */
    public sprexl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprrrl((Provider)arg0);
        return this;
    }

    public sprexl cfr_renamed_10740(sprwv arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprsvl cfr_renamed_1561(X509Certificate arg0) throws sprhjg {
        sprexl sprexl2 = this;
        return new sprsvl(sprexl2.cfr_renamed_1, sprexl2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_4074(arg0), this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprexl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new spreql((String)arg0);
        return this;
    }

    public sprexl(sprlj sprlj2) {
        sprexl sprexl2 = this;
        sprexl sprexl3 = this;
        sprexl3.cfr_renamed_4 = new sprwnl(null);
        sprexl2.cfr_renamed_1 = new sprevl();
        sprexl2.cfr_renamed_2 = new sprhmg();
        sprexl2.cfr_renamed_3 = sprlj2;
    }

    public sprsvl cfr_renamed_7464(sprtpl arg0) throws sprhjg, CertificateException {
        sprexl sprexl2 = this;
        return new sprsvl(sprexl2.cfr_renamed_1, sprexl2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_10737(arg0), this.cfr_renamed_3);
    }

    public sprexl cfr_renamed_10741(sprsi arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprsvl cfr_renamed_1559(PublicKey arg0) throws sprhjg {
        sprexl sprexl2 = this;
        return new sprsvl(sprexl2.cfr_renamed_1, sprexl2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_4075(arg0), this.cfr_renamed_3);
    }
}

