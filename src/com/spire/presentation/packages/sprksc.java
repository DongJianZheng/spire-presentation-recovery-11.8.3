/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprdtd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmbe;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtxca;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwbe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprksc
implements DHPublicKey {
    private transient DHParameterSpec cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private transient sprdce cfr_renamed_3;
    public static final long cfr_renamed_4 = -216691575254424324L;

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey)arg0;
        return this.getY().equals(dHPublicKey.getY()) && this.getParams().getG().equals(dHPublicKey.getParams().getG()) && this.getParams().getP().equals(dHPublicKey.getParams().getP()) && this.getParams().getL() == dHPublicKey.getParams().getL();
    }

    /*
     * WARNING - void declaration
     */
    public sprksc(DHPublicKey dHPublicKey) {
        void arg0;
        sprksc sprksc2 = this;
        sprksc2.cfr_renamed_2 = arg0.getY();
        sprksc2.cfr_renamed_1 = dHPublicKey.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprksc(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKeySpec.getY();
        sprksc sprksc2 = this;
        this.cfr_renamed_1 = new DHParameterSpec(arg0.getP(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprksc(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        void arg0;
        sprksc sprksc2 = this;
        sprksc2.cfr_renamed_2 = arg0;
        sprksc2.cfr_renamed_1 = dHParameterSpec;
    }

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_1;
    }

    @Override
    public String getAlgorithm() {
        return sprdtd.cfr_renamed_9("Lc");
    }

    /*
     * WARNING - void declaration
     */
    public sprksc(sprmgd sprmgd2) {
        void arg0;
        this.cfr_renamed_2 = sprmgd2.spr\u3181();
        sprksc sprksc2 = this;
        this.cfr_renamed_1 = new DHParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145(), arg0.cfr_renamed_284().cfr_renamed_2331());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprksc(sprdce sprdce2) {
        sprooe sprooe2;
        void arg0;
        this.cfr_renamed_3 = sprdce2;
        try {
            sprooe2 = (sprooe)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprtxca.cfr_renamed_9(".x1w+\u007f#6.x!yge3d2u3c5sg\u007f)6\u0003^gf2t+\u007f$6,s>"));
        }
        this.cfr_renamed_2 = sprooe2.cfr_renamed_97();
        void v0 = arg0;
        sprbne sprbne2 = sprbne.cfr_renamed_23(v0.cfr_renamed_593().cfr_renamed_284());
        sprtzd sprtzd2 = v0.cfr_renamed_593().cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_41) || this.cfr_renamed_2332(sprbne2)) {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(sprbne2);
            if (sprmbe2.cfr_renamed_2331() != null) {
                sprksc sprksc2 = this;
                sprksc2.cfr_renamed_1 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), sprmbe2.cfr_renamed_2331().intValue());
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
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdtd.cfr_renamed_9("}EcEg\\f\u000biGoDzB|Ce\u000b|RxN2\u000b")).append(sprtzd2).toString());
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

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprksc sprksc2 = this;
        sprksc2.cfr_renamed_1 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
        this.cfr_renamed_3 = null;
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_3 != null) {
            return sprdqc.cfr_renamed_1188(this.cfr_renamed_3);
        }
        return sprdqc.cfr_renamed_1187(new sprije(sprm.cfr_renamed_41, new sprmbe(this.cfr_renamed_1.getP(), this.cfr_renamed_1.getG(), this.cfr_renamed_1.getL()).cfr_renamed_119()), new sprooe(this.cfr_renamed_2));
    }

    @Override
    public String getFormat() {
        return sprtxca.cfr_renamed_9("\u001f8r&~");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprksc sprksc2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprksc2.cfr_renamed_1.getP());
        v0.writeObject(sprksc2.cfr_renamed_1.getG());
        v0.writeInt(this.cfr_renamed_1.getL());
    }
}

