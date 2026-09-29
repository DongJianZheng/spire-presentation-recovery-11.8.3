/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprqxz;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class sprpvj
extends AlgorithmParametersSpi {
    public DSAParameterSpec cfr_renamed_4;

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof DSAParameterSpec)) {
            throw new InvalidParameterSpecException(sprqxz.cfr_renamed_9("\u000b\u0019\u000e\u001a.8.'*>*8\u001c:*)o8*;:#=/+j;%o#!#;#.&&9*j.j\u000b\u0019\u000ej.&(%=#;\"\"j?+=+\"/;/=9o%- *);"));
        }
        this.cfr_renamed_4 = (DSAParameterSpec)arg0;
    }

    @Override
    public String engineToString() {
        return sprhsh.cfr_renamed_9("\u0005\u0000\u0000s\u0011232,6563 ");
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0)) {
            return this.engineGetEncoded();
        }
        return null;
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprqxz.cfr_renamed_9(".8(?\"/!>o> j(/;\u001a.8.'*>*8\u001c:*)o':9;j!%;j-/o$:&#"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprhsh.cfr_renamed_9("\u000bofqj"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprqxz.cfr_renamed_9("\u001a$$$ =!j?+=+\"/;/=j)%='.>o")).append(arg1).toString());
    }

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == DSAParameterSpec.class || arg0 == AlgorithmParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(sprhsh.cfr_renamed_9("&/8/<6=a# ! >$'$!a 16\"s122 $7a'.s\u0005\u0000\u0000s1232,6563 a<#9$05}"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        sprxem sprxem2 = new sprxem(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getQ(), this.cfr_renamed_4.getG());
        try {
            return sprxem2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprqxz.cfr_renamed_9("\u000f=8 8o/!) .&$(j\u000b\u0019\u000e\u001a.8.'*>*8<"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprxem sprxem2 = sprxem.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
            sprpvj sprpvj2 = this;
            sprpvj2.cfr_renamed_4 = new DSAParameterSpec(sprxem2.cfr_renamed_1155(), sprxem2.cfr_renamed_1604(), sprxem2.cfr_renamed_1145());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprhsh.cfr_renamed_9("\u001d.'a2a% ?(7a\u0017\u0012\u0012a\u0003 ! >$'$!a6/0.7(=&}"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprqxz.cfr_renamed_9("\u0001%;j.j9+##+j\u000b\u0019\u000ej\u001f+=+\"/;/=j*$,%+#!-a"));
        }
    }
}

