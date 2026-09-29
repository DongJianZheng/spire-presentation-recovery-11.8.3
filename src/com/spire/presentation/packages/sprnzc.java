/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprazc;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcbd;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprcue;
import com.spire.presentation.packages.sprcyc;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sprhuc;
import com.spire.presentation.packages.sprhur;
import com.spire.presentation.packages.sprite;
import com.spire.presentation.packages.sprjme;
import com.spire.presentation.packages.sprkcd;
import com.spire.presentation.packages.sprkm;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprotc;
import com.spire.presentation.packages.sprpvc;
import com.spire.presentation.packages.sprxue;

public class sprnzc
extends sprotc {
    private sprazc cfr_renamed_2;
    private sprjme cfr_renamed_3;
    private sprhtc cfr_renamed_4;

    @Override
    public spra cfr_renamed_480() {
        return this.cfr_renamed_3;
    }

    public sprmee cfr_renamed_2607() {
        return this.cfr_renamed_3.cfr_renamed_2607();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnzc(sprnte arg0) throws sprcbd {
        super(arg0);
        if (!sprkm.cfr_renamed_0.equals(arg0.cfr_renamed_696())) {
            throw new sprcbd(sprcno.cfr_renamed_9("\u0016Q;J0P!w;X:\u001e;Q!\u001e4\u001e\u0011h\u0016mul0O [&J"));
        }
        try {
            this.cfr_renamed_3 = arg0.cfr_renamed_480().cfr_renamed_119() instanceof sprbne ? sprjme.cfr_renamed_23(arg0.cfr_renamed_480()) : sprjme.cfr_renamed_23(sprxue.cfr_renamed_23(arg0.cfr_renamed_480()).cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprcbd(new StringBuilder().insert(0, sprhur.cfr_renamed_9("Y>m2`5,$cp|1~#ipo?b$i>xj,")).append(exception.getMessage()).toString(), exception);
        }
        this.cfr_renamed_4 = new sprhtc(this.cfr_renamed_3.cfr_renamed_2608());
        int n = this.cfr_renamed_4.cfr_renamed_2597();
        if (n == sprite.cfr_renamed_2.cfr_renamed_97().intValue()) {
            sprnzc sprnzc2 = this;
            this.cfr_renamed_2 = new sprhuc(this.cfr_renamed_3.cfr_renamed_2609());
            return;
        }
        if (n == sprite.cfr_renamed_0.cfr_renamed_97().intValue()) {
            this.cfr_renamed_2 = new sprkcd(this.cfr_renamed_3.cfr_renamed_2609());
            return;
        }
        if (n == sprite.cfr_renamed_4.cfr_renamed_97().intValue()) {
            this.cfr_renamed_2 = new sprpvc(this.cfr_renamed_3.cfr_renamed_2609());
            return;
        }
        if (n == sprite.cfr_renamed_3.cfr_renamed_97().intValue()) {
            this.cfr_renamed_2 = new sprcyc(this.cfr_renamed_3.cfr_renamed_2609());
            return;
        }
        throw new sprcbd(new StringBuilder().insert(0, sprcno.cfr_renamed_9("\u0000P>P:I;\u001e&['H<]0\u001e!G%[o\u001e")).append(n).toString());
    }

    public sprhtc cfr_renamed_2610() {
        return this.cfr_renamed_4;
    }

    public sprnzc(sprfud arg0) throws sprcbd {
        this(sprcue.cfr_renamed_23(arg0.cfr_renamed_568().cfr_renamed_480()).cfr_renamed_2589());
    }

    public sprazc cfr_renamed_2609() {
        return this.cfr_renamed_2;
    }
}

