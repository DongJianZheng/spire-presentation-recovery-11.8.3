/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprazaa;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdse;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprhqd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.spropd;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprvse;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.sprxqd;
import com.spire.presentation.packages.spryxd;
import com.spire.presentation.packages.sprzsd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprgpd
extends spruua {
    private sprzsd cfr_renamed_91;
    private sprvte cfr_renamed_0;
    public spryxd cfr_renamed_1;
    private boolean cfr_renamed_2 = true;
    public sprvse cfr_renamed_3;
    private sprije cfr_renamed_4;

    public sprzsd cfr_renamed_4170() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprgpd(byte[] byArray) throws sprlqd, IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public String cfr_renamed_3959() {
        return this.cfr_renamed_4.cfr_renamed_593().toString();
    }

    public spryxd cfr_renamed_4171() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprgpd(InputStream inputStream) throws sprlqd, IOException {
        super((InputStream)arg0);
        void arg0;
        sprgpd sprgpd2 = this;
        this.cfr_renamed_3 = new sprvse((sprao)((sprgre)((Object)this.cfr_renamed_4)).cfr_renamed_697(16));
        sprrve sprrve2 = this.cfr_renamed_3.cfr_renamed_4170();
        if (sprrve2 != null) {
            this.cfr_renamed_91 = new sprzsd(sprrve2);
        }
        sprgpd sprgpd3 = this;
        sprere sprere2 = sprere.cfr_renamed_23(sprgpd3.cfr_renamed_3.cfr_renamed_4171().cfr_renamed_119());
        sprdse sprdse2 = sprgpd3.cfr_renamed_3.cfr_renamed_4172();
        sprgpd3.cfr_renamed_4 = sprdse2.cfr_renamed_4173();
        spropd spropd2 = new spropd(((sprwf)sprdse2.cfr_renamed_4174(4)).cfr_renamed_698());
        sprxqd sprxqd2 = new sprxqd(this.cfr_renamed_4, spropd2);
        this.cfr_renamed_1 = sprhqd.cfr_renamed_4157(sprere2, this.cfr_renamed_4, sprxqd2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3697() {
        try {
            sprgpd sprgpd2 = this;
            return sprgpd2.cfr_renamed_3956(sprgpd2.cfr_renamed_4.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprazaa.cfr_renamed_9("6*07#&:==r47'&:<4r6<0 *\"';<<s\"2 2?6&6  r")).append(exception).toString());
        }
    }

    private /* synthetic */ byte[] cfr_renamed_3956(spra arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    public sprije cfr_renamed_4173() {
        return this.cfr_renamed_4;
    }

    public sprvte cfr_renamed_4175() throws IOException {
        if (this.cfr_renamed_0 == null && this.cfr_renamed_2) {
            sprbl sprbl2 = this.cfr_renamed_3.cfr_renamed_4176();
            this.cfr_renamed_2 = false;
            if (sprbl2 != null) {
                spra spra2;
                sprlre sprlre2 = new sprlre();
                sprbl sprbl3 = sprbl2;
                while ((spra2 = sprbl3.cfr_renamed_24()) != null) {
                    sprao sprao2 = (sprao)spra2;
                    sprbl3 = sprbl2;
                    sprlre2.cfr_renamed_49(sprao2.cfr_renamed_119());
                }
                this.cfr_renamed_0 = new sprvte(new sprcwe(sprlre2));
            }
        }
        return this.cfr_renamed_0;
    }
}

