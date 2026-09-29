/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmxn;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprytk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

public class sprush
implements DSAPublicKey {
    private static final long cfr_renamed_2 = 1752452449903495175L;
    private DSAParams cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprush(sprytk sprytk2) {
        void arg0;
        this.cfr_renamed_4 = sprytk2.spr\u3181();
        sprush sprush2 = this;
        this.cfr_renamed_3 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    @Override
    public String getFormat() {
        return sprqgo.cfr_renamed_9(":6W([");
    }

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_3;
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
            if (this.cfr_renamed_3 != null) return new sprvhm(new sprddm(sprbr.cfr_renamed_84, new sprxem(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getQ(), this.cfr_renamed_3.getG())), new sprktm(this.cfr_renamed_4)).cfr_renamed_104("DER");
            return new sprvhm(new sprddm(sprbr.cfr_renamed_84), new sprktm(this.cfr_renamed_4)).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprush(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        void arg0;
        sprush sprush2 = this;
        sprush2.cfr_renamed_4 = arg0;
        sprush2.cfr_renamed_3 = dSAParameterSpec;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_4 = (BigInteger)arg0.readObject();
        sprush sprush2 = this;
        sprush2.cfr_renamed_3 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprush(sprvhm arg0) {
        sprktm sprktm2;
        try {
            sprktm2 = (sprktm)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprmxn.cfr_renamed_9("{\u0017d\u0018~\u0010vY{\u0017t\u00162\nf\u000bg\u001af\f`\u001c2\u0010|YV*SYb\fp\u0015{\u001a2\u0012w\u0000"));
        }
        this.cfr_renamed_4 = sprktm2.cfr_renamed_97();
        if (this.cfr_renamed_9147(arg0.cfr_renamed_593().cfr_renamed_284())) {
            sprxem sprxem2 = sprxem.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
            sprush sprush2 = this;
            sprush2.cfr_renamed_3 = new DSAParameterSpec(sprxem2.cfr_renamed_1155(), sprxem2.cfr_renamed_1604(), sprxem2.cfr_renamed_1145());
        }
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprush sprush2 = this;
        arg0.writeObject(this.cfr_renamed_4);
        arg0.writeObject(sprush2.cfr_renamed_3.getP());
        v0.writeObject(sprush2.cfr_renamed_3.getQ());
        v0.writeObject(this.cfr_renamed_3.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprush(DSAPublicKey dSAPublicKey) {
        void arg0;
        sprush sprush2 = this;
        sprush2.cfr_renamed_4 = arg0.getY();
        sprush2.cfr_renamed_3 = dSAPublicKey.getParams();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprqgo.cfr_renamed_9("\\1YBH\u0017z\u000eq\u00018)}\u001b")).append(string);
        stringBuffer2.append(sprmxn.cfr_renamed_9("Y2Y2Y2Y2Y2Y2\u0000(Y")).append(this.getY().toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
        return this.getY().equals(dSAPublicKey.getY()) && this.getParams().getG().equals(dSAPublicKey.getParams().getG()) && this.getParams().getP().equals(dSAPublicKey.getParams().getP()) && this.getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ boolean cfr_renamed_9147(sprco arg0) {
        return arg0 != null && !sprpen.cfr_renamed_4.cfr_renamed_7476(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprush(DSAPublicKeySpec dSAPublicKeySpec) {
        void arg0;
        this.cfr_renamed_4 = dSAPublicKeySpec.getY();
        sprush sprush2 = this;
        this.cfr_renamed_3 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }
}

