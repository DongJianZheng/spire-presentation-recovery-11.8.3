/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmbe;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwbe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprlyc
implements DHPrivateKey,
sprwb {
    private transient DHParameterSpec cfr_renamed_0;
    public static final long cfr_renamed_1 = 311058815616901812L;
    private transient sprooc cfr_renamed_2;
    private transient sprmke cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlyc(sprmke sprmke2) throws IOException {
        void arg0;
        sprmke sprmke3 = sprmke2;
        sprlyc sprlyc2 = this;
        sprlyc2.cfr_renamed_2 = new sprooc();
        sprbne sprbne2 = sprbne.cfr_renamed_23(sprmke3.cfr_renamed_1254().cfr_renamed_284());
        sprooe sprooe2 = (sprooe)sprmke3.cfr_renamed_1229();
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        sprlyc sprlyc3 = this;
        sprlyc3.cfr_renamed_3 = arg0;
        sprlyc3.cfr_renamed_4 = sprooe2.cfr_renamed_97();
        if (sprtzd2.equals(sprm.cfr_renamed_41)) {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(sprbne2);
            if (sprmbe2.cfr_renamed_2331() != null) {
                this.cfr_renamed_0 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), sprmbe2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_0 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145());
            return;
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            sprwbe sprwbe2 = sprwbe.cfr_renamed_23(sprbne2);
            this.cfr_renamed_0 = new DHParameterSpec(sprwbe2.cfr_renamed_1155().cfr_renamed_97(), sprwbe2.cfr_renamed_1145().cfr_renamed_97());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdab.cfr_renamed_9("4|*|.e/2 ~&}3{5z,25k1w{2")).append(sprtzd2).toString());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprlyc sprlyc2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprlyc2.cfr_renamed_0.getP());
        v0.writeObject(sprlyc2.cfr_renamed_0.getG());
        v0.writeInt(this.cfr_renamed_0.getL());
    }

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_0;
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_2.cfr_renamed_1510(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprlyc(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprlyc sprlyc2 = this;
        sprlyc sprlyc3 = this;
        sprlyc3.cfr_renamed_2 = new sprooc();
        sprlyc2.cfr_renamed_4 = arg0.getX();
        sprlyc2.cfr_renamed_0 = dHPrivateKey.getParams();
    }

    @Override
    public String getAlgorithm() {
        return sprpon.cfr_renamed_9("MB");
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprlyc sprlyc2 = this;
        sprlyc2.cfr_renamed_0 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
        sprlyc sprlyc3 = this;
        sprlyc3.cfr_renamed_3 = null;
        sprlyc3.cfr_renamed_2 = new sprooc();
    }

    /*
     * WARNING - void declaration
     */
    public sprlyc(DHPrivateKeySpec dHPrivateKeySpec) {
        void arg0;
        sprlyc sprlyc2 = this;
        sprlyc sprlyc3 = this;
        sprlyc2.cfr_renamed_2 = new sprooc();
        sprlyc2.cfr_renamed_4 = dHPrivateKeySpec.getX();
        sprlyc2.cfr_renamed_0 = new DHParameterSpec(arg0.getP(), arg0.getG());
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
        catch (Exception exception) {
            return null;
        }
        {
            sprmke sprmke2 = new sprmke(new sprije(sprm.cfr_renamed_41, new sprmbe(this.cfr_renamed_0.getP(), this.cfr_renamed_0.getG(), this.cfr_renamed_0.getL()).cfr_renamed_119()), new sprooe(this.getX()));
            return sprmke2.cfr_renamed_104("DER");
        }
    }

    public sprlyc() {
        sprlyc sprlyc2 = this;
        sprlyc2.cfr_renamed_2 = new sprooc();
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
    public sprlyc(sprrkd sprrkd2) {
        void arg0;
        sprlyc sprlyc2 = this;
        sprlyc sprlyc3 = this;
        sprlyc2.cfr_renamed_2 = new sprooc();
        sprlyc2.cfr_renamed_4 = sprrkd2.cfr_renamed_1980();
        sprlyc2.cfr_renamed_0 = new DHParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145(), arg0.cfr_renamed_284().cfr_renamed_2331());
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_2.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public String getFormat() {
        return sprdab.cfr_renamed_9("\u0011Y\u0002Ab*");
    }
}

