/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbym;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprnin;
import com.spire.presentation.packages.sprps;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruo;
import com.spire.presentation.packages.spryv;

@sprtea
public abstract class sprron
extends sprnin
implements sprps,
spryv {
    private sprcno cfr_renamed_86;
    private spriy cfr_renamed_152;
    private String cfr_renamed_112;
    private String cfr_renamed_119;
    private boolean cfr_renamed_91;
    private spruo cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private String cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public String cfr_renamed_13397() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_13211(String arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public boolean cfr_renamed_12457() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_13398(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @Override
    public void cfr_renamed_13399(String arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_13191(sprcno arg0) {
        this.cfr_renamed_86 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprron(spriy spriy2) {
        void arg0;
        sprron sprron2 = this;
        sprron sprron3 = this;
        this.cfr_renamed_91 = true;
        sprron3.cfr_renamed_2 = 95;
        sprron3.cfr_renamed_4 = true;
        sprron2.cfr_renamed_0 = sprbym.cfr_renamed_4;
        sprron2.cfr_renamed_152 = spriy2;
        sprron sprron4 = this;
        sprron2.cfr_renamed_86 = new sprcno((spriy)arg0);
    }

    public spriy cfr_renamed_13400() {
        return this.cfr_renamed_152;
    }

    public boolean cfr_renamed_13401() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_12414(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprcno cfr_renamed_13104() {
        return this.cfr_renamed_86;
    }

    public void cfr_renamed_13402(spruo arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public String cfr_renamed_13212() {
        return this.cfr_renamed_112;
    }

    public void cfr_renamed_13403(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public spruo cfr_renamed_12480() {
        if (this.cfr_renamed_0 == null) {
            this.cfr_renamed_0 = sprbym.cfr_renamed_4;
        }
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_13404() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_13405() {
        return this.cfr_renamed_4;
    }

    @Override
    public String cfr_renamed_13406() {
        return this.cfr_renamed_119;
    }

    @Override
    public void cfr_renamed_13407(String arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_13408(int arg0) {
        if (arg0 < 0 || arg0 > 100) {
            throw new IllegalArgumentException("value");
        }
        this.cfr_renamed_2 = arg0;
    }
}

