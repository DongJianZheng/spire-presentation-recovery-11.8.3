/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprefm;
import com.spire.presentation.packages.sprieba;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprozz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spryjm
extends sprqqe {
    public sprefm cfr_renamed_91;
    public spraem cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    private int cfr_renamed_2;
    public sprjhm cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryjm(sprnvm sprnvm2) {
        this.cfr_renamed_2 = 1;
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: {
                void arg0;
                while (false) {
                }
                spryjm spryjm2 = this;
                this.cfr_renamed_3 = sprjhm.cfr_renamed_5085((sprnvm)arg0, true);
                break;
            }
            case 1: {
                void arg0;
                spryjm spryjm2 = this;
                this.cfr_renamed_0 = spraem.cfr_renamed_5085((sprnvm)arg0, true);
                break;
            }
            default: {
                throw new IllegalArgumentException(sprieba.cfr_renamed_9("c\\}\\yEx\u0012bSq\u0012\u007f\\6zy^rWd"));
            }
        }
        spryjm2.cfr_renamed_2 = 0;
    }

    public spryjm(sprjhm arg0) {
        this(arg0, 1);
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public static spryjm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryjm) {
            return (spryjm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new spryjm(sprnvm.cfr_renamed_23(arg0));
        }
        if (arg0 != null) {
            return new spryjm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprefm cfr_renamed_409() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spryjm(sprszm sprszm2) {
        int n;
        void arg0;
        this.cfr_renamed_2 = 1;
        if (sprszm2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprozz.cfr_renamed_9("\u0011\u00027C \u0006\"\u00166\r0\u0006s\u0010:\u00196Ys")).append(arg0.cfr_renamed_84()).toString());
        }
        int n2 = n = 0;
        while (true) {
            if (n2 == arg0.cfr_renamed_84()) {
                this.cfr_renamed_2 = 1;
                return;
            }
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprjhm.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_0 = spraem.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 2: {
                    this.cfr_renamed_91 = sprefm.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprieba.cfr_renamed_9("c\\}\\yEx\u0012bSq\u0012\u007f\\6zy^rWd"));
                }
            }
            n2 = ++n;
        }
    }

    public spryjm(sprefm sprefm2) {
        spryjm spryjm2 = this;
        spryjm2.cfr_renamed_2 = 1;
        spryjm2.cfr_renamed_91 = sprefm2;
    }

    public spryjm(spraem arg0) {
        this(arg0, 1);
    }

    /*
     * WARNING - void declaration
     */
    public spryjm(sprjhm sprjhm2, int n) {
        void arg0;
        spryjm spryjm2 = this;
        this.cfr_renamed_2 = 1;
        spryjm2.cfr_renamed_3 = arg0;
        spryjm2.cfr_renamed_2 = n;
    }

    /*
     * WARNING - void declaration
     */
    public spryjm(spraem spraem2, int n) {
        void arg0;
        spryjm spryjm2 = this;
        this.cfr_renamed_2 = 1;
        spryjm2.cfr_renamed_0 = arg0;
        spryjm2.cfr_renamed_2 = n;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_2 == 1) {
            sprrvm sprrvm2 = new sprrvm(3);
            if (this.cfr_renamed_3 != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
            }
            if (this.cfr_renamed_0 != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_0));
            }
            if (this.cfr_renamed_91 != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_91));
            }
            return new sprcen(sprrvm2);
        }
        if (this.cfr_renamed_0 != null) {
            return new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_0);
        }
        return new sprycn(true, 0, (sprco)this.cfr_renamed_3);
    }

    public spraem cfr_renamed_407() {
        return this.cfr_renamed_0;
    }

    public sprjhm cfr_renamed_404() {
        return this.cfr_renamed_3;
    }
}

