/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgro;
import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprkr;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprpq;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrv;
import com.spire.presentation.packages.sprssp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;

@sprtea
public class sprdqo
implements sprpq {
    private double cfr_renamed_112;
    private sprssp cfr_renamed_119;
    private sprssp cfr_renamed_91;
    private double cfr_renamed_0;
    private sprgro cfr_renamed_1;
    private double cfr_renamed_2;
    private double cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_16746(int n, double d, double d2) {
        void arg0;
        void arg1;
        sprdqo sprdqo2 = this;
        sprdqo2.cfr_renamed_16751((double)arg1);
        double d3 = d2 - arg1;
        double d4 = sprdqo2.cfr_renamed_112 + this.cfr_renamed_0;
        switch (arg0) {
            case 0: {
                this.cfr_renamed_17109(0.0);
                return;
            }
            case 1: {
                this.cfr_renamed_17109((d3 - d4) / 2.0);
                return;
            }
            case 2: {
                this.cfr_renamed_17109(d3 - d4);
                return;
            }
            case 3: {
                this.cfr_renamed_17110(d3);
                return;
            }
        }
        throw new IllegalArgumentException(sprjxl.cfr_renamed_9("S\u0000q\u0000n\u0004w\u0004qAm\u0000n\u00049Ab\rj\u0006m\ff\u000fw"));
    }

    public String toString() {
        return sprraia.cfr_renamed_17093(this.cfr_renamed_119.cfr_renamed_6629().toArray());
    }

    @Override
    public double cfr_renamed_1980() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_16740(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ void cfr_renamed_17111() {
        sprdqo sprdqo2;
        sprkr sprkr2;
        block4: {
            sprdqo sprdqo3 = this;
            sprdqo sprdqo4 = sprdqo3;
            sprdqo3.cfr_renamed_91 = sprdqo3.cfr_renamed_119.cfr_renamed_12099();
            while (sprdqo4.cfr_renamed_17112().cfr_renamed_17113()) {
                sprkr2 = (sprkr)this.cfr_renamed_91.cfr_renamed_17114();
                if (sprkr2.cfr_renamed_324() == 0) {
                    sprdqo2 = this;
                    break block4;
                }
                sprdqo sprdqo5 = this;
                sprdqo4 = sprdqo5;
                sprdqo5.cfr_renamed_91.cfr_renamed_17115(1);
            }
            sprdqo2 = this;
        }
        while (sprdqo2.cfr_renamed_17112().cfr_renamed_17113()) {
            sprkr2 = (sprkr)this.cfr_renamed_91.cfr_renamed_17116();
            if (sprkr2.cfr_renamed_324() == 0) {
                return;
            }
            sprdqo sprdqo6 = this;
            sprdqo2 = sprdqo6;
            sprdqo6.cfr_renamed_91.cfr_renamed_17117(1);
        }
    }

    private /* synthetic */ void cfr_renamed_17109(double arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.cfr_renamed_11861()) {
            sprkr sprkr2;
            sprkr sprkr3 = sprkr2 = (sprkr)this.cfr_renamed_91.cfr_renamed_17118(n);
            sprkr3.cfr_renamed_16751(arg0);
            sprkr3.cfr_renamed_17078(sprkr3.cfr_renamed_16769());
            arg0 += sprkr2.cfr_renamed_16774();
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_16751(double arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public sprvjn cfr_renamed_16731() {
        int n;
        sprmrn sprmrn2 = new sprmrn();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.cfr_renamed_11861()) {
            sprkr sprkr2 = (sprkr)this.cfr_renamed_91.cfr_renamed_17118(n);
            sprmrn2.cfr_renamed_12507(sprkr2.cfr_renamed_16731());
            n2 = ++n;
        }
        sprmrn sprmrn3 = sprmrn2;
        sprmrn3.cfr_renamed_12511(new sprqgp());
        sprmrn3.cfr_renamed_13094().cfr_renamed_12629((float)this.cfr_renamed_1980(), (float)this.spr\u3181());
        return sprmrn3;
    }

    @Override
    public boolean cfr_renamed_17084() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprssp cfr_renamed_17119() {
        return this.cfr_renamed_119;
    }

    public sprdqo(sprssp arg0) {
        sprdqo sprdqo2 = this;
        this.cfr_renamed_1 = new sprgro();
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_17111();
        this.cfr_renamed_17120();
    }

    public sprssp cfr_renamed_17112() {
        return this.cfr_renamed_91;
    }

    @Override
    public void cfr_renamed_16752(double arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public double spr\u3181() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_17110(double arg0) {
        int n;
        double d = (arg0 - this.cfr_renamed_0) / this.cfr_renamed_112;
        double d2 = 0.0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.cfr_renamed_11861()) {
            sprkr sprkr2;
            sprkr2.cfr_renamed_17078((sprkr2 = (sprkr)this.cfr_renamed_91.cfr_renamed_17118(n)).cfr_renamed_324() == 1 ? sprkr2.cfr_renamed_16769() * d : sprkr2.cfr_renamed_16769());
            double d3 = d2;
            sprkr2.cfr_renamed_16751(d3);
            d2 = d3 + sprkr2.cfr_renamed_16774();
            n2 = ++n;
        }
    }

    @Override
    public sprrv cfr_renamed_17079() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_17120() {
        sprkr sprkr2;
        int n;
        this.cfr_renamed_112 = 0.0;
        this.cfr_renamed_0 = 0.0;
        this.cfr_renamed_1.cfr_renamed_41();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.cfr_renamed_11861()) {
            sprkr2 = (sprkr)this.cfr_renamed_91.cfr_renamed_17118(n);
            switch (sprkr2.cfr_renamed_324()) {
                case 0: {
                    while (false) {
                    }
                    this.cfr_renamed_0 += sprkr2.cfr_renamed_16769();
                    break;
                }
                case 1: {
                    this.cfr_renamed_112 += sprkr2.cfr_renamed_16769();
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_119.cfr_renamed_11861()) {
            sprkr2 = (sprkr)this.cfr_renamed_119.cfr_renamed_17118(n);
            this.cfr_renamed_1.cfr_renamed_17054(sprkr2.cfr_renamed_17079());
            n3 = ++n;
        }
    }
}

