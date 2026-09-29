/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sproee;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryie;
import java.util.ArrayList;

public class sprmsd
implements sprb {
    public final spra cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprmsd)) {
            return false;
        }
        sprmsd sprmsd2 = (sprmsd)arg0;
        return this.cfr_renamed_4.equals(sprmsd2.cfr_renamed_4);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public spruhe[] cfr_renamed_289() {
        int n;
        spryee spryee2;
        sprmee[] sprmeeArray = (this.cfr_renamed_4 instanceof spryie ? (spryee2 = ((spryie)this.cfr_renamed_4).cfr_renamed_403()) : (spryee2 = (spryee)this.cfr_renamed_4)).cfr_renamed_289();
        ArrayList<spruhe> arrayList = new ArrayList<spruhe>(sprmeeArray.length);
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            if (sprmeeArray[n].cfr_renamed_312() == 4) {
                arrayList.add(spruhe.cfr_renamed_23(sprmeeArray[n].cfr_renamed_313()));
            }
            n2 = ++n;
        }
        ArrayList<spruhe> arrayList2 = arrayList;
        return arrayList2.toArray(new spruhe[arrayList2.size()]);
    }

    public sprmsd(sproee sproee2) {
        this.cfr_renamed_4 = sproee2.cfr_renamed_102();
    }

    private /* synthetic */ boolean cfr_renamed_4431(spruhe arg0, spryee arg1) {
        int n;
        sprmee[] sprmeeArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            sprmee sprmee2 = sprmeeArray[n];
            if (sprmee2.cfr_renamed_312() == 4 && spruhe.cfr_renamed_23(sprmee2.cfr_renamed_313()).equals(arg0)) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprmsd(spruhe spruhe2) {
        void arg0;
        sprmsd sprmsd2 = this;
        sprmsd2.cfr_renamed_4 = new spryie(new spryee(new sprmee((spruhe)arg0)));
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof sprcyd)) {
            return false;
        }
        sprcyd sprcyd2 = (sprcyd)arg0;
        if (this.cfr_renamed_4 instanceof spryie) {
            spryie spryie2 = (spryie)this.cfr_renamed_4;
            if (spryie2.cfr_renamed_404() != null) {
                return spryie2.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97().equals(sprcyd2.cfr_renamed_114()) && this.cfr_renamed_4431(sprcyd2.cfr_renamed_102(), spryie2.cfr_renamed_404().cfr_renamed_102());
            }
            spryee spryee2 = spryie2.cfr_renamed_403();
            if (this.cfr_renamed_4431(sprcyd2.cfr_renamed_1485(), spryee2)) {
                return true;
            }
        } else {
            spryee spryee3 = (spryee)this.cfr_renamed_4;
            if (this.cfr_renamed_4431(sprcyd2.cfr_renamed_1485(), spryee3)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object clone() {
        return new sprmsd(sproee.cfr_renamed_23(this.cfr_renamed_4));
    }
}

