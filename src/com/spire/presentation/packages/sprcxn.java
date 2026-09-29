/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdo;
import com.spire.presentation.packages.sprgxn;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprzao;
import java.util.Iterator;

@sprtea
public class sprcxn
extends sprtsn {
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprcxn(String string, sprtsn sprtsn2) {
        void arg1;
        void arg0;
        sprcxn sprcxn2 = this;
        super((String)arg0, (sprtsn)arg1);
        sprcxn2.cfr_renamed_4 = 0;
        sprcxn2.cfr_renamed_15343();
    }

    private /* synthetic */ void cfr_renamed_15343() {
        sprvrx sprvrx2 = this.cfr_renamed_119.cfr_renamed_15309();
        if (sprvrx2 != null) {
            Iterator iterator = sprvrx2.iterator();
            while (iterator.hasNext()) {
                int n;
                String string = ((sprfdo)iterator.next()).cfr_renamed_313();
                if (!sprraia.cfr_renamed_13266(string, "Sign_", (short)4) || this.cfr_renamed_4 > (n = Integer.parseInt(string.replace("Sign_", "")))) continue;
                this.cfr_renamed_4 = n + 1;
            }
        }
    }

    @sprtea
    public sprgxn cfr_renamed_7802() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("Signatures.xml");
        return new sprgxn(sprnco2);
    }

    @sprtea
    public sprzao cfr_renamed_15344(String arg0) throws Exception {
        sprzao sprzao2 = new sprzao(arg0, this);
        return (sprzao)this.cfr_renamed_15335(arg0, sprzao2);
    }

    @sprtea
    public sprzao cfr_renamed_15345() throws Exception {
        String string = new StringBuilder().insert(0, "Sign_").append(this.cfr_renamed_4).toString();
        sprcxn sprcxn2 = this;
        ++sprcxn2.cfr_renamed_4;
        sprzao sprzao2 = new sprzao(string, this);
        return (sprzao)sprcxn2.cfr_renamed_15326(string, sprzao2);
    }

    @sprtea
    public sprzao cfr_renamed_15346(Integer arg0) throws Exception {
        if (arg0 == null || arg0 <= 0) {
            throw new NumberFormatException(sprsly.cfr_renamed_9("\u7b09\u547f\u5bce\u561a\u001e\u001c\u0013\u0017\u000f\u5fb7\u980c\u5955\u4ef9B"));
        }
        String string = new StringBuilder().insert(0, "Sign_").append(arg0).toString();
        sprzao sprzao2 = new sprzao(string, this);
        return (sprzao)this.cfr_renamed_15335(string, sprzao2);
    }

    @sprtea
    public sprcxn cfr_renamed_15347(sprgxn arg0) {
        sprcxn sprcxn2 = this;
        sprcxn2.cfr_renamed_15330("Signatures.xml", arg0);
        return sprcxn2;
    }
}

