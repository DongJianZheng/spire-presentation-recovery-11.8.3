/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazaa;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprddf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprkaf;
import com.spire.presentation.packages.sprosc;
import com.spire.presentation.packages.sprqwe;
import com.spire.presentation.packages.sprrdf;
import com.spire.presentation.packages.sprwye;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprhxe
implements sprgm {
    public int cfr_renamed_91;
    public sprkaf cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private sprrdf cfr_renamed_2;
    private static final int cfr_renamed_3 = 65536;
    private short[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        int n;
        int n2;
        short[] sArray = new short[arg1.length];
        int n3 = n2 = 0;
        while (n3 < arg1.length) {
            short s = arg1[n2];
            s = (short)(s & 0xFF);
            sArray[n2++] = s;
            n3 = n2;
        }
        sprhxe sprhxe2 = this;
        short[] sArray2 = sprhxe2.cfr_renamed_1289(arg0);
        short[] sArray3 = sprhxe2.cfr_renamed_1294(sArray);
        boolean bl = true;
        if (sArray2.length != sArray3.length) {
            return false;
        }
        int n4 = n = 0;
        while (n4 < sArray2.length) {
            bl = bl && sArray2[n] == sArray3[n];
            n4 = ++n;
        }
        return bl;
    }

    private /* synthetic */ short[] cfr_renamed_5534(sprbye[] arg0, short[] arg1) {
        int n;
        short[] sArray = new short[arg1.length];
        sprhxe sprhxe2 = this;
        sArray = sprhxe2.cfr_renamed_2.cfr_renamed_1286(((sprwye)sprhxe2.cfr_renamed_0).cfr_renamed_1136(), arg1);
        sprhxe sprhxe3 = this;
        short[] sArray2 = sprhxe3.cfr_renamed_2.cfr_renamed_1278(((sprwye)sprhxe3.cfr_renamed_0).cfr_renamed_1135(), sArray);
        int n2 = n = 0;
        while (n2 < arg0[0].cfr_renamed_1139()) {
            sprhxe sprhxe4 = this;
            this.cfr_renamed_4[n] = (short)sprhxe4.cfr_renamed_1.nextInt();
            int n3 = n++;
            sprhxe4.cfr_renamed_4[n3] = (short)(this.cfr_renamed_4[n3] & 0xFF);
            n2 = n;
        }
        return sArray2;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprhxe sprhxe2;
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprhxe sprhxe3 = this;
                sprhxe3.cfr_renamed_1 = sprbgk2.cfr_renamed_1295();
                sprhxe3.cfr_renamed_0 = (sprwye)sprbgk2.cfr_renamed_284();
                sprhxe2 = this;
            } else {
                this.cfr_renamed_1 = sprybl.cfr_renamed_2794();
                this.cfr_renamed_0 = (sprwye)arg1;
                sprhxe2 = this;
            }
        } else {
            this.cfr_renamed_0 = (sprddf)arg1;
            sprhxe2 = this;
        }
        sprhxe2.cfr_renamed_91 = this.cfr_renamed_0.cfr_renamed_1130();
    }

    private /* synthetic */ short[] cfr_renamed_1289(byte[] arg0) {
        short[] sArray = new short[this.cfr_renamed_91];
        int n = 0;
        int n2 = 0;
        do {
            if (n2 >= arg0.length) {
                return sArray;
            }
            short[] sArray2 = sArray;
            int n3 = n2++;
            sArray[n3] = arg0[n];
            ++n;
            sArray2[n3] = (short)(sArray2[n3] & 0xFF);
        } while (n2 < sArray.length);
        return sArray;
    }

    private /* synthetic */ short[] cfr_renamed_1294(short[] arg0) {
        int n;
        short[][] sArray = ((sprddf)this.cfr_renamed_0).cfr_renamed_1132();
        short[][] sArray2 = ((sprddf)this.cfr_renamed_0).cfr_renamed_1131();
        short[] sArray3 = ((sprddf)this.cfr_renamed_0).cfr_renamed_1133();
        short[] sArray4 = new short[sArray.length];
        int n2 = sArray2[0].length;
        int n3 = 0;
        short s = 0;
        int n4 = n = 0;
        while (n4 < sArray.length) {
            int n5;
            n3 = 0;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n5;
                while (n7 < n2) {
                    int n8;
                    s = sprqwe.cfr_renamed_1275(sArray[n][n3], sprqwe.cfr_renamed_1275(arg0[n5], arg0[n8]));
                    ++n3;
                    sArray4[n] = sprqwe.cfr_renamed_1274(sArray4[n], s);
                    n7 = ++n8;
                }
                s = sprqwe.cfr_renamed_1275(sArray2[n][n5], arg0[n5]);
                sArray4[n] = sprqwe.cfr_renamed_1274(sArray4[n], s);
                n6 = ++n5;
            }
            int n9 = n;
            short s2 = sprqwe.cfr_renamed_1274(sArray4[n], sArray3[n9]);
            sArray4[n9] = s2;
            n4 = ++n;
        }
        return sArray4;
    }

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        boolean bl;
        sprbye[] sprbyeArray = ((sprwye)this.cfr_renamed_0).cfr_renamed_1134();
        int n = sprbyeArray.length;
        this.cfr_renamed_4 = new short[((sprwye)this.cfr_renamed_0).cfr_renamed_1137().length];
        byte[] byArray = new byte[sprbyeArray[n - 1].cfr_renamed_1290()];
        short[] sArray = this.cfr_renamed_1289(arg0);
        int n2 = 0;
        do {
            bl = true;
            int n3 = 0;
            try {
                int n4;
                short[] sArray2 = this.cfr_renamed_5534(sprbyeArray, sArray);
                int n5 = n4 = 0;
                while (n5 < n) {
                    int n6;
                    short[] sArray3 = new short[sprbyeArray[n4].cfr_renamed_1292()];
                    short[] sArray4 = new short[sprbyeArray[n4].cfr_renamed_1292()];
                    int n7 = n6 = 0;
                    while (n7 < sprbyeArray[n4].cfr_renamed_1292()) {
                        short s = sArray2[n3];
                        ++n3;
                        sArray3[n6] = s;
                        n7 = ++n6;
                    }
                    sArray4 = this.cfr_renamed_2.cfr_renamed_1281(sprbyeArray[n4].cfr_renamed_1293(this.cfr_renamed_4), sArray3);
                    if (sArray4 == null) {
                        throw new Exception(sprosc.cfr_renamed_9("f&yCC\u0010\n\rE\u0017\n\u0010E\u000f\\\u0006K\u0001F\u0006\u000b"));
                    }
                    int n8 = n6 = 0;
                    while (n8 < sArray4.length) {
                        int n9 = sprbyeArray[n4].cfr_renamed_1139() + n6;
                        short s = sArray4[n6];
                        this.cfr_renamed_4[n9] = s;
                        n8 = ++n6;
                    }
                    n5 = ++n4;
                }
                sprhxe sprhxe2 = this;
                short[] sArray5 = sprhxe2.cfr_renamed_2.cfr_renamed_1286(((sprwye)sprhxe2.cfr_renamed_0).cfr_renamed_1138(), this.cfr_renamed_4);
                sprhxe sprhxe3 = this;
                short[] sArray6 = sprhxe3.cfr_renamed_2.cfr_renamed_1278(((sprwye)sprhxe3.cfr_renamed_0).cfr_renamed_1137(), sArray5);
                n4 = 0;
                while (n4 < byArray.length) {
                    int n10 = n4++;
                    byArray[n10] = (byte)sArray6[n10];
                }
            }
            catch (Exception exception) {
                bl = false;
            }
        } while (!bl && ++n2 < 65536);
        if (n2 == 65536) {
            throw new IllegalStateException(sprazaa.cfr_renamed_9("'=31>6r'=s56<6 2&6r ;4<2&& 6r~r\u001f\u0017\u0000r=='r =?$20?7"));
        }
        return byArray;
    }

    public sprhxe() {
        sprhxe sprhxe2 = this;
        sprhxe2.cfr_renamed_2 = new sprrdf();
    }
}

