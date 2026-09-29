/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafg;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprnye;
import com.spire.presentation.packages.sprspg;
import com.spire.presentation.packages.sprtrda;
import com.spire.presentation.packages.sprxbf;
import com.spire.presentation.packages.spryxe;
import com.spire.presentation.packages.sprzeo;
import java.security.PublicKey;

public class sprglf
implements sprbj,
PublicKey {
    private sprnye cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprnye cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public byte[] cfr_renamed_1252() {
        return this.cfr_renamed_2;
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, sprzeo.cfr_renamed_9("O'[9(\u001a}\bd\u0003kJc\u000fqJ2J")).append(new String(sprfqe.cfr_renamed_485(this.cfr_renamed_2))).append("\n").append(sprtrda.cfr_renamed_9("\u0006?'=&.n5(z\u001a(+?=`nP")).toString();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.cfr_renamed_1249().length) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(sprzeo.cfr_renamed_9("D\u000bq\u000fzJ")).append(n).append(sprtrda.cfr_renamed_9("ztz")).append(this.cfr_renamed_1.cfr_renamed_1249()[n]).append(sprzeo.cfr_renamed_9("(=a\u0004|\u000fz\u0004a\u001er:i\u0018i\u0007m\u001em\u00182J")).append(this.cfr_renamed_1.cfr_renamed_1250()[n]).append(sprtrda.cfr_renamed_9("n\u0011tz")).append(this.cfr_renamed_1.cfr_renamed_1150()[n]);
            string = stringBuilder.append("\n").toString();
            n2 = ++n;
        }
        return string;
    }

    public sprnye cfr_renamed_1251() {
        return this.cfr_renamed_1;
    }

    @Override
    public String getAlgorithm() {
        return sprzeo.cfr_renamed_9("O'[9");
    }

    /*
     * WARNING - void declaration
     */
    public sprglf(byte[] byArray, sprnye sprnye2) {
        void arg1;
        sprglf sprglf2 = this;
        sprglf2.cfr_renamed_1 = arg1;
        sprglf2.cfr_renamed_2 = byArray;
    }

    public sprglf(spryxe arg0) {
        this(arg0.cfr_renamed_1157(), arg0.cfr_renamed_284());
    }

    @Override
    public byte[] getEncoded() {
        return sprxbf.cfr_renamed_5679(new sprddm(sprbn.cfr_renamed_954, new sprspg(this.cfr_renamed_1.cfr_renamed_1140(), this.cfr_renamed_1.cfr_renamed_1249(), this.cfr_renamed_1.cfr_renamed_1250(), this.cfr_renamed_1.cfr_renamed_1150()).cfr_renamed_119()), new sprafg(this.cfr_renamed_2));
    }

    @Override
    public String getFormat() {
        return sprtrda.cfr_renamed_9("\u0002`o~c");
    }
}

