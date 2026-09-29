/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhfn;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprsgn
extends spridn {
    private int cfr_renamed_4 = -1;

    private /* synthetic */ int cfr_renamed_11284() throws IOException {
        if (this.cfr_renamed_4 < 0) {
            int n;
            int n2 = this.cfr_renamed_2.length;
            int n3 = 0;
            int n4 = n = 0;
            while (n4 < n2) {
                sprxgf sprxgf2 = this.cfr_renamed_2[n].cfr_renamed_119().cfr_renamed_4612();
                n3 += sprxgf2.cfr_renamed_11213(true);
                n4 = ++n;
            }
            this.cfr_renamed_4 = n3;
        }
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsgn(sprco[] sprcoArray, sprco[] sprcoArray2) {
        super((sprco[])arg0, (sprco[])arg1);
        void arg1;
        void arg0;
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        sproen sproen2 = arg0;
        sproen2.cfr_renamed_11285(arg1, 49);
        sprhfn sprhfn2 = sproen2.cfr_renamed_4785();
        int n = this.cfr_renamed_2.length;
        if (this.cfr_renamed_4 >= 0 || n > 16) {
            int n2;
            arg0.cfr_renamed_11281(this.cfr_renamed_11284());
            int n3 = n2 = 0;
            while (n3 < n) {
                sprco sprco2 = this.cfr_renamed_2[n2];
                ((sproen)sprhfn2).cfr_renamed_11286(sprco2.cfr_renamed_119(), true);
                n3 = ++n2;
            }
        } else {
            int n4;
            int n5 = 0;
            sprxgf[] sprxgfArray = new sprxgf[n];
            int n6 = n4 = 0;
            while (n6 < n) {
                sprxgf sprxgf2;
                sprxgfArray[n4] = sprxgf2 = this.cfr_renamed_2[n4].cfr_renamed_119().cfr_renamed_4612();
                n5 += sprxgf2.cfr_renamed_11213(true);
                n6 = ++n4;
            }
            this.cfr_renamed_4 = n5;
            arg0.cfr_renamed_11281(n5);
            int n7 = n4 = 0;
            while (n7 < n) {
                ((sproen)sprhfn2).cfr_renamed_11286(sprxgfArray[n4++], true);
                n7 = n4;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprsgn(boolean bl, sprco[] sprcoArray) {
        super((boolean)arg0, (sprco[])arg1);
        void arg1;
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprsgn(sprco sprco2) {
        super((sprco)arg0);
        void arg0;
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    public sprsgn() {
    }

    /*
     * WARNING - void declaration
     */
    public sprsgn(sprrvm sprrvm2) {
        super((sprrvm)arg0, false);
        void arg0;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_11284());
    }

    /*
     * WARNING - void declaration
     */
    public sprsgn(sprco[] sprcoArray) {
        super((sprco[])arg0, false);
        void arg0;
    }
}

