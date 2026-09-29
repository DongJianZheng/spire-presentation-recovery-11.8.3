/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgsd;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmsd;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprqxd;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sprtpd {
    private Date cfr_renamed_119;
    private sprgsd cfr_renamed_91;
    private sprmsd cfr_renamed_0;
    private Collection cfr_renamed_1;
    private sproqd cfr_renamed_2;
    private Collection cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public void cfr_renamed_4240(sprgsd arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public sprtpd() {
        sprtpd sprtpd2 = this;
        this.cfr_renamed_1 = new HashSet();
        sprtpd2.cfr_renamed_3 = new HashSet();
    }

    private /* synthetic */ Set cfr_renamed_199(Collection arg0) throws IOException {
        Iterator iterator;
        if (arg0 == null || arg0.isEmpty()) {
            return new HashSet();
        }
        HashSet<sprmee> hashSet = new HashSet<sprmee>();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator iterator3 = iterator;
            iterator2 = iterator3;
            hashSet.add(sprmee.cfr_renamed_23(iterator3.next()));
        }
        return hashSet;
    }

    public void cfr_renamed_10(BigInteger arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_192(Date arg0) {
        if (arg0 != null) {
            sprtpd sprtpd2 = this;
            sprtpd2.cfr_renamed_119 = new Date(arg0.getTime());
            return;
        }
        this.cfr_renamed_119 = null;
    }

    public void cfr_renamed_4241(sprmsd arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprqxd cfr_renamed_1451() {
        sprtpd sprtpd2 = this;
        sprtpd sprtpd3 = this;
        return new sprqxd(sprtpd2.cfr_renamed_91, sprtpd2.cfr_renamed_0, sprtpd3.cfr_renamed_4, sprtpd3.cfr_renamed_119, this.cfr_renamed_2, Collections.unmodifiableCollection(new HashSet(this.cfr_renamed_1)), Collections.unmodifiableCollection(new HashSet(this.cfr_renamed_3)));
    }

    public void cfr_renamed_202(Collection arg0) throws IOException {
        this.cfr_renamed_3 = this.cfr_renamed_199(arg0);
    }

    public void cfr_renamed_4242(sproqd arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_194(sprmee arg0) {
        this.cfr_renamed_1.add(arg0);
    }

    public void cfr_renamed_198(Collection arg0) throws IOException {
        this.cfr_renamed_1 = this.cfr_renamed_199(arg0);
    }

    public void cfr_renamed_183(sprmee arg0) {
        this.cfr_renamed_3.add(arg0);
    }
}

