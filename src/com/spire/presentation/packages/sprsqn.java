/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprsqn
extends sprkmn {
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprphja cfr_renamed_3;
    private static final int cfr_renamed_4 = 0;

    public boolean cfr_renamed_13659() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13121(sprsmn sprsmn2) {
        void arg0;
        sprsqn sprsqn2 = this;
        void v1 = arg0;
        v1.cfr_renamed_13112(this);
        super.cfr_renamed_13121((sprsmn)arg0);
        v1.cfr_renamed_13126(sprsqn2);
    }

    /*
     * WARNING - void declaration
     */
    public sprsqn(float f, float f2) {
        this(new sprphja((float)arg0, (float)arg1), 0, false);
        void arg1;
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprsqn(sprphja sprphja2, int n, boolean bl) {
        void arg1;
        void arg0;
        sprsqn sprsqn2 = this;
        sprsqn sprsqn3 = this;
        this.cfr_renamed_3 = sprphja.cfr_renamed_4;
        sprsqn3.cfr_renamed_1 = 0;
        sprsqn3.cfr_renamed_3 = arg0;
        sprsqn2.cfr_renamed_1 = arg1;
        sprsqn2.cfr_renamed_2 = bl;
    }

    public float cfr_renamed_1452() {
        return this.cfr_renamed_3.cfr_renamed_1452();
    }

    public int cfr_renamed_13416() {
        return sprnmp.cfr_renamed_13494(this.cfr_renamed_1942());
    }

    public sprphja cfr_renamed_2773() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_13660() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_13417() {
        return sprnmp.cfr_renamed_13494(this.cfr_renamed_1452());
    }

    public void cfr_renamed_13598(sprphja arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public float cfr_renamed_1942() {
        return this.cfr_renamed_3.cfr_renamed_1942();
    }
}

