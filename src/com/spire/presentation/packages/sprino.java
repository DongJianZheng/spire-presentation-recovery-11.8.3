/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbno;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprkhb;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwyy;
import java.util.Iterator;

@sprtea
public class sprino
extends sprrzn {
    @sprtea
    public Integer cfr_renamed_11861() {
        String string = this.cfr_renamed_15482(sprkhb.cfr_renamed_9("'q\u0011p\u0010"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 0;
        }
        return Integer.parseInt(string);
    }

    @sprtea
    public sprino cfr_renamed_15823(sprino arg0) {
        sprino sprino2 = this;
        sprino2.cfr_renamed_15271(arg0);
        return sprino2;
    }

    @sprtea
    public sprino(String string) {
        sprino sprino2 = this;
        sprino2();
        sprino2.cfr_renamed_13207(string);
    }

    @sprtea
    public sprino() {
        super(sprwyy.cfr_renamed_9("l{WbJ`FKOkN"));
    }

    @sprtea
    public String cfr_renamed_13189() {
        return this.cfr_renamed_15482("Title");
    }

    @sprtea
    public sprino cfr_renamed_15824(boolean arg0) {
        sprino sprino2 = this;
        sprino2.cfr_renamed_15480(sprkhb.cfr_renamed_9("[\u001cn\u0005p\u0000{\u0000"), sprpkja.cfr_renamed_15716(arg0));
        return sprino2;
    }

    @sprtea
    public sprino(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_15822() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprwyy.cfr_renamed_9("l{WbJ`FKOkN"));
        sprvrx<sprino> sprvrx2 = new sprvrx<sprino>(sprdz2.size());
        sprino sprino2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprino2 = new sprino(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprino2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprbno cfr_renamed_15592() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprkhb.cfr_renamed_9("%}\u0010w\u000bp\u0017"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprbno(sprnco2);
    }

    @sprtea
    public sprino cfr_renamed_15588(sprbno arg0) {
        sprino sprino2 = this;
        sprino2.cfr_renamed_15555(arg0);
        return sprino2;
    }

    @sprtea
    public sprino cfr_renamed_13207(String arg0) {
        sprino sprino2 = this;
        sprino2.cfr_renamed_15480("Title", arg0);
        return sprino2;
    }

    @sprtea
    public sprino cfr_renamed_15825(int arg0) {
        sprino sprino2 = this;
        sprino2.cfr_renamed_15480(sprwyy.cfr_renamed_9("`aV`W"), sprpkja.cfr_renamed_15512(arg0));
        return sprino2;
    }

    @sprtea
    public Boolean cfr_renamed_15826() {
        String string = this.cfr_renamed_15482(sprkhb.cfr_renamed_9("[\u001cn\u0005p\u0000{\u0000"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }
}

