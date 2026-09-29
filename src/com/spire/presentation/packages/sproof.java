/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfbp;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprkhg;
import com.spire.presentation.packages.sprmdi;
import com.spire.presentation.packages.sprnmy;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sproof
implements sprbj,
PublicKey {
    private static final long cfr_renamed_3 = 1L;
    private transient sprvef cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprkhg sprkhg2 = new sprkhg(this.cfr_renamed_4.cfr_renamed_1146(), this.cfr_renamed_4.cfr_renamed_1144(), this.cfr_renamed_4.cfr_renamed_1145(), sprmdi.cfr_renamed_5708(this.cfr_renamed_4.cfr_renamed_580()));
        sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_102);
        try {
            sprvhm sprvhm2 = new sprvhm(sprddm2, sprkhg2);
            return sprvhm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public sproof(sprvef sprvef2) {
        this.cfr_renamed_4 = sprvef2;
    }

    @Override
    public String getAlgorithm() {
        return sprnmy.cfr_renamed_9("l\fd\u0003H\nB\n\f,b.\u0013");
    }

    @Override
    public String getFormat() {
        return sprfbp.cfr_renamed_9("G3*-&");
    }

    public spraye cfr_renamed_1145() {
        return this.cfr_renamed_4.cfr_renamed_1145();
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_4.cfr_renamed_1144();
    }

    public String toString() {
        String string = sprnmy.cfr_renamed_9("l\fd\u0003H\nB\nq\u001aC\u0003H\fj\nXU+");
        string = new StringBuilder().insert(0, string).append(sprfbp.cfr_renamed_9("=sxqzku?ry=kuz=|r{x?=?=?=?=?'?")).append(this.cfr_renamed_4.cfr_renamed_1146()).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprnmy.cfr_renamed_9("OD\u001dS\u0000SOB\u0000S\u001dD\fU\u0006N\u0001\u0001\f@\u001f@\rH\u0003H\u001bXU\u0001")).append(this.cfr_renamed_4.cfr_renamed_1144()).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprfbp.cfr_renamed_9("=xxqxm|krm=r|kove?=?=?=?=?=?'?")).append(this.cfr_renamed_4.cfr_renamed_1145().toString()).toString();
        return string;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_4.cfr_renamed_1150();
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_4.cfr_renamed_1146();
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sproof)) {
            return false;
        }
        sproof sproof2 = (sproof)arg0;
        return this.cfr_renamed_4.cfr_renamed_1146() == sproof2.cfr_renamed_1146() && this.cfr_renamed_4.cfr_renamed_1144() == sproof2.cfr_renamed_1144() && this.cfr_renamed_4.cfr_renamed_1145().equals(sproof2.cfr_renamed_1145());
    }

    public spryye cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_4 = (sprvef)sprhyf.cfr_renamed_5660(arg0);
    }

    public int hashCode() {
        return 37 * (this.cfr_renamed_4.cfr_renamed_1146() + 37 * this.cfr_renamed_4.cfr_renamed_1144()) + this.cfr_renamed_4.cfr_renamed_1145().hashCode();
    }
}

