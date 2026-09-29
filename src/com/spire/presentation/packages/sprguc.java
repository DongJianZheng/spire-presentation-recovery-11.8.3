/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafja;
import com.spire.presentation.packages.spreyc;
import com.spire.presentation.packages.sprmbe;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

public class sprguc
extends AlgorithmParametersSpi {
    public DHParameterSpec cfr_renamed_4;

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == DHParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(spreyc.cfr_renamed_9("HmVmRtS#MbObPfIfO#NsX`\u001ds\\pNfY#Il\u001dGu#MbObPfIfOp\u001dl_iX`I-"));
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0)) {
            return this.engineGetEncoded();
        }
        return null;
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprafja.cfr_renamed_9("\u001d\u0012\u001b\u0015\u0011\u0005\u0012\u0014\\\u0014\u0013@\u001b\u0005\b0\u001d\u0012\u001d\r\u0019\u0014\u0019\u0012/\u0010\u0019\u0003\\\r\t\u0013\b@\u0012\u000f\b@\u001e\u0005\\\u000e\t\f\u0010"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        sprmbe sprmbe2 = new sprmbe(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getG(), this.cfr_renamed_4.getL());
        try {
            return sprmbe2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(spreyc.cfr_renamed_9("FOqRq\u001dfS`RgTmZ#yKmbObPfIfOp"));
        }
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1)) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprafja.cfr_renamed_9(")\u000e\u0017\u000e\u0013\u0017\u0012@\f\u0001\u000e\u0001\u0011\u0005\b\u0005\u000e@\u001a\u000f\u000e\r\u001d\u0014\\")).append(arg1).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(arg0);
            if (sprmbe2.cfr_renamed_2331() != null) {
                sprguc sprguc2 = this;
                sprguc2.cfr_renamed_4 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), sprmbe2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_4 = new DHParameterSpec(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(spreyc.cfr_renamed_9("slI#\\#KbQjY#yK\u001dS\\q\\nXwXq\u001dfS`RgTmZ-"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprafja.cfr_renamed_9(".\u0013\u0014\\\u0001\\\u0016\u001d\f\u0015\u0004\\$4@,\u0001\u000e\u0001\u0011\u0005\b\u0005\u000e@\u0019\u000e\u001f\u000f\u0018\t\u0012\u0007R"));
        }
    }

    @Override
    public String engineToString() {
        return spreyc.cfr_renamed_9("GTe[jX.ufQoPbS#mbObPfIfOp");
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException(sprafja.cfr_renamed_9("8(,\u0001\u000e\u0001\u0011\u0005\b\u0005\u000e3\f\u0005\u001f@\u000e\u0005\r\u0015\u0015\u0012\u0019\u0004\\\u0014\u0013@\u0015\u000e\u0015\u0014\u0015\u0001\u0010\t\u000f\u0005\\\u0001\\$\u0015\u0006\u001a\t\u0019M4\u0005\u0010\f\u0011\u0001\u0012@\u001d\f\u001b\u000f\u000e\t\b\b\u0011@\f\u0001\u000e\u0001\u0011\u0005\b\u0005\u000e\u0013\\\u000f\u001e\n\u0019\u0003\b"));
        }
        this.cfr_renamed_4 = (DHParameterSpec)arg0;
    }
}

