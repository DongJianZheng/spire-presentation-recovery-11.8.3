/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkbf;
import com.spire.presentation.packages.sprxye;

public class sprqze
extends sprxye {
    @Override
    public void cfr_renamed_5413(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_5405() / 8) {
            sprqze sprqze2 = this;
            sprqze2.cfr_renamed_3[8 * n + 0] = (short)(arg0[13 * n + 0] & 0xFF | ((short)(arg0[13 * n + 1] & 0xFF) & 0x1F) << 8);
            sprqze2.cfr_renamed_3[8 * n + 1] = (short)((arg0[13 * n + 1] & 0xFF) >>> 5 | (short)(arg0[13 * n + 2] & 0xFF) << 3 | ((short)(arg0[13 * n + 3] & 0xFF) & 3) << 11);
            sprqze2.cfr_renamed_3[8 * n + 2] = (short)((arg0[13 * n + 3] & 0xFF) >>> 2 | ((short)(arg0[13 * n + 4] & 0xFF) & 0x7F) << 6);
            sprqze2.cfr_renamed_3[8 * n + 3] = (short)((arg0[13 * n + 4] & 0xFF) >>> 7 | (short)(arg0[13 * n + 5] & 0xFF) << 1 | ((short)(arg0[13 * n + 6] & 0xFF) & 0xF) << 9);
            sprqze2.cfr_renamed_3[8 * n + 4] = (short)((arg0[13 * n + 6] & 0xFF) >>> 4 | (short)(arg0[13 * n + 7] & 0xFF) << 4 | ((short)(arg0[13 * n + 8] & 0xFF) & 1) << 12);
            sprqze2.cfr_renamed_3[8 * n + 5] = (short)((arg0[13 * n + 8] & 0xFF) >>> 1 | ((short)(arg0[13 * n + 9] & 0xFF) & 0x3F) << 7);
            sprqze2.cfr_renamed_3[8 * n + 6] = (short)((arg0[13 * n + 9] & 0xFF) >>> 6 | (short)(arg0[13 * n + 10] & 0xFF) << 2 | ((short)(arg0[13 * n + 11] & 0xFF) & 7) << 10);
            int n3 = 8 * n + 7;
            short s = (short)((arg0[13 * n + 11] & 0xFF) >>> 3 | (short)(arg0[13 * n + 12] & 0xFF) << 5);
            sprqze2.cfr_renamed_3[n3] = s;
            n2 = ++n;
        }
        switch (this.cfr_renamed_4.cfr_renamed_5405() & 7) {
            case 4: {
                sprqze sprqze3 = this;
                sprqze sprqze4 = sprqze3;
                sprqze3.cfr_renamed_3[8 * n + 0] = (short)(arg0[13 * n + 0] & 0xFF | ((short)(arg0[13 * n + 1] & 0xFF) & 0x1F) << 8);
                sprqze3.cfr_renamed_3[8 * n + 1] = (short)((arg0[13 * n + 1] & 0xFF) >>> 5 | (short)(arg0[13 * n + 2] & 0xFF) << 3 | ((short)(arg0[13 * n + 3] & 0xFF) & 3) << 11);
                sprqze3.cfr_renamed_3[8 * n + 2] = (short)((arg0[13 * n + 3] & 0xFF) >>> 2 | ((short)(arg0[13 * n + 4] & 0xFF) & 0x7F) << 6);
                sprqze3.cfr_renamed_3[8 * n + 3] = (short)((arg0[13 * n + 4] & 0xFF) >>> 7 | (short)(arg0[13 * n + 5] & 0xFF) << 1 | ((short)(arg0[13 * n + 6] & 0xFF) & 0xF) << 9);
                break;
            }
            case 2: {
                sprqze sprqze5 = this;
                while (false) {
                }
                sprqze5.cfr_renamed_3[8 * n + 0] = (short)(arg0[13 * n + 0] & 0xFF | ((short)(arg0[13 * n + 1] & 0xFF) & 0x1F) << 8);
                sprqze5.cfr_renamed_3[8 * n + 1] = (short)((arg0[13 * n + 1] & 0xFF) >>> 5 | (short)(arg0[13 * n + 2] & 0xFF) << 3 | ((short)(arg0[13 * n + 3] & 0xFF) & 3) << 11);
            }
            default: {
                sprqze sprqze4 = this;
            }
        }
        sprqze4.cfr_renamed_3[this.cfr_renamed_4.cfr_renamed_5403() - 1] = 0;
    }

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
                sArray[n5] = (short)sprqze.cfr_renamed_5396(this.cfr_renamed_3[8 * n2 + n5] & 0xFFFF, this.cfr_renamed_4.cfr_renamed_5397());
                n4 = n;
            }
            byArray[13 * n2 + 0] = (byte)(sArray[0] & 0xFF);
            byArray[13 * n2 + 1] = (byte)(sArray[0] >>> 8 | (sArray[1] & 7) << 5);
            byArray[13 * n2 + 2] = (byte)(sArray[1] >>> 3 & 0xFF);
            byArray[13 * n2 + 3] = (byte)(sArray[1] >>> 11 | (sArray[2] & 0x3F) << 2);
            byArray[13 * n2 + 4] = (byte)(sArray[2] >>> 6 | (sArray[3] & 1) << 7);
            byArray[13 * n2 + 5] = (byte)(sArray[3] >>> 1 & 0xFF);
            byArray[13 * n2 + 6] = (byte)(sArray[3] >>> 9 | (sArray[4] & 0xF) << 4);
            byArray[13 * n2 + 7] = (byte)(sArray[4] >>> 4 & 0xFF);
            byArray[13 * n2 + 8] = (byte)(sArray[4] >>> 12 | (sArray[5] & 0x7F) << 1);
            byArray[13 * n2 + 9] = (byte)(sArray[5] >>> 7 | (sArray[6] & 3) << 6);
            byArray[13 * n2 + 10] = (byte)(sArray[6] >>> 2 & 0xFF);
            byArray[13 * n2 + 11] = (byte)(sArray[6] >>> 10 | (sArray[7] & 0x1F) << 3);
            int n6 = 13 * n2 + 12;
            byArray[n6] = (byte)(sArray[7] >>> 5);
            n3 = ++n2;
        }
        int n7 = n = 0;
        while (n7 < this.cfr_renamed_4.cfr_renamed_5405() - 8 * n2) {
            int n8 = n++;
            sArray[n8] = (short)sprqze.cfr_renamed_5396(this.cfr_renamed_3[8 * n2 + n8] & 0xFFFF, this.cfr_renamed_4.cfr_renamed_5397());
            n7 = n;
        }
        int n9 = n;
        while (n9 < 8) {
            sArray[n++] = 0;
            n9 = n;
        }
        switch (this.cfr_renamed_4.cfr_renamed_5405() - 8 * (this.cfr_renamed_4.cfr_renamed_5405() / 8)) {
            case 4: {
                byArray[13 * n2 + 0] = (byte)(sArray[0] & 0xFF);
                byArray[13 * n2 + 1] = (byte)(sArray[0] >>> 8 | (sArray[1] & 7) << 5);
                byArray[13 * n2 + 2] = (byte)(sArray[1] >>> 3 & 0xFF);
                byArray[13 * n2 + 3] = (byte)(sArray[1] >>> 11 | (sArray[2] & 0x3F) << 2);
                byArray[13 * n2 + 4] = (byte)(sArray[2] >>> 6 | (sArray[3] & 1) << 7);
                byArray[13 * n2 + 5] = (byte)(sArray[3] >>> 1 & 0xFF);
                byArray[13 * n2 + 6] = (byte)(sArray[3] >>> 9 | (sArray[4] & 0xF) << 4);
            }
            case 2: {
                byArray[13 * n2 + 0] = (byte)(sArray[0] & 0xFF);
                byArray[13 * n2 + 1] = (byte)(sArray[0] >>> 8 | (sArray[1] & 7) << 5);
                byArray[13 * n2 + 2] = (byte)(sArray[1] >>> 3 & 0xFF);
                byArray[13 * n2 + 3] = (byte)(sArray[1] >>> 11 | (sArray[2] & 0x3F) << 2);
                return byArray;
            }
        }
        return byArray;
    }

    @Override
    public void cfr_renamed_5420(sprxye arg0) {
        sprqze sprqze2 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze3 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze4 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze5 = new sprqze((sprkbf)this.cfr_renamed_4);
        this.cfr_renamed_5407(arg0, sprqze2, sprqze3, sprqze4, sprqze5);
    }

    public sprqze(sprkbf arg0) {
        super(arg0);
    }

    @Override
    public void cfr_renamed_5421(sprxye arg0) {
        sprqze sprqze2 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze3 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze4 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze5 = new sprqze((sprkbf)this.cfr_renamed_4);
        this.cfr_renamed_5423(arg0, sprqze2, sprqze3, sprqze4, sprqze5);
    }

    @Override
    public void cfr_renamed_5419(sprxye arg0) {
        sprqze sprqze2 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze3 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze4 = new sprqze((sprkbf)this.cfr_renamed_4);
        sprqze sprqze5 = new sprqze((sprkbf)this.cfr_renamed_4);
        this.cfr_renamed_5424(arg0, sprqze2, sprqze3, sprqze4, sprqze5);
    }

    @Override
    public void cfr_renamed_5409(sprxye arg0) {
        int n;
        int n2 = this.cfr_renamed_3.length;
        sprqze sprqze2 = new sprqze((sprkbf)this.cfr_renamed_4);
        short s = (short)(3 - n2 % 3);
        sprqze sprqze3 = sprqze2;
        sprqze3.cfr_renamed_3[0] = (short)(arg0.cfr_renamed_3[0] * (2 - s) + arg0.cfr_renamed_3[1] * 0 + arg0.cfr_renamed_3[2] * s);
        sprqze3.cfr_renamed_3[1] = (short)(arg0.cfr_renamed_3[1] * (2 - s) + arg0.cfr_renamed_3[2] * 0);
        sprqze3.cfr_renamed_3[2] = (short)(arg0.cfr_renamed_3[2] * (2 - s));
        short s2 = 0;
        int n3 = n = 3;
        while (n3 < n2) {
            sprqze sprqze4 = sprqze2;
            sprqze4.cfr_renamed_3[0] = (short)(sprqze4.cfr_renamed_3[0] + arg0.cfr_renamed_3[n] * (s2 + 2 * s));
            sprqze4.cfr_renamed_3[1] = (short)(sprqze4.cfr_renamed_3[1] + arg0.cfr_renamed_3[n] * (s2 + s));
            sprqze4.cfr_renamed_3[2] = (short)(sprqze4.cfr_renamed_3[2] + arg0.cfr_renamed_3[n] * s2);
            s2 = (short)((s2 + s) % 3);
            n3 = ++n;
        }
        sprqze sprqze5 = sprqze2;
        sprqze5.cfr_renamed_3[1] = (short)(sprqze5.cfr_renamed_3[1] + arg0.cfr_renamed_3[0] * (s2 + s));
        sprqze5.cfr_renamed_3[2] = (short)(sprqze5.cfr_renamed_3[2] + arg0.cfr_renamed_3[0] * s2);
        sprqze5.cfr_renamed_3[2] = (short)(sprqze5.cfr_renamed_3[2] + arg0.cfr_renamed_3[1] * (s2 + s));
        int n4 = n = 3;
        while (n4 < n2) {
            sprqze sprqze6 = sprqze2;
            int n5 = n;
            short s3 = (short)(sprqze6.cfr_renamed_3[n5 - 3] + 2 * (arg0.cfr_renamed_3[n] + arg0.cfr_renamed_3[n - 1] + arg0.cfr_renamed_3[n - 2]));
            sprqze6.cfr_renamed_3[n5] = s3;
            n4 = ++n;
        }
        sprqze sprqze7 = sprqze2;
        sprqze7.cfr_renamed_5399();
        sprqze7.cfr_renamed_5411();
        this.cfr_renamed_3[0] = -sprqze2.cfr_renamed_3[0];
        int n6 = n = 0;
        while (n6 < n2 - 1) {
            int n7 = n + 1;
            short s4 = (short)(sprqze2.cfr_renamed_3[n] - sprqze2.cfr_renamed_3[n + 1]);
            this.cfr_renamed_3[n7] = s4;
            n6 = ++n;
        }
    }
}

