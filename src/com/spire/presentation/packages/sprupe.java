/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvne;
import com.spire.presentation.packages.sprvse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprupe
extends sprkra {
    private spruhe cfr_renamed_93;
    private sprmra cfr_renamed_86;
    private sprooe cfr_renamed_152;
    private sprmra cfr_renamed_112;
    private sprije cfr_renamed_119;
    private spruhe cfr_renamed_91;
    private sprooe cfr_renamed_0;
    private sprszd cfr_renamed_1;
    private sprdce cfr_renamed_2;
    private sprbne cfr_renamed_3;
    private sprvne cfr_renamed_4;

    public sprmra cfr_renamed_4509() {
        return this.cfr_renamed_86;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprupe(sprbne arg0) {
        spryte spryte2;
        this.cfr_renamed_3 = arg0;
        Enumeration enumeration = this.cfr_renamed_3.cfr_renamed_329();
        block12: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte2 = (spryte)enumeration.nextElement();
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_152 = sprooe.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
                case 1: {
                    this.cfr_renamed_0 = sprooe.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
                case 2: {
                    this.cfr_renamed_119 = sprije.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
                case 3: {
                    this.cfr_renamed_91 = spruhe.cfr_renamed_341(spryte2, true);
                    continue block12;
                }
                case 4: {
                    this.cfr_renamed_4 = sprvne.cfr_renamed_23(sprbne.cfr_renamed_341(spryte2, false));
                    continue block12;
                }
                case 5: {
                    this.cfr_renamed_93 = spruhe.cfr_renamed_341(spryte2, true);
                    continue block12;
                }
                case 6: {
                    this.cfr_renamed_2 = sprdce.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
                case 7: {
                    this.cfr_renamed_86 = sprmra.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
                case 8: {
                    this.cfr_renamed_112 = sprmra.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
                case 9: {
                    this.cfr_renamed_1 = sprszd.cfr_renamed_341(spryte2, false);
                    continue block12;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprvse.cfr_renamed_9("nCpCtZu\roL|\u0017;")).append(spryte2.cfr_renamed_312()).toString());
    }

    public spruhe cfr_renamed_1485() {
        return this.cfr_renamed_93;
    }

    public sprvne cfr_renamed_4821() {
        return this.cfr_renamed_4;
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_91;
    }

    public sprije cfr_renamed_4822() {
        return this.cfr_renamed_119;
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_1;
    }

    public static sprupe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprupe) {
            return (sprupe)arg0;
        }
        if (arg0 != null) {
            return new sprupe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmra cfr_renamed_4823() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_152.cfr_renamed_97().intValue();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    public sprdce cfr_renamed_1157() {
        return this.cfr_renamed_2;
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_0;
    }
}

