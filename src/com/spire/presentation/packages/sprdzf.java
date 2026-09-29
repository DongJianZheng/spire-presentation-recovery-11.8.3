/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdcg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprjvf;
import com.spire.presentation.packages.sprkdg;
import com.spire.presentation.packages.sprkvf;
import com.spire.presentation.packages.sprkzf;
import com.spire.presentation.packages.sprluf;
import com.spire.presentation.packages.sprocg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprozf;
import com.spire.presentation.packages.sprqap;
import com.spire.presentation.packages.sprquq;
import com.spire.presentation.packages.sprrvf;
import com.spire.presentation.packages.sprszf;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprdzf
implements sprgm {
    private sprkzf cfr_renamed_119;
    private SecureRandom cfr_renamed_91;
    private static final int cfr_renamed_0 = 65536;
    private sprjvf cfr_renamed_1;
    private sprrvf cfr_renamed_2;
    private sprgf cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        sprdzf sprdzf2 = this;
        byte[] byArray = new byte[sprdzf2.cfr_renamed_3.cfr_renamed_1218()];
        sprdzf2.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        sprdzf sprdzf3 = this;
        int n = sprdzf3.cfr_renamed_119.cfr_renamed_284().cfr_renamed_1186();
        int n2 = sprdzf3.cfr_renamed_119.cfr_renamed_284().cfr_renamed_1146();
        sprkvf sprkvf2 = new sprkvf(this.cfr_renamed_119.cfr_renamed_284());
        byte[] byArray2 = sproze.cfr_renamed_533(arg1, n2, arg1.length);
        sprdzf sprdzf4 = this;
        short[] sArray = sprdzf4.cfr_renamed_1289(sprluf.cfr_renamed_6130(sprdzf4.cfr_renamed_3, byArray, byArray2, new byte[n]));
        short[] sArray2 = sprluf.cfr_renamed_1271(sproze.cfr_renamed_533(arg1, 0, n2));
        switch (sprocg.cfr_renamed_4[this.cfr_renamed_2.ordinal()]) {
            case 1: {
                sprkdg sprkdg2 = (sprkdg)this.cfr_renamed_119;
                short[] sArray3 = sprkvf2.cfr_renamed_6131(sprkdg2, sArray2);
                short[] sArray4 = sArray;
                return sprluf.cfr_renamed_1231(sArray4, sArray3);
            }
            case 2: 
            case 3: {
                sprkdg sprkdg3 = (sprkdg)this.cfr_renamed_119;
                short[] sArray3 = sprkvf2.cfr_renamed_6132(sprkdg3, sArray2);
                short[] sArray4 = sArray;
                return sprluf.cfr_renamed_1231(sArray4, sArray3);
            }
        }
        throw new IllegalArgumentException(sprquq.cfr_renamed_9("Us;jzprx;j~nhutr5<Kp~}hy;\u007fssto~<tr~<tz;hsy;ztpwsluu{!<xpzohux0;\u007frnxivf~rrhs}w0;\u007ftqkn~ohy\u007f"));
    }

    private /* synthetic */ short[] cfr_renamed_1289(byte[] arg0) {
        short[] sArray = new short[this.cfr_renamed_4];
        int n = 0;
        int n2 = 0;
        do {
            if (n2 >= arg0.length) {
                return sArray;
            }
            short s = (short)(arg0[n] & 0xFF);
            ++n;
            sArray[n2] = s;
        } while (++n2 < sArray.length);
        return sArray;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprdzf sprdzf2;
        if (arg0) {
            sprdzf sprdzf3;
            sprkzf sprkzf2;
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2;
                sprbgk sprbgk3 = sprbgk2 = (sprbgk)arg1;
                this.cfr_renamed_91 = sprbgk3.cfr_renamed_1295();
                sprkzf2 = (sprkzf)sprbgk3.cfr_renamed_284();
                sprdzf3 = this;
            } else {
                sprkzf2 = (sprkzf)arg1;
                SecureRandom secureRandom = sprybl.cfr_renamed_2794();
                byte[] byArray = new byte[sprkzf2.cfr_renamed_284().cfr_renamed_6133()];
                secureRandom.nextBytes(byArray);
                sprdzf3 = this;
                this.cfr_renamed_91 = new sprdcg(byArray, sprkzf2.cfr_renamed_284().cfr_renamed_6134());
            }
            sprdzf3.cfr_renamed_2 = sprkzf2.cfr_renamed_284().cfr_renamed_3();
            sprdzf2 = this;
            this.cfr_renamed_119 = sprkzf2;
        } else {
            this.cfr_renamed_119 = (sprkzf)arg1;
            sprdzf sprdzf4 = this;
            sprdzf2 = sprdzf4;
            sprdzf4.cfr_renamed_2 = sprdzf4.cfr_renamed_119.cfr_renamed_284().cfr_renamed_3();
        }
        sprdzf2.cfr_renamed_4 = this.cfr_renamed_119.cfr_renamed_1130();
        this.cfr_renamed_3 = this.cfr_renamed_119.cfr_renamed_284().cfr_renamed_6134();
    }

    public sprdzf() {
        sprdzf sprdzf2 = this;
        sprdzf2.cfr_renamed_1 = new sprjvf();
    }

    private /* synthetic */ byte[] cfr_renamed_6135(byte[] arg0) {
        short[] sArray;
        short s;
        int n;
        int n2;
        int n3;
        int n4;
        sprdzf sprdzf2 = this;
        byte[] byArray = new byte[sprdzf2.cfr_renamed_3.cfr_renamed_1218()];
        sprdzf2.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        sprdzf sprdzf3 = this;
        this.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        sprdzf sprdzf4 = this;
        int n5 = sprdzf4.cfr_renamed_119.cfr_renamed_284().cfr_renamed_1947();
        int n6 = sprdzf4.cfr_renamed_119.cfr_renamed_284().cfr_renamed_6136();
        int n7 = sprdzf4.cfr_renamed_119.cfr_renamed_284().cfr_renamed_6137();
        int n8 = sprdzf3.cfr_renamed_119.cfr_renamed_284().cfr_renamed_1186();
        int n9 = sprdzf3.cfr_renamed_119.cfr_renamed_284().cfr_renamed_1146();
        sprozf sprozf2 = (sprozf)sprdzf3.cfr_renamed_119;
        byte[] byArray2 = sprluf.cfr_renamed_6130(this.cfr_renamed_3, sprozf2.cfr_renamed_152, byArray, new byte[this.cfr_renamed_3.cfr_renamed_1218()]);
        sprdzf sprdzf5 = this;
        sprdzf5.cfr_renamed_91 = new sprdcg(byArray2, sprozf2.cfr_renamed_284().cfr_renamed_6134());
        short[] sArray2 = new short[n5];
        short[][] sArray3 = null;
        short[] sArray4 = new short[n6];
        short[] sArray5 = new short[n7];
        short[] sArray6 = new short[n7];
        short[][] sArray7 = new short[n7][n6];
        int n10 = n7;
        short[][] sArray8 = new short[n10][n10];
        byte[] byArray3 = new byte[sprozf2.cfr_renamed_284().cfr_renamed_6138()];
        short[] sArray9 = new short[n8];
        short[] sArray10 = new short[n6];
        short[] sArray11 = null;
        short[][] sArray12 = sArray3;
        for (n4 = 0; sArray12 == null && n4 < 65536; ++n4) {
            byte[] byArray4 = new byte[n5];
            this.cfr_renamed_91.nextBytes(byArray4);
            int n11 = n3 = 0;
            while (n11 < n5) {
                int n12 = n3++;
                sArray2[n12] = (short)(byArray4[n12] & 0xFF);
                n11 = n3;
            }
            int n13 = n6;
            sArray3 = new short[n13][n13];
            int n14 = n3 = 0;
            while (n14 < n5) {
                int n15 = n2 = 0;
                while (n15 < n6) {
                    int n16 = n = 0;
                    while (n16 < n6) {
                        s = sprszf.cfr_renamed_1275(sprozf2.cfr_renamed_107[n2][n3][n], sArray2[n3]);
                        int n17 = n++;
                        sArray3[n2][n17] = sprszf.cfr_renamed_1274(sArray3[n2][n17], s);
                        n16 = n;
                    }
                    n15 = ++n2;
                }
                n14 = ++n3;
            }
            sArray12 = sArray3 = this.cfr_renamed_1.cfr_renamed_1288(sArray3);
        }
        int n18 = n3 = 0;
        while (n18 < n6) {
            int n19 = n3++;
            sArray4[n19] = this.cfr_renamed_1.cfr_renamed_6139(sprozf2.cfr_renamed_102[n19], sArray2);
            n18 = n3;
        }
        int n20 = n3 = 0;
        while (n20 < n5) {
            int n21 = n2 = 0;
            while (n21 < n7) {
                int n22 = n2;
                sArray5[n22] = this.cfr_renamed_1.cfr_renamed_6139(sprozf2.cfr_renamed_132[n22], sArray2);
                int n23 = n = 0;
                while (n23 < n6) {
                    s = sprszf.cfr_renamed_1275(sprozf2.cfr_renamed_112[n2][n3][n], sArray2[n3]);
                    int n24 = n++;
                    sArray7[n2][n24] = sprszf.cfr_renamed_1274(sArray7[n2][n24], s);
                    n23 = n;
                }
                int n25 = n = 0;
                while (n25 < n7) {
                    s = sprszf.cfr_renamed_1275(sprozf2.cfr_renamed_1[n2][n3][n], sArray2[n3]);
                    int n26 = n++;
                    sArray8[n2][n26] = sprszf.cfr_renamed_1274(sArray8[n2][n26], s);
                    n25 = n;
                }
                n21 = ++n2;
            }
            n20 = ++n3;
        }
        byte[] byArray5 = new byte[n8];
        short[] sArray13 = sArray11;
        while (sArray13 == null && n4 < 65536) {
            int n27 = n7;
            short[][] sArray14 = new short[n27][n27];
            sprdzf sprdzf6 = this;
            sprdzf6.cfr_renamed_91.nextBytes(byArray3);
            short[] sArray15 = sprdzf6.cfr_renamed_1289(sprluf.cfr_renamed_6130(sprdzf6.cfr_renamed_3, byArray, byArray3, byArray5));
            sArray = sprdzf6.cfr_renamed_1.cfr_renamed_1278(sprozf2.cfr_renamed_86, sproze.cfr_renamed_5242(sArray15, n6, n8));
            sArray = sprdzf6.cfr_renamed_1.cfr_renamed_1286(sproze.cfr_renamed_5246(sArray15, n6), sArray);
            System.arraycopy(sArray, 0, sArray9, 0, n6);
            int n28 = n6;
            System.arraycopy(sArray15, n28, sArray9, n28, n7);
            sArray = sprdzf6.cfr_renamed_1.cfr_renamed_1286(sArray4, sproze.cfr_renamed_5246(sArray9, n6));
            sArray10 = sprdzf6.cfr_renamed_1.cfr_renamed_1278(sArray3, sArray);
            sArray = sprdzf6.cfr_renamed_1.cfr_renamed_1278(sArray7, sArray10);
            int n29 = n2 = 0;
            while (n29 < n7) {
                int n30 = n2++;
                sArray6[n30] = this.cfr_renamed_1.cfr_renamed_6139(sprozf2.cfr_renamed_4[n30], sArray10);
                n29 = n2;
            }
            sprdzf sprdzf7 = this;
            sArray = sprdzf7.cfr_renamed_1.cfr_renamed_1286(sArray, sArray6);
            sArray = sprdzf7.cfr_renamed_1.cfr_renamed_1286(sArray, sArray5);
            sArray = sprdzf7.cfr_renamed_1.cfr_renamed_1286(sArray, sproze.cfr_renamed_5242(sArray9, n6, n8));
            int n31 = n2 = 0;
            while (n31 < n6) {
                int n32 = n = 0;
                while (n32 < n7) {
                    int n33;
                    int n34 = n33 = 0;
                    while (n34 < n7) {
                        s = sprszf.cfr_renamed_1275(sprozf2.cfr_renamed_3[n][n2][n33], sArray10[n2]);
                        int n35 = n33++;
                        sArray14[n][n35] = sprszf.cfr_renamed_1274(sArray14[n][n35], s);
                        n34 = n33;
                    }
                    n32 = ++n;
                }
                n31 = ++n2;
            }
            sprdzf sprdzf8 = this;
            sArray14 = sprdzf8.cfr_renamed_1.cfr_renamed_6140(sArray14, sArray8);
            ++n4;
            sArray13 = sArray11 = sprdzf8.cfr_renamed_1.cfr_renamed_1281(sArray14, sArray);
        }
        sArray11 = sArray11 == null ? new short[n7] : sArray11;
        sprdzf sprdzf9 = this;
        sArray = sprdzf9.cfr_renamed_1.cfr_renamed_1278(sprozf2.cfr_renamed_2, sArray10);
        short[] sArray16 = sprdzf9.cfr_renamed_1.cfr_renamed_1286(sArray2, sArray);
        sArray = sprdzf9.cfr_renamed_1.cfr_renamed_1278(sprozf2.cfr_renamed_91, sArray11);
        sArray16 = sprdzf9.cfr_renamed_1.cfr_renamed_1286(sArray16, sArray);
        sArray = sprdzf9.cfr_renamed_1.cfr_renamed_1278(sprozf2.cfr_renamed_119, sArray11);
        sArray = sprdzf9.cfr_renamed_1.cfr_renamed_1286(sArray10, sArray);
        sArray16 = sproze.cfr_renamed_5246(sArray16, n9);
        System.arraycopy(sArray, 0, sArray16, n5, n6);
        System.arraycopy(sArray11, 0, sArray16, n6 + n5, n7);
        if (n4 == 65536) {
            throw new IllegalStateException(sprqap.cfr_renamed_9("{^oRbU.Da\u0010iU`U|QzU.CgW`QzE|U.\u001d.|Kc.^aD.Ca\\xQl\\k"));
        }
        byte[] byArray6 = sprluf.cfr_renamed_1270(sArray16);
        return sproze.cfr_renamed_543(byArray6, byArray3);
    }

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        return this.cfr_renamed_6135(arg0);
    }
}

