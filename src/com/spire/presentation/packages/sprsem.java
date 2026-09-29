/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprugg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxmf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class sprsem
extends sprqqe {
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(0L);
    private sprktm cfr_renamed_2;
    private sprigm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprsem(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprigm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        switch (sprszm2.cfr_renamed_84()) {
            case 1: {
                return;
            }
            case 2: {
                sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(1));
                switch (sprnvm2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_2 = sprktm.cfr_renamed_5085(sprnvm2, false);
                        return;
                    }
                    case 1: {
                        this.cfr_renamed_4 = sprktm.cfr_renamed_5085(sprnvm2, false);
                        return;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprxmf.cfr_renamed_9("Oti5ytj5c``whg75")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            case 3: {
                sprnvm sprnvm3 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(1));
                if (sprnvm3.cfr_renamed_312() != 0) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprugg.cfr_renamed_9("G}a<q}b<kih~`n%zjn%;hukuhih;?<")).append(sprnvm3.cfr_renamed_312()).toString());
                }
                this.cfr_renamed_2 = sprktm.cfr_renamed_5085(sprnvm3, false);
                sprnvm3 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(2));
                if (sprnvm3.cfr_renamed_312() != 1) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprxmf.cfr_renamed_9("Oti5ytj5c``whg-sbg-2`tu|```275")).append(sprnvm3.cfr_renamed_312()).toString());
                }
                this.cfr_renamed_4 = sprktm.cfr_renamed_5085(sprnvm3, false);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprugg.cfr_renamed_9("^dx%o`mpyk\u007f`<vu\u007fy?<")).append(arg0.cfr_renamed_84()).toString());
    }

    public static sprsem cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return new sprsem(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprsem(sprigm arg0) {
        this(arg0, null, null);
    }

    public BigInteger cfr_renamed_4510() {
        if (this.cfr_renamed_2 == null) {
            return cfr_renamed_1;
        }
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprsem sprsem2 = this;
        sprrvm2.cfr_renamed_5004(sprsem2.cfr_renamed_3);
        if (sprsem2.cfr_renamed_2 != null && !this.cfr_renamed_2.cfr_renamed_7241(0)) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public static sprsem cfr_renamed_23(Object arg0) {
        if (arg0 == null) {
            return null;
        }
        if (arg0 instanceof sprsem) {
            return (sprsem)arg0;
        }
        return new sprsem(sprszm.cfr_renamed_23(arg0));
    }

    public sprigm cfr_renamed_2229() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprsem(sprigm sprigm2, BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (bigInteger2 != null) {
            void arg2;
            sprsem sprsem2 = this;
            sprsem2.cfr_renamed_4 = new sprktm((BigInteger)arg2);
        }
        if (arg1 == null) {
            this.cfr_renamed_2 = null;
            return;
        }
        this.cfr_renamed_2 = new sprktm((BigInteger)arg1);
    }

    public BigInteger cfr_renamed_4511() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_97();
    }
}

