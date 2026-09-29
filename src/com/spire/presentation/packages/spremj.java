/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbo;
import com.spire.presentation.packages.sprcmfa;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvh;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprokk;
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

public class spremj
implements sprbo,
DHPrivateKey,
sprof {
    private BigInteger cfr_renamed_1;
    private transient sprtlj cfr_renamed_2;
    private transient sprlvh cfr_renamed_3;
    public static final long cfr_renamed_4 = 4819350091141529678L;

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_2.cfr_renamed_9065(arg0, arg1);
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        arg0.defaultWriteObject();
        v0.writeObject(this.cfr_renamed_3.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_3.cfr_renamed_1145());
    }

    @Override
    public String getFormat() {
        return sprcmfa.cfr_renamed_9("V>E&%M");
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public spremj(sprwrk sprwrk2) {
        void arg0;
        spremj spremj2 = this;
        spremj spremj3 = this;
        spremj2.cfr_renamed_2 = new sprtlj();
        spremj2.cfr_renamed_1 = sprwrk2.cfr_renamed_1980();
        spremj2.cfr_renamed_3 = new sprlvh(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        spremj spremj2 = this;
        spremj2.cfr_renamed_3 = new sprlvh((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
        this.cfr_renamed_2 = new sprtlj();
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_2.cfr_renamed_9064(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spremj(DHPrivateKey dHPrivateKey) {
        void arg0;
        spremj spremj2 = this;
        spremj spremj3 = this;
        spremj2.cfr_renamed_2 = new sprtlj();
        spremj2.cfr_renamed_1 = dHPrivateKey.getX();
        spremj2.cfr_renamed_3 = new sprlvh(arg0.getParams().getP(), arg0.getParams().getG());
    }

    public spremj() {
        spremj spremj2 = this;
        spremj2.cfr_renamed_2 = new sprtlj();
    }

    @Override
    public String getAlgorithm() {
        return sprokk.cfr_renamed_9("/k-f\u0007f\u0006");
    }

    @Override
    public sprlvh cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprcom sprcom2 = new sprcom(new sprddm(sprgt.cfr_renamed_152, new sprppm(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145())), new sprktm(this.getX()));
            return sprcom2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spremj(sprsxh sprsxh2) {
        void arg0;
        spremj spremj2 = this;
        spremj spremj3 = this;
        spremj2.cfr_renamed_2 = new sprtlj();
        spremj2.cfr_renamed_1 = sprsxh2.cfr_renamed_1980();
        spremj2.cfr_renamed_3 = new sprlvh(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    public spremj(sprcom sprcom2) throws IOException {
        sprcom sprcom3 = sprcom2;
        spremj spremj2 = this;
        spremj spremj3 = this;
        spremj2.cfr_renamed_2 = new sprtlj();
        sprppm sprppm2 = sprppm.cfr_renamed_23(sprcom3.cfr_renamed_1254().cfr_renamed_284());
        spremj2.cfr_renamed_1 = sprktm.cfr_renamed_23(sprcom3.cfr_renamed_1229()).cfr_renamed_97();
        spremj2.cfr_renamed_3 = new sprlvh(sprppm2.cfr_renamed_1155(), sprppm2.cfr_renamed_1145());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    /*
     * WARNING - void declaration
     */
    public spremj(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        spremj spremj2 = this;
        spremj spremj3 = this;
        spremj2.cfr_renamed_2 = new sprtlj();
        spremj2.cfr_renamed_1 = dHPrivateKeySpec.getX();
        spremj2.cfr_renamed_3 = new sprlvh(arg0.getP(), arg0.getG());
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
        return this.getX().equals(dHPrivateKey.getX()) && this.getParams().getG().equals(dHPrivateKey.getParams().getG()) && this.getParams().getP().equals(dHPrivateKey.getParams().getP()) && this.getParams().getL() == dHPrivateKey.getParams().getL();
    }

    /*
     * WARNING - void declaration
     */
    public spremj(sprbo sprbo2) {
        void arg0;
        spremj spremj2 = this;
        spremj spremj3 = this;
        spremj3.cfr_renamed_2 = new sprtlj();
        spremj2.cfr_renamed_1 = arg0.getX();
        spremj2.cfr_renamed_3 = sprbo2.cfr_renamed_284();
    }
}

