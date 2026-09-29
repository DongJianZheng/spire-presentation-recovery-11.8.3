/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqm;
import com.spire.presentation.packages.sprbrl;
import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprfol;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprgrm;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprhxl;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlul;
import com.spire.presentation.packages.sprmpm;
import com.spire.presentation.packages.sprmum;
import com.spire.presentation.packages.sprqlm;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprsol;
import com.spire.presentation.packages.sprurl;
import com.spire.presentation.packages.sprvmaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxs;
import com.spire.presentation.packages.spryq;
import com.spire.presentation.packages.sprznl;
import java.io.IOException;

public class sprbul
implements sprjn {
    private final sprmpm cfr_renamed_91;
    private final sprbvm cfr_renamed_0;
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 1;

    public sprbvm cfr_renamed_568() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ sprqlm cfr_renamed_10989(sprlem arg0) {
        int n;
        if (this.cfr_renamed_91 == null) {
            return null;
        }
        sprqlm[] sprqlmArray = this.cfr_renamed_91.cfr_renamed_4377();
        sprqlm sprqlm2 = null;
        int n2 = n = 0;
        while (n2 != sprqlmArray.length) {
            if (sprqlmArray[n].cfr_renamed_324().cfr_renamed_5078(arg0)) {
                sprqlm2 = sprqlmArray[n];
                return sprqlm2;
            }
            n2 = ++n;
        }
        return sprqlm2;
    }

    public boolean cfr_renamed_10990(sprhk arg0, sprsol arg1, char[] arg2) throws sprcsl, IllegalStateException {
        sprgrm sprgrm2 = this.cfr_renamed_0.cfr_renamed_2431();
        if (sprgrm2.cfr_renamed_324() == 1) {
            spraqm spraqm2 = spraqm.cfr_renamed_23(sprgrm2.cfr_renamed_2456());
            if (spraqm2.cfr_renamed_4380() == null || spraqm2.cfr_renamed_4380().cfr_renamed_4381() != null) {
                throw new IllegalStateException(sprjpm.cfr_renamed_9("w49\u000bR\u0016X\u00189+k>j>w/92w{i)v4\u007f{v=9+v(j>j(p4w"));
            }
            sprqtm sprqtm2 = spraqm2.cfr_renamed_4380().cfr_renamed_4382();
            if (new sprbrl(arg1).cfr_renamed_10956(sprqtm2, arg2, this.cfr_renamed_4351().cfr_renamed_1157())) {
                return this.cfr_renamed_10991(arg0, spraqm2);
            }
            return false;
        }
        throw new IllegalStateException(sprvmaa.cfr_renamed_9("O;Utr=F:H:Ftj1XtU-Q1\u0001;GtQ&N;GtN2\u0001$N'R1R'H;O"));
    }

    public sprbul(byte[] arg0) throws IOException {
        this(sprbul.cfr_renamed_1443(arg0));
    }

    public boolean cfr_renamed_4385() {
        sprgrm sprgrm2 = this.cfr_renamed_0.cfr_renamed_2431();
        if (sprgrm2.cfr_renamed_324() == 1) {
            return spraqm.cfr_renamed_23(sprgrm2.cfr_renamed_2456()).cfr_renamed_4380().cfr_renamed_4382() != null;
        }
        return false;
    }

    public boolean cfr_renamed_10992(sprlem arg0) {
        return this.cfr_renamed_10989(arg0) != null;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_0.cfr_renamed_91();
    }

    /*
     * WARNING - void declaration
     */
    public sprbul(sprbvm sprbvm2) {
        void arg0;
        sprbul sprbul2 = this;
        sprbul2.cfr_renamed_0 = arg0;
        sprbul2.cfr_renamed_91 = sprbvm2.cfr_renamed_609().cfr_renamed_4378();
    }

    public boolean cfr_renamed_10993(sprhk arg0) throws sprcsl, IllegalStateException {
        sprgrm sprgrm2 = this.cfr_renamed_0.cfr_renamed_2431();
        if (sprgrm2.cfr_renamed_324() == 1) {
            spraqm spraqm2 = spraqm.cfr_renamed_23(sprgrm2.cfr_renamed_2456());
            if (spraqm2.cfr_renamed_4380() != null && spraqm2.cfr_renamed_4380().cfr_renamed_4382() != null) {
                throw new IllegalStateException(sprjpm.cfr_renamed_9("-|)p=p8x/p4w{k>h.p)|(9+x(j,v)}{z3|8r"));
            }
            return this.cfr_renamed_10991(arg0, spraqm2);
        }
        throw new IllegalStateException(sprvmaa.cfr_renamed_9("O;Utr=F:H:Ftj1XtU-Q1\u0001;GtQ&N;GtN2\u0001$N'R1R'H;O"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbvm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprbvm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, sprjpm.cfr_renamed_9("6x7\u007f4k6|?9?x/xa9")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprvmaa.cfr_renamed_9("9@8G;S9D0\u00010@ @n\u0001")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public boolean cfr_renamed_4390() {
        return this.cfr_renamed_91 != null;
    }

    public boolean cfr_renamed_4384() {
        return this.cfr_renamed_0.cfr_renamed_2431() != null;
    }

    public spryq cfr_renamed_10994(sprlem arg0) {
        sprqlm sprqlm2 = this.cfr_renamed_10989(arg0);
        if (sprqlm2 != null) {
            if (sprqlm2.cfr_renamed_324().cfr_renamed_5078(sprxs.cfr_renamed_0)) {
                return new sprfol(sprmum.cfr_renamed_23(sprqlm2.cfr_renamed_97()));
            }
            if (sprqlm2.cfr_renamed_324().cfr_renamed_5078(sprxs.cfr_renamed_152)) {
                return new sprurl(sprkgn.cfr_renamed_23(sprqlm2.cfr_renamed_97()));
            }
            if (sprqlm2.cfr_renamed_324().cfr_renamed_5078(sprxs.cfr_renamed_91)) {
                return new sprlul(sprkgn.cfr_renamed_23(sprqlm2.cfr_renamed_97()));
            }
        }
        return null;
    }

    public int cfr_renamed_4388() {
        return this.cfr_renamed_0.cfr_renamed_2431().cfr_renamed_324();
    }

    public sprktm cfr_renamed_4420() {
        return this.cfr_renamed_0.cfr_renamed_609().cfr_renamed_4420();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_10991(sprhk arg0, spraqm arg1) throws sprcsl {
        sprge sprge2;
        sprge sprge3;
        try {
            sprge3 = arg0.cfr_renamed_5279(arg1.cfr_renamed_615());
        }
        catch (sprhjg sprhjg2) {
            throw new sprcsl(new StringBuilder().insert(0, sprjpm.cfr_renamed_9("l5x9u>9/v{z)|:m>9-|)p=p>ka9")).append(sprhjg2.getMessage()).toString(), sprhjg2);
        }
        if (arg1.cfr_renamed_4380() != null) {
            sprge sprge4 = sprge3;
            sprge2 = sprge4;
            sprhxl.cfr_renamed_10955(arg1.cfr_renamed_4380(), sprge4.cfr_renamed_470());
            return sprge2.cfr_renamed_1435(arg1.cfr_renamed_79().cfr_renamed_186());
        }
        sprhxl.cfr_renamed_10955(this.cfr_renamed_0.cfr_renamed_609(), sprge3.cfr_renamed_470());
        sprge2 = sprge3;
        return sprge2.cfr_renamed_1435(arg1.cfr_renamed_79().cfr_renamed_186());
    }

    public sprikm cfr_renamed_4351() {
        return this.cfr_renamed_0.cfr_renamed_609().cfr_renamed_4351();
    }
}

