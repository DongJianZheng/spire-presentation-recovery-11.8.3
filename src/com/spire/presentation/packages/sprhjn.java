/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprmln;
import com.spire.presentation.packages.sprqrn;
import com.spire.presentation.packages.sprshn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprhjn
extends sprshn {
    private static final int cfr_renamed_1 = 0;
    private static final int cfr_renamed_2 = 3;
    private static final int cfr_renamed_3 = 2;
    private static final int cfr_renamed_4 = 1;

    public sprsuja cfr_renamed_13602(int arg0) {
        return this.cfr_renamed_13610(arg0, 0);
    }

    public void cfr_renamed_13812(int arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3, sprsuja arg4) {
        if (arg0 == this.cfr_renamed_11861()) {
            this.cfr_renamed_13806(arg1, arg2, arg3, arg4);
            return;
        }
        sprhjn sprhjn2 = this;
        int n = arg0;
        sprhjn sprhjn3 = this;
        sprhjn3.cfr_renamed_13599(arg0, 0, arg1);
        sprhjn3.cfr_renamed_13599(arg0, 1, arg2);
        sprhjn2.cfr_renamed_13599(n, 2, arg3);
        sprhjn2.cfr_renamed_13599(n, 3, arg4);
    }

    public void cfr_renamed_12612(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 1, arg1);
    }

    public sprhjn() {
    }

    public void cfr_renamed_12613(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 2, arg1);
    }

    public void cfr_renamed_12615(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 0, arg1);
    }

    public void cfr_renamed_12614(int arg0, sprsuja arg1) {
        this.cfr_renamed_13599(arg0, 3, arg1);
    }

    public sprsuja cfr_renamed_13798(int arg0) {
        return this.cfr_renamed_13610(arg0, 2);
    }

    @sprtea
    public sprqrn cfr_renamed_13808() {
        int n;
        sprqrn sprqrn2 = new sprqrn();
        sprktp sprktp2 = sprhjn.cfr_renamed_13810(sprqrn2);
        sprktp sprktp3 = sprhjn.cfr_renamed_13810(this);
        sprhjn.cfr_renamed_13809(sprqrn2, sprktp3);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_11861()) {
            sprqrn sprqrn3 = sprqrn2;
            int n3 = n;
            sprqrn2.cfr_renamed_12615(n3, this.cfr_renamed_13602(n3));
            int n4 = n;
            sprqrn3.cfr_renamed_13612(n4, sprmln.cfr_renamed_13807(this.cfr_renamed_13797(n), this.cfr_renamed_13798(n4)));
            sprqrn3.cfr_renamed_12614(n, this.cfr_renamed_13604(n++));
            n2 = n;
        }
        n = this.cfr_renamed_11861() * sprhjn.cfr_renamed_13811(sprqrn2);
        sprktp sprktp4 = sprktp3;
        sprktp4.cfr_renamed_13813(n, sprktp4.cfr_renamed_11861() - n);
        sprhjn.cfr_renamed_13809(this, sprktp2);
        return sprqrn2;
    }

    public sprsuja cfr_renamed_13604(int arg0) {
        return this.cfr_renamed_13610(arg0, 3);
    }

    public sprsuja cfr_renamed_13797(int arg0) {
        return this.cfr_renamed_13610(arg0, 1);
    }

    @Override
    public int cfr_renamed_13606() {
        return 4;
    }

    public sprhjn(int arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_13806(sprsuja sprsuja2, sprsuja sprsuja3, sprsuja sprsuja4, sprsuja sprsuja5) {
        void arg2;
        void arg1;
        void arg0;
        sprhjn sprhjn2 = this;
        sprhjn sprhjn3 = this;
        sprhjn3.cfr_renamed_13605((sprsuja)arg0);
        sprhjn3.cfr_renamed_13605((sprsuja)arg1);
        sprhjn2.cfr_renamed_13605((sprsuja)arg2);
        sprhjn2.cfr_renamed_13605(sprsuja5);
    }
}

