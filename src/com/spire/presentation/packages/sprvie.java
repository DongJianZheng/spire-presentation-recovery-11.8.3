/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgzda;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprkge;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprvie
extends sprkra {
    private BigInteger cfr_renamed_91;
    private sprice cfr_renamed_0;
    private sprrpe cfr_renamed_1;
    private sprice cfr_renamed_2;
    private sprkge cfr_renamed_3;
    private String cfr_renamed_4;

    public sprrpe cfr_renamed_4478() {
        return this.cfr_renamed_1;
    }

    public sprice cfr_renamed_4479() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprvie(sprkge sprkge2, BigInteger bigInteger, sprrpe sprrpe2, sprice sprice2, String string, sprice sprice3) {
        void arg5;
        void arg1;
        void arg4;
        void arg2;
        void arg0;
        sprvie sprvie2 = this;
        sprvie sprvie3 = this;
        sprvie sprvie4 = this;
        sprvie4.cfr_renamed_3 = arg0;
        sprvie4.cfr_renamed_1 = arg2;
        sprvie3.cfr_renamed_4 = arg4;
        sprvie3.cfr_renamed_91 = arg1;
        sprvie2.cfr_renamed_0 = arg5;
        sprvie2.cfr_renamed_2 = sprice2;
    }

    public BigInteger cfr_renamed_4480() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprvie sprvie2 = this;
        sprlre2.cfr_renamed_49(sprvie2.cfr_renamed_3);
        if (sprvie2.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, new sprooe(this.cfr_renamed_91)));
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_1));
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 3, new spraoe(this.cfr_renamed_4, true)));
        }
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 4, this.cfr_renamed_0));
        }
        return new sprpse(sprlre2);
    }

    public sprkge cfr_renamed_4481() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprvie(sprbne sprbne2) {
        spryte spryte2;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgzda.cfr_renamed_9("!\u0000\u0007A\u0010\u0004\u0012\u0014\u0006\u000f\u0000\u0004C\u0012\n\u001b\u0006[C")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        this.cfr_renamed_3 = sprkge.cfr_renamed_23(enumeration.nextElement());
        block7: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_91 = sprooe.cfr_renamed_341(spryte2, false).cfr_renamed_97();
                    continue block7;
                }
                case 1: {
                    this.cfr_renamed_1 = sprrpe.cfr_renamed_341(spryte2, false);
                    continue block7;
                }
                case 2: {
                    this.cfr_renamed_2 = sprice.cfr_renamed_341(spryte2, true);
                    continue block7;
                }
                case 3: {
                    this.cfr_renamed_4 = spraoe.cfr_renamed_341(spryte2, false).cfr_renamed_314();
                    continue block7;
                }
                case 4: {
                    this.cfr_renamed_0 = sprice.cfr_renamed_341(spryte2, true);
                    continue block7;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpch.cfr_renamed_9("H-nl~-mld9g.o>0l")).append(spryte2.cfr_renamed_312()).toString());
    }

    public static sprvie cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprvie) {
            return (sprvie)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprvie((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprgzda.cfr_renamed_9("\n\r\u000f\u0004\u0004\u0000\u000fA\f\u0003\t\u0004\u0000\u0015C\b\rA\u0004\u0004\u0017(\r\u0012\u0017\u0000\r\u0002\u0006[C")).append(arg0.getClass().getName()).toString());
    }

    public String cfr_renamed_4482() {
        return this.cfr_renamed_4;
    }

    public sprice cfr_renamed_4483() {
        return this.cfr_renamed_2;
    }
}

