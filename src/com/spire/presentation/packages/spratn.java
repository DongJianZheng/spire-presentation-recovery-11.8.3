/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragp;
import com.spire.presentation.packages.sprann;
import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprdmn;
import com.spire.presentation.packages.sprejn;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.spriun;
import com.spire.presentation.packages.sprjyn;
import com.spire.presentation.packages.sprpao;
import com.spire.presentation.packages.sprpin;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.sprstn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprttn;
import com.spire.presentation.packages.sprwmr;
import com.spire.presentation.packages.sprxzn;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzmn;
import java.util.Iterator;

@sprtea
public class spratn
extends sprbln {
    private boolean cfr_renamed_1;
    private String cfr_renamed_2;
    private sprttn cfr_renamed_3;
    private spragp cfr_renamed_4;

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.cfr_renamed_13435().iterator();
        while (iterator2.hasNext()) {
            ((sprjyn)iterator.next()).cfr_renamed_14291(arg0);
            iterator2 = iterator;
        }
    }

    public void cfr_renamed_14429(sprdmn arg0, sprpao arg1) {
        this.cfr_renamed_14834(sprstn.cfr_renamed_14811(arg1, arg0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void arg0;
        arg0.cfr_renamed_14086();
        if (this.cfr_renamed_1) {
            arg0.cfr_renamed_14094(sprsly.cfr_renamed_9("]$\u001b\u00104\u001b\u0013\u0010\u0001"), 2);
        }
        void v0 = arg0;
        v0.cfr_renamed_14057(sprwmr.cfr_renamed_9("( n\u0003k\u0002t"), this.cfr_renamed_14835());
        this.cfr_renamed_14799((spryjn)v0, sprsly.cfr_renamed_9("]3 "));
        arg0.cfr_renamed_14061();
    }

    private /* synthetic */ String cfr_renamed_14835() {
        StringBuilder stringBuilder = new StringBuilder();
        sprghha.cfr_renamed_12279(stringBuilder, sprwmr.cfr_renamed_9("='"));
        Iterator iterator = this.cfr_renamed_4.cfr_renamed_13435().iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprjyn sprjyn2 = (sprjyn)iterator.next();
            iterator2 = iterator;
            sprghha.cfr_renamed_12279(stringBuilder, sprjyn2.cfr_renamed_4570());
            sprghha.cfr_renamed_12279(stringBuilder, " ");
        }
        if (this.cfr_renamed_1) {
            sprghha.cfr_renamed_12279(stringBuilder, this.cfr_renamed_2);
            sprghha.cfr_renamed_12279(stringBuilder, " ");
        }
        StringBuilder stringBuilder2 = stringBuilder;
        sprghha.cfr_renamed_12279(stringBuilder2, sprsly.cfr_renamed_9("W/"));
        return stringBuilder2.toString();
    }

    public void cfr_renamed_14421(sprann arg0, sprpao arg1) {
        this.cfr_renamed_14834(sprstn.cfr_renamed_14803(arg1, arg0));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spratn(sprgdo sprgdo2) {
        super(sprgdo2);
        void arg0;
        spratn spratn2 = this;
        this.cfr_renamed_4 = new spragp();
        spratn2.cfr_renamed_3 = new sprttn((sprgdo)arg0);
    }

    public void cfr_renamed_14472(sprejn sprejn2) {
        spratn spratn2 = this;
        spratn2.cfr_renamed_1 = true;
        spratn2.cfr_renamed_2 = sprejn2.cfr_renamed_4570();
    }

    @sprtea
    public void cfr_renamed_14799(spryjn arg0, String arg1) {
        if (!this.cfr_renamed_3.cfr_renamed_14646()) {
            return;
        }
        arg0.cfr_renamed_11835(arg1);
        this.cfr_renamed_3.cfr_renamed_14485(arg0);
    }

    @sprtea
    public sprewn cfr_renamed_14832(sprhhp arg0) {
        return this.cfr_renamed_3.cfr_renamed_14393(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14434(sprzmn sprzmn2, sprpao sprpao2) {
        void arg0;
        void arg1;
        this.cfr_renamed_14834(new spriun((sprpao)arg1, (sprzmn)arg0));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14834(sprjyn sprjyn2) {
        void arg0;
        arg0.cfr_renamed_14833().cfr_renamed_14484((sprjyn)arg0);
        if (this.cfr_renamed_4.cfr_renamed_12143(arg0.cfr_renamed_313())) {
            throw new IllegalArgumentException(sprwmr.cfr_renamed_9("I\u0007j\u0003tFj\u0013t\u0012'\u0004bFr\bn\u0017r\u0003)"));
        }
        this.cfr_renamed_4.cfr_renamed_12160(arg0.cfr_renamed_313(), arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14424(sprpin sprpin2, sprpao sprpao2) {
        void arg0;
        void arg1;
        this.cfr_renamed_14834(new sprxzn((sprpao)arg1, (sprpin)arg0));
    }
}

