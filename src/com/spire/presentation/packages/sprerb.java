/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafba;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprgkj;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmbe;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwbe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprerb
implements DHPublicKey {
    private DHParameterSpec cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = -216691575254424324L;
    private sprdce cfr_renamed_4;

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprerb(sprmgd sprmgd2) {
        void arg0;
        this.cfr_renamed_2 = sprmgd2.spr\u3181();
        sprerb sprerb2 = this;
        this.cfr_renamed_1 = new DHParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145(), arg0.cfr_renamed_284().cfr_renamed_2331());
    }

    /*
     * WARNING - void declaration
     */
    public sprerb(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKeySpec.getY();
        sprerb sprerb2 = this;
        this.cfr_renamed_1 = new DHParameterSpec(arg0.getP(), arg0.getG());
    }

    @Override
    public String getFormat() {
        return sprafba.cfr_renamed_9("\u001eNsP\u007f");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_2 = (BigInteger)arg0.readObject();
        sprerb sprerb2 = this;
        sprerb2.cfr_renamed_1 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprerb sprerb2 = this;
        arg0.writeObject(this.getY());
        arg0.writeObject(sprerb2.cfr_renamed_1.getP());
        v0.writeObject(sprerb2.cfr_renamed_1.getG());
        v0.writeInt(this.cfr_renamed_1.getL());
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 != null) {
            return sprdqc.cfr_renamed_1188(this.cfr_renamed_4);
        }
        return sprdqc.cfr_renamed_1187(new sprije(sprm.cfr_renamed_41, new sprmbe(this.cfr_renamed_1.getP(), this.cfr_renamed_1.getG(), this.cfr_renamed_1.getL())), new sprooe(this.cfr_renamed_2));
    }

    @Override
    public String getAlgorithm() {
        return sprgkj.cfr_renamed_9("Q\t");
    }

    /*
     * WARNING - void declaration
     */
    public sprerb(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        void arg0;
        sprerb sprerb2 = this;
        sprerb2.cfr_renamed_2 = arg0;
        sprerb2.cfr_renamed_1 = dHParameterSpec;
    }

    /*
     * WARNING - void declaration
     */
    public sprerb(DHPublicKey dHPublicKey) {
        void arg0;
        sprerb sprerb2 = this;
        sprerb2.cfr_renamed_2 = arg0.getY();
        sprerb2.cfr_renamed_1 = dHPublicKey.getParams();
    }

    private /* synthetic */ boolean cfr_renamed_2332(sprbne arg0) {
        if (arg0.cfr_renamed_84() == 2) {
            return true;
        }
        if (arg0.cfr_renamed_84() > 3) {
            return false;
        }
        sprbne sprbne2 = arg0;
        sprooe sprooe2 = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(2));
        sprooe sprooe3 = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        return sprooe2.cfr_renamed_97().compareTo(BigInteger.valueOf(sprooe3.cfr_renamed_97().bitLength())) <= 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprerb(sprdce sprdce2) {
        sprooe sprooe2;
        void arg0;
        this.cfr_renamed_4 = sprdce2;
        try {
            sprooe2 = (sprooe)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprafba.cfr_renamed_9("/\u000e0\u0001*\t\"@/\u000e \u000ff\u00132\u00123\u00032\u00154\u0005f\t(@\u0002(f\u00103\u0002*\t%@-\u0005?"));
        }
        this.cfr_renamed_2 = sprooe2.cfr_renamed_97();
        void v0 = arg0;
        sprbne sprbne2 = sprbne.cfr_renamed_23(v0.cfr_renamed_1473().cfr_renamed_284());
        sprtzd sprtzd2 = v0.cfr_renamed_1473().cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_41) || this.cfr_renamed_2332(sprbne2)) {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(sprbne2);
            if (sprmbe2.cfr_renamed_2331() != null) {
                sprerb sprerb2 = this;
                sprerb2.cfr_renamed_1 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), sprmbe2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_1 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145());
            return;
        }
        if (sprtzd2.equals(sprtk.cfr_renamed_88)) {
            sprwbe sprwbe2 = sprwbe.cfr_renamed_23(sprbne2);
            this.cfr_renamed_1 = new DHParameterSpec(sprwbe2.cfr_renamed_1155().cfr_renamed_97(), sprwbe2.cfr_renamed_1145().cfr_renamed_97());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprgkj.cfr_renamed_9("`/~/z6{at-r.g(a)xaa8e$/a")).append(sprtzd2).toString());
    }
}

