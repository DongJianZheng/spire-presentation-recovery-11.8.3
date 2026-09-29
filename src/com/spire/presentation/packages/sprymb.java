/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraob;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlyn;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprsb;
import com.spire.presentation.packages.sprxtb;
import com.spire.presentation.packages.spryoy;
import com.spire.presentation.packages.sprzkd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprymb
implements sprsb,
DHPublicKey {
    private BigInteger cfr_renamed_2;
    private spraob cfr_renamed_3;
    public static final long cfr_renamed_4 = 8712728417091216948L;

    /*
     * WARNING - void declaration
     */
    public sprymb(sprxtb sprxtb2) {
        void arg0;
        this.cfr_renamed_2 = sprxtb2.spr\u3181();
        sprymb sprymb2 = this;
        this.cfr_renamed_3 = new spraob(arg0.cfr_renamed_2110().cfr_renamed_1155(), arg0.cfr_renamed_2110().cfr_renamed_1145());
    }

    @Override
    public String getFormat() {
        return sprlyn.cfr_renamed_9("qF\u001cX\u0010");
    }

    /*
     * WARNING - void declaration
     */
    public sprymb(sprzkd sprzkd2) {
        void arg0;
        this.cfr_renamed_2 = sprzkd2.spr\u3181();
        sprymb sprymb2 = this;
        this.cfr_renamed_3 = new spraob(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprymb(sprsb sprsb2) {
        void arg0;
        sprymb sprymb2 = this;
        sprymb2.cfr_renamed_2 = arg0.getY();
        sprymb2.cfr_renamed_3 = sprsb2.cfr_renamed_284();
    }

    /*
     * WARNING - void declaration
     */
    public sprymb(DHPublicKey dHPublicKey) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKey.getY();
        sprymb sprymb2 = this;
        this.cfr_renamed_3 = new spraob(arg0.getParams().getP(), arg0.getParams().getG());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprymb sprymb2 = this;
        arg0.writeObject(sprymb2.getY());
        v0.writeObject(sprymb2.cfr_renamed_3.cfr_renamed_1155());
        v0.writeObject(this.cfr_renamed_3.cfr_renamed_1145());
    }

    @Override
    public String getAlgorithm() {
        return spryoy.cfr_renamed_9("\u001fe\u001dh7h6");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprymb(sprdce sprdce2) {
        sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprdce2.cfr_renamed_593().cfr_renamed_284());
        sprooe sprooe2 = null;
        try {
            void arg0;
            sprooe2 = (sprooe)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprlyn.cfr_renamed_9("\u0001G\u001eH\u0004@\f\t\u0001G\u000eFHZ\u001c[\u001dJ\u001c\\\u001aLH@\u0006\t,z)\t\u0018\\\nE\u0001JHB\rP"));
        }
        this.cfr_renamed_2 = sprooe2.cfr_renamed_97();
        sprymb sprymb2 = this;
        sprymb2.cfr_renamed_3 = new spraob(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_2 = (BigInteger)arg0.readObject();
        sprymb sprymb2 = this;
        sprymb2.cfr_renamed_3 = new spraob((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    /*
     * WARNING - void declaration
     */
    public sprymb(DHPublicKeySpec dHPublicKeySpec) {
        void arg0;
        this.cfr_renamed_2 = dHPublicKeySpec.getY();
        sprymb sprymb2 = this;
        this.cfr_renamed_3 = new spraob(arg0.getP(), arg0.getG());
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1187(new sprije(sprdh.cfr_renamed_91, new sprmfe(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145())), new sprooe(this.cfr_renamed_2));
    }

    /*
     * WARNING - void declaration
     */
    public sprymb(BigInteger bigInteger, spraob spraob2) {
        void arg0;
        sprymb sprymb2 = this;
        sprymb2.cfr_renamed_2 = arg0;
        sprymb2.cfr_renamed_3 = spraob2;
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_2;
    }

    @Override
    public spraob cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    @Override
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cfr_renamed_3.cfr_renamed_1155(), this.cfr_renamed_3.cfr_renamed_1145());
    }
}

