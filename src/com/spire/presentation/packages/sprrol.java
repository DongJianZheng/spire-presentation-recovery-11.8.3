/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjvl;
import com.spire.presentation.packages.sprlwl;
import com.spire.presentation.packages.sproql;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruwl;
import com.spire.presentation.packages.sprxxl;
import com.spire.presentation.packages.sprzvl;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprrol {
    private sprddm cfr_renamed_0;
    private sprlwl cfr_renamed_1;
    private sprak cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprak cfr_renamed_4;

    public sprrol cfr_renamed_3977(boolean arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprxxl cfr_renamed_4078(String arg0, PrivateKey arg1, byte[] arg2) throws sprhjg {
        arg1 = sproul.cfr_renamed_10695(arg1);
        sprrol sprrol2 = this;
        sprcf sprcf2 = sprrol2.cfr_renamed_1.cfr_renamed_4079(arg0, arg1);
        return sprrol2.cfr_renamed_4076().cfr_renamed_10653(sprcf2, arg2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 4 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public sprrol cfr_renamed_10652(sprak arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprxxl cfr_renamed_10738(String arg0, PrivateKey arg1, sprtpl arg2) throws sprhjg {
        arg1 = sproul.cfr_renamed_10695(arg1);
        sprrol sprrol2 = this;
        sprcf sprcf2 = sprrol2.cfr_renamed_1.cfr_renamed_4079(arg0, arg1);
        return sprrol2.cfr_renamed_4076().cfr_renamed_10655(sprcf2, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrol cfr_renamed_1498(Provider provider) throws sprhjg {
        void arg0;
        this.cfr_renamed_1 = new sprzvl((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrol cfr_renamed_1499(String string) throws sprhjg {
        void arg0;
        this.cfr_renamed_1 = new sproql((String)arg0);
        return this;
    }

    public sprxxl cfr_renamed_4080(String arg0, PrivateKey arg1, X509Certificate arg2) throws sprhjg, CertificateEncodingException {
        sprcf sprcf2;
        arg1 = sproul.cfr_renamed_10695(arg1);
        sprrol sprrol2 = this;
        return sprrol2.cfr_renamed_4076().cfr_renamed_10655(sprcf2 = sprrol2.cfr_renamed_1.cfr_renamed_4079(arg0, arg1), new sprowl(arg2));
    }

    public sprrol cfr_renamed_10650(sprak arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrol cfr_renamed_10739(sprjpm sprjpm2) {
        void arg0;
        this.cfr_renamed_2 = new sprjvl((sprjpm)arg0);
        return this;
    }

    private /* synthetic */ spruwl cfr_renamed_4076() throws sprhjg {
        spruwl spruwl2 = new spruwl(this.cfr_renamed_1.cfr_renamed_4073());
        spruwl spruwl3 = spruwl2.cfr_renamed_3977(this.cfr_renamed_3);
        spruwl spruwl4 = spruwl2;
        spruwl2.cfr_renamed_10654(this.cfr_renamed_0);
        spruwl4.cfr_renamed_10652(this.cfr_renamed_2);
        spruwl2.cfr_renamed_10650(this.cfr_renamed_4);
        return spruwl4;
    }

    public sprrol cfr_renamed_10654(sprddm arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprrol() throws sprhjg {
        sprrol sprrol2 = this;
        sprrol2.cfr_renamed_1 = new sprlwl(null);
    }
}

