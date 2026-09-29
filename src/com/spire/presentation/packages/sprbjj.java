/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvm;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxwy;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

public class sprbjj
implements RSAPublicKey {
    private BigInteger cfr_renamed_91;
    private transient sprddm cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    public static final sprddm cfr_renamed_2 = new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4);
    private transient sprkik cfr_renamed_3;
    public static final long cfr_renamed_4 = 2675817738516720772L;

    /*
     * WARNING - void declaration
     */
    public sprbjj(RSAPublicKey rSAPublicKey) {
        void arg0;
        sprbjj sprbjj2 = this;
        this.cfr_renamed_0 = cfr_renamed_2;
        sprbjj2.cfr_renamed_1 = arg0.getModulus();
        sprbjj2.cfr_renamed_91 = rSAPublicKey.getPublicExponent();
        sprbjj sprbjj3 = this;
        sprbjj sprbjj4 = this;
        sprbjj2.cfr_renamed_3 = new sprkik(false, sprbjj4.cfr_renamed_1, sprbjj4.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (!this.cfr_renamed_0.equals(cfr_renamed_2)) {
            arg0.writeObject(this.cfr_renamed_0.cfr_renamed_91());
        }
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey)arg0;
        return this.getModulus().equals(rSAPublicKey.getModulus()) && this.getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(sprxwy.cfr_renamed_9("d\u0019wjf?T&_)\u0016\u0001S3\u0016\u0011")).append(sprgij.cfr_renamed_9395(this.getModulus())).append("]").append(sprlfk.cfr_renamed_9("\u000f\u0007")).append(sprgij.cfr_renamed_9396(this.getPublicExponent())).append("]").append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprxwy.cfr_renamed_9("j\u0016j\u0016j\u0016j\u0016'Y.C&C9\fj")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(sprlfk.cfr_renamed_9(",V>O5@|F$S3M9M(\u0019|")).append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9404(sprvhm arg0) {
        try {
            sprfvm sprfvm2 = sprfvm.cfr_renamed_23(arg0.cfr_renamed_1227());
            sprbjj sprbjj2 = this;
            this.cfr_renamed_0 = arg0.cfr_renamed_593();
            sprbjj2.cfr_renamed_1 = sprfvm2.cfr_renamed_2295();
            sprbjj2.cfr_renamed_91 = sprfvm2.cfr_renamed_2296();
            sprbjj sprbjj3 = this;
            sprbjj sprbjj4 = this;
            sprbjj2.cfr_renamed_3 = new sprkik(false, sprbjj4.cfr_renamed_1, sprbjj4.cfr_renamed_91);
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprxwy.cfr_renamed_9("_$@+Z#Rj_$P%\u00169B8C)B?D/\u0016#Xjd\u0019wjF?T&_)\u0016!S3"));
        }
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_1;
    }

    @Override
    public String getFormat() {
        return sprlfk.cfr_renamed_9("\u0004\ri\u0013e");
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprbjj(RSAPublicKeySpec rSAPublicKeySpec) {
        void arg0;
        sprbjj sprbjj2 = this;
        this.cfr_renamed_0 = cfr_renamed_2;
        sprbjj2.cfr_renamed_1 = arg0.getModulus();
        sprbjj2.cfr_renamed_91 = rSAPublicKeySpec.getPublicExponent();
        sprbjj sprbjj3 = this;
        sprbjj sprbjj4 = this;
        sprbjj2.cfr_renamed_3 = new sprkik(false, sprbjj4.cfr_renamed_1, sprbjj4.cfr_renamed_91);
    }

    public sprkik cfr_renamed_9389() {
        return this.cfr_renamed_3;
    }

    @Override
    public String getAlgorithm() {
        if (this.cfr_renamed_0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
            return sprxwy.cfr_renamed_9("d\u0019w\u0019e\u000b\u001b\u001ae\u0019");
        }
        return "RSA";
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprbjj(sprddm sprddm2, sprkik sprkik2) {
        void arg0;
        void arg1;
        sprbjj sprbjj2 = this;
        void v1 = arg1;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_1 = v1.cfr_renamed_2295();
        sprbjj2.cfr_renamed_91 = v1.cfr_renamed_360();
        sprbjj2.cfr_renamed_3 = sprkik2;
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5679(this.cfr_renamed_0, new sprfvm(this.getModulus(), this.getPublicExponent()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        sprbjj sprbjj2;
        arg0.defaultReadObject();
        try {
            this.cfr_renamed_0 = sprddm.cfr_renamed_23(arg0.readObject());
            sprbjj2 = this;
        }
        catch (Exception exception) {
            sprbjj2 = this;
            this.cfr_renamed_0 = cfr_renamed_2;
        }
        sprbjj sprbjj3 = this;
        sprbjj2.cfr_renamed_3 = new sprkik(false, sprbjj3.cfr_renamed_1, sprbjj3.cfr_renamed_91);
    }

    public sprbjj(sprkik arg0) {
        this(cfr_renamed_2, arg0);
    }

    public sprbjj(sprvhm sprvhm2) {
        sprbjj sprbjj2 = this;
        sprbjj2.cfr_renamed_9404(sprvhm2);
    }
}

