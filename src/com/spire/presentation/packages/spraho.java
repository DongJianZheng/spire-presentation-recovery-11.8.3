/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcp;
import com.spire.presentation.packages.sprdho;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.spreu;
import com.spire.presentation.packages.sprfw;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprgso;
import com.spire.presentation.packages.sprgu;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprms;
import com.spire.presentation.packages.sprmu;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruq;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxr;

@sprtea
public class spraho
implements sprcp,
sprxr,
spruq,
sprfw,
sprmu,
sprms {
    private String cfr_renamed_91;
    private sprdho cfr_renamed_0;
    private sprpln cfr_renamed_1;
    private sprhhp cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprdmo cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraho(String string, sprdmo sprdmo2, sprpln sprpln2, sprhhp sprhhp2, boolean bl) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spraho spraho2 = this;
        spraho spraho3 = this;
        this.cfr_renamed_91 = arg0;
        spraho3.cfr_renamed_4 = arg1;
        spraho3.cfr_renamed_1 = arg2;
        spraho2.cfr_renamed_2 = arg3;
        spraho2.cfr_renamed_3 = bl;
        spraho spraho4 = this;
        spraho2.cfr_renamed_0 = new sprdho(arg1.cfr_renamed_16553());
    }

    @Override
    public int cfr_renamed_16031() {
        return spraho.cfr_renamed_16753(this.cfr_renamed_4.cfr_renamed_16536());
    }

    @Override
    public String cfr_renamed_13030() {
        return this.cfr_renamed_91;
    }

    @Override
    public double cfr_renamed_16754() {
        return this.cfr_renamed_4.cfr_renamed_16540() * this.cfr_renamed_2.cfr_renamed_13265();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_16755(int arg0) {
        switch (arg0) {
            case 0: {
                if (this.cfr_renamed_4.cfr_renamed_16556()) {
                    return 2;
                }
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                if (this.cfr_renamed_4.cfr_renamed_16556()) {
                    return 0;
                }
                return 2;
            }
        }
        return 0;
    }

    @Override
    public sprhhp cfr_renamed_13257() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxr cfr_renamed_16756() {
        return this;
    }

    @Override
    public spreu cfr_renamed_16757() {
        return new sprgso(0.0);
    }

    @Override
    public boolean cfr_renamed_16709() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprwbp cfr_renamed_13268() {
        return sprwbp.cfr_renamed_1447;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_16753(int arg0) {
        switch (arg0) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
        }
        return 0;
    }

    @Override
    public sprfw cfr_renamed_16758() {
        return this;
    }

    @Override
    public double cfr_renamed_16759() {
        return 0.0;
    }

    @Override
    public sprwbp cfr_renamed_13973() {
        if (this.cfr_renamed_1 instanceof sprghp) {
            return ((sprghp)this.cfr_renamed_1).cfr_renamed_12553();
        }
        return sprwbp.cfr_renamed_1513;
    }

    @Override
    public sprwvn cfr_renamed_16760() {
        sprwvn sprwvn2 = new sprwvn(1);
        sprovja.cfr_renamed_11658(sprwvn2, this);
        return sprwvn2;
    }

    @Override
    public int cfr_renamed_16761() {
        spraho spraho2 = this;
        return spraho2.cfr_renamed_16755(spraho2.cfr_renamed_4.cfr_renamed_16549());
    }

    @Override
    public sprms cfr_renamed_16533() {
        return this;
    }

    @Override
    public sprwvn cfr_renamed_12635() {
        sprwvn sprwvn2 = new sprwvn(1);
        sprovja.cfr_renamed_11658(sprwvn2, this);
        return sprwvn2;
    }

    @Override
    public spreu cfr_renamed_16762() {
        return new sprgso(1.0);
    }

    @Override
    public sprgu cfr_renamed_16763() {
        return this.cfr_renamed_0;
    }

    @Override
    public spreu cfr_renamed_16764() {
        return new sprgso(0.0);
    }

    @Override
    public double cfr_renamed_16765() {
        return this.cfr_renamed_4.cfr_renamed_16550() * this.cfr_renamed_2.cfr_renamed_13265();
    }
}

