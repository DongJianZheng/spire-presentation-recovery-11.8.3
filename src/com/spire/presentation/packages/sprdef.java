/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramm;
import com.spire.presentation.packages.sprbco;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlmm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmvm;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sproye;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxrc;
import com.spire.presentation.packages.sprzpm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class sprdef {
    private sprlmm cfr_renamed_2;
    private sprlvm cfr_renamed_3;
    private sproye cfr_renamed_4;

    public String cfr_renamed_678() {
        return this.cfr_renamed_4.cfr_renamed_678();
    }

    /*
     * WARNING - void declaration
     */
    public sprdef(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    private /* synthetic */ void cfr_renamed_5393(sprlvm arg0) {
        this.cfr_renamed_3 = arg0;
        if (!sprgz.cfr_renamed_152.cfr_renamed_5078(arg0.cfr_renamed_696())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxrc.cfr_renamed_9("y^XY[MYZP\u001fWPZKQQ@\u001f\u0019\u001f@FDZ\u0014RAL@\u001fVZ\u0014")).append(sprgz.cfr_renamed_152.cfr_renamed_19()).toString());
        }
        sprdef sprdef2 = this;
        sprdef2.cfr_renamed_2 = sprlmm.cfr_renamed_23(arg0.cfr_renamed_480());
        sprdef2.cfr_renamed_4 = new sproye(this.cfr_renamed_2);
    }

    public sprjj cfr_renamed_5379(sprlj arg0) throws sprhjg {
        return this.cfr_renamed_4.cfr_renamed_5379(arg0);
    }

    public byte[] cfr_renamed_5377(sprjj arg0) throws sprlyl {
        return this.cfr_renamed_4.cfr_renamed_5377(arg0);
    }

    public sprjpm cfr_renamed_671() {
        return this.cfr_renamed_4.cfr_renamed_671();
    }

    public byte[] cfr_renamed_480() {
        if (this.cfr_renamed_2.cfr_renamed_480() != null) {
            return this.cfr_renamed_2.cfr_renamed_480().cfr_renamed_186();
        }
        return null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public void cfr_renamed_5381(sprlj arg0, byte[] arg1) throws sprnxe, sprlyl {
        this.cfr_renamed_4.cfr_renamed_5381(arg0, arg1);
    }

    public sprdef(sprlvm sprlvm2) {
        sprdef sprdef2 = this;
        sprdef2.cfr_renamed_5393(sprlvm2);
    }

    public sprdef cfr_renamed_5394(sprqxe arg0) throws sprlyl {
        sprmvm[] sprmvmArray = this.cfr_renamed_4.cfr_renamed_676();
        sprmvm[] sprmvmArray2 = new sprmvm[sprmvmArray.length + 1];
        System.arraycopy(sprmvmArray, 0, sprmvmArray2, 0, sprmvmArray.length);
        sprmvmArray2[sprmvmArray.length] = new sprmvm(arg0.cfr_renamed_637().cfr_renamed_568());
        return new sprdef(new sprlvm(sprgz.cfr_renamed_152, new sprlmm(this.cfr_renamed_2.cfr_renamed_5388(), this.cfr_renamed_2.cfr_renamed_683(), this.cfr_renamed_2.cfr_renamed_480(), new spramm(new sprzpm(sprmvmArray2)))));
    }

    public void cfr_renamed_5382(sprlj arg0, byte[] arg1, sprqxe arg2) throws sprnxe, sprlyl {
        this.cfr_renamed_4.cfr_renamed_5382(arg0, arg1, arg2);
    }

    public void cfr_renamed_5376(sprjj arg0) throws sprlyl {
        this.cfr_renamed_4.cfr_renamed_5376(arg0);
    }

    public sprqxe[] cfr_renamed_681() throws sprlyl {
        return this.cfr_renamed_4.cfr_renamed_681();
    }

    public URI cfr_renamed_695() throws URISyntaxException {
        sprupm sprupm2 = this.cfr_renamed_2.cfr_renamed_5388();
        if (sprupm2 != null) {
            return new URI(sprupm2.cfr_renamed_314());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdef(InputStream arg0) throws IOException {
        try {
            this.cfr_renamed_5393(sprlvm.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24()));
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(new StringBuilder().insert(0, sprbco.cfr_renamed_9("\u001eQ?V<B>U7\u00100_=D6^'\ns")).append(classCastException).toString());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprxrc.cfr_renamed_9("y^XY[MYZP\u001fWPZKQQ@\u0005\u0014")).append(illegalArgumentException).toString());
        }
    }

    public String cfr_renamed_675() {
        return this.cfr_renamed_4.cfr_renamed_675();
    }
}

