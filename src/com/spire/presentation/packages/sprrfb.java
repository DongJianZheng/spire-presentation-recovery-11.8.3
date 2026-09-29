/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravz;
import com.spire.presentation.packages.sprbbb;
import com.spire.presentation.packages.sprbhb;
import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprda;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriza;
import com.spire.presentation.packages.sprleb;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprsbb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spryxa;
import java.security.PublicKey;

public class sprrfb
implements sprt,
PublicKey {
    private static final long cfr_renamed_1 = 1L;
    private sprbhb cfr_renamed_2;
    private sprbhb cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public String getAlgorithm() {
        return sprbnja.cfr_renamed_9("s\u0000g\u001e");
    }

    @Override
    public byte[] getEncoded() {
        return sprleb.cfr_renamed_1187(new sprije(sprda.cfr_renamed_102, new spriza(this.cfr_renamed_3.cfr_renamed_1140(), this.cfr_renamed_3.cfr_renamed_1249(), this.cfr_renamed_3.cfr_renamed_1250(), this.cfr_renamed_3.cfr_renamed_1150()).cfr_renamed_119()), new sprsbb(this.cfr_renamed_4));
    }

    public sprbhb cfr_renamed_1251() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1252() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, spravz.cfr_renamed_9("2\u0013&\rU.\u0000<\u00197\u0016~\u001e;\f~O~")).append(new String(sprmma.cfr_renamed_485(this.cfr_renamed_4))).append("\n").append(sprbnja.cfr_renamed_9("|(]*\\9\u0014\"Rm`?Q(Gw\u0014G")).toString();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.cfr_renamed_1249().length) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(spravz.cfr_renamed_9("9?\f;\u0007~")).append(n).append(sprbnja.cfr_renamed_9("m\u000em")).append(this.cfr_renamed_3.cfr_renamed_1249()[n]).append(spravz.cfr_renamed_9("U\t\u001c0\u0001;\u00070\u001c*\u000f\u000e\u0014,\u00143\u0010*\u0010,O~")).append(this.cfr_renamed_3.cfr_renamed_1250()[n]).append(sprbnja.cfr_renamed_9("\u0014\u0006\u000em")).append(this.cfr_renamed_3.cfr_renamed_1150()[n]);
            string = stringBuilder.append("\n").toString();
            n2 = ++n;
        }
        return string;
    }

    public sprrfb(sprbbb arg0) {
        this(arg0.cfr_renamed_1157(), arg0.cfr_renamed_284());
    }

    /*
     * WARNING - void declaration
     */
    public sprrfb(byte[] byArray, sprbhb sprbhb2) {
        void arg1;
        sprrfb sprrfb2 = this;
        sprrfb2.cfr_renamed_3 = arg1;
        sprrfb2.cfr_renamed_4 = byArray;
    }

    @Override
    public String getFormat() {
        return spravz.cfr_renamed_9("\u0006[kEg");
    }

    public sprrfb(spryxa arg0) {
        this(arg0.cfr_renamed_1157(), arg0.cfr_renamed_284());
    }
}

