/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprcqd;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprhqd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlsd;
import com.spire.presentation.packages.sprmse;
import com.spire.presentation.packages.sprmvz;
import com.spire.presentation.packages.sproi;
import com.spire.presentation.packages.spropd;
import com.spire.presentation.packages.sprrqd;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryxd;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprjtd
extends spruua {
    private sprvte cfr_renamed_86;
    private sprije cfr_renamed_152;
    private boolean cfr_renamed_112;
    private sprere cfr_renamed_119;
    public sprmse cfr_renamed_91;
    public spryxd cfr_renamed_0;
    private boolean cfr_renamed_1 = true;
    private sprvte cfr_renamed_2;
    private sprzsd cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprvte cfr_renamed_4190() throws IOException {
        sprere sprere2;
        if (this.cfr_renamed_2 == null && this.cfr_renamed_1 && (sprere2 = this.cfr_renamed_4199()) != null) {
            sprjtd sprjtd2 = this;
            sprjtd2.cfr_renamed_2 = new sprvte(sprere2);
        }
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprere cfr_renamed_4199() throws IOException {
        if (this.cfr_renamed_2 == null && this.cfr_renamed_1) {
            sprbl sprbl2 = this.cfr_renamed_91.cfr_renamed_4190();
            if (sprbl2 != null) {
                this.cfr_renamed_119 = (sprere)sprbl2.cfr_renamed_119();
            }
            this.cfr_renamed_1 = false;
        }
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprjtd(byte[] byArray) throws sprlqd, IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public sprvte cfr_renamed_4191() throws IOException {
        if (this.cfr_renamed_86 == null && this.cfr_renamed_112) {
            sprbl sprbl2 = this.cfr_renamed_91.cfr_renamed_4191();
            this.cfr_renamed_112 = false;
            if (sprbl2 != null) {
                spra spra2;
                sprlre sprlre2 = new sprlre();
                sprbl sprbl3 = sprbl2;
                while ((spra2 = sprbl3.cfr_renamed_24()) != null) {
                    sprao sprao2 = (sprao)spra2;
                    sprbl3 = sprbl2;
                    sprlre2.cfr_renamed_49(sprao2.cfr_renamed_119());
                }
                this.cfr_renamed_86 = new sprvte(new sprcwe(sprlre2));
            }
        }
        return this.cfr_renamed_86;
    }

    public sprzsd cfr_renamed_4170() {
        return this.cfr_renamed_3;
    }

    public spryxd cfr_renamed_4171() {
        return this.cfr_renamed_0;
    }

    public static /* synthetic */ sprere cfr_renamed_4200(sprjtd arg0) throws IOException {
        return arg0.cfr_renamed_4199();
    }

    public byte[] cfr_renamed_3964() {
        if (this.cfr_renamed_2 != null) {
            return sprxue.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_625(sproi.cfr_renamed_3).cfr_renamed_206().cfr_renamed_85(0)).cfr_renamed_186();
        }
        return null;
    }

    private /* synthetic */ byte[] cfr_renamed_3956(spra arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    public sprjtd(InputStream arg0) throws sprlqd, IOException {
        this(arg0, null);
    }

    public String cfr_renamed_4201() {
        return this.cfr_renamed_152.cfr_renamed_593().toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjtd(InputStream inputStream, spraa spraa2) throws sprlqd, IOException {
        super((InputStream)arg0);
        void arg1;
        void arg0;
        sprjtd sprjtd2 = this;
        this.cfr_renamed_91 = new sprmse((sprao)this.cfr_renamed_4.cfr_renamed_697(16));
        sprrve sprrve2 = this.cfr_renamed_91.cfr_renamed_4170();
        if (sprrve2 != null) {
            this.cfr_renamed_3 = new sprzsd(sprrve2);
        }
        sprjtd sprjtd3 = this;
        sprere sprere2 = sprere.cfr_renamed_23(sprjtd3.cfr_renamed_91.cfr_renamed_4171().cfr_renamed_119());
        sprjtd3.cfr_renamed_152 = sprjtd3.cfr_renamed_91.cfr_renamed_4202();
        sprije sprije2 = sprjtd3.cfr_renamed_91.cfr_renamed_410();
        if (sprije2 == null) {
            sprgre sprgre2 = this.cfr_renamed_91.cfr_renamed_4203();
            spropd spropd2 = new spropd(((sprwf)sprgre2.cfr_renamed_697(4)).cfr_renamed_698());
            sprcqd sprcqd2 = new sprcqd(this.cfr_renamed_152, spropd2);
            this.cfr_renamed_0 = sprhqd.cfr_renamed_4157(sprere2, this.cfr_renamed_152, sprcqd2);
            return;
        }
        if (arg1 == null) {
            throw new sprlqd(sprmvz.cfr_renamed_9(" \u0004%M&A2PaG H\"Q-E5K3\u00041V.R(@$VaM2\u00043A0Q(V$@aM'\u0004 Q5L$J5M\"E5A%\u0004 P5V(F4P$WaE3AaT3A2A/P"));
        }
        sprgre sprgre3 = this.cfr_renamed_91.cfr_renamed_4203();
        spropd spropd3 = new spropd(((sprwf)sprgre3.cfr_renamed_697(4)).cfr_renamed_698());
        try {
            sprrqd sprrqd2 = new sprrqd(arg1.cfr_renamed_578(sprije2), spropd3);
            this.cfr_renamed_0 = sprhqd.cfr_renamed_4158(sprere2, this.cfr_renamed_152, sprrqd2, new sprlsd(this));
            return;
        }
        catch (sprfya sprfya2) {
            throw new sprlqd(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("\u000fm\u001ba\u0016fZw\u0015#\u0019q\u001fb\u000efZg\u0013d\u001fp\u000e#\u0019b\u0016`\u000fo\u001bw\u0015q@#")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
    }

    public byte[] cfr_renamed_1472() throws IOException {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4190();
            this.cfr_renamed_4 = this.cfr_renamed_91.cfr_renamed_1472().cfr_renamed_186();
        }
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprije cfr_renamed_4202() {
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    public sprjtd(byte[] byArray, spraa spraa2) throws sprlqd, IOException {
        this(new ByteArrayInputStream((byte[])arg0), (spraa)arg1);
        void arg1;
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4204() {
        try {
            sprjtd sprjtd2 = this;
            return sprjtd2.cfr_renamed_3956(sprjtd2.cfr_renamed_152.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprmvz.cfr_renamed_9("$\\\"A1P(K/\u0004&A5P(J&\u0004$J\"V8T5M.JaT V I$P$V2\u0004")).append(exception).toString());
        }
    }
}

