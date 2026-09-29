/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdoha;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxbe;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sproje
extends sprkra {
    public boolean cfr_renamed_0 = false;
    public sprxbe cfr_renamed_1;
    public sprije cfr_renamed_2;
    public sprmra cfr_renamed_3;
    public int cfr_renamed_4;

    public sprmra cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_0) {
            this.cfr_renamed_4 = super.hashCode();
            this.cfr_renamed_0 = true;
        }
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_569() {
        return this.cfr_renamed_1.cfr_renamed_569();
    }

    public spruzd cfr_renamed_2133() {
        return this.cfr_renamed_1.cfr_renamed_2133();
    }

    public static sproje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproje) {
            return (sproje)arg0;
        }
        if (arg0 != null) {
            return new sproje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sproje sproje2 = this;
        sprlre2.cfr_renamed_49(sproje2.cfr_renamed_1);
        sprlre3.cfr_renamed_49(sproje2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public spruhe cfr_renamed_102() {
        return this.cfr_renamed_1.cfr_renamed_102();
    }

    public Enumeration cfr_renamed_2135() {
        return this.cfr_renamed_1.cfr_renamed_2135();
    }

    public static sproje cfr_renamed_341(spryte arg0, boolean arg1) {
        return sproje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprxbe cfr_renamed_2134() {
        return this.cfr_renamed_1;
    }

    public spruzd cfr_renamed_2132() {
        return this.cfr_renamed_1.cfr_renamed_2132();
    }

    /*
     * WARNING - void declaration
     */
    public sproje(sprbne sprbne2) {
        if (sprbne2.cfr_renamed_84() == 3) {
            void arg0;
            sproje sproje2 = this;
            void v1 = arg0;
            this.cfr_renamed_1 = sprxbe.cfr_renamed_23(v1.cfr_renamed_85(0));
            sproje2.cfr_renamed_2 = sprije.cfr_renamed_23(v1.cfr_renamed_85(1));
            sproje2.cfr_renamed_3 = sprmra.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        throw new IllegalArgumentException(sprdoha.cfr_renamed_9("\u0013G\u0011W\u0005L\u0003G@U\u0012M\u000eE@Q\tX\u0005\u0002\u0006M\u0012\u0002#G\u0012V\tD\tA\u0001V\u0005n\tQ\u0014"));
    }

    public sprege[] cfr_renamed_4232() {
        return this.cfr_renamed_1.cfr_renamed_4232();
    }
}

