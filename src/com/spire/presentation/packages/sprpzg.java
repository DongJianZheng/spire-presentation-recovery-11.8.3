/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprnqg;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprucm;
import com.spire.presentation.packages.sprwzq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class sprpzg {
    public static final char cfr_renamed_119 = 'b';
    public sprucm cfr_renamed_91;
    public static final char cfr_renamed_0 = 'u';
    public static final char cfr_renamed_1 = 't';
    public static final char cfr_renamed_2 = 'm';
    public static final Date cfr_renamed_3 = new Date(0L);
    public static final String cfr_renamed_4 = "_CONSOLE";

    public sprpzg(InputStream arg0) throws IOException {
        this(sprnqg.cfr_renamed_7535(arg0, 11));
    }

    public InputStream cfr_renamed_7830() {
        return this.cfr_renamed_2920();
    }

    /*
     * WARNING - void declaration
     */
    public sprpzg(byte[] byArray) throws IOException {
        this(sprnqg.cfr_renamed_7535(new ByteArrayInputStream((byte[])arg0), 11));
        void arg0;
    }

    public sprpzg(sprmam sprmam2) throws IOException {
        sprtzl sprtzl2 = sprmam2.cfr_renamed_7676();
        if (!(sprtzl2 instanceof sprucm)) {
            throw new IOException(new StringBuilder().insert(0, sprwzq.cfr_renamed_9("+\u000b;\u001d.\u0000=\u0011;\u0001~\u0015?\u00065\u0000*E7\u000b~\u0016*\u0017;\u00043_~")).append(sprtzl2).toString());
        }
        this.cfr_renamed_91 = (sprucm)sprtzl2;
    }

    public byte[] cfr_renamed_7831() {
        return this.cfr_renamed_91.cfr_renamed_7831();
    }

    public int cfr_renamed_7832() {
        return this.cfr_renamed_91.cfr_renamed_7832();
    }

    public InputStream cfr_renamed_2920() {
        return this.cfr_renamed_91.cfr_renamed_2920();
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_91.cfr_renamed_678();
    }

    public Date cfr_renamed_7833() {
        return new Date(this.cfr_renamed_91.cfr_renamed_7833());
    }
}

