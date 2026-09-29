/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprlbm;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

public class sprnzl
extends sprzcm {
    private sprqbm[] cfr_renamed_4;

    public sprnzl(sprmam arg0) throws IOException {
        int n;
        sprqbm sprqbm2;
        sprlbm sprlbm2 = new sprlbm(arg0);
        Vector<sprqbm> vector = new Vector<sprqbm>();
        sprlbm sprlbm3 = sprlbm2;
        while ((sprqbm2 = sprlbm3.cfr_renamed_7676()) != null) {
            sprlbm3 = sprlbm2;
            vector.addElement(sprqbm2);
        }
        this.cfr_renamed_4 = new sprqbm[vector.size()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = (sprqbm)vector.elementAt(n3);
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++].cfr_renamed_2623(byteArrayOutputStream);
            n2 = n;
        }
        arg0.cfr_renamed_11039(17, byteArrayOutputStream.toByteArray());
    }

    public sprqbm[] cfr_renamed_7841() {
        return this.cfr_renamed_4;
    }

    public sprnzl(sprqbm[] sprqbmArray) {
        this.cfr_renamed_4 = sprqbmArray;
    }
}

