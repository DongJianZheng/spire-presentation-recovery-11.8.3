/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdbl;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprlny;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public class sprgek
extends FilterOutputStream {
    private final byte[] cfr_renamed_3;
    private final Cipher cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprgek(OutputStream outputStream, Cipher cipher) {
        void arg0;
        sprgek sprgek2 = this;
        super((OutputStream)arg0);
        sprgek2.cfr_renamed_3 = new byte[1];
        sprgek2.cfr_renamed_4 = cipher;
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
            var2_2 = this.cfr_renamed_4.doFinal();
            if (var2_2 != null) {
                this.out.write(var2_2);
            }
        }
        catch (GeneralSecurityException var2_3) {
            var1_1 /* !! */  = new sprdbl(sprlny.cfr_renamed_9("\u0005\u001d2\u00002O$\u001a2\u0006.\b`\f)\u001f(\n2O&\u0006.\u000e,\u00063\u000e4\u0006/\u0001"), var2_3);
            v0 = this;
            ** GOTO lbl15
        }
        catch (Exception var2_4) {
            var1_1 /* !! */  = new IOException(new StringBuilder().insert(0, sprjze.cfr_renamed_9("f\u000bQ\u0016QY@\u0015L\nJ\u0017DYP\rQ\u001cB\u0014\u0019Y")).append(var2_4).toString());
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
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        byte[] byArray = this.cfr_renamed_4.update(arg0, arg1, arg2);
        if (byArray != null) {
            this.out.write(byArray);
        }
    }

    @Override
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override
    public void write(int arg0) throws IOException {
        sprgek sprgek2 = this;
        sprgek2.cfr_renamed_3[0] = (byte)arg0;
        sprgek2.write(sprgek2.cfr_renamed_3, 0, 1);
    }
}

