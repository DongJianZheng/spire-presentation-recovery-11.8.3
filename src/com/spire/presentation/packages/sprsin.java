/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprehn;
import com.spire.presentation.packages.sprenn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfsn;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprkln;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpin;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsqn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvzca;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwln;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprzmn;
import java.util.Iterator;

@sprtea
public abstract class sprsin
extends sprfsn {
    private sprpdja cfr_renamed_2;
    public sprwin cfr_renamed_3;
    private sprjeka cfr_renamed_4;

    @sprtea
    public abstract void cfr_renamed_13099(sprxln var1);

    @sprtea
    public abstract void cfr_renamed_13096(sprmrn var1);

    @sprtea
    public abstract void cfr_renamed_13124(sprson var1);

    public void cfr_renamed_13388(String arg0, sprhhp arg1, boolean arg2) {
        Iterator iterator;
        sprkln sprkln2 = this.cfr_renamed_2820().cfr_renamed_13389(arg1.cfr_renamed_13261());
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            iterator2 = iterator;
            sprkln2.cfr_renamed_13390(n, arg2);
        }
    }

    @sprtea
    public abstract void cfr_renamed_13382(sprsqn var1);

    @sprtea
    public abstract void cfr_renamed_13385(sprwln var1);

    @sprtea
    public abstract void cfr_renamed_12699();

    public void cfr_renamed_13391(sprenn arg0) {
        sprehn sprehn2 = spresca.cfr_renamed_11777(arg0, sprehn.class);
        if (sprehn2 == null || this.cfr_renamed_4.size() <= 0 || this.cfr_renamed_4.cfr_renamed_12398() != sprehn2) {
            return;
        }
        sprsin sprsin2 = this;
        sprsin2.cfr_renamed_3.cfr_renamed_12439();
        sprsin2.cfr_renamed_4.cfr_renamed_12514();
    }

    @sprtea
    public abstract void cfr_renamed_13392(sprpin var1);

    public sprsin(sprcjn arg0) {
        super(arg0);
        sprsin sprsin2 = this;
        this.cfr_renamed_4 = new sprjeka();
        sprsin2.cfr_renamed_2 = new sprpdja();
        this.cfr_renamed_3 = new sprwin(this.cfr_renamed_2, arg0.cfr_renamed_13097().cfr_renamed_12457());
    }

    @sprtea
    public abstract void cfr_renamed_13393(sprzmn var1);

    @sprtea
    public abstract void cfr_renamed_13386(sprthn var1);

    @sprtea
    public abstract void cfr_renamed_13387(sprmrn var1);

    @sprtea
    public abstract void cfr_renamed_13127();

    public void cfr_renamed_13394(sprenn arg0, boolean arg1) {
        boolean bl;
        String string;
        String string2;
        String string3;
        String string4;
        sprehn sprehn2 = spresca.cfr_renamed_11777(arg0, sprehn.class);
        if (sprehn2 == null) {
            return;
        }
        this.cfr_renamed_3.cfr_renamed_12423("a");
        if (sprehn2.cfr_renamed_13234()) {
            Object[] objectArray = new Object[1];
            objectArray[0] = sprehn2.cfr_renamed_4750();
            string4 = sprraia.cfr_renamed_11562(sprvzca.cfr_renamed_9("C\u0003P\u0005"), objectArray);
        } else {
            string4 = string3 = sprehn2.cfr_renamed_4750();
        }
        if (arg1) {
            string2 = "xlink:href";
            string = string3;
        } else {
            string2 = "href";
            string = string3;
        }
        this.cfr_renamed_3.cfr_renamed_12405(string2, string);
        String string5 = sprehn2.cfr_renamed_13395() != null ? sprraia.cfr_renamed_13080(sprehn2.cfr_renamed_13395()) : "";
        boolean bl2 = bl = !sprraia.cfr_renamed_11730(string5, "") && !sprald.cfr_renamed_9("\u0018\\\"C!").equals(string5) && !sprvzca.cfr_renamed_9("'\u0010\u0019\u0012\u001d\u000e\f").equals(string5) && !sprald.cfr_renamed_9("p3@7").equals(string5);
        if (bl) {
            this.cfr_renamed_3.cfr_renamed_12405("target", sprvzca.cfr_renamed_9("?\u001a\f\u0019\u000e\u0013"));
        }
        this.cfr_renamed_4.cfr_renamed_12516(sprehn2);
    }

    @sprtea
    public void cfr_renamed_13396() {
        sprsin sprsin2 = this;
        sprsin2.cfr_renamed_2.cfr_renamed_11548(0L);
        sprsin sprsin3 = this;
        sprsin2.cfr_renamed_13380().cfr_renamed_12427(sprsin3.cfr_renamed_2, true);
        sprsin3.cfr_renamed_2.cfr_renamed_2637();
    }
}

