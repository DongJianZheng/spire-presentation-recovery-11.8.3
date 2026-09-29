/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprnnb;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruao;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class sprmpc
extends AlgorithmParametersSpi {
    public sprnnb cfr_renamed_4;

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof sprnnb)) {
            throw new InvalidParameterSpecException(sprrbaa.cfr_renamed_9("s\u001ag\u0001\u0007a\u0005ed4F4Y0@0F\u0006D0WuF0E ]'Q1\u0014![u];]!]4X<G0\u00144\u0014\u0012{\u0006`f\u0000d\u0004uU9S:F<@=YuD4F4Y0@0F&\u0014:V?Q6@"));
        }
        this.cfr_renamed_4 = (sprnnb)arg0;
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(spruao.cfr_renamed_9("TdRcXs[b\u0015bZ6RsAFTdT{PbPdffPu\u0015{@eA6[yA6Ws\u0015x@zY"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprbne sprbne2 = (sprbne)sprvva.cfr_renamed_184(arg0);
            sprmpc sprmpc2 = this;
            sprmpc2.cfr_renamed_4 = sprnnb.cfr_renamed_2104(new sprsme(sprbne2));
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprrbaa.cfr_renamed_9("\u001b[!\u00144\u0014#U9]1\u0014\u0012{\u0006`f\u0000d\u0004ud4F4Y0@0FuQ;W:P<Z2\u001a"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(spruao.cfr_renamed_9("XZb\u0015w\u0015`Tz\\r\u0015QzEa%\u0001'\u00056ewGwXsAsG6PxVyQ\u007f[q\u001b"));
        }
    }

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == sprrob.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(sprrbaa.cfr_renamed_9(" Z>Z:C;\u0014%U'U8Q!Q'\u0014&D0WuD4G&Q1\u0014![us\u001ag\u0001\u0007a\u0005e\u0014%U'U8Q!Q'Gu[7^0W!\u001a"));
    }

    @Override
    public String engineToString() {
        return spruao.cfr_renamed_9("rYfB\u0006\"\u0004&\u0015FTdT{PbPdF");
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0) || arg0.equalsIgnoreCase(sprrbaa.cfr_renamed_9("l{\u0001e\r"))) {
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
    public byte[] engineGetEncoded() {
        sprsme sprsme2 = new sprsme(new sprtzd(this.cfr_renamed_4.cfr_renamed_2109()), new sprtzd(this.cfr_renamed_4.cfr_renamed_2108()), new sprtzd(this.cfr_renamed_4.cfr_renamed_2101()));
        try {
            return sprsme2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(spruao.cfr_renamed_9("pdGyG6PxVyQ\u007f[q\u0015QzEa%\u0001'\u0005FTdT{PbPdF"));
        }
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprrbaa.cfr_renamed_9("l{\u0001e\r"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, spruao.cfr_renamed_9("`x^xZa[6EwGwXsAsG6SyG{Tb\u0015")).append(arg1).toString());
    }
}

