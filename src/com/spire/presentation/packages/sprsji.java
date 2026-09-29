/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvz;
import com.spire.presentation.packages.sprdrda;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpfi;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

public class sprsji
extends sprpfi {
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
                sproug sproug2 = (sproug)sprxgf.cfr_renamed_184(arg0);
                this.engineInit(sproug2.cfr_renamed_186());
                return;
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, sprdrda.cfr_renamed_9(",k\nv\u0019g\u0000|\u00073\rv\n|\rz\u0007tS3")).append(exception).toString());
            }
        }
        if (arg1.equals(sprcvz.cfr_renamed_9("\u0017C\u0012"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(sprdrda.cfr_renamed_9("F\u0007x\u0007|\u001e}Ic\ba\b~\fg\fa\u001a3\u000f|\u001b~\bgIz\u00073 EIc\ba\b~\fg\fa\u001a3\u0006q\u0003v\ng"));
    }

    @Override
    public byte[] engineGetEncoded(String arg0) throws IOException {
        if (this.cfr_renamed_2396(arg0)) {
            return new sprfvg(this.engineGetEncoded(sprcvz.cfr_renamed_9("\u0017C\u0012"))).cfr_renamed_91();
        }
        if (arg0.equals(sprdrda.cfr_renamed_9("A(D"))) {
            return sproze.cfr_renamed_158(this.cfr_renamed_4);
        }
        return null;
    }

    @Override
    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == IvParameterSpec.class || arg0 == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.cfr_renamed_4);
        }
        throw new InvalidParameterSpecException(sprcvz.cfr_renamed_9("w+i+m2ler$p$o v peq5g&\"5c6q fev*\"\fTer$p$o v p6\"*`/g&vk"));
    }

    @Override
    public void engineInit(byte[] arg0) throws IOException {
        if (arg0.length % 8 != 0 && arg0[0] == 4 && arg0[1] == arg0.length - 2) {
            arg0 = ((sproug)sprxgf.cfr_renamed_184(arg0)).cfr_renamed_186();
        }
        this.cfr_renamed_4 = sproze.cfr_renamed_158(arg0);
    }

    @Override
    public String engineToString() {
        return sprdrda.cfr_renamed_9("Z?39r\u001br\u0004v\u001dv\u001b`");
    }

    @Override
    public byte[] engineGetEncoded() throws IOException {
        return this.engineGetEncoded("ASN.1");
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException(sprcvz.cfr_renamed_9("K3R$p$o v p\u0016r aep s0k7g!\"1mek+k1k$n,q \"$\"\fTer$p$o v p6\"$n\"m7k1j(\"5c7c(g1g7qem'h a1"));
        }
        this.cfr_renamed_4 = ((IvParameterSpec)arg0).getIV();
    }
}

