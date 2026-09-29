/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdoha;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;

public class sprdzh
extends sprjii
implements Principal {
    /*
     * WARNING - void declaration
     */
    public sprdzh(byte[] byArray) throws IOException {
        super(sprdzh.cfr_renamed_9012(new sprrzm((byte[])arg0)));
        void arg0;
    }

    public sprdzh(Vector arg0, Hashtable arg1) {
        super(arg0, arg1);
    }

    public sprdzh(sprjii arg0) {
        super((sprszm)arg0.cfr_renamed_119());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprszm cfr_renamed_9012(sprrzm arg0) throws IOException {
        try {
            return sprszm.cfr_renamed_23(arg0.cfr_renamed_24());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprdoha.cfr_renamed_9("\u000eM\u0014\u0002\u0001L@c3lN\u0013@q\u0005S\u0015G\u000eA\u0005\u0018@")).append(illegalArgumentException).toString());
        }
    }

    public sprdzh(boolean arg0, Hashtable arg1, String arg2) {
        super(arg0, arg1, arg2);
    }

    public sprdzh(sprnbm arg0) {
        super((sprszm)arg0.cfr_renamed_119());
    }

    public sprdzh(Hashtable arg0) {
        super(arg0);
    }

    public sprdzh(boolean arg0, String arg1) {
        super(arg0, arg1);
    }

    public sprdzh(Vector arg0, Vector arg1) {
        super(arg0, arg1);
    }

    @Override
    public String getName() {
        return this.toString();
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

    public sprdzh(String arg0) {
        super(arg0);
    }
}

