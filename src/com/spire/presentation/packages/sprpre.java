/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprnica;
import com.spire.presentation.packages.sprnkha;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprzqe;
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

public class sprpre
extends PKIXParameters {
    private Set cfr_renamed_102;
    private boolean cfr_renamed_93;
    private Set cfr_renamed_86;
    private Set cfr_renamed_152;
    public static final int cfr_renamed_112 = 1;
    private Set cfr_renamed_119;
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    private List cfr_renamed_1;
    private sprhd cfr_renamed_2;
    private List cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    public void cfr_renamed_388(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_86.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof TrustAnchor) continue;
            throw new ClassCastException(new StringBuilder().insert(0, sprnica.cfr_renamed_9("c\u0011N]G\u0011G\u0010G\u0013V\u000e\u0002\u0012D]Q\u0018V]O\bQ\t\u0002\u001fG]M\u001b\u0002\t[\rG]")).append(TrustAnchor.class.getName()).append(".").toString());
        }
        sprpre sprpre2 = this;
        sprpre2.cfr_renamed_86.clear();
        sprpre2.cfr_renamed_86.addAll(arg0);
    }

    public Set cfr_renamed_395() {
        return Collections.unmodifiableSet(this.cfr_renamed_152);
    }

    public void cfr_renamed_5089(sprug arg0) {
        this.cfr_renamed_5090(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprpre cfr_renamed_382(PKIXParameters arg0) {
        sprpre sprpre2;
        try {
            sprpre2 = new sprpre((Set)arg0.getTrustAnchors());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprpre2.cfr_renamed_383(arg0);
        return sprpre2;
    }

    public Set cfr_renamed_392() {
        return Collections.unmodifiableSet(this.cfr_renamed_86);
    }

    public Set cfr_renamed_378() {
        return Collections.unmodifiableSet(this.cfr_renamed_119);
    }

    public List cfr_renamed_385() {
        return Collections.unmodifiableList(new ArrayList(this.cfr_renamed_1));
    }

    public List cfr_renamed_377() {
        return Collections.unmodifiableList(this.cfr_renamed_3);
    }

    public void cfr_renamed_387(boolean arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public sprhd cfr_renamed_397() {
        if (this.cfr_renamed_2 != null) {
            return (sprhd)this.cfr_renamed_2.clone();
        }
        return null;
    }

    public void cfr_renamed_379(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_102.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof sprzqe) continue;
            throw new ClassCastException(new StringBuilder().insert(0, sprnkha.cfr_renamed_9("\u0019`4,=`=a=b,\u007fxc>,+i,,5y+xxn=,7jxx!|=,")).append(sprzqe.class.getName()).append(".").toString());
        }
        sprpre sprpre2 = this;
        sprpre2.cfr_renamed_102.clear();
        sprpre2.cfr_renamed_102.addAll(arg0);
    }

    @Override
    public void setTargetCertConstraints(CertSelector arg0) {
        CertSelector certSelector = arg0;
        super.setTargetCertConstraints(certSelector);
        if (certSelector != null) {
            this.cfr_renamed_2 = sprhve.cfr_renamed_173((X509CertSelector)arg0);
            return;
        }
        this.cfr_renamed_2 = null;
    }

    public void cfr_renamed_389(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_5090(sprug arg0) {
        if (arg0 != null) {
            this.cfr_renamed_3.add(arg0);
        }
    }

    public void cfr_renamed_390(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_386(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_152.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof String) continue;
            throw new ClassCastException(sprnica.cfr_renamed_9("<N\u0011\u0002\u0018N\u0018O\u0018L\tQ]M\u001b\u0002\u000eG\t\u0002\u0010W\u000eV]@\u0018\u0002\u0012D]V\u0004R\u0018\u0002.V\u000fK\u0013ES"));
        }
        sprpre sprpre2 = this;
        sprpre2.cfr_renamed_152.clear();
        sprpre2.cfr_renamed_152.addAll(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object clone() {
        sprpre sprpre2;
        try {
            sprpre2 = new sprpre((Set)this.getTrustAnchors());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprpre2.cfr_renamed_383(this);
        return sprpre2;
    }

    public boolean cfr_renamed_391() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_384(Set arg0) {
        if (arg0 == null) {
            this.cfr_renamed_119.clear();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof String) continue;
            throw new ClassCastException(sprnkha.cfr_renamed_9("M4`xi4i5i6x+,7jx\u007f=xxa-\u007f,,:ixc>,,u(ix_,~1b?\""));
        }
        sprpre sprpre2 = this;
        sprpre2.cfr_renamed_119.clear();
        sprpre2.cfr_renamed_119.addAll(arg0);
    }

    public boolean cfr_renamed_374() {
        return this.cfr_renamed_93;
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

    public Set cfr_renamed_393() {
        return Collections.unmodifiableSet(this.cfr_renamed_102);
    }

    public void cfr_renamed_5091(sprug arg0) {
        if (arg0 != null) {
            this.cfr_renamed_1.add(arg0);
        }
    }

    public void cfr_renamed_5092(sprhd arg0) {
        if (arg0 != null) {
            this.cfr_renamed_2 = (sprhd)arg0.clone();
            return;
        }
        this.cfr_renamed_2 = null;
    }

    public int cfr_renamed_376() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_375(List arg0) {
        if (arg0 == null) {
            sprpre sprpre2 = this;
            sprpre2.cfr_renamed_1 = new ArrayList();
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof sprug) continue;
            throw new ClassCastException(sprnica.cfr_renamed_9("<N\u0011\u0002\u0018N\u0018O\u0018L\tQ]M\u001b\u0002\u0011K\u000eV]O\bQ\t\u0002\u001fG]M\u001b\u0002\t[\rG]A\u0012OSQ\rK\u000fGSR\u000eO\u0012F\u0018NSQ\u0018A\bP\u0014V\u0004\f\bV\u0014NSq\tM\u000fGS"));
        }
        this.cfr_renamed_1 = new ArrayList(arg0);
    }

    public sprpre(Set arg0) throws InvalidAlgorithmParameterException {
        sprpre sprpre2 = this;
        sprpre sprpre3 = this;
        super(arg0);
        sprpre3.cfr_renamed_91 = 0;
        sprpre3.cfr_renamed_0 = false;
        sprpre sprpre4 = this;
        sprpre2.cfr_renamed_1 = new ArrayList();
        sprpre4.cfr_renamed_3 = new ArrayList();
        sprpre2.cfr_renamed_86 = new HashSet();
        sprpre2.cfr_renamed_152 = new HashSet();
        sprpre2.cfr_renamed_119 = new HashSet();
        sprpre2.cfr_renamed_102 = new HashSet();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_383(PKIXParameters pKIXParameters) {
        void arg0;
        sprpre sprpre2 = this;
        void v1 = arg0;
        sprpre sprpre3 = this;
        void v3 = arg0;
        sprpre sprpre4 = this;
        void v5 = arg0;
        sprpre sprpre5 = this;
        sprpre5.setDate(arg0.getDate());
        sprpre5.setCertPathCheckers(arg0.getCertPathCheckers());
        this.setCertStores((List)v5.getCertStores());
        sprpre4.setAnyPolicyInhibited(v5.isAnyPolicyInhibited());
        sprpre4.setExplicitPolicyRequired(arg0.isExplicitPolicyRequired());
        this.setPolicyMappingInhibited(v3.isPolicyMappingInhibited());
        sprpre3.setRevocationEnabled(v3.isRevocationEnabled());
        sprpre3.setInitialPolicies(arg0.getInitialPolicies());
        this.setPolicyQualifiersRejected(v1.getPolicyQualifiersRejected());
        sprpre2.setSigProvider(v1.getSigProvider());
        sprpre2.setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            this.setTrustAnchors(arg0.getTrustAnchors());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        if (arg0 instanceof sprpre) {
            sprpre sprpre6 = (sprpre)arg0;
            sprpre sprpre7 = this;
            sprpre sprpre8 = sprpre6;
            this.cfr_renamed_91 = sprpre6.cfr_renamed_91;
            this.cfr_renamed_0 = sprpre8.cfr_renamed_0;
            sprpre7.cfr_renamed_93 = sprpre8.cfr_renamed_93;
            sprpre7.cfr_renamed_2 = sprpre6.cfr_renamed_2 == null ? null : (sprhd)sprpre6.cfr_renamed_2.clone();
            sprpre sprpre9 = this;
            sprpre sprpre10 = this;
            sprpre9.cfr_renamed_1 = new ArrayList(sprpre6.cfr_renamed_1);
            sprpre10.cfr_renamed_3 = new ArrayList(sprpre6.cfr_renamed_3);
            sprpre9.cfr_renamed_86 = new HashSet(sprpre6.cfr_renamed_86);
            sprpre9.cfr_renamed_119 = new HashSet(sprpre6.cfr_renamed_119);
            sprpre9.cfr_renamed_152 = new HashSet(sprpre6.cfr_renamed_152);
            sprpre9.cfr_renamed_102 = new HashSet(sprpre6.cfr_renamed_102);
        }
    }
}

