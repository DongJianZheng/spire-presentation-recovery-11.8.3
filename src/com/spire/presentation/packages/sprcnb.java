/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraob;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprkb;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sproyy;
import com.spire.presentation.packages.sprqsb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprzgia;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprcnb
implements sprkb,
DHPrivateKey,
sprwb {
    public BigInteger cfr_renamed_1;
    public static final long cfr_renamed_2 = 4819350091141529678L;
    public spraob cfr_renamed_3;
    private sprooc cfr_renamed_4;

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_4.cfr_renamed_2158();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_1 = (BigInteger)arg0.readObject();
        sprcnb sprcnb2 = this;
        sprcnb2.cfr_renamed_3 = new spraob((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    public sprcnb(sprmke sprmke2) throws IOException {
        sprmke sprmke3 = sprmke2;
        sprcnb sprcnb2 = this;
        sprcnb sprcnb3 = this;
        sprcnb2.cfr_renamed_4 = new sprooc();
        sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprmke3.cfr_renamed_1254().cfr_renamed_284());
        sprcnb2.cfr_renamed_1 = sprooe.cfr_renamed_23(sprmke3.cfr_renamed_1229()).cfr_renamed_97();
        sprcnb2.cfr_renamed_3 = new spraob(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprcnb(sprkb sprkb2) {
        void arg0;
        sprcnb sprcnb2 = this;
        sprcnb sprcnb3 = this;
        sprcnb3.cfr_renamed_4 = new sprooc();
        sprcnb2.cfr_renamed_1 = arg0.getX();
        sprcnb2.cfr_renamed_3 = sprkb2.cfr_renamed_284();
    }

    @Override
    public String getFormat() {
        return sproyy.cfr_renamed_9("K\u0000X\u00188s");
    }

    @Override
    public spraob cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_4.cfr_renamed_1510(arg0);
    }

    @Override
    public String getAlgorithm() {
        return sprzgia.cfr_renamed_9("\nL\bA\"A#");
    }

    /*
     * WARNING - void declaration
     */
    public sprcnb(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        sprcnb sprcnb2 = this;
        sprcnb sprcnb3 = this;
        sprcnb2.cfr_renamed_4 = new sprooc();
        sprcnb2.cfr_renamed_1 = dHPrivateKeySpec.getX();
        sprcnb2.cfr_renamed_3 = new spraob(arg0.getP(), arg0.getG());
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprcnb(sprimd sprimd2) {
        void arg0;
        sprcnb sprcnb2 = this;
        sprcnb sprcnb3 = this;
        sprcnb2.cfr_renamed_4 = new sprooc();
        sprcnb2.cfr_renamed_1 = sprimd2.cfr_renamed_1980();
        sprcnb2.cfr_renamed_3 = new spraob(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprcnb(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprcnb sprcnb2 = this;
        sprcnb sprcnb3 = this;
        sprcnb2.cfr_renamed_4 = new sprooc();
        sprcnb2.cfr_renamed_1 = dHPrivateKey.getX();
        sprcnb2.cfr_renamed_3 = new spraob(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprcnb(sprqsb sprqsb2) {
        void arg0;
        sprcnb sprcnb2 = this;
        sprcnb sprcnb3 = this;
        sprcnb2.cfr_renamed_4 = new sprooc();
        sprcnb2.cfr_renamed_1 = sprqsb2.cfr_renamed_1980();
        sprcnb2.cfr_renamed_3 = new spraob(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1189(new sprije(sprdh.cfr_renamed_91, new sprmfe(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145())), new sprooe(this.getX()));
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprcnb sprcnb2 = this;
        arg0.writeObject(sprcnb2.getX());
        v0.writeObject(sprcnb2.cfr_renamed_3.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_3.cfr_renamed_1145());
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_4.cfr_renamed_2152(arg0, arg1);
    }

    public sprcnb() {
        sprcnb sprcnb2 = this;
        sprcnb2.cfr_renamed_4 = new sprooc();
    }
}

