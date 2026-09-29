/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbmo;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprdjo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.spripe;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruko;
import com.spire.presentation.packages.sprzoo;

@sprtea
public abstract class sprzeo {
    private sprdfo cfr_renamed_3;
    @sprtea
    public sprlmo cfr_renamed_4;

    public sprdfo cfr_renamed_3365() {
        return this.cfr_renamed_3;
    }

    public sprmrn cfr_renamed_13891(sprphja arg0, sprcno arg1) {
        sprmrn sprmrn2 = this.cfr_renamed_16785(arg1);
        if (sprmrn2 == null) {
            return null;
        }
        this.cfr_renamed_16823(sprmrn2, arg0);
        return sprmrn2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ sprmrn cfr_renamed_16824(sprcno arg0) {
        sprzeo sprzeo2 = this;
        return new sprbmo(sprzeo2.cfr_renamed_3, sprzeo2.cfr_renamed_4).cfr_renamed_16241(false, arg0.cfr_renamed_16227());
    }

    public abstract sprmrn cfr_renamed_16787(sprcno var1);

    private /* synthetic */ void cfr_renamed_16823(sprmrn arg0, sprphja arg1) {
        if (arg0.cfr_renamed_13094() == null) {
            arg0.cfr_renamed_12511(new sprqgp());
        }
        sprqgp sprqgp2 = sprqgp.cfr_renamed_16234(sprgeja.cfr_renamed_16235(this.cfr_renamed_3.cfr_renamed_16236()), new sprgeja(sprsuja.cfr_renamed_13377(), arg1));
        arg0.cfr_renamed_13094().cfr_renamed_12634(sprqgp2, 1);
    }

    public sprmrn cfr_renamed_16785(sprcno arg0) {
        if (arg0.cfr_renamed_16821()) {
            sprzeo sprzeo2 = this;
            sprmrn sprmrn2 = sprzeo2.cfr_renamed_16787(arg0);
            if (!sprzeo2.cfr_renamed_4.cfr_renamed_16193() || !arg0.cfr_renamed_16788()) {
                return sprmrn2;
            }
            this.cfr_renamed_16825();
        }
        return this.cfr_renamed_16824(arg0);
    }

    public static sprzeo cfr_renamed_13890(byte[] arg0, sprlmo arg1) {
        return sprzeo.cfr_renamed_16826(new sprdfo(arg0), arg1);
    }

    public static sprzeo cfr_renamed_16826(sprdfo arg0, sprlmo arg1) {
        switch (arg0.cfr_renamed_13698()) {
            case 1: 
            case 2: {
                return new sprzoo(arg0, arg1);
            }
            case 4: 
            case 5: {
                return new sprdjo(arg0, arg1);
            }
            case 3: {
                return new spruko(arg0, arg1);
            }
        }
        throw new IllegalStateException(sprhtc.cfr_renamed_9("\u0015{+{/b.5-p4t&|,p`a9e%;"));
    }

    private /* synthetic */ void cfr_renamed_16825() {
        this.cfr_renamed_4.cfr_renamed_12479().cfr_renamed_12477(1, 3, spripe.cfr_renamed_9("\u0006]?Y-Q']k[*V%W?\u0018)]k[$J9](L'AkJ.V/]9]/\u0018*KkN.[?W9\u0018,J*H#Q(Ke\u0018\rY'T)Y(SkL$\u0018)Q?U*HkJ.V/]9Q%_kO\"T'\u0018)]kH.J-W9U.\\e"));
    }

    /*
     * WARNING - void declaration
     */
    public sprzeo(sprdfo sprdfo2, sprlmo sprlmo2) {
        void arg1;
        sprzeo sprzeo2 = this;
        sprzeo2.cfr_renamed_4 = arg1;
        sprzeo2.cfr_renamed_3 = sprdfo2;
    }
}

