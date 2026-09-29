/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfib;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgud;
import com.spire.presentation.packages.sprjfo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpno;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrmo;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzlp;

@sprtea
public abstract class sprgjo
extends sprpno {
    public sprsuja cfr_renamed_91;
    public sprphja cfr_renamed_0;
    public sprqgp cfr_renamed_1;
    public sprsuja cfr_renamed_2 = sprsuja.cfr_renamed_13377();
    public int cfr_renamed_3;
    public sprphja cfr_renamed_4;

    public void cfr_renamed_13184(sprsuja[] arg0) {
        this.cfr_renamed_16312().cfr_renamed_13184(arg0);
    }

    private /* synthetic */ sprqgp cfr_renamed_16313() {
        sprqgp sprqgp2;
        sprgjo sprgjo2 = this;
        sprgjo2.cfr_renamed_16314();
        float f = sprgjo2.cfr_renamed_0.cfr_renamed_1942() == 0.0f ? 0.0f : this.cfr_renamed_4.cfr_renamed_1942() / this.cfr_renamed_0.cfr_renamed_1942();
        float f2 = this.cfr_renamed_0.cfr_renamed_1452() == 0.0f ? 0.0f : this.cfr_renamed_4.cfr_renamed_1452() / this.cfr_renamed_0.cfr_renamed_1452();
        sprqgp sprqgp3 = sprqgp2 = new sprqgp();
        sprqgp2.cfr_renamed_13466(-this.cfr_renamed_2.cfr_renamed_1980(), -this.cfr_renamed_2.spr\u3181(), 1);
        sprqgp3.cfr_renamed_13255(f, f2, 1);
        sprqgp3.cfr_renamed_13466(this.cfr_renamed_91.cfr_renamed_1980(), this.cfr_renamed_91.spr\u3181(), 1);
        return sprqgp3;
    }

    public abstract void cfr_renamed_16291();

    public void cfr_renamed_16315(sprqgp arg0, int arg1) {
        sprgjo sprgjo2;
        switch (arg1) {
            case 1: {
                while (false) {
                }
                sprgjo2 = this;
                this.cfr_renamed_1 = new sprqgp();
                break;
            }
            case 2: {
                sprgjo sprgjo3 = this;
                sprgjo2 = sprgjo3;
                sprgjo3.cfr_renamed_1.cfr_renamed_12634(arg0, 0);
                break;
            }
            case 3: {
                sprgjo sprgjo4 = this;
                sprgjo2 = sprgjo4;
                sprgjo4.cfr_renamed_1.cfr_renamed_12634(arg0, 1);
                break;
            }
            case 4: {
                sprgjo2 = this;
                this.cfr_renamed_1 = arg0;
                break;
            }
            default: {
                throw new IllegalStateException(sprfib.cfr_renamed_9("\u0019/)9<$/5)%l5> \"2*.>,l,#%)o"));
            }
        }
        sprgjo2.cfr_renamed_16293();
    }

    public sprgjo() {
        this.cfr_renamed_91 = sprsuja.cfr_renamed_13377();
        sprgjo sprgjo2 = this;
        this.cfr_renamed_1 = new sprqgp();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16316(sprrmo sprrmo2) {
        void arg0;
        void v0 = arg0;
        sprgjo sprgjo2 = this;
        void v2 = arg0;
        this.cfr_renamed_3 = v2.cfr_renamed_16304();
        sprgjo2.cfr_renamed_2 = v2.cfr_renamed_16305();
        sprgjo2.cfr_renamed_0 = arg0.cfr_renamed_16303();
        this.cfr_renamed_91 = v0.cfr_renamed_16306();
        this.cfr_renamed_4 = v0.cfr_renamed_16308();
        this.cfr_renamed_1 = sprrmo2.cfr_renamed_16307();
        this.cfr_renamed_16293();
    }

    public abstract void cfr_renamed_16298();

    public abstract void cfr_renamed_16294();

    public sprrmo cfr_renamed_16317() {
        sprgjo sprgjo2 = this;
        sprgjo sprgjo3 = this;
        sprgjo sprgjo4 = this;
        return new sprrmo(sprgjo2.cfr_renamed_3, sprgjo2.cfr_renamed_2, sprgjo3.cfr_renamed_0, sprgjo3.cfr_renamed_91, sprgjo4.cfr_renamed_4, sprgjo4.cfr_renamed_1.cfr_renamed_12099());
    }

    public void cfr_renamed_16136(int arg0) {
        sprgjo sprgjo2;
        block13: {
            if (this.cfr_renamed_3 == arg0) {
                return;
            }
            if (arg0 < 1 || arg0 > 8) {
                return;
            }
            this.cfr_renamed_3 = arg0;
            switch (this.cfr_renamed_3) {
                case 1: {
                    sprgjo sprgjo3 = this;
                    while (false) {
                    }
                    sprgjo2 = sprgjo3;
                    sprgjo3.cfr_renamed_16291();
                    break block13;
                }
                case 2: {
                    sprgjo sprgjo4 = this;
                    sprgjo2 = sprgjo4;
                    sprgjo4.cfr_renamed_16299();
                    break block13;
                }
                case 3: {
                    sprgjo sprgjo5 = this;
                    sprgjo2 = sprgjo5;
                    sprgjo5.cfr_renamed_16297();
                    break block13;
                }
                case 4: {
                    sprgjo sprgjo6 = this;
                    sprgjo2 = sprgjo6;
                    sprgjo6.cfr_renamed_16301();
                    break block13;
                }
                case 5: {
                    sprgjo sprgjo7 = this;
                    sprgjo2 = sprgjo7;
                    sprgjo7.cfr_renamed_16302();
                    break block13;
                }
                case 6: {
                    sprgjo sprgjo8 = this;
                    sprgjo2 = sprgjo8;
                    sprgjo8.cfr_renamed_16294();
                    break block13;
                }
                case 7: {
                    sprgjo sprgjo9 = this;
                    sprgjo2 = sprgjo9;
                    sprgjo9.cfr_renamed_16298();
                    break block13;
                }
                case 8: {
                    break;
                }
                default: {
                    throw new IllegalStateException(sprgud.cfr_renamed_9("N\t~\u001fk\u0002x\u0013~\u0003;\nz\u0017;\nt\u0003~I"));
                }
            }
            sprgjo2 = this;
        }
        sprgjo2.cfr_renamed_16293();
    }

    public abstract void cfr_renamed_16138(sprphja var1);

    private /* synthetic */ void cfr_renamed_16314() {
        if (this.cfr_renamed_4.cfr_renamed_1942() == 0.0f) {
            throw new IllegalStateException(sprfib.cfr_renamed_9("\u001a()6<.>5l6%%8)l(?a%/:  ((o"));
        }
        if (this.cfr_renamed_4.cfr_renamed_1452() == 0.0f) {
            throw new IllegalStateException(sprgud.cfr_renamed_9("1r\u0002l\u0017t\u0015oGs\u0002r\u0000s\u0013;\u000ehGr\tm\u0006w\u000e\u007fI"));
        }
    }

    public void cfr_renamed_16140(sprjfo sprjfo2) {
        sprgjo sprgjo2 = this;
        sprgjo2.cfr_renamed_16138(sprjfo2.cfr_renamed_16128(sprgjo2.cfr_renamed_0));
    }

    public void cfr_renamed_16143(sprphja arg0) {
        sprgjo sprgjo2 = this;
        sprgjo2.cfr_renamed_16141(sprzlp.cfr_renamed_16318(sprgjo2.cfr_renamed_91, arg0));
    }

    public abstract void cfr_renamed_16301();

    public abstract void cfr_renamed_16299();

    public sprsuja cfr_renamed_13791(sprsuja arg0) {
        return this.cfr_renamed_16312().cfr_renamed_13791(arg0);
    }

    public abstract void cfr_renamed_16297();

    public void cfr_renamed_16144(sprjfo sprjfo2) {
        sprgjo sprgjo2 = this;
        sprgjo2.cfr_renamed_16142(sprjfo2.cfr_renamed_16128(sprgjo2.cfr_renamed_4));
    }

    public abstract void cfr_renamed_16142(sprphja var1);

    public void cfr_renamed_16139(sprphja arg0) {
        sprgjo sprgjo2 = this;
        sprgjo2.cfr_renamed_16137(sprzlp.cfr_renamed_16318(sprgjo2.cfr_renamed_2, arg0));
    }

    public abstract void cfr_renamed_16137(sprsuja var1);

    public abstract void cfr_renamed_16141(sprsuja var1);

    public abstract void cfr_renamed_16302();

    public sprgeja cfr_renamed_16319(sprgeja arg0) {
        return this.cfr_renamed_16312().cfr_renamed_13764(arg0);
    }

    @Override
    public sprqgp cfr_renamed_16312() {
        sprqgp sprqgp2 = this.cfr_renamed_16313();
        sprqgp2.cfr_renamed_12634(this.cfr_renamed_1, 0);
        return sprqgp2;
    }
}

