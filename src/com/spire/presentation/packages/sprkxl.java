/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprbyl;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprhvl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprqmn;
import com.spire.presentation.packages.sprsqr;
import com.spire.presentation.packages.sprvwl;
import java.io.IOException;
import java.io.InputStream;

public class sprkxl
implements sprjn {
    private spridn cfr_renamed_0;
    private sprnpl cfr_renamed_1;
    public sprlvm cfr_renamed_2;
    private sprddm cfr_renamed_3;
    public sprbyl cfr_renamed_4;

    public sprnpl cfr_renamed_4170() {
        return this.cfr_renamed_1;
    }

    public sprlvm cfr_renamed_568() {
        return this.cfr_renamed_2;
    }

    public sprjpm cfr_renamed_4175() {
        if (this.cfr_renamed_0 == null) {
            return null;
        }
        return new sprjpm(this.cfr_renamed_0);
    }

    private /* synthetic */ byte[] cfr_renamed_10646(sprco arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3697() {
        try {
            sprkxl sprkxl2 = this;
            return sprkxl2.cfr_renamed_10646(sprkxl2.cfr_renamed_3.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprsqr.cfr_renamed_9("\u0007f\u0001{\u0012j\u000bq\f>\u0005{\u0016j\u000bp\u0005>\u0007p\u0001l\u001bn\u0016w\rpBn\u0003l\u0003s\u0007j\u0007l\u0011>")).append(exception).toString());
        }
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_91();
    }

    public sprbyl cfr_renamed_4171() {
        return this.cfr_renamed_4;
    }

    public sprkxl(InputStream arg0) throws sprlyl {
        this(spreul.cfr_renamed_4104(arg0));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkxl(sprlvm sprlvm2) throws sprlyl {
        this.cfr_renamed_2 = sprlvm2;
        try {
            void arg0;
            sprjtm sprjtm2 = sprjtm.cfr_renamed_23(arg0.cfr_renamed_480());
            if (sprjtm2.cfr_renamed_4170() != null) {
                sprkxl sprkxl2 = this;
                sprkxl2.cfr_renamed_1 = new sprnpl(sprjtm2.cfr_renamed_4170());
            }
            sprjtm sprjtm3 = sprjtm2;
            spridn spridn2 = sprjtm3.cfr_renamed_4171();
            sprnum sprnum2 = sprjtm3.cfr_renamed_4172();
            sprkxl sprkxl3 = this;
            sprkxl3.cfr_renamed_3 = sprnum2.cfr_renamed_4173();
            spraql spraql2 = new spraql(sprnum2.cfr_renamed_4178().cfr_renamed_186());
            sprhvl sprhvl2 = new sprhvl(this.cfr_renamed_3, sprnum2.cfr_renamed_696(), spraql2);
            sprkxl3.cfr_renamed_4 = sprvwl.cfr_renamed_10801(spridn2, this.cfr_renamed_3, sprhvl2);
            this.cfr_renamed_0 = sprjtm2.cfr_renamed_4176();
            return;
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprqmn.cfr_renamed_9("\u0014%5\"664!=d:+70<*-j"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlyl(sprsqr.cfr_renamed_9("/\u007f\u000ex\rl\u000f{\u0006>\u0001q\fj\u0007p\u00160"), illegalArgumentException);
        }
    }

    public sprddm cfr_renamed_4173() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_3959() {
        return this.cfr_renamed_3.cfr_renamed_593().cfr_renamed_19();
    }

    public sprkxl(byte[] arg0) throws sprlyl {
        this(spreul.cfr_renamed_4106(arg0));
    }
}

