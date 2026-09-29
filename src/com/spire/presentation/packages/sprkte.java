/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbco;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprkte
extends sprkra {
    private sprmra cfr_renamed_91;
    private sprxue cfr_renamed_0;
    private sprmra cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprkte(sprbne sprbne2) {
        sprbne sprbne3 = sprbne2;
        int n = 0;
        while (true) {
            void arg0;
            if (!(sprbne3.cfr_renamed_85(n) instanceof spryte)) {
                this.cfr_renamed_91 = sprmra.cfr_renamed_23(arg0.cfr_renamed_85(n));
                return;
            }
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_2 = sprije.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_3 = sprije.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_1 = sprmra.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 3: {
                    this.cfr_renamed_4 = sprije.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 4: {
                    this.cfr_renamed_0 = sprxue.cfr_renamed_341(spryte2, false);
                    break;
                }
            }
            ++n;
            sprbne3 = arg0;
        }
    }

    public sprmra cfr_renamed_4361() {
        return this.cfr_renamed_91;
    }

    public sprmra cfr_renamed_4360() {
        return this.cfr_renamed_1;
    }

    public sprije cfr_renamed_4359() {
        return this.cfr_renamed_3;
    }

    public sprxue cfr_renamed_4357() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprkte sprkte2 = this;
        sprlre sprlre3 = sprlre2;
        sprkte sprkte3 = this;
        sprlre sprlre4 = sprlre2;
        sprkte sprkte4 = this;
        sprkte4.cfr_renamed_4814(sprlre2, 0, sprkte4.cfr_renamed_2);
        this.cfr_renamed_4814(sprlre4, 1, this.cfr_renamed_3);
        sprkte3.cfr_renamed_4814(sprlre4, 2, this.cfr_renamed_1);
        sprkte3.cfr_renamed_4814(sprlre2, 3, this.cfr_renamed_4);
        sprkte2.cfr_renamed_4814(sprlre3, 4, this.cfr_renamed_0);
        sprlre3.cfr_renamed_49(sprkte2.cfr_renamed_91);
        return new sprpse(sprlre2);
    }

    public sprije cfr_renamed_4356() {
        return this.cfr_renamed_2;
    }

    public sprije cfr_renamed_4358() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprkte(sprije sprije2, sprije sprije3, sprmra sprmra2, sprije sprije4, sprxue sprxue2, sprmra sprmra3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        if (sprmra3 == null) {
            throw new IllegalArgumentException(sprbco.cfr_renamed_9("tU=S\u0005Q?E6\u0017sS2^=_'\u00101Us^&\\?"));
        }
        sprkte sprkte2 = this;
        sprkte sprkte3 = this;
        this.cfr_renamed_2 = arg0;
        sprkte3.cfr_renamed_3 = arg1;
        sprkte3.cfr_renamed_1 = arg2;
        sprkte2.cfr_renamed_4 = arg3;
        sprkte2.cfr_renamed_0 = arg4;
        this.cfr_renamed_91 = arg5;
    }

    public static sprkte cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkte) {
            return (sprkte)arg0;
        }
        if (arg0 != null) {
            return new sprkte(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4814(sprlre arg0, int arg1, spra arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_49(new sprhse(false, arg1, arg2));
        }
    }
}

