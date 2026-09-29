/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdj;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlvh;
import com.spire.presentation.packages.sprovh;
import com.spire.presentation.packages.sprppm;
import com.spire.presentation.packages.sprssk;
import com.spire.presentation.packages.sprucq;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvzb;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprxoj
implements sprdj,
DHPublicKey {
    public static final long cfr_renamed_2 = 8712728417091216948L;
    private transient sprlvh cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public sprlvh cfr_renamed_284() {
        return this.cfr_renamed_3;
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

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprxoj sprxoj2 = this;
        sprxoj2.cfr_renamed_3 = new sprlvh((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    /*
     * WARNING - void declaration
     */
    public sprxoj(sprssk sprssk2) {
        void arg0;
        this.cfr_renamed_4 = sprssk2.spr\u3181();
        sprxoj sprxoj2 = this;
        this.cfr_renamed_3 = new sprlvh(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvhm sprvhm2 = new sprvhm(new sprddm(sprgt.cfr_renamed_152, new sprppm(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145())), new sprktm(this.cfr_renamed_4));
            return sprvhm2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxoj(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_4 = dHPublicKeySpec.getY();
        sprxoj sprxoj2 = this;
        this.cfr_renamed_3 = new sprlvh(arg0.getP(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprxoj(DHPublicKey dHPublicKey) {
        void arg0;
        this.cfr_renamed_4 = dHPublicKey.getY();
        sprxoj sprxoj2 = this;
        this.cfr_renamed_3 = new sprlvh(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprxoj(sprdj sprdj2) {
        void arg0;
        sprxoj sprxoj2 = this;
        sprxoj2.cfr_renamed_4 = arg0.getY();
        sprxoj2.cfr_renamed_3 = sprdj2.cfr_renamed_284();
    }

    @Override
    public String getAlgorithm() {
        return sprucq.cfr_renamed_9("|0~=T=U");
    }

    @Override
    public String getFormat() {
        return sprvzb.cfr_renamed_9("UV8H4");
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxoj(sprvhm sprvhm2) {
        sprppm sprppm2 = sprppm.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
        sprktm sprktm2 = null;
        try {
            void arg0;
            sprktm2 = (sprktm)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprucq.cfr_renamed_9("5W*X0P8\u00195W:V|J(K)Z(L.\\|P2\u0019\u0018j\u001d\u0019,L>U5Z|R9@"));
        }
        this.cfr_renamed_4 = sprktm2.cfr_renamed_97();
        sprxoj sprxoj2 = this;
        sprxoj2.cfr_renamed_3 = new sprlvh(sprppm2.cfr_renamed_1155(), sprppm2.cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprxoj(BigInteger bigInteger, sprlvh sprlvh2) {
        void arg0;
        sprxoj sprxoj2 = this;
        sprxoj2.cfr_renamed_4 = arg0;
        sprxoj2.cfr_renamed_3 = sprlvh2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxoj(sprovh sprovh2) {
        void arg0;
        this.cfr_renamed_4 = sprovh2.spr\u3181();
        sprxoj sprxoj2 = this;
        this.cfr_renamed_3 = new sprlvh(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey)arg0;
        return this.getY().equals(dHPublicKey.getY()) && this.getParams().getG().equals(dHPublicKey.getParams().getG()) && this.getParams().getP().equals(dHPublicKey.getParams().getP()) && this.getParams().getL() == dHPublicKey.getParams().getL();
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }
}

