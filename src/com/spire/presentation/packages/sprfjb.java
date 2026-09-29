/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprnkb;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruib;
import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;

public class sprfjb
extends spruib
implements Principal {
    public sprfjb(Vector arg0, Vector arg1) {
        super(arg0, arg1);
    }

    public sprfjb(spruhe arg0) {
        super((sprbne)arg0.cfr_renamed_119());
    }

    public sprfjb(boolean arg0, String arg1) {
        super(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprfjb(byte[] byArray) throws IOException {
        super(sprfjb.cfr_renamed_2051(new sprgle((byte[])arg0)));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_91() {
        try {
            return this.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException.toString());
        }
    }

    public sprfjb(String arg0) {
        super(arg0);
    }

    public sprfjb(Hashtable arg0) {
        super(arg0);
    }

    public sprfjb(Vector arg0, Hashtable arg1) {
        super(arg0, arg1);
    }

    @Override
    public String getName() {
        return this.toString();
    }

    public sprfjb(boolean arg0, Hashtable arg1, String arg2) {
        super(arg0, arg1, arg2);
    }

    public sprfjb(spruib arg0) {
        super((sprbne)arg0.cfr_renamed_119());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbne cfr_renamed_2051(sprgle arg0) throws IOException {
        try {
            return sprbne.cfr_renamed_23(arg0.cfr_renamed_24());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprnkb.cfr_renamed_9("j\u0006pIe\u0007$(W'*X$:a\u0018q\fj\naS$")).append(illegalArgumentException).toString());
        }
    }
}

