/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbqy;
import com.spire.presentation.packages.sprfxk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprldha;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryy;

public class sprqcl
implements spryy {
    private sprmr cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprtpk cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_91.cfr_renamed_1315();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprbj arg1;
        void arg0;
        this.cfr_renamed_1 = arg0;
        if (sprbj2 instanceof sprbgk) {
            arg1 = ((sprbgk)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprtpk) {
            this.cfr_renamed_4 = (sprtpk)arg1;
            this.cfr_renamed_3 = this.cfr_renamed_0;
            return;
        }
        if (arg1 instanceof sprkpk) {
            this.cfr_renamed_3 = ((sprkpk)arg1).cfr_renamed_1205();
            this.cfr_renamed_4 = (sprtpk)((sprkpk)arg1).cfr_renamed_284();
            if (this.cfr_renamed_3.length != 4) {
                throw new IllegalArgumentException(sprbqy.cfr_renamed_9("\u001a\u0010s*6(42;f=)'f67&'?f')sr"));
            }
        }
    }

    private /* synthetic */ byte[] cfr_renamed_3633(byte[] arg0, int arg1, int arg2) {
        int n;
        byte[] byArray = new byte[8];
        byte[] byArray2 = new byte[arg2 - byArray.length];
        byte[] byArray3 = new byte[byArray.length];
        byte[] byArray4 = new byte[8 + byArray.length];
        System.arraycopy(arg0, arg1, byArray3, 0, byArray.length);
        System.arraycopy(arg0, arg1 + byArray.length, byArray2, 0, arg2 - byArray.length);
        this.cfr_renamed_91.cfr_renamed_5535(false, this.cfr_renamed_4);
        int n2 = arg2 / 8;
        --n2;
        int n3 = n = 5;
        while (n3 >= 0) {
            int n4 = n2;
            while (n4 >= 1) {
                int n5;
                System.arraycopy(byArray3, 0, byArray4, 0, byArray.length);
                System.arraycopy(byArray2, 8 * (n5 - 1), byArray4, byArray.length, 8);
                int n6 = n2 * n + n5;
                int n7 = 1;
                int n8 = n6;
                while (n8 != 0) {
                    byte by = (byte)n6;
                    int n9 = byArray.length - n7;
                    byArray4[n9] = (byte)(byArray4[n9] ^ by);
                    ++n7;
                    n8 = n6 >>>= 8;
                }
                this.cfr_renamed_91.cfr_renamed_3064(byArray4, 0, byArray4, 0);
                System.arraycopy(byArray4, 0, byArray3, 0, 8);
                System.arraycopy(byArray4, 8, byArray2, 8 * --n5, 8);
                n4 = n5;
            }
            n3 = --n;
        }
        this.cfr_renamed_2 = byArray3;
        return byArray2;
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        if (!this.cfr_renamed_1) {
            throw new IllegalStateException(sprldha.cfr_renamed_9("\rj\u0017%\u0010`\u0017%\u0005j\u0011%\u0014w\u0002u\u0013l\rb"));
        }
        byte[] byArray = new byte[8];
        byte[] byArray2 = sprpxe.cfr_renamed_453(arg2);
        System.arraycopy(this.cfr_renamed_3, 0, byArray, 0, this.cfr_renamed_3.length);
        System.arraycopy(byArray2, 0, byArray, this.cfr_renamed_3.length, byArray2.length);
        byte[] byArray3 = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray3, 0, arg2);
        byte[] byArray4 = this.cfr_renamed_3632(byArray3);
        if (byArray4.length == 8) {
            int n;
            byte[] byArray5 = new byte[byArray4.length + byArray.length];
            System.arraycopy(byArray, 0, byArray5, 0, byArray.length);
            System.arraycopy(byArray4, 0, byArray5, byArray.length, byArray4.length);
            this.cfr_renamed_91.cfr_renamed_5535(true, this.cfr_renamed_4);
            int n2 = n = 0;
            while (n2 < byArray5.length) {
                this.cfr_renamed_91.cfr_renamed_3064(byArray5, n, byArray5, n);
                n2 = n += this.cfr_renamed_91.cfr_renamed_1195();
            }
            return byArray5;
        }
        sprfxk sprfxk2 = new sprfxk(this.cfr_renamed_91);
        sprkpk sprkpk2 = new sprkpk(this.cfr_renamed_4, byArray);
        sprfxk sprfxk3 = sprfxk2;
        sprfxk3.cfr_renamed_5535(true, sprkpk2);
        return sprfxk3.cfr_renamed_1575(byArray4, 0, byArray4.length);
    }

    private /* synthetic */ byte[] cfr_renamed_3632(byte[] arg0) {
        int n = arg0.length;
        int n2 = (8 - n % 8) % 8;
        byte[] byArray = new byte[n + n2];
        System.arraycopy(arg0, 0, byArray, 0, n);
        if (n2 != 0) {
            System.arraycopy(new byte[n2], 0, byArray, n, n2);
        }
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        int n2;
        int n3;
        byte[] byArray;
        if (this.cfr_renamed_1) {
            throw new IllegalStateException(sprbqy.cfr_renamed_9("=)'f #'f5)!f&($426#/=!"));
        }
        int n4 = arg2 / 8;
        if (n4 * 8 != arg2) {
            throw new sprull(sprldha.cfr_renamed_9("p\rr\u0011d\u0013%\u0007d\u0017dCh\u0016v\u0017%\u0001`CdCh\u0016i\u0017l\u0013i\u0006%\fcC=Cg\u001aq\u0006v"));
        }
        if (n4 <= 1) {
            throw new sprull(sprbqy.cfr_renamed_9("3=1!'#f7'''s+&5'f1#s''f?#25'fbps$*265"));
        }
        byte[] byArray2 = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray2, 0, arg2);
        byte[] byArray3 = new byte[arg2];
        if (n4 == 2) {
            int n5;
            this.cfr_renamed_91.cfr_renamed_5535(0 != 0, this.cfr_renamed_4);
            int n6 = n5 = 0;
            while (n6 < byArray2.length) {
                int n7 = n5;
                this.cfr_renamed_91.cfr_renamed_3064(byArray2, n7, byArray3, n7);
                n6 = n5 += this.cfr_renamed_91.cfr_renamed_1195();
            }
            this.cfr_renamed_2 = new byte[8];
            System.arraycopy(byArray3, 0, this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            byArray = new byte[byArray3.length - this.cfr_renamed_2.length];
            System.arraycopy(byArray3, this.cfr_renamed_2.length, byArray, 0, byArray.length);
        } else {
            byArray3 = this.cfr_renamed_3633(arg0, arg1, arg2);
            byArray = byArray3;
        }
        byte[] byArray4 = new byte[4];
        byte[] byArray5 = new byte[4];
        System.arraycopy(this.cfr_renamed_2, 0, byArray4, 0, byArray4.length);
        System.arraycopy(this.cfr_renamed_2, byArray4.length, byArray5, 0, byArray5.length);
        int n8 = sprpxe.cfr_renamed_446(byArray5, 0);
        boolean bl = true;
        if (!sproze.cfr_renamed_559(byArray4, this.cfr_renamed_3)) {
            bl = false;
        }
        if (n8 <= (n3 = (n2 = byArray.length) - 8)) {
            bl = false;
        }
        if (n8 > n2) {
            bl = false;
        }
        if ((n = n2 - n8) >= 8 || n < 0) {
            bl = false;
            n = 4;
        }
        byte[] byArray6 = new byte[n];
        byte[] byArray7 = new byte[n];
        System.arraycopy(byArray, byArray.length - n, byArray7, 0, n);
        if (!sproze.cfr_renamed_559(byArray7, byArray6)) {
            bl = false;
        }
        if (!bl) {
            throw new sprull(sprldha.cfr_renamed_9("f\u000b`\u0000n\u0010p\u000e%\u0005d\ni\u0006a"));
        }
        byte[] byArray8 = new byte[n8];
        System.arraycopy(byArray, 0, byArray8, 0, byArray8.length);
        return byArray8;
    }

    public sprqcl(sprmr sprmr2) {
        sprqcl sprqcl2 = this;
        sprqcl sprqcl3 = this;
        sprqcl sprqcl4 = this;
        byte[] byArray = new byte[4];
        byArray[0] = -90;
        byArray[1] = 89;
        byArray[2] = 89;
        byArray[3] = -90;
        sprqcl3.cfr_renamed_0 = byArray;
        sprqcl3.cfr_renamed_3 = sprqcl4.cfr_renamed_0;
        sprqcl2.cfr_renamed_2 = null;
        sprqcl2.cfr_renamed_91 = sprmr2;
    }
}

