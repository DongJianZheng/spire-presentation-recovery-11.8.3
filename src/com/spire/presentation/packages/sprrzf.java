/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgbg;
import com.spire.presentation.packages.sprsxf;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprxkr;
import com.spire.presentation.packages.spryur;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class sprrzf
extends sprgbg {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrzf() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(sprgbg.class.getResourceAsStream(sprxkr.cfr_renamed_9("`%{'o\u00069dn#bd|8c:i8x#i9"))));
            sprrzf sprrzf2 = this;
            DataInputStream dataInputStream2 = dataInputStream;
            sprrzf sprrzf3 = this;
            DataInputStream dataInputStream3 = dataInputStream;
            sprrzf sprrzf4 = this;
            sprrzf4.cfr_renamed_79 = sprrzf.cfr_renamed_6322(dataInputStream);
            sprrzf4.cfr_renamed_0 = sprrzf.cfr_renamed_6322(dataInputStream);
            this.cfr_renamed_86 = sprrzf.cfr_renamed_6322(dataInputStream3);
            sprrzf3.cfr_renamed_2 = sprrzf.cfr_renamed_6322(dataInputStream3);
            sprrzf3.cfr_renamed_4 = sprrzf.cfr_renamed_6322(dataInputStream);
            this.cfr_renamed_137 = sprrzf.cfr_renamed_6322(dataInputStream2);
            sprrzf2.cfr_renamed_1 = sprrzf.cfr_renamed_6322(dataInputStream2);
            sprrzf2.cfr_renamed_132 = sprrzf.cfr_renamed_6322(dataInputStream);
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(new StringBuilder().insert(0, spryur.cfr_renamed_9("\u00022\u0016>\u001b9W(\u0018|\u001b3\u00168W\f\u001e?\u00195\u0014|\u0007.\u0018,\u0012.\u00035\u0012/M|")).append(iOException.getMessage()).toString(), iOException);
        }
        this.cfr_renamed_102 = new sprsxf(38, 256, 8, this.cfr_renamed_79);
        sprrzf sprrzf5 = this;
        sprrzf sprrzf6 = this;
        sprrzf5.cfr_renamed_93 = new sprsxf(39, 256, 8, this.cfr_renamed_86);
        sprrzf6.cfr_renamed_107 = new sprsxf(38, 1, 8, this.cfr_renamed_0);
        sprrzf5.cfr_renamed_112 = new sprsxf(4, 255, 8, this.cfr_renamed_2);
        sprrzf5.cfr_renamed_91 = new sprsxf(4, 255, 8, this.cfr_renamed_1);
        sprrzf5.cfr_renamed_152 = new sprsxf(5, 255, 8, this.cfr_renamed_4);
        sprrzf5.cfr_renamed_119 = new sprsxf(1, 255, 8, this.cfr_renamed_137);
        sprrzf5.cfr_renamed_3 = new sprsxf(4, 1, 8, this.cfr_renamed_132);
    }
}

