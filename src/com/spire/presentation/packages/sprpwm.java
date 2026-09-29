/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class sprpwm
extends sprcbn {
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpwm(OutputStream outputStream, int n, boolean bl) {
        void arg2;
        void arg0;
        sprpwm sprpwm2 = this;
        sprpwm sprpwm3 = this;
        super((OutputStream)arg0);
        sprpwm3.cfr_renamed_4 = false;
        sprpwm3.cfr_renamed_4 = true;
        sprpwm2.cfr_renamed_3 = arg2;
        sprpwm2.cfr_renamed_2 = n;
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

    public void cfr_renamed_4791(int arg0, byte[] arg1) throws IOException {
        if (this.cfr_renamed_4) {
            sprpwm sprpwm2 = this;
            int n = sprpwm2.cfr_renamed_2 | 0x80;
            if (sprpwm2.cfr_renamed_3) {
                sprpwm sprpwm3 = this;
                int n2 = sprpwm3.cfr_renamed_2 | 0x20 | 0x80;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                sprpwm3.cfr_renamed_4795(byteArrayOutputStream, arg0, arg1);
                sprpwm3.cfr_renamed_4795((OutputStream)sprpwm3.cfr_renamed_4, n2, byteArrayOutputStream.toByteArray());
                return;
            }
            if ((arg0 & 0x20) != 0) {
                sprpwm sprpwm4 = this;
                sprpwm4.cfr_renamed_4795((OutputStream)sprpwm4.cfr_renamed_4, n | 0x20, arg1);
                return;
            }
            sprpwm sprpwm5 = this;
            sprpwm5.cfr_renamed_4795((OutputStream)sprpwm5.cfr_renamed_4, n, arg1);
            return;
        }
        sprpwm sprpwm6 = this;
        sprpwm6.cfr_renamed_4795((OutputStream)sprpwm6.cfr_renamed_4, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprpwm(OutputStream outputStream) {
        super((OutputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = false;
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

