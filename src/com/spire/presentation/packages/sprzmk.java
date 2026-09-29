/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblk;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdmk;
import com.spire.presentation.packages.sprfnk;
import com.spire.presentation.packages.sprgok;
import com.spire.presentation.packages.sprgud;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmnm;
import com.spire.presentation.packages.sprosm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfk;
import com.spire.presentation.packages.sprpgk;
import com.spire.presentation.packages.sprqpja;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprugk;
import com.spire.presentation.packages.sprvr;
import com.spire.presentation.packages.sprwum;
import com.spire.presentation.packages.sprxpk;
import com.spire.presentation.packages.sprywl;

public class sprzmk
extends sprgok {
    private sprosm cfr_renamed_2;
    private sprugk cfr_renamed_3;
    private sprblk cfr_renamed_4;

    public sprigm cfr_renamed_2607() {
        return this.cfr_renamed_2.cfr_renamed_2607();
    }

    public sprblk cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzmk(sprlvm arg0) throws sprpfk {
        super(arg0);
        if (!sprvr.cfr_renamed_4.cfr_renamed_5078(arg0.cfr_renamed_696())) {
            throw new sprpfk(sprgud.cfr_renamed_9("X\bu\u0013~\to.u\u0001tGu\boGzG_1X4;5~\u0016n\u0002h\u0013"));
        }
        try {
            this.cfr_renamed_2 = arg0.cfr_renamed_480().cfr_renamed_119() instanceof sprszm ? sprosm.cfr_renamed_23(arg0.cfr_renamed_480()) : sprosm.cfr_renamed_23(sproug.cfr_renamed_23(arg0.cfr_renamed_480()).cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprpfk(new StringBuilder().insert(0, sprqpja.cfr_renamed_9("\"H\u0016D\u001bCWR\u0018\u0006\u0007G\u0005U\u0012\u0006\u0014I\u0019R\u0012H\u0003\u001cW")).append(exception.getMessage()).toString(), exception);
        }
        this.cfr_renamed_3 = new sprugk(this.cfr_renamed_2.cfr_renamed_2608());
        int n = this.cfr_renamed_3.cfr_renamed_2597();
        if (n == sprwum.cfr_renamed_1.cfr_renamed_97().intValue()) {
            sprzmk sprzmk2 = this;
            this.cfr_renamed_4 = new sprpgk(this.cfr_renamed_2.cfr_renamed_2609());
            return;
        }
        if (n == sprwum.cfr_renamed_4.cfr_renamed_97().intValue()) {
            this.cfr_renamed_4 = new sprfnk(this.cfr_renamed_2.cfr_renamed_2609());
            return;
        }
        if (n == sprwum.cfr_renamed_0.cfr_renamed_97().intValue()) {
            this.cfr_renamed_4 = new sprxpk(this.cfr_renamed_2.cfr_renamed_2609());
            return;
        }
        if (n == sprwum.cfr_renamed_3.cfr_renamed_97().intValue()) {
            this.cfr_renamed_4 = new sprdmk(this.cfr_renamed_2.cfr_renamed_2609());
            return;
        }
        throw new sprpfk(new StringBuilder().insert(0, sprgud.cfr_renamed_9("N\tp\tt\u0010uGh\u0002i\u0011r\u0004~Go\u001ek\u0002!G")).append(n).toString());
    }

    public sprugk cfr_renamed_2610() {
        return this.cfr_renamed_3;
    }

    public sprzmk(sprywl arg0) throws sprpfk {
        this(sprmnm.cfr_renamed_23(arg0.cfr_renamed_568().cfr_renamed_480()).cfr_renamed_2589());
    }

    @Override
    public sprco cfr_renamed_480() {
        return this.cfr_renamed_2;
    }
}

