/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradda;
import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbsf;
import com.spire.presentation.packages.spremf;
import com.spire.presentation.packages.spreqf;
import com.spire.presentation.packages.sprgpf;
import com.spire.presentation.packages.sprgsf;
import com.spire.presentation.packages.sprjig;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.spropf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.spruhm;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprvsf;
import com.spire.presentation.packages.sprwkf;
import com.spire.presentation.packages.spryi;
import com.spire.presentation.packages.spryye;

public class sprrmf
implements spryi {
    private boolean cfr_renamed_119;
    private sprgpf cfr_renamed_91;
    private spropf cfr_renamed_0;
    private spremf cfr_renamed_1;
    private boolean cfr_renamed_2;
    private spraof cfr_renamed_3;
    private sprlpf cfr_renamed_4;

    public long cfr_renamed_5649() {
        return this.cfr_renamed_1.cfr_renamed_5649();
    }

    private /* synthetic */ spreqf cfr_renamed_5765(byte[] arg0, sprrqf arg1) {
        if (arg0.length != this.cfr_renamed_4.cfr_renamed_5732()) {
            throw new IllegalArgumentException(spradda.cfr_renamed_9("\u0005e\fiVc\u0010,\u001bi\u0005\u007f\u0017k\u0013H\u001fk\u0013\u007f\u0002,\u0018i\u0013h\u0005,\u0002cVn\u0013,\u0013}\u0003m\u001a,\u0002cV\u007f\u001fv\u0013,\u0019jVh\u001fk\u0013\u007f\u0002"));
        }
        if (arg1 == null) {
            throw new NullPointerException(spruhm.cfr_renamed_9(".T2h S)a%D3E2Sa\u001d|\u0000/U-L"));
        }
        sprrmf sprrmf2 = this;
        sprrmf2.cfr_renamed_3.cfr_renamed_5766(sprrmf2.cfr_renamed_3.cfr_renamed_5767(this.cfr_renamed_1.cfr_renamed_5768(), arg1), this.cfr_renamed_1.cfr_renamed_5769());
        return sprrmf2.cfr_renamed_3.cfr_renamed_5770(arg0, arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        if (arg0 == null) {
            throw new NullPointerException(spradda.cfr_renamed_9("\u001bi\u0005\u007f\u0017k\u0013,K1Vb\u0003`\u001a"));
        }
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(spradda.cfr_renamed_9("\u0005e\u0011b\u0013~Vb\u0019xVe\u0018e\u0002e\u0017`\u001fv\u0013hVj\u0019~V\u007f\u001fk\u0018m\u0002y\u0004iVk\u0013b\u0013~\u0017x\u001fc\u0018"));
        }
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(spruhm.cfr_renamed_9("2I&N(N&\u0000*E8\u0000/OaL.N&E3\u00004S B-E"));
        }
        spremf spremf2 = this.cfr_renamed_1;
        synchronized (spremf2) {
            byte[] byArray;
            if (this.cfr_renamed_1.cfr_renamed_5649() <= 0L) {
                throw new sprjig(spruhm.cfr_renamed_9("/OaU2A&E2\u0000.FaP3I7A5EaK$YaR$M I/I/G"));
            }
            if (this.cfr_renamed_1.cfr_renamed_5771().cfr_renamed_5772().isEmpty()) {
                throw new IllegalStateException(spradda.cfr_renamed_9("\u0018c\u0002,\u001fb\u001fx\u001fm\u001ae\fi\u0012"));
            }
            try {
                sprrmf sprrmf2 = this;
                int n = sprrmf2.cfr_renamed_1.cfr_renamed_320();
                sprrmf2.cfr_renamed_119 = true;
                byte[] byArray2 = sprrmf2.cfr_renamed_0.cfr_renamed_5773(this.cfr_renamed_1.cfr_renamed_5774(), sprvof.cfr_renamed_5755(n, 32));
                byte[] byArray3 = sproze.cfr_renamed_527(byArray2, this.cfr_renamed_1.cfr_renamed_1411(), sprvof.cfr_renamed_5755(n, this.cfr_renamed_4.cfr_renamed_5732()));
                byte[] byArray4 = sprrmf2.cfr_renamed_0.cfr_renamed_5775(byArray3, arg0);
                sprrqf sprrqf2 = (sprrqf)new sprtsf().cfr_renamed_5776(n).cfr_renamed_1451();
                spreqf spreqf2 = this.cfr_renamed_5765(byArray4, sprrqf2);
                byArray = new sprvsf(this.cfr_renamed_4).cfr_renamed_5777(n).cfr_renamed_5778(byArray2).cfr_renamed_5779(spreqf2).cfr_renamed_5780(this.cfr_renamed_1.cfr_renamed_5771().cfr_renamed_5772()).cfr_renamed_1451().cfr_renamed_954();
                sprrmf sprrmf3 = this;
                sprrmf3.cfr_renamed_1.cfr_renamed_5771().cfr_renamed_1405();
                sprrmf3.cfr_renamed_1.cfr_renamed_5781();
            }
            catch (Throwable throwable) {
                sprrmf sprrmf4 = this;
                sprrmf4.cfr_renamed_1.cfr_renamed_5771().cfr_renamed_1405();
                sprrmf4.cfr_renamed_1.cfr_renamed_5781();
                throw throwable;
            }
            return byArray;
        }
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        sprbsf sprbsf2;
        sprbsf sprbsf3 = sprbsf2 = new sprvsf(this.cfr_renamed_4).cfr_renamed_5782(arg1).cfr_renamed_1451();
        int n = ((sprgsf)sprbsf3).cfr_renamed_320();
        this.cfr_renamed_3.cfr_renamed_5766(new byte[this.cfr_renamed_4.cfr_renamed_5732()], this.cfr_renamed_91.cfr_renamed_5769());
        byte[] byArray = sproze.cfr_renamed_527(((sprgsf)sprbsf3).cfr_renamed_1295(), this.cfr_renamed_91.cfr_renamed_1411(), sprvof.cfr_renamed_5755(n, this.cfr_renamed_4.cfr_renamed_5732()));
        sprrmf sprrmf2 = this;
        byte[] byArray2 = sprrmf2.cfr_renamed_0.cfr_renamed_5775(byArray, arg0);
        int n2 = sprrmf2.cfr_renamed_4.cfr_renamed_1452();
        int n3 = sprvof.cfr_renamed_5760(n, n2);
        sprrqf sprrqf2 = (sprrqf)new sprtsf().cfr_renamed_5776(n).cfr_renamed_1451();
        return sproze.cfr_renamed_559(sprwkf.cfr_renamed_5731(this.cfr_renamed_3, n2, byArray2, sprbsf2, sprrqf2, n3).cfr_renamed_97(), this.cfr_renamed_91.cfr_renamed_1411());
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprrmf sprrmf2;
        if (arg0) {
            sprrmf sprrmf3 = this;
            this.cfr_renamed_2 = true;
            sprrmf3.cfr_renamed_119 = false;
            sprrmf3.cfr_renamed_1 = (spremf)arg1;
            sprrmf sprrmf4 = this;
            sprrmf2 = sprrmf4;
            sprrmf4.cfr_renamed_4 = sprrmf4.cfr_renamed_1.cfr_renamed_284();
        } else {
            this.cfr_renamed_2 = false;
            this.cfr_renamed_91 = (sprgpf)arg1;
            sprrmf sprrmf5 = this;
            sprrmf2 = sprrmf5;
            sprrmf5.cfr_renamed_4 = sprrmf5.cfr_renamed_91.cfr_renamed_284();
        }
        sprrmf2.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_5783();
        this.cfr_renamed_0 = this.cfr_renamed_3.cfr_renamed_5784();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public spryye cfr_renamed_5643() {
        spremf spremf2 = this.cfr_renamed_1;
        synchronized (spremf2) {
            if (this.cfr_renamed_119) {
                spremf spremf3 = this.cfr_renamed_1;
                this.cfr_renamed_1 = null;
                return spremf3;
            }
            spremf spremf4 = this.cfr_renamed_1;
            if (spremf4 != null) {
                this.cfr_renamed_1 = this.cfr_renamed_1.cfr_renamed_5785();
            }
            return spremf4;
        }
    }
}

