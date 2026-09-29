/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvc;
import com.spire.presentation.packages.sprdkd;
import com.spire.presentation.packages.sprexc;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprfsc;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprhld;
import com.spire.presentation.packages.spriid;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprljd;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprobd;
import com.spire.presentation.packages.sprohd;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprqdd;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprqmd;
import com.spire.presentation.packages.sprrld;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprwxc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzxc;
import java.io.IOException;

public class sprnbd
extends sprobd {
    public sprzxc cfr_renamed_3186(sprsc arg0, int arg1, int arg2) throws IOException {
        return new sprzxc(arg0, this.cfr_renamed_3187(), this.cfr_renamed_3187(), this.cfr_renamed_3188(arg2), this.cfr_renamed_3188(arg2), arg1);
    }

    public sprzxc cfr_renamed_3189(sprsc arg0, int arg1) throws IOException {
        return new sprzxc(arg0, this.cfr_renamed_3190(), this.cfr_renamed_3190(), this.cfr_renamed_3188(arg1), this.cfr_renamed_3188(arg1), 24);
    }

    public sprmc cfr_renamed_3191(sprsc arg0) throws IOException {
        return new sprwxc(arg0);
    }

    public sprqk cfr_renamed_3192() {
        return new sprdkd();
    }

    public sprff cfr_renamed_3187() {
        return new sprgnd(this.cfr_renamed_3193());
    }

    public sprbvc cfr_renamed_3194(sprsc arg0, int arg1, int arg2) throws IOException {
        return new sprbvc(arg0, this.cfr_renamed_3192(), this.cfr_renamed_3192(), this.cfr_renamed_3188(arg2), this.cfr_renamed_3188(arg2), arg1, false);
    }

    public sprff cfr_renamed_3195() {
        return new sprohd();
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprlc cfr_renamed_3188(int arg0) throws IOException {
        switch (arg0) {
            case 0: {
                return null;
            }
            case 1: {
                return sprzsc.cfr_renamed_2640((short)1);
            }
            case 2: {
                return sprzsc.cfr_renamed_2640((short)2);
            }
            case 3: {
                return sprzsc.cfr_renamed_2640((short)4);
            }
            case 4: {
                return sprzsc.cfr_renamed_2640((short)5);
            }
            case 5: {
                return sprzsc.cfr_renamed_2640((short)6);
            }
        }
        throw new spryad(80);
    }

    public sprexc cfr_renamed_3196(sprsc arg0, int arg1) throws IOException {
        return new sprexc(arg0, this.cfr_renamed_3188(arg1), this.cfr_renamed_3188(arg1));
    }

    public sprff spr\u3027\ufe34() {
        return new sprgnd(this.cfr_renamed_3195());
    }

    public sprpj cfr_renamed_3197() {
        return new sprljd(this.cfr_renamed_3193());
    }

    public sprfsc cfr_renamed_3198(sprsc arg0, int arg1, int arg2) throws IOException {
        return new sprfsc(arg0, this.cfr_renamed_3197(), this.cfr_renamed_3197(), arg1, arg2);
    }

    public sprbvc cfr_renamed_3199(sprsc arg0, int arg1, int arg2, int arg3) throws IOException {
        return new sprbvc(arg0, this.spr\u3180\ufe34(arg1), this.spr\u3180\ufe34(arg1), this.cfr_renamed_3188(arg3), this.cfr_renamed_3188(arg3), arg2, true);
    }

    public sprqk spr\u3180\ufe34(int arg0) {
        return new sprqdd(arg0);
    }

    public sprpj cfr_renamed_3200() {
        return new sprhld(this.cfr_renamed_3195());
    }

    public sprzxc cfr_renamed_3201(sprsc arg0, int arg1) throws IOException {
        return new sprzxc(arg0, this.cfr_renamed_3202(), this.cfr_renamed_3202(), this.cfr_renamed_3188(arg1), this.cfr_renamed_3188(arg1), 16);
    }

    public sprff cfr_renamed_3193() {
        return new sprqmd();
    }

    public sprff cfr_renamed_3202() {
        return new sprgnd(new spriid());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public sprmc cfr_renamed_3060(sprsc arg0, int arg1, int arg2) throws IOException {
        switch (arg1) {
            case 7: {
                return this.cfr_renamed_3189(arg0, arg2);
            }
            case 102: {
                return this.cfr_renamed_3191(arg0);
            }
            case 8: {
                return this.cfr_renamed_3186(arg0, 16, arg2);
            }
            case 15: {
                return this.cfr_renamed_3198(arg0, 16, 16);
            }
            case 16: {
                return this.cfr_renamed_3198(arg0, 16, 8);
            }
            case 17: {
                return this.cfr_renamed_3198(arg0, 32, 16);
            }
            case 18: {
                return this.cfr_renamed_3198(arg0, 32, 8);
            }
            case 10: {
                return this.cfr_renamed_3203(arg0, 16, 16);
            }
            case 9: {
                return this.cfr_renamed_3186(arg0, 32, arg2);
            }
            case 11: {
                return this.cfr_renamed_3203(arg0, 32, 16);
            }
            case 12: {
                return this.cfr_renamed_3204(arg0, 16, arg2);
            }
            case 19: {
                return this.cfr_renamed_3205(arg0, 16, 16);
            }
            case 13: {
                return this.cfr_renamed_3204(arg0, 32, arg2);
            }
            case 20: {
                return this.cfr_renamed_3205(arg0, 32, 16);
            }
            case 100: {
                return this.cfr_renamed_3199(arg0, 12, 32, arg2);
            }
            case 0: {
                return this.cfr_renamed_3196(arg0, arg2);
            }
            case 2: {
                return this.cfr_renamed_3194(arg0, 16, arg2);
            }
            case 101: {
                return this.cfr_renamed_3199(arg0, 20, 32, arg2);
            }
            case 14: {
                return this.cfr_renamed_3201(arg0, arg2);
            }
        }
        throw new spryad(80);
    }

    public sprfsc cfr_renamed_3203(sprsc arg0, int arg1, int arg2) throws IOException {
        return new sprfsc(arg0, this.cfr_renamed_3206(), this.cfr_renamed_3206(), arg1, arg2);
    }

    public sprfsc cfr_renamed_3205(sprsc arg0, int arg1, int arg2) throws IOException {
        return new sprfsc(arg0, this.cfr_renamed_3200(), this.cfr_renamed_3200(), arg1, arg2);
    }

    public sprzxc cfr_renamed_3204(sprsc arg0, int arg1, int arg2) throws IOException {
        return new sprzxc(arg0, this.spr\u3027\ufe34(), this.spr\u3027\ufe34(), this.cfr_renamed_3188(arg2), this.cfr_renamed_3188(arg2), arg1);
    }

    public sprpj cfr_renamed_3206() {
        return new sprhld(this.cfr_renamed_3193());
    }

    public sprff cfr_renamed_3190() {
        return new sprgnd(new sprrld());
    }
}

