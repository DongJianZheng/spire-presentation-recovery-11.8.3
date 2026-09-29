/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfoo;
import com.spire.presentation.packages.sprgbg;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprsxf;
import com.spire.presentation.packages.sprvhf;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class spriag
extends sprgbg {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spriag() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(sprgbg.class.getResourceAsStream(sprfoo.cfr_renamed_9("\u0018F\u0003D\u0017eE\u0007\u0016@\u001a\u0007\u0004[\u001bY\u0011[\u0000@\u0011Z"))));
            spriag spriag2 = this;
            DataInputStream dataInputStream2 = dataInputStream;
            spriag spriag3 = this;
            DataInputStream dataInputStream3 = dataInputStream;
            spriag spriag4 = this;
            spriag4.cfr_renamed_79 = spriag.cfr_renamed_6322(dataInputStream);
            spriag4.cfr_renamed_0 = spriag.cfr_renamed_6322(dataInputStream);
            this.cfr_renamed_86 = spriag.cfr_renamed_6322(dataInputStream3);
            spriag3.cfr_renamed_2 = spriag.cfr_renamed_6322(dataInputStream3);
            spriag3.cfr_renamed_4 = spriag.cfr_renamed_6322(dataInputStream);
            this.cfr_renamed_137 = spriag.cfr_renamed_6322(dataInputStream2);
            spriag2.cfr_renamed_1 = spriag.cfr_renamed_6322(dataInputStream2);
            spriag2.cfr_renamed_132 = spriag.cfr_renamed_6322(dataInputStream);
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(new StringBuilder().insert(0, sprhsh.cfr_renamed_9("4= 1-6a'.s-< 7a\u0003(0/:\"s1!.#$!5:$ {s")).append(iOException.getMessage()).toString(), iOException);
        }
        this.cfr_renamed_102 = new sprsxf(20, 128, 4, this.cfr_renamed_79);
        spriag spriag5 = this;
        spriag spriag6 = this;
        spriag5.cfr_renamed_93 = new sprsxf(21, 128, 4, this.cfr_renamed_86);
        spriag6.cfr_renamed_107 = new sprsxf(0, 1, 4, this.cfr_renamed_0);
        spriag5.cfr_renamed_112 = new sprsxf(4, 129, 5, this.cfr_renamed_2);
        spriag5.cfr_renamed_91 = new sprsxf(4, 129, 5, this.cfr_renamed_1);
        spriag5.cfr_renamed_152 = new sprsxf(5, 129, 5, this.cfr_renamed_4);
        spriag5.cfr_renamed_119 = new sprsxf(1, 129, 5, this.cfr_renamed_137);
        spriag5.cfr_renamed_3 = new sprsxf(4, 1, 5, this.cfr_renamed_132);
    }
}

