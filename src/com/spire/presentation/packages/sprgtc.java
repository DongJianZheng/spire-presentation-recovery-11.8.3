/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbki;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sproc;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public abstract class sprgtc
implements sproc {
    public sprsc cfr_renamed_2;
    public int cfr_renamed_3;
    public Vector cfr_renamed_4;

    @Override
    public void cfr_renamed_2956() throws IOException {
        if (this.cfr_renamed_2788()) {
            throw new spryad(10);
        }
    }

    @Override
    public byte[] cfr_renamed_2879() throws IOException {
        if (this.cfr_renamed_2788()) {
            throw new spryad(80);
        }
        return null;
    }

    @Override
    public void cfr_renamed_2786(sprbbd arg0) throws IOException {
        if (this.cfr_renamed_4 == null) {
            // empty if block
        }
    }

    @Override
    public void cfr_renamed_2845() throws IOException {
    }

    @Override
    public void spr\u3027(sprsj arg0) throws IOException {
        this.cfr_renamed_2786(arg0.cfr_renamed_2141());
    }

    @Override
    public void cfr_renamed_2789(InputStream arg0) throws IOException {
        if (!this.cfr_renamed_2788()) {
            throw new spryad(10);
        }
    }

    @Override
    public boolean cfr_renamed_2788() {
        return false;
    }

    @Override
    public void cfr_renamed_2857(InputStream arg0) throws IOException {
        throw new spryad(80);
    }

    @Override
    public void cfr_renamed_2846(sprbbd arg0) throws IOException {
    }

    @Override
    public void cfr_renamed_2797(sprsc arg0) {
        this.cfr_renamed_2 = arg0;
        sprpxc sprpxc2 = this.cfr_renamed_2.cfr_renamed_2824();
        if (sprzsc.cfr_renamed_2756(sprpxc2)) {
            if (this.cfr_renamed_4 == null) {
                switch (this.cfr_renamed_3) {
                    case 3: 
                    case 7: 
                    case 22: {
                        this.cfr_renamed_4 = sprzsc.cfr_renamed_2737();
                        return;
                    }
                    case 16: 
                    case 17: {
                        this.cfr_renamed_4 = sprzsc.cfr_renamed_2717();
                        return;
                    }
                    case 1: 
                    case 5: 
                    case 9: 
                    case 15: 
                    case 18: 
                    case 19: 
                    case 23: {
                        while (false) {
                        }
                        this.cfr_renamed_4 = sprzsc.cfr_renamed_2766();
                        return;
                    }
                    case 13: 
                    case 14: 
                    case 21: 
                    case 24: {
                        return;
                    }
                }
                throw new IllegalStateException(sprbki.cfr_renamed_9("v(p3s6l4w#gfh#zff>`.b(d##'o!l4j2k+"));
            }
        } else if (this.cfr_renamed_4 != null) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprmah.cfr_renamed_9("\"0!5>7% 5\u001a\",6+01$74\u001a0)6*#,%-<6q+>1q$=)>24!q#>7q")).append(sprpxc2).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprgtc(int n, Vector vector) {
        void arg0;
        sprgtc sprgtc2 = this;
        sprgtc2.cfr_renamed_3 = arg0;
        sprgtc2.cfr_renamed_4 = vector;
    }
}

