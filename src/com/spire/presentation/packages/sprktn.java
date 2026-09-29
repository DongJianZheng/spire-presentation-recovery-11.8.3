/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprdbo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhco;
import com.spire.presentation.packages.sprhdo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqjba;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxbo;
import java.util.Iterator;

@sprtea
public class sprktn
extends sprrzn {
    @sprtea
    public sprktn cfr_renamed_15550(sprxbo arg0) {
        if (arg0 == null) {
            return this;
        }
        sprktn sprktn2 = this;
        sprktn2.cfr_renamed_15271(arg0);
        return sprktn2;
    }

    @sprtea
    public sprktn cfr_renamed_15551(String arg0) {
        sprktn sprktn2 = this;
        sprktn2.cfr_renamed_15538(sprqjba.cfr_renamed_9("v:B=D'P!@\u0017D'@\u0007L>@"), arg0);
        return sprktn2;
    }

    @sprtea
    public sprktn cfr_renamed_15552(String arg0) {
        sprktn sprktn2 = this;
        sprktn2.cfr_renamed_15538(sprawc.cfr_renamed_9("RJfM`WtQdndWiLe"), arg0);
        return sprktn2;
    }

    @sprtea
    public sprktn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprhdo cfr_renamed_12815() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprqjba.cfr_renamed_9("\u0001@5@!@=F6V"));
        if (sprnco2 == null) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("\u5304\u51a6\u6586\u4ed5\u8ba0\u7bb4\u6241\u5fb4\u7685\u647b\u8980\u8b93\u5f54\u5234\u8869\uff2bSFgFsFo@dP\uff08\u4e19\u7a7b"));
        }
        return new sprhdo(sprnco2);
    }

    @sprtea
    public String cfr_renamed_15553() {
        return this.cfr_renamed_15499(sprqjba.cfr_renamed_9("v:B=D'P!@\u001e@'M<A"));
    }

    @sprtea
    public sprktn cfr_renamed_15554(sprhco arg0) {
        if (arg0 == null) {
            String[] stringArray = new String[1];
            stringArray[0] = sprawc.cfr_renamed_9("pdBm");
            this.cfr_renamed_15546(stringArray);
            return this;
        }
        sprktn sprktn2 = this;
        sprktn2.cfr_renamed_15555(arg0);
        return sprktn2;
    }

    @sprtea
    public sprdbo cfr_renamed_144() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprqjba.cfr_renamed_9("\u0003W<S:A6W"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprdbo(sprnco2);
    }

    @sprtea
    public sprhco cfr_renamed_15349() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprawc.cfr_renamed_9("pdBm"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprhco(sprnco2);
    }

    @sprtea
    public sprktn cfr_renamed_15556(sprdbo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqjba.cfr_renamed_9("\u523e\u5ea9\u7b5b\u545e\u65d3\u6213\u750d\u76d7\u7b5b\u7ab3\u7ee1\u4ea5\u63f5\u4fc8\u8020\u4fb2\u604a\uff5bu!J%L7@!\uff2c\u4e69\u7a5f"));
        }
        sprktn sprktn2 = this;
        sprktn2.cfr_renamed_15555(arg0);
        return sprktn2;
    }

    @sprtea
    public sprktn() {
        super(sprawc.cfr_renamed_9("phDoFejoEn"));
    }

    @sprtea
    public sprktn cfr_renamed_15557(sprhdo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqjba.cfr_renamed_9("\u5320\u51d6\u65a2\u4ea5\u8b84\u7bc4\u6265\u5fc4\u76a1\u640b\u89a4\u8be3\u5f70\u5244\u884d\uff5bw6C6W6K0@ \uff2c\u4e69\u7a5f"));
        }
        sprktn sprktn2 = this;
        sprktn2.cfr_renamed_15555(arg0);
        return sprktn2;
    }

    @sprtea
    public String cfr_renamed_15558() {
        return this.cfr_renamed_15499(sprawc.cfr_renamed_9("RJfM`WtQdg`WdwhNd"));
    }

    @sprtea
    public sprdz cfr_renamed_15559() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprqjba.cfr_renamed_9("\u0000Q2H#d=K<Q"));
        sprvrx<sprxbo> sprvrx2 = new sprvrx<sprxbo>(sprdz2.size());
        sprxbo sprxbo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprxbo2 = new sprxbo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprxbo2);
        }
        return sprvrx2;
    }
}

