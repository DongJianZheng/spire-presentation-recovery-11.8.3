/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkiaa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmoe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprawe
extends sprkra {
    private sprdce cfr_renamed_2;
    private sprmee cfr_renamed_3;
    private sprmoe cfr_renamed_4;

    public sprmee cfr_renamed_4381() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprawe(sprbne sprbne2) {
        void arg0;
        sprawe sprawe2;
        spra spra2 = sprbne2.cfr_renamed_85(0);
        if (spra2 instanceof spryte) {
            spryte spryte2 = (spryte)spra2;
            if (spryte2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprkiaa.cfr_renamed_9("M!s!w8voy:l'Q!~ 8;y(\"o")).append(spryte2.cfr_renamed_312()).toString());
            }
            sprawe2 = this;
            this.cfr_renamed_3 = sprmee.cfr_renamed_23(spryte2.cfr_renamed_2456());
        } else {
            sprawe2 = this;
            this.cfr_renamed_4 = sprmoe.cfr_renamed_23(spra2);
        }
        sprawe2.cfr_renamed_2 = sprdce.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = new sprlre();
        if (this.cfr_renamed_3 != null) {
            sprlre sprlre4 = sprlre3;
            sprlre2 = sprlre4;
            sprlre4.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_3));
        } else {
            sprlre sprlre5 = sprlre3;
            sprlre2 = sprlre5;
            sprlre5.cfr_renamed_49(this.cfr_renamed_4);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        return new sprpse(sprlre3);
    }

    /*
     * WARNING - void declaration
     */
    public sprawe(sprmee sprmee2, sprdce sprdce2) {
        void arg0;
        sprawe sprawe2 = this;
        sprawe2.cfr_renamed_3 = arg0;
        sprawe2.cfr_renamed_2 = sprdce2;
    }

    public sprdce cfr_renamed_1157() {
        return this.cfr_renamed_2;
    }

    public sprmoe cfr_renamed_4382() {
        return this.cfr_renamed_4;
    }

    public static sprawe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprawe) {
            return (sprawe)arg0;
        }
        if (arg0 != null) {
            return new sprawe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprawe(sprmoe sprmoe2, sprdce sprdce2) {
        void arg0;
        sprawe sprawe2 = this;
        sprawe2.cfr_renamed_4 = arg0;
        sprawe2.cfr_renamed_2 = sprdce2;
    }
}

