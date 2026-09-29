/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreqc;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprwc;
import com.spire.presentation.packages.sprxpo;
import java.security.Permission;
import java.security.spec.ECParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class sprupb
implements sprwc {
    private volatile Object cfr_renamed_112;
    private static Permission cfr_renamed_119;
    private volatile sprlpb cfr_renamed_91;
    private ThreadLocal cfr_renamed_0;
    private static Permission cfr_renamed_1;
    private ThreadLocal cfr_renamed_2;
    private static Permission cfr_renamed_3;
    private static Permission cfr_renamed_4;

    static {
        cfr_renamed_3 = new spreqc("BC", "threadLocalEcImplicitlyCa");
        cfr_renamed_119 = new spreqc("BC", "ecImplicitlyCa");
        cfr_renamed_1 = new spreqc("BC", "threadLocalDhDefaultParams");
        cfr_renamed_4 = new spreqc("BC", "DhDefaultParams");
    }

    public sprupb() {
        sprupb sprupb2 = this;
        this.cfr_renamed_0 = new ThreadLocal();
        sprupb2.cfr_renamed_2 = new ThreadLocal();
    }

    @Override
    public DHParameterSpec cfr_renamed_1454(int arg0) {
        Object object = this.cfr_renamed_2.get();
        if (object == null) {
            object = this.cfr_renamed_112;
        }
        if (object instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec)object;
            if (dHParameterSpec.getP().bitLength() == arg0) {
                return dHParameterSpec;
            }
        } else if (object instanceof DHParameterSpec[]) {
            int n;
            DHParameterSpec[] dHParameterSpecArray = (DHParameterSpec[])object;
            int n2 = n = 0;
            while (n2 != dHParameterSpecArray.length) {
                if (dHParameterSpecArray[n].getP().bitLength() == arg0) {
                    return dHParameterSpecArray[n];
                }
                n2 = ++n;
            }
        }
        return null;
    }

    @Override
    public sprlpb cfr_renamed_2312() {
        sprlpb sprlpb2 = (sprlpb)this.cfr_renamed_0.get();
        if (sprlpb2 != null) {
            return sprlpb2;
        }
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_1262(String arg0, Object arg1) {
        SecurityManager securityManager = System.getSecurityManager();
        if (arg0.equals("threadLocalEcImplicitlyCa")) {
            sprlpb sprlpb2;
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_3);
            }
            if ((arg1 instanceof sprlpb || arg1 == null ? (sprlpb2 = (sprlpb)arg1) : (sprlpb2 = sprijc.cfr_renamed_2328((ECParameterSpec)arg1, false))) == null) {
                this.cfr_renamed_0.remove();
                return;
            }
            this.cfr_renamed_0.set(sprlpb2);
            return;
        }
        if (arg0.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_119);
            }
            if (arg1 instanceof sprlpb || arg1 == null) {
                this.cfr_renamed_91 = (sprlpb)arg1;
                return;
            }
            this.cfr_renamed_91 = sprijc.cfr_renamed_2328((ECParameterSpec)arg1, false);
            return;
        }
        if (arg0.equals("threadLocalDhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_1);
            }
            if (!(arg1 instanceof DHParameterSpec) && !(arg1 instanceof DHParameterSpec[]) && arg1 != null) {
                throw new IllegalArgumentException(sprxpo.cfr_renamed_9("9$#k6k!*;\"3k\u0013\u0003\u0007*%*:.#.%\u0018'.4"));
            }
            Object object = arg1;
            if (object == null) {
                this.cfr_renamed_2.remove();
                return;
            }
            this.cfr_renamed_2.set(object);
            return;
        }
        if (arg0.equals("DhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_4);
            }
            if (arg1 instanceof DHParameterSpec || arg1 instanceof DHParameterSpec[] || arg1 == null) {
                this.cfr_renamed_112 = arg1;
                return;
            }
            throw new IllegalArgumentException(sprnwj.cfr_renamed_9("#|93,3;r!z)3\t[\u001dr?r v9v?@=v.3\"amW\u0005C,a,~(g(a\u001ec(p\u0016N"));
        }
    }
}

