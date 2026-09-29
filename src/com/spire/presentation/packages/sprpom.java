/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprpom
extends sprqqe {
    private final int cfr_renamed_1;
    private static final int cfr_renamed_2 = 512;
    private static final byte[] cfr_renamed_3 = new byte[0];
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpom(int n, byte[] byArray) {
        void arg0;
        sprpom sprpom2 = this;
        sprpom2.cfr_renamed_1 = arg0;
        sprpom2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm();
        if (this.cfr_renamed_1 != 512) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        }
        if (this.cfr_renamed_4.length != 0) {
            sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_11206()));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpom(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(sproxfa.cfr_renamed_9("p\u0002r\u0012f\t`\u0002#\u0014j\u001dfGd\u0015f\u0006w\u0002qGw\u000fb\t#U"));
        }
        if (arg0.cfr_renamed_84() == 2) {
            sprpom sprpom2 = this;
            sprpom2.cfr_renamed_1 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_5023();
            sprpom2.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_186());
            return;
        }
        if (arg0.cfr_renamed_84() == 1) {
            if (arg0.cfr_renamed_85(0) instanceof sprktm) {
                sprpom sprpom3 = this;
                sprpom3.cfr_renamed_1 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_5023();
                sprpom3.cfr_renamed_4 = cfr_renamed_3;
                return;
            }
            this.cfr_renamed_1 = 512;
            this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_186());
            return;
        }
        sprpom sprpom4 = this;
        sprpom4.cfr_renamed_1 = 512;
        sprpom4.cfr_renamed_4 = cfr_renamed_3;
    }

    public static sprpom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpom) {
            return (sprpom)arg0;
        }
        if (arg0 != null) {
            return new sprpom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_11206() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public int cfr_renamed_11207() {
        return this.cfr_renamed_1;
    }

    public sprpom(int n) {
        this.cfr_renamed_1 = n;
        this.cfr_renamed_4 = cfr_renamed_3;
    }
}

