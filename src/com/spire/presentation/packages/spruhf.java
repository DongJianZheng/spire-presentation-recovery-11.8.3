/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhze;
import com.spire.presentation.packages.sprxye;

public class spruhf
extends sprxye {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public byte[] cfr_renamed_5410(int arg0) {
        int n;
        int n2;
        byte[] byArray = new byte[arg0];
        short[] sArray = new short[8];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5405() / 8) {
            int n4 = n = 0;
            while (n4 < 8) {
                int n5 = n++;
                sArray[n5] = (short)spruhf.cfr_renamed_5396(this.cfr_renamed_3[8 * n2 + n5] & 0xFFFF, this.cfr_renamed_4.cfr_renamed_5397());
                n4 = n;
            }
            byArray[11 * n2 + 0] = (byte)(sArray[0] & 0xFF);
            byArray[11 * n2 + 1] = (byte)(sArray[0] >>> 8 | (sArray[1] & 0x1F) << 3);
            byArray[11 * n2 + 2] = (byte)(sArray[1] >>> 5 | (sArray[2] & 3) << 6);
            byArray[11 * n2 + 3] = (byte)(sArray[2] >>> 2 & 0xFF);
            byArray[11 * n2 + 4] = (byte)(sArray[2] >>> 10 | (sArray[3] & 0x7F) << 1);
            byArray[11 * n2 + 5] = (byte)(sArray[3] >>> 7 | (sArray[4] & 0xF) << 4);
            byArray[11 * n2 + 6] = (byte)(sArray[4] >>> 4 | (sArray[5] & 1) << 7);
            byArray[11 * n2 + 7] = (byte)(sArray[5] >>> 1 & 0xFF);
            byArray[11 * n2 + 8] = (byte)(sArray[5] >>> 9 | (sArray[6] & 0x3F) << 2);
            byArray[11 * n2 + 9] = (byte)(sArray[6] >>> 6 | (sArray[7] & 7) << 5);
            int n6 = 11 * n2 + 10;
            byArray[n6] = (byte)(sArray[7] >>> 3);
            n3 = ++n2;
        }
        int n7 = n = 0;
        while (n7 < this.cfr_renamed_4.cfr_renamed_5405() - 8 * n2) {
            int n8 = n++;
            sArray[n8] = (short)spruhf.cfr_renamed_5396(this.cfr_renamed_3[8 * n2 + n8] & 0xFFFF, this.cfr_renamed_4.cfr_renamed_5397());
            n7 = n;
        }
        int n9 = n;
        while (n9 < 8) {
            sArray[n++] = 0;
            n9 = n;
        }
        switch (this.cfr_renamed_4.cfr_renamed_5405() & 7) {
            case 4: {
                byArray[11 * n2 + 0] = (byte)(sArray[0] & 0xFF);
                byArray[11 * n2 + 1] = (byte)(sArray[0] >>> 8 | (sArray[1] & 0x1F) << 3);
                byArray[11 * n2 + 2] = (byte)(sArray[1] >>> 5 | (sArray[2] & 3) << 6);
                byArray[11 * n2 + 3] = (byte)(sArray[2] >>> 2 & 0xFF);
                byArray[11 * n2 + 4] = (byte)(sArray[2] >>> 10 | (sArray[3] & 0x7F) << 1);
                byArray[11 * n2 + 5] = (byte)(sArray[3] >>> 7 | (sArray[4] & 0xF) << 4);
                return byArray;
            }
            case 2: {
                byArray[11 * n2 + 0] = (byte)(sArray[0] & 0xFF);
                byArray[11 * n2 + 1] = (byte)(sArray[0] >>> 8 | (sArray[1] & 0x1F) << 3);
                byArray[11 * n2 + 2] = (byte)(sArray[1] >>> 5 | (sArray[2] & 3) << 6);
                return byArray;
            }
        }
        return byArray;
    }

    @Override
    public void cfr_renamed_5420(sprxye arg0) {
        spruhf spruhf2 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf3 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf4 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf5 = new spruhf((sprhze)this.cfr_renamed_4);
        this.cfr_renamed_5407(arg0, spruhf2, spruhf3, spruhf4, spruhf5);
    }

    @Override
    public void cfr_renamed_5421(sprxye arg0) {
        spruhf spruhf2 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf3 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf4 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf5 = new spruhf((sprhze)this.cfr_renamed_4);
        this.cfr_renamed_5423(arg0, spruhf2, spruhf3, spruhf4, spruhf5);
    }

    @Override
    public void cfr_renamed_5409(sprxye arg0) {
        int n = this.cfr_renamed_3.length;
        spruhf spruhf2 = this;
        System.arraycopy(arg0.cfr_renamed_3, 0, spruhf2.cfr_renamed_3, 0, n);
        spruhf2.cfr_renamed_5411();
    }

    @Override
    public void cfr_renamed_5413(byte[] arg0) {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5405() / 8) {
            spruhf spruhf2 = this;
            spruhf2.cfr_renamed_3[8 * n + 0] = (short)((arg0[11 * n + 0] & 0xFF) >>> 0 | ((short)(arg0[11 * n + 1] & 0xFF) & 7) << 8);
            spruhf2.cfr_renamed_3[8 * n + 1] = (short)((arg0[11 * n + 1] & 0xFF) >>> 3 | ((short)(arg0[11 * n + 2] & 0xFF) & 0x3F) << 5);
            spruhf2.cfr_renamed_3[8 * n + 2] = (short)((arg0[11 * n + 2] & 0xFF) >>> 6 | ((short)(arg0[11 * n + 3] & 0xFF) & 0xFF) << 2 | ((short)(arg0[11 * n + 4] & 0xFF) & 1) << 10);
            spruhf2.cfr_renamed_3[8 * n + 3] = (short)((arg0[11 * n + 4] & 0xFF) >>> 1 | ((short)(arg0[11 * n + 5] & 0xFF) & 0xF) << 7);
            spruhf2.cfr_renamed_3[8 * n + 4] = (short)((arg0[11 * n + 5] & 0xFF) >>> 4 | ((short)(arg0[11 * n + 6] & 0xFF) & 0x7F) << 4);
            spruhf2.cfr_renamed_3[8 * n + 5] = (short)((arg0[11 * n + 6] & 0xFF) >>> 7 | ((short)(arg0[11 * n + 7] & 0xFF) & 0xFF) << 1 | ((short)(arg0[11 * n + 8] & 0xFF) & 3) << 9);
            spruhf2.cfr_renamed_3[8 * n + 6] = (short)((arg0[11 * n + 8] & 0xFF) >>> 2 | ((short)(arg0[11 * n + 9] & 0xFF) & 0x1F) << 6);
            int n4 = 8 * n + 7;
            short s = (short)((arg0[11 * n + 9] & 0xFF) >>> 5 | ((short)(arg0[11 * n + 10] & 0xFF) & 0xFF) << 3);
            spruhf2.cfr_renamed_3[n4] = s;
            n3 = ++n;
        }
        switch (this.cfr_renamed_4.cfr_renamed_5405() & 7) {
            case 4: {
                spruhf spruhf3 = this;
                spruhf spruhf4 = spruhf3;
                spruhf3.cfr_renamed_3[8 * n + 0] = (short)((arg0[11 * n + 0] & 0xFF) >>> 0 | ((short)(arg0[11 * n + 1] & 0xFF) & 7) << 8);
                spruhf3.cfr_renamed_3[8 * n + 1] = (short)((arg0[11 * n + 1] & 0xFF) >>> 3 | ((short)(arg0[11 * n + 2] & 0xFF) & 0x3F) << 5);
                spruhf3.cfr_renamed_3[8 * n + 2] = (short)((arg0[11 * n + 2] & 0xFF) >>> 6 | ((short)(arg0[11 * n + 3] & 0xFF) & 0xFF) << 2 | ((short)(arg0[11 * n + 4] & 0xFF) & 1) << 10);
                spruhf3.cfr_renamed_3[8 * n + 3] = (short)((arg0[11 * n + 4] & 0xFF) >>> 1 | ((short)(arg0[11 * n + 5] & 0xFF) & 0xF) << 7);
                break;
            }
            case 2: {
                spruhf spruhf5 = this;
                while (false) {
                }
                spruhf5.cfr_renamed_3[8 * n + 0] = (short)((arg0[11 * n + 0] & 0xFF) >>> 0 | ((short)(arg0[11 * n + 1] & 0xFF) & 7) << 8);
                spruhf5.cfr_renamed_3[8 * n + 1] = (short)((arg0[11 * n + 1] & 0xFF) >>> 3 | ((short)(arg0[11 * n + 2] & 0xFF) & 0x3F) << 5);
            }
            default: {
                spruhf spruhf4 = this;
            }
        }
        spruhf4.cfr_renamed_3[n2 - 1] = 0;
    }

    public spruhf(sprhze arg0) {
        super(arg0);
    }

    @Override
    public void cfr_renamed_5419(sprxye arg0) {
        spruhf spruhf2 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf3 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf4 = new spruhf((sprhze)this.cfr_renamed_4);
        spruhf spruhf5 = new spruhf((sprhze)this.cfr_renamed_4);
        this.cfr_renamed_5424(arg0, spruhf2, spruhf3, spruhf4, spruhf5);
    }
}

