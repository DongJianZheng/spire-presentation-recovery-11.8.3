/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryae;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprygaa;

public class sprdzl
extends sprqqe {
    public sprddm cfr_renamed_102;
    public sprvhm cfr_renamed_93;
    public sprktm cfr_renamed_86;
    public sprgbf cfr_renamed_152;
    public sprrcm cfr_renamed_112;
    public sprktm cfr_renamed_119;
    public sprnbm cfr_renamed_91;
    public sprgbf cfr_renamed_0;
    public sprrcm cfr_renamed_1;
    public sprszm cfr_renamed_2;
    public sprnbm cfr_renamed_3;
    public sprhgm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprdzl(sprszm arg0) {
        sprdzl sprdzl2;
        int n = 0;
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2.cfr_renamed_85(0) instanceof sprnvm) {
            this.cfr_renamed_86 = sprktm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(0), true);
        } else {
            n = -1;
            sprdzl sprdzl3 = this;
            sprdzl3.cfr_renamed_86 = new sprktm(0L);
        }
        boolean bl = false;
        boolean bl2 = false;
        if (this.cfr_renamed_86.cfr_renamed_7241(0)) {
            bl = true;
            sprdzl2 = this;
        } else if (this.cfr_renamed_86.cfr_renamed_7241(1)) {
            bl2 = true;
            sprdzl2 = this;
        } else {
            if (!this.cfr_renamed_86.cfr_renamed_7241(2)) {
                throw new IllegalArgumentException(spryae.cfr_renamed_9("/'+10-7b774 <0y,66y0<!6%7+*'="));
            }
            sprdzl2 = this;
        }
        sprdzl2.cfr_renamed_119 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n + 1));
        sprszm sprszm2 = arg0;
        int n2 = n;
        this.cfr_renamed_102 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(n2 + 2));
        this.cfr_renamed_3 = sprnbm.cfr_renamed_23(sprszm2.cfr_renamed_85(n2 + 3));
        sprszm sprszm3 = (sprszm)sprszm2.cfr_renamed_85(n + 4);
        sprszm sprszm4 = arg0;
        int n3 = n;
        sprdzl sprdzl4 = this;
        sprdzl4.cfr_renamed_112 = sprrcm.cfr_renamed_23(sprszm3.cfr_renamed_85(0));
        sprdzl4.cfr_renamed_1 = sprrcm.cfr_renamed_23(sprszm3.cfr_renamed_85(1));
        this.cfr_renamed_91 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(n3 + 5));
        this.cfr_renamed_93 = sprvhm.cfr_renamed_23(sprszm4.cfr_renamed_85(n3 + 6));
        int n4 = sprszm4.cfr_renamed_84() - (n + 6) - 1;
        if (n4 != 0 && bl) {
            throw new IllegalArgumentException(sprygaa.cfr_renamed_9("@UDC__X\u0010\u0007\u0010UUDD_V_SWDS\u0010U_XDWYXC\u0016UNDDQ\u0016TWDW"));
        }
        int n5 = n4;
        while (n5 > 0) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n + 6 + n4);
            switch (sprnvm2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_152 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_0 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 3: {
                    if (bl2) {
                        throw new IllegalArgumentException(spryae.cfr_renamed_9("/'+10-7bkb:'+60$0!86<b:#7,66y!6,-#0,y'!6<,*+6,*"));
                    }
                    this.cfr_renamed_4 = sprhgm.cfr_renamed_23(sprszm.cfr_renamed_5085(sprnvm2, true));
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprygaa.cfr_renamed_9("eX[X_A^\u0016DWW\u0016UXSYEXDSBST\u0016YX\u0010EDDEUDCBS\n\u0016")).append(sprnvm2.cfr_renamed_312()).toString());
                }
            }
            n5 = --n4;
        }
        return;
    }

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3;
        if (sprjcf.cfr_renamed_5153(spryae.cfr_renamed_9(":-4l*200<l)14-='5l*':7++-;w:lr`l8.5-.\u001d7-7o='+\u001d- *!<0-")) != null) {
            if (sprjcf.cfr_renamed_5159(sprygaa.cfr_renamed_9("U_[\u001eE@_BS\u001eFC[_RUZ\u001eEUUEDYBI\u0018H\u0003\u0000\u000f\u001eW\\Z_AoX_X\u001dRUDoBRESSBB"))) {
                return this.cfr_renamed_2;
            }
        } else {
            return this.cfr_renamed_2;
        }
        sprrvm sprrvm4 = new sprrvm();
        if (!this.cfr_renamed_86.cfr_renamed_7241(0)) {
            sprrvm4.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_86));
        }
        sprrvm sprrvm5 = sprrvm4;
        sprdzl sprdzl2 = this;
        sprrvm4.cfr_renamed_5004(sprdzl2.cfr_renamed_119);
        sprrvm5.cfr_renamed_5004(sprdzl2.cfr_renamed_102);
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm sprrvm6 = sprrvm3 = new sprrvm(2);
        sprrvm6.cfr_renamed_5004(this.cfr_renamed_112);
        sprrvm6.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm4.cfr_renamed_5004(new sprcen(sprrvm3));
        sprrvm sprrvm7 = sprrvm4;
        if (this.cfr_renamed_91 != null) {
            sprrvm7.cfr_renamed_5004(this.cfr_renamed_91);
            sprrvm2 = sprrvm4;
        } else {
            sprrvm7.cfr_renamed_5004(new sprcen());
            sprrvm2 = sprrvm4;
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_93);
        if (this.cfr_renamed_152 != null) {
            sprrvm4.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_152));
        }
        if (this.cfr_renamed_0 != null) {
            sprrvm4.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_0));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm4.cfr_renamed_5004(new sprycn(true, 3, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm4);
    }

    public static sprdzl cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprdzl.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_119;
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_93;
    }

    public int cfr_renamed_569() {
        return this.cfr_renamed_86.cfr_renamed_5023() + 1;
    }

    public sprrcm cfr_renamed_2146() {
        return this.cfr_renamed_1;
    }

    public sprgbf cfr_renamed_2156() {
        return this.cfr_renamed_0;
    }

    public sprgbf cfr_renamed_2153() {
        return this.cfr_renamed_152;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_86;
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public sprrcm cfr_renamed_2148() {
        return this.cfr_renamed_112;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_4;
    }

    public static sprdzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdzl) {
            return (sprdzl)arg0;
        }
        if (arg0 != null) {
            return new sprdzl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_79() {
        return this.cfr_renamed_102;
    }
}

