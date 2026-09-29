/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqkm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import java.io.IOException;

public class sprnsm {
    private sprme cfr_renamed_91;
    private sprqp cfr_renamed_0;
    private sprupm cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private spramm cfr_renamed_3;
    private sprqkm cfr_renamed_4;

    public sprnrm cfr_renamed_695() {
        if (null == this.cfr_renamed_1 || this.cfr_renamed_1 instanceof sprnrm) {
            return (sprnrm)this.cfr_renamed_1;
        }
        return new sprnrm(this.cfr_renamed_1.cfr_renamed_314(), false);
    }

    public spramm cfr_renamed_684() throws IOException {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = spramm.cfr_renamed_23(this.cfr_renamed_0.cfr_renamed_24().cfr_renamed_119());
        }
        return this.cfr_renamed_3;
    }

    public static sprnsm cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprszm) {
            return new sprnsm(((sprszm)arg0).cfr_renamed_4828());
        }
        if (arg0 instanceof sprqp) {
            return new sprnsm((sprqp)arg0);
        }
        return null;
    }

    public sprme cfr_renamed_480() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ sprnsm(sprqp arg0) throws IOException {
        sprqp sprqp2 = arg0;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_2 = sprktm.cfr_renamed_23(sprqp2.cfr_renamed_24());
        sprco sprco2 = sprqp2.cfr_renamed_24();
        if (sprco2 instanceof sprupm) {
            this.cfr_renamed_1 = sprupm.cfr_renamed_23(sprco2);
            sprco2 = arg0.cfr_renamed_24();
        }
        if (sprco2 instanceof sprqkm || sprco2 instanceof sprqp) {
            this.cfr_renamed_4 = sprqkm.cfr_renamed_23(sprco2.cfr_renamed_119());
            sprco2 = arg0.cfr_renamed_24();
        }
        if (sprco2 instanceof sprme) {
            this.cfr_renamed_91 = (sprme)sprco2;
        }
    }

    public sprupm cfr_renamed_5388() {
        return this.cfr_renamed_1;
    }

    public sprqkm cfr_renamed_683() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_2.cfr_renamed_97().intValue();
    }
}

