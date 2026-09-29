/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.OutputStream;
import java.security.KeyStore;

public class sprolj
implements KeyStore.LoadStoreParameter {
    private final boolean cfr_renamed_2;
    private final KeyStore.ProtectionParameter cfr_renamed_3;
    private final OutputStream cfr_renamed_4;

    public boolean cfr_renamed_2447() {
        return this.cfr_renamed_2;
    }

    @Override
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprolj(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean bl) {
        void arg1;
        void arg0;
        sprolj sprolj2 = this;
        this.cfr_renamed_4 = arg0;
        sprolj2.cfr_renamed_3 = arg1;
        sprolj2.cfr_renamed_2 = bl;
    }

    public sprolj(OutputStream arg0, char[] arg1, boolean arg2) {
        this(arg0, new KeyStore.PasswordProtection(arg1), arg2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 4;
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

    public sprolj(OutputStream arg0, KeyStore.ProtectionParameter arg1) {
        this(arg0, arg1, false);
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_4;
    }

    public sprolj(OutputStream arg0, char[] arg1) {
        this(arg0, arg1, false);
    }
}

