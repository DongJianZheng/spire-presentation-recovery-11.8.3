/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprvws;
import com.spire.presentation.packages.sprwtba;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprysb;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

public class sprzpb
extends sprysb {
    private byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1)) {
            try {
                sprxue sprxue2 = (sprxue)sprvva.cfr_renamed_184(arg0);
                this.engineInit(sprxue2.cfr_renamed_186());
                return;
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, sprvws.cfr_renamed_9("G\u0002a\u001fr\u000ek\u0015lZf\u001fa\u0015f\u0013l\u001d8Z")).append(exception).toString());
            }
        }
        if (arg1.equals(sprwtba.cfr_renamed_9("\ry\b"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(sprvws.cfr_renamed_9("/l\u0011l\u0015u\u0014\"\nc\bc\u0017g\u000eg\bqZd\u0015p\u0017c\u000e\"\u0013lZK,\"\nc\bc\u0017g\u000eg\bqZm\u0018h\u001fa\u000e"));
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException(sprwtba.cfr_renamed_9("q)h>J>U:L:J\fH:[\u007fJ:I*Q-];\u0018+W\u007fQ1Q+Q>T6K:\u0018>\u0018\u0016n\u007fH>J>U:L:J,\u0018>T8W-Q+P2\u0018/Y-Y2]+]-K\u007fW=R:[+"));
        }
        this.cfr_renamed_4 = ((IvParameterSpec)arg0).getIV();
    }

    @Override
    public String engineToString() {
        return sprvws.cfr_renamed_9("3TZR\u001bp\u001bo\u001fv\u001fp\t");
    }

    @Override
    public byte[] engineGetEncoded(String arg0) throws IOException {
        if (this.cfr_renamed_2396(arg0)) {
            return new sprlqe(this.engineGetEncoded(sprwtba.cfr_renamed_9("\ry\b"))).cfr_renamed_91();
        }
        if (arg0.equals(sprvws.cfr_renamed_9("(C-"))) {
            return sprzra.cfr_renamed_158(this.cfr_renamed_4);
        }
        return null;
    }

    @Override
    public void engineInit(byte[] arg0) throws IOException {
        if (arg0.length % 8 != 0 && arg0[0] == 4 && arg0[1] == arg0.length - 2) {
            arg0 = ((sprxue)sprvva.cfr_renamed_184(arg0)).cfr_renamed_186();
        }
        this.cfr_renamed_4 = sprzra.cfr_renamed_158(arg0);
    }

    @Override
    public byte[] engineGetEncoded() throws IOException {
        return this.engineGetEncoded("ASN.1");
    }

    @Override
    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == IvParameterSpec.class) {
            return new IvParameterSpec(this.cfr_renamed_4);
        }
        throw new InvalidParameterSpecException(sprwtba.cfr_renamed_9("M1S1W(V\u007fH>J>U:L:J\u007fK/]<\u0018/Y,K:\\\u007fL0\u0018\u0016n\u007fH>J>U:L:J,\u00180Z5]<Lq"));
    }
}

