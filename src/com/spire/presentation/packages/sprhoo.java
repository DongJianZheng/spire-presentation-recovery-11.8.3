/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprkko;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxep;
import com.spire.presentation.packages.sprxsp;

@sprtea
public class sprhoo
implements sprrt {
    private int cfr_renamed_107;
    private boolean cfr_renamed_132;
    private int cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private sprcgo cfr_renamed_152;
    public static final String cfr_renamed_112 = "Microsoft Sans Serif";
    public static final float cfr_renamed_119 = 12.0f;
    private int cfr_renamed_91;
    private String cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private spriy cfr_renamed_3;
    private boolean cfr_renamed_4;

    @sprtea
    public String cfr_renamed_16256() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprhoo(spriy spriy2) {
        void arg0;
        sprhoo sprhoo2 = this;
        sprhoo sprhoo3 = this;
        sprhoo sprhoo4 = this;
        sprhoo sprhoo5 = this;
        sprhoo sprhoo6 = this;
        sprhoo6.cfr_renamed_3 = arg0;
        sprhoo6.cfr_renamed_107 = 0;
        sprhoo5.cfr_renamed_102 = 0;
        sprhoo5.cfr_renamed_93 = 0;
        sprhoo4.cfr_renamed_2 = 0;
        sprhoo4.cfr_renamed_132 = false;
        sprhoo3.cfr_renamed_4 = false;
        sprhoo3.cfr_renamed_1 = 0;
        sprhoo2.cfr_renamed_152 = sprcgo.cfr_renamed_1716(0);
        sprhoo2.cfr_renamed_0 = cfr_renamed_112;
    }

    private /* synthetic */ float cfr_renamed_16257(sprfzo arg0) {
        if (this.cfr_renamed_107 == 0) {
            return 12.0f;
        }
        if (this.cfr_renamed_107 < 0) {
            return -this.cfr_renamed_107;
        }
        return (float)(this.cfr_renamed_107 * arg0.cfr_renamed_13317()) / (float)arg0.cfr_renamed_16258().cfr_renamed_13489();
    }

    @sprtea
    public void cfr_renamed_16200(sprkko arg0) {
        sprkko sprkko2 = arg0;
        sprhoo sprhoo2 = this;
        sprhoo2.cfr_renamed_107 = arg0.cfr_renamed_12254();
        sprhoo2.cfr_renamed_86 = arg0.cfr_renamed_12254();
        this.cfr_renamed_102 = sprkko2.cfr_renamed_12254();
        sprkko2.cfr_renamed_12254();
        sprkko sprkko3 = arg0;
        sprhoo sprhoo3 = this;
        sprkko sprkko4 = arg0;
        this.cfr_renamed_93 = arg0.cfr_renamed_12254();
        this.cfr_renamed_132 = sprkko4.cfr_renamed_16259();
        sprhoo3.cfr_renamed_4 = sprkko4.cfr_renamed_16259();
        sprhoo3.cfr_renamed_1 = arg0.cfr_renamed_16259();
        this.cfr_renamed_152 = sprcgo.cfr_renamed_1716(sprkko3.cfr_renamed_12137() & 0xFF);
        sprkko3.cfr_renamed_12137();
        arg0.cfr_renamed_12137();
        arg0.cfr_renamed_12137();
        arg0.cfr_renamed_12137();
        sprhoo sprhoo4 = this;
        sprhoo4.cfr_renamed_16260(sprhoo4.cfr_renamed_16132().cfr_renamed_16261(arg0.cfr_renamed_16065(32)));
    }

    @Override
    public int cfr_renamed_324() {
        return 6;
    }

    @sprtea
    public sprcgo cfr_renamed_16132() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public void cfr_renamed_16242(sprhio arg0) {
        sprhio sprhio2 = arg0;
        sprhoo sprhoo2 = this;
        sprhio sprhio3 = arg0;
        this.cfr_renamed_91 = sprhio3.cfr_renamed_12261();
        sprhoo2.cfr_renamed_107 = sprhio3.cfr_renamed_12261();
        sprhoo2.cfr_renamed_86 = arg0.cfr_renamed_12261();
        this.cfr_renamed_102 = sprhio2.cfr_renamed_12261();
        sprhio2.cfr_renamed_12261();
        sprhio sprhio4 = arg0;
        sprhoo sprhoo3 = this;
        sprhio sprhio5 = arg0;
        this.cfr_renamed_93 = arg0.cfr_renamed_12261();
        this.cfr_renamed_132 = sprhio5.cfr_renamed_16259();
        sprhoo3.cfr_renamed_4 = sprhio5.cfr_renamed_16259();
        sprhoo3.cfr_renamed_1 = arg0.cfr_renamed_16259();
        this.cfr_renamed_152 = sprcgo.cfr_renamed_1716(sprhio4.cfr_renamed_12137() & 0xFF);
        sprhio4.cfr_renamed_12137();
        arg0.cfr_renamed_12137();
        arg0.cfr_renamed_12137();
        arg0.cfr_renamed_12137();
        this.cfr_renamed_16260(arg0.cfr_renamed_16262(32));
    }

    @sprtea
    public void cfr_renamed_16263(String arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @Override
    public void cfr_renamed_16244(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    private /* synthetic */ void cfr_renamed_16260(String arg0) {
        arg0 = sprxsp.cfr_renamed_16264(arg0);
        this.cfr_renamed_0 = arg0 = sprxep.cfr_renamed_16265(arg0);
    }

    @Override
    public int cfr_renamed_12977() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ int cfr_renamed_14495() {
        if (this.cfr_renamed_2 != 0) {
            return this.cfr_renamed_2;
        }
        if (this.cfr_renamed_93 >= 700) {
            this.cfr_renamed_2 |= 1;
        }
        if (this.cfr_renamed_132) {
            this.cfr_renamed_2 |= 2;
        }
        if (this.cfr_renamed_4) {
            this.cfr_renamed_2 |= 4;
        }
        if (this.cfr_renamed_1) {
            this.cfr_renamed_2 |= 8;
        }
        return this.cfr_renamed_2;
    }

    @sprtea
    public float cfr_renamed_16266(sprhhp arg0) {
        if (this.cfr_renamed_86 == 0) {
            return 1.0f;
        }
        float f = arg0.cfr_renamed_13265() * (float)arg0.cfr_renamed_13261().cfr_renamed_16267() / (float)arg0.cfr_renamed_13261().cfr_renamed_13317();
        return (float)sprrgga.cfr_renamed_6433(this.cfr_renamed_86) / f;
    }

    @sprtea
    public sprhhp cfr_renamed_16268() {
        sprhoo sprhoo2 = this;
        int n = sprhoo2.cfr_renamed_14495();
        sprfzo sprfzo2 = sprhoo2.cfr_renamed_3.cfr_renamed_16269(this.cfr_renamed_0, n);
        if (sprfzo2 == null) {
            sprfzo2 = this.cfr_renamed_3.cfr_renamed_16270(cfr_renamed_112, n);
        }
        float f = this.cfr_renamed_16257(sprfzo2);
        return new sprhhp(f, n, sprfzo2, false, false);
    }

    @sprtea
    public float cfr_renamed_16271() {
        return (float)this.cfr_renamed_102 / 10.0f;
    }
}

