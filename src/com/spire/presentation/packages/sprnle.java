/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprane;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprxue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class sprnle
extends sprxue {
    private sprxue[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 1000;

    public static /* synthetic */ sprxue[] cfr_renamed_4908(sprnle arg0) {
        return arg0.cfr_renamed_3;
    }

    private /* synthetic */ Vector cfr_renamed_4909() {
        int n;
        Vector<sprlqe> vector = new Vector<sprlqe>();
        int n2 = n = 0;
        while (n2 < ((int)this.cfr_renamed_4).length) {
            byte[] byArray = new byte[(n + 1000 > ((int)this.cfr_renamed_4).length ? ((int)this.cfr_renamed_4).length : n + 1000) - n];
            System.arraycopy(this.cfr_renamed_4, n, byArray, 0, byArray.length);
            vector.addElement(new sprlqe(byArray));
            n2 = n += 1000;
        }
        return vector;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_4910(sprxue[] arg0) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            try {
                sprlqe sprlqe2 = (sprlqe)arg0[n];
                byteArrayOutputStream.write(sprlqe2.cfr_renamed_186());
            }
            catch (ClassCastException classCastException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, arg0[n].getClass().getName()).append(sprngk.cfr_renamed_9("\u0002\u0017M\u0004L\u0015\u0002\u0018LQK\u001fR\u0004VQQ\u0019M\u0004N\u0015\u0002\u001eL\u001d[QA\u001eL\u0005C\u0018LQf4p>A\u0005G\u0005q\u0005P\u0018L\u0016")).toString());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprajp.cfr_renamed_9("#z%g6v/m(\"%m(t#p2k(efm%v#v5\"")).append(iOException.toString()).toString());
            }
            n2 = ++n;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public boolean cfr_renamed_4575() {
        return true;
    }

    public sprnle(byte[] arg0) {
        super(arg0);
    }

    public static sprnle cfr_renamed_4758(sprbne arg0) {
        sprxue[] sprxueArray = new sprxue[arg0.cfr_renamed_84()];
        Enumeration enumeration = arg0.cfr_renamed_329();
        int n = 0;
        Enumeration enumeration2 = enumeration;
        while (enumeration2.hasMoreElements()) {
            sprxueArray[n++] = (sprxue)enumeration.nextElement();
            enumeration2 = enumeration;
        }
        return new sprnle(sprxueArray);
    }

    @Override
    public byte[] cfr_renamed_186() {
        return this.cfr_renamed_4;
    }

    public Enumeration cfr_renamed_329() {
        if (this.cfr_renamed_3 == null) {
            return this.cfr_renamed_4909().elements();
        }
        return new sprane(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_4613(sprope sprope2) throws IOException {
        Enumeration enumeration;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_4787(36);
        v0.cfr_renamed_4787(128);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            arg0.cfr_renamed_2149((spra)enumeration.nextElement());
            enumeration2 = enumeration;
        }
        arg0.cfr_renamed_4787(0);
        arg0.cfr_renamed_4787(0);
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        Enumeration enumeration;
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            n += ((spra)enumeration.nextElement()).cfr_renamed_119().cfr_renamed_4616();
            enumeration2 = enumeration;
        }
        return 2 + n + 2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnle(sprxue[] sprxueArray) {
        super(sprnle.cfr_renamed_4910((sprxue[])arg0));
        void arg0;
        this.cfr_renamed_3 = sprxueArray;
    }
}

