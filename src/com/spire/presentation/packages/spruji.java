/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebi;
import com.spire.presentation.packages.sprpdp;
import com.spire.presentation.packages.sprsek;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprvtb;
import com.spire.presentation.packages.sprxci;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryei;
import com.spire.presentation.packages.sprzhi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivilegedActionException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class spruji {
    private static final Method cfr_renamed_1;
    public static final Class cfr_renamed_2;
    private static final Constructor cfr_renamed_3;
    private static final Method cfr_renamed_4;

    public static /* synthetic */ Method cfr_renamed_3565() {
        return cfr_renamed_4;
    }

    static {
        cfr_renamed_2 = spruci.cfr_renamed_5727(spruji.class, sprvtb.cfr_renamed_9("P(L(BgY;C9N&\u0014:J,Yg}\nw\u0019[;[$_=_;i9_*"));
        if (cfr_renamed_2 != null) {
            cfr_renamed_3 = spruji.cfr_renamed_9239();
            cfr_renamed_1 = spruji.cfr_renamed_9240(sprpdp.cfr_renamed_9("(c;R\u0003c!"));
            cfr_renamed_4 = spruji.cfr_renamed_9240(sprvtb.cfr_renamed_9("._=s\u001f"));
        } else {
            cfr_renamed_3 = null;
            cfr_renamed_1 = null;
            cfr_renamed_4 = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AlgorithmParameterSpec cfr_renamed_7960(sprxgf arg0) throws InvalidParameterSpecException {
        try {
            sprsek sprsek2 = sprsek.cfr_renamed_23(arg0);
            Object[] objectArray = new Object[2];
            objectArray[0] = spruaf.cfr_renamed_279(sprsek2.cfr_renamed_4837() * 8);
            objectArray[1] = sprsek2.cfr_renamed_596();
            return (AlgorithmParameterSpec)cfr_renamed_3.newInstance(objectArray);
        }
        catch (Exception exception) {
            throw new InvalidParameterSpecException(new StringBuilder().insert(0, sprpdp.cfr_renamed_9("\fi!u;t:e;o ho`.o#c+<o")).append(exception.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprtxk cfr_renamed_9241(sprtpk arg0, AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException {
        try {
            return (sprtxk)AccessController.doPrivileged(new sprzhi(arg0, arg1));
        }
        catch (Exception exception) {
            throw new InvalidAlgorithmParameterException(sprvtb.cfr_renamed_9("y(T'U=\u001a9H&Y,I:\u001a\u000ey\u0004j(H(W,N,H\u001aJ,Yg"));
        }
    }

    public static /* synthetic */ Method cfr_renamed_2413() {
        return cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Method cfr_renamed_9240(String arg0) {
        try {
            return (Method)AccessController.doPrivileged(new sprxci(arg0));
        }
        catch (PrivilegedActionException privilegedActionException) {
            return null;
        }
    }

    public static boolean cfr_renamed_9242(Class arg0) {
        return cfr_renamed_2 == arg0;
    }

    public static boolean cfr_renamed_7959() {
        return cfr_renamed_3 != null;
    }

    public static boolean cfr_renamed_9243() {
        return cfr_renamed_2 != null;
    }

    public static boolean cfr_renamed_9244(AlgorithmParameterSpec arg0) {
        return cfr_renamed_2 != null && cfr_renamed_2.isInstance(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Constructor cfr_renamed_9239() {
        try {
            return (Constructor)AccessController.doPrivileged(new spryei());
        }
        catch (PrivilegedActionException privilegedActionException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprsek cfr_renamed_9245(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        try {
            return (sprsek)AccessController.doPrivileged(new sprebi(arg0));
        }
        catch (Exception exception) {
            throw new InvalidParameterSpecException(sprpdp.cfr_renamed_9("\fg!h rov=i,c<uoA\fK\u001fg=g\"c;c=U?c,"));
        }
    }
}

