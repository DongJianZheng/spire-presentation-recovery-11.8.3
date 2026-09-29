/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprai;
import com.spire.presentation.packages.sprbvd;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprfsd;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprjzd;
import com.spire.presentation.packages.sprka;
import com.spire.presentation.packages.sprqud;
import com.spire.presentation.packages.sprwxa;
import com.spire.presentation.packages.sprxpd;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class sprzyd {
    private sprjzd cfr_renamed_1;
    private sprai cfr_renamed_2;
    private sprka cfr_renamed_3;
    private spraa cfr_renamed_4;

    public sprfsd cfr_renamed_1559(PublicKey arg0) throws sprfya {
        sprzyd sprzyd2 = this;
        return new sprfsd(sprzyd2.cfr_renamed_2, sprzyd2.cfr_renamed_3, this.cfr_renamed_1.cfr_renamed_4075(arg0), this.cfr_renamed_4);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 1);
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
    public sprzyd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprbvd(this, (String)arg0);
        return this;
    }

    public sprfsd cfr_renamed_1560(sprcyd arg0) throws sprfya, CertificateException {
        sprzyd sprzyd2 = this;
        return new sprfsd(sprzyd2.cfr_renamed_2, sprzyd2.cfr_renamed_3, this.cfr_renamed_1.cfr_renamed_4072(arg0), this.cfr_renamed_4);
    }

    public sprfsd cfr_renamed_1561(X509Certificate arg0) throws sprfya {
        sprzyd sprzyd2 = this;
        return new sprfsd(sprzyd2.cfr_renamed_2, sprzyd2.cfr_renamed_3, this.cfr_renamed_1.cfr_renamed_4074(arg0), this.cfr_renamed_4);
    }

    public sprzyd(spraa spraa2) {
        sprzyd sprzyd2 = this;
        sprzyd sprzyd3 = this;
        this.cfr_renamed_1 = new sprjzd(this, null);
        sprzyd2.cfr_renamed_2 = new sprxpd();
        sprzyd2.cfr_renamed_3 = new sprwxa();
        sprzyd2.cfr_renamed_4 = spraa2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzyd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprqud(this, (Provider)arg0);
        return this;
    }

    public sprzyd cfr_renamed_4081(sprka arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprzyd cfr_renamed_4082(sprai arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }
}

