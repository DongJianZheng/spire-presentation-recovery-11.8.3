/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpf;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprxm;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;
import java.io.OutputStream;

public class sprjah
extends OutputStream
implements sprxm,
sprpf {
    private static final int cfr_renamed_86 = 16;
    public OutputStream cfr_renamed_152;
    private boolean cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjah(OutputStream outputStream, boolean bl) {
        void arg0;
        sprjah sprjah2 = this;
        sprjah2.cfr_renamed_152 = arg0;
        sprjah2.cfr_renamed_112 = !bl;
    }

    public static sprjah cfr_renamed_7679(OutputStream arg0) {
        if (arg0 instanceof sprjah) {
            return (sprjah)arg0;
        }
        return new sprjah(arg0);
    }

    private /* synthetic */ void cfr_renamed_11088(int arg0, boolean arg1, boolean arg2, long arg3) throws IOException {
        int n = 128;
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_11089(true);
            this.cfr_renamed_4 = null;
        }
        if (arg0 <= 15 && arg1) {
            n |= arg0 << 2;
            if (arg2) {
                this.write(n | 3);
                return;
            }
            if (arg3 <= 255L) {
                sprjah sprjah2 = this;
                sprjah2.write(n);
                sprjah2.write((byte)arg3);
                return;
            }
            sprjah sprjah3 = this;
            if (arg3 <= 65535L) {
                sprjah3.write(n | 1);
                sprjah sprjah4 = this;
                sprjah4.write((byte)(arg3 >> 8));
                sprjah4.write((byte)arg3);
                return;
            }
            sprjah3.write(n | 2);
            sprjah sprjah5 = this;
            long l = arg3;
            this.write((byte)(arg3 >> 24));
            this.write((byte)(l >> 16));
            sprjah5.write((byte)(l >> 8));
            sprjah5.write((byte)arg3);
            return;
        }
        this.write(n |= 0x40 | arg0);
        if (arg2) {
            this.cfr_renamed_0 = 0;
            return;
        }
        this.cfr_renamed_11090(arg3);
    }

    @Override
    public void flush() throws IOException {
        this.cfr_renamed_152.flush();
    }

    /*
     * WARNING - void declaration
     */
    public sprjah(OutputStream outputStream, int n) throws IOException {
        void arg0;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_11088(n, true, true, 0L);
    }

    public void cfr_renamed_7759(sprklk arg0) throws IOException {
        arg0.cfr_renamed_11038(this);
    }

    public sprjah(OutputStream arg0) {
        this(arg0, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprjah(OutputStream outputStream, int n, long l, boolean bl) throws IOException {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        this.cfr_renamed_152 = arg0;
        if (l > 0xFFFFFFFFL) {
            sprjah sprjah2 = this;
            sprjah sprjah3 = this;
            sprjah sprjah4 = this;
            sprjah4.cfr_renamed_11088((int)arg1, false, true, 0L);
            sprjah3.cfr_renamed_91 = 65536;
            sprjah3.cfr_renamed_4 = new byte[sprjah4.cfr_renamed_91];
            sprjah2.cfr_renamed_119 = 16;
            sprjah2.cfr_renamed_0 = 0;
            return;
        }
        this.cfr_renamed_11088((int)arg1, (boolean)arg3, false, (long)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjah(OutputStream outputStream, int n, long l) throws IOException {
        void arg2;
        void arg0;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_11088(n, false, false, (long)arg2);
    }

    private /* synthetic */ void cfr_renamed_11091(byte arg0) throws IOException {
        sprjah sprjah2 = this;
        if (sprjah2.cfr_renamed_0 == sprjah2.cfr_renamed_91) {
            this.cfr_renamed_11089(false);
        }
        this.cfr_renamed_4[this.cfr_renamed_0++] = arg0;
    }

    public void cfr_renamed_3120() throws IOException {
        if (this.cfr_renamed_4 != null) {
            sprjah sprjah2 = this;
            sprjah2.cfr_renamed_11089(true);
            sproze.cfr_renamed_492(sprjah2.cfr_renamed_4, (byte)0);
            sprjah2.cfr_renamed_4 = null;
        }
    }

    public void cfr_renamed_11082(int arg0, byte[] arg1, boolean arg2) throws IOException {
        this.cfr_renamed_11088(arg0, arg2, false, arg1.length);
        this.write(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_11039(int n, byte[] byArray) throws IOException {
        void arg1;
        sprjah sprjah2 = this;
        sprjah2.cfr_renamed_11088(n, sprjah2.cfr_renamed_112, false, ((void)arg1).length);
        this.write((byte[])arg1);
    }

    @Override
    public void close() throws IOException {
        sprjah sprjah2 = this;
        sprjah2.cfr_renamed_3120();
        sprjah2.cfr_renamed_152.flush();
        sprjah2.cfr_renamed_152.close();
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_11092(arg0, arg1, arg2);
            return;
        }
        this.cfr_renamed_152.write(arg0, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_11092(byte[] arg0, int arg1, int arg2) throws IOException {
        sprjah sprjah2 = this;
        if (sprjah2.cfr_renamed_0 == sprjah2.cfr_renamed_91) {
            this.cfr_renamed_11089(false);
        }
        sprjah sprjah3 = this;
        if (arg2 <= sprjah3.cfr_renamed_91 - sprjah3.cfr_renamed_0) {
            sprjah sprjah4 = this;
            System.arraycopy(arg0, arg1, sprjah4.cfr_renamed_4, this.cfr_renamed_0, arg2);
            sprjah4.cfr_renamed_0 += arg2;
            return;
        }
        sprjah sprjah5 = this;
        sprjah sprjah6 = this;
        System.arraycopy(arg0, arg1, sprjah5.cfr_renamed_4, sprjah5.cfr_renamed_0, sprjah6.cfr_renamed_91 - sprjah6.cfr_renamed_0);
        sprjah sprjah7 = this;
        arg1 += sprjah7.cfr_renamed_91 - sprjah7.cfr_renamed_0;
        sprjah sprjah8 = this;
        int n = arg2 = arg2 - (sprjah8.cfr_renamed_91 - sprjah8.cfr_renamed_0);
        this.cfr_renamed_11089(false);
        while (n > this.cfr_renamed_91) {
            int n2 = arg1;
            System.arraycopy(arg0, n2, this.cfr_renamed_4, 0, this.cfr_renamed_91);
            arg1 = n2 + this.cfr_renamed_91;
            sprjah sprjah9 = this;
            sprjah9.cfr_renamed_11089(false);
            n = arg2 -= sprjah9.cfr_renamed_91;
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_4, 0, arg2);
        this.cfr_renamed_0 += arg2;
    }

    private /* synthetic */ void cfr_renamed_11089(boolean arg0) throws IOException {
        sprjah sprjah2;
        if (arg0) {
            sprjah sprjah3 = this;
            sprjah2 = sprjah3;
            sprjah3.cfr_renamed_11090(sprjah3.cfr_renamed_0);
            sprjah3.cfr_renamed_152.write(this.cfr_renamed_4, 0, this.cfr_renamed_0);
        } else {
            sprjah sprjah4 = this;
            sprjah2 = sprjah4;
            sprjah sprjah5 = this;
            sprjah4.cfr_renamed_152.write(0xE0 | sprjah5.cfr_renamed_119);
            sprjah5.cfr_renamed_152.write(this.cfr_renamed_4, 0, this.cfr_renamed_91);
        }
        sprjah2.cfr_renamed_0 = 0;
    }

    @Override
    public void write(int arg0) throws IOException {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_11091((byte)arg0);
            return;
        }
        this.cfr_renamed_152.write(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjah(OutputStream outputStream, int n, byte[] byArray) throws IOException {
        int n2;
        void arg1;
        void arg0;
        sprjah sprjah2 = this;
        this.cfr_renamed_152 = arg0;
        sprjah2.cfr_renamed_11088((int)arg1, false, true, 0L);
        sprjah2.cfr_renamed_4 = byArray;
        int n3 = n2 = sprjah2.cfr_renamed_4.length;
        this.cfr_renamed_119 = 0;
        while (n3 != 1) {
            n3 = n2 >>> 1;
            ++this.cfr_renamed_119;
        }
        if (this.cfr_renamed_119 > 30) {
            throw new IOException(sprrica.cfr_renamed_9("`(D;G/\u0002>C3L2V}@8\u0002:P8C)G/\u0002)J<L}\u0010\u0003\u0011m\u00024L}N8L:V5\f"));
        }
        this.cfr_renamed_91 = 1 << this.cfr_renamed_119;
        this.cfr_renamed_0 = 0;
    }

    public void cfr_renamed_7680(sprzcm arg0) throws IOException {
        arg0.cfr_renamed_11038(this);
    }

    private /* synthetic */ void cfr_renamed_11090(long arg0) throws IOException {
        if (arg0 < 192L) {
            this.cfr_renamed_152.write((byte)arg0);
            return;
        }
        if (arg0 <= 8383L) {
            sprjah sprjah2 = this;
            sprjah2.cfr_renamed_152.write((byte)(((arg0 -= 192L) >> 8 & 0xFFL) + 192L));
            sprjah2.cfr_renamed_152.write((byte)arg0);
            return;
        }
        sprjah sprjah3 = this;
        sprjah3.cfr_renamed_152.write(255);
        sprjah3.cfr_renamed_152.write((byte)(arg0 >> 24));
        sprjah3.cfr_renamed_152.write((byte)(arg0 >> 16));
        sprjah3.cfr_renamed_152.write((byte)(arg0 >> 8));
        sprjah3.cfr_renamed_152.write((byte)arg0);
    }
}

