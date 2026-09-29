/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprghg;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprjkg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprryf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxqo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprpze
implements PublicKey,
sprmj {
    private transient sprryf cfr_renamed_2;
    private transient sprlem cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    @Override
    public String getFormat() {
        return sprxqo.cfr_renamed_9("\u001fIrW~");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprpze) {
            sprpze sprpze2 = (sprpze)arg0;
            return this.cfr_renamed_3.cfr_renamed_5078(sprpze2.cfr_renamed_3) && sproze.cfr_renamed_92(this.cfr_renamed_2.cfr_renamed_5683(), sprpze2.cfr_renamed_2.cfr_renamed_5683());
        }
        return false;
    }

    public sprpze(sprvhm sprvhm2) throws IOException {
        sprpze sprpze2 = this;
        sprpze2.cfr_renamed_5659(sprvhm2);
    }

    public sprlem cfr_renamed_3234() {
        return this.cfr_renamed_3;
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprpze(sprlem sprlem2, sprryf sprryf2) {
        void arg0;
        sprpze sprpze2 = this;
        sprpze2.cfr_renamed_3 = arg0;
        sprpze2.cfr_renamed_2 = sprryf2;
    }

    @Override
    public byte[] cfr_renamed_5683() {
        return this.cfr_renamed_2.cfr_renamed_5683();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5659(sprvhm sprvhm2) throws IOException {
        void arg0;
        sprpze sprpze2 = this;
        sprpze2.cfr_renamed_3 = sprghg.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284()).cfr_renamed_3234().cfr_renamed_593();
        sprpze2.cfr_renamed_2 = (sprryf)sprhyf.cfr_renamed_5660(sprvhm2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvhm sprvhm2;
            sprvhm sprvhm3;
            if (this.cfr_renamed_2.cfr_renamed_3234() != null) {
                sprvhm sprvhm4;
                sprvhm3 = sprvhm4 = sprrif.cfr_renamed_5658(this.cfr_renamed_2);
                return sprvhm3.cfr_renamed_91();
            }
            sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_82, new sprghg(new sprddm(this.cfr_renamed_3)));
            sprvhm3 = sprvhm2 = new sprvhm(sprddm2, this.cfr_renamed_2.cfr_renamed_5683());
            return sprvhm3.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode() + 37 * sproze.cfr_renamed_95(this.cfr_renamed_2.cfr_renamed_5683());
    }

    @Override
    public final String getAlgorithm() {
        return sprjkg.cfr_renamed_9("^WENCD^*?2;");
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
}

