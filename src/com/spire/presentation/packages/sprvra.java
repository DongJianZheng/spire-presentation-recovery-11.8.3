/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxm;
import com.spire.presentation.packages.sprdae;
import com.spire.presentation.packages.spreva;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprnua;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpdo;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprtpa;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.sprxva;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class sprvra {
    public int cfr_renamed_119;
    public sprlre cfr_renamed_91;
    public int cfr_renamed_0;
    private Set cfr_renamed_1;
    private Set cfr_renamed_2;
    private Set cfr_renamed_3;
    private sprtma cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpa cfr_renamed_638(sprnua arg0, BigInteger arg1, Date arg2, String arg3) throws sprrua {
        sprnte sprnte2;
        if (arg2 == null) {
            throw new spreva(sprcxm.cfr_renamed_9("\rJ<\u0002-K4GyQ6W+A<\u00020QyL6VyC/C0N8@5Gw"), 512);
        }
        sprvra sprvra2 = this;
        arg0.cfr_renamed_639(sprvra2.cfr_renamed_3, sprvra2.cfr_renamed_2, this.cfr_renamed_1);
        this.cfr_renamed_0 = 0;
        sprvra sprvra3 = this;
        sprvra3.cfr_renamed_91 = new sprlre();
        if (arg3 != null) {
            this.cfr_renamed_640(arg3);
        }
        sprkme sprkme2 = this.cfr_renamed_641();
        try {
            sprnte2 = this.cfr_renamed_4.cfr_renamed_607(arg0, arg1, arg2).cfr_renamed_637().cfr_renamed_568();
        }
        catch (sprrua sprrua2) {
            throw sprrua2;
        }
        catch (Exception exception) {
            throw new sprrua(sprpdo.cfr_renamed_9("O*v&h7z.kco,p&uci&x&r5~'; z-u,ocy&; t-m&i7~';7tcX,u7~-o\nu%t"), exception);
        }
        sprdae sprdae2 = new sprdae(sprkme2, sprnte2);
        try {
            return new sprtpa(sprdae2);
        }
        catch (IOException iOException) {
            throw new sprrua(sprcxm.cfr_renamed_9(":P<C-G=\u0002;C=N \u0002?M+O8V-G=\u0002+G*R6L*Gx"));
        }
    }

    public sprvra(sprtma arg0, Set arg1) {
        this(arg0, arg1, null, null);
    }

    public sprtpa cfr_renamed_642(Exception arg0) throws sprrua {
        if (arg0 instanceof spreva) {
            return this.cfr_renamed_643(2, ((spreva)arg0).cfr_renamed_566(), arg0.getMessage());
        }
        return this.cfr_renamed_643(2, 0x40000000, arg0.getMessage());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpa cfr_renamed_607(sprnua arg0, BigInteger arg1, Date arg2) throws sprrua {
        try {
            return this.cfr_renamed_638(arg0, arg1, arg2, sprpdo.cfr_renamed_9("\fk&i\"o*t-;\fp\"b"));
        }
        catch (Exception exception) {
            return this.cfr_renamed_642(exception);
        }
    }

    private /* synthetic */ sprkme cfr_renamed_641() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_0));
        if (this.cfr_renamed_91.cfr_renamed_84() > 0) {
            sprlre2.cfr_renamed_49(sprtse.cfr_renamed_23(new sprpse(this.cfr_renamed_91)));
        }
        if (this.cfr_renamed_119 != 0) {
            sprvra sprvra2 = this;
            sprxva sprxva2 = new sprxva(sprvra2, sprvra2.cfr_renamed_119);
            sprlre2.cfr_renamed_49(sprxva2);
        }
        return sprkme.cfr_renamed_23(new sprpse(sprlre2));
    }

    public sprvra(sprtma arg0, Set arg1, Set arg2) {
        this(arg0, arg1, arg2, null);
    }

    private /* synthetic */ void cfr_renamed_644(int arg0) {
        this.cfr_renamed_119 |= arg0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpa cfr_renamed_643(int n, int n2, String string) throws sprrua {
        void arg1;
        void arg0;
        this.cfr_renamed_0 = arg0;
        sprvra sprvra2 = this;
        this.cfr_renamed_91 = new sprlre();
        this.cfr_renamed_644((int)arg1);
        if (string != null) {
            void arg2;
            this.cfr_renamed_640((String)arg2);
        }
        sprkme sprkme2 = this.cfr_renamed_641();
        sprdae sprdae2 = new sprdae(sprkme2, null);
        try {
            return new sprtpa(sprdae2);
        }
        catch (IOException iOException) {
            throw new sprrua(sprcxm.cfr_renamed_9(":P<C-G=\u0002;C=N \u0002?M+O8V-G=\u0002+G*R6L*Gx"));
        }
    }

    private /* synthetic */ void cfr_renamed_640(String arg0) {
        this.cfr_renamed_91.cfr_renamed_49(new sprxte(arg0));
    }

    private /* synthetic */ Set cfr_renamed_645(Set arg0) {
        if (arg0 == null) {
            return arg0;
        }
        HashSet<sprtzd> hashSet = new HashSet<sprtzd>(arg0.size());
        for (Object e : arg0) {
            if (e instanceof String) {
                hashSet.add(new sprtzd((String)e));
                continue;
            }
            hashSet.add((sprtzd)e);
        }
        return hashSet;
    }

    public sprtpa cfr_renamed_646(sprnua arg0, BigInteger arg1, Date arg2) throws sprrua {
        return this.cfr_renamed_638(arg0, arg1, arg2, null);
    }

    public sprvra(sprtma sprtma2, Set set, Set set2, Set set3) {
        sprvra sprvra2 = this;
        this.cfr_renamed_4 = sprtma2;
        this.cfr_renamed_3 = this.cfr_renamed_645(set);
        sprvra2.cfr_renamed_2 = sprvra2.cfr_renamed_645(set2);
        sprvra2.cfr_renamed_1 = sprvra2.cfr_renamed_645(set3);
        sprvra sprvra3 = this;
        sprvra3.cfr_renamed_91 = new sprlre();
    }
}

