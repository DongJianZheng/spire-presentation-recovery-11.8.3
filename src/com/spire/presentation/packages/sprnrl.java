/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyl;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprepm;
import com.spire.presentation.packages.sprhvl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpaba;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprqqm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprvwl;
import com.spire.presentation.packages.sprvye;
import com.spire.presentation.packages.sprytl;
import com.spire.presentation.packages.sprzy;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprnrl
extends sprvye {
    private boolean cfr_renamed_91 = true;
    public sprbyl cfr_renamed_0;
    private sprddm cfr_renamed_1;
    public sprqqm cfr_renamed_2;
    private sprjpm cfr_renamed_3;
    private sprnpl cfr_renamed_4;

    public sprddm cfr_renamed_4173() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprnrl(InputStream inputStream) throws sprlyl, IOException {
        super((InputStream)arg0);
        void arg0;
        sprnrl sprnrl2 = this;
        this.cfr_renamed_2 = new sprqqm((sprqp)((sprjvm)((Object)this.cfr_renamed_4)).cfr_renamed_697(16));
        sprpnm sprpnm2 = this.cfr_renamed_2.cfr_renamed_4170();
        if (sprpnm2 != null) {
            this.cfr_renamed_4 = new sprnpl(sprpnm2);
        }
        sprnrl sprnrl3 = this;
        spridn spridn2 = spridn.cfr_renamed_23(sprnrl3.cfr_renamed_2.cfr_renamed_4171().cfr_renamed_119());
        sprepm sprepm2 = sprnrl3.cfr_renamed_2.cfr_renamed_4172();
        sprnrl3.cfr_renamed_1 = sprepm2.cfr_renamed_4173();
        sprytl sprytl2 = new sprytl(((sprme)sprepm2.cfr_renamed_4174(4)).cfr_renamed_698());
        sprhvl sprhvl2 = new sprhvl(this.cfr_renamed_1, sprepm2.cfr_renamed_696(), sprytl2);
        this.cfr_renamed_0 = sprvwl.cfr_renamed_10801(spridn2, this.cfr_renamed_1, sprhvl2);
    }

    /*
     * WARNING - void declaration
     */
    public sprnrl(byte[] byArray) throws sprlyl, IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3697() {
        try {
            sprnrl sprnrl2 = this;
            return sprnrl2.cfr_renamed_10646(sprnrl2.cfr_renamed_1.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprpaba.cfr_renamed_9("n_hB{SbHe\u0007lB\u007fSbIl\u0007nIhUrW\u007fNdI+WjUjJnSnUx\u0007")).append(exception).toString());
        }
    }

    private /* synthetic */ byte[] cfr_renamed_10646(sprco arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    public sprnpl cfr_renamed_4170() {
        return this.cfr_renamed_4;
    }

    public sprjpm cfr_renamed_4175() throws IOException {
        if (this.cfr_renamed_3 == null && this.cfr_renamed_91) {
            sprzy sprzy2 = this.cfr_renamed_2.cfr_renamed_4176();
            this.cfr_renamed_91 = false;
            if (sprzy2 != null) {
                sprco sprco2;
                sprrvm sprrvm2 = new sprrvm();
                sprzy sprzy3 = sprzy2;
                while ((sprco2 = sprzy3.cfr_renamed_24()) != null) {
                    sprqp sprqp2 = (sprqp)sprco2;
                    sprzy3 = sprzy2;
                    sprrvm2.cfr_renamed_5004(sprqp2.cfr_renamed_119());
                }
                this.cfr_renamed_3 = new sprjpm(new sprocn(sprrvm2));
            }
        }
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_3959() {
        return this.cfr_renamed_1.cfr_renamed_593().toString();
    }

    public sprbyl cfr_renamed_4171() {
        return this.cfr_renamed_0;
    }
}

