/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spredh;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprkgka;
import com.spire.presentation.packages.sprlrg;
import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprnfh;
import com.spire.presentation.packages.sprowj;
import com.spire.presentation.packages.sprpnja;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprrqg;
import com.spire.presentation.packages.sprsp;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprvwg;
import com.spire.presentation.packages.sprwjh;
import com.spire.presentation.packages.sprzdh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprtgk {
    private final spredh cfr_renamed_3;
    private static final sprvlh cfr_renamed_4 = sprrqg.cfr_renamed_152.cfr_renamed_1451();

    public sprtgk(spredh spredh2) {
        this.cfr_renamed_3 = spredh2;
    }

    public byte[] cfr_renamed_91() {
        return sprrih.cfr_renamed_8165(new sprwjh(sprmjh.cfr_renamed_8303(this.cfr_renamed_3)), sprrqg.cfr_renamed_152.cfr_renamed_1451());
    }

    public sprtgk(sprzdh arg0) throws IOException {
        this(arg0.cfr_renamed_2920());
    }

    /*
     * WARNING - void declaration
     */
    public sprtgk(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprtgk(InputStream inputStream) throws IOException {
        sprnfh sprnfh2;
        void arg0;
        sprnfh sprnfh3;
        sprmjh sprmjh2 = sprwjh.cfr_renamed_23((inputStream instanceof sprnfh ? (sprnfh3 = (sprnfh)arg0) : (sprnfh2 = new sprnfh((InputStream)arg0))).cfr_renamed_8143(cfr_renamed_4)).cfr_renamed_480();
        if (sprmjh2.cfr_renamed_8227() != 1) {
            throw new IllegalStateException(sprkgka.cfr_renamed_9("7\u0001\u0001\u001c&\u0006CEAEKB6\u0014\u0006\u0014_&\u001b\u0012\u001c\u0010\u0016U\u0016\u001c\u0016U\u001c\u001a\u0006U\u001a\u0014\u0004\u0010R\u0006\u001b\u0012\u001c\u0010\u0016U\u0016\u0014\u0006\u0014R\u0016\u001d\u001b\u0006\u0010\u001c\u0001"));
        }
        this.cfr_renamed_3 = spredh.cfr_renamed_23(sprmjh2.cfr_renamed_8298());
    }

    /*
     * WARNING - void declaration
     */
    public sprtgk(sprwjh sprwjh2) {
        void arg0;
        if (sprwjh2.cfr_renamed_480().cfr_renamed_8227() != 1) {
            throw new IllegalStateException(sprpnja.cfr_renamed_9("'6\u0011+61SrQr[u&#\u0016#O\u0011\u000b%\f'\u0006b\u0006+\u0006b\f-\u0016b\n#\u0014'B1\u000b%\f'\u0006b\u0006#\u0016#B!\r,\u0016'\f6"));
        }
        this.cfr_renamed_3 = spredh.cfr_renamed_23(arg0.cfr_renamed_480());
    }

    public spredh cfr_renamed_4151() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_9598(sprsp arg0) throws Exception {
        sprvwg sprvwg2 = this.cfr_renamed_3.cfr_renamed_79();
        sprge sprge2 = arg0.cfr_renamed_576(sprvwg2.cfr_renamed_8227());
        OutputStream outputStream = sprge2.cfr_renamed_470();
        sprtgk sprtgk2 = this;
        outputStream.write(sprrih.cfr_renamed_8165(sprtgk2.cfr_renamed_3.cfr_renamed_8270(), sprlrg.cfr_renamed_951.cfr_renamed_1451()));
        outputStream.close();
        return sprge2.cfr_renamed_1435(sprowj.cfr_renamed_9519(sprtgk2.cfr_renamed_3.cfr_renamed_79()));
    }
}

