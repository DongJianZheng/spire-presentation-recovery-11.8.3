/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdhea;
import com.spire.presentation.packages.sprhfp;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import java.security.spec.EncodedKeySpec;

public class sprkzh
extends EncodedKeySpec {
    private final String cfr_renamed_3;
    private static final String[] cfr_renamed_4;

    public String cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    static {
        String[] stringArray = new String[3];
        stringArray[0] = "ssh-rsa";
        stringArray[1] = "ssh-ed25519";
        stringArray[2] = "ssh-dss";
        cfr_renamed_4 = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprkzh(byte[] byArray) {
        int n;
        void arg0;
        void v0 = arg0;
        super((byte[])v0);
        int n2 = 0;
        int n3 = (v0[0] & 0xFF) << 24;
        int n4 = arg0[++n2] & 0xFF;
        n3 |= n4 << 16;
        int n5 = arg0[++n2] & 0xFF;
        n3 |= n5 << 8;
        if (++n2 + (n3 |= arg0[++n2] & 0xFF) >= ((void)arg0).length) {
            throw new IllegalArgumentException(sprhfp.cfr_renamed_9(",Z3U)]!\u00145A'X,We_ MeV)['\u000ee@<D \u0014#] X!\u0014)[+S Fe@-U+\u0014'X*V"));
        }
        int n6 = n2;
        this.cfr_renamed_3 = sprkoe.cfr_renamed_184(sproze.cfr_renamed_533((byte[])arg0, n6, n6 + n3));
        if (this.cfr_renamed_3.startsWith("ecdsa")) {
            return;
        }
        int n7 = n = 0;
        while (n7 < cfr_renamed_4.length) {
            if (cfr_renamed_4[n].equals(this.cfr_renamed_3)) {
                return;
            }
            n7 = ++n;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdhea.cfr_renamed_9("E\u0012B\u0019S\u0013W\u0012Y\u000fU\u0018\u0010\fE\u001e\\\u0015S\\[\u0019I\\D\u0005@\u0019\u0010")).append(this.cfr_renamed_3).toString());
    }

    @Override
    public String getFormat() {
        return "OpenSSH";
    }
}

