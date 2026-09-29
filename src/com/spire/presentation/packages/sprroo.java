/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbw;
import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrsq;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprxjo;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class sprroo
extends sprrzn {
    @sprtea
    public sprroo cfr_renamed_15293(Double arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprsso.cfr_renamed_9("\u77dc\u918f\u56c0\u508f\u76ba\u9a98\u5e98\uff48v%W'V4\uff37\u4e4d\u80c3\u4e7a\u7a44"));
        }
        sprroo sprroo2 = this;
        sprroo2.cfr_renamed_15480("Height", arg0.toString());
        return sprroo2;
    }

    @sprtea
    public sprroo cfr_renamed_15294(Double arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprrsq.cfr_renamed_9("\u77f6\u9198\u56ea\u5098\u7690\u5bea\u5eb2\uff5fC>p#|\uff5e\u4e19\u80aa\u4e2e\u7a2d"));
        }
        sprroo sprroo2 = this;
        sprroo2.cfr_renamed_15480("Width", arg0.toString());
        return sprroo2;
    }

    @sprtea
    public sprroo cfr_renamed_15772(sprxjo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprsso.cfr_renamed_9("\u51c5\u5b87\u76c4\u77dc\u918f\u63f1\u8fb0\uff36\u0003Q.J%P4\uff37\u4e4d\u80c3\u4e7a\u7a44"));
        }
        sprroo sprroo2 = this;
        sprroo2.cfr_renamed_15555(arg0);
        return sprroo2;
    }

    @sprtea
    public sprroo cfr_renamed_15608(sprzjo arg0) {
        sprroo sprroo2 = this;
        sprroo2.cfr_renamed_15538("Thumbnail", arg0.toString());
        return sprroo2;
    }

    @sprtea
    public Double cfr_renamed_1452() {
        String string = this.cfr_renamed_15482("Height");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprrsq.cfr_renamed_9("\u6828\u5f58\u974a\u6c82\u65f4\u6c82\u83a3\u5381\u5224\u77b5\u91db\u56a9\u50db\u76d3\u5ba9\u5ef1\uff1c\u001fq>s?`\uff5e"));
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public sprroo(String arg0) {
        super(arg0);
    }

    @sprtea
    public Double cfr_renamed_1942() {
        String string = this.cfr_renamed_15482("Width");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprsso.cfr_renamed_9("\u6802\u5f4f\u9760\u6c95\u65de\u6c95\u8389\u5396\u520e\u77a2\u91f1\u56be\u50f1\u76c4\u5b83\u5ee6\uff36\u0017W$J(\uff37"));
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public sprxjo cfr_renamed_480() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprrsq.cfr_renamed_9("\u0014{9`2z#"));
        if (sprnco2 == null) {
            throw new IllegalArgumentException(sprsso.cfr_renamed_9("\u6c9f\u6749\u6240\u5270}/P4[.J\u5103\u7d1e"));
        }
        return new sprxjo(sprnco2);
    }

    @sprtea
    public sprroo cfr_renamed_15773(sprbw arg0) {
        if (arg0 == null) {
            return this;
        }
        sprnco sprnco2 = this.cfr_renamed_15494(sprrsq.cfr_renamed_9("\u0014{9`2z#"));
        sprxjo sprxjo2 = sprnco2 == null ? new sprxjo() : new sprxjo(sprnco2);
        sprroo sprroo2 = this;
        sprxjo2.cfr_renamed_15197(arg0);
        sprroo2.cfr_renamed_15555(sprxjo2);
        return sprroo2;
    }

    @sprtea
    public sprzjo cfr_renamed_15691() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15499(sprsso.cfr_renamed_9("\u0013K\"M4W4K4W/P")));
    }

    @sprtea
    public sprkjo cfr_renamed_6005() {
        return this.cfr_renamed_15537();
    }

    @sprtea
    public sprroo cfr_renamed_15263(sprkjo arg0) {
        sprroo sprroo2 = this;
        sprroo2.cfr_renamed_15279(arg0);
        return sprroo2;
    }

    @sprtea
    public sprroo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprroo() {
        super(sprrsq.cfr_renamed_9("\u0001q4`8f\u0010"));
    }

    @sprtea
    public sprzjo cfr_renamed_15607() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15499("Thumbnail"));
    }

    @sprtea
    public sprroo cfr_renamed_15695(sprzjo arg0) {
        sprroo sprroo2 = this;
        sprroo2.cfr_renamed_15538(sprsso.cfr_renamed_9("\u0013K\"M4W4K4W/P"), arg0.toString());
        return sprroo2;
    }
}

