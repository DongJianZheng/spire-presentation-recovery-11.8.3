/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsn;
import com.spire.presentation.packages.sprct;
import com.spire.presentation.packages.sprdp;
import com.spire.presentation.packages.spreon;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprlhn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryln;
import java.util.Iterator;

@sprtea
public class sprpkn
extends sprbsn
implements sprct {
    private spreon cfr_renamed_4;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void cfr_renamed_2437(String arg0) {
        if (this.cfr_renamed_1600(arg0) != null) {
            sprpkn sprpkn2 = this;
            sprpkn2.cfr_renamed_12943(spresca.cfr_renamed_11777(sprpkn2.cfr_renamed_1600(arg0), spryln.class));
        }
    }

    @sprtea
    public sprpkn() {
    }

    @Override
    public boolean cfr_renamed_12927(Object arg0) {
        return false;
    }

    @sprtea
    public spreon cfr_renamed_12870() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprpkn(spreon spreon2) {
        this.cfr_renamed_4 = spreon2;
    }

    public void cfr_renamed_12929(int arg0, Object arg1) {
    }

    @sprtea
    public sprpkn cfr_renamed_12837(spreon arg0) throws Exception {
        int n;
        sprpkn sprpkn2 = (sprpkn)super.cfr_renamed_12099();
        sprpkn2.cfr_renamed_4 = arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_12925().size()) {
            spryln spryln2 = (spryln)this.cfr_renamed_12925().cfr_renamed_12151(n);
            sprpkn sprpkn3 = sprpkn2;
            sprpkn3.cfr_renamed_12808(spryln2.cfr_renamed_12877(sprpkn3));
            n2 = ++n;
        }
        return sprpkn2;
    }

    @Override
    public sprdp cfr_renamed_12944(String arg0, sprlhn arg1) {
        spryln spryln2;
        spryln spryln3 = spryln2 = new spryln(this);
        spryln3.cfr_renamed_11640(arg0);
        spryln3.cfr_renamed_12855(arg1);
        spryln spryln4 = spryln2;
        spryln2.cfr_renamed_12880(arg0, this.cfr_renamed_12870().cfr_renamed_12813());
        this.cfr_renamed_12808(spryln4);
        return spryln4;
    }

    public void cfr_renamed_12924(int arg0, Object arg1) {
    }

    @Override
    public sprdp cfr_renamed_1600(String arg0) {
        for (spryln spryln2 : this) {
            if (!sprraia.cfr_renamed_12945(arg0, spryln2.cfr_renamed_313(), (short)5)) continue;
            return spryln2;
        }
        return null;
    }

    public Object cfr_renamed_12151(int arg0) {
        return null;
    }

    @sprtea
    public void cfr_renamed_11665() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.iterator();
        while (iterator2.hasNext()) {
            ((spryln)iterator.next()).cfr_renamed_11665();
            iterator2 = iterator;
        }
    }

    @Override
    public boolean cfr_renamed_12926(Object arg0) {
        return false;
    }

    @Override
    public void cfr_renamed_12928(Object[] arg0, int arg1) {
    }

    @Override
    public sprdp cfr_renamed_576(int arg0) {
        return (sprdp)this.cfr_renamed_12925().cfr_renamed_12151(arg0);
    }

    public int cfr_renamed_12930(Object arg0) {
        return 0;
    }
}

