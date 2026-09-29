/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprkoo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprxko;
import com.spire.presentation.packages.spryno;

public class sprago
extends sprkoo {
    private sprggo cfr_renamed_3;
    private spryno cfr_renamed_4;

    @Override
    public void cfr_renamed_16239() {
        this.cfr_renamed_3.cfr_renamed_11665();
        this.cfr_renamed_3 = null;
        this.cfr_renamed_4.cfr_renamed_11665();
        this.cfr_renamed_4 = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_16237() {
        switch (((sprxko)((Object)this.cfr_renamed_4)).cfr_renamed_324()) {
            case 70: {
                if (this.cfr_renamed_3.cfr_renamed_16516().cfr_renamed_16517()) {
                    this.cfr_renamed_16518();
                }
                this.cfr_renamed_3.cfr_renamed_16516().cfr_renamed_16241(this.cfr_renamed_16194(), this.cfr_renamed_16227());
                return;
            }
        }
        if (this.cfr_renamed_3.cfr_renamed_16516().cfr_renamed_16517()) {
            sprago sprago2 = this;
            this.cfr_renamed_4.cfr_renamed_16238(((sprxko)((Object)sprago2.cfr_renamed_4)).cfr_renamed_324());
            sprago2.cfr_renamed_16192().cfr_renamed_16212(this.cfr_renamed_16192().cfr_renamed_16193() | this.cfr_renamed_4.cfr_renamed_16193());
        }
    }

    public sprago(sprdfo arg0, sprlmo arg1) {
        super(arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_16518() {
        sprago sprago2 = this;
        this.cfr_renamed_3.cfr_renamed_16100().cfr_renamed_16408().cfr_renamed_16425(sprago2.cfr_renamed_4.cfr_renamed_16203());
        sprago2.cfr_renamed_4.cfr_renamed_16407();
    }

    @Override
    public sprmrn cfr_renamed_5112() {
        return this.cfr_renamed_3.cfr_renamed_16100().cfr_renamed_16408().cfr_renamed_16203();
    }

    @Override
    public void cfr_renamed_16240() {
        sprago sprago2 = this;
        sprago2.cfr_renamed_3 = new sprggo(this.cfr_renamed_16190(), this.cfr_renamed_16192());
        sprago2.cfr_renamed_4 = new spryno(this.cfr_renamed_16190(), this.cfr_renamed_3.cfr_renamed_16064(), this.cfr_renamed_12479(), this.cfr_renamed_16227(), this.cfr_renamed_16192().cfr_renamed_13400());
    }
}

