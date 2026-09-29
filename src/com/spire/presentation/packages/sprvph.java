/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.spryvi;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

public class sprvph
implements RSAPrivateKey,
sprof {
    public static final long cfr_renamed_0 = 5110188922551353628L;
    public BigInteger cfr_renamed_1;
    private transient sprtlj cfr_renamed_2;
    private static BigInteger cfr_renamed_3 = BigInteger.valueOf(0L);
    public BigInteger cfr_renamed_4;

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_2.cfr_renamed_9064(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvph(RSAPrivateKey rSAPrivateKey) {
        void arg0;
        sprvph sprvph2 = this;
        sprvph sprvph3 = this;
        sprvph3.cfr_renamed_2 = new sprtlj();
        sprvph2.cfr_renamed_1 = arg0.getModulus();
        sprvph2.cfr_renamed_4 = rSAPrivateKey.getPrivateExponent();
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        sprvph sprvph2 = this;
        void v1 = arg0;
        v1.writeObject(this.cfr_renamed_1);
        sprvph2.cfr_renamed_2.cfr_renamed_2291((ObjectOutputStream)arg0);
        v1.writeObject(sprvph2.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof RSAPrivateKey)) {
            return false;
        }
        if (arg0 == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)arg0;
        return this.getModulus().equals(rSAPrivateKey.getModulus()) && this.getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    /*
     * WARNING - void declaration
     */
    public sprvph(RSAPrivateKeySpec rSAPrivateKeySpec) {
        void arg0;
        sprvph sprvph2 = this;
        sprvph sprvph3 = this;
        sprvph3.cfr_renamed_2 = new sprtlj();
        sprvph2.cfr_renamed_1 = arg0.getModulus();
        sprvph2.cfr_renamed_4 = rSAPrivateKeySpec.getPrivateExponent();
    }

    public sprvph() {
        sprvph sprvph2 = this;
        sprvph2.cfr_renamed_2 = new sprtlj();
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5678(new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4), new sprctm(this.getModulus(), cfr_renamed_3, this.getPrivateExponent(), cfr_renamed_3, cfr_renamed_3, cfr_renamed_3, cfr_renamed_3, cfr_renamed_3));
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_1 = (BigInteger)arg0.readObject();
        sprvph sprvph2 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_2.cfr_renamed_2290(arg0);
        this.cfr_renamed_4 = (BigInteger)arg0.readObject();
    }

    @Override
    public BigInteger getPrivateExponent() {
        return this.cfr_renamed_4;
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_1;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_2.cfr_renamed_9065(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprvph(sprkik sprkik2) {
        void arg0;
        sprvph sprvph2 = this;
        sprvph sprvph3 = this;
        sprvph3.cfr_renamed_2 = new sprtlj();
        sprvph2.cfr_renamed_1 = arg0.cfr_renamed_2295();
        sprvph2.cfr_renamed_4 = sprkik2.cfr_renamed_360();
    }

    @Override
    public String getFormat() {
        return spryvi.cfr_renamed_9("t\u0016g\u000e\u0007e");
    }
}

