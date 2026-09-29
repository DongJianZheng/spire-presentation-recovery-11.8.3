/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprafb;
import com.spire.presentation.packages.sprddb;
import com.spire.presentation.packages.sprhfb;
import com.spire.presentation.packages.sprjya;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprteb;
import com.spire.presentation.packages.spru;
import com.spire.presentation.packages.sprxcja;
import com.spire.presentation.packages.sprygb;
import java.security.SecureRandom;

public class sprvbb
implements spru {
    public sprafb cfr_renamed_0;
    private short[] cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprteb cfr_renamed_3;
    public int cfr_renamed_4;

    private /* synthetic */ short[] cfr_renamed_1289(byte[] arg0) {
        short[] sArray = new short[this.cfr_renamed_4];
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

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        boolean bl;
        sprjya[] sprjyaArray = ((sprygb)this.cfr_renamed_0).cfr_renamed_1134();
        int n = sprjyaArray.length;
        this.cfr_renamed_1 = new short[((sprygb)this.cfr_renamed_0).cfr_renamed_1137().length];
        byte[] byArray = new byte[sprjyaArray[n - 1].cfr_renamed_1290()];
        short[] sArray = this.cfr_renamed_1289(arg0);
        do {
            bl = true;
            int n2 = 0;
            try {
                int n3;
                short[] sArray2 = this.cfr_renamed_1291(sprjyaArray, sArray);
                int n4 = n3 = 0;
                while (n4 < n) {
                    int n5;
                    short[] sArray3 = new short[sprjyaArray[n3].cfr_renamed_1292()];
                    short[] sArray4 = new short[sprjyaArray[n3].cfr_renamed_1292()];
                    int n6 = n5 = 0;
                    while (n6 < sprjyaArray[n3].cfr_renamed_1292()) {
                        short s = sArray2[n2];
                        ++n2;
                        sArray3[n5] = s;
                        n6 = ++n5;
                    }
                    sArray4 = this.cfr_renamed_3.cfr_renamed_1281(sprjyaArray[n3].cfr_renamed_1293(this.cfr_renamed_1), sArray3);
                    if (sArray4 == null) {
                        throw new Exception(sprxcja.cfr_renamed_9("\u0006D\u0019!#rjo%ujr%m<d+c&dk"));
                    }
                    int n7 = n5 = 0;
                    while (n7 < sArray4.length) {
                        int n8 = sprjyaArray[n3].cfr_renamed_1139() + n5;
                        short s = sArray4[n5];
                        this.cfr_renamed_1[n8] = s;
                        n7 = ++n5;
                    }
                    n4 = ++n3;
                }
                sprvbb sprvbb2 = this;
                short[] sArray5 = sprvbb2.cfr_renamed_3.cfr_renamed_1286(((sprygb)sprvbb2.cfr_renamed_0).cfr_renamed_1138(), this.cfr_renamed_1);
                sprvbb sprvbb3 = this;
                short[] sArray6 = sprvbb3.cfr_renamed_3.cfr_renamed_1278(((sprygb)sprvbb3.cfr_renamed_0).cfr_renamed_1137(), sArray5);
                n3 = 0;
                while (n3 < byArray.length) {
                    int n9 = n3++;
                    byArray[n9] = (byte)sArray6[n9];
                }
            }
            catch (Exception exception) {
                bl = false;
            }
        } while (!bl);
        return byArray;
    }

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
        sprvbb sprvbb2 = this;
        short[] sArray2 = sprvbb2.cfr_renamed_1289(arg0);
        short[] sArray3 = sprvbb2.cfr_renamed_1294(sArray);
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

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprvbb sprvbb2;
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprvbb sprvbb3 = this;
                sprvbb3.cfr_renamed_2 = spraed2.cfr_renamed_1295();
                sprvbb3.cfr_renamed_0 = (sprygb)spraed2.cfr_renamed_284();
                sprvbb2 = this;
            } else {
                this.cfr_renamed_2 = new SecureRandom();
                this.cfr_renamed_0 = (sprygb)arg1;
                sprvbb2 = this;
            }
        } else {
            this.cfr_renamed_0 = (sprhfb)arg1;
            sprvbb2 = this;
        }
        sprvbb2.cfr_renamed_4 = this.cfr_renamed_0.cfr_renamed_1130();
    }

    private /* synthetic */ short[] cfr_renamed_1291(sprjya[] arg0, short[] arg1) {
        int n;
        short[] sArray = new short[arg1.length];
        sprvbb sprvbb2 = this;
        sArray = sprvbb2.cfr_renamed_3.cfr_renamed_1286(((sprygb)sprvbb2.cfr_renamed_0).cfr_renamed_1136(), arg1);
        sprvbb sprvbb3 = this;
        short[] sArray2 = sprvbb3.cfr_renamed_3.cfr_renamed_1278(((sprygb)sprvbb3.cfr_renamed_0).cfr_renamed_1135(), sArray);
        int n2 = n = 0;
        while (n2 < arg0[0].cfr_renamed_1139()) {
            sprvbb sprvbb4 = this;
            this.cfr_renamed_1[n] = (short)sprvbb4.cfr_renamed_2.nextInt();
            int n3 = n++;
            sprvbb4.cfr_renamed_1[n3] = (short)(this.cfr_renamed_1[n3] & 0xFF);
            n2 = n;
        }
        return sArray2;
    }

    public sprvbb() {
        sprvbb sprvbb2 = this;
        sprvbb2.cfr_renamed_3 = new sprteb();
    }

    private /* synthetic */ short[] cfr_renamed_1294(short[] arg0) {
        int n;
        short[][] sArray = ((sprhfb)this.cfr_renamed_0).cfr_renamed_1132();
        short[][] sArray2 = ((sprhfb)this.cfr_renamed_0).cfr_renamed_1131();
        short[] sArray3 = ((sprhfb)this.cfr_renamed_0).cfr_renamed_1133();
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
                    s = sprddb.cfr_renamed_1275(sArray[n][n3], sprddb.cfr_renamed_1275(arg0[n5], arg0[n8]));
                    ++n3;
                    sArray4[n] = sprddb.cfr_renamed_1274(sArray4[n], s);
                    n7 = ++n8;
                }
                s = sprddb.cfr_renamed_1275(sArray2[n][n5], arg0[n5]);
                sArray4[n] = sprddb.cfr_renamed_1274(sArray4[n], s);
                n6 = ++n5;
            }
            int n9 = n;
            short s2 = sprddb.cfr_renamed_1274(sArray4[n], sArray3[n9]);
            sArray4[n9] = s2;
            n4 = ++n;
        }
        return sArray4;
    }
}

