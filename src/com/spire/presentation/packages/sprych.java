/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spryme;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprych
extends FilterOutputStream {
    private static final int cfr_renamed_91 = 54;
    private int cfr_renamed_0 = 0;
    private static final spryme cfr_renamed_1 = new spryme();
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3 = new byte[54];
    private static final int cfr_renamed_4 = 74;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        int n2 = 54 - this.cfr_renamed_0;
        if (arg2 < n2) {
            sprych sprych2 = this;
            System.arraycopy(arg0, arg1, sprych2.cfr_renamed_3, this.cfr_renamed_0, arg2);
            sprych2.cfr_renamed_0 += arg2;
            return;
        }
        int n3 = 0;
        if (this.cfr_renamed_0 > 0) {
            sprych sprych3 = this;
            System.arraycopy(arg0, arg1, sprych3.cfr_renamed_3, sprych3.cfr_renamed_0, n2);
            n3 += n2;
            this.cfr_renamed_8528(this.cfr_renamed_3, 0);
        }
        int n4 = arg2;
        while ((n = n4 - n3) >= 54) {
            int n5 = n3;
            n3 += 54;
            this.cfr_renamed_8528(arg0, arg1 + n5);
            n4 = arg2;
        }
        System.arraycopy(arg0, arg1 + n3, this.cfr_renamed_3, 0, n);
        this.cfr_renamed_0 = n;
    }

    @Override
    public void write(byte[] arg0) throws IOException {
        this.write(arg0, 0, arg0.length);
    }

    private /* synthetic */ void cfr_renamed_8528(byte[] arg0, int arg1) throws IOException {
        cfr_renamed_1.cfr_renamed_499(arg0, arg1, 54, this.cfr_renamed_2, 0);
        sprych sprych2 = this;
        sprych2.out.write(sprych2.cfr_renamed_2, 0, 74);
    }

    @Override
    public void close() throws IOException {
        if (this.cfr_renamed_0 > 0) {
            sprych sprych2 = this;
            int n = cfr_renamed_1.cfr_renamed_499(this.cfr_renamed_3, 0, sprych2.cfr_renamed_0, sprych2.cfr_renamed_2, 0);
            sprych sprych3 = this;
            sprych3.cfr_renamed_0 = 0;
            sprych3.cfr_renamed_2[n++] = 13;
            sprych3.cfr_renamed_2[n++] = 10;
            sprych3.out.write(this.cfr_renamed_2, 0, n);
        }
        this.out.close();
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_3[this.cfr_renamed_0++] = (byte)arg0;
        if (this.cfr_renamed_0 == 54) {
            sprych sprych2 = this;
            sprych2.cfr_renamed_8528(sprych2.cfr_renamed_3, 0);
            sprych2.cfr_renamed_0 = 0;
        }
    }

    public sprych(OutputStream arg0) {
        super(arg0);
        this.cfr_renamed_2 = new byte[74];
        this.cfr_renamed_2[72] = 13;
        this.cfr_renamed_2[73] = 10;
    }
}

