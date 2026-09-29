/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnn;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprxhl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import java.security.SecureRandom;

public class sprvkl
implements spryy {
    private boolean cfr_renamed_112;
    public byte[] cfr_renamed_119;
    private sprtpk cfr_renamed_91;
    public sprgf cfr_renamed_0 = sprkkk.cfr_renamed_5701();
    private byte[] cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    private sprhqk cfr_renamed_3;
    private sprkpk cfr_renamed_4;

    static {
        byte[] byArray = new byte[8];
        byArray[0] = 74;
        byArray[1] = -35;
        byArray[2] = -94;
        byArray[3] = 44;
        byArray[4] = 121;
        byArray[5] = -24;
        byArray[6] = 33;
        byArray[7] = 5;
        cfr_renamed_2 = byArray;
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        int n2;
        if (this.cfr_renamed_112) {
            throw new IllegalStateException(sprbye.cfr_renamed_9("F`|/{j|/n`z/}a\u007f}i\u007fxffh"));
        }
        if (arg0 == null) {
            throw new sprull(sprpnn.cfr_renamed_9("K`iy%ej|ka`g%tv5f|u}`gqp}a"));
        }
        int n3 = this.cfr_renamed_3.cfr_renamed_1195();
        if (arg2 % n3 != 0) {
            throw new sprull(new StringBuilder().insert(0, sprbye.cfr_renamed_9("La\u007f`jz{mw|/f`|/ezd{a\u007fdj(`n/")).append(n3).toString());
        }
        sprkpk sprkpk2 = new sprkpk(this.cfr_renamed_91, cfr_renamed_2);
        this.cfr_renamed_3.cfr_renamed_5535(false, sprkpk2);
        byte[] byArray = new byte[arg2];
        int n4 = n2 = 0;
        while (n4 != arg2) {
            this.cfr_renamed_3.cfr_renamed_3064(arg0, arg1 + n2, byArray, n2);
            n4 = n2 += n3;
        }
        sproze.cfr_renamed_5249(byArray);
        this.cfr_renamed_1 = new byte[8];
        byte[] byArray2 = new byte[byArray.length - 8];
        System.arraycopy(byArray, 0, this.cfr_renamed_1, 0, 8);
        System.arraycopy(byArray, 8, byArray2, 0, byArray.length - 8);
        sprvkl sprvkl2 = this;
        this.cfr_renamed_4 = new sprkpk(sprvkl2.cfr_renamed_91, sprvkl2.cfr_renamed_1);
        this.cfr_renamed_3.cfr_renamed_5535(false, this.cfr_renamed_4);
        byte[] byArray3 = new byte[byArray2.length];
        int n5 = n = 0;
        while (n5 != byArray3.length) {
            int n6 = n;
            this.cfr_renamed_3.cfr_renamed_3064(byArray2, n6, byArray3, n6);
            n5 = n += n3;
        }
        byte[] byArray4 = new byte[byArray3.length - 8];
        byte[] byArray5 = new byte[8];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length - 8);
        System.arraycopy(byArray3, byArray3.length - 8, byArray5, 0, 8);
        if (!this.cfr_renamed_3637(byArray4, byArray5)) {
            throw new sprull(sprpnn.cfr_renamed_9("Vmpf~v`h5l{v|ap%vlempwa`mq5lf%vjgw`ua`q"));
        }
        return byArray4;
    }

    public sprvkl() {
        this.cfr_renamed_119 = new byte[20];
    }

    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprbj sprbj3;
        SecureRandom secureRandom;
        sprbj arg1;
        this.cfr_renamed_112 = bl;
        sprvkl sprvkl2 = this;
        sprvkl2.cfr_renamed_3 = new sprhqk(new sprxhl());
        if (sprbj2 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            arg1 = sprbgk2.cfr_renamed_284();
            secureRandom = sprbgk2.cfr_renamed_1295();
            sprbj3 = arg1;
        } else {
            secureRandom = sprybl.cfr_renamed_2794();
            sprbj3 = arg1;
        }
        if (sprbj3 instanceof sprtpk) {
            this.cfr_renamed_91 = (sprtpk)arg1;
            if (this.cfr_renamed_112) {
                this.cfr_renamed_1 = new byte[8];
                secureRandom.nextBytes(this.cfr_renamed_1);
                sprvkl sprvkl3 = this;
                this.cfr_renamed_4 = new sprkpk(sprvkl3.cfr_renamed_91, sprvkl3.cfr_renamed_1);
                return;
            }
        } else if (arg1 instanceof sprkpk) {
            this.cfr_renamed_4 = (sprkpk)arg1;
            sprvkl sprvkl4 = this;
            sprvkl4.cfr_renamed_1 = sprvkl4.cfr_renamed_4.cfr_renamed_1205();
            sprvkl4.cfr_renamed_91 = (sprtpk)sprvkl4.cfr_renamed_4.cfr_renamed_284();
            if (this.cfr_renamed_112) {
                if (this.cfr_renamed_1 == null || this.cfr_renamed_1.length != 8) {
                    throw new IllegalArgumentException(sprbye.cfr_renamed_9("AY(f{/f`|/0/gl|j||"));
                }
            } else {
                throw new IllegalArgumentException(sprpnn.cfr_renamed_9("\\zp5v}j`iq%{ja%fpeuy|5d{%\\S5czw5p{rgdeu|kr"));
            }
        }
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        if (!this.cfr_renamed_112) {
            throw new IllegalStateException(sprbye.cfr_renamed_9("F`|/aaa{andfrjl/n`z/\u007f}i\u007fxffh"));
        }
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        byte[] byArray2 = this.cfr_renamed_3636(byArray);
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        int n2 = this.cfr_renamed_3.cfr_renamed_1195();
        if (byArray3.length % n2 != 0) {
            throw new IllegalStateException(sprpnn.cfr_renamed_9("Kzq5h`ialeip%zc5gyjvn5ipkrq}"));
        }
        this.cfr_renamed_3.cfr_renamed_5535(true, this.cfr_renamed_4);
        byte[] byArray4 = new byte[byArray3.length];
        int n3 = n = 0;
        while (n3 != byArray3.length) {
            int n4 = n;
            this.cfr_renamed_3.cfr_renamed_3064(byArray3, n4, byArray4, n4);
            n3 = n += n2;
        }
        byte[] byArray5 = new byte[this.cfr_renamed_1.length + byArray4.length];
        System.arraycopy(this.cfr_renamed_1, 0, byArray5, 0, this.cfr_renamed_1.length);
        System.arraycopy(byArray4, 0, byArray5, this.cfr_renamed_1.length, byArray4.length);
        sproze.cfr_renamed_5249(byArray5);
        sprkpk sprkpk2 = new sprkpk(this.cfr_renamed_91, cfr_renamed_2);
        this.cfr_renamed_3.cfr_renamed_5535(true, sprkpk2);
        int n5 = 0;
        int n6 = n5;
        while (n6 != byArray5.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray5, n5, byArray5, n5);
            n6 = n5 += n2;
        }
        return byArray5;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprbye.cfr_renamed_9("LJ[jlj");
    }

    private /* synthetic */ boolean cfr_renamed_3637(byte[] arg0, byte[] arg1) {
        return sproze.cfr_renamed_559(this.cfr_renamed_3636(arg0), arg1);
    }

    private /* synthetic */ byte[] cfr_renamed_3636(byte[] arg0) {
        byte[] byArray = new byte[8];
        this.cfr_renamed_0.cfr_renamed_1197(arg0, 0, arg0.length);
        sprvkl sprvkl2 = this;
        sprvkl2.cfr_renamed_0.cfr_renamed_1219(sprvkl2.cfr_renamed_119, 0);
        System.arraycopy(this.cfr_renamed_119, 0, byArray, 0, 8);
        return byArray;
    }
}

