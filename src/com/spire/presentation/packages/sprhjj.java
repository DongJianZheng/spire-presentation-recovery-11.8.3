/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbio;
import com.spire.presentation.packages.sprlvh;
import com.spire.presentation.packages.sprpfi;
import com.spire.presentation.packages.sprppm;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

public class sprhjj
extends sprpfi {
    public sprlvh cfr_renamed_4;

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprudz.cfr_renamed_9("U\t8\u00174"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprbio.cfr_renamed_9("5l\u000bl\u000fu\u000e\"\u0010c\u0012c\rg\u0014g\u0012\"\u0006m\u0012o\u0001v@")).append(arg1).toString());
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0) || arg0.equalsIgnoreCase(sprudz.cfr_renamed_9("U\t8\u00174"))) {
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
        sprppm sprppm2 = new sprppm(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145());
        try {
            return sprppm2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprbio.cfr_renamed_9("G\u0012p\u000fp@g\u000ea\u000ff\tl\u0007\"%n'c\rc\fR\u0001p\u0001o\u0005v\u0005p\u0013"));
        }
    }

    @Override
    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == sprlvh.class || arg0 == AlgorithmParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        if (arg0 == DHParameterSpec.class) {
            return new DHParameterSpec(this.cfr_renamed_4.cfr_renamed_1155(), this.cfr_renamed_4.cfr_renamed_1145());
        }
        throw new InvalidParameterSpecException(sprudz.cfr_renamed_9("xIfIbPc\u0007}F\u007fF`ByB\u007f\u0007~WhD-WlT~Bi\u0007yH-ba`lJlK-WlUlJhShU~\u0007bEgBnS#"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprppm sprppm2 = sprppm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
            sprhjj sprhjj2 = this;
            sprhjj2.cfr_renamed_4 = new sprlvh(sprppm2.cfr_renamed_1155(), sprppm2.cfr_renamed_1145());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprbio.cfr_renamed_9(".m\u0014\"\u0001\"\u0016c\fk\u0004\"%n'c\rc\f\"0c\u0012c\rg\u0014g\u0012\"\u0005l\u0003m\u0004k\u000eeN"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprudz.cfr_renamed_9("CHy\u0007l\u0007{FaNi\u0007HKJF`Fa\u0007]F\u007fF`ByB\u007f\u0007hInHiNc@#"));
        }
    }

    @Override
    public String engineToString() {
        return sprbio.cfr_renamed_9("G\fE\u0001o\u0001n@R\u0001p\u0001o\u0005v\u0005p\u0013");
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof sprlvh) && !(arg0 instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException(sprudz.cfr_renamed_9("cEwlUlJhShU^WhD-UhVxN\u007fBi\u0007yH-NcNyNlKdTh\u0007l\u0007HKJF`Fa\u0007lKjH\u007fNyO`\u0007}F\u007fF`ByB\u007fT-HoMhDy"));
        }
        if (arg0 instanceof sprlvh) {
            this.cfr_renamed_4 = (sprlvh)arg0;
            return;
        }
        DHParameterSpec dHParameterSpec = (DHParameterSpec)arg0;
        sprhjj sprhjj2 = this;
        sprhjj2.cfr_renamed_4 = new sprlvh(dHParameterSpec.getP(), dHParameterSpec.getG());
    }
}

