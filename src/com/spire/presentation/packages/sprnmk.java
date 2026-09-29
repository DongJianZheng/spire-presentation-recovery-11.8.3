/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbx;
import com.spire.presentation.packages.spres;
import com.spire.presentation.packages.sprhp;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprvwz;
import com.spire.presentation.packages.spryok;
import com.spire.presentation.packages.spryz;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class sprnmk
implements sprbx {
    private final Long cfr_renamed_119;
    private final spres cfr_renamed_91;
    private final Set<String> cfr_renamed_0;
    private final SSLSocketFactory cfr_renamed_1;
    private final spryz cfr_renamed_2;
    private final int cfr_renamed_3;
    private final boolean cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    @Override
    public sprhp cfr_renamed_9730(String arg0, int arg1) throws IOException {
        var3_3 = (SSLSocket)this.cfr_renamed_1.createSocket(arg0, arg1);
        v0 = this;
        var3_3.setSoTimeout(v0.cfr_renamed_3);
        if (v0.cfr_renamed_0 == null || this.cfr_renamed_0.isEmpty()) ** GOTO lbl32
        if (this.cfr_renamed_4) {
            var4_4 = new HashSet<E>();
            var5_6 = var3_3.getSupportedCipherSuites();
            v1 = var6_7 = 0;
            while (v1 != var5_6.length) {
                var4_4.add(var5_6[var6_7++]);
                v1 = var6_7;
            }
            var6_8 = new ArrayList<String>();
            for (String var8_10 : this.cfr_renamed_0) {
                if (!var4_4.contains(var8_10)) continue;
                var6_8.add(var8_10);
            }
            if (var6_8.isEmpty()) {
                throw new IllegalStateException(sprvwz.cfr_renamed_9("}f\u0013zFyCeZlW)P`CaV{\u0013zF`Gl\u0013`@)@|Cy\\{GlW)Qp\u0013}[l\u0013yAfE`WlA'"));
            }
            v2 = var6_8;
            var3_3.setEnabledCipherSuites(v2.toArray(new String[v2.size()]));
            v3 = var3_3;
        } else {
            v4 = this;
            var3_3.setEnabledCipherSuites(v4.cfr_renamed_0.toArray(new String[v4.cfr_renamed_0.size()]));
lbl32:
            // 2 sources

            v3 = var3_3;
        }
        v3.startHandshake();
        if (this.cfr_renamed_2 != null && !this.cfr_renamed_2.cfr_renamed_9713(arg0, var3_3.getSession())) {
            throw new IOException(sprtaz.cfr_renamed_9("BUyN*TkWo\u001aiU\u007fVn\u001adU~\u001ah_*LoHc\\c_n\u0014"));
        }
        var4_4 = sprkoe.cfr_renamed_425(var3_3.getSession().getCipherSuite());
        if (var4_4.contains(sprvwz.cfr_renamed_9("VWl@V")) || var4_4.contains(sprtaz.cfr_renamed_9("en_y\u000e:e")) || var4_4.contains(sprvwz.cfr_renamed_9("l:Wl@V"))) {
            throw new IOException(sprtaz.cfr_renamed_9("Oi^\u001aiVc_dNy\u001agOyN*TeN*Oy_*~Oi*YcJb_xI"));
        }
        if (sprkoe.cfr_renamed_425(var3_3.getSession().getCipherSuite()).contains("null")) {
            throw new IOException(sprvwz.cfr_renamed_9("L`]\u0013j_`VgGz\u0013dFzG)]fG)FzV)}\\\u007fE\u0013jZy[lAz"));
        }
        if (sprkoe.cfr_renamed_425(var3_3.getSession().getCipherSuite()).contains(sprtaz.cfr_renamed_9("kTeT"))) {
            throw new IOException(sprvwz.cfr_renamed_9("L`]\u0013j_`VgGz\u0013dFzG)]fG)FzV)Rg\\g\u0013jZy[lAz"));
        }
        if (sprkoe.cfr_renamed_425(var3_3.getSession().getCipherSuite()).contains(sprtaz.cfr_renamed_9("oBzUxN"))) {
            throw new IOException(sprvwz.cfr_renamed_9("L`]\u0013j_`VgGz\u0013dFzG)]fG)FzV)VqCfA}\u0013jZy[lAz"));
        }
        if (var3_3.getSession().getProtocol().equalsIgnoreCase(sprtaz.cfr_renamed_9("NfI|\u000b"))) {
            try {
                var3_3.close();
            }
            catch (Exception var4_5) {
                // empty catch block
            }
            throw new IOException(sprvwz.cfr_renamed_9("vZg)PeZl]}@)^|@}\u0013g\\}\u0013|@l\u0013]\u007fZE8"));
        }
        if (this.cfr_renamed_2 != null && !this.cfr_renamed_2.cfr_renamed_9713(arg0, var3_3.getSession())) {
            throw new IOException(new StringBuilder().insert(0, sprtaz.cfr_renamed_9("reI~TkWo\u001a}[y\u001adU~\u001a|_xSlSo^0\u001a")).append(arg0).toString());
        }
        v5 = this;
        return new spryok(var3_3, v5.cfr_renamed_91, v5.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    public sprnmk(SSLSocketFactory sSLSocketFactory, spryz spryz2, int n, spres spres2, Set<String> set, Long l, boolean bl) throws GeneralSecurityException {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprnmk sprnmk2 = this;
        sprnmk sprnmk3 = this;
        sprnmk sprnmk4 = this;
        this.cfr_renamed_1 = arg0;
        sprnmk4.cfr_renamed_2 = arg1;
        sprnmk4.cfr_renamed_3 = arg2;
        sprnmk3.cfr_renamed_91 = arg3;
        sprnmk3.cfr_renamed_0 = arg4;
        sprnmk2.cfr_renamed_119 = arg5;
        sprnmk2.cfr_renamed_4 = bl;
    }
}

