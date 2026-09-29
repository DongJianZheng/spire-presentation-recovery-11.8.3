/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlhh;
import com.spire.presentation.packages.sprljaa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxeh;
import com.spire.presentation.packages.sprxgf;

public class sprwdh
extends sprqqe {
    private final sprktm cfr_renamed_1;
    private final sprbfh cfr_renamed_2;
    private final sprxeh cfr_renamed_3;
    private final sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwdh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprljaa.cfr_renamed_9("Q\u001bD\u0006W\u0017Q\u0007\u0014\u0010Q\u0012A\u0006Z\u0000QCG\nN\u0006\u0014\fRC\u0000"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprxeh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprenh.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_8134(sprktm.class);
        this.cfr_renamed_4 = sprenh.cfr_renamed_23(arg0.cfr_renamed_85(2)).cfr_renamed_8134(sprktm.class);
        this.cfr_renamed_2 = sprenh.cfr_renamed_23(arg0.cfr_renamed_85(3)).cfr_renamed_8134(sprbfh.class);
    }

    public sprktm cfr_renamed_8279() {
        return this.cfr_renamed_1;
    }

    public sprbfh cfr_renamed_8280() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_1);
        sprcoArray[2] = sprenh.cfr_renamed_23(this.cfr_renamed_4);
        sprcoArray[3] = sprenh.cfr_renamed_23(this.cfr_renamed_2);
        return new sprcen(sprcoArray);
    }

    public static sprwdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwdh) {
            return (sprwdh)arg0;
        }
        if (arg0 != null) {
            return new sprwdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprwdh(sprxeh sprxeh2, sprktm sprktm2, sprktm sprktm3, sprbfh sprbfh2) {
        void arg2;
        void arg1;
        void arg0;
        sprwdh sprwdh2 = this;
        sprwdh sprwdh3 = this;
        sprwdh3.cfr_renamed_3 = arg0;
        sprwdh3.cfr_renamed_1 = arg1;
        sprwdh2.cfr_renamed_4 = arg2;
        sprwdh2.cfr_renamed_2 = sprbfh2;
    }

    public static sprlhh cfr_renamed_7843() {
        return new sprlhh();
    }

    public sprktm cfr_renamed_8281() {
        return this.cfr_renamed_4;
    }

    public sprxeh cfr_renamed_8264() {
        return this.cfr_renamed_3;
    }
}

