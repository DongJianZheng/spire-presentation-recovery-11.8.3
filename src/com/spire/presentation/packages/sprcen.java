/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgzm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprowm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprubn;
import com.spire.presentation.packages.sprwwm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprcen
extends sprszm {
    private int cfr_renamed_4 = -1;

    /*
     * WARNING - void declaration
     */
    public sprcen(sprrvm sprrvm2) {
        super((sprrvm)arg0);
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprcen(sprco[] sprcoArray, boolean bl) {
        super((sprco[])arg0, (boolean)arg1);
        void arg1;
        void arg0;
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return this;
    }

    @Override
    public spridn cfr_renamed_11221() {
        return new sprsgn(false, this.cfr_renamed_11216());
    }

    @Override
    public sprgzm cfr_renamed_11215() {
        return new sprowm(this);
    }

    /*
     * WARNING - void declaration
     */
    public sprcen(sprco[] sprcoArray) {
        super((sprco[])arg0);
        void arg0;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_11284());
    }

    /*
     * WARNING - void declaration
     */
    public sprcen(sprco sprco2) {
        super((sprco)arg0);
        void arg0;
    }

    @Override
    public sprgbf cfr_renamed_11222() {
        return new sprdye(sprwwm.cfr_renamed_11290(this.cfr_renamed_11291()), false);
    }

    private /* synthetic */ int cfr_renamed_11284() throws IOException {
        if (this.cfr_renamed_4 < 0) {
            int n;
            int n2 = ((int)this.cfr_renamed_4).length;
            int n3 = 0;
            int n4 = n = 0;
            while (n4 < n2) {
                sprxgf sprxgf2 = this.cfr_renamed_4[n].cfr_renamed_119().cfr_renamed_4615();
                n3 += sprxgf2.cfr_renamed_11213(true);
                n4 = ++n;
            }
            this.cfr_renamed_4 = n3;
        }
        return this.cfr_renamed_4;
    }

    public static sprcen cfr_renamed_11169(sprszm arg0) {
        return (sprcen)arg0.cfr_renamed_4615();
    }

    @Override
    public sproug cfr_renamed_11220() {
        return new sprfvg(sprfwm.cfr_renamed_11288(this.cfr_renamed_11289()));
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        sproen sproen2 = arg0;
        sproen2.cfr_renamed_11285(arg1, 48);
        sprubn sprubn2 = sproen2.cfr_renamed_4790();
        int n = ((int)this.cfr_renamed_4).length;
        if (this.cfr_renamed_4 >= 0 || n > 16) {
            int n2;
            arg0.cfr_renamed_11281(this.cfr_renamed_11284());
            int n3 = n2 = 0;
            while (n3 < n) {
                sprxgf sprxgf2 = this.cfr_renamed_4[n2].cfr_renamed_119().cfr_renamed_4615();
                sprxgf2.cfr_renamed_11218(sprubn2, true);
                n3 = ++n2;
            }
        } else {
            int n4;
            int n5 = 0;
            sprxgf[] sprxgfArray = new sprxgf[n];
            int n6 = n4 = 0;
            while (n6 < n) {
                sprxgf sprxgf3;
                sprxgfArray[n4] = sprxgf3 = this.cfr_renamed_4[n4].cfr_renamed_119().cfr_renamed_4615();
                n5 += sprxgf3.cfr_renamed_11213(true);
                n6 = ++n4;
            }
            this.cfr_renamed_4 = n5;
            arg0.cfr_renamed_11281(n5);
            int n7 = n4 = 0;
            while (n7 < n) {
                sprxgf sprxgf4 = sprxgfArray[n4];
                sprxgf4.cfr_renamed_11218(sprubn2, true);
                n7 = ++n4;
            }
        }
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    public sprcen() {
    }
}

