/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdj;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlvh;
import com.spire.presentation.packages.sprovh;
import com.spire.presentation.packages.sprpeka;
import com.spire.presentation.packages.sprppm;
import com.spire.presentation.packages.sprssk;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprqrh
implements sprdj,
DHPublicKey {
    private BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = 8712728417091216948L;
    private sprlvh cfr_renamed_4;

    @Override
    public String getFormat() {
        return sprpeka.cfr_renamed_9("u/\u00181\u0014");
    }

    /*
     * WARNING - void declaration
     */
    public sprqrh(sprovh sprovh2) {
        void arg0;
        this.cfr_renamed_2 = sprovh2.spr\u3181();
        sprqrh sprqrh2 = this;
        this.cfr_renamed_4 = new sprlvh(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    @Override
    public sprlvh cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_2 = (BigInteger)arg0.readObject();
        sprqrh sprqrh2 = this;
        sprqrh2.cfr_renamed_4 = new sprlvh((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    /*
     * WARNING - void declaration
     */
    public sprqrh(sprdj sprdj2) {
        void arg0;
        sprqrh sprqrh2 = this;
        sprqrh2.cfr_renamed_2 = arg0.getY();
        sprqrh2.cfr_renamed_4 = sprdj2.cfr_renamed_284();
    }

    /*
     * WARNING - void declaration
     */
    public sprqrh(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKeySpec.getY();
        sprqrh sprqrh2 = this;
        this.cfr_renamed_4 = new sprlvh(arg0.getP(), arg0.getG());
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145());
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5679(new sprddm(sprgt.cfr_renamed_152, new sprppm(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145())), new sprktm(this.cfr_renamed_2));
    }

    /*
     * WARNING - void declaration
     */
    public sprqrh(DHPublicKey dHPublicKey) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKey.getY();
        sprqrh sprqrh2 = this;
        this.cfr_renamed_4 = new sprlvh(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqrh(sprvhm sprvhm2) {
        sprppm sprppm2 = sprppm.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
        sprktm sprktm2 = null;
        try {
            void arg0;
            sprktm2 = (sprktm)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprtma.cfr_renamed_9("d4{;a3izd4k5-)y(x9y/\u007f?-3czI\tLz}/o6d9-1h#"));
        }
        this.cfr_renamed_2 = sprktm2.cfr_renamed_97();
        sprqrh sprqrh2 = this;
        sprqrh2.cfr_renamed_4 = new sprlvh(sprppm2.cfr_renamed_1155(), sprppm2.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprqrh(sprssk sprssk2) {
        void arg0;
        this.cfr_renamed_2 = sprssk2.spr\u3181();
        sprqrh sprqrh2 = this;
        this.cfr_renamed_4 = new sprlvh(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprqrh sprqrh2 = this;
        arg0.writeObject(sprqrh2.getY());
        v0.writeObject(sprqrh2.cfr_renamed_4.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_4.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprqrh(BigInteger bigInteger, sprlvh sprlvh2) {
        void arg0;
        sprqrh sprqrh2 = this;
        sprqrh2.cfr_renamed_2 = arg0;
        sprqrh2.cfr_renamed_4 = sprlvh2;
    }

    @Override
    public String getAlgorithm() {
        return sprpeka.cfr_renamed_9("hmj`@`A");
    }
}

