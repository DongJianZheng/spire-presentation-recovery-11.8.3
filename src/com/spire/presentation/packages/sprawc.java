/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprphd;
import com.spire.presentation.packages.sprqvca;
import com.spire.presentation.packages.spruzo;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public class sprawc
extends FilterOutputStream {
    private final Cipher cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        char c = '\u0001';
        while (n4 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ c);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    @Override
    public void write(int arg0) throws IOException {
        sprawc sprawc2 = this;
        sprawc2.cfr_renamed_4[0] = (byte)arg0;
        sprawc2.write(sprawc2.cfr_renamed_4, 0, 1);
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        byte[] byArray = this.cfr_renamed_3.update(arg0, arg1, arg2);
        if (byArray != null) {
            this.out.write(byArray);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        var1_1 /* !! */  = null;
        try {
            var2_2 = this.cfr_renamed_3.doFinal();
            if (var2_2 != null) {
                this.out.write(var2_2);
            }
        }
        catch (GeneralSecurityException var2_3) {
            var1_1 /* !! */  = new sprphd(sprqvca.cfr_renamed_9(" =\u0017 \u0017o\u0001:\u0017&\u000b(E,\f?\r*\u0017o\u0003&\u000b.\t&\u0016.\u0011&\n!"), var2_3);
            v0 = this;
            ** GOTO lbl15
        }
        catch (Exception var2_4) {
            var1_1 /* !! */  = new IOException(new StringBuilder().insert(0, spruzo.cfr_renamed_9("wg@z@5Qy]f[{U5Aa@pSx\b5")).append(var2_4).toString());
        }
        try {
            v0 = this;
lbl15:
            // 2 sources

            v0.flush();
            this.out.close();
            v1 = var1_1 /* !! */ ;
        }
        catch (IOException var2_5) {
            if (var1_1 /* !! */  == null) {
                var1_1 /* !! */  = var2_5;
            }
            v1 = var1_1 /* !! */ ;
        }
        if (v1 != null) {
            throw var1_1 /* !! */ ;
        }
    }

    @Override
    public void flush() throws IOException {
        this.out.flush();
    }

    /*
     * WARNING - void declaration
     */
    public sprawc(OutputStream outputStream, Cipher cipher) {
        void arg0;
        sprawc sprawc2 = this;
        super((OutputStream)arg0);
        sprawc2.cfr_renamed_4 = new byte[1];
        sprawc2.cfr_renamed_3 = cipher;
    }
}

