/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbo;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreny;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvh;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprppm;
import com.spire.presentation.packages.sprsxh;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprwrk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprmth
implements sprbo,
DHPrivateKey,
sprof {
    public sprlvh cfr_renamed_1;
    public static final long cfr_renamed_2 = 4819350091141529678L;
    private sprtlj cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmth(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        sprmth sprmth2 = this;
        sprmth sprmth3 = this;
        sprmth2.cfr_renamed_3 = new sprtlj();
        sprmth2.cfr_renamed_4 = dHPrivateKeySpec.getX();
        sprmth2.cfr_renamed_1 = new sprlvh(arg0.getP(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprmth(sprbo sprbo2) {
        void arg0;
        sprmth sprmth2 = this;
        sprmth sprmth3 = this;
        sprmth3.cfr_renamed_3 = new sprtlj();
        sprmth2.cfr_renamed_4 = arg0.getX();
        sprmth2.cfr_renamed_1 = sprbo2.cfr_renamed_284();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_4 = (BigInteger)arg0.readObject();
        sprmth sprmth2 = this;
        sprmth2.cfr_renamed_1 = new sprlvh((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_9064(arg0);
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_1.cfr_renamed_1155(), this.cfr_renamed_1.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprmth(sprwrk sprwrk2) {
        void arg0;
        sprmth sprmth2 = this;
        sprmth sprmth3 = this;
        sprmth2.cfr_renamed_3 = new sprtlj();
        sprmth2.cfr_renamed_4 = sprwrk2.cfr_renamed_1980();
        sprmth2.cfr_renamed_1 = new sprlvh(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprlvh cfr_renamed_284() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprmth(sprsxh sprsxh2) {
        void arg0;
        sprmth sprmth2 = this;
        sprmth sprmth3 = this;
        sprmth2.cfr_renamed_3 = new sprtlj();
        sprmth2.cfr_renamed_4 = sprsxh2.cfr_renamed_1980();
        sprmth2.cfr_renamed_1 = new sprlvh(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    @Override
    public String getAlgorithm() {
        return sprizda.cfr_renamed_9("\u0005n\u0007c-c,");
    }

    /*
     * WARNING - void declaration
     */
    public sprmth(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprmth sprmth2 = this;
        sprmth sprmth3 = this;
        sprmth2.cfr_renamed_3 = new sprtlj();
        sprmth2.cfr_renamed_4 = dHPrivateKey.getX();
        sprmth2.cfr_renamed_1 = new sprlvh(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprmth sprmth2 = this;
        arg0.writeObject(sprmth2.getX());
        v0.writeObject(sprmth2.cfr_renamed_1.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_1.cfr_renamed_1145());
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_3.cfr_renamed_9065(arg0, arg1);
    }

    public sprmth(sprcom sprcom2) throws IOException {
        sprcom sprcom3 = sprcom2;
        sprmth sprmth2 = this;
        sprmth sprmth3 = this;
        sprmth2.cfr_renamed_3 = new sprtlj();
        sprppm sprppm2 = sprppm.cfr_renamed_23(sprcom3.cfr_renamed_1254().cfr_renamed_284());
        sprmth2.cfr_renamed_4 = sprktm.cfr_renamed_23(sprcom3.cfr_renamed_1229()).cfr_renamed_97();
        sprmth2.cfr_renamed_1 = new sprlvh(sprppm2.cfr_renamed_1155(), sprppm2.cfr_renamed_1145());
    }

    public sprmth() {
        sprmth sprmth2 = this;
        sprmth2.cfr_renamed_3 = new sprtlj();
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5678(new sprddm(sprgt.cfr_renamed_152, new sprppm(this.cfr_renamed_1.cfr_renamed_1155(), this.cfr_renamed_1.cfr_renamed_1145())), new sprktm(this.getX()));
    }

    @Override
    public String getFormat() {
        return spreny.cfr_renamed_9(":\u000f)\u0017I|");
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }
}

