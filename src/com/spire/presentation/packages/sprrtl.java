/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprntl;
import com.spire.presentation.packages.sprool;
import com.spire.presentation.packages.sprqsl;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvqm;
import com.spire.presentation.packages.sprxsm;
import com.spire.presentation.packages.sprzmm;
import com.spire.presentation.packages.sprzwl;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprrtl
implements sprjn {
    private sprzmm cfr_renamed_2;
    private sprhgm cfr_renamed_3;
    private sprxsm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7374(sprhk arg0) throws sprzwl {
        try {
            sprge sprge2 = arg0.cfr_renamed_5279(this.cfr_renamed_2.cfr_renamed_89());
            OutputStream outputStream = sprge2.cfr_renamed_470();
            sprrtl sprrtl2 = this;
            outputStream.write(sprrtl2.cfr_renamed_2.cfr_renamed_4315().cfr_renamed_104("DER"));
            outputStream.close();
            return sprge2.cfr_renamed_1435(sprrtl2.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9("\u0015J\u0013W\u0000F\u0019]\u001e\u0012\u0000@\u001fQ\u0015A\u0003[\u001eUPA\u0019UJ\u0012")).append(exception).toString(), exception);
        }
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_3 != null;
    }

    public Set cfr_renamed_662() {
        return sprntl.cfr_renamed_10880(this.cfr_renamed_3);
    }

    public sprlem cfr_renamed_4299() {
        return this.cfr_renamed_2.cfr_renamed_89().cfr_renamed_593();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_91();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3().cfr_renamed_5023() + 1;
    }

    public int hashCode() {
        return this.cfr_renamed_2.hashCode();
    }

    public Date cfr_renamed_4279() {
        return sprntl.cfr_renamed_10908(this.cfr_renamed_4.cfr_renamed_4279());
    }

    public sprtpl[] cfr_renamed_626() {
        if (this.cfr_renamed_2.cfr_renamed_626() != null) {
            sprszm sprszm2 = this.cfr_renamed_2.cfr_renamed_626();
            if (sprszm2 != null) {
                int n;
                sprtpl[] sprtplArray = new sprtpl[sprszm2.cfr_renamed_84()];
                int n2 = n = 0;
                while (n2 != sprtplArray.length) {
                    int n3 = n;
                    sprtpl sprtpl2 = new sprtpl(sprndm.cfr_renamed_23(sprszm2.cfr_renamed_85(n)));
                    sprtplArray[n3] = sprtpl2;
                    n2 = ++n;
                }
                return sprtplArray;
            }
            return sprntl.cfr_renamed_3;
        }
        return sprntl.cfr_renamed_3;
    }

    public List cfr_renamed_583() {
        return sprntl.cfr_renamed_5274(this.cfr_renamed_3);
    }

    public sprqsl[] cfr_renamed_4280() {
        int n;
        sprszm sprszm2 = this.cfr_renamed_4.cfr_renamed_4280();
        sprqsl[] sprqslArray = new sprqsl[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqslArray.length) {
            int n3 = n;
            sprqsl sprqsl2 = new sprqsl(sprvqm.cfr_renamed_23(sprszm2.cfr_renamed_85(n)));
            sprqslArray[n3] = sprqsl2;
            n2 = ++n;
        }
        return sprqslArray;
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_2.cfr_renamed_79().cfr_renamed_186();
    }

    public sprddm cfr_renamed_10926() {
        return this.cfr_renamed_2.cfr_renamed_89();
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprrtl)) {
            return false;
        }
        sprrtl sprrtl2 = (sprrtl)arg0;
        return this.cfr_renamed_2.equals(sprrtl2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrtl(sprzmm sprzmm2) {
        void arg0;
        sprrtl sprrtl2 = this;
        this.cfr_renamed_2 = arg0;
        sprrtl2.cfr_renamed_4 = this.cfr_renamed_2.cfr_renamed_4315();
        sprrtl2.cfr_renamed_3 = sprhgm.cfr_renamed_23(sprzmm2.cfr_renamed_4315().cfr_renamed_4278());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4314() {
        try {
            return this.cfr_renamed_2.cfr_renamed_4315().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public Set cfr_renamed_665() {
        return sprntl.cfr_renamed_10879(this.cfr_renamed_3);
    }

    public sprool cfr_renamed_4276() {
        return new sprool(this.cfr_renamed_4.cfr_renamed_4277());
    }
}

