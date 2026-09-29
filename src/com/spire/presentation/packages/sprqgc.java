/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraob;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprkb;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqsb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprukaa;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.spryny;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprqgc
implements sprkb,
DHPrivateKey,
sprwb {
    private transient spraob cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = 4819350091141529678L;
    private transient sprooc cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqgc(sprkb sprkb2) {
        void arg0;
        sprqgc sprqgc2 = this;
        sprqgc sprqgc3 = this;
        sprqgc3.cfr_renamed_4 = new sprooc();
        sprqgc2.cfr_renamed_2 = arg0.getX();
        sprqgc2.cfr_renamed_1 = sprkb2.cfr_renamed_284();
    }

    @Override
    public String getFormat() {
        return sprukaa.cfr_renamed_9("\u0018X\u000b@k+");
    }

    /*
     * WARNING - void declaration
     */
    public sprqgc(sprqsb sprqsb2) {
        void arg0;
        sprqgc sprqgc2 = this;
        sprqgc sprqgc3 = this;
        sprqgc2.cfr_renamed_4 = new sprooc();
        sprqgc2.cfr_renamed_2 = sprqsb2.cfr_renamed_1980();
        sprqgc2.cfr_renamed_1 = new spraob(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprqgc(sprimd sprimd2) {
        void arg0;
        sprqgc sprqgc2 = this;
        sprqgc sprqgc3 = this;
        sprqgc2.cfr_renamed_4 = new sprooc();
        sprqgc2.cfr_renamed_2 = sprimd2.cfr_renamed_1980();
        sprqgc2.cfr_renamed_1 = new spraob(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_4.cfr_renamed_1510(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprqgc(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        sprqgc sprqgc2 = this;
        sprqgc sprqgc3 = this;
        sprqgc2.cfr_renamed_4 = new sprooc();
        sprqgc2.cfr_renamed_2 = dHPrivateKeySpec.getX();
        sprqgc2.cfr_renamed_1 = new spraob(arg0.getP(), arg0.getG());
    }

    public sprqgc() {
        sprqgc sprqgc2 = this;
        sprqgc2.cfr_renamed_4 = new sprooc();
    }

    @Override
    public spraob cfr_renamed_284() {
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
            sprmke sprmke2 = new sprmke(new sprije(sprdh.cfr_renamed_91, new sprmfe(this.cfr_renamed_1.cfr_renamed_1155(), this.cfr_renamed_1.cfr_renamed_1145())), new sprooe(this.getX()));
            return sprmke2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public sprqgc(sprmke sprmke2) throws IOException {
        sprmke sprmke3 = sprmke2;
        sprqgc sprqgc2 = this;
        sprqgc sprqgc3 = this;
        sprqgc2.cfr_renamed_4 = new sprooc();
        sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprmke3.cfr_renamed_1254().cfr_renamed_284());
        sprqgc2.cfr_renamed_2 = sprooe.cfr_renamed_23(sprmke3.cfr_renamed_1229()).cfr_renamed_97();
        sprqgc2.cfr_renamed_1 = new spraob(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprqgc(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprqgc sprqgc2 = this;
        sprqgc sprqgc3 = this;
        sprqgc2.cfr_renamed_4 = new sprooc();
        sprqgc2.cfr_renamed_2 = dHPrivateKey.getX();
        sprqgc2.cfr_renamed_1 = new spraob(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        arg0.defaultWriteObject();
        v0.writeObject(this.cfr_renamed_1.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_1.cfr_renamed_1145());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprqgc sprqgc2 = this;
        sprqgc2.cfr_renamed_1 = new spraob((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
        this.cfr_renamed_4 = new sprooc();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
        return this.getX().equals(dHPrivateKey.getX()) && this.getParams().getG().equals(dHPrivateKey.getParams().getG()) && this.getParams().getP().equals(dHPrivateKey.getParams().getP()) && this.getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_4.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_4.cfr_renamed_2158();
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_1.cfr_renamed_1155(), this.cfr_renamed_1.cfr_renamed_1145());
    }

    @Override
    public String getAlgorithm() {
        return spryny.cfr_renamed_9("lVn[D[E");
    }
}

