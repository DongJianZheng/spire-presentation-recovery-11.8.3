/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprgv;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprqck;
import java.security.cert.CertPathParameters;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class sprgak
implements CertPathParameters {
    private final int cfr_renamed_107;
    private final List<sprgv> cfr_renamed_132;
    private final boolean cfr_renamed_102;
    private final Date cfr_renamed_93;
    private final Set<TrustAnchor> cfr_renamed_86;
    public static final int cfr_renamed_152 = 1;
    private final boolean cfr_renamed_112;
    private final List<sprkl> cfr_renamed_119;
    public static final int cfr_renamed_91 = 0;
    private final Map<sprigm, sprkl> cfr_renamed_0;
    private final PKIXParameters cfr_renamed_1;
    private final Date cfr_renamed_2;
    private final sprexj cfr_renamed_3;
    private final Map<sprigm, sprgv> cfr_renamed_4;

    public int cfr_renamed_376() {
        return this.cfr_renamed_107;
    }

    public static /* synthetic */ List cfr_renamed_9457(sprgak arg0) {
        return arg0.cfr_renamed_132;
    }

    public static /* synthetic */ Map cfr_renamed_9458(sprgak arg0) {
        return arg0.cfr_renamed_4;
    }

    public Date cfr_renamed_110() {
        return new Date(this.cfr_renamed_93.getTime());
    }

    @Override
    public Object clone() {
        return this;
    }

    public static /* synthetic */ sprexj cfr_renamed_9459(sprgak arg0) {
        return arg0.cfr_renamed_3;
    }

    public Set cfr_renamed_9129() {
        return this.cfr_renamed_86;
    }

    public Map<sprigm, sprkl> cfr_renamed_7289() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_9073() {
        return this.cfr_renamed_102;
    }

    public List<sprkl> cfr_renamed_7293() {
        return this.cfr_renamed_119;
    }

    public boolean cfr_renamed_9134() {
        return this.cfr_renamed_1.isAnyPolicyInhibited();
    }

    public String cfr_renamed_9097() {
        return this.cfr_renamed_1.getSigProvider();
    }

    public /* synthetic */ sprgak(sprmdk arg0, sprqck arg1) {
        this(arg0);
    }

    public static /* synthetic */ PKIXParameters cfr_renamed_9460(sprgak arg0) {
        return arg0.cfr_renamed_1;
    }

    public static /* synthetic */ Date cfr_renamed_9461(sprgak arg0) {
        return arg0.cfr_renamed_2;
    }

    public List<sprgv> cfr_renamed_7309() {
        return this.cfr_renamed_132;
    }

    public sprexj cfr_renamed_397() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_9095() {
        return this.cfr_renamed_1.isExplicitPolicyRequired();
    }

    public static /* synthetic */ int cfr_renamed_9462(sprgak arg0) {
        return arg0.cfr_renamed_107;
    }

    public Set cfr_renamed_9130() {
        return this.cfr_renamed_1.getInitialPolicies();
    }

    public static /* synthetic */ List cfr_renamed_9463(sprgak arg0) {
        return arg0.cfr_renamed_119;
    }

    public static /* synthetic */ Map cfr_renamed_9464(sprgak arg0) {
        return arg0.cfr_renamed_0;
    }

    public static /* synthetic */ boolean cfr_renamed_9465(sprgak arg0) {
        return arg0.cfr_renamed_112;
    }

    public List<CertStore> cfr_renamed_2283() {
        return this.cfr_renamed_1.getCertStores();
    }

    public boolean cfr_renamed_391() {
        return this.cfr_renamed_112;
    }

    public Map<sprigm, sprgv> cfr_renamed_9141() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgak(sprmdk sprmdk2) {
        void arg0;
        sprgak sprgak2 = this;
        void v1 = arg0;
        sprgak sprgak3 = this;
        sprgak sprgak4 = this;
        void v4 = arg0;
        sprgak sprgak5 = this;
        void v6 = arg0;
        this.cfr_renamed_1 = sprmdk.cfr_renamed_9466((sprmdk)arg0);
        this.cfr_renamed_2 = sprmdk.cfr_renamed_9467((sprmdk)v6);
        sprgak5.cfr_renamed_93 = sprmdk.cfr_renamed_9468((sprmdk)v6);
        sprgak5.cfr_renamed_132 = Collections.unmodifiableList(sprmdk.cfr_renamed_9469((sprmdk)arg0));
        sprgak sprgak6 = this;
        sprgak5.cfr_renamed_4 = Collections.unmodifiableMap(new HashMap(sprmdk.cfr_renamed_9470((sprmdk)arg0)));
        sprgak4.cfr_renamed_119 = Collections.unmodifiableList(sprmdk.cfr_renamed_9471((sprmdk)v4));
        sprgak4.cfr_renamed_0 = Collections.unmodifiableMap(new HashMap(sprmdk.cfr_renamed_9472((sprmdk)arg0)));
        sprgak3.cfr_renamed_3 = sprmdk.cfr_renamed_9473((sprmdk)v4);
        sprgak3.cfr_renamed_102 = sprmdk.cfr_renamed_9474((sprmdk)arg0);
        this.cfr_renamed_112 = sprmdk.cfr_renamed_9475((sprmdk)v1);
        sprgak2.cfr_renamed_107 = sprmdk.cfr_renamed_9476((sprmdk)v1);
        sprgak2.cfr_renamed_86 = Collections.unmodifiableSet(sprmdk.cfr_renamed_9477(sprmdk2));
    }

    public List cfr_renamed_9133() {
        return this.cfr_renamed_1.getCertPathCheckers();
    }

    public boolean cfr_renamed_9478() {
        return this.cfr_renamed_1.getPolicyQualifiersRejected();
    }

    public static /* synthetic */ Date cfr_renamed_9479(sprgak arg0) {
        return arg0.cfr_renamed_93;
    }

    public boolean cfr_renamed_9135() {
        return this.cfr_renamed_1.isPolicyMappingInhibited();
    }

    public Date cfr_renamed_7315() {
        if (null == this.cfr_renamed_2) {
            return null;
        }
        return new Date(this.cfr_renamed_2.getTime());
    }
}

