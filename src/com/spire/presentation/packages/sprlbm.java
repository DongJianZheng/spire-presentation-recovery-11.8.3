/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfoo;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.sprqcm;
import com.spire.presentation.packages.sprst;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprlbm
extends InputStream
implements sprst {
    public InputStream cfr_renamed_4;

    @Override
    public int read() throws IOException {
        return this.cfr_renamed_4.read();
    }

    public sprlbm(InputStream inputStream) {
        this.cfr_renamed_4 = inputStream;
    }

    public sprqbm cfr_renamed_7676() throws IOException {
        sprlbm sprlbm2;
        int n = this.read();
        int n2 = 0;
        boolean bl = false;
        if (n < 0) {
            return null;
        }
        if (n < 192) {
            n2 = n;
            sprlbm2 = this;
        } else if (n <= 223) {
            n2 = (n - 192 << 8) + this.cfr_renamed_4.read() + 192;
            sprlbm2 = this;
        } else if (n == 255) {
            sprlbm sprlbm3 = this;
            sprlbm2 = sprlbm3;
            n2 = this.cfr_renamed_4.read() << 24 | this.cfr_renamed_4.read() << 16 | this.cfr_renamed_4.read() << 8 | sprlbm3.cfr_renamed_4.read();
            bl = true;
        } else {
            throw new IOException(sproqr.cfr_renamed_9("\u0010\u0001\u0017\n\u0006\u0000\u0002\u0001\f\u001c\u0000\u000bE\u0003\u0000\u0001\u0002\u001b\rO\u0017\n\u0004\u000b\f\u0001\u0002O\u0010\u001c\u0000\u001dE\u000e\u0011\u001b\u0017\u0006\u0007\u001a\u0011\nE\u001c\u0010\rE\u001f\u0004\f\u000e\n\u0011"));
        }
        int n3 = sprlbm2.cfr_renamed_4.read();
        if (n3 < 0) {
            throw new EOFException(sprfoo.cfr_renamed_9("\u0001G\u0011Q\u0004L\u0017]\u0011MTl;oT[\u0011H\u0010@\u001aNT\\\u0007L\u0006\t\u0015]\u0000[\u001dK\u0001]\u0011\t\u0007\\\u0016\t\u0004H\u0017B\u0011]"));
        }
        byte[] byArray = new byte[n2 - 1];
        this.cfr_renamed_11040(byArray, 0, byArray.length);
        int n4 = n3;
        switch (n4) {
            case 1: {
                return new sprqcm(bl, byArray);
            }
        }
        return new sprqbm(n4, bl, byArray);
    }

    private /* synthetic */ void cfr_renamed_11040(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        if (arg2 > 0) {
            n = this.read();
            if (n < 0) {
                throw new EOFException();
            }
            arg0[arg1++] = (byte)n;
        }
        int n2 = --arg2;
        while (n2 > 0) {
            n = this.cfr_renamed_4.read(arg0, arg1, arg2);
            if (n < 0) {
                throw new EOFException();
            }
            arg1 += n;
            n2 = arg2 - n;
        }
    }

    @Override
    public int available() throws IOException {
        return this.cfr_renamed_4.available();
    }
}

