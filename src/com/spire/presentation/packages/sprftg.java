/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbly;
import com.spire.presentation.packages.sprhsg;
import com.spire.presentation.packages.sprjdm;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprnqg;
import com.spire.presentation.packages.sprntg;
import com.spire.presentation.packages.sprpf;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprurr;
import com.spire.presentation.packages.spryan;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;

public class sprftg
implements sprpf {
    public sprjdm cfr_renamed_4;

    public sprftg(InputStream arg0) throws IOException {
        this(sprnqg.cfr_renamed_7535(arg0, 8));
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_4.cfr_renamed_593();
    }

    /*
     * WARNING - void declaration
     */
    public sprftg(byte[] byArray) throws IOException {
        this(sprnqg.cfr_renamed_7535(new ByteArrayInputStream((byte[])arg0), 8));
        void arg0;
    }

    public InputStream cfr_renamed_7830() throws sprtqg {
        if (this.cfr_renamed_593() == 0) {
            return this.cfr_renamed_2920();
        }
        if (this.cfr_renamed_593() == 1) {
            sprftg sprftg2 = this;
            return new sprhsg(sprftg2, sprftg2.cfr_renamed_2920(), new Inflater(true));
        }
        if (this.cfr_renamed_593() == 2) {
            sprftg sprftg3 = this;
            return new sprntg(sprftg3, sprftg3.cfr_renamed_2920());
        }
        if (this.cfr_renamed_593() == 3) {
            try {
                return new spryan(this.cfr_renamed_2920());
            }
            catch (IOException iOException) {
                throw new sprtqg(new StringBuilder().insert(0, sprurr.cfr_renamed_9("r t/K}TmWjV/LfOg\u001b|O}^nV5\u001b")).append(iOException).toString(), iOException);
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprbly.cfr_renamed_9("75:s t&17;3:='1t7;9$&1''=;:t583;&= <9nt")).append(this.cfr_renamed_593()).toString());
    }

    public InputStream cfr_renamed_2920() {
        return this.cfr_renamed_4.cfr_renamed_2920();
    }

    public sprftg(sprmam sprmam2) throws IOException {
        sprtzl sprtzl2 = sprmam2.cfr_renamed_7676();
        if (!(sprtzl2 instanceof sprjdm)) {
            throw new IOException(new StringBuilder().insert(0, sprurr.cfr_renamed_9("Na^wKjX{^k\u001b\u007fZlPjO/Ra\u001b|O}^nV5\u001b")).append(sprtzl2).toString());
        }
        this.cfr_renamed_4 = (sprjdm)sprtzl2;
    }
}

