/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprfdm
extends sprzcm {
    private int cfr_renamed_91;
    private long cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        sprjah sprjah2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprjah sprjah3 = sprjah2 = new sprjah(byteArrayOutputStream);
        sprfdm sprfdm2 = this;
        sprjah sprjah4 = sprjah2;
        sprfdm sprfdm3 = this;
        sprjah sprjah5 = sprjah2;
        sprfdm sprfdm4 = this;
        sprjah sprjah6 = sprjah2;
        sprfdm sprfdm5 = this;
        sprjah2.write(this.cfr_renamed_1);
        sprjah2.write(sprfdm5.cfr_renamed_2);
        sprjah6.write(sprfdm5.cfr_renamed_91);
        sprjah6.write(this.cfr_renamed_3);
        sprjah2.write((byte)(sprfdm4.cfr_renamed_0 >> 56));
        sprjah5.write((byte)(sprfdm4.cfr_renamed_0 >> 48));
        sprjah5.write((byte)(this.cfr_renamed_0 >> 40));
        sprjah2.write((byte)(sprfdm3.cfr_renamed_0 >> 32));
        sprjah4.write((byte)(sprfdm3.cfr_renamed_0 >> 24));
        sprjah4.write((byte)(this.cfr_renamed_0 >> 16));
        sprjah2.write((byte)(sprfdm2.cfr_renamed_0 >> 8));
        sprjah3.write((byte)sprfdm2.cfr_renamed_0);
        sprjah3.write(this.cfr_renamed_4);
        sprjah3.close();
        arg0.cfr_renamed_11039(4, byteArrayOutputStream.toByteArray());
    }

    public int cfr_renamed_2373() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_579() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprfdm(int n, int n2, int n3, long l, boolean bl) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfdm sprfdm2 = this;
        sprfdm sprfdm3 = this;
        sprfdm sprfdm4 = this;
        sprfdm4.cfr_renamed_1 = 3;
        sprfdm4.cfr_renamed_2 = arg0;
        sprfdm3.cfr_renamed_91 = arg1;
        sprfdm3.cfr_renamed_3 = arg2;
        sprfdm2.cfr_renamed_0 = arg3;
        sprfdm2.cfr_renamed_4 = bl ? 0 : 1;
    }

    /*
     * WARNING - void declaration
     */
    public sprfdm(sprmam sprmam2) throws IOException {
        void arg0;
        sprfdm sprfdm2 = this;
        sprfdm sprfdm3 = this;
        void v2 = arg0;
        this.cfr_renamed_1 = arg0.read();
        this.cfr_renamed_2 = v2.read();
        this.cfr_renamed_91 = v2.read();
        sprfdm3.cfr_renamed_3 = arg0.read();
        this.cfr_renamed_0 |= (long)arg0.read() << 56;
        sprfdm3.cfr_renamed_0 |= (long)arg0.read() << 48;
        sprfdm3.cfr_renamed_0 |= (long)arg0.read() << 40;
        sprfdm3.cfr_renamed_0 |= (long)arg0.read() << 32;
        sprfdm3.cfr_renamed_0 |= (long)arg0.read() << 24;
        sprfdm3.cfr_renamed_0 |= (long)arg0.read() << 16;
        sprfdm2.cfr_renamed_0 |= (long)arg0.read() << 8;
        sprfdm2.cfr_renamed_0 |= (long)arg0.read();
        sprfdm2.cfr_renamed_4 = sprmam2.read();
    }

    public int cfr_renamed_7576() {
        return this.cfr_renamed_2;
    }

    public long cfr_renamed_7541() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_7826() {
        return this.cfr_renamed_4 == 1;
    }
}

