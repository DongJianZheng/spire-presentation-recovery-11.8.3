/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfk;
import java.io.OutputStream;
import java.security.KeyStore;

public class sprnwj
implements KeyStore.LoadStoreParameter {
    private OutputStream cfr_renamed_2;
    private final KeyStore.ProtectionParameter cfr_renamed_3;
    private final sprdfk cfr_renamed_4;

    public sprnwj(OutputStream arg0, sprdfk arg1, char[] arg2) {
        this(arg0, arg1, new KeyStore.PasswordProtection(arg2));
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_2;
    }

    public sprdfk cfr_renamed_9289() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprnwj(OutputStream outputStream, sprdfk sprdfk2, KeyStore.ProtectionParameter protectionParameter) {
        void arg1;
        void arg0;
        sprnwj sprnwj2 = this;
        this.cfr_renamed_2 = arg0;
        sprnwj2.cfr_renamed_4 = arg1;
        sprnwj2.cfr_renamed_3 = protectionParameter;
    }

    @Override
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
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
}

