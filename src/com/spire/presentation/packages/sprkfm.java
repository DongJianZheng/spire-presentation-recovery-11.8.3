/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprpam;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprtg;
import com.spire.presentation.packages.sprwem;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprkfm
extends sprzcm
implements sprtg {
    public static final int cfr_renamed_136 = 253;
    private int cfr_renamed_615;
    public static final int cfr_renamed_129 = 255;
    private sprpik cfr_renamed_1222;
    private sprifm cfr_renamed_1329;
    public static final int cfr_renamed_1217 = 254;
    private int cfr_renamed_1221;
    public static final int cfr_renamed_725 = 0;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_7746() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_7740() {
        return this.cfr_renamed_1221;
    }

    /*
     * WARNING - void declaration
     */
    public sprkfm(sprifm sprifm2, int n, int n2, sprpik sprpik2, byte[] byArray, byte[] byArray2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprkfm sprkfm2 = this;
        sprkfm sprkfm3 = this;
        sprkfm sprkfm4 = this;
        sprkfm4.cfr_renamed_1329 = arg0;
        sprkfm4.cfr_renamed_615 = arg1;
        sprkfm3.cfr_renamed_1221 = arg2;
        sprkfm3.cfr_renamed_1222 = arg3;
        sprkfm2.cfr_renamed_3 = arg4;
        sprkfm2.cfr_renamed_4 = byArray2;
    }

    public byte[] cfr_renamed_7661() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprjah sprjah2 = new sprjah(byteArrayOutputStream);
        sprkfm sprkfm2 = this;
        sprjah2.write(this.cfr_renamed_1329.cfr_renamed_7661());
        sprjah2.write(sprkfm2.cfr_renamed_1221);
        if (sprkfm2.cfr_renamed_1221 == 255 || this.cfr_renamed_1221 == 254) {
            sprjah sprjah3 = sprjah2;
            sprkfm sprkfm3 = this;
            sprjah3.write(sprkfm3.cfr_renamed_615);
            sprjah3.cfr_renamed_7759(sprkfm3.cfr_renamed_1222);
        }
        if (this.cfr_renamed_3 != null) {
            sprjah2.write(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_4 != null && this.cfr_renamed_4.length > 0) {
            sprjah2.write(this.cfr_renamed_4);
        }
        sprjah2.close();
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11039(5, this.cfr_renamed_7661());
    }

    public sprkfm(sprifm arg0, int arg1, sprpik arg2, byte[] arg3, byte[] arg4) {
        sprkfm sprkfm2;
        this.cfr_renamed_1329 = arg0;
        this.cfr_renamed_615 = arg1;
        if (this.cfr_renamed_615 != 0) {
            sprkfm2 = this;
            this.cfr_renamed_1221 = 255;
        } else {
            sprkfm2 = this;
            this.cfr_renamed_1221 = 0;
        }
        sprkfm2.cfr_renamed_1222 = arg2;
        sprkfm sprkfm3 = this;
        sprkfm3.cfr_renamed_3 = arg3;
        sprkfm3.cfr_renamed_4 = arg4;
    }

    public int cfr_renamed_7757() {
        return this.cfr_renamed_615;
    }

    public sprkfm(sprmam arg0) throws IOException {
        sprkfm sprkfm2;
        sprkfm sprkfm3;
        sprkfm sprkfm4 = this;
        if (sprkfm4 instanceof sprwem) {
            sprkfm3 = this;
            this.cfr_renamed_1329 = new sprpam(arg0);
        } else {
            sprkfm3 = this;
            this.cfr_renamed_1329 = new sprifm(arg0);
        }
        sprkfm3.cfr_renamed_1221 = arg0.read();
        if (this.cfr_renamed_1221 == 255 || this.cfr_renamed_1221 == 254) {
            sprkfm2 = this;
            this.cfr_renamed_615 = arg0.read();
            this.cfr_renamed_1222 = new sprpik(arg0);
        } else {
            sprkfm sprkfm5 = this;
            sprkfm2 = sprkfm5;
            sprkfm5.cfr_renamed_615 = sprkfm5.cfr_renamed_1221;
        }
        if ((sprkfm2.cfr_renamed_1222 == null || this.cfr_renamed_1222.cfr_renamed_324() != 101 || this.cfr_renamed_1222.cfr_renamed_9486() != 1) && this.cfr_renamed_1221 != 0) {
            sprmam sprmam2;
            if (this.cfr_renamed_615 < 7) {
                sprmam2 = arg0;
                this.cfr_renamed_3 = new byte[8];
            } else {
                this.cfr_renamed_3 = new byte[16];
                sprmam2 = arg0;
            }
            sprmam2.cfr_renamed_11040(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        }
        this.cfr_renamed_4 = arg0.cfr_renamed_145();
    }

    public sprifm cfr_renamed_7735() {
        return this.cfr_renamed_1329;
    }

    public sprpik cfr_renamed_7738() {
        return this.cfr_renamed_1222;
    }
}

