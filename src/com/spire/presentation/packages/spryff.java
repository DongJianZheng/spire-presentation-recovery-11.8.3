/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnsm;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sproye;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvye;
import com.spire.presentation.packages.sprylaa;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class spryff
extends sprvye {
    private sproye cfr_renamed_3;
    private sprnsm cfr_renamed_4;

    public sprqxe[] cfr_renamed_681() throws sprlyl {
        spryff spryff2 = this;
        spryff2.cfr_renamed_694();
        return spryff2.cfr_renamed_3.cfr_renamed_681();
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_3.cfr_renamed_678();
    }

    public void cfr_renamed_5381(sprlj arg0, byte[] arg1) throws sprnxe, sprlyl {
        spryff spryff2 = this;
        spryff2.cfr_renamed_694();
        spryff2.cfr_renamed_3.cfr_renamed_5381(arg0, arg1);
    }

    public sprjpm cfr_renamed_671() {
        return this.cfr_renamed_3.cfr_renamed_671();
    }

    public URI cfr_renamed_695() throws URISyntaxException {
        sprupm sprupm2 = this.cfr_renamed_4.cfr_renamed_5388();
        if (sprupm2 != null) {
            return new URI(sprupm2.cfr_renamed_314());
        }
        return null;
    }

    public spryff(InputStream arg0) throws sprlyl {
        spryff spryff2 = this;
        super(arg0);
        spryff2.cfr_renamed_5389((sprjvm)((Object)spryff2.cfr_renamed_4));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjj cfr_renamed_5379(sprlj arg0) throws sprhjg {
        try {
            this.cfr_renamed_694();
            return this.cfr_renamed_3.cfr_renamed_5379(arg0);
        }
        catch (sprlyl sprlyl2) {
            throw new sprhjg(new StringBuilder().insert(0, spreyl.cfr_renamed_9("Hv\\zQ}\u001dlR8X`Ij\\{I8\\tZwOqIpP8t\\\u00078")).append(sprlyl2.getMessage()).toString(), sprlyl2);
        }
    }

    public InputStream cfr_renamed_480() {
        if (this.cfr_renamed_4.cfr_renamed_480() != null) {
            return this.cfr_renamed_4.cfr_renamed_480().cfr_renamed_698();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_694() throws sprlyl {
        try {
            if (this.cfr_renamed_3 != null) return;
            InputStream inputStream = this.cfr_renamed_480();
            if (inputStream != null) {
                sprkqe.cfr_renamed_477(inputStream);
            }
            this.cfr_renamed_3 = new sproye(this.cfr_renamed_4);
            return;
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprylaa.cfr_renamed_9("~\\jPgW+Fd\u0012{SyAn\u0012nDbVn\\hW+Pg]hY1\u0012")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public void cfr_renamed_5376(sprjj arg0) throws sprlyl {
        this.cfr_renamed_3.cfr_renamed_5376(arg0);
    }

    public byte[] cfr_renamed_5377(sprjj arg0) throws sprlyl {
        return this.cfr_renamed_3.cfr_renamed_5377(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_5389(sprjvm arg0) throws sprlyl {
        try {
            if (sprgz.cfr_renamed_152.cfr_renamed_5078(arg0.cfr_renamed_696())) {
                this.cfr_renamed_4 = sprnsm.cfr_renamed_23(arg0.cfr_renamed_697(16));
                return;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, spreyl.cfr_renamed_9("U\\t[wOuX|\u001d{RvI}Sl\u001d5\u001dlDhX8PmNl\u001dzX8")).append(sprgz.cfr_renamed_152.cfr_renamed_19()).toString());
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprylaa.cfr_renamed_9("Bj@x[eU+WsQnB\u007f[d\\1\u0012")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public void cfr_renamed_5382(sprlj arg0, byte[] arg1, sprqxe arg2) throws sprnxe, sprlyl {
        spryff spryff2 = this;
        spryff2.cfr_renamed_694();
        spryff2.cfr_renamed_3.cfr_renamed_5382(arg0, arg1, arg2);
    }

    public String cfr_renamed_675() {
        return this.cfr_renamed_3.cfr_renamed_675();
    }

    /*
     * WARNING - void declaration
     */
    public spryff(byte[] byArray) throws sprlyl {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }
}

