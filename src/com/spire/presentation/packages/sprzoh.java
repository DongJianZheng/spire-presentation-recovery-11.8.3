/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprbz;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprjr;
import com.spire.presentation.packages.sprke;
import com.spire.presentation.packages.sprkiaa;
import com.spire.presentation.packages.sprks;
import com.spire.presentation.packages.sprkyh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlwba;
import com.spire.presentation.packages.sprlyh;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprwzj;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class sprzoh
extends PKIXCertPathChecker
implements sprke {
    private static final int cfr_renamed_119 = 15000;
    private final sprrr cfr_renamed_91;
    private static final Map cfr_renamed_0 = new HashMap();
    private final sprlyh cfr_renamed_1;
    private sprwzj cfr_renamed_2;
    private static final int cfr_renamed_3 = 32768;
    private final sprkyh cfr_renamed_4;

    @Override
    public void check(Certificate arg0, Collection<String> arg1) throws CertPathValidatorException {
    }

    /*
     * WARNING - void declaration
     */
    public sprzoh(sprrr sprrr2) {
        void arg0;
        this.cfr_renamed_91 = sprrr2;
        sprzoh sprzoh2 = this;
        this.cfr_renamed_4 = new sprkyh((sprrr)arg0);
        sprzoh2.cfr_renamed_1 = new sprlyh(this, (sprrr)arg0);
    }

    @Override
    public Set<String> getSupportedExtensions() {
        return null;
    }

    static {
        cfr_renamed_0.put(new sprlem(sprkiaa.cfr_renamed_9(")a*a {(a)~+z,v6~6~6z")), sprlwba.cfr_renamed_9("\u000b\u0007\u0019~\u000f\u0006\f\u0007\n\u001c\u0019"));
        cfr_renamed_0.put(sprdl.cfr_renamed_1262, sprkiaa.cfr_renamed_9("\u001cP\u000e*},\u0018Q\u001bP\u001dK\u000e"));
        cfr_renamed_0.put(sprdl.cfr_renamed_1601, sprlwba.cfr_renamed_9("\u000b\u0007\u0019}my\u000f\u0006\f\u0007\n\u001c\u0019"));
        cfr_renamed_0.put(sprdl.cfr_renamed_1572, sprkiaa.cfr_renamed_9("\u001cP\u000e+w,\u0018Q\u001bP\u001dK\u000e"));
        cfr_renamed_0.put(sprdl.cfr_renamed_84, sprlwba.cfr_renamed_9("\u000b\u0007\u0019zi}\u000f\u0006\f\u0007\n\u001c\u0019"));
        cfr_renamed_0.put(sprqo.cfr_renamed_107, sprkiaa.cfr_renamed_9("_\u0000K\u001b+{)~O\u0006L\u0007_\u0000K\u001b+{)\u007f"));
        cfr_renamed_0.put(sprqo.cfr_renamed_96, sprlwba.cfr_renamed_9("\b\u0017\u001c\f|l~i\u0018\u0011\u001b\u0010\n\u001b\b\u0017\u001c\f|l~h"));
        cfr_renamed_0.put(sprdt.cfr_renamed_1, sprkiaa.cfr_renamed_9("_\u0000K\u001b+{)~5}(~*b*z.\u0018Q\u001bP\n[\bW\u001cL|,~(b*\u007f)}5}-y"));
        cfr_renamed_0.put(sprdt.cfr_renamed_107, sprlwba.cfr_renamed_9("\b\u0017\u001c\f|l~ibj\u007fi}uzi}\u000f\u0006\f\u0007\u001d\f\u001f\u0000\u000b\u001bk{i\u007fu}h~jbm~j"));
        cfr_renamed_0.put(sprjr.cfr_renamed_114, sprkiaa.cfr_renamed_9("\u001cP\u000e)\u0018Q\u001bP\u001fT\u000eQ\u00015\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprjr.cfr_renamed_96, sprlwba.cfr_renamed_9("\u000b\u0007\u0019}j{\u000f\u0006\f\u0007\b\u0003\u0019\u0006\u0016b\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprjr.cfr_renamed_126, sprkiaa.cfr_renamed_9("\u001cP\u000e*z.\u0018Q\u001bP\u001fT\u000eQ\u00015\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprjr.cfr_renamed_105, sprlwba.cfr_renamed_9("\u000b\u0007\u0019|`{\u000f\u0006\f\u0007\b\u0003\u0019\u0006\u0016b\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprjr.cfr_renamed_2, sprkiaa.cfr_renamed_9("\u001cP\u000e-~*\u0018Q\u001bP\u001fT\u000eQ\u00015\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprjr.cfr_renamed_102, sprlwba.cfr_renamed_9("\u001d\u0011\u001f\u001d\u0002\u001c~n\u007f\u000f\u0006\f\u0007\b\u0003\u0019\u0006\u0016b\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprks.cfr_renamed_96, sprkiaa.cfr_renamed_9("\u001cP\u000e)\u0018Q\u001bP\fN\f5\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprks.cfr_renamed_119, sprlwba.cfr_renamed_9("\u000b\u0007\u0019}j{\u000f\u0006\f\u0007\u001b\u0019\u001bb\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprks.cfr_renamed_105, sprkiaa.cfr_renamed_9("\u001cP\u000e*z.\u0018Q\u001bP\fN\f5\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprks.cfr_renamed_152, sprlwba.cfr_renamed_9("\u000b\u0007\u0019|`{\u000f\u0006\f\u0007\u001b\u0019\u001bb\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprks.cfr_renamed_126, sprkiaa.cfr_renamed_9("\u001cP\u000e-~*\u0018Q\u001bP\fN\f5\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprbz.cfr_renamed_3, sprlwba.cfr_renamed_9("\u0017\u0015\u001c\u000b"));
        cfr_renamed_0.put(sprbz.cfr_renamed_4, sprkiaa.cfr_renamed_9("@\u0002K\u001cU\u001b"));
        cfr_renamed_0.put(new sprlem(sprlwba.cfr_renamed_9("~v}vwl\u007fv~i|m{aaiaial")), sprkiaa.cfr_renamed_9("U\u000b-\u0018Q\u001bP\u001dK\u000e"));
        cfr_renamed_0.put(new sprlem(sprlwba.cfr_renamed_9("~v}vwl\u007fv~i|m{aaiaiaj")), sprkiaa.cfr_renamed_9("U\u000b*\u0018Q\u001bP\u001dK\u000e"));
        cfr_renamed_0.put(new sprlem(sprlwba.cfr_renamed_9("iaja`{hai\u007fh{halak")), sprkiaa.cfr_renamed_9("\u001cP\u000e)\u0018Q\u001bP\u000bK\u000e"));
        cfr_renamed_0.put(sprbr.cfr_renamed_955, sprlwba.cfr_renamed_9("\u000b\u0007\u0019~\u000f\u0006\f\u0007\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprbr.cfr_renamed_129, sprkiaa.cfr_renamed_9("\u001cP\u000e*},\u0018Q\u001bP\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprbr.cfr_renamed_79, sprlwba.cfr_renamed_9("\u000b\u0007\u0019}my\u000f\u0006\f\u0007\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprbr.cfr_renamed_107, sprkiaa.cfr_renamed_9("\u001cP\u000e+w,\u0018Q\u001bP\n[\u000bK\u000e"));
        cfr_renamed_0.put(sprbr.cfr_renamed_724, sprlwba.cfr_renamed_9("\u000b\u0007\u0019zi}\u000f\u0006\f\u0007\u001d\f\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprgt.cfr_renamed_4, sprkiaa.cfr_renamed_9("\u001cP\u000e)\u0018Q\u001bP\u001dK\u000e"));
        cfr_renamed_0.put(sprgt.cfr_renamed_93, sprlwba.cfr_renamed_9("\u000b\u0007\u0019~\u000f\u0006\f\u0007\u001c\u001c\u0019"));
        cfr_renamed_0.put(sprwr.cfr_renamed_79, sprkiaa.cfr_renamed_9("\u001cP\u000e*},\u0018Q\u001bP\u000bK\u000e"));
        cfr_renamed_0.put(sprwr.cfr_renamed_82, sprlwba.cfr_renamed_9("\u000b\u0007\u0019}my\u000f\u0006\f\u0007\u001c\u001c\u0019"));
    }

    @Override
    public void check(Certificate arg0) throws CertPathValidatorException {
    }

    public List<CertPathValidatorException> cfr_renamed_9101() {
        return this.cfr_renamed_1.cfr_renamed_9101();
    }

    @Override
    public boolean isForwardCheckingSupported() {
        return false;
    }

    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
    }

    @Override
    public void init(boolean arg0) throws CertPathValidatorException {
        sprzoh sprzoh2 = this;
        sprzoh2.cfr_renamed_2 = null;
        sprzoh2.cfr_renamed_4.cfr_renamed_9102(arg0);
        sprzoh2.cfr_renamed_1.cfr_renamed_9102(arg0);
    }

    @Override
    public void cfr_renamed_9066(sprwzj arg0) {
        sprzoh sprzoh2 = this;
        sprzoh2.cfr_renamed_2 = arg0;
        sprzoh2.cfr_renamed_4.cfr_renamed_9066(arg0);
        sprzoh2.cfr_renamed_1.cfr_renamed_9066(arg0);
    }
}

