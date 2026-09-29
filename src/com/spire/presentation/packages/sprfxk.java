/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgig;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsvda;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryy;

public class sprfxk
implements spryy {
    private sprmr cfr_renamed_0;
    private boolean cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprtpk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfxk(sprmr sprmr2, boolean bl) {
        void arg0;
        sprfxk sprfxk2 = this;
        byte[] byArray = new byte[8];
        byArray[0] = -90;
        byArray[1] = -90;
        byArray[2] = -90;
        byArray[3] = -90;
        byArray[4] = -90;
        byArray[5] = -90;
        byArray[6] = -90;
        byArray[7] = -90;
        this.cfr_renamed_2 = byArray;
        sprfxk2.cfr_renamed_0 = arg0;
        sprfxk2.cfr_renamed_1 = !bl;
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        sprfxk sprfxk2;
        boolean bl;
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(sprgig.cfr_renamed_9("%>?q84?q->9q>?<#*!;8%6"));
        }
        if (arg2 < 16) {
            throw new sprull(sprsvda.cfr_renamed_9("_N]RKP\nDKTK\u0000^OE\u0000YHER^"));
        }
        int n6 = arg2 / 8;
        if (n6 * 8 != arg2) {
            throw new sprull(sprgig.cfr_renamed_9("$%&90;q/0?0k<>\"?q)4k0k<>=?8;=.q$7kik32%.\""));
        }
        sprfxk sprfxk3 = this;
        if (!sprfxk3.cfr_renamed_1) {
            bl = true;
            sprfxk2 = this;
        } else {
            bl = false;
            sprfxk2 = this;
        }
        sprfxk3.cfr_renamed_0.cfr_renamed_5535(bl, sprfxk2.cfr_renamed_4);
        byte[] byArray = new byte[arg2 - this.cfr_renamed_2.length];
        byte[] byArray2 = new byte[this.cfr_renamed_2.length];
        byte[] byArray3 = new byte[8 + this.cfr_renamed_2.length];
        if (--n6 == 1) {
            this.cfr_renamed_0.cfr_renamed_3064(arg0, arg1, byArray3, 0);
            System.arraycopy(byArray3, 0, byArray2, 0, this.cfr_renamed_2.length);
            System.arraycopy(byArray3, this.cfr_renamed_2.length, byArray, 0, 8);
            n5 = n6;
        } else {
            System.arraycopy(arg0, arg1, byArray2, 0, this.cfr_renamed_2.length);
            System.arraycopy(arg0, arg1 + this.cfr_renamed_2.length, byArray, 0, arg2 - this.cfr_renamed_2.length);
            int n7 = n4 = 5;
            while (n7 >= 0) {
                int n8 = n6;
                while (n8 >= 1) {
                    System.arraycopy(byArray2, 0, byArray3, 0, this.cfr_renamed_2.length);
                    System.arraycopy(byArray, 8 * (n3 - 1), byArray3, this.cfr_renamed_2.length, 8);
                    n2 = n6 * n4 + n3;
                    n = 1;
                    int n9 = n2;
                    while (n9 != 0) {
                        byte by = (byte)n2;
                        int n10 = this.cfr_renamed_2.length - n;
                        byArray3[n10] = (byte)(byArray3[n10] ^ by);
                        ++n;
                        n9 = n2 >>>= 8;
                    }
                    this.cfr_renamed_0.cfr_renamed_3064(byArray3, 0, byArray3, 0);
                    System.arraycopy(byArray3, 0, byArray2, 0, 8);
                    System.arraycopy(byArray3, 8, byArray, 8 * --n3, 8);
                    n8 = n3;
                }
                n7 = --n4;
            }
            n5 = n6;
        }
        if (n5 != 1) {
            if (!sproze.cfr_renamed_559(byArray2, this.cfr_renamed_2)) {
                throw new sprull(sprsvda.cfr_renamed_9("IHOCAS_M\nFKIFEN"));
            }
        } else if (!sproze.cfr_renamed_559(byArray2, this.cfr_renamed_2)) {
            System.arraycopy(arg0, arg1, byArray2, 0, this.cfr_renamed_2.length);
            System.arraycopy(arg0, arg1 + this.cfr_renamed_2.length, byArray, 0, arg2 - this.cfr_renamed_2.length);
            int n11 = n4 = 5;
            while (n11 >= 0) {
                System.arraycopy(byArray2, 0, byArray3, 0, this.cfr_renamed_2.length);
                System.arraycopy(byArray, 0, byArray3, this.cfr_renamed_2.length, 8);
                n3 = n6 * n4 + 1;
                n2 = 1;
                int n12 = n3;
                while (n12 != 0) {
                    n = (byte)n3;
                    int n13 = this.cfr_renamed_2.length - n2;
                    byArray3[n13] = (byte)(byArray3[n13] ^ n);
                    ++n2;
                    n12 = n3 >>>= 8;
                }
                this.cfr_renamed_0.cfr_renamed_3064(byArray3, 0, byArray3, 0);
                System.arraycopy(byArray3, 0, byArray2, 0, 8);
                System.arraycopy(byArray3, 8, byArray, 0, 8);
                n11 = --n4;
            }
            if (!sproze.cfr_renamed_559(byArray2, this.cfr_renamed_2)) {
                throw new sprull(sprgig.cfr_renamed_9("2#4(:8$&q-0\"=.5"));
            }
        }
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(sprsvda.cfr_renamed_9("NET\nSOT\nFER\nWXAZPCNM"));
        }
        if (arg2 < 8) {
            throw new sprddl(sprgig.cfr_renamed_9("<#*!k5*%*q&$8%k3.q*%k=.08%kik32%.\""));
        }
        int n2 = arg2 / 8;
        if (n2 * 8 != arg2) {
            throw new sprddl(sprsvda.cfr_renamed_9("]RKP\nDKTK\u0000GUYT\nBO\u0000K\u0000GUFTCPFE\nOL\u0000\u0012\u0000HY^EY"));
        }
        sprfxk sprfxk2 = this;
        sprfxk2.cfr_renamed_0.cfr_renamed_5535(sprfxk2.cfr_renamed_1, this.cfr_renamed_4);
        byte[] byArray = new byte[arg2 + this.cfr_renamed_2.length];
        System.arraycopy(this.cfr_renamed_2, 0, byArray, 0, this.cfr_renamed_2.length);
        System.arraycopy(arg0, arg1, byArray, this.cfr_renamed_2.length, arg2);
        if (n2 == 1) {
            this.cfr_renamed_0.cfr_renamed_3064(byArray, 0, byArray, 0);
            return byArray;
        }
        byte[] byArray2 = new byte[8 + this.cfr_renamed_2.length];
        int n3 = n = 0;
        while (n3 != 6) {
            int n4;
            int n5 = n4 = 1;
            while (n5 <= n2) {
                System.arraycopy(byArray, 0, byArray2, 0, this.cfr_renamed_2.length);
                System.arraycopy(byArray, 8 * n4, byArray2, this.cfr_renamed_2.length, 8);
                this.cfr_renamed_0.cfr_renamed_3064(byArray2, 0, byArray2, 0);
                int n6 = n2 * n + n4;
                int n7 = 1;
                int n8 = n6;
                while (n8 != 0) {
                    byte by = (byte)n6;
                    int n9 = this.cfr_renamed_2.length - n7;
                    byArray2[n9] = (byte)(byArray2[n9] ^ by);
                    ++n7;
                    n8 = n6 >>>= 8;
                }
                System.arraycopy(byArray2, 0, byArray, 0, 8);
                int n10 = 8 * n4;
                System.arraycopy(byArray2, 8, byArray, n10, 8);
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return byArray;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_0.cfr_renamed_1315();
    }

    public sprfxk(sprmr arg0) {
        this(arg0, false);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprbj arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (sprbj2 instanceof sprbgk) {
            arg1 = ((sprbgk)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprtpk) {
            this.cfr_renamed_4 = (sprtpk)arg1;
            return;
        }
        if (arg1 instanceof sprkpk) {
            this.cfr_renamed_2 = ((sprkpk)arg1).cfr_renamed_1205();
            this.cfr_renamed_4 = (sprtpk)((sprkpk)arg1).cfr_renamed_284();
            if (this.cfr_renamed_2.length != 8) {
                throw new IllegalArgumentException(sprgig.cfr_renamed_9("\u0018\u001dq%>?q. >0'q?>ki"));
            }
        }
    }
}

