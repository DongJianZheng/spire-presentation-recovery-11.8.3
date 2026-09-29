/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprhlaa;
import com.spire.presentation.packages.spriv;
import com.spire.presentation.packages.sprkgp;
import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sproao;
import com.spire.presentation.packages.sprpsn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprskea;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvkp;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprkwn
extends sprbln {
    private byte[] cfr_renamed_86;
    private int cfr_renamed_152;
    private static byte[] cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprvkp cfr_renamed_3;
    private static byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_14925(int arg0) {
        switch (arg0) {
            case 1: {
                this.cfr_renamed_119 = 40;
                this.cfr_renamed_91 = 2;
                return;
            }
            case 2: {
                this.cfr_renamed_119 = 128;
                this.cfr_renamed_91 = 3;
                return;
            }
        }
        throw new IllegalArgumentException(sprhlaa.cfr_renamed_9("\u001f( ':/2f3(54/6\"/9(v+9\"3h"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14926(byte[] byArray, byte[] byArray2) {
        void arg0;
        void arg1;
        this.cfr_renamed_0 = new byte[32];
        byte[] byArray3 = sprkwn.cfr_renamed_14927(byArray2);
        if (byArray2 == null || ((void)arg1).length == 0) {
            byArray3 = sprkwn.cfr_renamed_14927((byte[])arg0);
        }
        byte[] byArray4 = sprsfp.cfr_renamed_14252(8, byArray3);
        byte[] byArray5 = sprkwn.cfr_renamed_14927((byte[])arg0);
        if (this.cfr_renamed_91 == 3 || this.cfr_renamed_91 == 4) {
            int n;
            byte[] byArray6 = new byte[this.cfr_renamed_119 / 8];
            int n2 = n = 0;
            while (n2 < 50) {
                System.arraycopy(sprsfp.cfr_renamed_14928(8, byArray4, 0, byArray6.length), 0, byArray4, 0, byArray6.length);
                n2 = ++n;
            }
            System.arraycopy(byArray5, 0, this.cfr_renamed_0, 0, 32);
            int n3 = n = 0;
            while (n3 < 20) {
                int n4;
                int n5 = n4 = 0;
                while (n5 < byArray6.length) {
                    int n6 = n4++;
                    byArray6[n6] = (byte)(byArray4[n6] & 0xFF ^ n);
                    n5 = n4;
                }
                sprkwn sprkwn2 = this;
                sprkwn2.cfr_renamed_3.cfr_renamed_14929(byArray6);
                sprkwn2.cfr_renamed_3.cfr_renamed_1512(this.cfr_renamed_0);
                n3 = ++n;
            }
        } else {
            sprkwn sprkwn3 = this;
            sprkwn3.cfr_renamed_3.cfr_renamed_14924(byArray4, 0, 5);
            sprkwn3.cfr_renamed_3.cfr_renamed_14930(byArray5, this.cfr_renamed_0);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void v6;
        void arg0;
        void v0 = arg0;
        arg0.cfr_renamed_14086();
        v0.cfr_renamed_11835(sprskea.cfr_renamed_9("4brHoAi\u00044woEu@zV\u007f"));
        Object[] objectArray = new Object[1];
        objectArray[0] = sprznp.cfr_renamed_14312(this.cfr_renamed_0);
        v0.cfr_renamed_14057(sprhlaa.cfr_renamed_9("y\t"), sprraia.cfr_renamed_11562(sprskea.cfr_renamed_9("'_+Y%"), objectArray));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = sprznp.cfr_renamed_14312(this.cfr_renamed_86);
        arg0.cfr_renamed_14057(sprhlaa.cfr_renamed_9("y\u0013"), sprraia.cfr_renamed_11562(sprskea.cfr_renamed_9("'_+Y%"), objectArray2));
        void v3 = arg0;
        v3.cfr_renamed_14094("/P", this.cfr_renamed_152);
        sprkwn sprkwn2 = this;
        v3.cfr_renamed_14094(sprhlaa.cfr_renamed_9("y\u0014"), sprkwn2.cfr_renamed_91);
        switch (sprkwn2.cfr_renamed_91) {
            case 2: {
                void v5 = arg0;
                while (false) {
                }
                v6 = v5;
                v5.cfr_renamed_14094(sprskea.cfr_renamed_9("\u000bM"), 1);
                break;
            }
            case 3: {
                v6 = arg0;
                void v7 = arg0;
                v7.cfr_renamed_14094(sprhlaa.cfr_renamed_9("y\u0010"), 2);
                v7.cfr_renamed_14094(sprskea.cfr_renamed_9("4h~J|Ps"), 128);
                break;
            }
            default: {
                throw new IllegalStateException(sprhlaa.cfr_renamed_9("\u00138#.63%\"#2f3(54/6\"/9(v+32>)2h"));
            }
        }
        v6.cfr_renamed_14061();
    }

    public sprkwn(sprgdo arg0, byte[] arg1) {
        sprkwn sprkwn2 = this;
        sprkwn sprkwn3 = this;
        super(arg0);
        this.cfr_renamed_1 = new byte[5];
        sprkwn sprkwn4 = this;
        sprkwn3.cfr_renamed_3 = new sprvkp();
        sproao sproao2 = arg0.cfr_renamed_13097().cfr_renamed_14525();
        sprkwn2.cfr_renamed_14925(sproao2.cfr_renamed_1445());
        sprkwn3.cfr_renamed_152 = sproao2.cfr_renamed_14931();
        sprkwn2.cfr_renamed_152 = sprkwn2.cfr_renamed_152 | (this.cfr_renamed_91 == 3 || this.cfr_renamed_91 == 4 ? -3904 : -64);
        this.cfr_renamed_152 &= 0xFFFFFFFC;
        byte[] byArray = sprznp.cfr_renamed_12328(sproao2.cfr_renamed_14521()) ? sprszca.cfr_renamed_11605().cfr_renamed_11606(sproao2.cfr_renamed_14521()) : sprkpp.cfr_renamed_4;
        byte[] byArray2 = sprznp.cfr_renamed_12328(sproao2.cfr_renamed_14522()) ? sprszca.cfr_renamed_11605().cfr_renamed_11606(sproao2.cfr_renamed_14522()) : arg1;
        sprkwn sprkwn5 = this;
        this.cfr_renamed_14926(byArray, byArray2);
        sprkwn5.cfr_renamed_14932(arg1, byArray);
        sprkwn5.cfr_renamed_14933(arg1);
    }

    static {
        byte[] byArray = new byte[32];
        byArray[0] = 40;
        byArray[1] = -65;
        byArray[2] = 78;
        byArray[3] = 94;
        byArray[4] = 78;
        byArray[5] = 117;
        byArray[6] = -118;
        byArray[7] = 65;
        byArray[8] = 100;
        byArray[9] = 0;
        byArray[10] = 78;
        byArray[11] = 86;
        byArray[12] = -1;
        byArray[13] = -6;
        byArray[14] = 1;
        byArray[15] = 8;
        byArray[16] = 46;
        byArray[17] = 46;
        byArray[18] = 0;
        byArray[19] = -74;
        byArray[20] = -48;
        byArray[21] = 104;
        byArray[22] = 62;
        byArray[23] = -128;
        byArray[24] = 47;
        byArray[25] = 12;
        byArray[26] = -87;
        byArray[27] = -2;
        byArray[28] = 100;
        byArray[29] = 83;
        byArray[30] = 105;
        byArray[31] = 122;
        cfr_renamed_4 = byArray;
        byte[] byArray2 = new byte[4];
        byArray2[0] = 115;
        byArray2[1] = 65;
        byArray2[2] = 108;
        byArray2[3] = 84;
        cfr_renamed_112 = byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sprpsn cfr_renamed_14573(int n, int n2) {
        void arg1;
        void arg0;
        sprkwn sprkwn2 = this;
        sprkwn2.cfr_renamed_1[0] = (byte)arg0;
        sprkwn2.cfr_renamed_1[1] = (byte)(arg0 >> 8);
        sprkwn2.cfr_renamed_1[2] = (byte)(arg0 >> 16);
        sprkwn2.cfr_renamed_1[3] = (byte)arg1;
        sprkwn2.cfr_renamed_1[4] = (byte)(arg1 >> 8);
        spriv spriv2 = sprkgp.cfr_renamed_14934(8);
        spriv2.cfr_renamed_7536(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        spriv2.cfr_renamed_7536(this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        if (this.cfr_renamed_91 == 4) {
            spriv2.cfr_renamed_7536(cfr_renamed_112, 0, this.cfr_renamed_1.length);
        }
        spriv spriv3 = spriv2;
        byte[] byArray = new byte[spriv3.cfr_renamed_1218()];
        spriv3.cfr_renamed_1219(byArray, 0);
        int n3 = this.cfr_renamed_2.length + 5;
        if (n3 > 16) {
            n3 = 16;
        }
        return new sprpsn(byArray, n3);
    }

    private /* synthetic */ void cfr_renamed_14933(byte[] arg0) {
        this.cfr_renamed_86 = new byte[32];
        if (this.cfr_renamed_91 == 3 || this.cfr_renamed_91 == 4) {
            spriv spriv2 = sprkgp.cfr_renamed_14934(8);
            spriv2.cfr_renamed_7536(cfr_renamed_4, 0, cfr_renamed_4.length);
            spriv2.cfr_renamed_7536(arg0, 0, arg0.length);
            spriv spriv3 = spriv2;
            byte[] byArray = new byte[spriv3.cfr_renamed_1218()];
            spriv3.cfr_renamed_1219(byArray, 0);
            System.arraycopy(byArray, 0, this.cfr_renamed_86, 0, 16);
            int n = 16;
            int n2 = n;
            while (n2 < 32) {
                this.cfr_renamed_86[n++] = 0;
                n2 = n;
            }
            int n3 = n = 0;
            while (n3 < 20) {
                int n4;
                int n5 = n4 = 0;
                while (n5 < this.cfr_renamed_2.length) {
                    int n6 = n4++;
                    byArray[n6] = (byte)(this.cfr_renamed_2[n6] & 0xFF ^ n);
                    n5 = n4;
                }
                this.cfr_renamed_3.cfr_renamed_14924(byArray, 0, this.cfr_renamed_2.length);
                sprkwn sprkwn2 = this;
                sprkwn2.cfr_renamed_3.cfr_renamed_3485(sprkwn2.cfr_renamed_86, 0, 16);
                n3 = ++n;
            }
        } else {
            sprkwn sprkwn3 = this;
            sprkwn3.cfr_renamed_3.cfr_renamed_14929(sprkwn3.cfr_renamed_2);
            sprkwn3.cfr_renamed_3.cfr_renamed_14930(cfr_renamed_4, this.cfr_renamed_86);
        }
    }

    private /* synthetic */ void cfr_renamed_14932(byte[] arg0, byte[] arg1) {
        this.cfr_renamed_2 = new byte[this.cfr_renamed_119 / 8];
        spriv spriv2 = sprkgp.cfr_renamed_14934(8);
        byte[] byArray = sprkwn.cfr_renamed_14927(arg1);
        spriv2.cfr_renamed_7536(byArray, 0, byArray.length);
        spriv2.cfr_renamed_7536(this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        byte[] byArray2 = new byte[4];
        byArray2[0] = (byte)this.cfr_renamed_152;
        byArray2[1] = (byte)(this.cfr_renamed_152 >> 8);
        byArray2[2] = (byte)(this.cfr_renamed_152 >> 16);
        byArray2[3] = (byte)(this.cfr_renamed_152 >> 24);
        byte[] byArray3 = byArray2;
        spriv2.cfr_renamed_7536(byArray3, 0, 4);
        if (arg0 != null) {
            spriv2.cfr_renamed_7536(arg0, 0, arg0.length);
        }
        spriv spriv3 = spriv2;
        byte[] byArray4 = new byte[spriv3.cfr_renamed_1218()];
        spriv3.cfr_renamed_1219(byArray4, 0);
        byte[] byArray5 = new byte[this.cfr_renamed_2.length];
        System.arraycopy(byArray4, 0, byArray5, 0, this.cfr_renamed_2.length);
        if (this.cfr_renamed_91 == 3 || this.cfr_renamed_91 == 4) {
            int n;
            int n2 = n = 0;
            while (n2 < 50) {
                System.arraycopy(sprsfp.cfr_renamed_14252(8, byArray5), 0, byArray5, 0, this.cfr_renamed_2.length);
                n2 = ++n;
            }
        }
        System.arraycopy(byArray5, 0, this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
    }

    private static /* synthetic */ byte[] cfr_renamed_14927(byte[] arg0) {
        byte[] byArray = new byte[32];
        if (arg0 == null || arg0.length == 0) {
            System.arraycopy(cfr_renamed_4, 0, byArray, 0, 32);
            return byArray;
        }
        System.arraycopy(arg0, 0, byArray, 0, sprrgga.cfr_renamed_12461(arg0.length, 32));
        if (arg0.length < 32) {
            System.arraycopy(cfr_renamed_4, 0, byArray, arg0.length, 32 - arg0.length);
        }
        return byArray;
    }
}

