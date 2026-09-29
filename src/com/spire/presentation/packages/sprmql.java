/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyl;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprful;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spriwl;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlkm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprqy;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprvwl;
import com.spire.presentation.packages.sprvye;
import com.spire.presentation.packages.sprwpl;
import com.spire.presentation.packages.sprytl;
import com.spire.presentation.packages.sprzy;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprmql
extends sprvye {
    private sprnpl cfr_renamed_86;
    private sprjpm cfr_renamed_152;
    private boolean cfr_renamed_112;
    private boolean cfr_renamed_119 = true;
    private sprddm cfr_renamed_91;
    private sprjpm cfr_renamed_0;
    private spridn cfr_renamed_1;
    public sprbyl cfr_renamed_2;
    public sprlkm cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ spridn cfr_renamed_4199() throws IOException {
        if (this.cfr_renamed_152 == null && this.cfr_renamed_119) {
            sprzy sprzy2 = this.cfr_renamed_3.cfr_renamed_4190();
            if (sprzy2 != null) {
                this.cfr_renamed_1 = (spridn)sprzy2.cfr_renamed_119();
            }
            this.cfr_renamed_119 = false;
        }
        return this.cfr_renamed_1;
    }

    private /* synthetic */ byte[] cfr_renamed_10646(sprco arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmql(byte[] byArray) throws sprlyl, IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public sprbyl cfr_renamed_4171() {
        return this.cfr_renamed_2;
    }

    public sprjpm cfr_renamed_4191() throws IOException {
        if (this.cfr_renamed_0 == null && this.cfr_renamed_112) {
            sprzy sprzy2 = this.cfr_renamed_3.cfr_renamed_4191();
            this.cfr_renamed_112 = false;
            if (sprzy2 != null) {
                sprco sprco2;
                sprrvm sprrvm2 = new sprrvm();
                sprzy sprzy3 = sprzy2;
                while ((sprco2 = sprzy3.cfr_renamed_24()) != null) {
                    sprqp sprqp2 = (sprqp)sprco2;
                    sprzy3 = sprzy2;
                    sprrvm2.cfr_renamed_5004(sprqp2.cfr_renamed_119());
                }
                this.cfr_renamed_0 = new sprjpm(new sprocn(sprrvm2));
            }
        }
        return this.cfr_renamed_0;
    }

    public sprmql(InputStream arg0) throws sprlyl, IOException {
        this(arg0, null);
    }

    public sprnpl cfr_renamed_4170() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmql(InputStream inputStream, sprlj sprlj2) throws sprlyl, IOException {
        super((InputStream)arg0);
        void arg1;
        void arg0;
        sprmql sprmql2 = this;
        this.cfr_renamed_3 = new sprlkm((sprqp)this.cfr_renamed_4.cfr_renamed_697(16));
        sprpnm sprpnm2 = this.cfr_renamed_3.cfr_renamed_4170();
        if (sprpnm2 != null) {
            this.cfr_renamed_86 = new sprnpl(sprpnm2);
        }
        sprmql sprmql3 = this;
        spridn spridn2 = spridn.cfr_renamed_23(sprmql3.cfr_renamed_3.cfr_renamed_4171().cfr_renamed_119());
        sprmql3.cfr_renamed_91 = sprmql3.cfr_renamed_3.cfr_renamed_4202();
        sprddm sprddm2 = sprmql3.cfr_renamed_3.cfr_renamed_410();
        if (sprddm2 == null) {
            sprjvm sprjvm2 = this.cfr_renamed_3.cfr_renamed_4203();
            sprytl sprytl2 = new sprytl(((sprme)sprjvm2.cfr_renamed_697(4)).cfr_renamed_698());
            spriwl spriwl2 = new spriwl(this.cfr_renamed_91, sprjvm2.cfr_renamed_696(), sprytl2);
            this.cfr_renamed_2 = sprvwl.cfr_renamed_10801(spridn2, this.cfr_renamed_91, spriwl2);
            return;
        }
        if (arg1 == null) {
            throw new sprlyl(sprhyo.cfr_renamed_9("t\tq@rLf]5JtEv\\yHaFg\te[z_|Mp[5@f\tgLd\\|[pM5@s\tt\\aApGa@vHaLq\tt]a[|K`]pZ5HgL5YgLfL{]"));
        }
        sprjvm sprjvm3 = this.cfr_renamed_3.cfr_renamed_4203();
        sprytl sprytl3 = new sprytl(((sprme)sprjvm3.cfr_renamed_697(4)).cfr_renamed_698());
        try {
            sprwpl sprwpl2 = new sprwpl(arg1.cfr_renamed_5279(sprddm2), sprjvm3.cfr_renamed_696(), sprytl3);
            this.cfr_renamed_2 = sprvwl.cfr_renamed_10799(spridn2, this.cfr_renamed_91, sprwpl2, new sprful(this));
            return;
        }
        catch (sprhjg sprhjg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprogb.cfr_renamed_9("${0w=pqa>52g4t%pqq8r4f%52t=v$y0a>gk5")).append(sprhjg2.getMessage()).toString(), sprhjg2);
        }
    }

    public sprddm cfr_renamed_4202() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_1472() throws IOException {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4190();
            this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_1472().cfr_renamed_186();
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_3964() {
        if (this.cfr_renamed_152 != null) {
            return sproug.cfr_renamed_23(this.cfr_renamed_152.cfr_renamed_5299(sprqy.cfr_renamed_0).cfr_renamed_206().cfr_renamed_85(0)).cfr_renamed_186();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4204() {
        try {
            sprmql sprmql2 = this;
            return sprmql2.cfr_renamed_10646(sprmql2.cfr_renamed_91.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprhyo.cfr_renamed_9("pQvLe]|F{\trLa]|Gr\tpGv[lYa@zG5Yt[tDp]p[f\t")).append(exception).toString());
        }
    }

    public String cfr_renamed_4201() {
        return this.cfr_renamed_91.cfr_renamed_593().toString();
    }

    public static /* synthetic */ spridn cfr_renamed_10833(sprmql arg0) throws IOException {
        return arg0.cfr_renamed_4199();
    }

    public sprjpm cfr_renamed_4190() throws IOException {
        spridn spridn2;
        if (this.cfr_renamed_152 == null && this.cfr_renamed_119 && (spridn2 = this.cfr_renamed_4199()) != null) {
            sprmql sprmql2 = this;
            sprmql2.cfr_renamed_152 = new sprjpm(spridn2);
        }
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    public sprmql(byte[] byArray, sprlj sprlj2) throws sprlyl, IOException {
        this(new ByteArrayInputStream((byte[])arg0), (sprlj)arg1);
        void arg1;
        void arg0;
    }
}

