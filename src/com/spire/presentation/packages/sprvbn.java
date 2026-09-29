/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrn;
import com.spire.presentation.packages.sprman;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtz;
import com.spire.presentation.packages.sprvp;

@sprtea
public class sprvbn
extends sprman
implements sprtz {
    private double cfr_renamed_86;
    private Object cfr_renamed_152;
    private double cfr_renamed_112;
    private double cfr_renamed_119;
    private double cfr_renamed_91 = 100.0;
    private sprvp cfr_renamed_0;
    private double cfr_renamed_1;
    private sprvp cfr_renamed_2;
    private int cfr_renamed_3;
    private double cfr_renamed_4;

    @Override
    public double cfr_renamed_12726() {
        return this.cfr_renamed_4;
    }

    @Override
    public double cfr_renamed_12485() {
        return this.cfr_renamed_112;
    }

    @Override
    public void cfr_renamed_12717(double arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @Override
    public void cfr_renamed_12727(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public double cfr_renamed_12565() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprvbn(int n) {
        super((int)arg0);
        void arg0;
    }

    @Override
    public int cfr_renamed_12682() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvp cfr_renamed_12489() {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = sprbrn.cfr_renamed_12588(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.cfr_renamed_12589());
        }
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_12719(double arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public double cfr_renamed_12720() {
        return this.cfr_renamed_1;
    }

    @Override
    public void cfr_renamed_12718(double arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @Override
    public Object cfr_renamed_12099() {
        sprvbn sprvbn2 = new sprvbn(this.cfr_renamed_12589());
        sprvbn sprvbn3 = this;
        sprvbn sprvbn4 = sprvbn2;
        sprvbn sprvbn5 = this;
        sprvbn sprvbn6 = sprvbn2;
        sprvbn sprvbn7 = this;
        sprvbn2.cfr_renamed_112 = this.cfr_renamed_12485();
        sprvbn2.cfr_renamed_91 = sprvbn7.cfr_renamed_12723();
        sprvbn6.cfr_renamed_3 = sprvbn7.cfr_renamed_12682();
        sprvbn6.cfr_renamed_4 = this.cfr_renamed_12726();
        sprvbn2.cfr_renamed_1 = sprvbn5.cfr_renamed_12720();
        sprvbn4.cfr_renamed_86 = sprvbn5.cfr_renamed_12729();
        sprvbn4.cfr_renamed_119 = this.cfr_renamed_12565();
        sprvbn2.cfr_renamed_2 = sprvbn3.cfr_renamed_12489().cfr_renamed_12099();
        sprvbn2.cfr_renamed_0 = sprvbn3.cfr_renamed_12661().cfr_renamed_12099();
        sprvbn2.cfr_renamed_152 = this.cfr_renamed_12722();
        return sprvbn2;
    }

    @Override
    public double cfr_renamed_12723() {
        return this.cfr_renamed_91;
    }

    @Override
    public void cfr_renamed_12725(Object arg0) {
        this.cfr_renamed_152 = arg0;
    }

    @Override
    public void cfr_renamed_12728(double arg0) {
        this.cfr_renamed_86 = arg0;
    }

    @Override
    public sprvp cfr_renamed_12721(sprvp arg0) {
        sprvp sprvp2;
        sprvp sprvp3 = sprvp2 = sprbrn.cfr_renamed_12588((float)(this.cfr_renamed_12485() * this.cfr_renamed_12723()), 0.0f, 0.0f, (float)this.cfr_renamed_12485(), 0.0f, (float)this.cfr_renamed_12729(), this.cfr_renamed_12589());
        sprvp3.cfr_renamed_12630(this.cfr_renamed_12489());
        sprvp3.cfr_renamed_12630(arg0);
        return sprvp3;
    }

    @Override
    public void cfr_renamed_12724(double arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @Override
    public void cfr_renamed_11665() {
    }

    @Override
    public Object cfr_renamed_12722() {
        return this.cfr_renamed_152;
    }

    @Override
    public double cfr_renamed_12729() {
        return this.cfr_renamed_86;
    }

    @Override
    public void cfr_renamed_12487(double arg0) {
        this.cfr_renamed_112 = arg0;
    }

    @Override
    public sprvp cfr_renamed_12661() {
        if (this.cfr_renamed_0 == null) {
            this.cfr_renamed_0 = sprbrn.cfr_renamed_12588(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.cfr_renamed_12589());
        }
        return this.cfr_renamed_0;
    }
}

