/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprige;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprlzd;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sprpje;
import com.spire.presentation.packages.sprsce;
import com.spire.presentation.packages.sprspd;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryyd;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprcwd {
    private sprszd cfr_renamed_2;
    private sprsce cfr_renamed_3;
    private sprige cfr_renamed_4;

    public spryyd cfr_renamed_4276() {
        return new spryyd(this.cfr_renamed_4.cfr_renamed_4277());
    }

    public Set cfr_renamed_662() {
        return sprlzd.cfr_renamed_4236(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    public Set cfr_renamed_665() {
        return sprlzd.cfr_renamed_4234(this.cfr_renamed_2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprcwd)) {
            return false;
        }
        sprcwd sprcwd2 = (sprcwd)arg0;
        return this.cfr_renamed_3.equals(sprcwd2.cfr_renamed_3);
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4314() {
        try {
            return this.cfr_renamed_3.cfr_renamed_4315().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public sprspd[] cfr_renamed_4280() {
        int n;
        sprbne sprbne2 = this.cfr_renamed_4.cfr_renamed_4280();
        sprspd[] sprspdArray = new sprspd[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprspdArray.length) {
            int n3 = n;
            sprspd sprspd2 = new sprspd(sprpje.cfr_renamed_23(sprbne2.cfr_renamed_85(n)));
            sprspdArray[n3] = sprspd2;
            n2 = ++n;
        }
        return sprspdArray;
    }

    public List cfr_renamed_583() {
        return sprlzd.cfr_renamed_582(this.cfr_renamed_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1488(sprja arg0) throws sprbud {
        try {
            sprga sprga2 = arg0.cfr_renamed_578(this.cfr_renamed_3.cfr_renamed_89());
            OutputStream outputStream = sprga2.cfr_renamed_470();
            sprcwd sprcwd2 = this;
            outputStream.write(sprcwd2.cfr_renamed_3.cfr_renamed_4315().cfr_renamed_104("DER"));
            outputStream.close();
            return sprga2.cfr_renamed_1435(sprcwd2.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprogb.cfr_renamed_9("4m2p!a8z?5!g>v4f\"|?rqf8rk5")).append(exception).toString(), exception);
        }
    }

    public sprcyd[] cfr_renamed_626() {
        if (this.cfr_renamed_3.cfr_renamed_626() != null) {
            sprbne sprbne2 = this.cfr_renamed_3.cfr_renamed_626();
            if (sprbne2 != null) {
                int n;
                sprcyd[] sprcydArray = new sprcyd[sprbne2.cfr_renamed_84()];
                int n2 = n = 0;
                while (n2 != sprcydArray.length) {
                    int n3 = n;
                    sprcyd sprcyd2 = new sprcyd(sprcge.cfr_renamed_23(sprbne2.cfr_renamed_85(n)));
                    sprcydArray[n3] = sprcyd2;
                    n2 = ++n;
                }
                return sprcydArray;
            }
            return sprlzd.cfr_renamed_2;
        }
        return sprlzd.cfr_renamed_2;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3().cfr_renamed_97().intValue() + 1;
    }

    public Date cfr_renamed_4279() {
        return sprlzd.cfr_renamed_4269(this.cfr_renamed_4.cfr_renamed_4279());
    }

    /*
     * WARNING - void declaration
     */
    public sprcwd(sprsce sprsce2) {
        void arg0;
        sprcwd sprcwd2 = this;
        this.cfr_renamed_3 = arg0;
        sprcwd2.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_4315();
        sprcwd2.cfr_renamed_2 = sprszd.cfr_renamed_23(sprsce2.cfr_renamed_4315().cfr_renamed_4278());
    }

    public sprtzd cfr_renamed_4299() {
        return this.cfr_renamed_3.cfr_renamed_89().cfr_renamed_593();
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_100(arg0);
        }
        return null;
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_79().cfr_renamed_81();
    }
}

