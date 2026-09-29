/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraob;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprqzz;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprysb;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

public class sprjoc
extends sprysb {
    public spraob cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        sprmfe sprmfe2 = new sprmfe(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145());
        try {
            return sprmfe2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprtkc.cfr_renamed_9("\u001eI)T)\u001b>U8T?R5\\{~7|:V:W\u000bZ)Z6^/^)H"));
        }
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0) || arg0.equalsIgnoreCase(sprqzz.cfr_renamed_9("7wZiV"))) {
            return this.engineGetEncoded();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
            sprjoc sprjoc2 = this;
            sprjoc2.cfr_renamed_4 = new spraob(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprtkc.cfr_renamed_9("u4O{Z{M:W2_{~7|:V:W{k:I:V>O>I{^5X4_2U<\u0015"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprqzz.cfr_renamed_9("!6\u001by\u000ey\u00198\u00030\u000by*5(8\u00028\u0003y?8\u001d8\u0002<\u001b<\u001dy\n7\f6\u000b0\u0001>A"));
        }
    }

    @Override
    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == spraob.class) {
            return this.cfr_renamed_4;
        }
        if (arg0 == DHParameterSpec.class) {
            return new DHParameterSpec(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145());
        }
        throw new InvalidParameterSpecException(sprtkc.cfr_renamed_9("N5P5T,U{K:I:V>O>I{H+^8\u001b+Z(H>_{O4\u001b\u001eW\u001cZ6Z7\u001b+Z)Z6^/^)H{T9Q>X/\u0015"));
    }

    @Override
    public String engineToString() {
        return sprqzz.cfr_renamed_9("\u001c\u0003\u001e\u000e4\u000e5O\t\u000e+\u000e4\n-\n+\u001c");
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprtkc.cfr_renamed_9("cu\u000ek\u0002"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprqzz.cfr_renamed_9(":7\u00047\u0000.\u0001y\u001f8\u001d8\u0002<\u001b<\u001dy\t6\u001d4\u000e-O")).append(arg1).toString());
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof spraob) && !(arg0 instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException(sprtkc.cfr_renamed_9("\u001fs\u000bZ)Z6^/^)h+^8\u001b)^*N2I>_{O4\u001b2U2O2Z7R(^{Z{~7|:V:W{Z7\\4I2O3V{K:I:V>O>I(\u001b4Y1^8O"));
        }
        if (arg0 instanceof spraob) {
            this.cfr_renamed_4 = (spraob)arg0;
            return;
        }
        DHParameterSpec dHParameterSpec = (DHParameterSpec)arg0;
        sprjoc sprjoc2 = this;
        sprjoc2.cfr_renamed_4 = new spraob(dHParameterSpec.getP(), dHParameterSpec.getG());
    }
}

