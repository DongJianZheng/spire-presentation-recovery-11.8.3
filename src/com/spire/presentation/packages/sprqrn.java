/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmln;
import com.spire.presentation.packages.sprshn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprqrn
extends sprshn {
    private static final int cfr_renamed_2 = 1;
    private static final int cfr_renamed_3 = 0;
    private static final int cfr_renamed_4 = 2;

    public void cfr_renamed_12615(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 0, arg1);
    }

    public void cfr_renamed_13600(sprqrn arg0, int arg1) {
        this.cfr_renamed_13601(arg0.cfr_renamed_13602(arg1), arg0.cfr_renamed_13603(arg1), arg0.cfr_renamed_13604(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_13601(sprsuja sprsuja2, sprsuja sprsuja3, sprsuja sprsuja4) {
        void arg1;
        void arg0;
        sprqrn sprqrn2 = this;
        this.cfr_renamed_13605((sprsuja)arg0);
        sprqrn2.cfr_renamed_13605((sprsuja)arg1);
        sprqrn2.cfr_renamed_13605(sprsuja4);
    }

    @Override
    public int cfr_renamed_13606() {
        return 3;
    }

    public float cfr_renamed_13607(int arg0) {
        return sprmln.cfr_renamed_13608(this.cfr_renamed_13602(arg0), this.cfr_renamed_13603(arg0), this.cfr_renamed_13604(arg0));
    }

    public sprqrn(int arg0) {
        super(arg0);
    }

    public float cfr_renamed_13609() {
        int n;
        float f = 0.0f;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_11861()) {
            f += this.cfr_renamed_13607(n++);
            n2 = n;
        }
        return f;
    }

    public void cfr_renamed_12614(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 2, arg1);
    }

    public sprsuja cfr_renamed_13602(int arg0) {
        return this.cfr_renamed_13610(arg0, 0);
    }

    public sprsuja cfr_renamed_13603(int arg0) {
        return this.cfr_renamed_13610(arg0, 1);
    }

    public void cfr_renamed_13611(int arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3) {
        if (arg0 == this.cfr_renamed_11861()) {
            this.cfr_renamed_13601(arg1, arg2, arg3);
            return;
        }
        sprqrn sprqrn2 = this;
        int n = arg0;
        this.cfr_renamed_13599(arg0, 0, arg1);
        sprqrn2.cfr_renamed_13599(n, 1, arg2);
        sprqrn2.cfr_renamed_13599(n, 2, arg3);
    }

    public sprsuja cfr_renamed_13604(int arg0) {
        return this.cfr_renamed_13610(arg0, 2);
    }

    public sprqrn() {
    }

    public void cfr_renamed_13612(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 1, arg1);
    }
}

