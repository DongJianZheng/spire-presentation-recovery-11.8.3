/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprcep;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprrze;
import com.spire.presentation.packages.sprssa;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class sprlsa
extends PKIXParameters {
    private Set cfr_renamed_102;
    private boolean cfr_renamed_93;
    private Set cfr_renamed_86;
    public static final int cfr_renamed_152 = 1;
    private List cfr_renamed_112;
    public static final int cfr_renamed_119 = 0;
    private sprb cfr_renamed_91;
    private Set cfr_renamed_0;
    private boolean cfr_renamed_1;
    private Set cfr_renamed_2;
    private int cfr_renamed_3;
    private List cfr_renamed_4;

    public boolean cfr_renamed_374() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_375(List arg0) {
        if (arg0 == null) {
            sprlsa sprlsa2 = this;
            sprlsa2.cfr_renamed_4 = new ArrayList();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof spro) continue;
            throw new ClassCastException(sprcep.cfr_renamed_9("Ucx/qcqbqa`|4`r/xfg{4ba|`/vj4`r/`vdj4`fh:m{zzlmlu|`cq!a{}c:\\``fj:"));
        }
        this.cfr_renamed_4 = new ArrayList(arg0);
    }

    public int cfr_renamed_376() {
        return this.cfr_renamed_3;
    }

    public List cfr_renamed_377() {
        return Collections.unmodifiableList(this.cfr_renamed_112);
    }

    public Set cfr_renamed_378() {
        return Collections.unmodifiableSet(this.cfr_renamed_86);
    }

    public void cfr_renamed_379(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_2.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof sprssa) continue;
            throw new ClassCastException(new StringBuilder().insert(0, sprrze.cfr_renamed_9("wCZ\u000fSCSBSAB\\\u0016@P\u000fEJB\u000f[ZE[\u0016MS\u000fYI\u0016[O_S\u000f")).append(sprssa.class.getName()).append(".").toString());
        }
        sprlsa sprlsa2 = this;
        sprlsa2.cfr_renamed_2.clear();
        sprlsa2.cfr_renamed_2.addAll(arg0);
    }

    public void cfr_renamed_380(spro arg0) {
        this.cfr_renamed_381(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprlsa cfr_renamed_382(PKIXParameters arg0) {
        sprlsa sprlsa2;
        try {
            sprlsa2 = new sprlsa((Set)arg0.getTrustAnchors());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprlsa2.cfr_renamed_383(arg0);
        return sprlsa2;
    }

    public sprlsa(Set arg0) throws InvalidAlgorithmParameterException {
        sprlsa sprlsa2 = this;
        sprlsa sprlsa3 = this;
        super(arg0);
        sprlsa3.cfr_renamed_3 = 0;
        sprlsa3.cfr_renamed_93 = false;
        sprlsa sprlsa4 = this;
        sprlsa2.cfr_renamed_4 = new ArrayList();
        sprlsa4.cfr_renamed_112 = new ArrayList();
        sprlsa2.cfr_renamed_102 = new HashSet();
        sprlsa2.cfr_renamed_0 = new HashSet();
        sprlsa2.cfr_renamed_86 = new HashSet();
        sprlsa2.cfr_renamed_2 = new HashSet();
    }

    public void cfr_renamed_384(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_86.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof String) continue;
            throw new ClassCastException(sprcep.cfr_renamed_9("Ucx/qcqbqa`|4`r/gj`/yzg{4mq/{i4{m\u007fq/G{ffzh:"));
        }
        sprlsa sprlsa2 = this;
        sprlsa2.cfr_renamed_86.clear();
        sprlsa2.cfr_renamed_86.addAll(arg0);
    }

    public List cfr_renamed_385() {
        return Collections.unmodifiableList(new ArrayList(this.cfr_renamed_4));
    }

    public void cfr_renamed_386(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_0.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof String) continue;
            throw new ClassCastException(sprrze.cfr_renamed_9("nZC\u0016JZJ[JX[E\u000fYI\u0016\\S[\u0016BC\\B\u000fTJ\u0016@P\u000fBVFJ\u0016|B]_AQ\u0001"));
        }
        sprlsa sprlsa2 = this;
        sprlsa2.cfr_renamed_0.clear();
        sprlsa2.cfr_renamed_0.addAll(arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_383(PKIXParameters pKIXParameters) {
        void arg0;
        sprlsa sprlsa2 = this;
        void v1 = arg0;
        sprlsa sprlsa3 = this;
        void v3 = arg0;
        sprlsa sprlsa4 = this;
        void v5 = arg0;
        sprlsa sprlsa5 = this;
        sprlsa5.setDate(arg0.getDate());
        sprlsa5.setCertPathCheckers(arg0.getCertPathCheckers());
        this.setCertStores((List)v5.getCertStores());
        sprlsa4.setAnyPolicyInhibited(v5.isAnyPolicyInhibited());
        sprlsa4.setExplicitPolicyRequired(arg0.isExplicitPolicyRequired());
        this.setPolicyMappingInhibited(v3.isPolicyMappingInhibited());
        sprlsa3.setRevocationEnabled(v3.isRevocationEnabled());
        sprlsa3.setInitialPolicies(arg0.getInitialPolicies());
        this.setPolicyQualifiersRejected(v1.getPolicyQualifiersRejected());
        sprlsa2.setSigProvider(v1.getSigProvider());
        sprlsa2.setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            this.setTrustAnchors(arg0.getTrustAnchors());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        if (arg0 instanceof sprlsa) {
            sprlsa sprlsa6 = (sprlsa)arg0;
            sprlsa sprlsa7 = this;
            sprlsa sprlsa8 = sprlsa6;
            this.cfr_renamed_3 = sprlsa6.cfr_renamed_3;
            this.cfr_renamed_93 = sprlsa8.cfr_renamed_93;
            sprlsa7.cfr_renamed_1 = sprlsa8.cfr_renamed_1;
            sprlsa7.cfr_renamed_91 = sprlsa6.cfr_renamed_91 == null ? null : (sprb)sprlsa6.cfr_renamed_91.clone();
            sprlsa sprlsa9 = this;
            sprlsa sprlsa10 = this;
            sprlsa9.cfr_renamed_4 = new ArrayList(sprlsa6.cfr_renamed_4);
            sprlsa10.cfr_renamed_112 = new ArrayList(sprlsa6.cfr_renamed_112);
            sprlsa9.cfr_renamed_102 = new HashSet(sprlsa6.cfr_renamed_102);
            sprlsa9.cfr_renamed_86 = new HashSet(sprlsa6.cfr_renamed_86);
            sprlsa9.cfr_renamed_0 = new HashSet(sprlsa6.cfr_renamed_0);
            sprlsa9.cfr_renamed_2 = new HashSet(sprlsa6.cfr_renamed_2);
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public void cfr_renamed_387(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_388(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_102.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof TrustAnchor) continue;
            throw new ClassCastException(new StringBuilder().insert(0, sprcep.cfr_renamed_9("Nxc4jxjyjz{g/{i4|q{4ba|`/vj4`r/`vdj4")).append(TrustAnchor.class.getName()).append(".").toString());
        }
        sprlsa sprlsa2 = this;
        sprlsa2.cfr_renamed_102.clear();
        sprlsa2.cfr_renamed_102.addAll(arg0);
    }

    public void cfr_renamed_381(spro arg0) {
        if (arg0 != null) {
            this.cfr_renamed_112.add(arg0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object clone() {
        sprlsa sprlsa2;
        try {
            sprlsa2 = new sprlsa((Set)this.getTrustAnchors());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprlsa2.cfr_renamed_383(this);
        return sprlsa2;
    }

    public void setCertStores(List arg0) {
        if (arg0 != null) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg0.iterator();
            while (iterator2.hasNext()) {
                this.addCertStore((CertStore)iterator.next());
                iterator2 = iterator;
            }
        }
    }

    public void cfr_renamed_389(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_390(boolean arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public boolean cfr_renamed_391() {
        return this.cfr_renamed_93;
    }

    public Set cfr_renamed_392() {
        return Collections.unmodifiableSet(this.cfr_renamed_102);
    }

    @Override
    public void setTargetCertConstraints(CertSelector arg0) {
        CertSelector certSelector = arg0;
        super.setTargetCertConstraints(certSelector);
        if (certSelector != null) {
            this.cfr_renamed_91 = sprgma.cfr_renamed_173((X509CertSelector)arg0);
            return;
        }
        this.cfr_renamed_91 = null;
    }

    public Set cfr_renamed_393() {
        return Collections.unmodifiableSet(this.cfr_renamed_2);
    }

    public void cfr_renamed_394(spro arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4.add(arg0);
        }
    }

    public Set cfr_renamed_395() {
        return Collections.unmodifiableSet(this.cfr_renamed_0);
    }

    public void cfr_renamed_396(sprb arg0) {
        if (arg0 != null) {
            this.cfr_renamed_91 = (sprb)arg0.clone();
            return;
        }
        this.cfr_renamed_91 = null;
    }

    public sprb cfr_renamed_397() {
        if (this.cfr_renamed_91 != null) {
            return (sprb)this.cfr_renamed_91.clone();
        }
        return null;
    }
}

