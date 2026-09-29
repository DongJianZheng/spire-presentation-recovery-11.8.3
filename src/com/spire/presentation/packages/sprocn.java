/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprubn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprocn
extends spridn {
    private int cfr_renamed_4 = -1;

    @Override
    public sprxgf cfr_renamed_4615() {
        if (this.cfr_renamed_3 != null) {
            return this;
        }
        return super.cfr_renamed_4615();
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_11284());
    }

    /*
     * WARNING - void declaration
     */
    public sprocn(sprco sprco2) {
        super((sprco)arg0);
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprocn(sprco[] sprcoArray) {
        super((sprco[])arg0, true);
        void arg0;
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        sproen sproen2 = arg0;
        sproen2.cfr_renamed_11285(arg1, 49);
        sprubn sprubn2 = sproen2.cfr_renamed_4790();
        int n = this.cfr_renamed_2.length;
        if (this.cfr_renamed_4 >= 0 || n > 16) {
            int n2;
            arg0.cfr_renamed_11281(this.cfr_renamed_11284());
            int n3 = n2 = 0;
            while (n3 < n) {
                sprxgf sprxgf2 = this.cfr_renamed_2[n2].cfr_renamed_119().cfr_renamed_4615();
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
                sprxgfArray[n4] = sprxgf3 = this.cfr_renamed_2[n4].cfr_renamed_119().cfr_renamed_4615();
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

    /*
     * WARNING - void declaration
     */
    public sprocn(boolean bl, sprco[] sprcoArray) {
        super(sprocn.cfr_renamed_11302((boolean)arg0), (sprco[])arg1);
        void arg1;
        void arg0;
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        return this;
    }

    private /* synthetic */ int cfr_renamed_11284() throws IOException {
        if (this.cfr_renamed_4 < 0) {
            int n;
            int n2 = this.cfr_renamed_2.length;
            int n3 = 0;
            int n4 = n = 0;
            while (n4 < n2) {
                sprxgf sprxgf2 = this.cfr_renamed_2[n].cfr_renamed_119().cfr_renamed_4615();
                n3 += sprxgf2.cfr_renamed_11213(true);
                n4 = ++n;
            }
            this.cfr_renamed_4 = n3;
        }
        return this.cfr_renamed_4;
    }

    public sprocn() {
    }

    private static /* synthetic */ boolean cfr_renamed_11302(boolean arg0) {
        if (!arg0) {
            throw new IllegalStateException(sprrica.cfr_renamed_9("\u0019G/q8V}G1G0G3V.\u0002.J2W1F}C1U<[.\u0002?G}K3\u0002.M/V8F}M/F8P"));
        }
        return arg0;
    }

    public static sprocn cfr_renamed_11303(spridn arg0) {
        return (sprocn)arg0.cfr_renamed_4615();
    }

    /*
     * WARNING - void declaration
     */
    public sprocn(sprrvm sprrvm2) {
        super((sprrvm)arg0, true);
        void arg0;
    }
}

