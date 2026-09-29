/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdgm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproom;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprxxd;
import com.spire.presentation.packages.sprzyaa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprlwh
implements DHPrivateKey,
sprof {
    private DHParameterSpec cfr_renamed_0;
    public BigInteger cfr_renamed_1;
    private sprof cfr_renamed_2;
    private sprcom cfr_renamed_3;
    public static final long cfr_renamed_4 = 311058815616901812L;

    @Override
    public String getFormat() {
        return sprxxd.cfr_renamed_9("7!$9DR");
    }

    /*
     * WARNING - void declaration
     */
    public sprlwh(sprquk sprquk2) {
        void arg0;
        sprlwh sprlwh2 = this;
        sprlwh sprlwh3 = this;
        sprlwh2.cfr_renamed_2 = new sprtlj();
        sprlwh2.cfr_renamed_1 = sprquk2.cfr_renamed_1980();
        sprlwh2.cfr_renamed_0 = new DHParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145(), arg0.cfr_renamed_284().cfr_renamed_2331());
    }

    public sprlwh() {
        sprlwh sprlwh2 = this;
        sprlwh2.cfr_renamed_2 = new sprtlj();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_1 = (BigInteger)arg0.readObject();
        sprlwh sprlwh2 = this;
        sprlwh2.cfr_renamed_0 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_2.cfr_renamed_9064(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprlwh(sprcom sprcom2) throws IOException {
        void arg0;
        sprcom sprcom3 = sprcom2;
        sprlwh sprlwh2 = this;
        sprlwh sprlwh3 = this;
        sprlwh2.cfr_renamed_2 = new sprtlj();
        void v3 = arg0;
        sprszm sprszm2 = sprszm.cfr_renamed_23(v3.cfr_renamed_1254().cfr_renamed_284());
        sprktm sprktm2 = sprktm.cfr_renamed_23(v3.cfr_renamed_1229());
        sprlem sprlem2 = sprcom3.cfr_renamed_1254().cfr_renamed_593();
        sprlwh2.cfr_renamed_3 = sprcom3;
        sprlwh2.cfr_renamed_1 = sprktm2.cfr_renamed_97();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            sproom sproom2 = sproom.cfr_renamed_23(sprszm2);
            if (sproom2.cfr_renamed_2331() != null) {
                this.cfr_renamed_0 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), sproom2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_0 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145());
            return;
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            sprdgm sprdgm2 = sprdgm.cfr_renamed_23(sprszm2);
            this.cfr_renamed_0 = new DHParameterSpec(sprdgm2.cfr_renamed_1155(), sprdgm2.cfr_renamed_1145());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzyaa.cfr_renamed_9("\u000fF\u0011F\u0015_\u0014\b\u001bD\u001dG\bA\u000e@\u0017\b\u000eQ\nM@\b")).append(sprlem2).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprlwh(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprlwh sprlwh2 = this;
        sprlwh sprlwh3 = this;
        sprlwh3.cfr_renamed_2 = new sprtlj();
        sprlwh2.cfr_renamed_1 = arg0.getX();
        sprlwh2.cfr_renamed_0 = dHPrivateKey.getParams();
    }

    @Override
    public String getAlgorithm() {
        return sprxxd.cfr_renamed_9("#\"");
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_2.cfr_renamed_9065(arg0, arg1);
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_1;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    /*
     * WARNING - void declaration
     */
    public sprlwh(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        sprlwh sprlwh2 = this;
        sprlwh sprlwh3 = this;
        sprlwh2.cfr_renamed_2 = new sprtlj();
        sprlwh2.cfr_renamed_1 = dHPrivateKeySpec.getX();
        sprlwh2.cfr_renamed_0 = new DHParameterSpec(arg0.getP(), arg0.getG());
    }

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            if (this.cfr_renamed_3 != null) {
                return this.cfr_renamed_3.cfr_renamed_104("DER");
            }
        }
        catch (IOException iOException) {
            return null;
        }
        {
            sprcom sprcom2 = new sprcom(new sprddm(sprdl.cfr_renamed_1214, new sproom(this.cfr_renamed_0.getP(), this.cfr_renamed_0.getG(), this.cfr_renamed_0.getL())), new sprktm(this.getX()));
            return sprcom2.cfr_renamed_104("DER");
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprlwh sprlwh2 = this;
        arg0.writeObject(this.getX());
        arg0.writeObject(sprlwh2.cfr_renamed_0.getP());
        v0.writeObject(sprlwh2.cfr_renamed_0.getG());
        v0.writeInt(this.cfr_renamed_0.getL());
    }
}

