/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfih;
import com.spire.presentation.packages.sprlfh;
import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprmnja;
import com.spire.presentation.packages.sprnfh;
import com.spire.presentation.packages.sprreh;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprrqg;
import com.spire.presentation.packages.sprshk;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvlh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class sprzhk {
    private final sprfih cfr_renamed_3;
    private static final sprvlh cfr_renamed_4 = sprrqg.cfr_renamed_4.cfr_renamed_1451();

    public sprug<sprshk> cfr_renamed_3996() {
        Iterator<sprlfh> iterator;
        ArrayList<sprshk> arrayList = new ArrayList<sprshk>();
        Iterator<sprlfh> iterator2 = iterator = this.cfr_renamed_3.cfr_renamed_3996().cfr_renamed_4171().iterator();
        while (iterator2.hasNext()) {
            sprlfh sprlfh2 = iterator.next();
            iterator2 = iterator;
            arrayList.add(new sprshk(this.cfr_renamed_3, sprlfh2));
        }
        return new sprtul<sprshk>(arrayList);
    }

    public byte[] cfr_renamed_91() {
        return sprrih.cfr_renamed_8165(new sprreh(sprmjh.cfr_renamed_8297(this.cfr_renamed_3)), cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprzhk(InputStream inputStream) throws IOException {
        sprnfh sprnfh2;
        void arg0;
        sprnfh sprnfh3;
        sprmjh sprmjh2 = sprreh.cfr_renamed_23((inputStream instanceof sprnfh ? (sprnfh3 = (sprnfh)arg0) : (sprnfh2 = new sprnfh((InputStream)arg0))).cfr_renamed_8143(cfr_renamed_4)).cfr_renamed_480();
        if (sprmjh2.cfr_renamed_8227() != 2) {
            throw new IllegalStateException(sprmnja.cfr_renamed_9("#,\u001512+WhUh_o\"9\u00129K\u001d\b;\u0014!\u0016,\u0003<F<\u000f<F6\t,F0\u0007.\u0003x\u00036\u0005*\u001f(\u0012=\u0002x\u00029\u00129F;\t6\u0012=\b,"));
        }
        this.cfr_renamed_3 = sprfih.cfr_renamed_23(sprmjh2.cfr_renamed_8298());
    }

    /*
     * WARNING - void declaration
     */
    public sprzhk(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public sprzhk(sprfih sprfih2) {
        this.cfr_renamed_3 = sprfih2;
    }

    public sprfih cfr_renamed_1446() {
        return this.cfr_renamed_3;
    }
}

