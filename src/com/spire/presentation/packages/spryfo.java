/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.sprgjo;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzos;

@sprtea
public class spryfo
extends sprgjo {
    private sprlfja cfr_renamed_1;
    private static sprphja cfr_renamed_2 = new sprphja(1.0f, 1.0f);
    private sprlfja cfr_renamed_3;
    private sprlfja cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_16309(sprphja sprphja2) {
        spryfo spryfo2 = this;
        float f = spryfo2.cfr_renamed_16310((sprphja)((Object)this.cfr_renamed_4));
        spryfo2.cfr_renamed_4 = sprphja2;
        spryfo2.cfr_renamed_16311(f);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_16296(sprphja sprphja2) {
        void arg0;
        spryfo spryfo2 = this;
        spryfo spryfo3 = this;
        float f = spryfo3.cfr_renamed_16310(this.cfr_renamed_0);
        float f2 = spryfo3.cfr_renamed_16310((sprphja)arg0);
        float f3 = spryfo2.cfr_renamed_16310((sprphja)((Object)spryfo3.cfr_renamed_4)) * f2 / f;
        spryfo2.cfr_renamed_0 = sprphja2;
        spryfo2.cfr_renamed_16311(f3);
    }

    private /* synthetic */ float cfr_renamed_16310(sprphja arg0) {
        return sprrgga.cfr_renamed_13562(arg0.cfr_renamed_1942() / arg0.cfr_renamed_1452());
    }

    @Override
    public void cfr_renamed_16141(sprsuja arg0) {
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_16293();
    }

    @Override
    public void cfr_renamed_16142(sprphja arg0) {
        spryfo spryfo2;
        block6: {
            switch (this.cfr_renamed_3) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    break;
                }
                case 7: {
                    spryfo spryfo3 = this;
                    while (false) {
                    }
                    spryfo2 = spryfo3;
                    spryfo3.cfr_renamed_16309(arg0);
                    break block6;
                }
                case 8: {
                    spryfo2 = this;
                    this.cfr_renamed_4 = arg0;
                    break block6;
                }
                default: {
                    throw new IllegalStateException(sprcmn.cfr_renamed_9("\u000f}?k*v9g?wz~;cz~5w?="));
                }
            }
            spryfo2 = this;
        }
        spryfo2.cfr_renamed_16293();
    }

    @Override
    public void cfr_renamed_16138(sprphja arg0) {
        spryfo spryfo2;
        block6: {
            switch (this.cfr_renamed_3) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    break;
                }
                case 7: {
                    spryfo spryfo3 = this;
                    while (false) {
                    }
                    spryfo2 = spryfo3;
                    spryfo3.cfr_renamed_16296(arg0);
                    break block6;
                }
                case 8: {
                    spryfo2 = this;
                    this.cfr_renamed_0 = arg0;
                    break block6;
                }
                default: {
                    throw new IllegalStateException(sprzos.cfr_renamed_9("\u001c\u0004,\u00129\u000f*\u001e,\u000ei\u0007(\u001ai\u0007&\u000e,D"));
                }
            }
            spryfo2 = this;
        }
        spryfo2.cfr_renamed_16293();
    }

    @Override
    public void cfr_renamed_16291() {
        spryfo spryfo2 = this;
        spryfo2.cfr_renamed_4 = cfr_renamed_2;
        spryfo2.cfr_renamed_0 = cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_16299() {
        this.cfr_renamed_16295(0.1f);
    }

    @Override
    public void cfr_renamed_16137(sprsuja arg0) {
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_16293();
    }

    @Override
    public void cfr_renamed_16298() {
        spryfo spryfo2 = this;
        spryfo2.cfr_renamed_0 = new sprphja(this.cfr_renamed_4.cfr_renamed_1942() * 10, this.cfr_renamed_4.cfr_renamed_1452() * 10);
        spryfo spryfo3 = this;
        spryfo spryfo4 = this;
        float f = spryfo2.cfr_renamed_16310(sprlfja.cfr_renamed_15060(this.cfr_renamed_3)) / spryfo3.cfr_renamed_16310(sprlfja.cfr_renamed_15060(spryfo3.cfr_renamed_1)) * spryfo4.cfr_renamed_16310(sprlfja.cfr_renamed_15060(spryfo4.cfr_renamed_4));
        spryfo2.cfr_renamed_4 = new sprphja(this.cfr_renamed_3.cfr_renamed_1942(), -this.cfr_renamed_3.cfr_renamed_1452());
        spryfo2.cfr_renamed_16311(f);
    }

    @Override
    public void cfr_renamed_16294() {
        this.cfr_renamed_16295(0.017638888f);
    }

    @Override
    public void cfr_renamed_16301() {
        this.cfr_renamed_16295(0.254f);
    }

    public spryfo(sprlfja arg0, sprlfja arg1, sprlfja arg2) {
        spryfo spryfo2 = this;
        spryfo spryfo3 = this;
        spryfo spryfo4 = this;
        spryfo4.cfr_renamed_3 = arg0;
        spryfo4.cfr_renamed_4 = arg1;
        spryfo3.cfr_renamed_1 = arg2;
        spryfo2.cfr_renamed_3 = (sprlfja)true;
        spryfo3.cfr_renamed_4 = cfr_renamed_2;
        spryfo2.cfr_renamed_0 = cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_16297() {
        this.cfr_renamed_16295(0.01f);
    }

    @Override
    public void cfr_renamed_16302() {
        this.cfr_renamed_16295(0.0254f);
    }

    private /* synthetic */ void cfr_renamed_16295(float arg0) {
        this.cfr_renamed_4 = new sprphja(this.cfr_renamed_3.cfr_renamed_1942(), -this.cfr_renamed_3.cfr_renamed_1452());
        float f = (float)this.cfr_renamed_4.cfr_renamed_1942() / arg0;
        float f2 = (float)this.cfr_renamed_4.cfr_renamed_1452() / arg0;
        this.cfr_renamed_0 = new sprphja(spryxp.cfr_renamed_13526(f), spryxp.cfr_renamed_13526(f2));
    }

    private /* synthetic */ void cfr_renamed_16311(float arg0) {
        if (sprrgga.cfr_renamed_13562(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1452()) * arg0 < sprrgga.cfr_renamed_13562(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1942())) {
            float f = (float)sprrgga.cfr_renamed_13830(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1942()) * sprrgga.cfr_renamed_13562(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1452()) * arg0;
            spryfo spryfo2 = this;
            spryfo2.cfr_renamed_4 = new sprphja(spryxp.cfr_renamed_13526(f), ((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1452());
            return;
        }
        float f = (float)sprrgga.cfr_renamed_13830(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1452()) * sprrgga.cfr_renamed_13562(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1942()) / arg0;
        this.cfr_renamed_4 = new sprphja(((sprphja)((Object)this.cfr_renamed_4)).cfr_renamed_1942(), spryxp.cfr_renamed_13526(f));
    }
}

