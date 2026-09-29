/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehaa;
import com.spire.presentation.packages.sprgzg;
import com.spire.presentation.packages.sprjem;
import com.spire.presentation.packages.sprkah;
import com.spire.presentation.packages.sprlah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmim;
import com.spire.presentation.packages.sprnqg;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprutg;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprxam;
import com.spire.presentation.packages.sprxvc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sprkbh
implements sprse<sprkah> {
    private static final Logger cfr_renamed_2 = Logger.getLogger(sprkbh.class.getName());
    public List<sprkah> cfr_renamed_3;
    public sprxam cfr_renamed_4;

    public Iterator<sprkah> cfr_renamed_7844() {
        return this.cfr_renamed_3.iterator();
    }

    public sprkah cfr_renamed_576(int arg0) {
        return this.cfr_renamed_3.get(arg0);
    }

    @Override
    public Iterator<sprkah> iterator() {
        return this.cfr_renamed_7844();
    }

    public sprkbh(InputStream arg0) throws IOException {
        this(sprnqg.cfr_renamed_7533(arg0, 1, 3));
    }

    public sprlah cfr_renamed_7845() {
        return new sprlah(this.cfr_renamed_4);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.isEmpty();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkbh(sprmam sprmam2) throws IOException {
        int n;
        void arg0;
        sprkbh sprkbh2 = this;
        sprkbh2.cfr_renamed_3 = new ArrayList<sprkah>();
        ArrayList<sprtzl> arrayList = new ArrayList<sprtzl>();
        block2: while (true) {
            void v1 = arg0;
            while (v1.cfr_renamed_7534() == 1 || arg0.cfr_renamed_7534() == 3) {
                try {
                    arrayList.add(arg0.cfr_renamed_7676());
                    v1 = arg0;
                }
                catch (sprwhm sprwhm2) {
                    if (!cfr_renamed_2.isLoggable(Level.FINE)) continue block2;
                    cfr_renamed_2.fine(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("l:v!o8q6?$q:q>h??\"z\"l8p??!~2t4kk?")).append(sprwhm2.getMessage()).toString());
                    continue block2;
                }
            }
            break;
        }
        sprtzl sprtzl2 = arg0.cfr_renamed_7676();
        if (!(sprtzl2 instanceof sprxam)) {
            throw new IOException(new StringBuilder().insert(0, sprehaa.cfr_renamed_9("S:C,V1E C0\u0006$G7M1RtO:\u0006'R&C5Kn\u0006")).append(sprtzl2).toString());
        }
        this.cfr_renamed_4 = (sprxam)sprtzl2;
        int n2 = n = 0;
        while (n2 != arrayList.size()) {
            sprkbh sprkbh3 = this;
            if (arrayList.get(n) instanceof sprjem) {
                sprkbh3.cfr_renamed_3.add(new sprutg((sprjem)arrayList.get(n), this.cfr_renamed_4));
            } else {
                sprkbh3.cfr_renamed_3.add(new sprgzg((sprmim)arrayList.get(n), this.cfr_renamed_4));
            }
            n2 = ++n;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    public sprkbh(byte[] byArray) throws IOException {
        this(sprnqg.cfr_renamed_7533(new ByteArrayInputStream((byte[])arg0), 1, 3));
        void arg0;
    }

    public boolean cfr_renamed_7846() {
        return this.cfr_renamed_4 instanceof sproam;
    }
}

