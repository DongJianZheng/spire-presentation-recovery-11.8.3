/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdih;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprhg;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sprooe;
import java.io.IOException;

public class sprhme {
    private Object cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprao cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprbl cfr_renamed_4145() throws IOException {
        if (!this.cfr_renamed_1) {
            throw new IOException(sprmwy.cfr_renamed_9("@\u0002S$B\u0015S\u0014\u000fN\u0007\u000fF\u0014\u0007\tH\u0013\u0007\u0005B\u0002IGD\u0006K\u000bB\u0003\t"));
        }
        this.cfr_renamed_3 = true;
        if (this.cfr_renamed_0 == null) {
            this.cfr_renamed_0 = this.cfr_renamed_2.cfr_renamed_24();
        }
        if (this.cfr_renamed_0 instanceof sprhg && ((sprhg)this.cfr_renamed_0).cfr_renamed_312() == 1) {
            this.cfr_renamed_0 = null;
            return (sprbl)((sprhg)this.cfr_renamed_0).cfr_renamed_4829(17, false);
        }
        return null;
    }

    public sprbl cfr_renamed_621() throws IOException {
        if (!this.cfr_renamed_1 || !this.cfr_renamed_3) {
            throw new IOException(sprdih.cfr_renamed_9("CGPaAPPQ\f\u000b\u0004CJF\u000bMV\u0002CGPaVNW\n\r\u0002LCW\u0002JMP\u0002FGAL\u0004AENHG@\f"));
        }
        if (this.cfr_renamed_0 == null) {
            this.cfr_renamed_0 = this.cfr_renamed_2.cfr_renamed_24();
        }
        return (sprbl)this.cfr_renamed_0;
    }

    public sprgre cfr_renamed_2589() throws IOException {
        return new sprgre((sprao)this.cfr_renamed_2.cfr_renamed_24());
    }

    public sprbl cfr_renamed_617() throws IOException {
        sprhme sprhme2 = this;
        sprhme2.cfr_renamed_1 = true;
        sprhme2.cfr_renamed_0 = sprhme2.cfr_renamed_2.cfr_renamed_24();
        if (sprhme2.cfr_renamed_0 instanceof sprhg && ((sprhg)this.cfr_renamed_0).cfr_renamed_312() == 0) {
            this.cfr_renamed_0 = null;
            return (sprbl)((sprhg)this.cfr_renamed_0).cfr_renamed_4829(17, false);
        }
        return null;
    }

    public static sprhme cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprbne) {
            return new sprhme(((sprbne)arg0).cfr_renamed_4828());
        }
        if (arg0 instanceof sprao) {
            return new sprhme((sprao)arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("\u0012I\fI\bP\t\u0007\bE\rB\u0004SGB\tD\bR\tS\u0002U\u0002C]\u0007")).append(arg0.getClass().getName()).toString());
    }

    public sprbl cfr_renamed_4139() throws IOException {
        spra spra2 = this.cfr_renamed_2.cfr_renamed_24();
        if (spra2 instanceof sprere) {
            return ((sprere)spra2).cfr_renamed_4828();
        }
        return (sprbl)spra2;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhme(sprao sprao2) throws IOException {
        void arg0;
        sprhme sprhme2 = this;
        sprhme2.cfr_renamed_2 = arg0;
        sprhme2.cfr_renamed_4 = (sprooe)sprao2.cfr_renamed_24();
    }
}

