/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggf;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlql;
import com.spire.presentation.packages.sprohf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class sprbdf
extends sprggf {
    private final InputStream cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_5328(sprjj arg0, byte[] arg1) {
        byte[] byArray = sprohf.cfr_renamed_5316(arg0, this.cfr_renamed_4);
        if (arg1 != null) {
            return sprohf.cfr_renamed_5323(arg0, arg1, byArray);
        }
        return byArray;
    }

    public sprbdf(InputStream inputStream) {
        this.cfr_renamed_4 = inputStream;
    }

    /*
     * WARNING - void declaration
     */
    public sprbdf(File file) throws FileNotFoundException {
        void arg0;
        if (file.isDirectory()) {
            throw new IllegalArgumentException(sprlql.cfr_renamed_9("y\u000eo\u0002~\u0013r\u0015dGs\biG|\u000bq\bj\u0002y"));
        }
        this.cfr_renamed_4 = new FileInputStream((File)arg0);
    }
}

