/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhwl;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spriul;
import com.spire.presentation.packages.sprlpl;
import com.spire.presentation.packages.sprypl;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sprepl {
    private sprypl cfr_renamed_119;
    private Date cfr_renamed_91;
    private sprlpl cfr_renamed_0;
    private sprhwl cfr_renamed_1;
    private Collection cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private Collection cfr_renamed_4;

    public void cfr_renamed_10(BigInteger arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ Set cfr_renamed_199(Collection arg0) throws IOException {
        Iterator iterator;
        if (arg0 == null || arg0.isEmpty()) {
            return new HashSet();
        }
        HashSet<sprigm> hashSet = new HashSet<sprigm>();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator iterator3 = iterator;
            iterator2 = iterator3;
            hashSet.add(sprigm.cfr_renamed_23(iterator3.next()));
        }
        return hashSet;
    }

    public spriul cfr_renamed_1451() {
        sprepl sprepl2 = this;
        sprepl sprepl3 = this;
        return new spriul(sprepl2.cfr_renamed_0, sprepl2.cfr_renamed_1, sprepl3.cfr_renamed_3, sprepl3.cfr_renamed_91, this.cfr_renamed_119, Collections.unmodifiableCollection(new HashSet(this.cfr_renamed_2)), Collections.unmodifiableCollection(new HashSet(this.cfr_renamed_4)));
    }

    public void cfr_renamed_10887(sprhwl arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_10888(sprypl arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_198(Collection arg0) throws IOException {
        this.cfr_renamed_2 = this.cfr_renamed_199(arg0);
    }

    public void cfr_renamed_5038(sprigm arg0) {
        this.cfr_renamed_2.add(arg0);
    }

    public void cfr_renamed_10889(sprlpl arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_5039(sprigm arg0) {
        this.cfr_renamed_4.add(arg0);
    }

    public void cfr_renamed_192(Date arg0) {
        if (arg0 != null) {
            sprepl sprepl2 = this;
            sprepl2.cfr_renamed_91 = new Date(arg0.getTime());
            return;
        }
        this.cfr_renamed_91 = null;
    }

    public void cfr_renamed_202(Collection arg0) throws IOException {
        this.cfr_renamed_4 = this.cfr_renamed_199(arg0);
    }

    public sprepl() {
        sprepl sprepl2 = this;
        this.cfr_renamed_2 = new HashSet();
        sprepl2.cfr_renamed_4 = new HashSet();
    }
}

