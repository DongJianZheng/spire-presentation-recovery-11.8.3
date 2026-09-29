/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprqm;
import com.spire.presentation.packages.sprrpk;
import com.spire.presentation.packages.sprzrg;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class sprrbh
implements sprqm {
    private sprjah cfr_renamed_119;
    public static final Date cfr_renamed_91 = sprpzg.cfr_renamed_3;
    public static final char cfr_renamed_0 = 'b';
    private boolean cfr_renamed_1;
    public static final char cfr_renamed_2 = 't';
    public static final String cfr_renamed_3 = "_CONSOLE";
    public static final char cfr_renamed_4 = 'u';

    public OutputStream cfr_renamed_7552(OutputStream arg0, char arg1, File arg2) throws IOException {
        return this.cfr_renamed_7828(arg0, arg1, arg2.getName(), arg2.length(), new Date(arg2.lastModified()));
    }

    public sprrbh() {
        this.cfr_renamed_1 = false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7829(OutputStream outputStream, char c, byte[] byArray, long l) throws IOException {
        void arg3;
        void arg2;
        int n;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.write((int)arg1);
        v0.write((byte)byArray.length);
        int n2 = n = 0;
        while (n2 != ((void)arg2).length) {
            arg0.write((int)arg2[n++]);
            n2 = n;
        }
        void var6_6 = arg3 / 1000L;
        void v2 = arg0;
        void v3 = var6_6;
        arg0.write((byte)(var6_6 >> 24));
        arg0.write((byte)(v3 >> 16));
        v2.write((byte)(v3 >> 8));
        v2.write((byte)var6_6);
    }

    public OutputStream cfr_renamed_7558(OutputStream arg0, char arg1, String arg2, Date arg3, byte[] arg4) throws IOException {
        if (this.cfr_renamed_119 != null) {
            throw new IllegalStateException(sprmvo.cfr_renamed_9("fJoJsNu@s\u000f`CsJ`Kx\u000fhA!@qJo\u000fr[`[d"));
        }
        this.cfr_renamed_119 = new sprjah(arg0, 11, arg4);
        byte[] byArray = sprkoe.cfr_renamed_431(arg2);
        this.cfr_renamed_7829(this.cfr_renamed_119, arg1, byArray, arg3.getTime());
        return new sprzrg(this.cfr_renamed_119, this);
    }

    public OutputStream cfr_renamed_7828(OutputStream arg0, char arg1, String arg2, long arg3, Date arg4) throws IOException {
        if (this.cfr_renamed_119 != null) {
            throw new IllegalStateException(sprrpk.cfr_renamed_9("`/i/u+s%ujf&u/f.~jn$'%w/ijt>f>b"));
        }
        byte[] byArray = sprkoe.cfr_renamed_431(arg2);
        sprrbh sprrbh2 = this;
        sprrbh2.cfr_renamed_119 = new sprjah(arg0, 11, arg3 + 2L + (long)byArray.length + 4L, this.cfr_renamed_1);
        sprrbh sprrbh3 = this;
        sprrbh3.cfr_renamed_7829(sprrbh3.cfr_renamed_119, arg1, byArray, arg4.getTime());
        return new sprzrg(this.cfr_renamed_119, this);
    }

    @Override
    public void cfr_renamed_2637() throws IOException {
        if (this.cfr_renamed_119 != null) {
            sprrbh sprrbh2 = this;
            sprrbh2.cfr_renamed_119.cfr_renamed_3120();
            sprrbh2.cfr_renamed_119.flush();
            sprrbh2.cfr_renamed_119 = null;
        }
    }

    public sprrbh(boolean bl) {
        sprrbh sprrbh2 = this;
        sprrbh2.cfr_renamed_1 = false;
        sprrbh2.cfr_renamed_1 = bl;
    }
}

