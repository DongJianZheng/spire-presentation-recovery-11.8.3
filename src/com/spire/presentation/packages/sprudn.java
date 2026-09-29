/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprkn;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprumn;
import java.io.IOException;
import java.io.InputStream;

public class sprudn
extends InputStream {
    private boolean cfr_renamed_91;
    private final boolean cfr_renamed_0;
    private InputStream cfr_renamed_1;
    private final sprden cfr_renamed_2;
    private sprkn cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprudn(sprden sprden2, boolean bl) {
        void arg0;
        sprudn sprudn2 = this;
        sprudn sprudn3 = this;
        sprudn3.cfr_renamed_91 = true;
        sprudn3.cfr_renamed_4 = 0;
        sprudn2.cfr_renamed_2 = arg0;
        sprudn2.cfr_renamed_0 = bl;
    }

    public int cfr_renamed_106() {
        return this.cfr_renamed_4;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_1 == null) {
            if (!this.cfr_renamed_91) {
                return -1;
            }
            sprudn sprudn2 = this;
            sprudn2.cfr_renamed_3 = sprudn2.cfr_renamed_11323();
            if (sprudn2.cfr_renamed_3 == null) {
                return -1;
            }
            this.cfr_renamed_91 = false;
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_3231();
        }
        int n = 0;
        while (true) {
            int n2;
            if ((n2 = this.cfr_renamed_1.read(arg0, arg1 + n, arg2 - n)) >= 0) {
                if ((n += n2) != arg2) continue;
                return n;
            }
            sprudn sprudn3 = this;
            sprudn3.cfr_renamed_4 = sprudn3.cfr_renamed_3.cfr_renamed_106();
            sprudn3.cfr_renamed_3 = sprudn3.cfr_renamed_11323();
            if (sprudn3.cfr_renamed_3 == null) {
                this.cfr_renamed_1 = null;
                if (n < 1) {
                    return -1;
                }
                return n;
            }
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_3231();
        }
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_1 == null) {
            if (!this.cfr_renamed_91) {
                return -1;
            }
            sprudn sprudn2 = this;
            sprudn2.cfr_renamed_3 = sprudn2.cfr_renamed_11323();
            if (sprudn2.cfr_renamed_3 == null) {
                return -1;
            }
            this.cfr_renamed_91 = false;
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_3231();
        }
        sprudn sprudn3 = this;
        int n;
        while ((n = sprudn3.cfr_renamed_1.read()) < 0) {
            sprudn sprudn4 = this;
            sprudn4.cfr_renamed_4 = sprudn4.cfr_renamed_3.cfr_renamed_106();
            sprudn4.cfr_renamed_3 = sprudn4.cfr_renamed_11323();
            if (sprudn4.cfr_renamed_3 == null) {
                this.cfr_renamed_1 = null;
                return -1;
            }
            sprudn sprudn5 = this;
            sprudn3 = sprudn5;
            sprudn5.cfr_renamed_1 = sprudn5.cfr_renamed_3.cfr_renamed_3231();
        }
        return n;
    }

    private /* synthetic */ sprkn cfr_renamed_11323() throws IOException {
        sprco sprco2 = this.cfr_renamed_2.cfr_renamed_24();
        if (sprco2 == null) {
            if (this.cfr_renamed_0 && this.cfr_renamed_4 != 0) {
                throw new IOException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("\u0000M\u0015P\u0006A\u0000QEZ\u0006A\u0000AHT\t\\\u0002[\u0000QEW\fA\u0016A\u0017\\\u000bRI\u0015\u0007@\u0011\u0015\u0003Z\u0010[\u0001\u0015\u0015T\u0001w\fA\u0016\u000fE")).append(this.cfr_renamed_4).toString());
            }
            return null;
        }
        if (sprco2 instanceof sprkn) {
            if (this.cfr_renamed_4 != 0) {
                throw new IOException(sprumn.cfr_renamed_9("hmkz'wof'ofps#iftwbg'anwtwujid'`fm'kfub#wbcgnm`"));
            }
            return (sprkn)sprco2;
        }
        throw new IOException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("@\u000b^\u000bZ\u0012[EZ\u0007_\u0000V\u0011\u0015\u0000[\u0006Z\u0010[\u0011P\u0017P\u0001\u000fE")).append(sprco2.getClass()).toString());
    }
}

