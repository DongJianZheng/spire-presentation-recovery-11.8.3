/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;

public class sprfxc
implements DSAPrivateKey,
sprwb {
    private static final long cfr_renamed_1 = -4677259546958385734L;
    private transient sprooc cfr_renamed_2;
    private transient DSAParams cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_2.cfr_renamed_1510(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprfxc(sprlnd sprlnd2) {
        void arg0;
        sprfxc sprfxc2 = this;
        sprfxc sprfxc3 = this;
        sprfxc2.cfr_renamed_2 = new sprooc();
        sprfxc2.cfr_renamed_4 = sprlnd2.cfr_renamed_1980();
        sprfxc2.cfr_renamed_3 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    @Override
    public String getFormat() {
        return sprffb.cfr_renamed_9("`\u0015s\r\u0013f");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprfxc sprfxc2 = this;
        sprfxc2.cfr_renamed_3 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
        this.cfr_renamed_2 = new sprooc();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
        return this.getX().equals(dSAPrivateKey.getX()) && this.getParams().getG().equals(dSAPrivateKey.getParams().getG()) && this.getParams().getP().equals(dSAPrivateKey.getParams().getP()) && this.getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    /*
     * WARNING - void declaration
     */
    public sprfxc(DSAPrivateKey dSAPrivateKey) {
        void arg0;
        sprfxc sprfxc2 = this;
        sprfxc sprfxc3 = this;
        sprfxc3.cfr_renamed_2 = new sprooc();
        sprfxc2.cfr_renamed_4 = arg0.getX();
        sprfxc2.cfr_renamed_3 = dSAPrivateKey.getParams();
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_2.cfr_renamed_2152(arg0, arg1);
    }

    public sprfxc() {
        sprfxc sprfxc2 = this;
        sprfxc2.cfr_renamed_2 = new sprooc();
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_4;
    }

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_3;
    }

    public sprfxc(sprmke sprmke2) throws IOException {
        sprmke sprmke3 = sprmke2;
        sprfxc sprfxc2 = this;
        sprfxc2.cfr_renamed_2 = new sprooc();
        sprzde sprzde2 = sprzde.cfr_renamed_23(sprmke3.cfr_renamed_1254().cfr_renamed_284());
        sprooe sprooe2 = (sprooe)sprmke3.cfr_renamed_1229();
        sprfxc sprfxc3 = this;
        sprfxc3.cfr_renamed_4 = sprooe2.cfr_renamed_97();
        sprfxc3.cfr_renamed_3 = new DSAParameterSpec(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1189(new sprije(sprtk.cfr_renamed_314, new sprzde(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getQ(), this.cfr_renamed_3.getG()).cfr_renamed_119()), new sprooe(this.getX()));
    }

    /*
     * WARNING - void declaration
     */
    public sprfxc(DSAPrivateKeySpec dSAPrivateKeySpec) {
        void arg0;
        sprfxc sprfxc2 = this;
        sprfxc sprfxc3 = this;
        sprfxc2.cfr_renamed_2 = new sprooc();
        sprfxc2.cfr_renamed_4 = dSAPrivateKeySpec.getX();
        sprfxc2.cfr_renamed_3 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprfxc sprfxc2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprfxc2.cfr_renamed_3.getP());
        v0.writeObject(sprfxc2.cfr_renamed_3.getQ());
        v0.writeObject(this.cfr_renamed_3.getG());
    }
}

