/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfra;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprjmb;
import com.spire.presentation.packages.sprlmb;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprozd;
import com.spire.presentation.packages.sprpna;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprz;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class sprtkb
extends sprlmb {
    private static final sprjmb cfr_renamed_1 = new sprjmb("ATTRIBUTE CERTIFICATE");
    private sprere cfr_renamed_2;
    private int cfr_renamed_3;
    private InputStream cfr_renamed_4;

    private /* synthetic */ sprz cfr_renamed_2142(InputStream arg0) throws IOException {
        sprbne sprbne2 = cfr_renamed_1.cfr_renamed_2129(arg0);
        if (sprbne2 != null) {
            return new sprfra(sprbne2.cfr_renamed_91());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_138(InputStream inputStream) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = null;
        this.cfr_renamed_3 = 0;
        if (!this.cfr_renamed_4.markSupported()) {
            sprtkb sprtkb2 = this;
            this.cfr_renamed_4 = new BufferedInputStream(this.cfr_renamed_4);
        }
    }

    private /* synthetic */ sprz cfr_renamed_2143(InputStream arg0) throws IOException {
        sprbne sprbne2 = (sprbne)new sprgle(arg0).cfr_renamed_24();
        if (sprbne2.cfr_renamed_84() > 1 && sprbne2.cfr_renamed_85(0) instanceof sprtzd && sprbne2.cfr_renamed_85(0).equals(sprm.cfr_renamed_1397)) {
            sprtkb sprtkb2 = this;
            sprtkb2.cfr_renamed_2 = new sprozd(sprbne.cfr_renamed_341((spryte)sprbne2.cfr_renamed_85(1), true)).cfr_renamed_617();
            return this.cfr_renamed_2141();
        }
        return new sprfra(sprbne2.cfr_renamed_91());
    }

    public sprtkb() {
        sprtkb sprtkb2 = this;
        this.cfr_renamed_2 = null;
        sprtkb2.cfr_renamed_3 = 0;
        sprtkb2.cfr_renamed_4 = null;
    }

    private /* synthetic */ sprz cfr_renamed_2141() throws IOException {
        block2: {
            if (this.cfr_renamed_2 != null) {
                spra spra2;
                do {
                    sprtkb sprtkb2 = this;
                    if (sprtkb2.cfr_renamed_3 >= sprtkb2.cfr_renamed_2.cfr_renamed_84()) break block2;
                } while (!((spra2 = this.cfr_renamed_2.cfr_renamed_85(this.cfr_renamed_3++)) instanceof spryte) || ((spryte)spra2).cfr_renamed_312() != 2);
                return new sprfra(sprbne.cfr_renamed_341((spryte)spra2, false).cfr_renamed_91());
            }
        }
        return null;
    }

    @Override
    public Object cfr_renamed_139() throws sprpna {
        block6: {
            block7: {
                try {
                    if (this.cfr_renamed_2 == null) break block6;
                    sprtkb sprtkb2 = this;
                    if (sprtkb2.cfr_renamed_3 == sprtkb2.cfr_renamed_2.cfr_renamed_84()) break block7;
                    return this.cfr_renamed_2141();
                }
                catch (Exception exception) {
                    throw new sprpna(exception.toString(), exception);
                }
            }
            this.cfr_renamed_2 = null;
            this.cfr_renamed_3 = 0;
            return null;
        }
        sprtkb sprtkb3 = this;
        sprtkb3.cfr_renamed_4.mark(10);
        int n = sprtkb3.cfr_renamed_4.read();
        if (n == -1) {
            return null;
        }
        if (n != 48) {
            sprtkb sprtkb4 = this;
            sprtkb4.cfr_renamed_4.reset();
            return sprtkb4.cfr_renamed_2142(sprtkb4.cfr_renamed_4);
        }
        sprtkb sprtkb5 = this;
        sprtkb5.cfr_renamed_4.reset();
        return sprtkb5.cfr_renamed_2143(sprtkb5.cfr_renamed_4);
    }

    @Override
    public Collection cfr_renamed_140() throws sprpna {
        sprz sprz2;
        ArrayList<sprz> arrayList = new ArrayList<sprz>();
        sprtkb sprtkb2 = this;
        while ((sprz2 = (sprz)sprtkb2.cfr_renamed_139()) != null) {
            sprtkb2 = this;
            arrayList.add(sprz2);
        }
        return arrayList;
    }
}

