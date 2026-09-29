/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprhnm;
import com.spire.presentation.packages.sprhvm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprlxl;
import com.spire.presentation.packages.sproxl;
import com.spire.presentation.packages.sprpwl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.spruqm;
import com.spire.presentation.packages.sprxnm;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprykaa;
import com.spire.presentation.packages.spryql;
import com.spire.presentation.packages.sprysl;
import com.spire.presentation.packages.sprzsm;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sprcwl {
    private sprdvm cfr_renamed_1;
    private sprxnm cfr_renamed_2;
    private List cfr_renamed_3;
    private List cfr_renamed_4;

    public sprcwl cfr_renamed_11005(spruqm arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_11005(arg0);
        return sprcwl2;
    }

    private /* synthetic */ byte[] cfr_renamed_11006(sprcf arg0, sprhvm arg1, sprdvm arg2) throws IOException {
        OutputStream outputStream;
        sprrvm sprrvm2 = new sprrvm();
        sprcf sprcf2 = arg0;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm3.cfr_renamed_5004(arg2);
        OutputStream outputStream2 = outputStream = sprcf2.cfr_renamed_470();
        outputStream2.write(new sprcen(sprrvm2).cfr_renamed_104("DER"));
        outputStream2.close();
        return sprcf2.cfr_renamed_79();
    }

    public sprcwl cfr_renamed_11007(sprzsm arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_3.add(arg0);
        return sprcwl2;
    }

    public sprcwl cfr_renamed_11008(sprtpl arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_4.add(arg0);
        return sprcwl2;
    }

    public sprcwl(sprigm arg0, sprigm arg1) {
        this(2, arg0, arg1);
    }

    public sprcwl cfr_renamed_4406(byte[] arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_4406(arg0);
        return sprcwl2;
    }

    public sprcwl cfr_renamed_4404(byte[] arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_4404(arg0);
        return sprcwl2;
    }

    public sprcwl cfr_renamed_4395(byte[] arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_4395(arg0);
        return sprcwl2;
    }

    public sprcwl(int arg0, sprigm arg1, sprigm arg2) {
        sprcwl sprcwl2 = this;
        this.cfr_renamed_3 = new ArrayList();
        sprcwl2.cfr_renamed_4 = new ArrayList();
        this.cfr_renamed_2 = new sprxnm(arg0, arg1, arg2);
    }

    public sprcwl cfr_renamed_4394(byte[] arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_4394(arg0);
        return sprcwl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprysl cfr_renamed_11009(sprsf arg0) throws sprpwl {
        if (null == this.cfr_renamed_1) {
            throw new IllegalStateException(spruab.cfr_renamed_9("\u0011f\u0017pSd\u0006z\u0007)\u0011lSz\u0016}Sk\u0016o\u001c{\u0016)\u0011|\u001ae\u0017`\u001dn"));
        }
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_11010(arg0.cfr_renamed_615());
        sprhvm sprhvm2 = sprcwl2.cfr_renamed_2.cfr_renamed_1451();
        try {
            sprcwl sprcwl3 = this;
            sprdye sprdye2 = new sprdye(sprcwl3.cfr_renamed_11011(arg0, sprhvm2, sprcwl3.cfr_renamed_1));
            return this.cfr_renamed_11012(sprhvm2, sprdye2);
        }
        catch (IOException iOException) {
            throw new sprpwl(new StringBuilder().insert(0, sprykaa.cfr_renamed_9("\fx\u0018t\u0015sYb\u00166\u001cx\u001ay\u001dsY[8UY\u007f\u0017f\fbC6")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    private /* synthetic */ sprysl cfr_renamed_11012(sprhvm arg0, sprdye arg1) {
        if (!this.cfr_renamed_4.isEmpty()) {
            int n;
            sprxpm[] sprxpmArray = new sprxpm[this.cfr_renamed_4.size()];
            int n2 = n = 0;
            while (n2 != sprxpmArray.length) {
                int n3 = n;
                sprxpm sprxpm2 = new sprxpm(((sprtpl)this.cfr_renamed_4.get(n)).cfr_renamed_568());
                sprxpmArray[n3] = sprxpm2;
                n2 = ++n;
            }
            return new sprysl(new sprhnm(arg0, this.cfr_renamed_1, arg1, sprxpmArray));
        }
        return new sprysl(new sprhnm(arg0, this.cfr_renamed_1, arg1));
    }

    public sprcwl cfr_renamed_11013(sprdvm arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprcwl cfr_renamed_11014(int arg0, sprlxl arg1) {
        if (!sprlxl.cfr_renamed_10998(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruab.cfr_renamed_9("\u0011f\u0017pS}\ny\u0016)")).append(arg0).append(sprykaa.cfr_renamed_9("Yr\u0016s\n6\u0017y\r6\u0014w\ru\u00116:[)6\ro\tsYU\u001cd\rD\u001cg4s\ne\u0018q\u001ce")).toString());
        }
        this.cfr_renamed_1 = new sprdvm(arg0, arg1.cfr_renamed_568());
        return this;
    }

    public sprcwl cfr_renamed_11015(int arg0, sproxl arg1) {
        if (!sproxl.cfr_renamed_11016(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruab.cfr_renamed_9("\u0011f\u0017pS}\ny\u0016)")).append(arg0).append(sprykaa.cfr_renamed_9("6\u001dy\u001ceYx\u0016bY{\u0018b\u001a~YU4FYb\u0000f\u001c6:s\u000bb:y\u0017p\u0010d\u0014U\u0016x\rs\u0017b")).toString());
        }
        this.cfr_renamed_1 = new sprdvm(arg0, arg1.cfr_renamed_568());
        return this;
    }

    public sprcwl cfr_renamed_11017(int arg0, spryql arg1) {
        if (!spryql.cfr_renamed_11001(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruab.cfr_renamed_9("\u0011f\u0017pS}\ny\u0016)")).append(arg0).append(sprykaa.cfr_renamed_9("Yr\u0016s\n6\u0017y\r6\u0014w\ru\u00116:[)6\ro\tsYU\u001cd\rD\u001cg4s\ne\u0018q\u001ce")).toString());
        }
        this.cfr_renamed_1 = new sprdvm(arg0, arg1.cfr_renamed_568());
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprysl cfr_renamed_7373(sprcf arg0) throws sprpwl {
        if (null == this.cfr_renamed_1) {
            throw new IllegalStateException(spruab.cfr_renamed_9("\u0011f\u0017pSd\u0006z\u0007)\u0011lSz\u0016}Sk\u0016o\u001c{\u0016)\u0011|\u001ae\u0017`\u001dn"));
        }
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_11010(arg0.cfr_renamed_615());
        sprhvm sprhvm2 = sprcwl2.cfr_renamed_2.cfr_renamed_1451();
        try {
            sprcwl sprcwl3 = this;
            sprdye sprdye2 = new sprdye(sprcwl3.cfr_renamed_11006(arg0, sprhvm2, sprcwl3.cfr_renamed_1));
            return this.cfr_renamed_11012(sprhvm2, sprdye2);
        }
        catch (IOException iOException) {
            throw new sprpwl(new StringBuilder().insert(0, sprykaa.cfr_renamed_9("\fx\u0018t\u0015sYb\u00166\u001cx\u001ay\u001dsYe\u0010q\u0017w\rc\u000bsY\u007f\u0017f\fbC6")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprcwl cfr_renamed_4398(byte[] arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_4398(arg0);
        return sprcwl2;
    }

    public sprcwl cfr_renamed_4401(Date arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_11018(new sprjfn(arg0));
        return sprcwl2;
    }

    private /* synthetic */ byte[] cfr_renamed_11011(sprsf arg0, sprhvm arg1, sprdvm arg2) throws IOException {
        OutputStream outputStream;
        sprrvm sprrvm2 = new sprrvm();
        sprsf sprsf2 = arg0;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(arg1);
        sprrvm3.cfr_renamed_5004(arg2);
        OutputStream outputStream2 = outputStream = sprsf2.cfr_renamed_470();
        outputStream2.write(new sprcen(sprrvm2).cfr_renamed_104("DER"));
        outputStream2.close();
        return sprsf2.cfr_renamed_1472();
    }

    private /* synthetic */ void cfr_renamed_11010(sprddm arg0) {
        sprcwl sprcwl2 = this;
        sprcwl2.cfr_renamed_2.cfr_renamed_11019(arg0);
        if (!sprcwl2.cfr_renamed_3.isEmpty()) {
            sprzsm[] sprzsmArray = new sprzsm[this.cfr_renamed_3.size()];
            sprcwl sprcwl3 = this;
            sprcwl3.cfr_renamed_2.cfr_renamed_11020(sprcwl3.cfr_renamed_3.toArray(sprzsmArray));
        }
    }
}

