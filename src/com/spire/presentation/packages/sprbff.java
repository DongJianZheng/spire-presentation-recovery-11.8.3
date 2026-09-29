/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprodf;
import com.spire.presentation.packages.sprohf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqgf;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprrgm;
import com.spire.presentation.packages.sprri;
import com.spire.presentation.packages.sprsdf;
import com.spire.presentation.packages.sprstq;
import com.spire.presentation.packages.sprsvl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtxe;
import com.spire.presentation.packages.spruef;
import com.spire.presentation.packages.sprug;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;

public class sprbff {
    private final byte[] cfr_renamed_0;
    private sprri cfr_renamed_1;
    private final sprrgm cfr_renamed_2;
    private final sprjj cfr_renamed_3;
    private final sprqxe cfr_renamed_4;

    public void cfr_renamed_5370(sprqxe arg0, byte[] arg1) throws sprsdf {
        if (arg1 != null && !sproze.cfr_renamed_92(arg1, arg0.cfr_renamed_577().cfr_renamed_581())) {
            throw new sprsdf(sprstq.cfr_renamed_9("91 =>,,5=x%9>0m<\"=>x#79x 99;%x?7\","));
        }
    }

    public void cfr_renamed_5297(sprsvl arg0) throws sprahf {
        this.cfr_renamed_4.cfr_renamed_5297(arg0);
    }

    public sprddm cfr_renamed_1479() {
        return this.cfr_renamed_2.cfr_renamed_1479();
    }

