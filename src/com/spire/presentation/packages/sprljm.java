/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprebm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.spruu;
import com.spire.presentation.packages.sprxjm;
import java.util.Vector;

public class sprljm {
    private Vector cfr_renamed_3;
    private spruu cfr_renamed_4;

    public sprljm cfr_renamed_11161(sprlem[] arg0, String[] arg1) {
        int n;
        sprco[] sprcoArray = new sprco[arg1.length];
        int n2 = n = 0;
        while (n2 != sprcoArray.length) {
            int n3 = n;
            sprco sprco2 = this.cfr_renamed_4.cfr_renamed_11156(arg0[n3], arg1[n]);
            sprcoArray[n3] = sprco2;
            n2 = ++n;
        }
        return this.cfr_renamed_11162(arg0, sprcoArray);
    }

    public sprljm cfr_renamed_11163(sprmem arg0) {
        sprljm sprljm2 = this;
        sprljm2.cfr_renamed_3.addElement(new sprxjm(arg0));
        return sprljm2;
    }

    public sprljm cfr_renamed_11162(sprlem[] arg0, sprco[] arg1) {
        int n;
        sprmem[] sprmemArray = new sprmem[arg0.length];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n;
            sprmem sprmem2 = new sprmem(arg0[n], arg1[n]);
            sprmemArray[n3] = sprmem2;
            n2 = ++n;
        }
        return this.cfr_renamed_11164(sprmemArray);
    }

    public sprljm(spruu spruu2) {
        sprljm sprljm2 = this;
        this.cfr_renamed_3 = new Vector();
        this.cfr_renamed_4 = spruu2;
    }

    public sprnbm cfr_renamed_1451() {
        int n;
        sprxjm[] sprxjmArray = new sprxjm[this.cfr_renamed_3.size()];
        int n2 = n = 0;
        while (n2 != sprxjmArray.length) {
            int n3 = n++;
            sprxjmArray[n3] = (sprxjm)this.cfr_renamed_3.elementAt(n3);
            n2 = n;
        }
        return new sprnbm(this.cfr_renamed_4, sprxjmArray);
    }

    public sprljm cfr_renamed_11165(sprlem arg0, sprco arg1) {
        sprljm sprljm2 = this;
        sprljm2.cfr_renamed_3.addElement(new sprxjm(arg0, arg1));
        return sprljm2;
    }

    public sprljm cfr_renamed_11164(sprmem[] arg0) {
        sprljm sprljm2 = this;
        sprljm2.cfr_renamed_3.addElement(new sprxjm(arg0));
        return sprljm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprljm cfr_renamed_9498(sprlem sprlem2, String string) {
        void arg1;
        void arg0;
        sprljm sprljm2 = this;
        sprljm2.cfr_renamed_11165(sprlem2, sprljm2.cfr_renamed_4.cfr_renamed_11156((sprlem)arg0, (String)arg1));
        return sprljm2;
    }

    public sprljm() {
        this(sprebm.cfr_renamed_956);
    }
}

