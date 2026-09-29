/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.TextHighLightingOptions;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprvva;

public class spryge
extends sprkra {
    public sprere cfr_renamed_1;
    public spruhe cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public sprdce cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryge(spruhe spruhe2, sprdce sprdce2, sprere sprere2) {
        void arg2;
        void arg1;
        void arg0;
        spryge spryge2 = this;
        spryge spryge3 = this;
        spryge spryge4 = this;
        spryge4.cfr_renamed_3 = new sprooe(0L);
        spryge3.cfr_renamed_1 = null;
        spryge3.cfr_renamed_2 = arg0;
        spryge2.cfr_renamed_4 = arg1;
        spryge2.cfr_renamed_1 = arg2;
        if (spruhe2 == null || this.cfr_renamed_3 == null || this.cfr_renamed_4 == null) {
            throw new IllegalArgumentException(sprffb.cfr_renamed_9("\u0010_*\u0010?\\2\u00103Q0T?D1B'\u00108Y;\\:C~C;D~Y0\u0010\u001dU,D7V7S?D7_0b;A+U-D\u0017^8_~W;^;B?D1Bp"));
        }
    }

    public spruhe cfr_renamed_1485() {
        return this.cfr_renamed_2;
    }

    public sprdce cfr_renamed_1489() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spryge(sprbne sprbne2) {
        void arg0;
        spryge spryge2 = this;
        spryge spryge3 = this;
        spryge3.cfr_renamed_3 = new sprooe(0L);
        spryge2.cfr_renamed_1 = null;
        spryge2.cfr_renamed_3 = (sprooe)sprbne2.cfr_renamed_85(0);
        void v2 = arg0;
        this.cfr_renamed_2 = spruhe.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprdce.cfr_renamed_23(v2.cfr_renamed_85(2));
        if (v2.cfr_renamed_84() > 3) {
            sprhse sprhse2 = (sprhse)arg0.cfr_renamed_85(3);
            this.cfr_renamed_1 = sprere.cfr_renamed_341(sprhse2, false);
        }
        if (this.cfr_renamed_2 == null || this.cfr_renamed_3 == null || this.cfr_renamed_4 == null) {
            throw new IllegalArgumentException(TextHighLightingOptions.cfr_renamed_9(")\b\u0013G\u0006\u000b\u000bG\n\u0006\t\u0003\u0006\u0013\b\u0015\u001eG\u0001\u000e\u0002\u000b\u0003\u0014G\u0014\u0002\u0013G\u000e\tG$\u0002\u0015\u0013\u000e\u0001\u000e\u0004\u0006\u0013\u000e\b\t5\u0002\u0016\u0012\u0002\u0014\u0013.\t\u0001\bG\u0000\u0002\t\u0002\u0015\u0006\u0013\b\u0015I"));
        }
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spryge spryge2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(spryge2.cfr_renamed_4);
        if (spryge2.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_1));
        }
        return new sprpse(sprlre2);
    }

    public sprere cfr_renamed_82() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public spryge(spruib spruib2, sprdce sprdce2, sprere sprere2) {
        void arg2;
        void arg1;
        void arg0;
        spryge spryge2 = this;
        spryge spryge3 = this;
        spryge spryge4 = this;
        spryge4.cfr_renamed_3 = new sprooe(0L);
        spryge3.cfr_renamed_1 = null;
        spryge3.cfr_renamed_2 = spruhe.cfr_renamed_23(arg0.cfr_renamed_119());
        spryge2.cfr_renamed_4 = arg1;
        spryge2.cfr_renamed_1 = arg2;
        if (spruib2 == null || this.cfr_renamed_3 == null || this.cfr_renamed_4 == null) {
            throw new IllegalArgumentException(sprffb.cfr_renamed_9("\u0010_*\u0010?\\2\u00103Q0T?D1B'\u00108Y;\\:C~C;D~Y0\u0010\u001dU,D7V7S?D7_0b;A+U-D\u0017^8_~W;^;B?D1Bp"));
        }
    }

    public static spryge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryge) {
            return (spryge)arg0;
        }
        if (arg0 != null) {
            return new spryge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

