/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdcz;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprfae;
import com.spire.presentation.packages.spridfa;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprume;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

public class sprhjc
implements RSAPublicKey {
    private BigInteger cfr_renamed_0;
    private transient sprije cfr_renamed_1;
    public static final long cfr_renamed_2 = 2675817738516720772L;
    private static final sprije cfr_renamed_3 = new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3);
    private BigInteger cfr_renamed_4;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprdcz.cfr_renamed_9("G\u0018E\u0014\u0005\u0002N\u0001J\u0003J\u0005D\u0003"));
        StringBuffer stringBuffer2 = stringBuffer.append(spridfa.cfr_renamed_9("%D67'b\u0015{\u001etW\\\u0012n")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprdcz.cfr_renamed_9("Q\u000bQ\u000bQ\u000bQ\u000bQ\u000bQ\u000b\u001cD\u0015^\u001d^\u0002\u0011Q")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(spridfa.cfr_renamed_9("7W7Wg\u0002u\u001b~\u00147\u0012o\u0007x\u0019r\u0019cM7")).append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        try {
            this.cfr_renamed_1 = sprije.cfr_renamed_23(arg0.readObject());
            return;
        }
        catch (OptionalDataException optionalDataException) {
            this.cfr_renamed_1 = cfr_renamed_3;
            return;
        }
        catch (EOFException eOFException) {
            this.cfr_renamed_1 = cfr_renamed_3;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhjc(RSAPublicKey rSAPublicKey) {
        void arg0;
        sprhjc sprhjc2 = this;
        this.cfr_renamed_1 = cfr_renamed_3;
        sprhjc2.cfr_renamed_4 = arg0.getModulus();
        sprhjc2.cfr_renamed_0 = rSAPublicKey.getPublicExponent();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2486(sprdce arg0) {
        try {
            sprfae sprfae2 = sprfae.cfr_renamed_23(arg0.cfr_renamed_1227());
            sprhjc sprhjc2 = this;
            this.cfr_renamed_1 = arg0.cfr_renamed_593();
            sprhjc2.cfr_renamed_4 = sprfae2.cfr_renamed_2295();
            sprhjc2.cfr_renamed_0 = sprfae2.cfr_renamed_2296();
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprdcz.cfr_renamed_9("B\u001f]\u0010G\u0018OQB\u001fM\u001e\u000b\u0002_\u0003^\u0012_\u0004Y\u0014\u000b\u0018EQy\"jQ[\u0004I\u001dB\u0012\u000b\u001aN\b"));
        }
    }

    public sprhjc(sprdce sprdce2) {
        sprhjc sprhjc2 = this;
        sprhjc2.cfr_renamed_2486(sprdce2);
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode();
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprhjc(sprmtc sprmtc2) {
        void arg0;
        sprhjc sprhjc2 = this;
        this.cfr_renamed_1 = cfr_renamed_3;
        sprhjc2.cfr_renamed_4 = arg0.cfr_renamed_2295();
        sprhjc2.cfr_renamed_0 = sprmtc2.cfr_renamed_360();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (!this.cfr_renamed_1.equals(cfr_renamed_3)) {
            arg0.writeObject(this.cfr_renamed_1.cfr_renamed_91());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhjc(RSAPublicKeySpec rSAPublicKeySpec) {
        void arg0;
        sprhjc sprhjc2 = this;
        this.cfr_renamed_1 = cfr_renamed_3;
        sprhjc2.cfr_renamed_4 = arg0.getModulus();
        sprhjc2.cfr_renamed_0 = rSAPublicKeySpec.getPublicExponent();
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_0;
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

    @Override
    public String getFormat() {
        return spridfa.cfr_renamed_9("OY\"G.");
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1187(this.cfr_renamed_1, new sprfae(this.getModulus(), this.getPublicExponent()));
    }
}

