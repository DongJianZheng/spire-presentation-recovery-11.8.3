/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprjlp;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzjn;
import com.spire.presentation.packages.sprzlp;

@sprtea
public class sprmin
extends sprzjn {
    private sprgeja cfr_renamed_112;
    private sprlfja cfr_renamed_119;
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private sprqgp cfr_renamed_4;

    @Override
    public void cfr_renamed_14407() {
        switch (this.cfr_renamed_0) {
            case 0: 
            case 4: {
                sprmin sprmin2 = this;
                while (false) {
                }
                sprmin2.cfr_renamed_14729(sprmin2.cfr_renamed_14730());
                return;
            }
            case 1: {
                sprmin sprmin3 = this;
                sprmin3.cfr_renamed_14729(sprmin3.cfr_renamed_14730());
                sprmin3.cfr_renamed_14729(sprmin3.cfr_renamed_14731());
                return;
            }
            case 2: {
                sprmin sprmin4 = this;
                sprmin4.cfr_renamed_14729(sprmin4.cfr_renamed_14730());
                sprmin4.cfr_renamed_14729(sprmin4.cfr_renamed_14732());
                return;
            }
            case 3: {
                sprmin sprmin5 = this;
                sprmin5.cfr_renamed_14729(sprmin5.cfr_renamed_14730());
                sprmin5.cfr_renamed_14729(sprmin5.cfr_renamed_14731());
                sprmin5.cfr_renamed_14729(sprmin5.cfr_renamed_14732());
                sprmin5.cfr_renamed_14729(sprmin5.cfr_renamed_14733());
                return;
            }
        }
        throw new IllegalStateException(sprtaz.cfr_renamed_9("DU~\u001ayOzJeH~_n\u001ahH\u007fIb\u001a}HkJ*We^o\u0014"));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_14725() {
        switch (this.cfr_renamed_0) {
            case 0: 
            case 2: {
                return this.cfr_renamed_3;
            }
            case 1: 
            case 3: {
                return this.cfr_renamed_3 * 2;
            }
            case 4: {
                return this.cfr_renamed_14734().cfr_renamed_1942();
            }
        }
        throw new IllegalStateException(sprjlp.cfr_renamed_9("\u00191#~$+'.8,#;3~5,\"-?~ ,6.w38:2p"));
    }

    private /* synthetic */ sprqgp cfr_renamed_14730() {
        return new sprqgp(this.cfr_renamed_3, 0.0f, 0.0f, -this.cfr_renamed_1, 0.0f, this.cfr_renamed_1);
    }

    private /* synthetic */ sprlfja cfr_renamed_14734() {
        if (!this.cfr_renamed_91) {
            this.cfr_renamed_119 = this.cfr_renamed_14735();
        }
        this.cfr_renamed_91 = true;
        return this.cfr_renamed_119;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_14726() {
        switch (this.cfr_renamed_0) {
            case 0: 
            case 1: {
                return this.cfr_renamed_1;
            }
            case 2: 
            case 3: {
                return this.cfr_renamed_1 * 2;
            }
            case 4: {
                return this.cfr_renamed_14734().cfr_renamed_1452();
            }
        }
        throw new IllegalStateException(sprtaz.cfr_renamed_9("DU~\u001ayOzJeH~_n\u001ahH\u007fIb\u001a}HkJ*We^o\u0014"));
    }

    /*
     * WARNING - void declaration
     */
    public sprmin(sprgdo sprgdo2, sprpip sprpip2, sprgeja sprgeja2, sprqgp sprqgp2) {
        void arg2;
        void arg3;
        void arg0;
        void arg1;
        sprmin sprmin2 = this;
        sprmin sprmin3 = this;
        void v2 = arg1;
        super((sprgdo)arg0, (sprqgp)arg3);
        this.cfr_renamed_119 = sprlfja.cfr_renamed_13377();
        this.cfr_renamed_4 = v2.cfr_renamed_12672();
        sprmin3.cfr_renamed_0 = v2.cfr_renamed_13337();
        sprmin3.cfr_renamed_112 = arg2;
        sprmin2.cfr_renamed_2 = arg1.cfr_renamed_12510();
        sprczo sprczo2 = sprsto.cfr_renamed_13321(sprpip2.cfr_renamed_12510());
        sprmin2.cfr_renamed_3 = sprczo2.cfr_renamed_1942();
        sprmin2.cfr_renamed_1 = sprczo2.cfr_renamed_1452();
    }

    private /* synthetic */ sprqgp cfr_renamed_14733() {
        return new sprqgp(-this.cfr_renamed_3, 0.0f, 0.0f, this.cfr_renamed_1, 2 * this.cfr_renamed_3, this.cfr_renamed_1);
    }

    private /* synthetic */ sprqgp cfr_renamed_14732() {
        return new sprqgp(this.cfr_renamed_3, 0.0f, 0.0f, this.cfr_renamed_1, 0.0f, this.cfr_renamed_1);
    }

    private /* synthetic */ sprlfja cfr_renamed_14735() {
        sprgeja sprgeja2;
        float f;
        sprgeja sprgeja3;
        float f2;
        sprgeja sprgeja4;
        sprgeja sprgeja5 = sprzlp.cfr_renamed_14736(this.cfr_renamed_4.cfr_renamed_14487().cfr_renamed_14235(this.cfr_renamed_112));
        if (sprgeja4.cfr_renamed_13430() < 0.0f) {
            f2 = -sprgeja5.cfr_renamed_13430() + (float)this.cfr_renamed_3;
            sprgeja3 = sprgeja5;
        } else {
            f2 = sprgeja5.cfr_renamed_13430();
            sprgeja3 = sprgeja5;
        }
        float f3 = sprrgga.cfr_renamed_13566(f2, sprgeja3.cfr_renamed_13341());
        if (sprgeja5.cfr_renamed_13342() < 0.0f) {
            f = -sprgeja5.cfr_renamed_13342() + (float)this.cfr_renamed_1;
            sprgeja2 = sprgeja5;
        } else {
            f = sprgeja5.cfr_renamed_13342();
            sprgeja2 = sprgeja5;
        }
        float f4 = sprrgga.cfr_renamed_13566(f, sprgeja2.cfr_renamed_13429());
        int n = 5;
        return new sprlfja((int)(f3 += (float)n), (int)(f4 += (float)n));
    }

    private /* synthetic */ void cfr_renamed_14729(sprqgp arg0) {
        this.cfr_renamed_14723().cfr_renamed_14737(this.cfr_renamed_2, arg0, null, this.cfr_renamed_14724());
    }

    private /* synthetic */ sprqgp cfr_renamed_14731() {
        return new sprqgp(-this.cfr_renamed_3, 0.0f, 0.0f, -this.cfr_renamed_1, 2 * this.cfr_renamed_3, this.cfr_renamed_1);
    }
}

