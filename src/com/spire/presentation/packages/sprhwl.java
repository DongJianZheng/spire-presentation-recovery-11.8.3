/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhem;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprtgm;
import com.spire.presentation.packages.sprtpl;
import java.util.ArrayList;

public class sprhwl
implements sprhd {
    public final sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhwl(sprnbm sprnbm2) {
        void arg0;
        sprhwl sprhwl2 = this;
        sprhwl2.cfr_renamed_4 = new sprhem(new spraem(new sprigm((sprnbm)arg0)));
    }

    private /* synthetic */ boolean cfr_renamed_11034(sprnbm arg0, spraem arg1) {
        int n;
        sprigm[] sprigmArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            sprigm sprigm2 = sprigmArray[n];
            if (sprigm2.cfr_renamed_312() == 4 && sprnbm.cfr_renamed_23(sprigm2.cfr_renamed_313()).equals(arg0)) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprhwl(sprtgm sprtgm2) {
        this.cfr_renamed_4 = sprtgm2.cfr_renamed_102();
    }

    @Override
    public Object clone() {
        return new sprhwl(sprtgm.cfr_renamed_23(this.cfr_renamed_4));
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof sprtpl)) {
            return false;
        }
        sprtpl sprtpl2 = (sprtpl)arg0;
        if (this.cfr_renamed_4 instanceof sprhem) {
            sprhem sprhem2 = (sprhem)this.cfr_renamed_4;
            if (sprhem2.cfr_renamed_404() != null) {
                return sprhem2.cfr_renamed_404().cfr_renamed_405().cfr_renamed_5103(sprtpl2.cfr_renamed_114()) && this.cfr_renamed_11034(sprtpl2.cfr_renamed_102(), sprhem2.cfr_renamed_404().cfr_renamed_102());
            }
            spraem spraem2 = sprhem2.cfr_renamed_403();
            if (this.cfr_renamed_11034(sprtpl2.cfr_renamed_1485(), spraem2)) {
                return true;
            }
        } else {
            spraem spraem3 = (spraem)this.cfr_renamed_4;
            if (this.cfr_renamed_11034(sprtpl2.cfr_renamed_1485(), spraem3)) {
                return true;
            }
        }
        return false;
    }

    public sprnbm[] cfr_renamed_289() {
        int n;
        spraem spraem2;
        sprigm[] sprigmArray = (this.cfr_renamed_4 instanceof sprhem ? (spraem2 = ((sprhem)this.cfr_renamed_4).cfr_renamed_403()) : (spraem2 = (spraem)this.cfr_renamed_4)).cfr_renamed_289();
        ArrayList<sprnbm> arrayList = new ArrayList<sprnbm>(sprigmArray.length);
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            if (sprigmArray[n].cfr_renamed_312() == 4) {
                arrayList.add(sprnbm.cfr_renamed_23(sprigmArray[n].cfr_renamed_313()));
            }
            n2 = ++n;
        }
        ArrayList<sprnbm> arrayList2 = arrayList;
        return arrayList2.toArray(new sprnbm[arrayList2.size()]);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprhwl)) {
            return false;
        }
        sprhwl sprhwl2 = (sprhwl)arg0;
        return this.cfr_renamed_4.equals(sprhwl2.cfr_renamed_4);
    }
}

