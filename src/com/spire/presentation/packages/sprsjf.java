/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.sprhxr;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprjjea;
import com.spire.presentation.packages.sprlkg;
import com.spire.presentation.packages.sprmdi;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprsjf
implements PrivateKey {
    private transient sprwxe cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public sprnhf cfr_renamed_845() {
        return this.cfr_renamed_3.cfr_renamed_845();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_3.cfr_renamed_1146();
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

    public spryye cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprlkg sprlkg2 = new sprlkg(this.cfr_renamed_1146(), this.cfr_renamed_1150(), this.cfr_renamed_845(), this.cfr_renamed_1147(), this.cfr_renamed_1155(), sprmdi.cfr_renamed_5708(this.cfr_renamed_3.cfr_renamed_580()));
            sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_102);
            return new sprcom(sprddm2, sprlkg2).cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprsjf)) {
            return false;
        }
        sprsjf sprsjf2 = (sprsjf)arg0;
        return this.cfr_renamed_1146() == sprsjf2.cfr_renamed_1146() && this.cfr_renamed_1150() == sprsjf2.cfr_renamed_1150() && this.cfr_renamed_845().equals(sprsjf2.cfr_renamed_845()) && this.cfr_renamed_1147().equals(sprsjf2.cfr_renamed_1147()) && this.cfr_renamed_1155().equals(sprsjf2.cfr_renamed_1155()) && this.cfr_renamed_1153().equals(sprsjf2.cfr_renamed_1153());
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_3.cfr_renamed_1150();
    }

    public spraye cfr_renamed_1153() {
        return this.cfr_renamed_3.cfr_renamed_1153();
    }

    public spricf[] cfr_renamed_1148() {
        return this.cfr_renamed_3.cfr_renamed_1148();
    }

    public sprsjf(sprwxe sprwxe2) {
        this.cfr_renamed_3 = sprwxe2;
    }

    public int hashCode() {
        int n = this.cfr_renamed_3.cfr_renamed_1150();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1146();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_845().hashCode();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1147().hashCode();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1155().hashCode();
        return n * 37 + this.cfr_renamed_3.cfr_renamed_1153().hashCode();
    }

    @Override
    public String getAlgorithm() {
        return sprhxr.cfr_renamed_9("-\u0012%\u001d\t\u0014\u0003\u0014M2#0R");
    }

    private /* synthetic */ void cfr_renamed_5662(sprcom arg0) throws IOException {
        this.cfr_renamed_3 = (sprwxe)sprhcg.cfr_renamed_5663(arg0);
    }

    public spricf cfr_renamed_1147() {
        return this.cfr_renamed_3.cfr_renamed_1147();
    }

    public sprwff cfr_renamed_1155() {
        return this.cfr_renamed_3.cfr_renamed_1155();
    }

    @Override
    public String getFormat() {
        return sprjjea.cfr_renamed_9("\u0001\u0005\u0012\u001drv");
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_3.cfr_renamed_1147().cfr_renamed_813();
    }
}

