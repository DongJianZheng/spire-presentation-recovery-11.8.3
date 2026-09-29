/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprehm;
import com.spire.presentation.packages.sprfcm;
import com.spire.presentation.packages.sprfgm;
import com.spire.presentation.packages.sprfjm;
import com.spire.presentation.packages.sprgam;
import com.spire.presentation.packages.sprgdm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprrim;
import com.spire.presentation.packages.sprrnl;
import com.spire.presentation.packages.sprryl;
import com.spire.presentation.packages.sprtg;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprwcm;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

public class sprifm
extends sprzcm
implements sprtg {
    private int cfr_renamed_136;
    public static final int cfr_renamed_615 = 6;
    public static final int cfr_renamed_129 = 3;
    public static final int cfr_renamed_1222 = 4;
    private long cfr_renamed_1329;
    private sprar cfr_renamed_1217;
    private int cfr_renamed_1221;
    private int cfr_renamed_725;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11039(6, this.cfr_renamed_7661());
    }

    public int cfr_renamed_7800() {
        return this.cfr_renamed_725;
    }

    /*
     * WARNING - void declaration
     */
    public sprifm(int n, Date date, sprar sprar2) {
        void arg0;
        void arg1;
        sprifm sprifm2 = this;
        sprifm sprifm3 = this;
        sprifm3.cfr_renamed_136 = 4;
        sprifm3.cfr_renamed_1329 = arg1.getTime() / 1000L;
        sprifm2.cfr_renamed_1221 = arg0;
        sprifm2.cfr_renamed_1217 = sprar2;
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_1221;
    }

    public sprar cfr_renamed_1521() {
        return this.cfr_renamed_1217;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_136;
    }

    public Date cfr_renamed_2147() {
        return new Date(this.cfr_renamed_1329 * 1000L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprifm(sprmam sprmam2) throws IOException {
        void arg0;
        this.cfr_renamed_136 = arg0.read();
        this.cfr_renamed_1329 = (long)sprmam2.read() << 24 | (long)(arg0.read() << 16) | (long)(arg0.read() << 8) | (long)arg0.read();
        if (this.cfr_renamed_136 <= 3) {
            this.cfr_renamed_725 = arg0.read() << 8 | arg0.read();
        }
        this.cfr_renamed_1221 = (byte)arg0.read();
        if (this.cfr_renamed_136 == 6) {
            long l = (long)arg0.read() << 24 | (long)arg0.read() << 16 | (long)arg0.read() << 8 | (long)arg0.read();
        }
        switch (this.cfr_renamed_1221) {
            case 1: 
            case 2: 
            case 3: {
                this.cfr_renamed_1217 = new sprwcm((sprmam)arg0);
                return;
            }
            case 17: {
                this.cfr_renamed_1217 = new sprfjm((sprmam)arg0);
                return;
            }
            case 16: 
            case 20: {
                this.cfr_renamed_1217 = new sprehm((sprmam)arg0);
                return;
            }
            case 18: {
                this.cfr_renamed_1217 = new sprvdm((sprmam)arg0);
                return;
            }
            case 19: {
                this.cfr_renamed_1217 = new sprrim((sprmam)arg0);
                return;
            }
            case 22: {
                this.cfr_renamed_1217 = new sprfcm((sprmam)arg0);
                return;
            }
            case 25: {
                this.cfr_renamed_1217 = new sprryl((sprmam)arg0);
                return;
            }
            case 26: {
                this.cfr_renamed_1217 = new sprfgm((sprmam)arg0);
                return;
            }
            case 27: {
                this.cfr_renamed_1217 = new sprgdm((sprmam)arg0);
                return;
            }
            case 28: {
                this.cfr_renamed_1217 = new sprgam((sprmam)arg0);
                return;
            }
        }
        throw new IOException(new StringBuilder().insert(0, sprrnl.cfr_renamed_9("'c9c=z<-\u0002J\u0002-\"x0a;nrf7trl>j=\u007f;y:`rh<n=x<y7\u007f7ih-")).append(this.cfr_renamed_1221).toString());
    }

    public byte[] cfr_renamed_7661() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprjah sprjah2 = new sprjah(byteArrayOutputStream);
        sprifm sprifm2 = this;
        sprjah sprjah3 = sprjah2;
        sprifm sprifm3 = this;
        sprjah2.write(this.cfr_renamed_136);
        sprjah2.write((byte)(sprifm3.cfr_renamed_1329 >> 24));
        sprjah3.write((byte)(sprifm3.cfr_renamed_1329 >> 16));
        sprjah3.write((byte)(this.cfr_renamed_1329 >> 8));
        sprjah2.write((byte)sprifm2.cfr_renamed_1329);
        if (sprifm2.cfr_renamed_136 <= 3) {
            sprjah sprjah4 = sprjah2;
            sprjah4.write((byte)(this.cfr_renamed_725 >> 8));
            sprjah4.write((byte)this.cfr_renamed_725);
        }
        sprjah2.write(this.cfr_renamed_1221);
        if (this.cfr_renamed_136 == 6) {
            int n = this.cfr_renamed_1217.cfr_renamed_91().length;
            sprjah sprjah5 = sprjah2;
            int n2 = n;
            sprjah2.write(n >> 24);
            sprjah2.write(n2 >> 16);
            sprjah5.write(n2 >> 8);
            sprjah5.write(n);
        }
        sprjah2.cfr_renamed_7759((sprklk)((Object)this.cfr_renamed_1217));
        sprjah2.close();
        return byteArrayOutputStream.toByteArray();
    }
}

