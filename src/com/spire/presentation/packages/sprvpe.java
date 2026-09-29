/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmwe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwf;
import java.io.IOException;

public class sprvpe {
    private sprooe cfr_renamed_91;
    private sprmwe cfr_renamed_0;
    private sprcae cfr_renamed_1;
    private sprqre cfr_renamed_2;
    private sprao cfr_renamed_3;
    private sprwf cfr_renamed_4;

    public sprcae cfr_renamed_695() {
        return this.cfr_renamed_1;
    }

    public sprwf cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprvpe sprvpe2 = this;
        sprlre2.cfr_renamed_49(sprvpe2.cfr_renamed_91);
        if (sprvpe2.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        return new sprjve(sprlre2);
    }

    public static sprvpe cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprbne) {
            return new sprvpe(((sprbne)arg0).cfr_renamed_4828());
        }
        if (arg0 instanceof sprao) {
            return new sprvpe((sprao)arg0);
        }
        return null;
    }

    private /* synthetic */ sprvpe(sprao arg0) throws IOException {
        sprao sprao2 = arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_91 = sprooe.cfr_renamed_23(sprao2.cfr_renamed_24());
        spra spra2 = sprao2.cfr_renamed_24();
        if (spra2 instanceof sprcae) {
            this.cfr_renamed_1 = sprcae.cfr_renamed_23(spra2);
            spra2 = arg0.cfr_renamed_24();
        }
        if (spra2 instanceof sprmwe || spra2 instanceof sprao) {
            this.cfr_renamed_0 = sprmwe.cfr_renamed_23(spra2.cfr_renamed_119());
            spra2 = arg0.cfr_renamed_24();
        }
        if (spra2 instanceof sprwf) {
            this.cfr_renamed_4 = (sprwf)spra2;
        }
    }

    public sprqre cfr_renamed_684() throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = sprqre.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_24().cfr_renamed_119());
        }
        return this.cfr_renamed_2;
    }

    public sprmwe cfr_renamed_683() {
        return this.cfr_renamed_0;
    }
}

