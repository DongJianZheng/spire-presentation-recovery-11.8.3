/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbsf;
import com.spire.presentation.packages.spreqf;
import com.spire.presentation.packages.sprhmf;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprmtf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprqrq;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprrsf;
import com.spire.presentation.packages.sprsbj;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprvif;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprwkf;
import com.spire.presentation.packages.sprwqf;
import com.spire.presentation.packages.spryi;
import com.spire.presentation.packages.spryye;

public class sprqrf
implements spryi {
    private sprlpf cfr_renamed_119;
    private sprpof cfr_renamed_91;
    private spraof cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprvif cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprvjf cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprqrf sprqrf2;
        if (arg0) {
            sprqrf sprqrf3 = this;
            this.cfr_renamed_1 = true;
            sprqrf3.cfr_renamed_3 = false;
            sprqrf3.cfr_renamed_91 = (sprpof)arg1;
            sprqrf sprqrf4 = this;
            sprqrf2 = sprqrf4;
            sprqrf4.cfr_renamed_4 = sprqrf4.cfr_renamed_91.cfr_renamed_284();
            sprqrf4.cfr_renamed_119 = sprqrf4.cfr_renamed_4.cfr_renamed_5821();
        } else {
            this.cfr_renamed_1 = false;
            this.cfr_renamed_2 = (sprvif)arg1;
            sprqrf sprqrf5 = this;
            sprqrf2 = sprqrf5;
            sprqrf5.cfr_renamed_4 = sprqrf5.cfr_renamed_2.cfr_renamed_284();
            sprqrf5.cfr_renamed_119 = sprqrf5.cfr_renamed_4.cfr_renamed_5821();
        }
        sprqrf2.cfr_renamed_0 = this.cfr_renamed_4.cfr_renamed_5783();
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        int n;
        sprhmf sprhmf2;
        if (arg0 == null) {
            throw new NullPointerException(sprsbj.cfr_renamed_9("rMl[~Oz\b\"\u0015?FjDs"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprqrq.cfr_renamed_9("x\u001cl\u001bj\u0001~\u0007nU6H+\u001b~\u0019g"));
        }
        if (this.cfr_renamed_2 == null) {
            throw new NullPointerException(sprsbj.cfr_renamed_9("o]}DvKTMf\b\"\u0015?FjDs"));
        }
        sprhmf sprhmf3 = sprhmf2 = new sprmtf(this.cfr_renamed_4).cfr_renamed_5782(arg1).cfr_renamed_1451();
        byte[] byArray = sproze.cfr_renamed_527(sprhmf2.cfr_renamed_1295(), this.cfr_renamed_2.cfr_renamed_1411(), sprvof.cfr_renamed_5755(sprhmf3.cfr_renamed_320(), this.cfr_renamed_4.cfr_renamed_5732()));
        byte[] byArray2 = this.cfr_renamed_0.cfr_renamed_5784().cfr_renamed_5775(byArray, arg0);
        long l = sprhmf3.cfr_renamed_320();
        sprqrf sprqrf2 = this;
        int n2 = sprqrf2.cfr_renamed_119.cfr_renamed_1452();
        long l2 = sprvof.cfr_renamed_5763(l, n2);
        int n3 = sprvof.cfr_renamed_5760(l, n2);
        sprqrf2.cfr_renamed_0.cfr_renamed_5766(new byte[this.cfr_renamed_4.cfr_renamed_5732()], this.cfr_renamed_2.cfr_renamed_5769());
        sprrqf sprrqf2 = (sprrqf)((sprtsf)new sprtsf().cfr_renamed_5735(l2)).cfr_renamed_5776(n3).cfr_renamed_1451();
        sprbsf sprbsf2 = sprhmf2.cfr_renamed_5822().get(0);
        sprknf sprknf2 = sprwkf.cfr_renamed_5731(this.cfr_renamed_0, n2, byArray2, sprbsf2, sprrqf2, n3);
        int n4 = n = 1;
        while (n4 < this.cfr_renamed_4.cfr_renamed_1134()) {
            sprbsf2 = sprhmf2.cfr_renamed_5822().get(n);
            n3 = sprvof.cfr_renamed_5760(l2, n2);
            l2 = sprvof.cfr_renamed_5763(l2, n2);
            sprrqf2 = (sprrqf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(n)).cfr_renamed_5735(l2)).cfr_renamed_5776(n3).cfr_renamed_1451();
            sprknf2 = sprwkf.cfr_renamed_5731(this.cfr_renamed_0, n2, sprknf2.cfr_renamed_97(), sprbsf2, sprrqf2, n3);
            n4 = ++n;
        }
        return sproze.cfr_renamed_559(sprknf2.cfr_renamed_97(), this.cfr_renamed_2.cfr_renamed_1411());
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
            throw new NullPointerException(sprqrq.cfr_renamed_9("f\u0010x\u0006j\u0012nU6H+\u001b~\u0019g"));
        }
        if (!this.cfr_renamed_1) {
            throw new IllegalStateException(sprqrq.cfr_renamed_9("x\u001cl\u001bn\u0007+\u001bd\u0001+\u001ce\u001c\u007f\u001cj\u0019b\u000fn\u0011+\u0013d\u0007+\u0006b\u0012e\u0014\u007f\u0000y\u0010+\u0012n\u001bn\u0007j\u0001b\u001ae"));
        }
        if (this.cfr_renamed_91 == null) {
            throw new IllegalStateException(sprsbj.cfr_renamed_9("[vOqAqO?CzQ?Fp\bsGqOzZ?]lI}Dz"));
        }
        sprpof sprpof2 = this.cfr_renamed_91;
        synchronized (sprpof2) {
            if (this.cfr_renamed_91.cfr_renamed_5649() <= 0L) {
                throw new IllegalStateException(sprsbj.cfr_renamed_9("Fp\bj[~Oz[?Gy\boZv^~\\z\btMf\bmMrIvFvFx"));
            }
            if (this.cfr_renamed_91.cfr_renamed_5771().cfr_renamed_29()) {
                throw new IllegalStateException(sprqrq.cfr_renamed_9("e\u001a\u007fUb\u001bb\u0001b\u0014g\u001cq\u0010o"));
            }
            try {
                sprrqf sprrqf2;
                int n;
                long l;
                sprhmf sprhmf2;
                byte[] byArray;
                int n2;
                long l2;
                sprrsf sprrsf2;
                block17: {
                    block16: {
                        sprqrf sprqrf2 = this;
                        sprrsf2 = sprqrf2.cfr_renamed_91.cfr_renamed_5771();
                        l2 = sprqrf2.cfr_renamed_91.cfr_renamed_320();
                        int n3 = sprqrf2.cfr_renamed_4.cfr_renamed_1452();
                        n2 = sprqrf2.cfr_renamed_119.cfr_renamed_1452();
                        if (sprqrf2.cfr_renamed_91.cfr_renamed_5649() <= 0L) {
                            throw new IllegalStateException(sprsbj.cfr_renamed_9("vF{Mg\bp]k\bpN?Jp]qLl"));
                        }
                        sprqrf sprqrf3 = this;
                        byte[] byArray2 = sprqrf3.cfr_renamed_0.cfr_renamed_5784().cfr_renamed_5773(this.cfr_renamed_91.cfr_renamed_5774(), sprvof.cfr_renamed_5755(l2, 32));
                        byte[] byArray3 = sproze.cfr_renamed_527(byArray2, this.cfr_renamed_91.cfr_renamed_1411(), sprvof.cfr_renamed_5755(l2, this.cfr_renamed_4.cfr_renamed_5732()));
                        byArray = sprqrf3.cfr_renamed_0.cfr_renamed_5784().cfr_renamed_5775(byArray3, arg0);
                        this.cfr_renamed_3 = true;
                        sprhmf2 = new sprmtf(this.cfr_renamed_4).cfr_renamed_5823(l2).cfr_renamed_5778(byArray2).cfr_renamed_1451();
                        l = sprvof.cfr_renamed_5763(l2, n2);
                        n = sprvof.cfr_renamed_5760(l2, n2);
                        sprqrf3.cfr_renamed_0.cfr_renamed_5766(new byte[this.cfr_renamed_4.cfr_renamed_5732()], this.cfr_renamed_91.cfr_renamed_5769());
                        sprrqf2 = (sprrqf)((sprtsf)new sprtsf().cfr_renamed_5735(l)).cfr_renamed_5776(n).cfr_renamed_1451();
                        if (sprrsf2.cfr_renamed_576(0) == null) break block16;
                        if (n != 0) break block17;
                    }
                    sprqrf sprqrf4 = this;
                    sprrsf2.cfr_renamed_5824(0, new sprqsf(sprqrf4.cfr_renamed_119, sprqrf4.cfr_renamed_91.cfr_renamed_5769(), this.cfr_renamed_91.cfr_renamed_5768(), sprrqf2));
                }
                spreqf spreqf2 = this.cfr_renamed_5765(byArray, sprrqf2);
                sprbsf sprbsf2 = new sprwqf(this.cfr_renamed_119).cfr_renamed_5779(spreqf2).cfr_renamed_5780(sprrsf2.cfr_renamed_576(0).cfr_renamed_5772()).cfr_renamed_1451();
                sprhmf2.cfr_renamed_5822().add(sprbsf2);
                int n4 = 1;
                int n5 = n4;
                while (n5 < this.cfr_renamed_4.cfr_renamed_1134()) {
                    sprknf sprknf2 = sprrsf2.cfr_renamed_576(n4 - 1).cfr_renamed_1411();
                    n = sprvof.cfr_renamed_5760(l, n2);
                    l = sprvof.cfr_renamed_5763(l, n2);
                    sprrqf2 = (sprrqf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(n4)).cfr_renamed_5735(l)).cfr_renamed_5776(n).cfr_renamed_1451();
                    spreqf2 = this.cfr_renamed_5765(sprknf2.cfr_renamed_97(), sprrqf2);
                    if (sprrsf2.cfr_renamed_576(n4) == null || sprvof.cfr_renamed_5752(l2, n2, n4)) {
                        sprqrf sprqrf5 = this;
                        sprrsf2.cfr_renamed_5824(n4, new sprqsf(sprqrf5.cfr_renamed_119, sprqrf5.cfr_renamed_91.cfr_renamed_5769(), this.cfr_renamed_91.cfr_renamed_5768(), sprrqf2));
                    }
                    sprbsf2 = new sprwqf(this.cfr_renamed_119).cfr_renamed_5779(spreqf2).cfr_renamed_5780(sprrsf2.cfr_renamed_576(n4).cfr_renamed_5772()).cfr_renamed_1451();
                    sprhmf2.cfr_renamed_5822().add(sprbsf2);
                    n5 = ++n4;
                }
                byte[] byArray4 = sprhmf2.cfr_renamed_954();
                return byArray4;
            }
            finally {
                this.cfr_renamed_91.cfr_renamed_5781();
            }
        }
    }

    @Override
    public spryye cfr_renamed_5643() {
        if (this.cfr_renamed_3) {
            sprpof sprpof2 = this.cfr_renamed_91;
            this.cfr_renamed_91 = null;
            return sprpof2;
        }
        sprpof sprpof3 = this.cfr_renamed_91;
        if (sprpof3 != null) {
            this.cfr_renamed_91 = this.cfr_renamed_91.cfr_renamed_5785();
        }
        return sprpof3;
    }

    public long cfr_renamed_5649() {
        return this.cfr_renamed_91.cfr_renamed_5649();
    }

    private /* synthetic */ spreqf cfr_renamed_5765(byte[] arg0, sprrqf arg1) {
        if (arg0.length != this.cfr_renamed_4.cfr_renamed_5732()) {
            throw new IllegalArgumentException(sprqrq.cfr_renamed_9("x\u001cq\u0010+\u001amUf\u0010x\u0006j\u0012n1b\u0012n\u0006\u007fUe\u0010n\u0011xU\u007f\u001a+\u0017nUn\u0004~\u0014gU\u007f\u001a+\u0006b\u000fnUd\u0013+\u0011b\u0012n\u0006\u007f"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprsbj.cfr_renamed_9("Gk[WIl@^L{Zz[l\b\"\u0015?FjDs"));
        }
        sprqrf sprqrf2 = this;
        sprqrf2.cfr_renamed_0.cfr_renamed_5766(sprqrf2.cfr_renamed_0.cfr_renamed_5767(this.cfr_renamed_91.cfr_renamed_5768(), arg1), this.cfr_renamed_91.cfr_renamed_5769());
        return sprqrf2.cfr_renamed_0.cfr_renamed_5770(arg0, arg1);
    }
}

