/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfql;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmxe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprbfe
extends sprkra {
    private sprooe cfr_renamed_1;
    private sprmee cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(0L);

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprbfe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_2 = sprmee.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        switch (sprbne2.cfr_renamed_84()) {
            case 1: {
                return;
            }
            case 2: {
                spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(1));
                switch (spryte2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_1 = sprooe.cfr_renamed_341(spryte2, false);
                        return;
                    }
                    case 1: {
                        this.cfr_renamed_3 = sprooe.cfr_renamed_341(spryte2, false);
                        return;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprfql.cfr_renamed_9("TXr\u0019bXq\u0019xL{[sK,\u0019")).append(spryte2.cfr_renamed_312()).toString());
            }
            case 3: {
                spryte spryte3 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(1));
                if (spryte3.cfr_renamed_312() != 0) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("*r\f3\u001cr\u000f3\u0006f\u0005q\raHu\u0007aH4\u0005z\u0006z\u0005f\u00054R3")).append(spryte3.cfr_renamed_312()).toString());
                }
                this.cfr_renamed_1 = sprooe.cfr_renamed_341(spryte3, false);
                spryte3 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(2));
                if (spryte3.cfr_renamed_312() != 1) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprfql.cfr_renamed_9("TXr\u0019bXq\u0019xL{[sK6_yK6\u001e{XnP{L{\u001e,\u0019")).append(spryte3.cfr_renamed_312()).toString());
                }
                this.cfr_renamed_3 = sprooe.cfr_renamed_341(spryte3, false);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmxe.cfr_renamed_9("Q\twH`\rb\u001dv\u0006p\r3\u001bz\u0012vR3")).append(arg0.cfr_renamed_84()).toString());
    }

    public BigInteger cfr_renamed_4510() {
        if (this.cfr_renamed_1 == null) {
            return cfr_renamed_4;
        }
        return this.cfr_renamed_1.cfr_renamed_97();
    }

    public static sprbfe cfr_renamed_341(spryte arg0, boolean arg1) {
        return new sprbfe(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprmee cfr_renamed_2229() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_4511() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    public sprbfe(sprmee arg0) {
        this(arg0, null, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprbfe(sprmee sprmee2, BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (bigInteger2 != null) {
            void arg2;
            sprbfe sprbfe2 = this;
            sprbfe2.cfr_renamed_3 = new sprooe((BigInteger)arg2);
        }
        if (arg1 == null) {
            this.cfr_renamed_1 = null;
            return;
        }
        this.cfr_renamed_1 = new sprooe((BigInteger)arg1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprbfe sprbfe2 = this;
        sprlre2.cfr_renamed_49(sprbfe2.cfr_renamed_2);
        if (sprbfe2.cfr_renamed_1 != null && !this.cfr_renamed_1.cfr_renamed_97().equals(cfr_renamed_4)) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_1));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public static sprbfe cfr_renamed_23(Object arg0) {
        if (arg0 == null) {
            return null;
        }
        if (arg0 instanceof sprbfe) {
            return (sprbfe)arg0;
        }
        return new sprbfe(sprbne.cfr_renamed_23(arg0));
    }
}

