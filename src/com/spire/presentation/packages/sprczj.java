/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdgm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdwj;
import com.spire.presentation.packages.sprhdm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproom;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprrhi;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprsuk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtdi;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwmr;
import com.spire.presentation.packages.sprwsk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprczj
implements DHPublicKey {
    private BigInteger cfr_renamed_0;
    private transient sprryk cfr_renamed_1;
    public static final long cfr_renamed_2 = -216691575254424324L;
    private transient DHParameterSpec cfr_renamed_3;
    private transient sprvhm cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprczj(sprvhm sprvhm2) {
        sprczj sprczj2;
        sprktm sprktm2;
        void arg0;
        this.cfr_renamed_4 = sprvhm2;
        try {
            sprktm2 = (sprktm)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprwmr.cfr_renamed_9("n\bq\u0007k\u000fcFn\ba\t'\u0015s\u0014r\u0005s\u0013u\u0003'\u000fiFC.'\u0016r\u0004k\u000fdFl\u0003~"));
        }
        this.cfr_renamed_0 = sprktm2.cfr_renamed_97();
        void v0 = arg0;
        sprszm sprszm2 = sprszm.cfr_renamed_23(v0.cfr_renamed_593().cfr_renamed_284());
        sprlem sprlem2 = v0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214) || this.cfr_renamed_9161(sprszm2)) {
            sproom sproom2 = sproom.cfr_renamed_23(sprszm2);
            if (sproom2.cfr_renamed_2331() != null) {
                sprczj sprczj3 = this;
                sprczj3.cfr_renamed_3 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), sproom2.cfr_renamed_2331().intValue());
                sprczj3.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, new sprwsk(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getG(), null, this.cfr_renamed_3.getL()));
                return;
            }
            sprczj sprczj4 = this;
            sprczj4.cfr_renamed_3 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145());
            sprczj4.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, new sprwsk(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getG()));
            return;
        }
        if (!sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpfm.cfr_renamed_9("n2p2t+u|z0|3i5o4v|o%k9!|")).append(sprlem2).toString());
        }
        sprdgm sprdgm2 = sprdgm.cfr_renamed_23(sprszm2);
        sprhdm sprhdm2 = sprdgm2.cfr_renamed_9456();
        sprczj sprczj5 = this;
        if (sprhdm2 != null) {
            sprczj5.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, new sprwsk(sprdgm2.cfr_renamed_1155(), sprdgm2.cfr_renamed_1145(), sprdgm2.cfr_renamed_1604(), sprdgm2.cfr_renamed_2616(), new sprsuk(sprhdm2.cfr_renamed_2113(), sprhdm2.cfr_renamed_2618().intValue())));
            sprczj2 = this;
        } else {
            sprczj5.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, new sprwsk(sprdgm2.cfr_renamed_1155(), sprdgm2.cfr_renamed_1145(), sprdgm2.cfr_renamed_1604(), sprdgm2.cfr_renamed_2616(), null));
            sprczj2 = this;
        }
        sprczj2.cfr_renamed_3 = new sprrhi(this.cfr_renamed_1.cfr_renamed_284());
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    public sprryk cfr_renamed_9389() {
        return this.cfr_renamed_1;
    }

    public String toString() {
        return sprdwj.cfr_renamed_9455(sprwmr.cfr_renamed_9("\"O"), this.cfr_renamed_0, new sprwsk(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getG()));
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey)arg0;
        return this.getY().equals(dHPublicKey.getY()) && this.getParams().getG().equals(dHPublicKey.getParams().getG()) && this.getParams().getP().equals(dHPublicKey.getParams().getP()) && this.getParams().getL() == dHPublicKey.getParams().getL();
    }

    public sprczj(BigInteger arg0, DHParameterSpec arg1) {
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_3 = arg1;
        if (this.cfr_renamed_3 instanceof sprrhi) {
            sprczj sprczj2 = this;
            sprczj2.cfr_renamed_1 = new sprryk(arg0, ((sprrhi)arg1).cfr_renamed_3373());
            return;
        }
        this.cfr_renamed_1 = new sprryk(arg0, new sprwsk(arg1.getP(), arg1.getG()));
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprczj sprczj2 = this;
        sprczj2.cfr_renamed_3 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
        this.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprczj sprczj2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprczj2.cfr_renamed_3.getP());
        v0.writeObject(sprczj2.cfr_renamed_3.getG());
        v0.writeInt(this.cfr_renamed_3.getL());
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 != null) {
            return sprjij.cfr_renamed_5675(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_3 instanceof sprrhi && ((sprrhi)this.cfr_renamed_3).cfr_renamed_1604() != null) {
            sprwsk sprwsk2 = ((sprrhi)this.cfr_renamed_3).cfr_renamed_3373();
            sprsuk sprsuk2 = sprwsk2.cfr_renamed_3371();
            sprhdm sprhdm2 = null;
            if (sprsuk2 != null) {
                sprhdm2 = new sprhdm(sprsuk2.cfr_renamed_2113(), sprsuk2.cfr_renamed_3374());
            }
            return sprjij.cfr_renamed_5679(new sprddm(sprbr.cfr_renamed_31, new sprdgm(sprwsk2.cfr_renamed_1155(), sprwsk2.cfr_renamed_1145(), sprwsk2.cfr_renamed_1604(), sprwsk2.cfr_renamed_2616(), sprhdm2).cfr_renamed_119()), new sprktm(this.cfr_renamed_0));
        }
        return sprjij.cfr_renamed_5679(new sprddm(sprdl.cfr_renamed_1214, new sproom(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getG(), this.cfr_renamed_3.getL()).cfr_renamed_119()), new sprktm(this.cfr_renamed_0));
    }

    @Override
    public String getAlgorithm() {
        return sprpfm.cfr_renamed_9("_\u0014");
    }

    @Override
    public String getFormat() {
        return sprwmr.cfr_renamed_9("_H2V>");
    }

    public sprczj(DHPublicKeySpec arg0) {
        sprczj sprczj2;
        DHPublicKeySpec dHPublicKeySpec = arg0;
        this.cfr_renamed_0 = dHPublicKeySpec.getY();
        if (dHPublicKeySpec instanceof sprtdi) {
            this.cfr_renamed_3 = ((sprtdi)arg0).cfr_renamed_2110();
            sprczj2 = this;
        } else {
            sprczj2 = this;
            this.cfr_renamed_3 = new DHParameterSpec(arg0.getP(), arg0.getG());
        }
        if (sprczj2.cfr_renamed_3 instanceof sprrhi) {
            sprrhi sprrhi2 = (sprrhi)this.cfr_renamed_3;
            sprczj sprczj3 = this;
            this.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, sprrhi2.cfr_renamed_3373());
            return;
        }
        this.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, new sprwsk(arg0.getP(), arg0.getG()));
    }

    /*
     * WARNING - void declaration
     */
    public sprczj(DHPublicKey dHPublicKey) {
        void arg0;
        this.cfr_renamed_0 = arg0.getY();
        this.cfr_renamed_3 = dHPublicKey.getParams();
        if (this.cfr_renamed_3 instanceof sprrhi) {
            sprrhi sprrhi2 = (sprrhi)this.cfr_renamed_3;
            sprczj sprczj2 = this;
            this.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, sprrhi2.cfr_renamed_3373());
            return;
        }
        this.cfr_renamed_1 = new sprryk(this.cfr_renamed_0, new sprwsk(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getG()));
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ boolean cfr_renamed_9161(sprszm arg0) {
        if (arg0.cfr_renamed_84() == 2) {
            return true;
        }
        if (arg0.cfr_renamed_84() > 3) {
            return false;
        }
        sprszm sprszm2 = arg0;
        sprktm sprktm2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
        sprktm sprktm3 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        return sprktm2.cfr_renamed_97().compareTo(BigInteger.valueOf(sprktm3.cfr_renamed_97().bitLength())) <= 0;
    }

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprczj(sprryk sprryk2) {
        void arg0;
        sprczj sprczj2 = this;
        sprczj2.cfr_renamed_0 = arg0.spr\u3181();
        sprczj sprczj3 = this;
        sprczj2.cfr_renamed_3 = new sprrhi(arg0.cfr_renamed_284());
        sprczj2.cfr_renamed_1 = sprryk2;
    }
}