    public sprrgm cfr_renamed_568() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbff(sprrgm sprrgm2, sprjj sprjj2) throws sprahf, spruef {
        sprbff sprbff2 = this;
        this.cfr_renamed_1 = new sprtxe();
        this.cfr_renamed_0 = null;
        try {
            void arg1;
            void arg0;
            sprbff sprbff3 = this;
            sprbff3.cfr_renamed_2 = arg0;
            sprbff3.cfr_renamed_4 = new sprqxe(arg0.cfr_renamed_5339());
            this.cfr_renamed_3 = arg1;
            return;
        }
        catch (IOException iOException) {
            throw new spruef(iOException.getMessage(), iOException);
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_91();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 5 << 3;
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

    public sprbff(byte[] arg0, sprlj arg1) throws sprahf, spruef {
        this(sprrgm.cfr_renamed_23(arg0), arg1);
    }

    public sprqxe cfr_renamed_652() {
        return this.cfr_renamed_4;
    }

    public static sprbff cfr_renamed_5371(sprqxe arg0, sprlj arg1) throws sprahf, spruef {
        return new sprbff(new sprrgm(arg0.cfr_renamed_637().cfr_renamed_568()), arg1);
    }

    public Date cfr_renamed_5372() {
        sprtpl sprtpl2 = this.cfr_renamed_5352();
        if (sprtpl2 != null) {
            return sprtpl2.cfr_renamed_86();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbff(byte[] byArray, sprrgm sprrgm2, sprlj sprlj2) throws sprahf, spruef {
        sprbff sprbff2 = this;
        this.cfr_renamed_1 = new sprtxe();
        this.cfr_renamed_0 = byArray;
        try {
            void arg2;
            void arg1;
            this.cfr_renamed_2 = arg1;
            this.cfr_renamed_4 = new sprqxe(arg1.cfr_renamed_5339());
            this.cfr_renamed_3 = arg2.cfr_renamed_5279(this.cfr_renamed_2.cfr_renamed_1479());
            return;
        }
        catch (IOException iOException) {
            throw new spruef(iOException.getMessage(), iOException);
        }
        catch (sprhjg sprhjg2) {
            throw new spruef(sprhjg2.getMessage(), sprhjg2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_5356(spren arg0, Date arg1) throws spruef {
        if (this.cfr_renamed_4.cfr_renamed_577().cfr_renamed_588().after(arg1)) {
            throw new sprsdf(sprdsh.cfr_renamed_9("5J,F2W N1\u0003&F/F3B5J.MaW(N$\u0003(PaJ/\u00035K$\u0003'V5V3F"));
        }
        try {
            this.cfr_renamed_5337(arg0, arg1);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public Date cfr_renamed_588() {
        return this.cfr_renamed_4.cfr_renamed_577().cfr_renamed_588();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbff(sprrgm sprrgm2, sprlj sprlj2) throws sprahf, spruef {
        sprbff sprbff2 = this;
        this.cfr_renamed_1 = new sprtxe();
        this.cfr_renamed_0 = null;
        try {
            void arg1;
            void arg0;
            this.cfr_renamed_2 = arg0;
            this.cfr_renamed_4 = new sprqxe(arg0.cfr_renamed_5339());
            this.cfr_renamed_3 = arg1.cfr_renamed_5279(this.cfr_renamed_2.cfr_renamed_1479());
            return;
        }
        catch (IOException iOException) {
            throw new spruef(iOException.getMessage(), iOException);
        }
        catch (sprhjg sprhjg2) {
            throw new spruef(sprhjg2.getMessage(), sprhjg2);
        }
    }

    public void cfr_renamed_5337(spren arg0, Date arg1) throws spruef {
        sprbff sprbff2 = this;
        this.cfr_renamed_5358(arg0 instanceof sprodf, arg0.cfr_renamed_3221(sprbff2.cfr_renamed_3, sprbff2.cfr_renamed_0), arg1);
    }

    public void cfr_renamed_5358(boolean arg0, byte[] arg1, Date arg2) throws spruef {
        byte[] byArray;
        sprbff sprbff2;
        if (this.cfr_renamed_4.cfr_renamed_577().cfr_renamed_588().after(arg2)) {
            throw new sprsdf(sprstq.cfr_renamed_9("91 =>,,5=x*=#=?991\"6m,$5(x$+m1#x90(x+-9-?="));
        }
        sprbff sprbff3 = this;
        sprbff3.cfr_renamed_5373(arg0, arg1, sprbff3.cfr_renamed_3);
        if (this.cfr_renamed_2.cfr_renamed_5374() != null) {
            sprbff sprbff4 = this;
            sprbff sprbff5 = this;
            sprbff2 = sprbff5;
            byArray = sprbff4.cfr_renamed_1.cfr_renamed_3235(sprbff4.cfr_renamed_3, sprbff5.cfr_renamed_2.cfr_renamed_5374());
        } else {
            byArray = arg1;
            sprbff2 = this;
        }
        sprbff2.cfr_renamed_5370(this.cfr_renamed_4, byArray);
    }

    public sprtpl cfr_renamed_5352() {
        Collection<sprtpl> collection;
        sprug<sprtpl> sprug2 = this.cfr_renamed_4.cfr_renamed_617();
        if (sprug2 != null && !(collection = sprug2.cfr_renamed_3216(this.cfr_renamed_4.cfr_renamed_634())).isEmpty()) {
            return collection.iterator().next();
        }
        return null;
    }

    public void cfr_renamed_5373(boolean arg0, byte[] arg1, sprjj arg2) throws sprsdf {
        sprqgf[] sprqgfArray = this.cfr_renamed_2.cfr_renamed_5374();
        if (sprqgfArray != null) {
            sprqgf sprqgf2 = sprqgfArray[0];
            if (!arg0 && sprqgf2.cfr_renamed_5375(arg1)) {
                return;
            }
            if (sprqgf2.cfr_renamed_5366() > 1 && sproze.cfr_renamed_92(arg1, sprohf.cfr_renamed_5326(arg2, sprqgf2.cfr_renamed_205()))) {
                return;
            }
            throw new sprsdf(sprdsh.cfr_renamed_9("L#I$@5\u0003)B2KaM.WaE.V/G"));
        }
        if (!sproze.cfr_renamed_92(arg1, this.cfr_renamed_4.cfr_renamed_577().cfr_renamed_581())) {
            throw new sprsdf(sprstq.cfr_renamed_9("\":'=.,m0,+%x#79x+786)x$6m/?9=((<m,$5(+99 ("));
        }
    }
}

