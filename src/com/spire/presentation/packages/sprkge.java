/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprkyp;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprylp;
import java.util.Enumeration;

public class sprkge
extends sprkra
implements sprkj {
    private sprbne cfr_renamed_2;
    private sprice cfr_renamed_3;
    private sprice cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkge(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprylp.cfr_renamed_9("K\u000fmNz\u000bx\u001bl\u0000j\u000b)\u001d`\u0014lT)")).append(arg0.cfr_renamed_84()).toString());
        }
        if (!(arg0.cfr_renamed_85(0) instanceof sprx)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprkyp.cfr_renamed_9("6\u0017\u0010V\u001b\u0014\u001e\u0013\u0017\u0002T\u0013\u001a\u0015\u001b\u0003\u001a\u0002\u0011\u0004\u0011\u0012NV")).append(arg0.cfr_renamed_85(0).getClass()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprice.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprbne.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprice[] cfr_renamed_4484() {
        Enumeration enumeration;
        sprice[] spriceArray = new sprice[this.cfr_renamed_2.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            spriceArray[++n] = sprice.cfr_renamed_23(enumeration3.nextElement());
        }
        return spriceArray;
    }

    public static sprkge cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprkge) {
            return (sprkge)arg0;
        }
        if (arg0 instanceof sprx) {
            return new sprkge(sprice.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprbne) {
            return new sprkge((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprylp.cfr_renamed_9("`\u0002e\u000bn\u000feNf\fc\u000bj\u001a)\u0007gNn\u000b}'g\u001d}\u000fg\rlT)")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprkge(sprice sprice2, sprbne sprbne2) {
        void arg0;
        sprkge sprkge2 = this;
        sprkge2.cfr_renamed_4 = arg0;
        sprkge2.cfr_renamed_2 = sprbne2;
    }

    public sprice cfr_renamed_4485() {
        return this.cfr_renamed_3;
    }

    public sprkge(sprice sprice2) {
        this.cfr_renamed_3 = sprice2;
    }

    public sprice cfr_renamed_4486() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprkge(String string) {
        this(new sprice((String)arg0));
        void arg0;
    }
}

