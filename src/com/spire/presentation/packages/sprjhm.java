/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprveda;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprjhm
extends sprqqe {
    public spraem cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprgbf cfr_renamed_4;

    public static sprjhm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjhm) {
            return (sprjhm)arg0;
        }
        if (arg0 != null) {
            return new sprjhm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprjhm(sprnbm sprnbm2, BigInteger bigInteger) {
        this(new spraem(new sprigm((sprnbm)arg0)), new sprktm((BigInteger)arg1));
        void arg1;
        void arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprjhm sprjhm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprjhm2.cfr_renamed_3);
        if (sprjhm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprjhm(spraem arg0, BigInteger arg1) {
        this(arg0, new sprktm(arg1));
    }

    public sprgbf cfr_renamed_4509() {
        return this.cfr_renamed_4;
    }

    public sprktm cfr_renamed_405() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjhm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprveda.cfr_renamed_9("\"F\u0004\u0007\u0013B\u0011R\u0005I\u0003B@T\t]\u0005\u001d@")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_2 = spraem.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public static sprjhm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjhm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprjhm(spraem spraem2, sprktm sprktm2) {
        void arg0;
        sprjhm sprjhm2 = this;
        sprjhm2.cfr_renamed_2 = arg0;
        sprjhm2.cfr_renamed_3 = sprktm2;
    }

    public spraem cfr_renamed_102() {
        return this.cfr_renamed_2;
    }
}

