/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvca;
import com.spire.presentation.packages.sprcoca;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrfh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spruhh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_152 = 4;
    public static final int cfr_renamed_112 = 5;
    public static final int cfr_renamed_119 = 6;
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 3;
    private final sprrfh cfr_renamed_1;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    private final int cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        spruhh spruhh2 = this;
        return new sprycn(spruhh2.cfr_renamed_4, spruhh2.cfr_renamed_1);
    }

    public static spruhh cfr_renamed_8408(sprrfh arg0) {
        return new spruhh(4, arg0);
    }

    public static spruhh cfr_renamed_8409(sprrfh arg0) {
        return new spruhh(0, arg0);
    }

    public String toString() {
        switch (this.cfr_renamed_4) {
            case 0: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprcoca.cfr_renamed_9("\u0001i");
            }
            case 1: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprbvca.cfr_renamed_9("]\u0012");
            }
            case 2: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprcoca.cfr_renamed_9("TI\u0011Y\u001bT\u0010I");
            }
            case 3: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprbvca.cfr_renamed_9("a](^4D$");
            }
            case 4: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprcoca.cfr_renamed_9("TR\u001bO\u0006I");
            }
            case 5: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprbvca.cfr_renamed_9("\u00102Y9D8\u0010)_4B2");
            }
            case 6: {
                return this.cfr_renamed_1.cfr_renamed_4 + sprcoca.cfr_renamed_9("TC\u0011[\u0006I");
            }
        }
        return this.cfr_renamed_1.cfr_renamed_4 + sprbvca.cfr_renamed_9("aE/[/_6^aS)_(S$");
    }

    public static spruhh cfr_renamed_8410(sprrfh arg0) {
        return new spruhh(1, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_4;
    }

    public sprrfh cfr_renamed_8333() {
        return this.cfr_renamed_1;
    }

    public static spruhh cfr_renamed_8411(sprrfh arg0) {
        return new spruhh(2, arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ spruhh(sprnvm sprnvm2) {
        spruhh spruhh2 = this;
        spruhh2.cfr_renamed_4 = sprnvm2.cfr_renamed_312();
        switch (spruhh2.cfr_renamed_4) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                try {
                    void arg0;
                    this.cfr_renamed_1 = sprrfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                    return;
                }
                catch (Exception exception) {
                    throw new IllegalStateException(exception.getMessage(), exception);
                }
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("S\u001aL\u0015V\u001d^TY\u001cU\u001dY\u0011\u001a\u0002[\u0018O\u0011\u001a")).append(this.cfr_renamed_4).toString());
    }

    public static spruhh cfr_renamed_8412(sprrfh arg0) {
        return new spruhh(3, arg0);
    }

    public static spruhh cfr_renamed_8413(sprrfh arg0) {
        return new spruhh(5, arg0);
    }

    public static spruhh cfr_renamed_8414(sprrfh arg0) {
        return new spruhh(6, arg0);
    }

    public static spruhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruhh) {
            return (spruhh)arg0;
        }
        if (arg0 != null) {
            return new spruhh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spruhh(int n, sprrfh sprrfh2) {
        void arg0;
        spruhh spruhh2 = this;
        spruhh2.cfr_renamed_4 = arg0;
        spruhh2.cfr_renamed_1 = sprrfh2;
    }
}

