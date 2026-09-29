/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralz;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprimz;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;
import java.util.Enumeration;

public class sprfie
extends sprkra {
    private sprxte cfr_renamed_2;
    private sprxte cfr_renamed_3;
    private sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprfie(sprxte sprxte2, sprxte sprxte3, sprbne sprbne2) {
        void arg1;
        void arg0;
        void arg2;
        if (sprbne2 != null && arg2.cfr_renamed_84() > 6) {
            throw new IllegalArgumentException(sprimz.cfr_renamed_9("jiir{j:g~bhciu:koun&yitr{ot&vciu:rrgt&,&irhotai"));
        }
        if (arg0 != null) {
            this.cfr_renamed_2 = sprxte.cfr_renamed_23(arg0.cfr_renamed_119());
        }
        if (arg1 != null) {
            this.cfr_renamed_3 = sprxte.cfr_renamed_23(arg1.cfr_renamed_119());
        }
        if (arg2 != null) {
            this.cfr_renamed_4 = sprbne.cfr_renamed_23(arg2.cfr_renamed_119());
        }
    }

    public sprxte cfr_renamed_4655() {
        return this.cfr_renamed_2;
    }

    public sprbne cfr_renamed_4479() {
        return this.cfr_renamed_4;
    }

    public static sprfie cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprfie) {
            return (sprfie)arg0;
        }
        return new sprfie(sprbne.cfr_renamed_23(arg0));
    }

    public sprxte cfr_renamed_4656() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprfie(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        block5: while (enumeration.hasMoreElements()) {
            sprhse sprhse2 = (sprhse)enumeration.nextElement();
            switch (sprhse2.cfr_renamed_312()) {
                case 0: {
                    sprice sprice2 = sprice.cfr_renamed_341(sprhse2, true);
                    sprfie sprfie2 = this;
                    sprfie2.cfr_renamed_2 = new sprxte(sprice2.cfr_renamed_314());
                    continue block5;
                }
                case 1: {
                    sprice sprice3 = sprice.cfr_renamed_341(sprhse2, true);
                    this.cfr_renamed_3 = new sprxte(sprice3.cfr_renamed_314());
                    continue block5;
                }
                case 2: {
                    sprfie sprfie3;
                    sprfie sprfie4 = this;
                    if (sprhse2.cfr_renamed_4567()) {
                        sprfie4.cfr_renamed_4 = sprbne.cfr_renamed_341(sprhse2, true);
                        sprfie3 = this;
                    } else {
                        sprfie4.cfr_renamed_4 = sprbne.cfr_renamed_341(sprhse2, false);
                        sprfie3 = this;
                    }
                    if (sprfie3.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_84() > 6) throw new IllegalArgumentException(spralz.cfr_renamed_9("\rM\u000eV\u001cN]C\u0019F\u000fG\u000eQ]O\bQ\t\u0002\u001eM\u0013V\u001cK\u0013\u0002\u0011G\u000eQ]V\u0015C\u0013\u0002K\u0002\u000eV\u000fK\u0013E\u000e"));
                    continue block5;
                }
            }
        }
        return;
        throw new IllegalArgumentException(sprimz.cfr_renamed_9("sjvc}gv&ng}"));
    }
}

