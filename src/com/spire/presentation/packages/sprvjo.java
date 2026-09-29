/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbty;
import com.spire.presentation.packages.sprcwn;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprfp;
import com.spire.presentation.packages.sprgwn;
import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprmwn;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqsn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spruno;
import com.spire.presentation.packages.sprvdo;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprzio;
import com.spire.presentation.packages.sprzjo;
import java.text.DecimalFormat;
import java.util.Iterator;

@sprtea
public class sprvjo
extends spruno
implements sprfp {
    @sprtea
    public sprvjo cfr_renamed_15515(sprgwn arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492(sprtsa.cfr_renamed_9("z\u0019I\u0018l\u0015Z\u0019K\bA\u0013F"));
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480(sprbty.cfr_renamed_9("\u0019\u0014*\u0015\u000f\u00189\u0014(\u0005\"\u001e%"), arg0.toString());
        return sprvjo3;
    }

    @sprtea
    public sprvjo cfr_renamed_15159(sprcwn arg0) {
        if (arg0 == null) {
            return this;
        }
        sprvjo sprvjo2 = this;
        sprvjo2.cfr_renamed_15271(arg0);
        return sprvjo2;
    }

    @sprtea
    public sprvjo cfr_renamed_15174(sprzjo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprtsa.cfr_renamed_9("\u5b2b\u5f4a\u8d38\u6eb8\u65fb\u4ede\uff74n\u0013F\b\uff21\u4e71\u80d5\u4e46\u7a52"));
        }
        sprvjo sprvjo2 = this;
        sprvjo2.cfr_renamed_15480(sprbty.cfr_renamed_9("7$\u001f?"), arg0.toString());
        return sprvjo2;
    }

    @sprtea
    public Double cfr_renamed_2773() {
        String string = this.cfr_renamed_15482(sprtsa.cfr_renamed_9("/A\u0006M"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprbty.cfr_renamed_9("\u5b26\u53bc\uff79\u0018\u00181\u0014\uff42\u4e7c\u80b6\u4e4b\u7a31"));
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public sprdz cfr_renamed_15516() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprtsa.cfr_renamed_9("k;|\u000eI\u0012[\u001aG\u000eE"));
        sprvrx<sprmwn> sprvrx2 = new sprvrx<sprmwn>(sprdz2.size());
        sprmwn sprmwn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprmwn2 = new sprmwn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprmwn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprvjo cfr_renamed_15215(Boolean arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492(sprbty.cfr_renamed_9("\"?\u0003$\u001a."));
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480(sprtsa.cfr_renamed_9("/\\\u000eG\u0017M"), arg0.toString().toLowerCase());
        return sprvjo3;
    }

    @sprtea
    public sprvjo cfr_renamed_15157(sprmwn arg0) {
        if (arg0 == null) {
            return this;
        }
        sprvjo sprvjo2 = this;
        sprvjo2.cfr_renamed_15271(arg0);
        return sprvjo2;
    }

    @sprtea
    public Boolean cfr_renamed_15517() {
        String string = this.cfr_renamed_15482(sprbty.cfr_renamed_9("7\"\u001d'"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprqsn cfr_renamed_13973() {
        sprnco sprnco2 = this.cfr_renamed_15494("FillColor");
        if (sprnco2 == null) {
            return sprqsn.cfr_renamed_15143(0, 0, 0);
        }
        return new sprqsn(sprnco2);
    }

    @sprtea
    public sprdz cfr_renamed_15518() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprtsa.cfr_renamed_9("(M\u0004\\?G\u0018M"));
        sprvrx<sprcwn> sprvrx2 = new sprvrx<sprcwn>(sprdz2.size());
        sprcwn sprcwn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprcwn2 = new sprcwn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprcwn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprvjo cfr_renamed_15273(sprqsn arg0) {
        if (arg0 == null) {
            return this;
        }
        arg0.cfr_renamed_15519(sprbty.cfr_renamed_9("\u0018\u00059\u001e \u0014\b\u001e'\u001e9"));
        this.cfr_renamed_15271(arg0);
        return this;
    }

    @sprtea
    public sprvjo cfr_renamed_15181(sprvdo arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492(sprtsa.cfr_renamed_9("+M\u0015O\u0014\\"));
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480(sprbty.cfr_renamed_9("&.\u0018,\u0019?"), arg0.toString());
        return sprvjo3;
    }

    @sprtea
    public sprvjo cfr_renamed_15520(Double arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492(sprtsa.cfr_renamed_9("4{\u001fI\u0010M"));
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480(sprbty.cfr_renamed_9("9\u0018\u0012*\u001d."), arg0.toString());
        return sprvjo3;
    }

    @sprtea
    public sprvjo cfr_renamed_15180(sprqsn arg0) {
        if (arg0 == null) {
            return this;
        }
        arg0.cfr_renamed_15519("FillColor");
        this.cfr_renamed_15271(arg0);
        return this;
    }

    @sprtea
    public sprvjo(String arg0) {
        super(arg0);
    }

    @sprtea
    public sprvjo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprgwn cfr_renamed_15521() {
        return sprgwn.cfr_renamed_141(this.cfr_renamed_15482(sprtsa.cfr_renamed_9("z\u0019I\u0018l\u0015Z\u0019K\bA\u0013F")));
    }

    @sprtea
    public static sprvjo cfr_renamed_15522(sprkjo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprbty.cfr_renamed_9("\u00025k\u4e7c\u80b6\u4e4b\u7a31"));
        }
        sprvjo sprvjo2 = new sprvjo(sprtsa.cfr_renamed_9("(M\u0004\\3J\u0016M\u001f\\"));
        sprvjo2.cfr_renamed_15279(arg0);
        return sprvjo2;
    }

    @sprtea
    public sprvjo cfr_renamed_15286(Double arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492("LineWidth");
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480("LineWidth", arg0.toString());
        return sprvjo3;
    }

    @sprtea
    public sprzio cfr_renamed_15523(sprkjo arg0) {
        this.cfr_renamed_15519(sprbty.cfr_renamed_9("%.\t?>)\u001b.\u0012?"));
        this.cfr_renamed_15279(arg0);
        return new sprzio(this);
    }

    @sprtea
    public sprgwn cfr_renamed_15524() {
        return sprgwn.cfr_renamed_141(this.cfr_renamed_15482(sprtsa.cfr_renamed_9("k\u0014I\u000el\u0015Z\u0019K\bA\u0013F")));
    }

    @sprtea
    public Boolean cfr_renamed_15525() {
        String string = this.cfr_renamed_15482(sprbty.cfr_renamed_9("\"?\u0003$\u001a."));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprvjo cfr_renamed_15170(Double arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprtsa.cfr_renamed_9("\u5b2b\u53df\uff74{\u0015R\u0019\uff21\u4e71\u80d5\u4e46\u7a52"));
        }
        DecimalFormat decimalFormat = new DecimalFormat(sprbty.cfr_renamed_9("AeRhRh"));
        sprvjo sprvjo2 = this;
        sprvjo2.cfr_renamed_15480(sprtsa.cfr_renamed_9("/A\u0006M"), decimalFormat.format(arg0));
        return sprvjo2;
    }

    @sprtea
    public Boolean cfr_renamed_15526() {
        String string = this.cfr_renamed_15482("Italic");
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprvjo() {
        super("Text");
    }

    @sprtea
    public Double cfr_renamed_15527() {
        String string = this.cfr_renamed_15482(sprbty.cfr_renamed_9("9\u0018\u0012*\u001d."));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 1.0;
        }
        return sprssja.cfr_renamed_13364(string, sprvfja.cfr_renamed_12042());
    }

    @sprtea
    public sprvjo cfr_renamed_15179(Boolean arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492(sprtsa.cfr_renamed_9(":A\u0010D"));
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480(sprbty.cfr_renamed_9("7\"\u001d'"), arg0.toString().toLowerCase());
        return sprvjo3;
    }

    @sprtea
    public sprvjo cfr_renamed_15528(sprgwn arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492(sprtsa.cfr_renamed_9("k\u0014I\u000el\u0015Z\u0019K\bA\u0013F"));
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480(sprbty.cfr_renamed_9("\b\u0019*\u0003\u000f\u00189\u0014(\u0005\"\u001e%"), arg0.toString());
        return sprvjo3;
    }

    @sprtea
    public sprvjo cfr_renamed_15182(Boolean arg0) {
        if (arg0 == null) {
            sprvjo sprvjo2 = this;
            sprvjo2.cfr_renamed_15492("Italic");
            return sprvjo2;
        }
        sprvjo sprvjo3 = this;
        sprvjo3.cfr_renamed_15480("Italic", arg0.toString());
        return sprvjo3;
    }

    @sprtea
    public sprqsn cfr_renamed_15529() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprtsa.cfr_renamed_9("{\bZ\u0013C\u0019k\u0013D\u0013Z"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprqsn(sprnco2);
    }

    @sprtea
    public sprzjo cfr_renamed_13257() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482(sprbty.cfr_renamed_9("7$\u001f?")));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprvjo cfr_renamed_15530(long l) {
        void arg0;
        return this.cfr_renamed_15174(new sprzjo((long)arg0));
    }

    @sprtea
    public sprvdo cfr_renamed_15513() {
        return sprvdo.cfr_renamed_141(this.cfr_renamed_15482(sprtsa.cfr_renamed_9("+M\u0015O\u0014\\")));
    }
}

