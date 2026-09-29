/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdbl;
import com.spire.presentation.packages.sprdfaa;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public class sprsvj
extends FilterInputStream {
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private final Cipher cfr_renamed_1;
    private boolean cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        block4: {
            sprsvj sprsvj2;
            block3: {
                sprsvj sprsvj3;
                try {
                    this.in.close();
                    if (this.cfr_renamed_2) break block3;
                    sprsvj3 = this;
                }
                catch (Throwable throwable) {
                    if (!this.cfr_renamed_2) {
                        this.cfr_renamed_2519();
                    }
                    throw throwable;
                }
                sprsvj2 = sprsvj3;
                sprsvj3.cfr_renamed_2519();
                break block4;
            }
            sprsvj2 = this;
        }
        this.cfr_renamed_4 = 0;
        sprsvj2.cfr_renamed_0 = 0;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public long skip(long arg0) throws IOException {
        int n;
        if (arg0 <= 0L) {
            return 0L;
        }
        int n2 = n = (int)Math.min(arg0, (long)this.available());
        this.cfr_renamed_4 += n2;
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public sprsvj(InputStream inputStream, Cipher cipher) {
        void arg0;
        sprsvj sprsvj2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_3 = new byte[512];
        sprsvj2.cfr_renamed_2 = false;
        sprsvj2.cfr_renamed_1 = cipher;
    }

    @Override
    public void mark(int arg0) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_2519() throws sprdbl {
        try {
            if (this.cfr_renamed_2) return null;
            this.cfr_renamed_2 = true;
            return this.cfr_renamed_1.doFinal();
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprdbl(sprdfaa.cfr_renamed_9("q\u0013F\u000eFAR\bZ\u0000X\bG\bZ\u0006\u0014\u0002]\u0011\\\u0004F"), generalSecurityException);
        }
    }

    private /* synthetic */ int cfr_renamed_2518() throws IOException {
        if (this.cfr_renamed_2) {
            return -1;
        }
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_0 = 0;
        while (this.cfr_renamed_0 == 0) {
            sprsvj sprsvj2 = this;
            int n = sprsvj2.in.read(sprsvj2.cfr_renamed_3);
            if (n == -1) {
                sprsvj sprsvj3 = this;
                sprsvj3.cfr_renamed_91 = sprsvj3.cfr_renamed_2519();
                if (sprsvj3.cfr_renamed_91 == null || this.cfr_renamed_91.length == 0) {
                    return -1;
                }
                this.cfr_renamed_0 = this.cfr_renamed_91.length;
                return this.cfr_renamed_0;
            }
            sprsvj sprsvj4 = this;
            this.cfr_renamed_91 = sprsvj4.cfr_renamed_1.update(this.cfr_renamed_3, 0, n);
            if (sprsvj4.cfr_renamed_91 == null) continue;
            this.cfr_renamed_0 = this.cfr_renamed_91.length;
        }
        return this.cfr_renamed_0;
    }

    @Override
    public int available() throws IOException {
        sprsvj sprsvj2 = this;
        return sprsvj2.cfr_renamed_0 - sprsvj2.cfr_renamed_4;
    }

    @Override
    public void reset() throws IOException {
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        sprsvj sprsvj2 = this;
        if (sprsvj2.cfr_renamed_4 >= sprsvj2.cfr_renamed_0 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        int n = Math.min(arg2, this.available());
        sprsvj sprsvj3 = this;
        System.arraycopy(sprsvj3.cfr_renamed_91, sprsvj3.cfr_renamed_4, arg0, arg1, n);
        int n2 = n;
        sprsvj3.cfr_renamed_4 += n2;
        return n2;
    }

    @Override
    public int read() throws IOException {
        sprsvj sprsvj2 = this;
        if (sprsvj2.cfr_renamed_4 >= sprsvj2.cfr_renamed_0 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        return this.cfr_renamed_91[this.cfr_renamed_4++] & 0xFF;
    }
}

