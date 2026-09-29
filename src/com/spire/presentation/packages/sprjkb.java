/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmbe;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwbe;
import com.spire.presentation.packages.sprywh;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprjkb
implements DHPrivateKey,
sprwb {
    public BigInteger cfr_renamed_0;
    private sprwb cfr_renamed_1;
    public static final long cfr_renamed_2 = 311058815616901812L;
    private sprmke cfr_renamed_3;
    private DHParameterSpec cfr_renamed_4;

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_4;
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
            sprmke sprmke2 = new sprmke(new sprije(sprm.cfr_renamed_41, new sprmbe(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getG(), this.cfr_renamed_4.getL())), new sprooe(this.getX()));
            return sprmke2.cfr_renamed_104("DER");
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprjkb(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        sprjkb sprjkb2 = this;
        sprjkb sprjkb3 = this;
        sprjkb2.cfr_renamed_1 = new sprooc();
        sprjkb2.cfr_renamed_0 = dHPrivateKeySpec.getX();
        sprjkb2.cfr_renamed_4 = new DHParameterSpec(arg0.getP(), arg0.getG());
    }

    public sprjkb() {
        sprjkb sprjkb2 = this;
        sprjkb2.cfr_renamed_1 = new sprooc();
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_0;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_1.cfr_renamed_2158();
    }

    @Override
    public String getAlgorithm() {
        return sprywh.cfr_renamed_9("\u0003R");
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_1.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public String getFormat() {
        return sprhah.cfr_renamed_9("7\u001b$\u0003Dh");
    }

    /*
     * WARNING - void declaration
     */
    public sprjkb(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprjkb sprjkb2 = this;
        sprjkb sprjkb3 = this;
        sprjkb3.cfr_renamed_1 = new sprooc();
        sprjkb2.cfr_renamed_0 = arg0.getX();
        sprjkb2.cfr_renamed_4 = dHPrivateKey.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprjkb(sprrkd sprrkd2) {
        void arg0;
        sprjkb sprjkb2 = this;
        sprjkb sprjkb3 = this;
        sprjkb2.cfr_renamed_1 = new sprooc();
        sprjkb2.cfr_renamed_0 = sprrkd2.cfr_renamed_1980();
        sprjkb2.cfr_renamed_4 = new DHParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145(), arg0.cfr_renamed_284().cfr_renamed_2331());
    }

    /*
     * WARNING - void declaration
     */
    public sprjkb(sprmke sprmke2) throws IOException {
        void arg0;
        sprmke sprmke3 = sprmke2;
        sprjkb sprjkb2 = this;
        sprjkb sprjkb3 = this;
        sprjkb2.cfr_renamed_1 = new sprooc();
        void v3 = arg0;
        sprbne sprbne2 = sprbne.cfr_renamed_23(v3.cfr_renamed_1473().cfr_renamed_284());
        sprooe sprooe2 = sprooe.cfr_renamed_23(v3.cfr_renamed_1229());
        sprtzd sprtzd2 = sprmke3.cfr_renamed_1473().cfr_renamed_593();
        sprjkb2.cfr_renamed_3 = sprmke3;
        sprjkb2.cfr_renamed_0 = sprooe2.cfr_renamed_97();
        if (sprtzd2.equals(sprm.cfr_renamed_41)) {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(sprbne2);
            if (sprmbe2.cfr_renamed_2331() != null) {
                this.cfr_renamed_4 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), sprmbe2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_4 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145());
            return;
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            sprwbe sprwbe2 = sprwbe.cfr_renamed_23(sprbne2);
            this.cfr_renamed_4 = new DHParameterSpec(sprwbe2.cfr_renamed_1155().cfr_renamed_97(), sprwbe2.cfr_renamed_1145().cfr_renamed_97());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("2t,t(m):&v u5s3r*:3c7\u007f}:")).append(sprtzd2).toString());
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_1.cfr_renamed_1510(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprjkb sprjkb2 = this;
        arg0.writeObject(this.getX());
        arg0.writeObject(sprjkb2.cfr_renamed_4.getP());
        v0.writeObject(sprjkb2.cfr_renamed_4.getG());
        v0.writeInt(this.cfr_renamed_4.getL());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_0 = (BigInteger)arg0.readObject();
        sprjkb sprjkb2 = this;
        sprjkb2.cfr_renamed_4 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
    }
}

