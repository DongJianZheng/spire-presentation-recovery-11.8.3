/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdwk;
import com.spire.presentation.packages.sprrfi;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;

public class sprwvj
implements KeyStore.LoadStoreParameter {
    private final KeyStore.ProtectionParameter cfr_renamed_2;
    private final OutputStream cfr_renamed_3;
    private final InputStream cfr_renamed_4;

    public sprwvj(InputStream arg0, char[] arg1) {
        this(arg0, (KeyStore.ProtectionParameter)new KeyStore.PasswordProtection(arg1));
    }

    public sprwvj(OutputStream arg0, char[] arg1) {
        this(arg0, (KeyStore.ProtectionParameter)new KeyStore.PasswordProtection(arg1));
    }

    public InputStream cfr_renamed_2920() {
        if (this.cfr_renamed_3 != null) {
            throw new UnsupportedOperationException(sprdwk.cfr_renamed_9("_P]PBT[T]\u0011L^AWFVZCJU\u000fW@C\u000fB[^]PHT\u000f~ZE_D[b[CJPB\u0011_CJBJ_["));
        }
        return this.cfr_renamed_4;
    }

    @Override
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.cfr_renamed_2;
    }

    public sprwvj(InputStream arg0, KeyStore.ProtectionParameter arg1) {
        this(arg0, null, arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 2 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
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

    public OutputStream cfr_renamed_470() {
        if (this.cfr_renamed_3 == null) {
            throw new UnsupportedOperationException(sprrfi.cfr_renamed_9("esgsxwawg2{}a2v}{t|u``pv5tz`5aa}gsrw5?5|z2Zgab`fFfgwt\u007f"));
        }
        return this.cfr_renamed_3;
    }

    public sprwvj(OutputStream arg0, KeyStore.ProtectionParameter arg1) {
        this(null, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprwvj(InputStream inputStream, OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        void arg1;
        void arg0;
        sprwvj sprwvj2 = this;
        this.cfr_renamed_4 = arg0;
        sprwvj2.cfr_renamed_3 = arg1;
        sprwvj2.cfr_renamed_2 = protectionParameter;
    }
}

