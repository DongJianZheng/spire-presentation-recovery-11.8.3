/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprdto;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfhn;
import com.spire.presentation.packages.sprgqn;
import com.spire.presentation.packages.sprkkn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsqn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprtqn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwln;
import com.spire.presentation.packages.sprwp;
import com.spire.presentation.packages.sprxdn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryqn;

@sprtea
public class sprwpn
extends sprsmn
implements sprwp {
    private String cfr_renamed_119;
    @sprtea
    public boolean cfr_renamed_91;
    @sprtea
    public boolean cfr_renamed_0;
    private sprdto cfr_renamed_1;
    private float cfr_renamed_2;
    private spryqn cfr_renamed_3;
    private sprkkn cfr_renamed_4;

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        if (this.cfr_renamed_13093() && arg0.cfr_renamed_13094() != null && arg0.cfr_renamed_11861() == 1 && arg0.cfr_renamed_576(0) instanceof sprson) {
            sprson sprson2 = spresca.cfr_renamed_11777(arg0.cfr_renamed_576(0), sprson.class);
            sprmrn sprmrn2 = arg0;
            sprmrn2.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f / sprson2.cfr_renamed_2773().cfr_renamed_1942(), 0.0f, 0.0f, -1.0f / sprson2.cfr_renamed_2773().cfr_renamed_1452(), 0.0f, 1.0f), 0);
            sprmrn2.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_2), 1);
        }
        this.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_13096(arg0);
    }

    public boolean cfr_renamed_13093() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprqt cfr_renamed_12479() {
        if (this.cfr_renamed_3.cfr_renamed_13097() == null || this.cfr_renamed_3.cfr_renamed_13097().cfr_renamed_12479() == null) {
            return sprxdn.cfr_renamed_4;
        }
        return this.cfr_renamed_3.cfr_renamed_13097().cfr_renamed_12479();
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        if (this.cfr_renamed_13093()) {
            if (arg0.cfr_renamed_13094() == null) {
                arg0.cfr_renamed_12511(new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
            }
            arg0.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_2), 1);
        }
        this.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_13099(arg0);
    }

    @Override
    public void cfr_renamed_12453() {
        this.cfr_renamed_3.cfr_renamed_13100();
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        this.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_13102();
    }

    public sprwpn(sprbgp arg0, sprfhn arg1) {
        sprwpn sprwpn2 = this;
        sprwpn sprwpn3 = this;
        sprwpn2.cfr_renamed_1 = new sprdto();
        sprwpn3.cfr_renamed_3 = new spryqn(this.cfr_renamed_1, arg1);
        sprwpn2.cfr_renamed_3.cfr_renamed_13103(arg0);
        sprwpn2.cfr_renamed_4 = new sprkkn(arg1.cfr_renamed_13104());
    }

    public String cfr_renamed_13105() {
        return this.cfr_renamed_119;
    }

    public sprwpn() {
        sprwpn sprwpn2 = this;
        sprwpn sprwpn3 = this;
        sprwpn3.cfr_renamed_1 = new sprdto();
        sprwpn2.cfr_renamed_3 = new spryqn(this.cfr_renamed_1, new sprfhn());
        sprwpn2.cfr_renamed_4 = new sprkkn(new sprcno());
        sprwpn2.cfr_renamed_0 = true;
    }

    public void cfr_renamed_13106(String arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public sprwpn(sprbgp arg0) {
        this(arg0, new sprfhn());
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        this.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_12699();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_13108(sprthn arg0) {
        if (!this.cfr_renamed_13093()) ** GOTO lbl13
        if (arg0.cfr_renamed_13094() == null) {
            v0 = this;
            v1 = arg0;
            v2 = arg0;
            v2.cfr_renamed_13109(new sprsuja(v2.cfr_renamed_13110().cfr_renamed_1980(), this.cfr_renamed_2 - arg0.cfr_renamed_13110().spr\u3181()));
        } else {
            v3 = arg0;
            v3.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f), 0);
            v3.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_2), 1);
lbl13:
            // 2 sources

            v0 = this;
        }
        v0.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_13111(arg0);
    }

    @Override
    public void cfr_renamed_13112(sprsqn arg0) {
        sprwpn sprwpn2 = this;
        sprwpn2.cfr_renamed_2 = arg0.cfr_renamed_1452();
        sprwpn2.cfr_renamed_3.cfr_renamed_13113(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452());
        sprwpn2.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_4 = this.cfr_renamed_0;
        sprwpn2.cfr_renamed_3.cfr_renamed_13114(arg0.cfr_renamed_2773());
    }

    @Override
    public void cfr_renamed_13115(sprwln arg0) {
        this.cfr_renamed_3.cfr_renamed_13116(arg0);
    }

    @Override
    public void cfr_renamed_13117(sprgqn arg0) {
        this.cfr_renamed_3.cfr_renamed_13118(arg0);
    }

    @Override
    public void cfr_renamed_13119(sprtqn arg0) {
        sprxln sprxln2;
        sprtqn sprtqn2 = arg0;
        sprxln sprxln3 = sprxln2 = sprxln.cfr_renamed_13120(sprtqn2.cfr_renamed_2, sprtqn2.cfr_renamed_3);
        sprxln3.cfr_renamed_12505(arg0.cfr_renamed_4);
        sprxln3.cfr_renamed_13121(this);
        sprxln2 = null;
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        sprwpn sprwpn2 = this;
        if ((arg0 = arg0.cfr_renamed_13123(sprwpn2, sprwpn2.cfr_renamed_4)) != null) {
            if (this.cfr_renamed_13093() && arg0.cfr_renamed_2773().cfr_renamed_1452() < 0.0f) {
                spresca.cfr_renamed_11777(arg0.cfr_renamed_8155(), sprmrn.class).cfr_renamed_13094().cfr_renamed_12593(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f));
            }
            this.cfr_renamed_3.cfr_renamed_13095().cfr_renamed_13124(arg0);
        }
    }

    public sprdto cfr_renamed_12863() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_13125(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @Override
    public void cfr_renamed_13126(sprsqn arg0) {
        this.cfr_renamed_3.cfr_renamed_13127();
    }

    @Override
    public void cfr_renamed_13128(sprvjn arg0) {
        arg0.cfr_renamed_13121(this);
    }
}

