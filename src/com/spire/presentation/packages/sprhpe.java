/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcne;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sprjsd;
import com.spire.presentation.packages.sprmm;
import com.spire.presentation.packages.sprom;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwle;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Vector;

public abstract class sprhpe
implements sprom {
    public static void cfr_renamed_5120(sprom arg0, PrintStream arg1) {
        sprmm sprmm2 = arg0.cfr_renamed_5113();
        if (sprmm2.cfr_renamed_3223() != null) {
            sprmm2.cfr_renamed_3223().printStackTrace(arg1);
        }
        arg1.println(sprmm2);
    }

    public boolean cfr_renamed_5121(byte[][] arg0, byte[][] arg1) {
        int n;
        if (arg0 == null && arg1 == null) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (!this.cfr_renamed_92(arg0[n], arg1[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public void cfr_renamed_5122(String arg0) {
        throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
    }

    public static void cfr_renamed_5123(sprom[] arg0, PrintStream arg1) {
        Enumeration enumeration;
        int n;
        Vector<sprmm> vector = new Vector<sprmm>();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprmm sprmm2 = arg0[n].cfr_renamed_5113();
            if (!sprmm2.cfr_renamed_3228()) {
                vector.addElement(sprmm2);
            }
            if (sprmm2.cfr_renamed_3223() != null) {
                sprmm2.cfr_renamed_3223().printStackTrace(arg1);
            }
            arg1.println(sprmm2);
            n2 = ++n;
        }
        arg1.println("-----");
        if (vector.isEmpty()) {
            arg1.println(sprgpa.cfr_renamed_9("\u001eO3\u0003+F,W,\u0003,V<@:P,E*Oq"));
            return;
        }
        arg1.println(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("+\u0003\u0005\u001c\u0004\t\u001c\t\fL\u001f\u0005\u001c\u0004H")).append(vector.size()).append(sprgpa.cfr_renamed_9("\u0003\u0019b\u0016o\nq\u001ape")).toString());
        Enumeration enumeration2 = enumeration = vector.elements();
        while (enumeration2.hasMoreElements()) {
            System.out.println(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("QVLH")).append((sprmm)enumeration.nextElement()).toString());
            enumeration2 = enumeration;
        }
    }

    public void cfr_renamed_5124(String arg0, Object arg1, Object arg2) {
        throw new sprcne(sprwle.cfr_renamed_5118(this, arg0, arg1, arg2));
    }

    public void cfr_renamed_5125(Object arg0, Object arg1) {
        if (!arg0.equals(arg1)) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, sprgpa.cfr_renamed_9("M0\u00032F,P>D:")));
        }
    }

    public void cfr_renamed_5126(String arg0, boolean arg1, boolean arg2) {
        if (arg1 != arg2) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
        }
    }

    public void cfr_renamed_5127(boolean arg0, boolean arg1) {
        if (arg0 != arg1) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, sprjsd.cfr_renamed_9("\u0002\u0007L\u0005\t\u001b\u001f\t\u000b\r")));
        }
    }

    public boolean cfr_renamed_92(byte[] arg0, byte[] arg1) {
        return sproze.cfr_renamed_92(arg0, arg1);
    }

    public void cfr_renamed_5128(String arg0, boolean arg1) {
        if (!arg1) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
        }
    }

    public void cfr_renamed_5129(String arg0, Object arg1, Object arg2) {
        if (arg1 == null && arg2 == null) {
            return;
        }
        if (arg1 == null) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
        }
        if (arg2 == null) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
        }
        if (!arg1.equals(arg2)) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
        }
    }

    public static void cfr_renamed_5130(sprom[] arg0) {
        sprhpe.cfr_renamed_5123(arg0, System.out);
    }

    public void cfr_renamed_5131(int arg0, int arg1) {
        if (arg0 != arg1) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, sprgpa.cfr_renamed_9("M0\u00032F,P>D:")));
        }
    }

    public void cfr_renamed_5132(String arg0, long arg1, long arg2) {
        if (arg1 != arg2) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, arg0));
        }
    }

    public void cfr_renamed_5133(long arg0, long arg1) {
        if (arg0 != arg1) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, sprjsd.cfr_renamed_9("\u0002\u0007L\u0005\t\u001b\u001f\t\u000b\r")));
        }
    }

    public void cfr_renamed_5134(boolean arg0) {
        if (!arg0) {
            throw new sprcne(sprwle.cfr_renamed_5116(this, sprgpa.cfr_renamed_9("M0\u00032F,P>D:")));
        }
    }

    @Override
    public abstract String cfr_renamed_313();

    public boolean cfr_renamed_5135(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        return sproze.cfr_renamed_5135(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void cfr_renamed_5136(sprom arg0) {
        sprhpe.cfr_renamed_5120(arg0, System.out);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprmm cfr_renamed_5113() {
        try {
            sprhpe sprhpe2 = this;
            sprhpe2.cfr_renamed_5137();
            return sprhpe2.cfr_renamed_5138();
        }
        catch (sprcne sprcne2) {
            return sprcne2.cfr_renamed_5112();
        }
        catch (Exception exception) {
            return sprwle.cfr_renamed_5119(this, sprjsd.cfr_renamed_9("-\u0014\u000b\t\u0018\u0018\u0001\u0003\u0006VH") + exception, exception);
        }
    }

    public abstract void cfr_renamed_5137() throws Exception;

    public void cfr_renamed_5139(String arg0, Throwable arg1) {
        throw new sprcne(sprwle.cfr_renamed_5119(this, arg0, arg1));
    }

    private /* synthetic */ sprmm cfr_renamed_5138() {
        return sprwle.cfr_renamed_5115(this, sprgpa.cfr_renamed_9("l4B&"));
    }
}

