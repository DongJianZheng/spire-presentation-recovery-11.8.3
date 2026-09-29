/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdgm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdwj;
import com.spire.presentation.packages.sprhdm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproom;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprrhi;
import com.spire.presentation.packages.sprsuk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprtno;
import com.spire.presentation.packages.sprvci;
import com.spire.presentation.packages.sprwsk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class sprzbk
implements DHPrivateKey,
sprof {
    private transient DHParameterSpec cfr_renamed_91;
    private transient sprtlj cfr_renamed_0;
    private transient sprquk cfr_renamed_1;
    public static final long cfr_renamed_2 = 311058815616901812L;
    private transient sprcom cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_4;
    }

    public sprzbk(DHPrivateKeySpec arg0) {
        DHPrivateKeySpec dHPrivateKeySpec = arg0;
        sprzbk sprzbk2 = this;
        sprzbk2.cfr_renamed_0 = new sprtlj();
        this.cfr_renamed_4 = dHPrivateKeySpec.getX();
        if (dHPrivateKeySpec instanceof sprvci) {
            this.cfr_renamed_91 = ((sprvci)arg0).cfr_renamed_2110();
            return;
        }
        this.cfr_renamed_91 = new DHParameterSpec(arg0.getP(), arg0.getG());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_0.cfr_renamed_2158();
    }

    @Override
    public DHParameterSpec getParams() {
        return this.cfr_renamed_91;
    }

    public String toString() {
        return sprdwj.cfr_renamed_9453(sprtno.cfr_renamed_9("\u000eZ"), this.cfr_renamed_4, new sprwsk(this.cfr_renamed_91.getP(), this.cfr_renamed_91.getG()));
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprzbk sprzbk2 = this;
        sprzbk2.cfr_renamed_91 = new DHParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), arg0.readInt());
        sprzbk sprzbk3 = this;
        sprzbk3.cfr_renamed_3 = null;
        sprzbk3.cfr_renamed_0 = new sprtlj();
    }

    /*
     * WARNING - void declaration
     */
    public sprzbk(sprcom sprcom2) throws IOException {
        void arg0;
        sprcom sprcom3 = sprcom2;
        sprzbk sprzbk2 = this;
        sprzbk2.cfr_renamed_0 = new sprtlj();
        sprszm sprszm2 = sprszm.cfr_renamed_23(sprcom3.cfr_renamed_1254().cfr_renamed_284());
        sprktm sprktm2 = (sprktm)sprcom3.cfr_renamed_1229();
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        sprzbk sprzbk3 = this;
        sprzbk3.cfr_renamed_3 = arg0;
        sprzbk3.cfr_renamed_4 = sprktm2.cfr_renamed_97();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            sproom sproom2 = sproom.cfr_renamed_23(sprszm2);
            if (sproom2.cfr_renamed_2331() != null) {
                this.cfr_renamed_91 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), sproom2.cfr_renamed_2331().intValue());
                this.cfr_renamed_1 = new sprquk(this.cfr_renamed_4, new sprwsk(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), null, sproom2.cfr_renamed_2331().intValue()));
                return;
            }
            sprzbk sprzbk4 = this;
            sprzbk4.cfr_renamed_91 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145());
            sprzbk4.cfr_renamed_1 = new sprquk(this.cfr_renamed_4, new sprwsk(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145()));
            return;
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_31)) {
            sprdgm sprdgm2 = sprdgm.cfr_renamed_23(sprszm2);
            this.cfr_renamed_91 = new sprrhi(sprdgm2.cfr_renamed_1155(), sprdgm2.cfr_renamed_1604(), sprdgm2.cfr_renamed_1145(), sprdgm2.cfr_renamed_2616(), 0);
            this.cfr_renamed_1 = new sprquk(this.cfr_renamed_4, new sprwsk(sprdgm2.cfr_renamed_1155(), sprdgm2.cfr_renamed_1145(), sprdgm2.cfr_renamed_1604(), sprdgm2.cfr_renamed_2616(), null));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbyfa.cfr_renamed_9("8<&<\"%#r,>*=?;9: r9+=7wr")).append(sprlem2).toString());
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_0.cfr_renamed_9064(arg0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
        return this.getX().equals(dHPrivateKey.getX()) && this.getParams().getG().equals(dHPrivateKey.getParams().getG()) && this.getParams().getP().equals(dHPrivateKey.getParams().getP()) && this.getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getL();
    }

    @Override
    public String getAlgorithm() {
        return sprtno.cfr_renamed_9("\u000eZ");
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_0.cfr_renamed_9065(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprzbk sprzbk2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprzbk2.cfr_renamed_91.getP());
        v0.writeObject(sprzbk2.cfr_renamed_91.getG());
        v0.writeInt(this.cfr_renamed_91.getL());
    }

    @Override
    public byte[] getEncoded() {
        sprcom sprcom2;
        block6: {
            try {
                if (this.cfr_renamed_3 == null) break block6;
                return this.cfr_renamed_3.cfr_renamed_104("DER");
            }
            catch (Exception exception) {
                return null;
            }
        }
        if (this.cfr_renamed_91 instanceof sprrhi && ((sprrhi)this.cfr_renamed_91).cfr_renamed_1604() != null) {
            sprcom sprcom3;
            sprwsk sprwsk2 = ((sprrhi)this.cfr_renamed_91).cfr_renamed_3373();
            sprsuk sprsuk2 = sprwsk2.cfr_renamed_3371();
            sprhdm sprhdm2 = null;
            if (sprsuk2 != null) {
                sprhdm2 = new sprhdm(sprsuk2.cfr_renamed_2113(), sprsuk2.cfr_renamed_3374());
            }
            sprcom2 = sprcom3 = new sprcom(new sprddm(sprbr.cfr_renamed_31, new sprdgm(sprwsk2.cfr_renamed_1155(), sprwsk2.cfr_renamed_1145(), sprwsk2.cfr_renamed_1604(), sprwsk2.cfr_renamed_2616(), sprhdm2).cfr_renamed_119()), new sprktm(this.getX()));
        } else {
            sprcom sprcom4;
            sprcom2 = sprcom4 = new sprcom(new sprddm(sprdl.cfr_renamed_1214, new sproom(this.cfr_renamed_91.getP(), this.cfr_renamed_91.getG(), this.cfr_renamed_91.getL()).cfr_renamed_119()), new sprktm(this.getX()));
        }
        return sprcom2.cfr_renamed_104("DER");
    }

    @Override
    public String getFormat() {
        return sprbyfa.cfr_renamed_9("\u001d\u0019\u000e\u0001nj");
    }

    /*
     * WARNING - void declaration
     */
    public sprzbk(DHPrivateKey dHPrivateKey) {
        void arg0;
        sprzbk sprzbk2 = this;
        sprzbk sprzbk3 = this;
        sprzbk3.cfr_renamed_0 = new sprtlj();
        sprzbk2.cfr_renamed_4 = arg0.getX();
        sprzbk2.cfr_renamed_91 = dHPrivateKey.getParams();
    }

    public sprquk cfr_renamed_9389() {
        if (this.cfr_renamed_1 != null) {
            return this.cfr_renamed_1;
        }
        if (this.cfr_renamed_91 instanceof sprrhi) {
            sprzbk sprzbk2 = this;
            return new sprquk(sprzbk2.cfr_renamed_4, ((sprrhi)sprzbk2.cfr_renamed_91).cfr_renamed_3373());
        }
        return new sprquk(this.cfr_renamed_4, new sprwsk(this.cfr_renamed_91.getP(), this.cfr_renamed_91.getG(), null, this.cfr_renamed_91.getL()));
    }

    public sprzbk() {
        sprzbk sprzbk2 = this;
        sprzbk2.cfr_renamed_0 = new sprtlj();
    }

    /*
     * WARNING - void declaration
     */
    public sprzbk(sprquk sprquk2) {
        void arg0;
        sprzbk sprzbk2 = this;
        sprzbk sprzbk3 = this;
        sprzbk2.cfr_renamed_0 = new sprtlj();
        sprzbk2.cfr_renamed_4 = sprquk2.cfr_renamed_1980();
        sprzbk2.cfr_renamed_91 = new sprrhi(arg0.cfr_renamed_284());
    }
}

