/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprluf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprxbaa;
import java.security.SecureRandom;

public class sprdcg
extends SecureRandom {
    private byte[] cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_6173(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        try {
            sprael sprael2 = new sprael();
            sprael2.cfr_renamed_5535(true, new sprtpk(arg0));
            for (int i = 0; i != arg1.length; i += 16) {
                int n = i;
                sprael2.cfr_renamed_3064(arg1, n, arg2, arg3 + n);
            }
            return;
        }
        catch (Throwable throwable) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprxbaa.cfr_renamed_9("\u00073\u0001&C'\u0002(\u000f4\u0011$Ya")).append(throwable.getMessage()).toString(), throwable);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprdcg(byte[] byArray, sprgf sprgf2) {
        void arg1;
        void arg0;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_3446(256);
    }

    @Override
    public void nextBytes(byte[] arg0) {
        int n;
        byte[] byArray = new byte[16];
        int n2 = 0;
        int n3 = n = arg0.length;
        while (n3 > 0) {
            sprdcg sprdcg2;
            block4: {
                int n4;
                int n5 = n4 = 15;
                while (n5 >= 0) {
                    if ((this.cfr_renamed_4[n4] & 0xFF) != 255) {
                        sprdcg sprdcg3 = this;
                        sprdcg2 = sprdcg3;
                        int n6 = n4;
                        sprdcg3.cfr_renamed_4[n6] = (byte)(sprdcg3.cfr_renamed_4[n6] + 1);
                        break block4;
                    }
                    this.cfr_renamed_4[n4] = 0;
                    n5 = --n4;
                }
                sprdcg2 = this;
            }
            sprdcg sprdcg4 = this;
            sprdcg2.cfr_renamed_6173(sprdcg4.cfr_renamed_3, sprdcg4.cfr_renamed_4, byArray, 0);
            if (n > 15) {
                int n7 = n2;
                n2 += 16;
                System.arraycopy(byArray, 0, arg0, n7, byArray.length);
                n3 = n -= 16;
                continue;
            }
            System.arraycopy(byArray, 0, arg0, n2, n);
            n3 = n = 0;
        }
        sprdcg sprdcg5 = this;
        this.cfr_renamed_6174(null, sprdcg5.cfr_renamed_3, sprdcg5.cfr_renamed_4);
    }

    private /* synthetic */ void cfr_renamed_3446(int arg0) {
        if (this.cfr_renamed_1.length >= 48) {
            sprdcg sprdcg2 = this;
            sprdcg2.cfr_renamed_6175(sprdcg2.cfr_renamed_1, arg0);
            return;
        }
        sprdcg sprdcg3 = this;
        byte[] byArray = sprluf.cfr_renamed_6126(sprdcg3.cfr_renamed_2, sprdcg3.cfr_renamed_1, 48 - this.cfr_renamed_1.length);
        sprdcg sprdcg4 = this;
        sprdcg4.cfr_renamed_6175(sproze.cfr_renamed_543(sprdcg4.cfr_renamed_1, byArray), arg0);
    }

    private /* synthetic */ void cfr_renamed_6174(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        byte[] byArray = new byte[48];
        int n2 = n = 0;
        while (n2 < 3) {
            sprdcg sprdcg2;
            block5: {
                int n3;
                int n4 = n3 = 15;
                while (n4 >= 0) {
                    if ((arg2[n3] & 0xFF) != 255) {
                        int n5 = n3;
                        arg2[n5] = (byte)(arg2[n5] + 1);
                        sprdcg2 = this;
                        break block5;
                    }
                    arg2[n3] = 0;
                    n4 = --n3;
                }
                sprdcg2 = this;
            }
            sprdcg2.cfr_renamed_6173(arg1, arg2, byArray, 16 * n++);
            n2 = n;
        }
        if (arg0 != null) {
            int n6 = n = 0;
            while (n6 < 48) {
                int n7 = n;
                byte by = (byte)(byArray[n7] ^ arg0[n]);
                byArray[n7] = by;
                n6 = ++n;
            }
        }
        System.arraycopy(byArray, 0, arg1, 0, arg1.length);
        System.arraycopy(byArray, 32, arg2, 0, arg2.length);
    }

    private /* synthetic */ void cfr_renamed_6175(byte[] arg0, int arg1) {
        byte[] byArray = new byte[48];
        System.arraycopy(arg0, 0, byArray, 0, byArray.length);
        sprdcg sprdcg2 = this;
        this.cfr_renamed_3 = new byte[32];
        sprdcg2.cfr_renamed_4 = new byte[16];
        sprdcg2.cfr_renamed_6174(byArray, sprdcg2.cfr_renamed_3, this.cfr_renamed_4);
    }
}

