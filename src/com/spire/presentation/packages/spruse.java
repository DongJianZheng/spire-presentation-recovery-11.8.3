/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprate;
import com.spire.presentation.packages.sprbsa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class spruse
extends sprate {
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_4791(int arg0, byte[] arg1) throws IOException {
        if (this.cfr_renamed_2) {
            spruse spruse2 = this;
            int n = spruse2.cfr_renamed_4 | 0x80;
            if (spruse2.cfr_renamed_3) {
                spruse spruse3 = this;
                int n2 = spruse3.cfr_renamed_4 | 0x20 | 0x80;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                spruse3.cfr_renamed_4795(byteArrayOutputStream, arg0, arg1);
                spruse3.cfr_renamed_4795((OutputStream)spruse3.cfr_renamed_4, n2, byteArrayOutputStream.toByteArray());
                return;
            }
            if ((arg0 & 0x20) != 0) {
                spruse spruse4 = this;
                spruse4.cfr_renamed_4795((OutputStream)spruse4.cfr_renamed_4, n | 0x20, arg1);
                return;
            }
            spruse spruse5 = this;
            spruse5.cfr_renamed_4795((OutputStream)spruse5.cfr_renamed_4, n, arg1);
            return;
        }
        spruse spruse6 = this;
        spruse6.cfr_renamed_4795((OutputStream)spruse6.cfr_renamed_4, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4795(OutputStream outputStream, int n, byte[] byArray) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.write((int)arg1);
        this.cfr_renamed_4796((OutputStream)v0, ((void)arg2).length);
        arg0.write((byte[])arg2);
    }

    public void cfr_renamed_4797(OutputStream arg0, int arg1, InputStream arg2) throws IOException {
        this.cfr_renamed_4795(arg0, arg1, sprbsa.cfr_renamed_471(arg2));
    }

    /*
     * WARNING - void declaration
     */
    public spruse(OutputStream outputStream) {
        super((OutputStream)arg0);
        void arg0;
        this.cfr_renamed_2 = false;
    }

    /*
     * WARNING - void declaration
     */
    public spruse(OutputStream outputStream, int n, boolean bl) {
        void arg2;
        void arg0;
        spruse spruse2 = this;
        spruse spruse3 = this;
        super((OutputStream)arg0);
        spruse3.cfr_renamed_2 = false;
        spruse3.cfr_renamed_2 = true;
        spruse2.cfr_renamed_3 = arg2;
        spruse2.cfr_renamed_4 = n;
    }

    private /* synthetic */ void cfr_renamed_4796(OutputStream arg0, int arg1) throws IOException {
        if (arg1 > 127) {
            int n;
            int n2;
            int n3 = 1;
            int n4 = n2 = arg1;
            while ((n2 = n4 >>> 8) != 0) {
                n4 = n2;
                ++n3;
            }
            arg0.write((byte)(n3 | 0x80));
            int n5 = n = (n3 - 1) * 8;
            while (n5 >= 0) {
                int n6 = n;
                arg0.write((byte)(arg1 >> n6));
                n5 = n -= 8;
            }
        } else {
            arg0.write((byte)arg1);
        }
    }
}

