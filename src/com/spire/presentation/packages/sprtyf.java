/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgbg;
import com.spire.presentation.packages.sprppx;
import com.spire.presentation.packages.sprqyh;
import com.spire.presentation.packages.sprsxf;
import com.spire.presentation.packages.sprvhf;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class sprtyf
extends sprgbg {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtyf() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(sprgbg.class.getResourceAsStream(sprqyh.cfr_renamed_9("]_F]R|\u0002\u001eSY_\u001eAB^@TBEYTC"))));
            sprtyf sprtyf2 = this;
            DataInputStream dataInputStream2 = dataInputStream;
            sprtyf sprtyf3 = this;
            DataInputStream dataInputStream3 = dataInputStream;
            sprtyf sprtyf4 = this;
            sprtyf4.cfr_renamed_79 = sprtyf.cfr_renamed_6322(dataInputStream);
            sprtyf4.cfr_renamed_0 = sprtyf.cfr_renamed_6322(dataInputStream);
            this.cfr_renamed_86 = sprtyf.cfr_renamed_6322(dataInputStream3);
            sprtyf3.cfr_renamed_2 = sprtyf.cfr_renamed_6322(dataInputStream3);
            sprtyf3.cfr_renamed_4 = sprtyf.cfr_renamed_6322(dataInputStream);
            this.cfr_renamed_137 = sprtyf.cfr_renamed_6322(dataInputStream2);
            sprtyf2.cfr_renamed_1 = sprtyf.cfr_renamed_6322(dataInputStream2);
            sprtyf2.cfr_renamed_132 = sprtyf.cfr_renamed_6322(dataInputStream);
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(new StringBuilder().insert(0, sprppx.cfr_renamed_9("S\u001dG\u0011J\u0016\u0006\u0007ISJ\u001cG\u0017\u0006#O\u0010H\u001aESV\u0001I\u0003C\u0001R\u001aC\u0000\u001cS")).append(iOException.getMessage()).toString(), iOException);
        }
        this.cfr_renamed_102 = new sprsxf(30, 192, 6, this.cfr_renamed_79);
        sprtyf sprtyf5 = this;
        sprtyf sprtyf6 = this;
        sprtyf5.cfr_renamed_93 = new sprsxf(31, 192, 6, this.cfr_renamed_86);
        sprtyf6.cfr_renamed_107 = new sprsxf(30, 1, 6, this.cfr_renamed_0);
        sprtyf5.cfr_renamed_112 = new sprsxf(4, 192, 6, this.cfr_renamed_2);
        sprtyf5.cfr_renamed_91 = new sprsxf(4, 192, 6, this.cfr_renamed_1);
        sprtyf5.cfr_renamed_152 = new sprsxf(5, 192, 6, this.cfr_renamed_4);
        sprtyf5.cfr_renamed_119 = new sprsxf(1, 192, 6, this.cfr_renamed_137);
        sprtyf5.cfr_renamed_3 = new sprsxf(4, 1, 6, this.cfr_renamed_132);
    }
}

