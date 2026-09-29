/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqy;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.spriij;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprrhi;
import com.spire.presentation.packages.sprrll;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;

public class sprbci
implements sprqw {
    private volatile Map cfr_renamed_102;
    private static Permission cfr_renamed_93;
    private static Permission cfr_renamed_86;
    private volatile Set cfr_renamed_152;
    private volatile sprrxh cfr_renamed_112;
    private ThreadLocal cfr_renamed_119;
    private static Permission cfr_renamed_91;
    private static Permission cfr_renamed_0;
    private volatile Object cfr_renamed_1;
    private ThreadLocal cfr_renamed_2;
    private static Permission cfr_renamed_3;
    private static Permission cfr_renamed_4;

    public sprbci() {
        sprbci sprbci2 = this;
        this.cfr_renamed_2 = new ThreadLocal();
        sprbci2.cfr_renamed_119 = new ThreadLocal();
        this.cfr_renamed_152 = new HashSet();
        this.cfr_renamed_102 = new HashMap();
    }

    @Override
    public sprrxh cfr_renamed_2312() {
        sprrxh sprrxh2 = (sprrxh)this.cfr_renamed_2.get();
        if (sprrxh2 != null) {
            return sprrxh2;
        }
        return this.cfr_renamed_112;
    }

    @Override
    public DSAParameterSpec cfr_renamed_9164(int arg0) {
        sprmqk sprmqk2 = (sprmqk)sprybl.cfr_renamed_9165(sprrll.cfr_renamed_0, arg0);
        if (sprmqk2 != null) {
            return new DSAParameterSpec(sprmqk2.cfr_renamed_1155(), sprmqk2.cfr_renamed_1604(), sprmqk2.cfr_renamed_1145());
        }
        return null;
    }

    static {
        cfr_renamed_4 = new spriij("BC", "threadLocalEcImplicitlyCa");
        cfr_renamed_86 = new spriij("BC", "ecImplicitlyCa");
        cfr_renamed_93 = new spriij("BC", "threadLocalDhDefaultParams");
        cfr_renamed_0 = new spriij("BC", "DhDefaultParams");
        cfr_renamed_3 = new spriij("BC", "acceptableEcCurves");
        cfr_renamed_91 = new spriij("BC", "additionalEcParameters");
    }

    public void cfr_renamed_1262(String arg0, Object arg1) {
        SecurityManager securityManager = System.getSecurityManager();
        if (arg0.equals("threadLocalEcImplicitlyCa")) {
            sprrxh sprrxh2;
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_4);
            }
            if ((arg1 instanceof sprrxh || arg1 == null ? (sprrxh2 = (sprrxh)arg1) : (sprrxh2 = sprnlj.cfr_renamed_9150((ECParameterSpec)arg1))) == null) {
                this.cfr_renamed_2.remove();
                return;
            }
            this.cfr_renamed_2.set(sprrxh2);
            return;
        }
        if (arg0.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_86);
            }
            if (arg1 instanceof sprrxh || arg1 == null) {
                this.cfr_renamed_112 = (sprrxh)arg1;
                return;
            }
            this.cfr_renamed_112 = sprnlj.cfr_renamed_9150((ECParameterSpec)arg1);
            return;
        }
        if (arg0.equals("threadLocalDhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_93);
            }
            if (!(arg1 instanceof DHParameterSpec) && !(arg1 instanceof DHParameterSpec[]) && arg1 != null) {
                throw new IllegalArgumentException(sprfap.cfr_renamed_9("Z\\@\u0013U\u0013BRXZP\u0013p{dRFRYV@VF`DVW"));
            }
            Object object = arg1;
            if (object == null) {
                this.cfr_renamed_119.remove();
                return;
            }
            this.cfr_renamed_119.set(object);
            return;
        }
        if (arg0.equals("DhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_0);
            }
            if (arg1 instanceof DHParameterSpec || arg1 instanceof DHParameterSpec[] || arg1 == null) {
                this.cfr_renamed_1 = arg1;
                return;
            }
            throw new IllegalArgumentException(sprbqy.cfr_renamed_9("=)'f2f%'?/7f\u0017\u000e\u0003'!'>#'#!\u0015##0f<4s\u0002\u001b\u0016242+6264\u000066%\b\u001b"));
        }
        if (arg0.equals("acceptableEcCurves")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_3);
            }
            this.cfr_renamed_152 = (Set)arg1;
            return;
        }
        if (arg0.equals("additionalEcParameters")) {
            if (securityManager != null) {
                securityManager.checkPermission(cfr_renamed_91);
            }
            this.cfr_renamed_102 = (Map)arg1;
        }
    }

    @Override
    public Set cfr_renamed_9166() {
        return Collections.unmodifiableSet(this.cfr_renamed_152);
    }

    @Override
    public DHParameterSpec cfr_renamed_1454(int arg0) {
        Object object;
        Object object2 = this.cfr_renamed_119.get();
        if (object2 == null) {
            object2 = this.cfr_renamed_1;
        }
        if (object2 instanceof DHParameterSpec) {
            object = (DHParameterSpec[])object2;
            if (object.getP().bitLength() == arg0) {
                return object;
            }
        } else if (object2 instanceof DHParameterSpec[]) {
            int n;
            object = (DHParameterSpec[])object2;
            int n2 = n = 0;
            while (n2 != ((DHParameterSpec[])object).length) {
                if (object[n].getP().bitLength() == arg0) {
                    return object[n];
                }
                n2 = ++n;
            }
        }
        if ((object = (sprwsk)sprybl.cfr_renamed_9165(sprrll.cfr_renamed_2, arg0)) != null) {
            return new sprrhi((sprwsk)object);
        }
        return null;
    }

    @Override
    public Map cfr_renamed_9167() {
        return Collections.unmodifiableMap(this.cfr_renamed_102);
    }
}

