/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfrg;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprpf;
import com.spire.presentation.packages.sprqm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvvg;
import com.spire.presentation.packages.sprzrg;
import java.io.IOException;
import java.io.OutputStream;

public class sprnwg
implements sprpf,
sprqm {
    private int cfr_renamed_119;
    private sprjah cfr_renamed_91;
    private int cfr_renamed_0;
    private OutputStream cfr_renamed_4;

    @Override
    public void cfr_renamed_2637() throws IOException {
        if (this.cfr_renamed_4 != null) {
            sprnwg sprnwg2 = this;
            if (sprnwg2.cfr_renamed_4 != sprnwg2.cfr_renamed_91) {
                this.cfr_renamed_4.close();
            }
            sprnwg sprnwg3 = this;
            sprnwg3.cfr_renamed_4 = null;
            sprnwg3.cfr_renamed_91.cfr_renamed_3120();
            sprnwg3.cfr_renamed_91.flush();
            this.cfr_renamed_91 = null;
        }
    }

    public OutputStream cfr_renamed_7847(OutputStream arg0, byte[] arg1) throws IOException, sprtqg {
        if (this.cfr_renamed_4 != null) {
            throw new IllegalStateException(sprmpd.cfr_renamed_9("HAAA]E[K]\u0004NH]AN@V\u0004FJ\u000fK_AA\u0004\\PNPJ"));
        }
        this.cfr_renamed_91 = new sprjah(arg0, 8, arg1);
        this.cfr_renamed_7870();
        return new sprzrg(this.cfr_renamed_4, this);
    }

    public OutputStream cfr_renamed_4137(OutputStream arg0) throws IOException {
        if (this.cfr_renamed_4 != null) {
            throw new IllegalStateException(sprmzo.cfr_renamed_9("S\u001dZ\u001dF\u0019@\u0017FXU\u0014F\u001dU\u001cMX]\u0016\u0014\u0017D\u001dZXG\fU\fQ"));
        }
        this.cfr_renamed_91 = new sprjah(arg0, 8);
        this.cfr_renamed_7870();
        return new sprzrg(this.cfr_renamed_4, this);
    }

    public sprnwg(int arg0) {
        this(arg0, -1);
    }

    /*
     * WARNING - void declaration
     */
    public sprnwg(int n, int n2) {
        void arg0;
        void arg1;
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                break;
            }
            default: {
                throw new IllegalArgumentException(sprmpd.cfr_renamed_9("ZJDJ@SA\u0004LKBT]A\\WFKA\u0004NHHK]M[LB"));
            }
        }
        if (arg1 != -1 && (arg1 < 0 || arg1 > 9)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmzo.cfr_renamed_9("A\u0016_\u0016[\u000fZXW\u0017Y\bF\u001dG\u000b]\u0017ZXX\u001dB\u001dXB\u0014")).append((int)arg1).toString());
        }
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_0 = arg1;
    }

    private /* synthetic */ void cfr_renamed_7870() throws IOException {
        sprnwg sprnwg2 = this;
        this.cfr_renamed_91.write(sprnwg2.cfr_renamed_119);
        switch (sprnwg2.cfr_renamed_119) {
            case 0: {
                while (false) {
                }
                this.cfr_renamed_4 = this.cfr_renamed_91;
                return;
            }
            case 1: {
                sprnwg sprnwg3 = this;
                this.cfr_renamed_4 = new sprfrg((OutputStream)sprnwg3.cfr_renamed_91, sprnwg3.cfr_renamed_0, true);
                return;
            }
            case 2: {
                sprnwg sprnwg4 = this;
                this.cfr_renamed_4 = new sprfrg((OutputStream)sprnwg4.cfr_renamed_91, sprnwg4.cfr_renamed_0, false);
                return;
            }
            case 3: {
                this.cfr_renamed_4 = new sprvvg(this.cfr_renamed_91);
                return;
            }
        }
        throw new IllegalStateException();
    }
}

