/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmne;
import com.spire.presentation.packages.sprrue;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwry;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.spryte;

public class sprpee
extends sprkra
implements sprkj {
    public static final int cfr_renamed_119 = 3;
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 2;
    public sprx cfr_renamed_1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 200;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprpee(int n, String string) {
        void arg0;
        String arg1;
        if (string.length() > 200) {
            arg1 = arg1.substring(0, 200);
        }
        this.cfr_renamed_4 = arg0;
        switch (arg0) {
            case 0: {
                this.cfr_renamed_1 = new sprcae(arg1);
                return;
            }
            case 2: {
                this.cfr_renamed_1 = new sprxte(arg1);
                return;
            }
            case 3: {
                this.cfr_renamed_1 = new sprrue(arg1);
                return;
            }
            case 1: {
                this.cfr_renamed_1 = new sprmne(arg1);
                return;
            }
        }
        this.cfr_renamed_1 = new sprxte(arg1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return (sprvva)((Object)this.cfr_renamed_1);
    }

    public sprpee(String string) {
        String arg0;
        if (string.length() > 200) {
            arg0 = arg0.substring(0, 200);
        }
        sprpee sprpee2 = this;
        sprpee2.cfr_renamed_4 = 2;
        sprpee sprpee3 = this;
        sprpee2.cfr_renamed_1 = new sprxte(arg0);
    }

    private /* synthetic */ sprpee(sprx sprx2) {
        this.cfr_renamed_1 = sprx2;
    }

    public static sprpee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprpee.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public String cfr_renamed_314() {
        return this.cfr_renamed_1.cfr_renamed_314();
    }

    public static sprpee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprx) {
            return new sprpee((sprx)arg0);
        }
        if (arg0 == null || arg0 instanceof sprpee) {
            return (sprpee)arg0;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwry.cfr_renamed_9("T-Q$Z QaR#W$^5\u001d(SaZ$I\bS2I S\"X{\u001d")).append(arg0.getClass().getName()).toString());
    }
}

