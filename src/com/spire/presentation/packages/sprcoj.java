/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjj;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprpdp;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprvrc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

public class sprcoj
implements RSAPrivateKey,
sprof {
    public transient sprtlj cfr_renamed_112;
    private static BigInteger cfr_renamed_119 = BigInteger.valueOf(0L);
    public transient sprddm cfr_renamed_91;
    public BigInteger cfr_renamed_0;
    public transient sprkik cfr_renamed_1;
    public static final long cfr_renamed_2 = 5110188922551353628L;
    private byte[] cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcoj(RSAPrivateKeySpec rSAPrivateKeySpec) {
        void arg0;
        sprcoj sprcoj2 = this;
        this.cfr_renamed_3 = sprcoj.cfr_renamed_9405(sprbjj.cfr_renamed_2);
        this.cfr_renamed_91 = sprbjj.cfr_renamed_2;
        sprcoj sprcoj3 = this;
        this.cfr_renamed_112 = new sprtlj();
        sprcoj2.cfr_renamed_4 = arg0.getModulus();
        sprcoj2.cfr_renamed_0 = rSAPrivateKeySpec.getPrivateExponent();
        sprcoj sprcoj4 = this;
        sprcoj2.cfr_renamed_1 = new sprkik(true, sprcoj4.cfr_renamed_4, sprcoj4.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_112.cfr_renamed_9065(arg0, arg1);
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5678(this.cfr_renamed_91, new sprctm(this.getModulus(), cfr_renamed_119, this.getPrivateExponent(), cfr_renamed_119, cfr_renamed_119, cfr_renamed_119, cfr_renamed_119, cfr_renamed_119));
    }

    @Override
    public BigInteger getPrivateExponent() {
        return this.cfr_renamed_0;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_9405(sprddm arg0) {
        try {
            return arg0.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprcoj(sprddm sprddm2, sprctm sprctm2) {
        void arg1;
        void arg0;
        sprcoj sprcoj2 = this;
        sprcoj sprcoj3 = this;
        this.cfr_renamed_3 = sprcoj.cfr_renamed_9405(sprbjj.cfr_renamed_2);
        this.cfr_renamed_91 = sprbjj.cfr_renamed_2;
        sprcoj sprcoj4 = this;
        this.cfr_renamed_112 = new sprtlj();
        sprcoj3.cfr_renamed_91 = arg0;
        sprcoj3.cfr_renamed_3 = sprcoj.cfr_renamed_9405((sprddm)arg0);
        sprcoj2.cfr_renamed_4 = arg1.cfr_renamed_2295();
        sprcoj2.cfr_renamed_0 = sprctm2.cfr_renamed_2299();
        sprcoj sprcoj5 = this;
        sprcoj2.cfr_renamed_1 = new sprkik(true, sprcoj5.cfr_renamed_4, sprcoj5.cfr_renamed_0);
    }

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        arg0.defaultWriteObject();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        void arg0;
        arg0.defaultReadObject();
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = sprcoj.cfr_renamed_9405(sprbjj.cfr_renamed_2);
        }
        this.cfr_renamed_91 = sprddm.cfr_renamed_23(this.cfr_renamed_3);
        sprcoj sprcoj2 = this;
        sprcoj2.cfr_renamed_112 = new sprtlj();
        sprcoj sprcoj3 = this;
        this.cfr_renamed_1 = new sprkik(true, sprcoj3.cfr_renamed_4, sprcoj3.cfr_renamed_0);
    }

    @Override
    public String getFormat() {
        return sprvrc.cfr_renamed_9("{\u0002h\u001a\bq");
    }

    @Override
    public String getAlgorithm() {
        if (this.cfr_renamed_91.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
            return sprpdp.cfr_renamed_9("T\u001cG\u001cU\u000e+\u001fU\u001c");
        }
        return "RSA";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprvrc.cfr_renamed_9("\u001bx\b\u000b\u0019Y ](_,\u000b\u0002N0\u000b\u0012")).append(sprgij.cfr_renamed_9395(this.getModulus())).append(sprpdp.cfr_renamed_9("[c]\u0012")).append(string);
        stringBuffer2.append(sprvrc.cfr_renamed_9("i\u000bi\u000bi\u000bi\u000bi\u000bi\u000b$D-^%^:\u0011i")).append(this.getModulus().toString(16)).append(string);
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprcoj(sprddm sprddm2, sprkik sprkik2) {
        void arg0;
        void arg1;
        sprcoj sprcoj2 = this;
        void v1 = arg1;
        sprcoj sprcoj3 = this;
        this.cfr_renamed_3 = sprcoj.cfr_renamed_9405(sprbjj.cfr_renamed_2);
        this.cfr_renamed_91 = sprbjj.cfr_renamed_2;
        sprcoj sprcoj4 = this;
        this.cfr_renamed_112 = new sprtlj();
        sprcoj3.cfr_renamed_91 = arg0;
        sprcoj3.cfr_renamed_3 = sprcoj.cfr_renamed_9405((sprddm)arg0);
        this.cfr_renamed_4 = v1.cfr_renamed_2295();
        sprcoj2.cfr_renamed_0 = v1.cfr_renamed_360();
        sprcoj2.cfr_renamed_1 = sprkik2;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_112.cfr_renamed_2158();
    }

    /*
     * WARNING - void declaration
     */
    public sprcoj(RSAPrivateKey rSAPrivateKey) {
        void arg0;
        sprcoj sprcoj2 = this;
        this.cfr_renamed_3 = sprcoj.cfr_renamed_9405(sprbjj.cfr_renamed_2);
        this.cfr_renamed_91 = sprbjj.cfr_renamed_2;
        sprcoj sprcoj3 = this;
        this.cfr_renamed_112 = new sprtlj();
        sprcoj2.cfr_renamed_4 = arg0.getModulus();
        sprcoj2.cfr_renamed_0 = rSAPrivateKey.getPrivateExponent();
        sprcoj sprcoj4 = this;
        sprcoj2.cfr_renamed_1 = new sprkik(true, sprcoj4.cfr_renamed_4, sprcoj4.cfr_renamed_0);
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_112.cfr_renamed_9064(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprcoj(sprkik sprkik2) {
        void arg0;
        sprcoj sprcoj2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = sprcoj.cfr_renamed_9405(sprbjj.cfr_renamed_2);
        this.cfr_renamed_91 = sprbjj.cfr_renamed_2;
        sprcoj sprcoj3 = this;
        this.cfr_renamed_112 = new sprtlj();
        this.cfr_renamed_4 = v1.cfr_renamed_2295();
        sprcoj2.cfr_renamed_0 = v1.cfr_renamed_360();
        sprcoj2.cfr_renamed_1 = sprkik2;
    }

    public sprkik cfr_renamed_9389() {
        return this.cfr_renamed_1;
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_4;
    }
}

