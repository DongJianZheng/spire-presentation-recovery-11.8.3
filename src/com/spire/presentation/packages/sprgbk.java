/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkck;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprpdp;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprytk;
import com.spire.presentation.packages.sprytp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

public class sprgbk
implements DSAPublicKey {
    private transient sprytk cfr_renamed_0;
    private static final long cfr_renamed_1 = 1752452449903495175L;
    private static BigInteger cfr_renamed_2 = BigInteger.valueOf(0L);
    private BigInteger cfr_renamed_3;
    private transient DSAParams cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        sprgbk sprgbk2;
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger)objectInputStream.readObject();
        if (bigInteger.equals(cfr_renamed_2)) {
            sprgbk2 = this;
            this.cfr_renamed_4 = null;
        } else {
            this.cfr_renamed_4 = new DSAParameterSpec(bigInteger, (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
            sprgbk2 = this;
        }
        sprgbk sprgbk3 = this;
        sprgbk2.cfr_renamed_0 = new sprytk(sprgbk3.cfr_renamed_3, sprkck.cfr_renamed_9451(sprgbk3.cfr_renamed_4));
    }

    /*
     * WARNING - void declaration
     */
    public sprgbk(DSAPublicKeySpec dSAPublicKeySpec) {
        void arg0;
        this.cfr_renamed_3 = dSAPublicKeySpec.getY();
        sprgbk sprgbk2 = this;
        this.cfr_renamed_4 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
        sprgbk sprgbk3 = this;
        sprgbk2.cfr_renamed_0 = new sprytk(sprgbk3.cfr_renamed_3, sprkck.cfr_renamed_9451(sprgbk3.cfr_renamed_4));
    }

    private /* synthetic */ boolean cfr_renamed_9147(sprco arg0) {
        return arg0 != null && !sprpen.cfr_renamed_4.cfr_renamed_5078(arg0.cfr_renamed_119());
    }

    public int hashCode() {
        if (this.cfr_renamed_4 != null) {
            return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
        }
        return this.getY().hashCode();
    }

    public sprytk cfr_renamed_9389() {
        return this.cfr_renamed_0;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
        if (this.cfr_renamed_4 != null) {
            return this.getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && this.getParams().getG().equals(dSAPublicKey.getParams().getG()) && this.getParams().getP().equals(dSAPublicKey.getParams().getP()) && this.getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return this.getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 == null) {
            return sprjij.cfr_renamed_5679(new sprddm(sprbr.cfr_renamed_84), new sprktm(this.cfr_renamed_3));
        }
        return sprjij.cfr_renamed_5679(new sprddm(sprbr.cfr_renamed_84, new sprxem(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getQ(), this.cfr_renamed_4.getG()).cfr_renamed_119()), new sprktm(this.cfr_renamed_3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgbk(sprvhm arg0) {
        sprgbk sprgbk2;
        sprktm sprktm2;
        try {
            sprktm2 = (sprktm)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprpdp.cfr_renamed_9("o!p.j&boo!` &<r=s,r:t*&&hoB\u001cGov:d#o,&$c6"));
        }
        this.cfr_renamed_3 = sprktm2.cfr_renamed_97();
        if (this.cfr_renamed_9147(arg0.cfr_renamed_593().cfr_renamed_284())) {
            sprxem sprxem2 = sprxem.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
            sprgbk2 = this;
            this.cfr_renamed_4 = new DSAParameterSpec(sprxem2.cfr_renamed_1155(), sprxem2.cfr_renamed_1604(), sprxem2.cfr_renamed_1145());
        } else {
            sprgbk2 = this;
            this.cfr_renamed_4 = null;
        }
        sprgbk sprgbk3 = this;
        sprgbk2.cfr_renamed_0 = new sprytk(sprgbk3.cfr_renamed_3, sprkck.cfr_renamed_9451(sprgbk3.cfr_renamed_4));
    }

    public sprgbk(sprytk arg0) {
        sprgbk sprgbk2;
        sprytk sprytk2 = arg0;
        this.cfr_renamed_3 = sprytk2.spr\u3181();
        if (sprytk2.cfr_renamed_284() != null) {
            sprgbk2 = this;
            this.cfr_renamed_4 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
        } else {
            sprgbk2 = this;
            this.cfr_renamed_4 = null;
        }
        sprgbk2.cfr_renamed_0 = arg0;
    }

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprytp.cfr_renamed_9("t.q]`\bR\u0011Y\u001e\u00106U\u0004\u0010&")).append(sprkck.cfr_renamed_9450(this.cfr_renamed_3, this.getParams())).append("]").append(string);
        stringBuffer2.append(sprpdp.cfr_renamed_9("o&o&o&o&o&o&\u0016<o")).append(this.getY().toString(16)).append(string);
        return stringBuffer2.toString();
    }

    @Override
    public String getFormat() {
        return sprytp.cfr_renamed_9("%\u001eH\u0000D");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (this.cfr_renamed_4 == null) {
            arg0.writeObject(cfr_renamed_2);
            return;
        }
        void v0 = arg0;
        sprgbk sprgbk2 = this;
        arg0.writeObject(this.cfr_renamed_4.getP());
        v0.writeObject(sprgbk2.cfr_renamed_4.getQ());
        v0.writeObject(sprgbk2.cfr_renamed_4.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprgbk(DSAPublicKey dSAPublicKey) {
        void arg0;
        sprgbk sprgbk2 = this;
        sprgbk2.cfr_renamed_3 = arg0.getY();
        sprgbk2.cfr_renamed_4 = dSAPublicKey.getParams();
        sprgbk sprgbk3 = this;
        sprgbk sprgbk4 = this;
        sprgbk2.cfr_renamed_0 = new sprytk(sprgbk4.cfr_renamed_3, sprkck.cfr_renamed_9451(sprgbk4.cfr_renamed_4));
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_3;
    }
}

