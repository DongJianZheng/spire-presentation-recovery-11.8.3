/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfib;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgkaa;
import com.spire.presentation.packages.sprido;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkn;
import com.spire.presentation.packages.sprwbo;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzco;
import com.spire.presentation.packages.sprzvn;

@sprtea
public final class sprfao
extends sprtkn {
    private String cfr_renamed_1;
    private sprzvn cfr_renamed_2;
    private sprwbo cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_14940(String arg0, sprgdo arg1) {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_3 = arg1.cfr_renamed_13097().cfr_renamed_14542() ? new sprido(arg0, true) : new sprzco(arg0);
        }
    }

    @Override
    public void cfr_renamed_14294(spryjn arg0) {
        sprfao sprfao2;
        block5: {
            block4: {
                block3: {
                    if (this.cfr_renamed_2820().cfr_renamed_14358()) {
                        arg0.cfr_renamed_14094(sprfib.cfr_renamed_9("c\u0007"), 4);
                    }
                    if (!this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14514()) {
                        arg0.cfr_renamed_14057(sprgkaa.cfr_renamed_9("\u0000\r|"), sprfib.cfr_renamed_9("p}c\u001551)n\u000e.>%)3c\u0012c\u0012c\u0016lqr\u007f"));
                    }
                    if (!this.cfr_renamed_4) break block3;
                    if (this.cfr_renamed_2 == null) break block4;
                    sprfao sprfao3 = this;
                    sprfao2 = sprfao3;
                    arg0.cfr_renamed_11835(sprgkaa.cfr_renamed_9("\u0000\u000bJ<["));
                    sprfao3.cfr_renamed_2.cfr_renamed_14441(arg0);
                    break block5;
                }
                arg0.cfr_renamed_11835(sprfib.cfr_renamed_9("c\u0000"));
                this.cfr_renamed_3.cfr_renamed_14441(arg0);
            }
            sprfao2 = this;
        }
        if (sprfao2.cfr_renamed_14486() > 0) {
            arg0.cfr_renamed_14094(sprgkaa.cfr_renamed_9("\u0000\u001c[=Z,[\u001fN=J!["), this.cfr_renamed_14486());
        }
    }

    @sprtea
    public String cfr_renamed_4750() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprfao(sprgdo sprgdo2, sprgeja sprgeja2, String string, boolean bl, String string2) {
        super((sprgdo)arg0, (sprgeja)arg1, (String)arg4);
        void arg3;
        void arg2;
        void arg4;
        void arg1;
        void arg0;
        this.cfr_renamed_1 = arg2;
        this.cfr_renamed_4 = arg3;
        this.cfr_renamed_14940(string, (sprgdo)arg0);
    }

    @sprtea
    public void cfr_renamed_14941(sprzvn arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public boolean cfr_renamed_13234() {
        return this.cfr_renamed_4;
    }

    @Override
    @sprtea
    public String cfr_renamed_14049() {
        return "/Link";
    }

    private /* synthetic */ void cfr_renamed_14942(sprmjp arg0) {
        if (this.cfr_renamed_4) {
            this.cfr_renamed_2 = (sprzvn)arg0.cfr_renamed_1600(this.cfr_renamed_1);
            if (null == this.cfr_renamed_2) {
                this.cfr_renamed_2 = (sprzvn)arg0.cfr_renamed_1600('#' + this.cfr_renamed_1);
            }
        }
    }

    @sprtea
    public sprzvn cfr_renamed_14496() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14290(sprfy sprfy2, sprmjp sprmjp2) {
        void arg1;
        sprfao sprfao2 = this;
        sprfao2.cfr_renamed_14942((sprmjp)arg1);
        sprfao2.cfr_renamed_14291(sprfy2);
    }
}

