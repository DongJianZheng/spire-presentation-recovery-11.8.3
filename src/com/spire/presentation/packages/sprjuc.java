/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sprphd;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public class sprjuc
extends FilterInputStream {
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private final Cipher cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public int read() throws IOException {
        sprjuc sprjuc2 = this;
        if (sprjuc2.cfr_renamed_91 >= sprjuc2.cfr_renamed_0 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        return this.cfr_renamed_4[this.cfr_renamed_91++] & 0xFF;
    }

    private /* synthetic */ int cfr_renamed_2518() throws IOException {
        if (this.cfr_renamed_1) {
            return -1;
        }
        this.cfr_renamed_91 = 0;
        this.cfr_renamed_0 = 0;
        while (this.cfr_renamed_0 == 0) {
            sprjuc sprjuc2 = this;
            int n = sprjuc2.in.read(sprjuc2.cfr_renamed_3);
            if (n == -1) {
                sprjuc sprjuc3 = this;
                sprjuc3.cfr_renamed_4 = sprjuc3.cfr_renamed_2519();
                if (sprjuc3.cfr_renamed_4 == null || this.cfr_renamed_4.length == 0) {
                    return -1;
                }
                this.cfr_renamed_0 = this.cfr_renamed_4.length;
                return this.cfr_renamed_0;
            }
            sprjuc sprjuc4 = this;
            this.cfr_renamed_4 = sprjuc4.cfr_renamed_2.update(this.cfr_renamed_3, 0, n);
            if (sprjuc4.cfr_renamed_4 == null) continue;
            this.cfr_renamed_0 = this.cfr_renamed_4.length;
        }
        return this.cfr_renamed_0;
    }

    @Override
    public long skip(long arg0) throws IOException {
        int n;
        if (arg0 <= 0L) {
            return 0L;
        }
        int n2 = n = (int)Math.min(arg0, (long)this.available());
        this.cfr_renamed_91 += n2;
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        block4: {
            sprjuc sprjuc2;
            block3: {
                sprjuc sprjuc3;
                try {
                    this.in.close();
                    if (this.cfr_renamed_1) break block3;
                    sprjuc3 = this;
                }
                catch (Throwable throwable) {
                    if (!this.cfr_renamed_1) {
                        this.cfr_renamed_2519();
                    }
                    throw throwable;
                }
                sprjuc2 = sprjuc3;
                sprjuc3.cfr_renamed_2519();
                break block4;
            }
            sprjuc2 = this;
        }
        this.cfr_renamed_91 = 0;
        sprjuc2.cfr_renamed_0 = 0;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        sprjuc sprjuc2 = this;
        if (sprjuc2.cfr_renamed_91 >= sprjuc2.cfr_renamed_0 && this.cfr_renamed_2518() < 0) {
            return -1;
        }
        int n = Math.min(arg2, this.available());
        sprjuc sprjuc3 = this;
        System.arraycopy(sprjuc3.cfr_renamed_4, sprjuc3.cfr_renamed_91, arg0, arg1, n);
        int n2 = n;
        sprjuc3.cfr_renamed_91 += n2;
        return n2;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public void mark(int arg0) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_2519() throws sprphd {
        try {
            this.cfr_renamed_1 = true;
            return this.cfr_renamed_2.doFinal();
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprphd(sprmwd.cfr_renamed_9("\u0018q/l/#;j3b1j.j3d}`4s5f/"), generalSecurityException);
        }
    }

    @Override
    public int available() throws IOException {
        sprjuc sprjuc2 = this;
        return sprjuc2.cfr_renamed_0 - sprjuc2.cfr_renamed_91;
    }

    @Override
    public void reset() throws IOException {
    }

    /*
     * WARNING - void declaration
     */
    public sprjuc(InputStream inputStream, Cipher cipher) {
        void arg0;
        sprjuc sprjuc2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_3 = new byte[512];
        sprjuc2.cfr_renamed_1 = false;
        sprjuc2.cfr_renamed_2 = cipher;
    }
}

