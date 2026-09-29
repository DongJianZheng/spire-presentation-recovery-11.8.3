/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprlco;
import com.spire.presentation.packages.sprpzy;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthaa;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprtyn
extends sprbln {
    private sprlco cfr_renamed_112;
    @sprtea
    public sprtyn cfr_renamed_119;
    @sprtea
    public sprtyn cfr_renamed_91;
    @sprtea
    public sprtyn cfr_renamed_0;
    @sprtea
    public sprtyn cfr_renamed_1;
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    @sprtea
    public sprtyn cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_14490(int arg0) {
        switch (arg0) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14491(spryjn spryjn2) {
        void arg0;
        arg0.cfr_renamed_14057(sprpzy.cfr_renamed_9("\u0018\u000bN/R"), sprthaa.cfr_renamed_9("fw<L%Q']:"));
        if (this.cfr_renamed_4 != null) {
            arg0.cfr_renamed_14057(sprpzy.cfr_renamed_9("pq6E,C"), this.cfr_renamed_4.cfr_renamed_4570());
        }
        if (this.cfr_renamed_0 != null) {
            arg0.cfr_renamed_14057(sprthaa.cfr_renamed_9("ft(K="), this.cfr_renamed_0.cfr_renamed_4570());
        }
    }

    private /* synthetic */ int cfr_renamed_14492() {
        sprtyn sprtyn2;
        int n = 0;
        sprtyn sprtyn3 = sprtyn2 = this.cfr_renamed_4;
        while (sprtyn3 != null) {
            sprtyn3 = sprtyn2.cfr_renamed_1;
            ++n;
        }
        return n;
    }

    private /* synthetic */ String cfr_renamed_14493(sprwbp arg0) {
        Object[] objectArray = new Object[3];
        objectArray[0] = Float.valueOf((float)arg0.cfr_renamed_3353() / 255.0f);
        objectArray[1] = Float.valueOf((float)arg0.cfr_renamed_1145() / 255.0f);
        objectArray[2] = Float.valueOf((float)arg0.cfr_renamed_1997() / 255.0f);
        return sprraia.cfr_renamed_13359(sprvfja.cfr_renamed_12042(), sprpzy.cfr_renamed_9("\u0004Lo\r\u0019\u0005\"\u0017$\u0006eqmJ\u007fLm\r\u0019\u0005\"j"), objectArray);
    }

    private /* synthetic */ void cfr_renamed_14494(spryjn arg0) {
        String string = this.cfr_renamed_112 != null && sprznp.cfr_renamed_12328(this.cfr_renamed_112.cfr_renamed_13189()) ? this.cfr_renamed_112.cfr_renamed_13189() : " ";
        arg0.cfr_renamed_14286(sprthaa.cfr_renamed_9("\u0017\u001dQ=T,"), string);
        if (this.cfr_renamed_112.cfr_renamed_12553() != null && !this.cfr_renamed_112.cfr_renamed_12553().cfr_renamed_29()) {
            sprtyn sprtyn2 = this;
            arg0.cfr_renamed_14057(sprpzy.cfr_renamed_9("pt"), sprtyn2.cfr_renamed_14493(sprtyn2.cfr_renamed_112.cfr_renamed_12553()));
        }
        if (this.cfr_renamed_112.cfr_renamed_14495() != 0) {
            sprtyn sprtyn3 = this;
            arg0.cfr_renamed_14094(sprthaa.cfr_renamed_9("\u0017\u000f"), sprtyn3.cfr_renamed_14490(sprtyn3.cfr_renamed_112.cfr_renamed_14495()));
        }
        arg0.cfr_renamed_14057(sprpzy.cfr_renamed_9("\u0018\u000fV-R1C"), this.cfr_renamed_119.cfr_renamed_4570());
        if (this.cfr_renamed_91 != null) {
            arg0.cfr_renamed_14057(sprthaa.cfr_renamed_9("fh;]?"), this.cfr_renamed_91.cfr_renamed_4570());
        }
        if (this.cfr_renamed_1 != null) {
            arg0.cfr_renamed_14057(sprpzy.cfr_renamed_9("\u0018\u0011R'C"), this.cfr_renamed_1.cfr_renamed_4570());
        }
        if (this.cfr_renamed_4 != null) {
            arg0.cfr_renamed_14057(sprthaa.cfr_renamed_9("\u0017\u000fQ;K="), this.cfr_renamed_4.cfr_renamed_4570());
        }
        if (this.cfr_renamed_0 != null) {
            arg0.cfr_renamed_14057(sprpzy.cfr_renamed_9("\u0018\u0013V,C"), this.cfr_renamed_0.cfr_renamed_4570());
        }
        if (this.cfr_renamed_4 != null) {
            sprtyn sprtyn4 = this;
            int n = sprtyn4.cfr_renamed_14492();
            if (!sprtyn4.cfr_renamed_3) {
                n = -n;
            }
            arg0.cfr_renamed_14094(sprthaa.cfr_renamed_9("\u0017\nW<V="), n);
        }
        if (this.cfr_renamed_112 != null && this.cfr_renamed_112.cfr_renamed_14496() != null) {
            arg0.cfr_renamed_11835(sprpzy.cfr_renamed_9("\u0018\u001bR,C"));
            this.cfr_renamed_112.cfr_renamed_14496().cfr_renamed_14441(arg0);
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprtyn(sprgdo sprgdo2, sprlco sprlco2, boolean bl, boolean bl2) {
        void arg2;
        void arg1;
        void arg0;
        sprtyn sprtyn2 = this;
        super((sprgdo)arg0);
        this.cfr_renamed_112 = arg1;
        sprtyn2.cfr_renamed_3 = arg2;
        sprtyn2.cfr_renamed_2 = bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void v1;
        void arg0;
        arg0.cfr_renamed_14086();
        if (this.cfr_renamed_2) {
            void v0 = arg0;
            v1 = v0;
            this.cfr_renamed_14491((spryjn)v0);
        } else {
            this.cfr_renamed_14494((spryjn)arg0);
            v1 = arg0;
        }
        v1.cfr_renamed_14061();
    }

    @sprtea
    public void cfr_renamed_14497(sprtyn arg0) {
        sprtyn sprtyn2;
        if (this.cfr_renamed_4 == null) {
            sprtyn2 = this;
            this.cfr_renamed_4 = arg0;
        } else {
            sprtyn sprtyn3 = this;
            sprtyn2 = sprtyn3;
            sprtyn3.cfr_renamed_0.cfr_renamed_1 = arg0;
            arg0.cfr_renamed_91 = sprtyn3.cfr_renamed_0;
        }
        sprtyn2.cfr_renamed_0 = arg0;
        arg0.cfr_renamed_119 = this;
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        sprtyn sprtyn2;
        sprtyn sprtyn3 = sprtyn2 = this.cfr_renamed_4;
        while (sprtyn3 != null) {
            sprtyn sprtyn4 = sprtyn2;
            sprtyn4.cfr_renamed_14291(arg0);
            sprtyn3 = sprtyn4.cfr_renamed_1;
        }
    }
}

