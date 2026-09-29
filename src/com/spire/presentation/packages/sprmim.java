/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdus;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtg;
import com.spire.presentation.packages.sprvsr;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprmim
extends sprzcm
implements sprtg {
    private byte[][] cfr_renamed_136;
    public static final int cfr_renamed_615 = 6;
    private int cfr_renamed_129;
    private int cfr_renamed_1222;
    private long cfr_renamed_1329;
    public static final int cfr_renamed_1217 = 3;
    private byte[] cfr_renamed_1221;
    private int cfr_renamed_725;

    public long cfr_renamed_7541() {
        return this.cfr_renamed_1329;
    }

    public static sprmim cfr_renamed_7886(long arg0, int arg1, byte[][] arg2) {
        return new sprmim(arg0, arg1, arg2);
    }

    public int cfr_renamed_11067() {
        return this.cfr_renamed_725;
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_1222;
    }

    public byte[] cfr_renamed_11078() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1221);
    }

    /*
     * WARNING - void declaration
     */
    public sprmim(long l, int n, byte[][] byArray) {
        void arg2;
        int n2;
        void arg1;
        void arg0;
        sprmim sprmim2 = this;
        sprmim sprmim3 = this;
        sprmim3.cfr_renamed_129 = 3;
        sprmim3.cfr_renamed_1329 = arg0;
        sprmim2.cfr_renamed_1222 = arg1;
        sprmim2.cfr_renamed_136 = new byte[byArray.length][];
        int n3 = n2 = 0;
        while (n3 != ((void)arg2).length) {
            int n4 = n2++;
            this.cfr_renamed_136[n4] = sproze.cfr_renamed_158((byte[])arg2[n4]);
            n3 = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprmim(int n, byte[] byArray, int n2, byte[][] byArray2) {
        void arg3;
        int n3;
        void arg2;
        void arg1;
        void arg0;
        sprmim sprmim2 = this;
        sprmim sprmim3 = this;
        this.cfr_renamed_129 = 6;
        sprmim3.cfr_renamed_725 = arg0;
        sprmim3.cfr_renamed_1221 = sproze.cfr_renamed_158((byte[])arg1);
        sprmim2.cfr_renamed_1222 = arg2;
        sprmim2.cfr_renamed_136 = new byte[byArray2.length][];
        int n4 = n3 = 0;
        while (n4 < ((void)arg3).length) {
            int n5 = n3++;
            this.cfr_renamed_136[n5] = sproze.cfr_renamed_158((byte[])arg3[n5]);
            n4 = n3;
        }
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        int n;
        sprjah sprjah2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprjah sprjah3 = new sprjah(byteArrayOutputStream);
        sprmim sprmim2 = this;
        sprjah3.write(sprmim2.cfr_renamed_129);
        if (sprmim2.cfr_renamed_129 == 3) {
            sprjah sprjah4 = sprjah3;
            sprjah2 = sprjah4;
            sprmim sprmim3 = this;
            sprjah sprjah5 = sprjah3;
            sprmim sprmim4 = this;
            sprjah sprjah6 = sprjah3;
            sprjah6.write((byte)(this.cfr_renamed_1329 >> 56));
            sprjah6.write((byte)(this.cfr_renamed_1329 >> 48));
            sprjah3.write((byte)(sprmim4.cfr_renamed_1329 >> 40));
            sprjah5.write((byte)(sprmim4.cfr_renamed_1329 >> 32));
            sprjah5.write((byte)(this.cfr_renamed_1329 >> 24));
            sprjah3.write((byte)(sprmim3.cfr_renamed_1329 >> 16));
            sprjah4.write((byte)(sprmim3.cfr_renamed_1329 >> 8));
            sprjah4.write((byte)this.cfr_renamed_1329);
        } else {
            if (this.cfr_renamed_129 == 6) {
                sprjah3.write(this.cfr_renamed_1221.length + 1);
                sprjah sprjah7 = sprjah3;
                sprjah7.write(this.cfr_renamed_725);
                sprjah7.write(this.cfr_renamed_1221);
            }
            sprjah2 = sprjah3;
        }
        sprjah2.write(this.cfr_renamed_1222);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_136.length) {
            sprjah3.write(this.cfr_renamed_136[n++]);
            n2 = n;
        }
        sprjah3.close();
        arg0.cfr_renamed_11039(1, byteArrayOutputStream.toByteArray());
    }

    /*
     * WARNING - void declaration
     */
    public sprmim(sprmam sprmam2) throws IOException {
        void arg0;
        sprmim sprmim2;
        sprmim sprmim3 = this;
        sprmim3.cfr_renamed_129 = sprmam2.read();
        if (sprmim3.cfr_renamed_129 == 3) {
            sprmim sprmim4 = this;
            sprmim2 = sprmim4;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 56;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 48;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 40;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 32;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 24;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 16;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read() << 8;
            sprmim4.cfr_renamed_1329 |= (long)arg0.read();
        } else {
            if (this.cfr_renamed_129 == 6) {
                int n = arg0.read();
                if (n == 0) {
                    sprmim sprmim5 = this;
                    sprmim5.cfr_renamed_725 = 0;
                    sprmim5.cfr_renamed_1221 = new byte[0];
                } else {
                    this.cfr_renamed_725 = arg0.read();
                    this.cfr_renamed_1221 = new byte[n - 1];
                    arg0.cfr_renamed_4932(this.cfr_renamed_1221);
                }
            } else {
                throw new sprwhm(new StringBuilder().insert(0, sprvsr.cfr_renamed_9("0d\u0016\u007f\u0015z\nx\u0011o\u0001*5M5*\u0015\u007f\u0007f\fiEa\u0000sEo\u000bi\u0017s\u0015~\u0000nEy\u0000y\u0016c\ndEa\u0000sEz\u0004i\u000eo\u0011*\u0013o\u0017y\fe\u000b*\u0000d\u0006e\u0010d\u0011o\u0017o\u00010E")).append(this.cfr_renamed_129).toString());
            }
            sprmim2 = this;
        }
        sprmim2.cfr_renamed_1222 = arg0.read();
        switch (this.cfr_renamed_1222) {
            case 1: 
            case 2: {
                while (false) {
                }
                this.cfr_renamed_136 = new byte[1][];
                this.cfr_renamed_136[0] = new sprghm((sprmam)arg0).cfr_renamed_91();
                return;
            }
            case 16: 
            case 20: {
                this.cfr_renamed_136 = new byte[2][];
                sprmim sprmim6 = this;
                sprmim6.cfr_renamed_136[0] = new sprghm((sprmam)arg0).cfr_renamed_91();
                sprmim6.cfr_renamed_136[1] = new sprghm((sprmam)arg0).cfr_renamed_91();
                return;
            }
            case 18: {
                this.cfr_renamed_136 = new byte[1][];
                this.cfr_renamed_136[0] = sprkqe.cfr_renamed_471((InputStream)arg0);
                return;
            }
        }
        throw new IOException(sprdus.cfr_renamed_9(",\u00152\u00156\f7[\t<\t[)\u000e;\u00170\u0018y\u0010<\u0002y\u001a5\u001c6\t0\u000f1\u0016y\u001e7\u00186\u000e7\u000f<\t<\u001f"));
    }

    public static sprmim cfr_renamed_11079(int arg0, byte[] arg1, int arg2, byte[][] arg3) {
        return new sprmim(arg0, arg1, arg2, arg3);
    }

    public byte[][] cfr_renamed_7781() {
        return this.cfr_renamed_136;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_129;
    }
}

