/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprare;
import com.spire.presentation.packages.sprcbaa;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdne;
import com.spire.presentation.packages.sprgoe;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprhsd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlue;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.sprtse;
import com.spire.presentation.packages.sprykaa;
import com.spire.presentation.packages.spryvd;
import com.spire.presentation.packages.sprzle;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sprjwd {
    private sprgoe cfr_renamed_1;
    private sprlue cfr_renamed_2;
    private List cfr_renamed_3;
    private List cfr_renamed_4;

    public sprjwd(sprmee arg0, sprmee arg1) {
        this(2, arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhsd cfr_renamed_1484(sprqa arg0) throws spryvd {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_4093(arg0.cfr_renamed_615());
        sprdne sprdne2 = sprjwd2.cfr_renamed_1.cfr_renamed_1451();
        try {
            sprjwd sprjwd3 = this;
            sprmra sprmra2 = new sprmra(sprjwd3.cfr_renamed_4392(arg0, sprdne2, sprjwd3.cfr_renamed_2));
            return this.cfr_renamed_4393(sprdne2, sprmra2);
        }
        catch (IOException iOException) {
            throw new spryvd(new StringBuilder().insert(0, sprcbaa.cfr_renamed_9("{lo`bg.va\"klmmjg.qge`czw|g.k`r{v4\"")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprjwd cfr_renamed_4394(byte[] arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4394(arg0);
        return sprjwd2;
    }

    public sprjwd cfr_renamed_4395(byte[] arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4395(arg0);
        return sprjwd2;
    }

    private /* synthetic */ void cfr_renamed_4093(sprije arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4396(arg0);
        if (!sprjwd2.cfr_renamed_3.isEmpty()) {
            sprare[] sprareArray = new sprare[this.cfr_renamed_3.size()];
            sprjwd sprjwd3 = this;
            sprjwd3.cfr_renamed_1.cfr_renamed_4397(sprjwd3.cfr_renamed_3.toArray(sprareArray));
        }
    }

    public sprjwd cfr_renamed_4398(byte[] arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4398(arg0);
        return sprjwd2;
    }

    private /* synthetic */ sprhsd cfr_renamed_4393(sprdne arg0, sprmra arg1) {
        if (!this.cfr_renamed_4.isEmpty()) {
            int n;
            sprtne[] sprtneArray = new sprtne[this.cfr_renamed_4.size()];
            int n2 = n = 0;
            while (n2 != sprtneArray.length) {
                int n3 = n;
                sprtne sprtne2 = new sprtne(((sprcyd)this.cfr_renamed_4.get(n)).cfr_renamed_568());
                sprtneArray[n3] = sprtne2;
                n2 = ++n;
            }
            return new sprhsd(new sprzle(arg0, this.cfr_renamed_2, arg1, sprtneArray));
        }
        return new sprhsd(new sprzle(arg0, this.cfr_renamed_2, arg1));
    }

    private /* synthetic */ byte[] cfr_renamed_4399(sprha arg0, sprdne arg1, sprlue arg2) throws IOException {
        OutputStream outputStream;
        sprlre sprlre2 = new sprlre();
        sprha sprha2 = arg0;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(arg1);
        sprlre3.cfr_renamed_49(arg2);
        OutputStream outputStream2 = outputStream = sprha2.cfr_renamed_470();
        outputStream2.write(new sprpse(sprlre2).cfr_renamed_104("DER"));
        outputStream2.close();
        return sprha2.cfr_renamed_1472();
    }

    public sprjwd cfr_renamed_4400(sprlue arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    private /* synthetic */ byte[] cfr_renamed_4392(sprqa arg0, sprdne arg1, sprlue arg2) throws IOException {
        OutputStream outputStream;
        sprlre sprlre2 = new sprlre();
        sprqa sprqa2 = arg0;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(arg1);
        sprlre3.cfr_renamed_49(arg2);
        OutputStream outputStream2 = outputStream = sprqa2.cfr_renamed_470();
        outputStream2.write(new sprpse(sprlre2).cfr_renamed_104("DER"));
        outputStream2.close();
        return sprqa2.cfr_renamed_79();
    }

    public sprjwd cfr_renamed_4401(Date arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4402(new sprrpe(arg0));
        return sprjwd2;
    }

    public sprjwd cfr_renamed_4403(sprare arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_3.add(arg0);
        return sprjwd2;
    }

    public sprjwd cfr_renamed_4404(byte[] arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4404(arg0);
        return sprjwd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhsd cfr_renamed_4405(sprha arg0) throws spryvd {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_4093(arg0.cfr_renamed_615());
        sprdne sprdne2 = sprjwd2.cfr_renamed_1.cfr_renamed_1451();
        try {
            sprjwd sprjwd3 = this;
            sprmra sprmra2 = new sprmra(sprjwd3.cfr_renamed_4399(arg0, sprdne2, sprjwd3.cfr_renamed_2));
            return this.cfr_renamed_4393(sprdne2, sprmra2);
        }
        catch (IOException iOException) {
            throw new spryvd(new StringBuilder().insert(0, sprykaa.cfr_renamed_9("\fx\u0018t\u0015sYb\u00166\u001cx\u001ay\u001dsY[8UY\u007f\u0017f\fbC6")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprjwd cfr_renamed_4406(byte[] arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4406(arg0);
        return sprjwd2;
    }

    public sprjwd cfr_renamed_4407(sprtse arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_1.cfr_renamed_4407(arg0);
        return sprjwd2;
    }

    public sprjwd(int arg0, sprmee arg1, sprmee arg2) {
        sprjwd sprjwd2 = this;
        this.cfr_renamed_3 = new ArrayList();
        sprjwd2.cfr_renamed_4 = new ArrayList();
        this.cfr_renamed_1 = new sprgoe(arg0, arg1, arg2);
    }

    public sprjwd cfr_renamed_4408(sprcyd arg0) {
        sprjwd sprjwd2 = this;
        sprjwd2.cfr_renamed_4.add(arg0);
        return sprjwd2;
    }
}

