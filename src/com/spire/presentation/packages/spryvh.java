/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcrh;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprese;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprkle;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqyl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class spryvh
extends sprjth {
    private InputStream cfr_renamed_1;
    private spridn cfr_renamed_2;
    private int cfr_renamed_3;
    private static final sprcrh cfr_renamed_4 = new sprcrh("ATTRIBUTE CERTIFICATE");

    @Override
    public Object cfr_renamed_139() throws sprese {
        block6: {
            block7: {
                try {
                    if (this.cfr_renamed_2 == null) break block6;
                    spryvh spryvh2 = this;
                    if (spryvh2.cfr_renamed_3 == spryvh2.cfr_renamed_2.cfr_renamed_84()) break block7;
                    return this.cfr_renamed_2141();
                }
                catch (Exception exception) {
                    throw new sprese(exception.toString(), exception);
                }
            }
            this.cfr_renamed_2 = null;
            this.cfr_renamed_3 = 0;
            return null;
        }
        spryvh spryvh3 = this;
        spryvh3.cfr_renamed_1.mark(10);
        int n = spryvh3.cfr_renamed_1.read();
        if (n == -1) {
            return null;
        }
        if (n != 48) {
            spryvh spryvh4 = this;
            spryvh4.cfr_renamed_1.reset();
            return spryvh4.cfr_renamed_2142(spryvh4.cfr_renamed_1);
        }
        spryvh spryvh5 = this;
        spryvh5.cfr_renamed_1.reset();
        return spryvh5.cfr_renamed_2143(spryvh5.cfr_renamed_1);
    }

    @Override
    public Collection cfr_renamed_140() throws sprese {
        sprbd sprbd2;
        ArrayList<sprbd> arrayList = new ArrayList<sprbd>();
        spryvh spryvh2 = this;
        while ((sprbd2 = (sprbd)spryvh2.cfr_renamed_139()) != null) {
            spryvh2 = this;
            arrayList.add(sprbd2);
        }
        return arrayList;
    }

    private /* synthetic */ sprbd cfr_renamed_2142(InputStream arg0) throws IOException {
        sprszm sprszm2 = cfr_renamed_4.cfr_renamed_2129(arg0);
        if (sprszm2 != null) {
            return new sprkle(sprszm2.cfr_renamed_91());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_138(InputStream inputStream) {
        void arg0;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = null;
        this.cfr_renamed_3 = 0;
        if (!this.cfr_renamed_1.markSupported()) {
            spryvh spryvh2 = this;
            this.cfr_renamed_1 = new BufferedInputStream(this.cfr_renamed_1);
        }
    }

    public spryvh() {
        spryvh spryvh2 = this;
        this.cfr_renamed_2 = null;
        spryvh2.cfr_renamed_3 = 0;
        spryvh2.cfr_renamed_1 = null;
    }

    private /* synthetic */ sprbd cfr_renamed_2143(InputStream arg0) throws IOException {
        sprszm sprszm2 = sprszm.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24());
        if (sprszm2.cfr_renamed_84() > 1 && sprszm2.cfr_renamed_85(0) instanceof sprlem && sprszm2.cfr_renamed_85(0).equals(sprdl.cfr_renamed_128)) {
            spryvh spryvh2 = this;
            spryvh2.cfr_renamed_2 = new sprqyl(sprszm.cfr_renamed_5085((sprnvm)sprszm2.cfr_renamed_85(1), true)).cfr_renamed_617();
            return this.cfr_renamed_2141();
        }
        return new sprkle(sprszm2.cfr_renamed_91());
    }

    private /* synthetic */ sprbd cfr_renamed_2141() throws IOException {
        block2: {
            if (this.cfr_renamed_2 != null) {
                sprco sprco2;
                do {
                    spryvh spryvh2 = this;
                    if (spryvh2.cfr_renamed_3 >= spryvh2.cfr_renamed_2.cfr_renamed_84()) break block2;
                } while (!((sprco2 = this.cfr_renamed_2.cfr_renamed_85(this.cfr_renamed_3++)) instanceof sprnvm) || ((sprnvm)sprco2).cfr_renamed_312() != 2);
                return new sprkle(sprszm.cfr_renamed_5085((sprnvm)sprco2, false).cfr_renamed_91());
            }
        }
        return null;
    }
}

